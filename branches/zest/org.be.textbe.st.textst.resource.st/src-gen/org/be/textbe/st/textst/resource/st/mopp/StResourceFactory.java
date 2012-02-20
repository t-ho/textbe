/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public StResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.be.textbe.st.textst.resource.st.mopp.StResource(uri);
	}
	
}
