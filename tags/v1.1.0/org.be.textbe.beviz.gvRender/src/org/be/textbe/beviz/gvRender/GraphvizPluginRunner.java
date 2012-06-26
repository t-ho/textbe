package org.be.textbe.beviz.gvRender;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.graphics.Point;

import com.abstratt.graphviz.GraphViz;
import com.abstratt.graphviz.GraphVizActivator;

public class GraphvizPluginRunner implements DotRunner {

	@Override
	public File getDotExecutable() {
		GraphVizActivator gvActivator = GraphVizActivator.getInstance();
		gvActivator.setManualDotPath("/usr/local/bin/dot");
		File dotLocation = gvActivator.getDotLocation().toFile();
		return dotLocation;
	}

	@Override
	public IStatus runDot(File inputFile, String extension, File outputFile) {
		IStatus status = GraphViz.runDot(extension, new Point(2100, 3000),
				inputFile, outputFile);
		return status;
	}

}
