/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public BtResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtResource(uri);
	}
	
}
