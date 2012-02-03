/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private CtSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public CtSyntaxElementDecorator(org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement decoratedElement, CtSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public CtSyntaxElementDecorator[] getChildDecorators() {
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
