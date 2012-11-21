/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class BtExpectedStructuralFeature extends org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtAbstractExpectedElement {
	
	private org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtPlaceholder placeholder;
	
	public BtExpectedStructuralFeature(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof BtExpectedStructuralFeature) {
			return getFeature().equals(((BtExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
