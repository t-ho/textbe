/*
 * @author tmyers
 * @version 0.1
 * @created 07.05.2010
 * 
 */

package org.be.textbe.bt.examples;

import org.eclipse.ui.plugin.AbstractUIPlugin;


public class BEExamplesPlugin extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.be.textBT.examples";
	
	private static BEExamplesPlugin instance;

	public BEExamplesPlugin() {
		instance = this;
	}

	public static BEExamplesPlugin getDefault() {
		if (instance == null) {
			return new BEExamplesPlugin();
		}
		return instance;
	}

}