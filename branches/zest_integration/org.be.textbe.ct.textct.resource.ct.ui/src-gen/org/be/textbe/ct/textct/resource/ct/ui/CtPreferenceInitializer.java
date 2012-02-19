/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.ui;

/**
 * A class used to initialize default preference values.
 */
public class CtPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.be.textbe.ct.textct.resource.ct.ui.CtAntlrTokenHelper tokenHelper = new org.be.textbe.ct.textct.resource.ct.ui.CtAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.be.textbe.ct.textct.resource.ct.ui.CtUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.be.textbe.ct.textct.resource.ct.ui.CtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.be.textbe.ct.textct.resource.ct.mopp.CtMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.be.textbe.ct.textct.resource.ct.ui.CtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.be.textbe.ct.textct.resource.ct.mopp.CtMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.be.textbe.ct.textct.resource.ct.ICtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.be.textbe.ct.textct.resource.ct.ui.CtBracketSet bracketSet = new org.be.textbe.ct.textct.resource.ct.ui.CtBracketSet(null, null);
		final java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.be.textbe.ct.textct.resource.ct.ICtBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.be.textbe.ct.textct.resource.ct.ui.CtPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.be.textbe.ct.textct.resource.ct.ICtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			org.be.textbe.ct.textct.resource.ct.ICtTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.ct.textct.resource.ct.ui.CtSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
