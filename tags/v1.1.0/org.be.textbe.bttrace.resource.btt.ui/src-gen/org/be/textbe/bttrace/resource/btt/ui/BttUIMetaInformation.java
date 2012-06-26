/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bttrace.resource.btt.ui;

public class BttUIMetaInformation extends org.be.textbe.bttrace.resource.btt.mopp.BttMetaInformation {
	
	public org.be.textbe.bttrace.resource.btt.IBttHoverTextProvider getHoverTextProvider() {
		return new org.be.textbe.bttrace.resource.btt.ui.BttHoverTextProvider();
	}
	
	public org.be.textbe.bttrace.resource.btt.ui.BttImageProvider getImageProvider() {
		return org.be.textbe.bttrace.resource.btt.ui.BttImageProvider.INSTANCE;
	}
	
	public org.be.textbe.bttrace.resource.btt.ui.BttColorManager createColorManager() {
		return new org.be.textbe.bttrace.resource.btt.ui.BttColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.be.textbe.bttrace.resource.btt.IBttTextResource,
	 * org.be.textbe.bttrace.resource.btt.ui.BttColorManager) instead.
	 */
	public org.be.textbe.bttrace.resource.btt.ui.BttTokenScanner createTokenScanner(org.be.textbe.bttrace.resource.btt.ui.BttColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.be.textbe.bttrace.resource.btt.ui.BttTokenScanner createTokenScanner(org.be.textbe.bttrace.resource.btt.IBttTextResource resource, org.be.textbe.bttrace.resource.btt.ui.BttColorManager colorManager) {
		return new org.be.textbe.bttrace.resource.btt.ui.BttTokenScanner(resource, colorManager);
	}
	
	public org.be.textbe.bttrace.resource.btt.ui.BttCodeCompletionHelper createCodeCompletionHelper() {
		return new org.be.textbe.bttrace.resource.btt.ui.BttCodeCompletionHelper();
	}
	
}
