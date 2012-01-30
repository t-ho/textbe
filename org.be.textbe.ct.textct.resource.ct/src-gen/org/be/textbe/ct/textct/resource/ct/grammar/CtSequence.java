/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

public class CtSequence extends org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement {
	
	public CtSequence(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality, org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.be.textbe.ct.textct.resource.ct.util.CtStringUtil.explode(getChildren(), " ");
	}
	
}
