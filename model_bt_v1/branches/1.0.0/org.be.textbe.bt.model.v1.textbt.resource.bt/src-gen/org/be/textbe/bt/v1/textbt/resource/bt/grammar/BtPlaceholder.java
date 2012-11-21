/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class BtPlaceholder extends org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtTerminal {
	
	private final String tokenName;
	
	public BtPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
