package org.be.textbe.beviz.be2gv.test;

import java.io.IOException;

import org.be.textbe.beviz.be2gv.Be2Gv;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class ConversionTest {

	@Test
	public void test() throws IOException {
		for (int i = 1; i < 10; i++) {


			for (int j = 1; j < 10; j++) {
				
				URI createPlatformPluginURI = URI.createPlatformPluginURI("/org.be.textbe.beviz.be2gv.test/testfiles/RBT" + i + ".bt", true);

				String transformBtSource = Be2Gv.transformBtSource(createPlatformPluginURI);
				System.out.println(transformBtSource);

			}
		}
	}
}
