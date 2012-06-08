package org.be.textbe.beviz.be2gv.builder.builder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.be.textbe.beviz.be2gv.Be2Gv;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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

public class BeBuilder extends IncrementalProjectBuilder {

	class BeDeltaVisitor implements IResourceDeltaVisitor {
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
				transformBe2Gv(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				transformBe2Gv(resource);
				break;
			}
			// return true to continue visiting children.
			return true;
		}
	}

	class BeResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			transformBe2Gv(resource);
			// return true to continue visiting children.
			return true;
		}
	}

	public static final String BUILDER_ID = "org.be.textbe.beviz.be2gv.builder.beBuilder";

	private static final String MARKER_TYPE = "org.be.textbe.beviz.be2gv.builder.beProblem";

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
	protected IProject[] build(int kind, Map<String, String> args,
			IProgressMonitor monitor) throws CoreException {
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

	void transformBe2Gv(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".bt")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);
			try {
				IFolder outputFolder = resource.getProject().getFolder("out");
				if (!outputFolder.exists()) {
					IProgressMonitor monitor = null;
					outputFolder.create(0, true, monitor);
				}

				String gvSource = Be2Gv.transformBtSource(file.getLocationURI()
						.toString());

				String outputFileBaseName = FilenameUtils
						.removeExtension(resource.getName());

				IFile outputFile = outputFolder.getFile(outputFileBaseName
						+ ".dot");

				InputStream source = new ByteArrayInputStream(
						gvSource.getBytes());

				IProgressMonitor monitor = null;
				if (outputFile.exists()) {
					outputFile.setContents(source, IResource.FORCE, monitor);

				} else {
					outputFile.create(source, IResource.FORCE
							| IResource.DERIVED, monitor);
				}
				outputFile.refreshLocal(IResource.DEPTH_ZERO, monitor);

			} catch (CoreException e) {
				addMarker(file, e.getMessage(), 0, IStatus.ERROR);
			} catch (IOException e) {
				addMarker(file, e.getMessage(), 0, IStatus.ERROR);
			}

		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new BeResourceVisitor());
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new BeDeltaVisitor());
	}
}
