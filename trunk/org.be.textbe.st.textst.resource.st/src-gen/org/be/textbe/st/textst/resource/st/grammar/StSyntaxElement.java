/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class StSyntaxElement {
	
	private StSyntaxElement[] children;
	private StSyntaxElement parent;
	private org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality;
	
	public StSyntaxElement(org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality, StSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (StSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(StSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public StSyntaxElement[] getChildren() {
		if (children == null) {
			return new StSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.be.textbe.st.textst.resource.st.grammar.StCardinality getCardinality() {
		return cardinality;
	}
	
}
