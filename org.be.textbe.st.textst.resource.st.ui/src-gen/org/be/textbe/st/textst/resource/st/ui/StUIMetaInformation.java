/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.ui;

public class StUIMetaInformation extends org.be.textbe.st.textst.resource.st.mopp.StMetaInformation {
	
	public org.be.textbe.st.textst.resource.st.IStHoverTextProvider getHoverTextProvider() {
		return new org.be.textbe.st.textst.resource.st.ui.StHoverTextProvider();
	}
	
	public org.be.textbe.st.textst.resource.st.ui.StImageProvider getImageProvider() {
		return org.be.textbe.st.textst.resource.st.ui.StImageProvider.INSTANCE;
	}
	
	public org.be.textbe.st.textst.resource.st.ui.StColorManager createColorManager() {
		return new org.be.textbe.st.textst.resource.st.ui.StColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.be.textbe.st.textst.resource.st.IStTextResource,
	 * org.be.textbe.st.textst.resource.st.ui.StColorManager) instead.
	 */
	public org.be.textbe.st.textst.resource.st.ui.StTokenScanner createTokenScanner(org.be.textbe.st.textst.resource.st.ui.StColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.be.textbe.st.textst.resource.st.ui.StTokenScanner createTokenScanner(org.be.textbe.st.textst.resource.st.IStTextResource resource, org.be.textbe.st.textst.resource.st.ui.StColorManager colorManager) {
		return new org.be.textbe.st.textst.resource.st.ui.StTokenScanner(resource, colorManager);
	}
	
	public org.be.textbe.st.textst.resource.st.ui.StCodeCompletionHelper createCodeCompletionHelper() {
		return new org.be.textbe.st.textst.resource.st.ui.StCodeCompletionHelper();
	}
	
}
