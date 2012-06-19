package org.be.textbe.beviz.gvRender;

import java.io.File;

import org.eclipse.core.runtime.IStatus;

public interface DotRunner {

	IStatus runDot(File inputFile, String extension, File outputFile);

	File getDotExecutable();

}
