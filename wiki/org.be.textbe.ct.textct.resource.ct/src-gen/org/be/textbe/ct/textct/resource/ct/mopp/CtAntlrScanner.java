/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtAntlrScanner implements org.be.textbe.ct.textct.resource.ct.ICtTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public CtAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.be.textbe.ct.textct.resource.ct.ICtTextToken result = new org.be.textbe.ct.textct.resource.ct.mopp.CtTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
