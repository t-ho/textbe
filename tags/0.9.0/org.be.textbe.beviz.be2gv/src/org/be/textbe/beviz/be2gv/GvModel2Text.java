package org.be.textbe.beviz.be2gv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.be.textbe.gv.Graph;
import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.BufferedJET2Writer;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2TemplateManager;
import org.eclipse.jet.JET2TemplateManager.ITemplateOperation;
import org.eclipse.jet.JET2TemplateManager.ITemplateRunner;
import org.eclipse.jet.transform.TransformContextExtender;
import org.osgi.framework.BundleException;

public class GvModel2Text {

	static final class GenerateGraphvizSourceOperation implements
			JET2TemplateManager.ITemplateOperation {
		private static final String BE_TO_GV_TEMPLATE_PATH = "templates/gv.jet";
		private final BufferedJET2Writer out;
		private final JET2Context context;
	
		GenerateGraphvizSourceOperation(BufferedJET2Writer out,
				JET2Context context) {
			this.out = out;
			this.context = context;
		}
	
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jet.JET2TemplateManager.ITemplateOperation#run(org.eclipse
		 * .jet.JET2TemplateManager.ITemplateRunner)
		 */
		public void run(ITemplateRunner runner) {
			runner.generate(BE_TO_GV_TEMPLATE_PATH, context, out);
		}
	}

	static final String gvModel2Text(Graph source) {
		try {
	
			/**
			 * Create an empty map of variables.
			 */
			final Map<String, ?> variables = Collections.emptyMap();
	
			/**
			 * Create the context, adding variables.
			 */
			final JET2Context context = GvModel2Text.createJETContext(source, variables);
	
			/**
			 * Create the writer that produces the output
			 */
			final BufferedJET2Writer out = new BodyContentWriter();
	
			/**
			 * Create the list of transformation plugins to be used
			 */
			final String[] pluginIDs = new String[] { GvModel2Text.TRANSFORMATION_PLUGIN_ID };
	
			/**
			 * Define the JET operation
			 */
			final ITemplateOperation operation = new GvModel2Text.GenerateGraphvizSourceOperation(
					out, context);
	
			/**
			 * Execute the JET operation with the plugins
			 */
			JET2TemplateManager.run(pluginIDs, operation);
	
			/**
			 * Return the content
			 */
			return out.getContent();
	
		} catch (BundleException e) {
			assert false : "One of the plug-ins give in the array of pluginIDs cannot be loaded. Check the dependencies in the manifest and the current platform.";
			return "";
		} catch (NullPointerException e) {
			assert false : "The array of pluginIDs is null, or at least one of its elements is null. Check the array.";
			return "";
		} catch (IllegalArgumentException e) {
			assert false : "An entry in the array of pluginIDs  pluginIDs has zero length. Check the array.";
			return "";
		}
	
	}

	static final String TRANSFORMATION_PLUGIN_ID = "org.be.textbe.gv.gv2text";

	static final JET2Context createJETContext(Object modelRoot,
			final Map<String, ?> variables) {
	
		Map<String, Object> copiedVariables = new HashMap<String, Object>(
				variables != null ? variables
						: Collections.<String, Object> emptyMap());
	
		/**
		 * ensure that c:iterate can set the XPath context object
		 */
		copiedVariables.put(
				"org.eclipse.jet.taglib.control.iterateSetsContext",
				Boolean.TRUE);
	
		final JET2Context context = new JET2Context(modelRoot, copiedVariables);
	
		/**
		 * this statement has the side effect of initializing tag handling
		 */
		TransformContextExtender.getInstance(context);
		return context;
	}

}
