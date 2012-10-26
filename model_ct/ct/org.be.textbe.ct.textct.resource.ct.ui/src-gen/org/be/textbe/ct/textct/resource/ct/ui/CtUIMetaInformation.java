/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.ui;

public class CtUIMetaInformation extends org.be.textbe.ct.textct.resource.ct.mopp.CtMetaInformation {
	
	public org.be.textbe.ct.textct.resource.ct.ICtHoverTextProvider getHoverTextProvider() {
		return new org.be.textbe.ct.textct.resource.ct.ui.CtHoverTextProvider();
	}
	
	public org.be.textbe.ct.textct.resource.ct.ui.CtImageProvider getImageProvider() {
		return org.be.textbe.ct.textct.resource.ct.ui.CtImageProvider.INSTANCE;
	}
	
	public org.be.textbe.ct.textct.resource.ct.ui.CtColorManager createColorManager() {
		return new org.be.textbe.ct.textct.resource.ct.ui.CtColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.be.textbe.ct.textct.resource.ct.ICtTextResource,
	 * org.be.textbe.ct.textct.resource.ct.ui.CtColorManager) instead.
	 */
	public org.be.textbe.ct.textct.resource.ct.ui.CtTokenScanner createTokenScanner(org.be.textbe.ct.textct.resource.ct.ui.CtColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.be.textbe.ct.textct.resource.ct.ui.CtTokenScanner createTokenScanner(org.be.textbe.ct.textct.resource.ct.ICtTextResource resource, org.be.textbe.ct.textct.resource.ct.ui.CtColorManager colorManager) {
		return new org.be.textbe.ct.textct.resource.ct.ui.CtTokenScanner(resource, colorManager);
	}
	
	public org.be.textbe.ct.textct.resource.ct.ui.CtCodeCompletionHelper createCodeCompletionHelper() {
		return new org.be.textbe.ct.textct.resource.ct.ui.CtCodeCompletionHelper();
	}
	
}
