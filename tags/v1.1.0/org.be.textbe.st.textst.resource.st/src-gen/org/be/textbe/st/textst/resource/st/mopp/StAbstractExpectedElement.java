/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class StAbstractExpectedElement implements org.be.textbe.st.textst.resource.st.IStExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.be.textbe.st.textst.resource.st.util.StPair<org.be.textbe.st.textst.resource.st.IStExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.be.textbe.st.textst.resource.st.util.StPair<org.be.textbe.st.textst.resource.st.IStExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public StAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.be.textbe.st.textst.resource.st.IStExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.be.textbe.st.textst.resource.st.util.StPair<org.be.textbe.st.textst.resource.st.IStExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.be.textbe.st.textst.resource.st.util.StPair<org.be.textbe.st.textst.resource.st.IStExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
