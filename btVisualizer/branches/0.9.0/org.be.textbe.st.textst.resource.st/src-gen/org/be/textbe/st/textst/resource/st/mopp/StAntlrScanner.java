/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StAntlrScanner implements org.be.textbe.st.textst.resource.st.IStTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public StAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.be.textbe.st.textst.resource.st.IStTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.be.textbe.st.textst.resource.st.IStTextToken result = new org.be.textbe.st.textst.resource.st.mopp.StTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
