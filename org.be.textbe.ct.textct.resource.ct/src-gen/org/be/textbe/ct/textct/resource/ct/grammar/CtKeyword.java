/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class CtKeyword extends org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement {
	
	private final String value;
	
	public CtKeyword(String value, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality) {
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
