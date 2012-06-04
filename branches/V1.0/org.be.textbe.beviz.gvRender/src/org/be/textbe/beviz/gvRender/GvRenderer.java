package org.be.textbe.beviz.gvRender;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.graphics.Point;

import com.abstratt.graphviz.GraphViz;
import com.abstratt.graphviz.GraphVizActivator;

public class GvRenderer {

	private static final String BUNDLE_ID = "org.be.textbe.beviz.gvRender";
	private static final ILog LOG = Platform.getLog(Platform
			.getBundle(BUNDLE_ID));

	public static final IStatus renderOutput(File inputFile,
			IFolder outputFolder, String outputFileBaseName,
			GVOutputType outputType) throws CoreException {
		if (!inputFile.exists()) {
			return new Status(IStatus.ERROR, BUNDLE_ID, "Input file does not exist.");
		} else {
			IFile outputIFile = outputFolder.getFile(outputFileBaseName + "."
					+ outputType.getExtension());
			File outputFile = outputIFile.getLocation().toFile();
			if (!outputFile.getParentFile().exists()) {
				return new Status(IStatus.ERROR, BUNDLE_ID, "Output directory does not exist.");
			} else {
				IPath dotLocation = GraphVizActivator.getInstance()
						.getDotLocation();
				if (dotLocation == null) {
					return new Status(IStatus.ERROR, BUNDLE_ID, "Dot executable could not be found does not exist.");
				} else {
					String extension = outputType.getExtension();
					
					IStatus status = GraphViz.runDot(extension, new Point(2100,
							3000), inputFile, outputFile);
					
					outputIFile.refreshLocal(0, null);
					outputIFile.setDerived(true, null);
					
					return status;
				}
			}

		}

	}
	
	
}
