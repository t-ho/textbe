/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.grammar;

public class BtCompound extends org.be.textbe.bt.textbt.resource.bt.grammar.BtSyntaxElement {
	
	public BtCompound(org.be.textbe.bt.textbt.resource.bt.grammar.BtChoice choice, org.be.textbe.bt.textbt.resource.bt.grammar.BtCardinality cardinality) {
		super(cardinality, new org.be.textbe.bt.textbt.resource.bt.grammar.BtSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
