/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bttrace.resource.btt.ui;

public class BttAnnotationModelFactory implements org.eclipse.core.filebuffers.IAnnotationModelFactory {
	
	public org.eclipse.jface.text.source.IAnnotationModel createAnnotationModel(org.eclipse.core.runtime.IPath location) {
		org.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
		org.eclipse.core.resources.IWorkspaceRoot root = workspace.getRoot();
		org.eclipse.core.resources.IResource resource = root.findMember(location);
		return new org.be.textbe.bttrace.resource.btt.ui.BttAnnotationModel(resource);
	}
	
}
