/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

public class CtWhiteSpace extends org.be.textbe.ct.textct.resource.ct.grammar.CtFormattingElement {
	
	private final int amount;
	
	public CtWhiteSpace(int amount, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
