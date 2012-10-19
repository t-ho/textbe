package org.be.textbe.beviz.gvRender;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ProcessBuilderRunner implements DotRunner {

	private static final class BufferedPipe implements Runnable {
		private final InputStream source;
		private final OutputStream target;

		private BufferedPipe(InputStream source, OutputStream target) {
			this.source = source;
			this.target = target;
		}

		@Override
		public void run() {
			final byte[] buffer = new byte[65536];
			try {
				for (int count = source.read(buffer); count >= 0; count = source
						.read(buffer)) {
					target.write(buffer, 0, count);
				}
				source.close();
				target.close();
			} catch (IOException e) {
				new RuntimeException(e);
			}

		}
	}

	private static final int DEFAULT_RESOLUTION_IN_DPI = 72;

	@Override
	public IStatus runDot(File inputFile, String extension, File outputFile) {
		final IStatus result;
		final String pluginId = "org.be.textbe.beviz.gvRender";
		try {
			ByteArrayOutputStream stdErrBuffer = new ByteArrayOutputStream();
			int exitCode = runDotWithStreams(new FileInputStream(inputFile),
					new FileOutputStream(outputFile), stdErrBuffer);
			switch (exitCode) {
			case 0:
				result = Status.OK_STATUS;
				break;
			default:
				result = new Status(IStatus.ERROR, pluginId, "" + exitCode
						+ ":" + stdErrBuffer.toString());
				break;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return new Status(IStatus.ERROR, pluginId, e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			return new Status(IStatus.ERROR, pluginId, e.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
			return new Status(IStatus.ERROR, pluginId, e.getMessage());
		}
		return result;
	}

	@Override
	public File getDotExecutable() {
		return new File("E:/Program Files/Graphviz 2.28/bin/dot.exe");
	}

	public final int runDotWithStreams(final InputStream source,
			final OutputStream target, OutputStream error) throws IOException,
			InterruptedException {
		List<String> commandline = buildCommandline();
		Map<String, String> environment = buildEnvironment();

		/**
		 * Configure the process builder
		 */
		ProcessBuilder pb = new ProcessBuilder(commandline);

		pb.environment().putAll(environment);

		/*
		 * Obtain a process
		 */

		final Process p = pb.start();

		/*
		 * Obtain the streams
		 */

		final OutputStream processIn = p.getOutputStream();
		final InputStream processOut = p.getInputStream();
		final InputStream processErr = p.getErrorStream();

		/*
		 * Attach pipes to the streams
		 */

		new Thread(new BufferedPipe(source, processIn), "InputPipe").start();
		new Thread(new BufferedPipe(processOut, target), "OutputPipe").start();
		new Thread(new BufferedPipe(processErr, error), "ErrorPipe").start();

		/*
		 * Wait for completion
		 */
		int exitCode = p.waitFor();
		return exitCode;

	}

	public static final Map<String, String> buildEnvironment() {
		Map<String, String> environment = new HashMap<String, String>();
		/**
		 * List of pathnames giving directories which a program should search
		 * for fonts. Overridden by DOTFONTPATH. Used only if Graphviz is not
		 * built with the fontconfig library
		 */
		// env.put("GDFONTPATH", "");
		/**
		 * List of pathnames giving directories which a program should search
		 * for fonts. Overridden by fontpath. Used only if Graphviz is not built
		 * with the fontconfig library
		 */
		// env.put("DOTFONTPATH", "");
		/**
		 * If defined, this indicates that the software is running as a web
		 * application, which restricts access to image files. See GV_FILE_PATH.
		 */
		// env.put("SERVER_NAME", "");
		/**
		 * If SERVER_NAME is defined, image files are restricted to exist in one
		 * of the directories specified by GV_FILE_PATH. This last is a list of
		 * directory pathnames, separated by semicolons in Windows or by colons
		 * otherwise. Note that sometimes, when using one of the layout programs
		 * in a web script, it is not enough to use an export command but rather
		 * the variables should be set when the command is run, for example,
		 * SERVER_NAME=xxx GV_FILE_PATH="images:etc/images:/usr/share/images"
		 * dot -Tpng -o x.png x.gv Note that the image files must really reside
		 * in one of the specified directories. If the image file is specified
		 * as an absolute or relative pathname, a warning is given and only the
		 * base name is used.
		 */
		// env.put("GV_FILE_PATH", "");
		/**
		 * Indicates which directory contains the Graphviz config file and
		 * plug-in libraries. If it is defined, the value overrides any other
		 * mechanism for finding this directory. If Graphviz is properly
		 * installed, it should not be needed, though it can be useful for
		 * relocation on platforms not running Linux or Windows.
		 */
		// env.put("GVBINDIR", "");
		return environment;
	}

	public final List<String> buildCommandline() {

		List<String> command = new ArrayList<String>();

		File executable = getDotExecutable();

		command.add("dot");

		boolean printVersion = false;
		boolean setVerbose = false;

		GVOutputType outputType = GVOutputType.SVG;

		int resolution = DEFAULT_RESOLUTION_IN_DPI;

		boolean invertAxis = false;

		if (printVersion) {
			/**
			 * Print version and exit
			 */
			command.add("-V");
		} else {
			if (setVerbose) {
				/**
				 * Enable verbose mode
				 */
				command.add("-v");
			}

			/**
			 * Omitted: Graph Attributes -Gname=val - Set graph attribute 'name'
			 * to 'val'
			 */

			/**
			 * Omitted: Node Attributes -Nname=val - Set node attribute 'name'
			 * to 'val'
			 */

			/**
			 * Omitted: Edge Attributes -Ename=val - Set edge attribute 'name'
			 * to 'val'
			 */

			/**
			 * Set output format to 'v'
			 */
			command.add(String.format("-T%s", outputType.getExtension()));

			/**
			 * Omitted: Layout Engine -Kv -Set layout engine to 'v' (overrides
			 * default based on command name)
			 */

			/**
			 * Omitted: Libraries -lv -Use external library 'v'
			 */

			/**
			 * Omitted: Output files and formats -ofile - Write output to 'file'
			 */

			/**
			 * Omitted: Automatic derived file names -O - Automatically generate
			 * an output filename based on the input filename with a .'format'
			 * appended. (Causes all -ofile options to be ignored.)
			 */

			/**
			 * Omitted: Configuration graph -P - Internally generate a graph of
			 * the current plugins.
			 */

			/**
			 * Ommitted: message compression -q[l] - Set level of message
			 * suppression (=1)
			 */

			/**
			 * -s[v] - Scale input by 'v' (=72)
			 */
			if (resolution != DEFAULT_RESOLUTION_IN_DPI) {
				command.add(String.format("-s%d", resolution));
			}

			/**
			 * -y - Invert y coordinate in output
			 */

			if (invertAxis) {
				command.add("-y");
			}

			/**
			 * Omitted: neato re-layout and reduce graph -n[v] - No layout mode
			 * 'v' (=1) -x - Reduce graph
			 */

			/**
			 * Ommitted: Version dependent diagnostics
			 * 
			 * -Lg - Don't use grid -LO - Use old attractive force -Ln<i> - Set
			 * number of iterations to i -LU<i> - Set unscaled factor to i
			 * -LC<v> - Set overlap expansion factor to v -LT[*]<v> - Set
			 * temperature (temperature factor) to v -m -Memory test (Observe no
			 * growth with top. Kill when done.) -c - Configure plugins (Writes
			 * $prefix/lib/graphviz/config with available plugin information.
			 * Needs write privilege.)
			 */
		}

		return command;

	}

}
