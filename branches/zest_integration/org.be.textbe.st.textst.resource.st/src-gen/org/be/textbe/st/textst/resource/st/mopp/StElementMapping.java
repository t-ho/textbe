/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * A basic implementation of the
 * org.be.textbe.st.textst.resource.st.IStElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class StElementMapping<ReferenceType> implements org.be.textbe.st.textst.resource.st.IStElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public StElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
