/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ICtParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtCommand<org.be.textbe.ct.textct.resource.ct.ICtTextResource>> getPostParseCommands();
	
}
