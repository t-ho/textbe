/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StResourcePostProcessor implements org.be.textbe.st.textst.resource.st.IStResourcePostProcessor {
	
	public void process(org.be.textbe.st.textst.resource.st.mopp.StResource resource) {
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
