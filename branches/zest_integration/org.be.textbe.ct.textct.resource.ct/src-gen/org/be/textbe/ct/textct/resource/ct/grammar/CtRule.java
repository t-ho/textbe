/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class CtRule extends org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public CtRule(org.eclipse.emf.ecore.EClass metaclass, org.be.textbe.ct.textct.resource.ct.grammar.CtChoice choice, org.be.textbe.ct.textct.resource.ct.grammar.CtCardinality cardinality) {
		super(cardinality, new org.be.textbe.ct.textct.resource.ct.grammar.CtSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.be.textbe.ct.textct.resource.ct.grammar.CtChoice getDefinition() {
		return (org.be.textbe.ct.textct.resource.ct.grammar.CtChoice) getChildren()[0];
	}
	
}

