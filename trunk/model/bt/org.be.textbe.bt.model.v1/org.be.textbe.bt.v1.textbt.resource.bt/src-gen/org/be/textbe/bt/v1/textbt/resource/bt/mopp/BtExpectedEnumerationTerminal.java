/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class BtExpectedEnumerationTerminal extends org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtAbstractExpectedElement {
	
	private org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtEnumerationTerminal enumerationTerminal;
	
	public BtExpectedEnumerationTerminal(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public java.util.Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>();
		java.util.Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
