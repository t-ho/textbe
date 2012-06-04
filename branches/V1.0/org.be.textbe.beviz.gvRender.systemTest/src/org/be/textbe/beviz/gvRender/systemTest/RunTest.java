package org.be.textbe.beviz.gvRender.systemTest;

import java.util.Map;

import org.be.textbe.beviz.gvRender.GVOutputType;

public class RunTest {

	public void testBuildProcess() throws Exception {

		GVOutputType outputFormat = null;
		boolean quiet = false;
		int dotsPerInch = 72;
		boolean verbose = false;
		boolean swapAxis = false;

		
		String executable = "/usr/local/bin/dot";
		String optionOutputFormat = String.format("-T", outputFormat.getExtension());
		String optionQuiet = quiet ? "-q" : "";
		String optionScale = Integer.toString(dotsPerInch);
		String optionVerbose = verbose ? "-v" : "";
		String optionSwapAxis = swapAxis ? "-y" : "";
		
		
		ProcessBuilder pb = new ProcessBuilder(executable, optionOutputFormat,
				optionQuiet, optionScale, optionVerbose, optionSwapAxis);
		Map<String, String> env = pb.environment();
		
//		env.put("GDFONTPATH", "");
//		env.put("DOTFONTPATH", "");
//		env.put("SERVER_NAME", "");
//		env.put("GV_FILE_PATH", "");
//		env.put("GVBINDIR", "");

		Process p = pb.start();
		p.getInputStream();
		p.getOutputStream();
		p.getErrorStream();
		p.wait(1000);
		p.exitValue();

	}

}
