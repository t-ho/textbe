/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

public class StLineBreak extends org.be.textbe.st.textst.resource.st.grammar.StFormattingElement {
	
	private final int tabs;
	
	public StLineBreak(org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
