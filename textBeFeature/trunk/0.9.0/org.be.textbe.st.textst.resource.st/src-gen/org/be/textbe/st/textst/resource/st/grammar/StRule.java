/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class StRule extends org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public StRule(org.eclipse.emf.ecore.EClass metaclass, org.be.textbe.st.textst.resource.st.grammar.StChoice choice, org.be.textbe.st.textst.resource.st.grammar.StCardinality cardinality) {
		super(cardinality, new org.be.textbe.st.textst.resource.st.grammar.StSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.be.textbe.st.textst.resource.st.grammar.StChoice getDefinition() {
		return (org.be.textbe.st.textst.resource.st.grammar.StChoice) getChildren()[0];
	}
	
}

