package org.be.textbe.beviz.gvRender.systemTest;

import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;

import junit.framework.Assert;

import org.be.textbe.beviz.gvRender.ProcessBuilderRunner;
import org.junit.Test;

public class RunTest

{
	@Test
	public void testBuildProcess() throws Exception {

		URL input = new URL(
				"platform:/plugin/org.be.textbe.beviz.gvRender.systemTest/testfiles/"
						+ "RBT1.dot");

		InputStream source = input.openStream();
		PrintStream target = System.out;
		PrintStream error = System.err;

		int exitCode = new ProcessBuilderRunner().runDotWithStreams(source, target, error);
		
		Assert.assertTrue(exitCode==0);

	}

}
