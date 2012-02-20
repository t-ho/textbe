/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtParseResult implements org.be.textbe.bt.textbt.resource.bt.IBtParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtCommand<org.be.textbe.bt.textbt.resource.bt.IBtTextResource>> commands = new java.util.ArrayList<org.be.textbe.bt.textbt.resource.bt.IBtCommand<org.be.textbe.bt.textbt.resource.bt.IBtTextResource>>();
	
	public BtParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtCommand<org.be.textbe.bt.textbt.resource.bt.IBtTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
