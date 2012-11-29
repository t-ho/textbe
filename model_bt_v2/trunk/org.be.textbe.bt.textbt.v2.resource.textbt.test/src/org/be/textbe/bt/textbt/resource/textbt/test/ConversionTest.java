package org.be.textbe.bt.textbt.resource.textbt.test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

public class ConversionTest {

	@Test
	public void test() throws IOException {

		final String symbolicName = "org.be.textbe.bt.textbt.resource.textbt.test";
		final String testFileFolder = "testfiles";
		final String btFilePattern = "*.textbt";

		final Enumeration<URL> btFiles = Platform.getBundle(symbolicName)
				.findEntries(testFileFolder, btFilePattern, true);

		ResourceSet resourceSet = new ResourceSetImpl();
		while (btFiles.hasMoreElements()) {
			final URL url = (URL) btFiles.nextElement();

			final Path path = new Path(url.getFile());
			System.out.println(path);

			Resource resource = resourceSet.getResource(URI.createURI(url.toExternalForm()), true);

			EList<Diagnostic> errors = resource.getErrors();

			for (Diagnostic diagnostic : errors) {
				System.out.println(diagnostic);
			}

			EList<Diagnostic> warnings = resource.getWarnings();

			for (Diagnostic diagnostic : warnings) {
				System.out.println(diagnostic);
			}

		}

	}


}
