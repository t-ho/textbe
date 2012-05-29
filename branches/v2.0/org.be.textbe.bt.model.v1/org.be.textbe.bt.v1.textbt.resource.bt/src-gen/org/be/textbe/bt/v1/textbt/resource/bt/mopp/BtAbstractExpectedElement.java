/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class BtAbstractExpectedElement implements org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.be.textbe.bt.v1.textbt.resource.bt.util.BtPair<org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.be.textbe.bt.v1.textbt.resource.bt.util.BtPair<org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public BtAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.be.textbe.bt.v1.textbt.resource.bt.util.BtPair<org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.be.textbe.bt.v1.textbt.resource.bt.util.BtPair<org.be.textbe.bt.v1.textbt.resource.bt.IBtExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
