/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class BtExpectedCsString extends org.be.textbe.bt.textbt.resource.bt.mopp.BtAbstractExpectedElement {
	
	private String value;
	
	public BtExpectedCsString(String value) {
		super();
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getTokenName() {
		return "'" + value + "'";
	}
	
	public String toString() {
		return "CsString \"" + value + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof BtExpectedCsString) {
			return this.value.equals(((BtExpectedCsString) o).value);
		}
		return false;
	}
	
}
