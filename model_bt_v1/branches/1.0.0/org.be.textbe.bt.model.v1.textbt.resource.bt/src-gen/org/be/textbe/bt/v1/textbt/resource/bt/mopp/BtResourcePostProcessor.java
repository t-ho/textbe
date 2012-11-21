/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

public class BtResourcePostProcessor implements org.be.textbe.bt.v1.textbt.resource.bt.IBtResourcePostProcessor {
	
	public void process(org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
