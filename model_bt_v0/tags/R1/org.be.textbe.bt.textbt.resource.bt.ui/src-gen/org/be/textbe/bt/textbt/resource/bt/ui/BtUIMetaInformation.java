/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.ui;

public class BtUIMetaInformation extends org.be.textbe.bt.textbt.resource.bt.mopp.BtMetaInformation {
	
	public org.be.textbe.bt.textbt.resource.bt.IBtHoverTextProvider getHoverTextProvider() {
		return new org.be.textbe.bt.textbt.resource.bt.ui.BtHoverTextProvider();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.ui.BtImageProvider getImageProvider() {
		return org.be.textbe.bt.textbt.resource.bt.ui.BtImageProvider.INSTANCE;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager createColorManager() {
		return new org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.be.textbe.bt.textbt.resource.bt.IBtTextResource,
	 * org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager) instead.
	 */
	public org.be.textbe.bt.textbt.resource.bt.ui.BtTokenScanner createTokenScanner(org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.be.textbe.bt.textbt.resource.bt.ui.BtTokenScanner createTokenScanner(org.be.textbe.bt.textbt.resource.bt.IBtTextResource resource, org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager colorManager) {
		return new org.be.textbe.bt.textbt.resource.bt.ui.BtTokenScanner(resource, colorManager);
	}
	
	public org.be.textbe.bt.textbt.resource.bt.ui.BtCodeCompletionHelper createCodeCompletionHelper() {
		return new org.be.textbe.bt.textbt.resource.bt.ui.BtCodeCompletionHelper();
	}
	
}
