/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * A basic implementation of the
 * org.be.textbe.st.textst.resource.st.IStReferenceResolveResult interface that
 * collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class StReferenceResolveResult<ReferenceType> implements org.be.textbe.st.textst.resource.st.IStReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.be.textbe.st.textst.resource.st.IStReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.be.textbe.st.textst.resource.st.IStQuickFix> quickFixes;
	
	public StReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.be.textbe.st.textst.resource.st.IStQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.be.textbe.st.textst.resource.st.IStQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.be.textbe.st.textst.resource.st.IStQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.IStReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.be.textbe.st.textst.resource.st.mopp.StElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.IStReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.be.textbe.st.textst.resource.st.mopp.StURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
