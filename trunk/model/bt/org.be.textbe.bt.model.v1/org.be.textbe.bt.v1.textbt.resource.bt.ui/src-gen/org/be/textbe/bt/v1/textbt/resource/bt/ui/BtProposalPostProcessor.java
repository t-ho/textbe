/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class BtProposalPostProcessor {
	
	public java.util.List<org.be.textbe.bt.v1.textbt.resource.bt.ui.BtCompletionProposal> process(java.util.List<org.be.textbe.bt.v1.textbt.resource.bt.ui.BtCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
