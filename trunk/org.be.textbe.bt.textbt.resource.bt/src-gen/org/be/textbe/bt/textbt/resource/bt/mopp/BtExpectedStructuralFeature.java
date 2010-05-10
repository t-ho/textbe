/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

// A representation for a range in a document where a structural feature (e.g.,
// a reference) is expected.
public class BtExpectedStructuralFeature extends org.be.textbe.bt.textbt.resource.bt.mopp.BtAbstractExpectedElement {
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	private String tokenName;
	
	public BtExpectedStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName) {
		super();
		this.feature = feature;
		this.tokenName = tokenName;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
	public java.lang.String toString() {
		return "EFeature " + feature.getEContainingClass().getName() + "." + feature.getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof BtExpectedStructuralFeature) {
			return this.feature.equals(((BtExpectedStructuralFeature) o).feature);
		}
		return false;
	}
}
