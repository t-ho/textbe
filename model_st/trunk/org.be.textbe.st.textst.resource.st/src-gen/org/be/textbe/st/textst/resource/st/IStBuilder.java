/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st;

public interface IStBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.be.textbe.st.textst.resource.st.mopp.StResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
