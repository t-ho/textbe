package org.be.textbe.st.examples;
/*
 * @author tmyers
 * @version 0.1.1
 * @created 08.07.2011
 * 
 */



import org.eclipse.core.runtime.Plugin;


public class STExamplesPlugin extends Plugin {

	public static final String PLUGIN_ID = "org.be.textbe.st.examples";
	
	private static STExamplesPlugin instance;

	public STExamplesPlugin() {
		instance = this;
	}

	public static STExamplesPlugin getDefault() {
		if (instance == null) {
			return new STExamplesPlugin();
		}
		return instance;
	}

}