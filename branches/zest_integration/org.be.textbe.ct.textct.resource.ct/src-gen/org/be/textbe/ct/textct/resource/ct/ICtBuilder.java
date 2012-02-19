/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct;

public interface ICtBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.be.textbe.ct.textct.resource.ct.mopp.CtResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
