package org.be.textbe.gvRenderer;

import java.io.File;

import org.eclipse.core.runtime.IStatus;

public interface DotRunner {

	IStatus runDot(File inputFile, String extension, File outputFile);

	File getDotExecutable();

}
