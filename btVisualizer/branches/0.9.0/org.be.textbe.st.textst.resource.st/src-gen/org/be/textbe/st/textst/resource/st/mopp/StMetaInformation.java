/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StMetaInformation implements org.be.textbe.st.textst.resource.st.IStMetaInformation {
	
	public String getSyntaxName() {
		return "st";
	}
	
	public String getURI() {
		return "http://org.be.textbe/textst";
	}
	
	public org.be.textbe.st.textst.resource.st.IStTextScanner createLexer() {
		return new org.be.textbe.st.textst.resource.st.mopp.StAntlrScanner(new org.be.textbe.st.textst.resource.st.mopp.StLexer());
	}
	
	public org.be.textbe.st.textst.resource.st.IStTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.be.textbe.st.textst.resource.st.mopp.StParser().createInstance(inputStream, encoding);
	}
	
	public org.be.textbe.st.textst.resource.st.IStTextPrinter createPrinter(java.io.OutputStream outputStream, org.be.textbe.st.textst.resource.st.IStTextResource resource) {
		return new org.be.textbe.st.textst.resource.st.mopp.StPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.be.textbe.st.textst.resource.st.mopp.StSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.be.textbe.st.textst.resource.st.mopp.StSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.be.textbe.st.textst.resource.st.IStReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.be.textbe.st.textst.resource.st.mopp.StReferenceResolverSwitch();
	}
	
	public org.be.textbe.st.textst.resource.st.IStTokenResolverFactory getTokenResolverFactory() {
		return new org.be.textbe.st.textst.resource.st.mopp.StTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.be.textbe.ct.model/metamodel/textST.cs";
	}
	
	public String[] getTokenNames() {
		return new org.be.textbe.st.textst.resource.st.mopp.StParser(null).getTokenNames();
	}
	
	public org.be.textbe.st.textst.resource.st.IStTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.be.textbe.st.textst.resource.st.mopp.StTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStBracketPair> getBracketPairs() {
		return new org.be.textbe.st.textst.resource.st.mopp.StBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.be.textbe.st.textst.resource.st.mopp.StFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.be.textbe.st.textst.resource.st.mopp.StResourceFactory();
	}
	
	public org.be.textbe.st.textst.resource.st.mopp.StNewFileContentProvider getNewFileContentProvider() {
		return new org.be.textbe.st.textst.resource.st.mopp.StNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.be.textbe.st.textst.resource.st.mopp.StResourceFactory());
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
		return "org.be.textbe.st.textst.resource.st.ui.launchConfigurationType";
	}
	
}
