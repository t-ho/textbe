/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.ui;

/**
 * A hyperlink detector returns hyperlink if the token, where the mouse cursor
 * hovers, is a proxy.
 */
public class CtHyperlinkDetector implements org.eclipse.jface.text.hyperlink.IHyperlinkDetector {
	
	private org.be.textbe.ct.textct.resource.ct.ICtTextResource textResource;
	
	/**
	 * Creates a hyperlink detector.
	 * 
	 * @param resource the resource to use for calculating the locations.
	 */
	public CtHyperlinkDetector(org.eclipse.emf.ecore.resource.Resource resource) {
		textResource = (org.be.textbe.ct.textct.resource.ct.ICtTextResource) resource;
	}
	
	public org.eclipse.jface.text.hyperlink.IHyperlink[] detectHyperlinks(org.eclipse.jface.text.ITextViewer textViewer, org.eclipse.jface.text.IRegion region, boolean canShowMultipleHyperlinks) {
		org.be.textbe.ct.textct.resource.ct.ICtLocationMap locationMap = textResource.getLocationMap();
		java.util.List<org.eclipse.emf.ecore.EObject> elementsAtOffset = locationMap.getElementsAt(region.getOffset());
		org.eclipse.emf.ecore.EObject resolvedEObject = null;
		for (org.eclipse.emf.ecore.EObject eObject : elementsAtOffset) {
			if (eObject.eIsProxy()) {
				resolvedEObject = org.eclipse.emf.ecore.util.EcoreUtil.resolve(eObject, textResource);
				if (resolvedEObject == eObject) {
					continue;
				}
				int offset = locationMap.getCharStart(eObject);
				int length = locationMap.getCharEnd(eObject) - offset + 1;
				String text = null;
				try {
					text = textViewer.getDocument().get(offset, length);
				} catch (org.eclipse.jface.text.BadLocationException e) {
				}
				org.eclipse.jface.text.hyperlink.IHyperlink hyperlink = new org.be.textbe.ct.textct.resource.ct.ui.CtHyperlink(new org.eclipse.jface.text.Region(offset, length), resolvedEObject, text);
				return new org.eclipse.jface.text.hyperlink.IHyperlink[] { hyperlink };
			}
		}
		return null;
	}
	
}
