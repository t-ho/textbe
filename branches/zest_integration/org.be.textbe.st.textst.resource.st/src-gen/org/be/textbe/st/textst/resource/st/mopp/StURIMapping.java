/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * A basic implementation of the org.be.textbe.st.textst.resource.st.IStURIMapping
 * interface that can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.be.textbe.st.textst.resource.st.IStURIMapping.
 */
public class StURIMapping<ReferenceType> implements org.be.textbe.st.textst.resource.st.IStURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public StURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
