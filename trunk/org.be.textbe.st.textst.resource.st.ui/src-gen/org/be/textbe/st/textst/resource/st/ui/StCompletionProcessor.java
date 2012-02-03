/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.ui;

public class StCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.be.textbe.st.textst.resource.st.IStResourceProvider resourceProvider;
	private org.be.textbe.st.textst.resource.st.ui.IStBracketHandlerProvider bracketHandlerProvider;
	
	public StCompletionProcessor(org.be.textbe.st.textst.resource.st.IStResourceProvider resourceProvider, org.be.textbe.st.textst.resource.st.ui.IStBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		org.be.textbe.st.textst.resource.st.IStTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		org.be.textbe.st.textst.resource.st.ui.StCodeCompletionHelper helper = new org.be.textbe.st.textst.resource.st.ui.StCodeCompletionHelper();
		org.be.textbe.st.textst.resource.st.ui.StCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.be.textbe.st.textst.resource.st.ui.StProposalPostProcessor proposalPostProcessor = new org.be.textbe.st.textst.resource.st.ui.StProposalPostProcessor();
		java.util.List<org.be.textbe.st.textst.resource.st.ui.StCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.be.textbe.st.textst.resource.st.ui.StCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.be.textbe.st.textst.resource.st.ui.StCompletionProposal> finalProposalList = new java.util.ArrayList<org.be.textbe.st.textst.resource.st.ui.StCompletionProposal>();
		for (org.be.textbe.st.textst.resource.st.ui.StCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.be.textbe.st.textst.resource.st.ui.StCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			org.be.textbe.st.textst.resource.st.ui.IStBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
