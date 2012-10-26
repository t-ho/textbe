
package org.be.textbe.bt2sal2.xtext.sal;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SalStandaloneSetup extends SalStandaloneSetupGenerated{

	public static void doSetup() {
		new SalStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

