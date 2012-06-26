/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

public class StContainment extends org.be.textbe.st.textst.resource.st.grammar.StTerminal {
	
	public StContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
