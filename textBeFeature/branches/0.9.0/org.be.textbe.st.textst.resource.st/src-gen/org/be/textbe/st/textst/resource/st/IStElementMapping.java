/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st;

/**
 * A mapping from an identifier to an EObject.
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IStElementMapping<ReferenceType> extends org.be.textbe.st.textst.resource.st.IStReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
