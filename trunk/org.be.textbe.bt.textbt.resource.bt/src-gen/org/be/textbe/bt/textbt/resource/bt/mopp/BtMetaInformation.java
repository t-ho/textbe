/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtMetaInformation implements org.be.textbe.bt.textbt.resource.bt.IBtMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "bt";
	}
	
	public java.lang.String getURI() {
		return "http://org.be.textbe/textbt";
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextScanner createLexer() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtAntlrScanner(new org.be.textbe.bt.textbt.resource.bt.mopp.BtLexer());
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtParser().createInstance(inputStream, encoding);
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextPrinter createPrinter(java.io.OutputStream outputStream, org.be.textbe.bt.textbt.resource.bt.IBtTextResource resource) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtReferenceResolverSwitch();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenResolverFactory getTokenResolverFactory() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.be.textbe.bt.model/metamodel/textbt.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtParser(null).getTokenNames();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtBracketPair> getBracketPairs() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtHoverTextProvider getHoverTextProvider() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtHoverTextProvider();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager createColorManager() {
		return new org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(org.be.textbe.bt.textbt.resource.bt.ui.BtColorManager colorManager) {
		return new org.be.textbe.bt.textbt.resource.bt.ui.BtTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtResourceFactory();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.mopp.BtNewFileContentProvider getNewFileContentProvider() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtNewFileContentProvider();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.mopp.BtCodeCompletionHelper createCodeCompletionHelper() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtCodeCompletionHelper();
	}
	
}
