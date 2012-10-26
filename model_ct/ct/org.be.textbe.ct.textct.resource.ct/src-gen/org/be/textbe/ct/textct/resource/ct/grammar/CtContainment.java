/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

public class CtContainment extends org.be.textbe.ct.textct.resource.ct.grammar.CtTerminal {
	
	public CtContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
