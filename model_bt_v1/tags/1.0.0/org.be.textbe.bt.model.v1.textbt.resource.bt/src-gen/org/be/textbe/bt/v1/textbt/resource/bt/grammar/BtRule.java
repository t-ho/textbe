/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class BtRule extends org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public BtRule(org.eclipse.emf.ecore.EClass metaclass, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtChoice choice, org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtCardinality cardinality) {
		super(cardinality, new org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtChoice getDefinition() {
		return (org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtChoice) getChildren()[0];
	}
	
}

