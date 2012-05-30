/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt;

public interface IBtBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.be.textbe.bt.textbt.resource.bt.mopp.BtResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
