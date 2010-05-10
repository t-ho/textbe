/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.analysis;

public class BtVALIDITYTokenResolver implements org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver {
	
	private org.be.textbe.bt.textbt.resource.bt.analysis.BtDefaultTokenResolver defaultTokenResolver = new org.be.textbe.bt.textbt.resource.bt.analysis.BtDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
