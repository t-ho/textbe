/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface IBtTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenResolver createCollectInTokenResolver(String featureName);
}
