/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.ui;

/**
 * This class provides the configuration for the generated editor. It registers
 * content assistance and syntax highlighting.
 */
public class BtEditorConfiguration extends org.eclipse.jface.text.source.SourceViewerConfiguration {
	
	private org.be.textbe.bt.v1.textbt.resource.bt.ui.BtColorManager colorManager;
	private org.be.textbe.bt.v1.textbt.resource.bt.IBtResourceProvider resourceProvider;
	private org.be.textbe.bt.v1.textbt.resource.bt.ui.IBtAnnotationModelProvider annotationModelProvider;
	private org.be.textbe.bt.v1.textbt.resource.bt.ui.IBtBracketHandlerProvider bracketHandlerProvider;
	private org.be.textbe.bt.v1.textbt.resource.bt.ui.BtQuickAssistAssistant quickAssistAssistant;
	
	/**
	 * Creates a new editor configuration.
	 * 
	 * @param resourceProvider the provider for the resource (usually this is the
	 * editor)
	 * @param colorManager the color manager to use
	 */
	public BtEditorConfiguration(org.be.textbe.bt.v1.textbt.resource.bt.IBtResourceProvider resourceProvider, org.be.textbe.bt.v1.textbt.resource.bt.ui.IBtAnnotationModelProvider annotationModelProvider, org.be.textbe.bt.v1.textbt.resource.bt.ui.IBtBracketHandlerProvider bracketHandlerProvider, org.be.textbe.bt.v1.textbt.resource.bt.ui.BtColorManager colorManager) {
		this.resourceProvider = resourceProvider;
		this.annotationModelProvider = annotationModelProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
		this.colorManager = colorManager;
	}
	
	public org.eclipse.jface.text.contentassist.IContentAssistant getContentAssistant(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.contentassist.ContentAssistant assistant = new org.eclipse.jface.text.contentassist.ContentAssistant();
		assistant.setContentAssistProcessor(new org.be.textbe.bt.v1.textbt.resource.bt.ui.BtCompletionProcessor(resourceProvider, bracketHandlerProvider), org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.CONTEXT_INFO_ABOVE);
		
		return assistant;
	}
	
	public String[] getConfiguredContentTypes(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new String[] {
			org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE,
		};
	}
	
	protected org.eclipse.jface.text.rules.ITokenScanner getScanner() {
		return new org.be.textbe.bt.v1.textbt.resource.bt.ui.BtTokenScanner(resourceProvider.getResource(), colorManager);
	}
	
	public org.eclipse.jface.text.presentation.IPresentationReconciler getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.presentation.PresentationReconciler reconciler = new org.eclipse.jface.text.presentation.PresentationReconciler();
		org.eclipse.jface.text.rules.DefaultDamagerRepairer repairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		
		return reconciler;
	}
	
	public org.eclipse.jface.text.source.IAnnotationHover getAnnotationHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new org.eclipse.jface.text.source.DefaultAnnotationHover();
	}
	
	public org.eclipse.jface.text.ITextHover getTextHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer, String contentType) {
		return new org.be.textbe.bt.v1.textbt.resource.bt.ui.BtTextHover(resourceProvider);
	}
	
	public org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] getHyperlinkDetectors(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		if (sourceViewer == null) {
			return null;
		}
		return new org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] { new org.be.textbe.bt.v1.textbt.resource.bt.ui.BtHyperlinkDetector(resourceProvider.getResource()) };
	}
	
	public org.eclipse.jface.text.quickassist.IQuickAssistAssistant getQuickAssistAssistant(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		if (quickAssistAssistant == null) {
			quickAssistAssistant = new org.be.textbe.bt.v1.textbt.resource.bt.ui.BtQuickAssistAssistant(resourceProvider, annotationModelProvider);
		}
		return quickAssistAssistant;
	}
	
}
