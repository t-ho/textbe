/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ICtCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
