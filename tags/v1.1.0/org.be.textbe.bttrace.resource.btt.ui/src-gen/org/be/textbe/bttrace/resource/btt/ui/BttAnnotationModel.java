/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bttrace.resource.btt.ui;

public class BttAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public BttAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new org.be.textbe.bttrace.resource.btt.ui.BttMarkerAnnotation(marker);
	}
	
}
