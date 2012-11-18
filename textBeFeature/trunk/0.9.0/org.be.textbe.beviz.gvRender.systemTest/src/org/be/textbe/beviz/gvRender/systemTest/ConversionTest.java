package org.be.textbe.beviz.gvRender.systemTest;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.be.textbe.beviz.gvRender.GVOutputType;
import org.be.textbe.beviz.gvRender.GvRenderer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.junit.Assert;
import org.junit.Test;

import com.abstratt.graphviz.GraphVizActivator;

public class ConversionTest {

	@Test
	public void test() throws IOException, CoreException, URISyntaxException {
		IProgressMonitor monitor = null;
		/**
		 * Ensure the binary is there
		 */
		GraphVizActivator instance = GraphVizActivator.getInstance();

		instance.setManualDotPath("/usr/local/bin/dot");

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IProject project = workspace.getRoot().getProject("test");
		GVOutputType outputType = GVOutputType.SVG;

		if (project.exists()) {
			project.delete(true, monitor);
		}

		project.create(null);

		project.open(null);

		IFolder outputFolder = project.getFolder("testfiles");

		outputFolder.create(true, true, monitor);

		for (int i = 1; i < 10; i++) {

			String outputFileBaseName = "RBT" + i;
			String pathName = "/org.be.textbe.beviz.gvRender.systemTest/testfiles/"
					+ outputFileBaseName;

			URL url = new URL("platform:/plugin" + pathName + ".dot");

			URL resolve = FileLocator.resolve(url);

			File inputFile = new File(resolve.toURI());

			IStatus status = GvRenderer.renderOutput(inputFile, outputFolder,
					outputFileBaseName, outputType);

			Assert.assertTrue(status.isOK());

		}
	}
}
