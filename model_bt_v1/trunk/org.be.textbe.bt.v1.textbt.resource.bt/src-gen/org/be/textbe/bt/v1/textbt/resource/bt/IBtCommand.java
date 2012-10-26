/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IBtCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
