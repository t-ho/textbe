/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

/**
 * A basic implementation of the
 * org.be.textbe.bt.textbt.resource.bt.IBtElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class BtElementMapping<ReferenceType> implements org.be.textbe.bt.textbt.resource.bt.IBtElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public BtElementMapping(String identifier, ReferenceType target, String warning) {
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
