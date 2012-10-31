/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.grammar;

public class BtChoice extends org.be.textbe.bt.textbt.resource.bt.grammar.BtSyntaxElement {
	
	public BtChoice(org.be.textbe.bt.textbt.resource.bt.grammar.BtCardinality cardinality, org.be.textbe.bt.textbt.resource.bt.grammar.BtSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.be.textbe.bt.textbt.resource.bt.util.BtStringUtil.explode(getChildren(), "|");
	}
	
}
