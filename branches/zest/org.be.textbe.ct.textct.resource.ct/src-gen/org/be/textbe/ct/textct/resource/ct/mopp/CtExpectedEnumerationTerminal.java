/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class CtExpectedEnumerationTerminal extends org.be.textbe.ct.textct.resource.ct.mopp.CtAbstractExpectedElement {
	
	private org.be.textbe.ct.textct.resource.ct.grammar.CtEnumerationTerminal enumerationTerminal;
	
	public CtExpectedEnumerationTerminal(org.be.textbe.ct.textct.resource.ct.grammar.CtEnumerationTerminal enumerationTerminal) {
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
	
	public org.be.textbe.ct.textct.resource.ct.grammar.CtEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
