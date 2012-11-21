/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.grammar;

public class BtSequence extends org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtSyntaxElement {
	
	public BtSequence(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtCardinality cardinality, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.be.textbe.bt.v1.textbt.resource.bt.util.BtStringUtil.explode(getChildren(), " ");
	}
	
}
