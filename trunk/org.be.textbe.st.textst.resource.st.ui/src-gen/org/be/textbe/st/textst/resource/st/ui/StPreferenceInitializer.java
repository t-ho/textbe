/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.ui;

/**
 * A class used to initialize default preference values.
 */
public class StPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.be.textbe.st.textst.resource.st.ui.StAntlrTokenHelper tokenHelper = new org.be.textbe.st.textst.resource.st.ui.StAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.be.textbe.st.textst.resource.st.ui.StUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.be.textbe.st.textst.resource.st.ui.StUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.be.textbe.st.textst.resource.st.mopp.StMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.be.textbe.st.textst.resource.st.ui.StUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.be.textbe.st.textst.resource.st.mopp.StMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.be.textbe.st.textst.resource.st.IStMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.be.textbe.st.textst.resource.st.ui.StBracketSet bracketSet = new org.be.textbe.st.textst.resource.st.ui.StBracketSet(null, null);
		final java.util.Collection<org.be.textbe.st.textst.resource.st.IStBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.be.textbe.st.textst.resource.st.IStBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.be.textbe.st.textst.resource.st.ui.StPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.be.textbe.st.textst.resource.st.IStMetaInformation metaInformation) {
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
			org.be.textbe.st.textst.resource.st.IStTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.be.textbe.st.textst.resource.st.ui.StSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
