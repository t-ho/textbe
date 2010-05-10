/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtAntlrScanner implements org.be.textbe.bt.textbt.resource.bt.IBtTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public BtAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		org.be.textbe.bt.textbt.resource.bt.IBtTextToken result = new org.be.textbe.bt.textbt.resource.bt.mopp.BtTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
