/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class CtPlaceholder extends org.be.textbe.ct.textct.resource.ct.grammar.CtTerminal {
	
	private final String tokenName;
	
	public CtPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
