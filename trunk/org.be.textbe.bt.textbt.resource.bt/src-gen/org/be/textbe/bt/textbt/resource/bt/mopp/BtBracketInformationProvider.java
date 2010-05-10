/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtBracketInformationProvider {
	
	public class BracketPair implements org.be.textbe.bt.textbt.resource.bt.IBtBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtBracketPair> getBracketPairs() {
		java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtBracketPair> result = new java.util.ArrayList<org.be.textbe.bt.textbt.resource.bt.IBtBracketPair>();
		return result;
	}
	
}
