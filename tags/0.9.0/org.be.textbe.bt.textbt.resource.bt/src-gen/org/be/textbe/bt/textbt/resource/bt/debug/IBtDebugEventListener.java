/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.debug;

public interface IBtDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.be.textbe.bt.textbt.resource.bt.debug.BtDebugMessage message);
}
