/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class BtExpectedBooleanTerminal extends org.be.textbe.bt.textbt.resource.bt.mopp.BtAbstractExpectedElement {
	
	private org.be.textbe.bt.textbt.resource.bt.grammar.BtBooleanTerminal booleanTerminal;
	
	public BtExpectedBooleanTerminal(org.be.textbe.bt.textbt.resource.bt.grammar.BtBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.grammar.BtBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof BtExpectedBooleanTerminal) {
			return getFeature().equals(((BtExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
