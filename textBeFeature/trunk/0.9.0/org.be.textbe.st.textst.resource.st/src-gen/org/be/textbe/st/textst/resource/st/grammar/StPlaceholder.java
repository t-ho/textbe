/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class StPlaceholder extends org.be.textbe.st.textst.resource.st.grammar.StTerminal {
	
	private final String tokenName;
	
	public StPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
