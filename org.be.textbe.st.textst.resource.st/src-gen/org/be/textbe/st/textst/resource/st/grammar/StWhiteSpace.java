/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

public class StWhiteSpace extends org.be.textbe.st.textst.resource.st.grammar.StFormattingElement {
	
	private final int amount;
	
	public StWhiteSpace(int amount, org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality) {
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
