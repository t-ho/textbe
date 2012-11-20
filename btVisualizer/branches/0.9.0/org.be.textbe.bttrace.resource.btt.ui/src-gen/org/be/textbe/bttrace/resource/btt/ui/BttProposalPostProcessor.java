/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bttrace.resource.btt.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class BttProposalPostProcessor {
	
	public java.util.List<org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal> process(java.util.List<org.be.textbe.bttrace.resource.btt.ui.BttCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
