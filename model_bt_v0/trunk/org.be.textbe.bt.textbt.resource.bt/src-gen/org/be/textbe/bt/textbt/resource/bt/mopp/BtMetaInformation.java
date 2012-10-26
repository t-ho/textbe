/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtMetaInformation implements org.be.textbe.bt.textbt.resource.bt.IBtMetaInformation {
	
	public String getSyntaxName() {
		return "bt";
	}
	
	public String getURI() {
		return "http://org.be.textbe/textbt";
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextScanner createLexer() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtAntlrScanner(new org.be.textbe.bt.textbt.resource.bt.mopp.BtLexer());
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtParser().createInstance(inputStream, encoding);
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextPrinter createPrinter(java.io.OutputStream outputStream, org.be.textbe.bt.textbt.resource.bt.IBtTextResource resource) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtPrinter2(outputStream, resource);
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
	
	public String getPathToCSDefinition() {
		return "org.be.textbe.bt.model/metamodel/textbt.cs";
	}
	
	public String[] getTokenNames() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtParser(null).getTokenNames();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtBracketPair> getBracketPairs() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtResourceFactory();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.mopp.BtNewFileContentProvider getNewFileContentProvider() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.be.textbe.bt.textbt.resource.bt.mopp.BtResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.be.textbe.bt.textbt.resource.bt.ui.launchConfigurationType";
	}
	
}
