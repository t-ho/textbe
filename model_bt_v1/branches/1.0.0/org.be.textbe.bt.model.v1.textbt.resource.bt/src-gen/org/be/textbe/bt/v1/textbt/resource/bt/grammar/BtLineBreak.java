/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.grammar;

public class BtLineBreak extends org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtFormattingElement {
	
	private final int tabs;
	
	public BtLineBreak(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtCardinality cardinality, int tabs) {
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
