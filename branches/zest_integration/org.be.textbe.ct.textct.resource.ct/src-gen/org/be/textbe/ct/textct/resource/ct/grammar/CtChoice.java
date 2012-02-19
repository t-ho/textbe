/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

public class CtChoice extends org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement {
	
	public CtChoice(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality, org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.be.textbe.ct.textct.resource.ct.util.CtStringUtil.explode(getChildren(), "|");
	}
	
}
