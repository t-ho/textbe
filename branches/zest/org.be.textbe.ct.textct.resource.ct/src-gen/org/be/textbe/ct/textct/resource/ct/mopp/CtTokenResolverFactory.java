/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

/**
 * The CtTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class CtTokenResolverFactory implements org.be.textbe.ct.textct.resource.ct.ICtTokenResolverFactory {
	
	private java.util.Map<String, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver> featureName2CollectInTokenResolver;
	private static org.be.textbe.ct.textct.resource.ct.ICtTokenResolver defaultResolver = new org.be.textbe.ct.textct.resource.ct.analysis.CtDefaultTokenResolver();
	
	public CtTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver>();
		registerTokenResolver("COMPONENT", new org.be.textbe.ct.textct.resource.ct.analysis.CtCOMPONENTTokenResolver());
		registerTokenResolver("REQUIREMENT", new org.be.textbe.ct.textct.resource.ct.analysis.CtREQUIREMENTTokenResolver());
		registerTokenResolver("COMPONENTNAME", new org.be.textbe.ct.textct.resource.ct.analysis.CtCOMPONENTNAMETokenResolver());
		registerTokenResolver("BEHAVIOR", new org.be.textbe.ct.textct.resource.ct.analysis.CtBEHAVIORTokenResolver());
		registerTokenResolver("TEXT", new org.be.textbe.ct.textct.resource.ct.analysis.CtTEXTTokenResolver());
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.be.textbe.ct.textct.resource.ct.ICtTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.be.textbe.ct.textct.resource.ct.ICtTokenResolver internalCreateResolver(java.util.Map<String, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver> resolverMap, String key, org.be.textbe.ct.textct.resource.ct.ICtTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
