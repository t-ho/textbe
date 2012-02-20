/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IBtParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtCommand<org.be.textbe.bt.textbt.resource.bt.IBtTextResource>> getPostParseCommands();
	
}
