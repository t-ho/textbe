/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtTokenResolverFactory implements org.be.textbe.bt.textbt.resource.bt.IBtTokenResolverFactory {
	
	private java.util.Map<java.lang.String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> featureName2CollectInTokenResolver;
	private static org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver defaultResolver = new org.be.textbe.bt.textbt.resource.bt.analysis.BtDefaultTokenResolver();
	
	public BtTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver>();
		registerTokenResolver("PERCENT", new org.be.textbe.bt.textbt.resource.bt.analysis.BtPERCENTTokenResolver());
		registerTokenResolver("DOUBLEMINUS", new org.be.textbe.bt.textbt.resource.bt.analysis.BtDOUBLEMINUSTokenResolver());
		registerTokenResolver("EQUALS", new org.be.textbe.bt.textbt.resource.bt.analysis.BtEQUALSTokenResolver());
		registerTokenResolver("VALIDITY", new org.be.textbe.bt.textbt.resource.bt.analysis.BtVALIDITYTokenResolver());
		registerTokenResolver("MCI", new org.be.textbe.bt.textbt.resource.bt.analysis.BtMCITokenResolver());
		registerTokenResolver("COMPONENT", new org.be.textbe.bt.textbt.resource.bt.analysis.BtCOMPONENTTokenResolver());
		registerTokenResolver("REQUIREMENT", new org.be.textbe.bt.textbt.resource.bt.analysis.BtREQUIREMENTTokenResolver());
		registerTokenResolver("OPERATORWITHLABEL", new org.be.textbe.bt.textbt.resource.bt.analysis.BtOPERATORWITHLABELTokenResolver());
		registerTokenResolver("STATE", new org.be.textbe.bt.textbt.resource.bt.analysis.BtSTATETokenResolver());
		registerTokenResolver("OPERATOR", new org.be.textbe.bt.textbt.resource.bt.analysis.BtOPERATORTokenResolver());
		registerTokenResolver("QUALIFIER", new org.be.textbe.bt.textbt.resource.bt.analysis.BtQUALIFIERTokenResolver());
		registerTokenResolver("LEVEL", new org.be.textbe.bt.textbt.resource.bt.analysis.BtLEVELTokenResolver());
		registerTokenResolver("COMPONENTNAME", new org.be.textbe.bt.textbt.resource.bt.analysis.BtCOMPONENTNAMETokenResolver());
		registerTokenResolver("BEHAVIOR", new org.be.textbe.bt.textbt.resource.bt.analysis.BtBEHAVIORTokenResolver());
		registerTokenResolver("TEXT", new org.be.textbe.bt.textbt.resource.bt.analysis.BtTEXTTokenResolver());
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver internalCreateResolver(java.util.Map<java.lang.String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> resolverMap, java.lang.String key, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
