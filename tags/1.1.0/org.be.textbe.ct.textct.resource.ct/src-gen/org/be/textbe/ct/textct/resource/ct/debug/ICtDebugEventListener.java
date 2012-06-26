/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.debug;

public interface ICtDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.be.textbe.ct.textct.resource.ct.debug.CtDebugMessage message);
}
