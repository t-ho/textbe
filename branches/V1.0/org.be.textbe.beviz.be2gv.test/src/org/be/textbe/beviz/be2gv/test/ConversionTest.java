package org.be.textbe.beviz.be2gv.test;

import java.io.IOException;
import java.net.URL;

import junit.framework.Assert;

import org.apache.commons.io.IOUtils;
import org.be.textbe.beviz.be2gv.Be2Gv;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class ConversionTest {

	@Test
	public void test() throws IOException {
		for (int i = 1; i < 10; i++) {


			for (int j = 1; j < 10; j++) {
				
				String fileName = "RBT" + i ;
				String pathName = "/org.be.textbe.beviz.be2gv.test/testfiles/" + fileName;

				URI sourceURI = URI.createPlatformPluginURI(pathName + ".bt", true);
				
				String computedDotSource = Be2Gv.transformBtSource(sourceURI);				

				URL url = new URL("platform:/plugin"+pathName+".dot");
				
				String storedDotSource = IOUtils.toString(url.openStream(), "UTF-8");
				
				Assert.assertEquals(storedDotSource, computedDotSource+'\n');
				
				

				

				
				


				
			}
		}
	}
}
