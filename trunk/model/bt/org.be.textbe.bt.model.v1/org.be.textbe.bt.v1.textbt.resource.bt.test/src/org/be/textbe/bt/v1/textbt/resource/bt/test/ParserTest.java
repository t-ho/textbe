package org.be.textbe.bt.v1.textbt.resource.bt.test;


import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.be.textbe.bt.v1.textbt.resource.bt.util.BtResourceUtil;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class ParserTest {

	@Test
	public void test() throws IOException {
		Bundle bundle = Platform.getBundle("org.be.textbe.bt.v1.textbt.resource.bt.test");
		Enumeration<URL> findEntries = bundle.findEntries("testFiles", "*.bt", true);
		while (findEntries.hasMoreElements()) {
			URL url = (URL) findEntries.nextElement();
			URI uri = URI.createURI(url.toString());
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.createResource(uri);
			resource.load(null);
			
			System.out.println(uri);

			Assert.assertFalse(BtResourceUtil.containsErrors(resource));
			Assert.assertFalse(BtResourceUtil.containsProblems(resource));
			Assert.assertFalse(BtResourceUtil.containsWarnings(resource));

		}

	}

}
