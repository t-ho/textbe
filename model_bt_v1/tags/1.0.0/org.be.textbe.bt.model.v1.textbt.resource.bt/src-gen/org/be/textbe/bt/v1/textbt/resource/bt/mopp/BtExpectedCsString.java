/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class BtExpectedCsString extends org.be.textbe.bt.v1.textbt.resource.bt.mopp.BtAbstractExpectedElement {
	
	private org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtKeyword keyword;
	
	public BtExpectedCsString(org.be.textbe.bt.v1.textbt.resource.bt.grammar.BtKeyword keyword) {
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
		if (o instanceof BtExpectedCsString) {
			return getValue().equals(((BtExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
