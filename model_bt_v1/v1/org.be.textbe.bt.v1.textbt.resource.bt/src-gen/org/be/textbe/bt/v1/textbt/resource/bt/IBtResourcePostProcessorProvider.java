/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IBtResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.be.textbe.bt.v1.textbt.resource.bt.IBtResourcePostProcessor getResourcePostProcessor();
	
}
