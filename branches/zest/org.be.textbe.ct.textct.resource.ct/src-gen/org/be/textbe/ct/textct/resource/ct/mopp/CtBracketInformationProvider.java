/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtBracketInformationProvider {
	
	public class BracketPair implements org.be.textbe.ct.textct.resource.ct.ICtBracketPair {
		
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
	
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtBracketPair> getBracketPairs() {
		java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtBracketPair> result = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.ICtBracketPair>();
		result.add(new BracketPair("{", "}", true));
		return result;
	}
	
}
