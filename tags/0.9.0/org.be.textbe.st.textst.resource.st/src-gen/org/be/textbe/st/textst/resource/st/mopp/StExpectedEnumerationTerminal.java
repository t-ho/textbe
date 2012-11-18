/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class StExpectedEnumerationTerminal extends org.be.textbe.st.textst.resource.st.mopp.StAbstractExpectedElement {
	
	private org.be.textbe.st.textst.resource.st.grammar.StEnumerationTerminal enumerationTerminal;
	
	public StExpectedEnumerationTerminal(org.be.textbe.st.textst.resource.st.grammar.StEnumerationTerminal enumerationTerminal) {
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
	
	public org.be.textbe.st.textst.resource.st.grammar.StEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
