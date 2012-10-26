/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

public class StCompound extends org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement {
	
	public StCompound(org.be.textbe.st.textst.resource.st.grammar.StChoice choice, org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality) {
		super(cardinality, new org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
