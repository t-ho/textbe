/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public CtResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtResource(uri);
	}
	
}
