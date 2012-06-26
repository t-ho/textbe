/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class CtExpectedCsString extends org.be.textbe.ct.textct.resource.ct.mopp.CtAbstractExpectedElement {
	
	private org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword keyword;
	
	public CtExpectedCsString(org.be.textbe.ct.textct.resource.ct.grammar.CtKeyword keyword) {
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
		if (o instanceof CtExpectedCsString) {
			return getValue().equals(((CtExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
