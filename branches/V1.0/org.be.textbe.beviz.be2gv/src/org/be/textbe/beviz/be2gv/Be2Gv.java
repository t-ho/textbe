package org.be.textbe.beviz.be2gv;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.be.textbe.gv.Graph;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.BufferedJET2Writer;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2TemplateManager;
import org.eclipse.jet.JET2TemplateManager.ITemplateRunner;
import org.eclipse.jet.transform.TransformContextExtender;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.osgi.framework.Bundle;

public class Be2Gv {

	private static final class GraphvizSourceGenerator implements
			JET2TemplateManager.ITemplateOperation {
		private final BufferedJET2Writer out;
		private final JET2Context context;

		private GraphvizSourceGenerator(BufferedJET2Writer out,
				JET2Context context) {
			this.out = out;
			this.context = context;
		}

		public void run(ITemplateRunner runner) {
			runner.generate("templates/gv.jet", context, out);
		}
	}

	private static final String TRANSFORMATION_PLUGIN_ID = "org.be.textbe.gv.gv2text";

	private static final String gvModel2Text(Graph source) {

		String content = "";
		try {
			final JET2Context context = createJETContext(source, null);

			final BufferedJET2Writer out = new BodyContentWriter();

			try {
				JET2TemplateManager.run(
						new String[] { TRANSFORMATION_PLUGIN_ID },
						new GraphvizSourceGenerator(out, context));
			} catch (Exception e) {
				e.printStackTrace();
			}

			content = out.getContent();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return content;

	}

	public static final String beFileToGvSource(IFile btModelFile)
			throws CoreException, IOException {

		/**
		 * Get the contents of the BT model file
		 */

		String sourceModelUriAsString = btModelFile.getFullPath().toString();

		return transformBtSource(URI
				.createPlatformResourceURI(sourceModelUriAsString,true));

	}

	public static String transformBtSource(URI sourceModelURI)
			throws IOException {
				
		/**
		 * Get the transformation program as an input stream. TODO This should
		 * be refactored to the Activator
		 */
		String transformationProgramFile = "transformations/textBT2GV.asm";
		Bundle bundle = Platform.getBundle("org.be.textbe.beviz.be2gv");
		/**
		 * TODO yikes, magic strings - maybe this should be in the activator
		 * Definitely not a function of the transformation.
		 */
		Path transformationProgramPath = new Path(transformationProgramFile);
		URL fileURL = FileLocator.find(bundle, transformationProgramPath, null);
		InputStream programModuleInputStream = fileURL.openStream();

		/**
		 * Get the utilities
		 */
		ATLUtils atlUtils;
		try {
			atlUtils = ATLUtils.getInstance();
		} catch (ATLCoreException e) {
			throw new RuntimeException(e.getMessage());
		}

		/**
		 * Get the model factory
		 */
		ModelFactory modelFactory = atlUtils.getModelFactory();

		/**
		 * Get the model injector
		 */
		EMFInjector injector = atlUtils.getInjector();
	
		/**
		 * Reset the launcher
		 */
		
		try {
			atlUtils.resetLauncher();
		} catch (ATLCoreException e) {
			throw new RuntimeException(e.getMessage());
		}

		/**
		 * Get the launcher
		 */
		ILauncher launcher = atlUtils.getLauncher();

		/**
		 * The output Graph
		 */
		Graph graph = null;
		try {
			/**
			 * Create the input metamodel
			 */
			final IReferenceModel btReferenceModel = modelFactory
					.newReferenceModel();

			/**
			 * Inject the input metamodel
			 */
			injector.inject(btReferenceModel, "http://org.be.textbe/textbt");

			/**
			 * Create the output metamodel
			 */
			IReferenceModel gvReferenceModel = modelFactory.newReferenceModel();

			/**
			 * Inject the output metamodel
			 */
			injector.inject(gvReferenceModel, "http://org.be.textbe/gv");

			/**
			 * Create the input model
			 */
			IModel btModel = modelFactory.newModel(btReferenceModel);

			/**
			 * Inject the input model
			 */
			injector.inject(btModel, sourceModelURI.toString());

			/**
			 * Add the input model and variable names to the launcher. This
			 * variable name will be used in the transformation program to
			 * reference the model.
			 */
			launcher.addInModel(btModel, "TEXTBT", "IN");

			/**
			 * Create the output model
			 */
			IModel gvModel = modelFactory.newModel(gvReferenceModel);
			gvModel.setIsTarget(true);

			/**
			 * Add the output model and variable names to the launcher. This
			 * variable name will be used in the transformation program to
			 * reference the model.
			 */
			launcher.addOutModel(gvModel, "GV", "OUT");

			/**
			 * Load the transformation program module into the launcher
			 */
			Object transformationProgram = launcher
					.loadModule(programModuleInputStream);

			/**
			 * No progress monitor
			 */
			NullProgressMonitor monitor = new NullProgressMonitor();

			/**
			 * Choose Run Mode
			 */
			String mode = ILauncher.RUN_MODE;

			/**
			 * No other transformation options
			 */
			Map<String, Object> options = Collections
					.<String, Object> emptyMap();

			/**
			 * Launch the transformation passing the parameters above
			 */
			launcher.launch(mode, monitor, options, transformationProgram);

			/**
			 * Cast the output model to EMF
			 */
			EMFModel gvModelInEmf = (EMFModel) gvModel;

			/**
			 * Store the data in an anonymous resource
			 */
			gvModelInEmf.commitToResource();

			/**
			 * Get the first element of the resource
			 */
			EObject eObject = gvModelInEmf.getResource().getContents().get(0);

			/**
			 * Cast it to a graph
			 */
			graph = (Graph) eObject;
		} catch (ATLCoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		/**
		 * Invoke the Jet conversion
		 */
		String gvModel2Text = gvModel2Text(graph);

		/**
		 * Return the result
		 */
		return gvModel2Text;
	}

	private static final JET2Context createJETContext(Object modelRoot,
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
