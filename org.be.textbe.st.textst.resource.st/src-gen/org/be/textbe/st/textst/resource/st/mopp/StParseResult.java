/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StParseResult implements org.be.textbe.st.textst.resource.st.IStParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>> commands = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>>();
	
	public StParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
