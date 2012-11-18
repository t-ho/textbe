/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class CtAbstractExpectedElement implements org.be.textbe.ct.textct.resource.ct.ICtExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.be.textbe.ct.textct.resource.ct.util.CtPair<org.be.textbe.ct.textct.resource.ct.ICtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.be.textbe.ct.textct.resource.ct.util.CtPair<org.be.textbe.ct.textct.resource.ct.ICtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public CtAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.be.textbe.ct.textct.resource.ct.ICtExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.be.textbe.ct.textct.resource.ct.util.CtPair<org.be.textbe.ct.textct.resource.ct.ICtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.util.CtPair<org.be.textbe.ct.textct.resource.ct.ICtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
