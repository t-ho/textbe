/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class CtProposalPostProcessor {
	
	public java.util.List<org.be.textbe.ct.textct.resource.ct.ui.CtCompletionProposal> process(java.util.List<org.be.textbe.ct.textct.resource.ct.ui.CtCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
