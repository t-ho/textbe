/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class CtExpectedStructuralFeature extends org.be.textbe.ct.textct.resource.ct.mopp.CtAbstractExpectedElement {
	
	private org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder placeholder;
	
	public CtExpectedStructuralFeature(org.be.textbe.ct.textct.resource.ct.grammar.CtPlaceholder placeholder) {
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
		if (o instanceof CtExpectedStructuralFeature) {
			return getFeature().equals(((CtExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
