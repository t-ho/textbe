/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

/**
 * The StTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class StTokenResolverFactory implements org.be.textbe.st.textst.resource.st.IStTokenResolverFactory {
	
	private java.util.Map<String, org.be.textbe.st.textst.resource.st.IStTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.be.textbe.st.textst.resource.st.IStTokenResolver> featureName2CollectInTokenResolver;
	private static org.be.textbe.st.textst.resource.st.IStTokenResolver defaultResolver = new org.be.textbe.st.textst.resource.st.analysis.StDefaultTokenResolver();
	
	public StTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.be.textbe.st.textst.resource.st.IStTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.be.textbe.st.textst.resource.st.IStTokenResolver>();
		registerTokenResolver("OPERATOR", new org.be.textbe.st.textst.resource.st.analysis.StOPERATORTokenResolver());
		registerTokenResolver("VALIDITY", new org.be.textbe.st.textst.resource.st.analysis.StVALIDITYTokenResolver());
		registerTokenResolver("QUALIFIER", new org.be.textbe.st.textst.resource.st.analysis.StQUALIFIERTokenResolver());
		registerTokenResolver("MCI", new org.be.textbe.st.textst.resource.st.analysis.StMCITokenResolver());
		registerTokenResolver("COMPONENT", new org.be.textbe.st.textst.resource.st.analysis.StCOMPONENTTokenResolver());
		registerTokenResolver("REQUIREMENT", new org.be.textbe.st.textst.resource.st.analysis.StREQUIREMENTTokenResolver());
		registerTokenResolver("NUMBER", new org.be.textbe.st.textst.resource.st.analysis.StNUMBERTokenResolver());
		registerTokenResolver("UPPERBOUND", new org.be.textbe.st.textst.resource.st.analysis.StUPPERBOUNDTokenResolver());
		registerTokenResolver("TEXT2", new org.be.textbe.st.textst.resource.st.analysis.StTEXT2TokenResolver());
	}
	
	public org.be.textbe.st.textst.resource.st.IStTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.be.textbe.st.textst.resource.st.IStTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.be.textbe.st.textst.resource.st.IStTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.be.textbe.st.textst.resource.st.IStTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.be.textbe.st.textst.resource.st.IStTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.be.textbe.st.textst.resource.st.IStTokenResolver internalCreateResolver(java.util.Map<String, org.be.textbe.st.textst.resource.st.IStTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.be.textbe.st.textst.resource.st.IStTokenResolver> resolverMap, String key, org.be.textbe.st.textst.resource.st.IStTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
