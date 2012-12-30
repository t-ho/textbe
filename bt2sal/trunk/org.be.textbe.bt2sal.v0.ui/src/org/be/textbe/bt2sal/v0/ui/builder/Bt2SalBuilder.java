package org.be.textbe.bt2sal.v0.ui.builder;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.be.textbe.bt2sal.v0.Bt2Sal;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class Bt2SalBuilder extends IncrementalProjectBuilder {

	class DeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 *
		 * @see
		 * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
		 * .core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				translateBt(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				translateBt(resource);
				break;
			}
			// return true to continue visiting children.
			return true;
		}
	}

	class ResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			translateBt(resource);
			// return true to continue visiting children.
			return true;
		}
	}

	class XMLErrorHandler extends DefaultHandler {

		private IFile file;

		public XMLErrorHandler(IFile file) {
			this.file = file;
		}

		private void addMarker(SAXParseException e, int severity) {
			Bt2SalBuilder.this.addMarker(file, e.getMessage(),
					e.getLineNumber(), severity);
		}

		public void error(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void fatalError(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void warning(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_WARNING);
		}
	}

	public static final String BUILDER_ID = "org.be.textbe.bt2sal.v0.ui.org.be.textbe.bt2sal.v0.ui.builder.bt2SalBuilder";

	private static final String MARKER_TYPE = "org.be.textbe.bt2sal.v0.salProblem";

	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	public void translateBt(IResource resource) {

		final Object adapter = resource.getAdapter(IFile.class);
		if (adapter != null) {
			IFile inputFile = (IFile) adapter;
			/**
			 * TODO this should be keyed of a resource type, not a filename
			 * extension
			 */
			if(inputFile.getFileExtension().equals("bt")){
				final IContainer parent = inputFile.getParent();
				final Object adapter2 = parent.getAdapter(IContainer.class);
				if (adapter2 != null) {
					IContainer inputFolder = (IContainer) adapter2;
					final IFile outputFile = inputFolder.getFile(Path.fromPortableString(inputFile
							.getName() + ".sal"));

					if(outputFile.exists()){
						try {
							outputFile.delete(true, null);
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					IStatus status = translateToSalFile(inputFile, outputFile);
					if (!status.isOK()) {
//						addMarker(inputFile, status.getMessage(), 0,
//								status.getSeverity());
					}
					try {
						resource.getParent().refreshLocal(IResource.DEPTH_ONE,
								null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}


		}

	}

	private IStatus translateToSalFile(IFile inputFile, IFile outputFile) {
		int priority = 0;
		int buff = 0;
		int withSets = 0;
		String sets = "";
		String init = "";

		try {

			final String tree = IOUtils.toString(inputFile.getContents(),
					"UTF-8");

			final String translateToSal = Bt2Sal.translateToSal(tree, priority,
					buff, withSets, sets, init);

			outputFile.create(
					new ByteArrayInputStream(translateToSal.getBytes()), true,
					null);

			return Status.OK_STATUS;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
	}

	@SuppressWarnings("unused")
	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new ResourceVisitor());
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new DeltaVisitor());
	}
}
