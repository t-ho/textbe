/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

/**
 * A class to represent an enumeration terminal in the grammar.
 */
public class StEnumerationTerminal extends org.be.textbe.st.textst.resource.st.grammar.StTerminal {
	
	private java.util.Map<String, String> mapping = new java.util.LinkedHashMap<String, String>();
	
	public StEnumerationTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String[] literalMappings, org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		assert literalMappings.length % 2 == 0;
		for (int i = 0; i < literalMappings.length; i += 2) {
			String literalName = literalMappings[i];
			String text = literalMappings[i + 1];
			this.mapping.put(literalName, text);
		}
	}
	
	public java.util.Map<String, String> getLiteralMapping() {
		return this.mapping;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
	public String getText(String literalName) {
		return this.mapping.get(literalName);
	}
	
}
