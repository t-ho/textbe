/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class CtSyntaxElement {
	
	private CtSyntaxElement[] children;
	private CtSyntaxElement parent;
	private org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality;
	
	public CtSyntaxElement(org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality, CtSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (CtSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(CtSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public CtSyntaxElement[] getChildren() {
		if (children == null) {
			return new CtSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality getCardinality() {
		return cardinality;
	}
	
}
