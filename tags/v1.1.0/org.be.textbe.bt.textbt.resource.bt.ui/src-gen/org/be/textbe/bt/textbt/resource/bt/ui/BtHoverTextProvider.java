/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.ui;

public class BtHoverTextProvider implements org.be.textbe.bt.textbt.resource.bt.IBtHoverTextProvider {
	
	private org.be.textbe.bt.textbt.resource.bt.ui.BtDefaultHoverTextProvider defaultProvider = new org.be.textbe.bt.textbt.resource.bt.ui.BtDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
