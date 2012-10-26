/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class StExpectedStructuralFeature extends org.be.textbe.st.textst.resource.st.mopp.StAbstractExpectedElement {
	
	private org.be.textbe.st.textst.resource.st.grammar.StPlaceholder placeholder;
	
	public StExpectedStructuralFeature(org.be.textbe.st.textst.resource.st.grammar.StPlaceholder placeholder) {
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
		if (o instanceof StExpectedStructuralFeature) {
			return getFeature().equals(((StExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
