/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

public class StChoice extends org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement {
	
	public StChoice(org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality, org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.be.textbe.st.textst.resource.st.util.StStringUtil.explode(getChildren(), "|");
	}
	
}
