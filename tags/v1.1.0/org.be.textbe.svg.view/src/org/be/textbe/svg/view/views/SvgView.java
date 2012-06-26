package org.be.textbe.svg.view.views;

import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class SvgView extends ViewPart {
	
	class UpdateListener implements IResourceChangeListener{

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			if(currentFile!=null){
				IResourceDelta delta = event.getDelta();
				IResourceDelta currentFileDelta = delta.findMember(currentFile.getFullPath());
				if(currentFileDelta!=null){
					if(currentFileDelta.getKind()==IResourceDelta.CHANGED){
						displayFile(currentFile);
					}
				}
			}
			
			
		}
		
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.be.textbe.svg.view.views.SvgView";
	private JSVGCanvas jsvgCanvas;
	private static ISelectionService SELECTION_SERVICE;
	private ISelectionListener selectionListener;
	private Frame frame;
	private IFile currentFile;
	private UpdateListener updateListener;

	/**
	 * The constructor.
	 */
	public SvgView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.EMBEDDED
				| SWT.NO_BACKGROUND);
		frame = SWT_AWT.new_Frame(composite);

		jsvgCanvas = new JSVGCanvas();
		frame.add(jsvgCanvas);
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		
		updateListener = new UpdateListener();
		
		workspace.addResourceChangeListener(updateListener);

		selectionListener = new ISelectionListener() {

			@Override
			public void selectionChanged(IWorkbenchPart part,
					ISelection selection) {
				if (part != SvgView.this
						&& selection instanceof IStructuredSelection) {
					showFirst(((IStructuredSelection) selection).toList());
				}

			}

		};
		SELECTION_SERVICE = (ISelectionService) getSite().getService(
				ISelectionService.class);
		SELECTION_SERVICE.addPostSelectionListener(selectionListener);

		/**
		 * http://wiki.apache.org/xmlgraphics-batik/CanvasInteractors
		 * Ctrl+LeftButton - Zoom Box Shift+RightButton - Zoom (with instant
		 * feedback) Shift+LeftButton - Pan Ctrl+RightButton - Rotate
		 * Ctrl+Shift+RightButton - Reset transform (also known as
		 * "Original View")
		 */
	}

	protected void showFirst(List<?> list) {
		if (list.size() != 0) {
			for (Object object : list) {
				if (object instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable) object;
					/**
					 * Try adapting to a file
					 */
					IFile file = (IFile) adaptable.getAdapter(IFile.class);
					/**
					 * Adapted successfully?
					 */
					if (file != null && file.getFileExtension().equals("svg")) {
						
						currentFile = file;
						/**
						 * Try to display
						 */
						/**
						 * TODO the ugly madness below that involves dropping
						 * the viewer completely is caused by some classloading
						 * issues in the OSGI runtime. On a second load the
						 * loader would fail with a link error. No cause has
						 * been found. The workaround for now is to drop the
						 * viewer on every change. This is not costly, only
						 * ugly.
						 */
						displayFile(file);

					}

				}

			}
		}
	}

	private void displayFile(IFile file) {
		try {
			/**
			 * Remove the old canvas
			 */
			frame.remove(jsvgCanvas);
			/**
			 * Create a new canvas
			 */
			jsvgCanvas = new JSVGCanvas();
			/**
			 * Add the canvas to the frame
			 */
			frame.add(jsvgCanvas);
			/**
			 * Have the frame check for repaint
			 */
			frame.validate();
			/**
			 * Get the absolute path of the file
			 */
			final URI locationURI = file.getLocationURI();
			/**
			 * Convert it to a URL encoded in a String
			 */
			final String resourceUrlAsString = locationURI
					.toURL().toExternalForm();
			/**
			 * Load the document for display
			 */
			jsvgCanvas.loadSVGDocument(resourceUrlAsString);
		} catch (MalformedURLException e) {
			assert false : "This is impossible";
			e.printStackTrace();
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {

	}
	
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(updateListener);
		super.dispose();
	}

}