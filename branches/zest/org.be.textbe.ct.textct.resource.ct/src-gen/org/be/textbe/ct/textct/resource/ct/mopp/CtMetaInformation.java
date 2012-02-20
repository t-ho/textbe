/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtMetaInformation implements org.be.textbe.ct.textct.resource.ct.ICtMetaInformation {
	
	public String getSyntaxName() {
		return "ct";
	}
	
	public String getURI() {
		return "http://org.be.textbe/textct";
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTextScanner createLexer() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtAntlrScanner(new org.be.textbe.ct.textct.resource.ct.mopp.CtLexer());
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtParser().createInstance(inputStream, encoding);
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTextPrinter createPrinter(java.io.OutputStream outputStream, org.be.textbe.ct.textct.resource.ct.ICtTextResource resource) {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtReferenceResolverSwitch();
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTokenResolverFactory getTokenResolverFactory() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.be.textbe.ct.model/metamodel/textCT.cs";
	}
	
	public String[] getTokenNames() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtParser(null).getTokenNames();
	}
	
	public org.be.textbe.ct.textct.resource.ct.ICtTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtBracketPair> getBracketPairs() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtResourceFactory();
	}
	
	public org.be.textbe.ct.textct.resource.ct.mopp.CtNewFileContentProvider getNewFileContentProvider() {
		return new org.be.textbe.ct.textct.resource.ct.mopp.CtNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.be.textbe.ct.textct.resource.ct.mopp.CtResourceFactory());
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
		return "org.be.textbe.ct.textct.resource.ct.ui.launchConfigurationType";
	}
	
}
