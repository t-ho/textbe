/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StBracketInformationProvider {
	
	public class BracketPair implements org.be.textbe.st.textst.resource.st.IStBracketPair {
		
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
	
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStBracketPair> getBracketPairs() {
		java.util.Collection<org.be.textbe.st.textst.resource.st.IStBracketPair> result = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.IStBracketPair>();
		return result;
	}
	
}
