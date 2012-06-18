package org.be.textbe.beviz;

import org.eclipse.core.resources.IFile;

/**
 * This interface should be implemented by adaptable objects that correspond to
 * a file containing graphical contents.
 */
public interface IGraphicalFileProvider {
	public IFile getGraphicalFile();
}
