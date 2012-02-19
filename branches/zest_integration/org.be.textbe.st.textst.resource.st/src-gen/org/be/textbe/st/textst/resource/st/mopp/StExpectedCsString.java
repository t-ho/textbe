/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class StExpectedCsString extends org.be.textbe.st.textst.resource.st.mopp.StAbstractExpectedElement {
	
	private org.be.textbe.st.textst.resource.st.grammar.StKeyword keyword;
	
	public StExpectedCsString(org.be.textbe.st.textst.resource.st.grammar.StKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof StExpectedCsString) {
			return getValue().equals(((StExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
