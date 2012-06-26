/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

public class CtLineBreak extends org.be.textbe.ct.textct.resource.ct.grammar.CtFormattingElement {
	
	private final int tabs;
	
	public CtLineBreak(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality, int tabs) {
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
