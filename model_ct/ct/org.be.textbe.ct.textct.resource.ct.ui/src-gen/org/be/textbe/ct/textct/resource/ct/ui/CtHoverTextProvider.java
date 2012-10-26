/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.ui;

public class CtHoverTextProvider implements org.be.textbe.ct.textct.resource.ct.ICtHoverTextProvider {
	
	private org.be.textbe.ct.textct.resource.ct.ui.CtDefaultHoverTextProvider defaultProvider = new org.be.textbe.ct.textct.resource.ct.ui.CtDefaultHoverTextProvider();
	
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
