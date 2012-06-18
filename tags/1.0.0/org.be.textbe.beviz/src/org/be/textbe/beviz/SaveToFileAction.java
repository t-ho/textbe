/*
 * @author tmyers
 * @version 0.1
 * @created 07.05.2010
 * 
 */

package org.be.textbe.beviz;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

import com.abstratt.graphviz.GraphViz;

import com.lowagie.text.pdf.PdfWriter;

public class SaveToFileAction implements IViewActionDelegate {
	
	private static final String[] VALID_EXTENSIONS = {"pdf", "svg", "jpg", "dot"};
	private static final String [] VALID_EXTENSION_MASKS;
	static {
		VALID_EXTENSION_MASKS = new String [VALID_EXTENSIONS.length];
		for (int i = 0; i < VALID_EXTENSION_MASKS.length; i++)
			VALID_EXTENSION_MASKS [i] = "*."+VALID_EXTENSIONS[i];
	}
	
	private BEView view;

	public void init(IViewPart view) {
		this.view = (BEView) view;
	}

	public void run(IAction action) {
		boolean pathIsValid = false;
		IPath path = null;
		int fileFormat = 0;
		while (!pathIsValid ) {
			FileDialog saveDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
			saveDialog.setText("Choose a location to save to");
			saveDialog.setFilterExtensions(VALID_EXTENSION_MASKS);
			 String[] filterExt = {"*.txt","*.doc", ".rtf", "*.*"};
			String pathString = saveDialog.open();
			if (pathString == null)
				return;
			path = Path.fromOSString(pathString);
			if (path.toFile().isDirectory()) {
				MessageDialog.openError(null, "Invalid file path", "Location is already in use by a directory");
				continue;
			}
			String extension = path.getFileExtension();
			List<String> validExtensionsList = Arrays.asList(VALID_EXTENSIONS);
			if (extension == null || !validExtensionsList.contains(extension.toLowerCase())) {
				MessageDialog.openError(null, "Invalid file extension", "Supported file formats are: " + validExtensionsList);
				continue;
			}
			fileFormat = validExtensionsList.indexOf(extension.toLowerCase());
			//fileFormat = VALID_FORMATS[validExtensionsList.indexOf(extension.toLowerCase())];
			File parentDir = path.toFile().getParentFile();
			parentDir.mkdirs();
			if (parentDir.isDirectory())
				pathIsValid = true;
			else
				MessageDialog.openError(null, "Invalid file path", "Could not create directory");
		}
		
		new SaveImageJob(fileFormat, path, (File)view.getDOTFile()).schedule();
	}
	
	private class SaveImageJob extends Job {
		
		private IPath path;
		private int fileFormat;
		private File dotFile;

		public SaveImageJob(int fileFormat, IPath path, File dotFile) {
			super("Image saving job");
			this.fileFormat = fileFormat;
			this.path = path;
			this.dotFile = dotFile;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			monitor.beginTask("saving image", 100);
			//getJobManager().beginRule(AbstractGraphicalContentProvider.CONTENT_LOADING_RULE, monitor);
			try {
				File dotOutput = path.toFile();
								
				List<String> validExtensionsList = Arrays.asList(VALID_EXTENSIONS);
				
				switch (fileFormat){
					case 0: //PDF
						GraphViz.runDot("pdf", new Point(0,0), dotFile, dotOutput);
						break;
					case 1: //SVG
						GraphViz.runDot("svg", new Point(0,0), dotFile, dotOutput);
						break;
					case 2: //JPG
						GraphViz.runDot("jpg", new Point(0,0), dotFile, dotOutput);
						break;
					case 3: //DOT
						FileInputStream from = null;
						FileOutputStream to = null;
						from = new FileInputStream(dotFile);
						to = new FileOutputStream(dotOutput);
						byte[] buffer = new byte[4096];
						int bytesRead;
						while ((bytesRead = from.read(buffer)) != -1)
							to.write(buffer, 0, bytesRead); // write
						from.close();
						to.close();
				}				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				//getJobManager().endRule(AbstractGraphicalContentProvider.CONTENT_LOADING_RULE);
				monitor.done();
			}
			return Status.OK_STATUS;
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// don't care
	}

}
