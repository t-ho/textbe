/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.grammar;

public class BtWhiteSpace extends org.be.textbe.bt.textbt.resource.bt.grammar.BtFormattingElement {
	
	private final int amount;
	
	public BtWhiteSpace(int amount, org.be.textbe.bt.textbt.resource.bt.grammar.BtCardinality cardinality) {
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
