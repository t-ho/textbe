/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bttrace.resource.btt.ui;

public class BttQuickAssistProcessor implements org.eclipse.jface.text.quickassist.IQuickAssistProcessor {
	
	private org.be.textbe.bttrace.resource.btt.IBttResourceProvider resourceProvider;
	private org.be.textbe.bttrace.resource.btt.ui.IBttAnnotationModelProvider annotationModelProvider;
	
	public BttQuickAssistProcessor(org.be.textbe.bttrace.resource.btt.IBttResourceProvider resourceProvider, org.be.textbe.bttrace.resource.btt.ui.IBttAnnotationModelProvider annotationModelProvider) {
		super();
		this.resourceProvider = resourceProvider;
		this.annotationModelProvider = annotationModelProvider;
	}
	
	public boolean canAssist(org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(org.eclipse.jface.text.source.Annotation annotation) {
		java.util.Collection<org.be.textbe.bttrace.resource.btt.IBttQuickFix> quickFixes = getQuickFixes(annotation);
		return quickFixes.size() > 0;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeQuickAssistProposals(org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		org.eclipse.jface.text.source.ISourceViewer sourceViewer = invocationContext.getSourceViewer();
		int offset = -1;
		int length = 0;
		if (invocationContext instanceof org.eclipse.jface.text.source.TextInvocationContext) {
			org.eclipse.jface.text.source.TextInvocationContext textContext = (org.eclipse.jface.text.source.TextInvocationContext) invocationContext;
			offset = textContext.getOffset();
			length = textContext.getLength();
		}
		java.util.List<org.be.textbe.bttrace.resource.btt.IBttQuickFix> quickFixes = getQuickFixes(sourceViewer, offset, length);
		org.eclipse.jface.text.contentassist.ICompletionProposal[] proposals = new org.eclipse.jface.text.contentassist.ICompletionProposal[quickFixes.size()];
		for (int i = 0; i < proposals.length; i++) {
			proposals[i] = createCompletionProposal(sourceViewer, quickFixes.get(i));
		}
		return proposals;
	}
	
	private org.eclipse.jface.text.contentassist.ICompletionProposal createCompletionProposal(final org.eclipse.jface.text.source.ISourceViewer sourceViewer, final org.be.textbe.bttrace.resource.btt.IBttQuickFix quickFix) {
		return new org.eclipse.jface.text.contentassist.ICompletionProposal() {
			
			public org.eclipse.swt.graphics.Point getSelection(org.eclipse.jface.text.IDocument document) {
				return null;
			}
			
			public org.eclipse.swt.graphics.Image getImage() {
				return new org.be.textbe.bttrace.resource.btt.ui.BttUIMetaInformation().getImageProvider().getImage(quickFix.getImageKey());
			}
			
			public String getDisplayString() {
				return quickFix.getDisplayString();
			}
			
			public org.eclipse.jface.text.contentassist.IContextInformation getContextInformation() {
				return null;
			}
			
			public String getAdditionalProposalInfo() {
				return null;
			}
			
			public void apply(org.eclipse.jface.text.IDocument document) {
				String currentContent = sourceViewer.getDocument().get();
				String newContent = quickFix.apply(currentContent);
				if (newContent != null) {
					sourceViewer.getDocument().set(newContent);
				}
			}
		};
	}
	
	private java.util.List<org.be.textbe.bttrace.resource.btt.IBttQuickFix> getQuickFixes(org.eclipse.jface.text.source.ISourceViewer sourceViewer, int offset, int length) {
		java.util.List<org.be.textbe.bttrace.resource.btt.IBttQuickFix> foundFixes = new java.util.ArrayList<org.be.textbe.bttrace.resource.btt.IBttQuickFix>();
		org.eclipse.jface.text.source.IAnnotationModel model = annotationModelProvider.getAnnotationModel();
		
		if (model == null) {
			return foundFixes;
		}
		
		java.util.Iterator<?> iter = model.getAnnotationIterator();
		while (iter.hasNext()) {
			org.eclipse.jface.text.source.Annotation annotation = (org.eclipse.jface.text.source.Annotation) iter.next();
			org.eclipse.jface.text.Position position = model.getPosition(annotation);
			if (offset >= 0) {
				if (!position.overlapsWith(offset, length)) {
					continue;
				}
			}
			java.util.Collection<org.be.textbe.bttrace.resource.btt.IBttQuickFix> quickFixes = getQuickFixes(annotation);
			if (quickFixes != null) {
				foundFixes.addAll(quickFixes);
			}
		}
		return foundFixes;
	}
	
	private java.util.Collection<org.be.textbe.bttrace.resource.btt.IBttQuickFix> getQuickFixes(org.eclipse.jface.text.source.Annotation annotation) {
		
		java.util.Collection<org.be.textbe.bttrace.resource.btt.IBttQuickFix> foundQuickFixes = new java.util.ArrayList<org.be.textbe.bttrace.resource.btt.IBttQuickFix>();
		if (annotation.isMarkedDeleted()) {
			return foundQuickFixes;
		}
		
		if (annotation instanceof org.be.textbe.bttrace.resource.btt.ui.BttMarkerAnnotation) {
			org.be.textbe.bttrace.resource.btt.ui.BttMarkerAnnotation markerAnnotation = (org.be.textbe.bttrace.resource.btt.ui.BttMarkerAnnotation) annotation;
			org.eclipse.core.resources.IMarker marker = markerAnnotation.getMarker();
			foundQuickFixes.addAll(new org.be.textbe.bttrace.resource.btt.ui.BttMarkerResolutionGenerator().getQuickFixes(resourceProvider.getResource(), marker));
		}
		return foundQuickFixes;
	}
	
	public String getErrorMessage() {
		return null;
	}
	
}
