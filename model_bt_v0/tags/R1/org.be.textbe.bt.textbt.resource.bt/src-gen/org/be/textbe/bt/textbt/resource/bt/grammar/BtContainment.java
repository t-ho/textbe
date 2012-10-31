/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.grammar;

public class BtContainment extends org.be.textbe.bt.textbt.resource.bt.grammar.BtTerminal {
	
	public BtContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.be.textbe.bt.textbt.resource.bt.grammar.BtCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
