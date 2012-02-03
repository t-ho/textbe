/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IStResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.be.textbe.st.textst.resource.st.IStResourcePostProcessor getResourcePostProcessor();
	
}
