/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IStCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
