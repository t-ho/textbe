/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * A basic implementation of the
 * org.be.textbe.ct.textct.resource.ct.ICtReferenceResolveResult interface that
 * collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class CtReferenceResolveResult<ReferenceType> implements org.be.textbe.ct.textct.resource.ct.ICtReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.be.textbe.ct.textct.resource.ct.ICtQuickFix> quickFixes;
	
	public CtReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.be.textbe.ct.textct.resource.ct.ICtQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.be.textbe.ct.textct.resource.ct.ICtQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.be.textbe.ct.textct.resource.ct.ICtQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.ICtReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.be.textbe.ct.textct.resource.ct.mopp.CtElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.ICtReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.be.textbe.ct.textct.resource.ct.mopp.CtURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
