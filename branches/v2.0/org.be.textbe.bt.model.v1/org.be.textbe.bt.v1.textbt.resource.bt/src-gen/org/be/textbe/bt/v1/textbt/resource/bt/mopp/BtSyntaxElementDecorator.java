/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

public class BtSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private BtSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public BtSyntaxElementDecorator(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtSyntaxElement decoratedElement, BtSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public BtSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
