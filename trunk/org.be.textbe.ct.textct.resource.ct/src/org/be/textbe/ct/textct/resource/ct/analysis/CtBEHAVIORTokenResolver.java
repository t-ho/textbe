/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.analysis;

public class CtBEHAVIORTokenResolver implements org.be.textbe.ct.textct.resource.ct.ICtTokenResolver {
	
	private org.be.textbe.ct.textct.resource.ct.analysis.CtDefaultTokenResolver defaultTokenResolver = new org.be.textbe.ct.textct.resource.ct.analysis.CtDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.be.textbe.ct.textct.resource.ct.ICtTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
