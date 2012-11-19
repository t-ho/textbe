/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

public class CtCompound extends org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement {
	
	public CtCompound(org.be.textbe.ct.textct.resource.ct.grammar.CtChoice choice, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality) {
		super(cardinality, new org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
