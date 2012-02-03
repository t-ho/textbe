/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.debug;

public abstract class BtDebugElement extends org.eclipse.debug.core.model.DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public BtDebugElement(org.eclipse.debug.core.model.IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return org.be.textbe.bt.textbt.resource.bt.mopp.BtPlugin.DEBUG_MODEL_ID;
	}
	
	/**
	 * Returns the breakpoint manager.
	 * 
	 * @return the breakpoint manager
	 */
	protected org.eclipse.debug.core.IBreakpointManager getBreakpointManager() {
		return org.eclipse.debug.core.DebugPlugin.getDefault().getBreakpointManager();
	}
	
}
