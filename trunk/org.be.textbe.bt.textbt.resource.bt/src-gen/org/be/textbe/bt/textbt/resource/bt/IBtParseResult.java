/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt;

// An interface used to access the result of parsing a
// document.
public interface IBtParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtCommand<org.be.textbe.bt.textbt.resource.bt.IBtTextResource>> getPostParseCommands();
}
