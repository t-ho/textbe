/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtProblem implements org.be.textbe.bt.textbt.resource.bt.IBtProblem {
	
	private java.lang.String message;
	private org.be.textbe.bt.textbt.resource.bt.BtEProblemType type;
	
	public BtProblem(java.lang.String message, org.be.textbe.bt.textbt.resource.bt.BtEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.BtEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
