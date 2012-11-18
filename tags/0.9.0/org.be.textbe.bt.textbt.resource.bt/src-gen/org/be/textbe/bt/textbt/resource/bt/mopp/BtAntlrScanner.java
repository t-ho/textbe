/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtAntlrScanner implements org.be.textbe.bt.textbt.resource.bt.IBtTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public BtAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.be.textbe.bt.textbt.resource.bt.IBtTextToken result = new org.be.textbe.bt.textbt.resource.bt.mopp.BtTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
