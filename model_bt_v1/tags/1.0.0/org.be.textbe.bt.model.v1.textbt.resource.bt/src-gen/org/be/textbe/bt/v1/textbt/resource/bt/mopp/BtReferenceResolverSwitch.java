/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

public class BtReferenceResolverSwitch implements org.be.textbe.bt.v1.textbt.resource.bt.IBtReferenceResolverSwitch {
	
	protected org.be.textbe.bt.v1.textbt.resource.bt.analysis.NodeBehaviorReferenceResolver nodeBehaviorReferenceResolver = new org.be.textbe.bt.v1.textbt.resource.bt.analysis.NodeBehaviorReferenceResolver();
	protected org.be.textbe.bt.v1.textbt.resource.bt.analysis.TraceabilityLinkRequirementReferenceResolver traceabilityLinkRequirementReferenceResolver = new org.be.textbe.bt.v1.textbt.resource.bt.analysis.TraceabilityLinkRequirementReferenceResolver();
	
	public org.be.textbe.bt.v1.textbt.resource.bt.analysis.NodeBehaviorReferenceResolver getNodeBehaviorReferenceResolver() {
		return nodeBehaviorReferenceResolver;
	}
	
	public org.be.textbe.bt.v1.textbt.resource.bt.analysis.TraceabilityLinkRequirementReferenceResolver getTraceabilityLinkRequirementReferenceResolver() {
		return traceabilityLinkRequirementReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		nodeBehaviorReferenceResolver.setOptions(options);
		traceabilityLinkRequirementReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.be.textbe.bt.v1.textbt.resource.bt.IBtReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNode().isInstance(container)) {
			BtFuzzyResolveResult<org.be.textbe.bt.v1.textbt.Behavior> frr = new BtFuzzyResolveResult<org.be.textbe.bt.v1.textbt.Behavior>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("behavior")) {
				nodeBehaviorReferenceResolver.resolve(identifier, (org.be.textbe.bt.v1.textbt.Node) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityLink().isInstance(container)) {
			BtFuzzyResolveResult<org.be.textbe.bt.v1.textbt.Requirement> frr = new BtFuzzyResolveResult<org.be.textbe.bt.v1.textbt.Requirement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("requirement")) {
				traceabilityLinkRequirementReferenceResolver.resolve(identifier, (org.be.textbe.bt.v1.textbt.TraceabilityLink) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.be.textbe.bt.v1.textbt.resource.bt.IBtReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNode_Behavior()) {
			return nodeBehaviorReferenceResolver;
		}
		if (reference == org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityLink_Requirement()) {
			return traceabilityLinkRequirementReferenceResolver;
		}
		return null;
	}
	
}
