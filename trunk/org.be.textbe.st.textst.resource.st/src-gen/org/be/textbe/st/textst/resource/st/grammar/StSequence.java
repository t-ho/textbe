/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

public class StSequence extends org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement {
	
	public StSequence(org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality, org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.be.textbe.st.textst.resource.st.util.StStringUtil.explode(getChildren(), " ");
	}
	
}
