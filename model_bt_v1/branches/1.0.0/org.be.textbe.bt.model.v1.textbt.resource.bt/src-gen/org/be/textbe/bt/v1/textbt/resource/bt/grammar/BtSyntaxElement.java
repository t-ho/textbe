/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class BtSyntaxElement {
	
	private BtSyntaxElement[] children;
	private BtSyntaxElement parent;
	private org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtCardinality cardinality;
	
	public BtSyntaxElement(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtCardinality cardinality, BtSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (BtSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(BtSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public BtSyntaxElement[] getChildren() {
		if (children == null) {
			return new BtSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtCardinality getCardinality() {
		return cardinality;
	}
	
}
