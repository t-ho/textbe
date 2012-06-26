/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ICtResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.be.textbe.ct.textct.resource.ct.ICtResourcePostProcessor getResourcePostProcessor();
	
}
