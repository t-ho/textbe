/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class StTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.be.textbe.st.textst.resource.st.IStTextScanner lexer;
	private org.be.textbe.st.textst.resource.st.IStTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.be.textbe.st.textst.resource.st.ui.StColorManager colorManager;
	private org.be.textbe.st.textst.resource.st.IStTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public StTokenScanner(org.be.textbe.st.textst.resource.st.IStTextResource resource, org.be.textbe.st.textst.resource.st.ui.StColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new org.be.textbe.st.textst.resource.st.mopp.StMetaInformation().createLexer();
		this.languageId = new org.be.textbe.st.textst.resource.st.mopp.StMetaInformation().getSyntaxName();
		this.store = org.be.textbe.st.textst.resource.st.ui.StUIPlugin.getDefault().getPreferenceStore();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		org.be.textbe.st.textst.resource.st.mopp.StDynamicTokenStyler dynamicTokenStyler = new org.be.textbe.st.textst.resource.st.mopp.StDynamicTokenStyler();
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.ENABLE);
			boolean enabled = store.getBoolean(enableKey);
			org.be.textbe.st.textst.resource.st.IStTokenStyle staticStyle = null;
			if (enabled) {
				String colorKey = org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
				org.eclipse.swt.graphics.RGB backgroundRGB = null;
				boolean bold = store.getBoolean(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.BOLD));
				boolean italic = store.getBoolean(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.ITALIC));
				boolean strikethrough = store.getBoolean(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
				boolean underline = store.getBoolean(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.UNDERLINE));
				// now call dynamic token styler to allow to apply modifications to the static
				// style
				staticStyle = new org.be.textbe.st.textst.resource.st.mopp.StTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
			}
			org.be.textbe.st.textst.resource.st.IStTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
			if (dynamicStyle != null) {
				int[] foregroundColorArray = dynamicStyle.getColorAsRGB();
				org.eclipse.swt.graphics.Color foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
				int[] backgroundColorArray = dynamicStyle.getBackgroundColorAsRGB();
				org.eclipse.swt.graphics.Color backgroundColor = null;
				if (backgroundColorArray != null) {
					org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
					backgroundColor = colorManager.getColor(backgroundRGB);
				}
				int style = org.eclipse.swt.SWT.NORMAL;
				if (dynamicStyle.isBold()) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (dynamicStyle.isItalic()) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (dynamicStyle.isStrikethrough()) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (dynamicStyle.isUnderline()) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
}
