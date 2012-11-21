/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.analysis;

public class TraceabilityLinkRequirementReferenceResolver implements org.be.textbe.bt.v1.textbt.resource.bt.IBtReferenceResolver<org.be.textbe.bt.v1.textbt.TraceabilityLink, org.be.textbe.bt.v1.textbt.Requirement> {
	
	private org.be.textbe.bt.v1.textbt.resource.bt.analysis.BtDefaultResolverDelegate<org.be.textbe.bt.v1.textbt.TraceabilityLink, org.be.textbe.bt.v1.textbt.Requirement> delegate = new org.be.textbe.bt.v1.textbt.resource.bt.analysis.BtDefaultResolverDelegate<org.be.textbe.bt.v1.textbt.TraceabilityLink, org.be.textbe.bt.v1.textbt.Requirement>();
	
	public void resolve(String identifier, org.be.textbe.bt.v1.textbt.TraceabilityLink container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.be.textbe.bt.v1.textbt.resource.bt.IBtReferenceResolveResult<org.be.textbe.bt.v1.textbt.Requirement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.be.textbe.bt.v1.textbt.Requirement element, org.be.textbe.bt.v1.textbt.TraceabilityLink container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
