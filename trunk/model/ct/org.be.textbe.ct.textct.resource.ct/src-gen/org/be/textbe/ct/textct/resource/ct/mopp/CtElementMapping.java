/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * A basic implementation of the
 * org.be.textbe.ct.textct.resource.ct.ICtElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class CtElementMapping<ReferenceType> implements org.be.textbe.ct.textct.resource.ct.ICtElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public CtElementMapping(String identifier, ReferenceType target, String warning) {
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
