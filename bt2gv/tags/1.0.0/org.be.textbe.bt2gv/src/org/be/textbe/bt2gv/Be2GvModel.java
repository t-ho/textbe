package org.be.textbe.bt2gv;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.be.textbe.gv.Graph;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;

public class Be2GvModel {

	/**
	 * Variable bindings for metamodels in the program
	 */
	private static final String GV_METAMODEL_REFERENCE_NAME = "GV";
	private static final String BT_METAMODEL_REFERENCE_NAME = "TEXTBT";

	/**
	 * Variable bindings for models in the program
	 */
	private static final String GV_MODEL_REFERENCE_NAME = "OUT";
	private static final String BT_MODEL_REFERENCE_NAME = "IN";

	/**
	 * Signifies no additional options for a transformation
	 */
	private static final Map<String, Object> NO_OPTIONS = Collections
			.<String, Object> emptyMap();

	/**
	 * Metamodel URIs
	 */
	private static final String GV_METAMODEL_URI = "http://org.be.textbe/gv";
	private static final String BT_METAMODEL_URI = "http://org.be.textbe/textbt";

	/**
	 * Bundle holding the transformation
	 */
	private static final String BUNDLE_ID = "org.be.textbe.bt2gv";

	/**
	 * Path leading to the compiled transformation code in the bundle
	 */
	private static String BINARY_PATH = "transformations/textBT2GV.asm";
	
	/**
	 * URL location of the binary version of the transformation program
	 */
	private static final String BINARY_URL = "platform:/plugin/" + BUNDLE_ID
			+ "/" + BINARY_PATH;

	/**
	 * ATL reference models
	 */
	private static IReferenceModel btReferenceModel;
	private static IReferenceModel gvReferenceModel;

	/**
	 * ATL instance models
	 */
	private static IModel btModel;
	private static IModel gvModel;

	/**
	 * ATL model factory
	 */
	private static ModelFactory modelFactory;

	/**
	 * Model injector
	 */
	private static EMFInjector injector;

	/**
	 * Transformation launcher
	 */
	private static ILauncher launcher;

	/**
	 * Transformation program
	 */
	private static Object transformation;

	/**
	 * instantiation utilities
	 */
	private static ATLUtils atlUtils;

	static {

		/**
		 * Initialize the utilities
		 */
		try {
			atlUtils = ATLUtils.getInstance();
		} catch (ATLCoreException e) {
			throw new RuntimeException(e.getMessage());
		}

		/**
		 * Set the model factory
		 */
		modelFactory = atlUtils.getModelFactory();

		/**
		 * Set the injector
		 */
		injector = atlUtils.getInjector();

		/**
		 * Set the launcher
		 */
		launcher = atlUtils.getLauncher();

		/**
		 * Install the metamodels
		 */
		try {
			installMetaModels(modelFactory, injector);
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			/**
			 * Load the transformation into the launcher using the URL provided
			 * to open an input stream.
			 */
			InputStream binarySource = new URL(BINARY_URL).openStream();
			transformation = launcher.loadModule(binarySource);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static synchronized Graph transformBt2GvModel2(String resource,
			IProgressMonitor progressMonitor) throws MalformedURLException,
			IOException {

		try {

			/**
			 * Configure the ATL launcher
			 */
			configureLaunch();

			/**
			 * Inject the input model
			 */
			injector.inject(btModel, resource);

			/**
			 * Launch the transformation in RUN_MODE, passing empty parameters,
			 * and showing the progress on the progress monitor.
			 */
			launcher.launch(ILauncher.RUN_MODE, progressMonitor, NO_OPTIONS,
					transformation);

			/**
			 * Cast the output model to an EMFModel
			 */
			EMFModel gvModelInEmf = (EMFModel) gvModel;

			/**
			 * Get the first element of the resource
			 */
			EObject eObject = gvModelInEmf.getResource().getContents().get(0);

			/**
			 * Cast it to a graph
			 */
			return (Graph) eObject;

		} catch (ATLCoreException e1) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e1);
		}
	}

	private static void configureLaunch() throws ATLCoreException {

		/**
		 * Unload the source model. If this is not done, it will stick around
		 * and race conditions occur. The transformation will only work
		 * occasionally. Very messy. Not clear why...
		 */
		atlUtils.unload(btModel);

		/**
		 * Reset the launchers variable configuration, keeping the compiled
		 * program in its memory.
		 */
		launcher.initialize(NO_OPTIONS);

		/**
		 * Create a new ATL model for BT
		 */
		btModel = modelFactory.newModel(btReferenceModel);

		/**
		 * Create a new ATL model for GV
		 */
		gvModel = modelFactory.newModel(gvReferenceModel);

		/**
		 * Add the names that represent the input metamodel and the input model
		 * in the ATL transformation program.
		 */

		launcher.addInModel(btModel, BT_METAMODEL_REFERENCE_NAME,
				BT_MODEL_REFERENCE_NAME);

		/**
		 * Add the names that represent the output metamodel and the output
		 * model in the ATL transformation program.
		 */
		launcher.addOutModel(gvModel, GV_METAMODEL_REFERENCE_NAME,
				GV_MODEL_REFERENCE_NAME);
	}

	private static void installMetaModels(ModelFactory modelFactory,
			EMFInjector injector) throws ATLCoreException {

		/**
		 * Create an ATL reference model for the BT metamodel
		 */
		btReferenceModel = modelFactory.newReferenceModel();

		/**
		 * Create an ATL reference model for the GV metamodel
		 */
		gvReferenceModel = modelFactory.newReferenceModel();

		/**
		 * Inject the BT metamodel into the reference model slot
		 */
		injector.inject(btReferenceModel, BT_METAMODEL_URI);

		/**
		 * Inject the GV metamodel into the reference model slot
		 */
		injector.inject(gvReferenceModel, GV_METAMODEL_URI);
	}

}
