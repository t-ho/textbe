/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class BtTokenResolveResult implements org.be.textbe.bt.textbt.resource.bt.IBtTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public BtTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
	
}
