/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IStParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStCommand<org.be.textbe.st.textst.resource.st.IStTextResource>> getPostParseCommands();
	
}
