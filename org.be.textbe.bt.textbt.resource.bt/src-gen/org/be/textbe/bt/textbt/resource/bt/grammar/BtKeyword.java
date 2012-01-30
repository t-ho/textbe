/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class BtKeyword extends org.be.textbe.bt.textbt.resource.bt.grammar.BtSyntaxElement {
	
	private final String value;
	
	public BtKeyword(String value, org.be.textbe.bt.textbt.resource.bt.grammar.BtCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
