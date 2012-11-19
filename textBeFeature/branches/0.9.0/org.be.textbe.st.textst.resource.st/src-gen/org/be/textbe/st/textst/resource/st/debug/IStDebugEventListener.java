/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.debug;

public interface IStDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.be.textbe.st.textst.resource.st.debug.StDebugMessage message);
}
