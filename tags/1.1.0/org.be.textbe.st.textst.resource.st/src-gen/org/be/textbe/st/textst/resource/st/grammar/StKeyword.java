/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class StKeyword extends org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement {
	
	private final String value;
	
	public StKeyword(String value, org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality) {
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
