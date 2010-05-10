/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt;

// A text parser parses a text into a tree of <code>EObject</code>s.
// It is associated with a <code>TextResource</code>.
public interface IBtTextParser extends org.be.textbe.bt.textbt.resource.bt.IBtConfigurable {
	
	// Parses the content given to the parser and create a tree
	// of EObjects. The root of this tree is wrapped together
	// with some commands that might be executed after parsing.
	//
	// @return the result of the parse process
	public org.be.textbe.bt.textbt.resource.bt.IBtParseResult parse();
	
	// Parses the document and returns a list of expected elements.
	// Each expected element covers a range in the input stream.
	//
	// If the parser implementation can not determine expected
	// elements null can be returned.
	// This method is used by the code completion to figure out
	// which proposals can be shown to users for a given cursor
	// position.
	//
	// The class 'type' is used as start symbol.
	public java.util.List<org.be.textbe.bt.textbt.resource.bt.mopp.BtExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.be.textbe.bt.textbt.resource.bt.IBtTextResource dummyResource);
	
	// Signals the parse to terminates the parsing as soon as possible.
	public void terminate();
}
