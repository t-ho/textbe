/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.analysis;

public class BtPERCENTTokenResolver implements org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver {
	
	private org.be.textbe.bt.textbt.resource.bt.analysis.BtDefaultTokenResolver defaultTokenResolver = new org.be.textbe.bt.textbt.resource.bt.analysis.BtDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
