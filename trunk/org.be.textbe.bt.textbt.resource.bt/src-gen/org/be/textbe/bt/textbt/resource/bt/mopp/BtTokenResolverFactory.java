/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

/**
 * The BtTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class BtTokenResolverFactory implements org.be.textbe.bt.textbt.resource.bt.IBtTokenResolverFactory {
	
	private java.util.Map<String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> featureName2CollectInTokenResolver;
	private static org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver defaultResolver = new org.be.textbe.bt.textbt.resource.bt.analysis.BtDefaultTokenResolver();
	
	public BtTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver>();
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
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver internalCreateResolver(java.util.Map<String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver> resolverMap, String key, org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
