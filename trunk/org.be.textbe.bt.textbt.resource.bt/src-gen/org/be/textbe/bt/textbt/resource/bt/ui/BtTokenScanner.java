/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class BtTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.be.textbe.bt.textbt.resource.bt.IBtTextScanner lexer;
	private org.be.textbe.bt.textbt.resource.bt.IBtTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public BtTokenScanner(org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager colorManager) {
		this.lexer = new org.be.textbe.bt.textbt.resource.bt.mopp.BtMetaInformation().createLexer();
		this.languageId = new org.be.textbe.bt.textbt.resource.bt.mopp.BtMetaInformation().getSyntaxName();
		this.store = org.be.textbe.bt.textbt.resource.bt.mopp.BtPlugin.getDefault().getPreferenceStore();
		this.colorManager = colorManager;
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.bt.textbt.resource.bt.ui.BtSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(color, null, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			//ignore this error. It might occur during editing when locations are outdated quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
}
