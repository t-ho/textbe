/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bttrace.resource.btt.ui;

public class BttCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.be.textbe.bttrace.resource.btt.IBttResourceProvider resourceProvider;
	private org.be.textbe.bttrace.resource.btt.ui.IBttBracketHandlerProvider bracketHandlerProvider;
	
	public BttCompletionProcessor(org.be.textbe.bttrace.resource.btt.IBttResourceProvider resourceProvider, org.be.textbe.bttrace.resource.btt.ui.IBttBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		org.be.textbe.bttrace.resource.btt.IBttTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		org.be.textbe.bttrace.resource.btt.ui.BttCodeCompletionHelper helper = new org.be.textbe.bttrace.resource.btt.ui.BttCodeCompletionHelper();
		org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.be.textbe.bttrace.resource.btt.ui.BttProposalPostProcessor proposalPostProcessor = new org.be.textbe.bttrace.resource.btt.ui.BttProposalPostProcessor();
		java.util.List<org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal> finalProposalList = new java.util.ArrayList<org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal>();
		for (org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal proposal : finalProposalList) {
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
			org.be.textbe.bttrace.resource.btt.ui.IBttBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
