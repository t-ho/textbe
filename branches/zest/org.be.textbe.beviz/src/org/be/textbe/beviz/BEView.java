/*
 * @author tmyers
 * @version 0.1
 * @created 07.05.2010
 * 
 */

package org.be.textbe.beviz;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.be.textbe.beviz.be2gv.Be2Gv;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class BEView extends ViewPart {

	private File dotFile;
	private BESelectionListener selectionListener;
	private ISelectionService SELECTION_SERVICE;

	public BEView() throws IOException {
		dotFile = File.createTempFile("dotfile", ".dot");

	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());

		selectionListener = new BESelectionListener();
		SELECTION_SERVICE = (ISelectionService) getSite().getService(
				ISelectionService.class);
		SELECTION_SERVICE.addPostSelectionListener(selectionListener);

		parent.layout();

	}

	@Override
	public void setFocus() {

	}

	public void dispose() {
		SELECTION_SERVICE.removePostSelectionListener(selectionListener);

		super.dispose();
	}

	public File getDOTFile() {
		return dotFile;
	}

	public void setDOTFile(File dotFile) {
		this.dotFile = dotFile;
	}

	public void refreshSVG() throws MalformedURLException {
	}

	public void clear() {
		try {
			dotFile.delete();
			dotFile = File.createTempFile("dotfile", ".dot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void displayBTorSTFile(IFile file)
			throws CoreException {

		String gvSourceCode = null;
		try {
			gvSourceCode = Be2Gv.beFileToGvSource(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(gvSourceCode);

	}


	private class BESelectionListener implements ISelectionListener {

		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {

			/**
			 * Adaptable at all?
			 */
			if (selection instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selection;
				/**
				 * Try adapting to a file
				 */
				IFile file = (IFile) adaptable.getAdapter(IFile.class);
				/**
				 * Adapted successfully?
				 */
				if (file != null) {
					/**
					 * Try to display
					 */
					try {
						displayBTorSTFile(file);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

		}
	}

}