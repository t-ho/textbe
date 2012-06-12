package org.be.textbe.beviz.be2gv.builder.builder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.be.textbe.beviz.be2gv.Be2Gv;
import org.eclipse.core.resources.IContainer;
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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;

public class BeBuilder extends IncrementalProjectBuilder {

	private final String outputFolderName;

	public BeBuilder() {
		outputFolderName = "out";
	}

	class BeDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
		 * .core.resources.IResourceDelta)
		 */
		public boolean visit(final IResourceDelta delta) throws CoreException {
			final IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				new BeBuilder()
						.transformBe2GvNoParams(BeBuilder.this, resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				new BeBuilder()
						.transformBe2GvNoParams(BeBuilder.this, resource);
				break;
			}
			// return true to continue visiting children.
			return true;
		}
	}

	class BeResourceVisitor implements IResourceVisitor {
		public boolean visit(final IResource resource) {
			new BeBuilder().transformBe2GvNoParams(BeBuilder.this, resource);
			// return true to continue visiting children.
			return true;
		}
	}

	public static final String BUILDER_ID = "org.be.textbe.beviz.be2gv.builder.beBuilder";

	private static final String MARKER_TYPE = "org.be.textbe.beviz.be2gv.builder.beProblem";

	public void transformBe2GvNoParams(final BeBuilder beBuilder,
			final IResource resource) {

		beBuilder.transformBe2Gv(resource, getOutputFolderName());
	}

	private final void addMarker(final IFile file, final String message,
			final int lineNumber, final int severity) {
		try {
			final IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			final int lineNumberToStore = lineNumber == -1 ? 1 : lineNumber;
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumberToStore);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(final int kind, final Map<String, String> args,
			final IProgressMonitor monitor) throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			final IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	void transformBe2Gv(final IResource resource, final String outputFolderName) {
		if (resource instanceof IFile && resource.getName().endsWith(".bt")) {
			final IFile file = (IFile) resource;
			deleteMarkers(file);
			try {
				final IFile outputFile = getOutputFile(resource,
						outputFolderName);

				final String gvSource = Be2Gv.transformBt2Gv(file
						.getLocationURI().toString());

				final InputStream source = new ByteArrayInputStream(
						gvSource.getBytes());

				final IProgressMonitor monitor = null;
				if (outputFile.exists()) {
					outputFile.setContents(source, IResource.FORCE, monitor);

				} else {
					outputFile.create(source, IResource.FORCE
							| IResource.DERIVED, monitor);
				}
				outputFile.refreshLocal(IResource.DEPTH_ZERO, monitor);
			} catch (RuntimeException e) {
				addMarker(file, e.getMessage(), 0, IStatus.ERROR);
			} catch (CoreException e) {
				addMarker(file, e.getMessage(), 0, IStatus.ERROR);
			} catch (IOException e) {
				addMarker(file, e.getMessage(), 0, IStatus.ERROR);
			}

		}
	}

	private IFile getOutputFile(final IResource resource,
			final String outputFolderName) throws CoreException {

		/**
		 * Location of source resource within the workspace, i.e. the resources
		 * parent container.
		 */
		final IPath resourcePathWithoutProject = resource.getParent()
				.getProjectRelativePath();

		/**
		 * Append the project-internal path to the name of the output folder.
		 */
		final IPath outputFolderPath = new Path(outputFolderName)
				.append(resourcePathWithoutProject);

		/**
		 * Get the folder that corresponds to this path
		 */

		final IFolder outputFolder = resource.getProject().getFolder(
				outputFolderPath);
		if (!outputFolder.exists()) {
			IProgressMonitor monitor = null;
			/**
			 * Create the folder and mark it as derived.
			 */
			createContainer(outputFolder, monitor);
		}

		final String outputFileBaseName = FilenameUtils
				.removeExtension(resource.getName());

		final IFile outputFile = outputFolder.getFile(outputFileBaseName
				+ ".dot");
		return outputFile;
	}

	private void deleteMarkers(final IFile file) {
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

	protected void incrementalBuild(final IResourceDelta delta,
			final IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new BeDeltaVisitor());
	}

	public String getOutputFolderName() {
		return outputFolderName;
	}

	public void createContainer(IContainer container, IProgressMonitor monitor)
			throws CoreException {

		IContainer parent = container.getParent();
		if (!parent.exists()) {
			createContainer(parent, monitor);
		}

		final int updateFlags = IResource.FORCE | IResource.DERIVED;

		int type = container.getType();
		switch (type) {
		case IResource.FOLDER:
			((IFolder) container).create(updateFlags, true, monitor);

			break;
		case IResource.PROJECT:
			((IProject) container).create(monitor);

			break;
		case IResource.ROOT:
			/**
			 * Nothing to be done as the root always exists
			 */
			break;

		default:
			assert false : "Unexpected subtype of IResource:" + type;
			break;
		}

	}

}
