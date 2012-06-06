package org.be.textbe.beviz.gvRender;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;


public class GvRenderer {

	static final String BUNDLE_ID = "org.be.textbe.beviz.gvRender";

	public static final IStatus renderOutput(File inputFile,
			IFolder outputFolder, String outputFileBaseName,
			GVOutputType outputType) throws CoreException {
		if (!inputFile.exists()) {
			return new Status(IStatus.ERROR, BUNDLE_ID, "Input file does not exist.");
		} else {
			DotRunner runner = new GraphvizPluginRunner();
			IFile outputIFile = outputFolder.getFile(outputFileBaseName + "."
					+ outputType.getExtension());
			if (!outputIFile.getParent().exists()) {
				return new Status(IStatus.ERROR, BUNDLE_ID, "Output directory does not exist.");
			} else {
				File dotLocation = runner.getDotExecutable();
				if (dotLocation == null) {
					return new Status(IStatus.ERROR, BUNDLE_ID, "Dot executable could not be found does not exist.");
				} else {
					String extension = outputType.getExtension();
					
					File outputFile = outputIFile.getLocation().toFile();
					IStatus status = runner.runDot(inputFile, extension, outputFile);
					
					outputIFile.refreshLocal(IResource.DEPTH_ZERO, null);
					outputIFile.setDerived(true, null);
					
					return status;
				}
			}
	
		}
	
	}
	
	
}
