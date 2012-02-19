/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtParseResult implements org.be.textbe.ct.textct.resource.ct.ICtParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>> commands = new java.util.ArrayList<org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>>();
	
	public CtParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
