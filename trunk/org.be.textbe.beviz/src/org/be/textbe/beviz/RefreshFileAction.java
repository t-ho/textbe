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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;

import com.abstratt.graphviz.GraphViz;

import com.lowagie.text.pdf.PdfWriter;

public class RefreshFileAction implements IViewActionDelegate {
	
	private BEView view;

	public void init(IViewPart view) {
		this.view = (BEView) view;
	}

	public void run(IAction action) {	
		new RefreshViewJob(view).schedule();
	}
	
	private class RefreshViewJob extends Job {
		
		private BEView view;

		public RefreshViewJob(BEView view) {
			super("Refresh View job");
			this.view = view;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			monitor.beginTask("refreshing view", 100);
			//getJobManager().beginRule(AbstractGraphicalContentProvider.CONTENT_LOADING_RULE, monitor);
			try {
				view.refreshSVG();
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
