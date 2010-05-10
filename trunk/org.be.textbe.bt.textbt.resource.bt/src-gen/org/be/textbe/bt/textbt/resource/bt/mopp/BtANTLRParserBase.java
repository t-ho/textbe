/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public abstract class BtANTLRParserBase extends org.antlr.runtime.Parser implements org.be.textbe.bt.textbt.resource.bt.IBtTextParser {
	
	public BtANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public BtANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
