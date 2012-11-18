/*
 * @author tmyers
 * @version 0.1
 * @created 07.05.2010
 * 
 */

package org.be.textbe.bt.examples;

import org.eclipse.core.runtime.Plugin;

public class BEExamplesPlugin extends Plugin {

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