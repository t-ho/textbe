package org.be.textbe.beviz.be2gv.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Enumeration;

import junit.framework.Assert;

import org.be.textbe.beviz.be2gv.Be2Gv;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.engine.emfvm.VMException;
import org.junit.Test;

public class ConversionTest {

	@Test
	public void test() throws IOException {

		final String symbolicName = "org.be.textbe.beviz.be2gv.test";
		final String testFileFolder = "testfiles";
		final String btFilePattern = "*.bt";

		final Enumeration<URL> btFiles = Platform.getBundle(symbolicName)
				.findEntries(testFileFolder, btFilePattern, true);

		while (btFiles.hasMoreElements()) {
			final URL url = (URL) btFiles.nextElement();

			final Path path = new Path(url.getFile());
			System.out.println(path);

			final IPath pathWithoutFileExtension = path.removeFileExtension();
			recordTransformationResults(url, pathWithoutFileExtension);

		}

	}

	private void recordTransformationResults(final URL url,
			final IPath pathWithoutFileExtension) throws IOException {
		final String transformBt2Gv;
		try {
			transformBt2Gv = Be2Gv.transformBt2Gv(url.toString());
			final IPath dotFilePath = pathWithoutFileExtension
					.addFileExtension("dot");
			FileWriter fileWriter = new FileWriter("." + dotFilePath.toString());
			fileWriter.write(transformBt2Gv);
			fileWriter.close();
		} catch (RuntimeException e) {
			Throwable cause = e.getCause();
			if (cause instanceof ATLExecutionException) {
				ATLExecutionException aee = (ATLExecutionException) cause;
				final IPath dotFilePath = pathWithoutFileExtension
						.addFileExtension("error");
				final PrintWriter s = new PrintWriter(new FileWriter("."
						+ dotFilePath.toString()));
				aee.printStackTrace(s);
				s.close();

			} else
				Assert.fail();
		}
	}
}
