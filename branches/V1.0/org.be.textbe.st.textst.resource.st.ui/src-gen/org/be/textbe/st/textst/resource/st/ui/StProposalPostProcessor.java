/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class StProposalPostProcessor {
	
	public java.util.List<org.be.textbe.st.textst.resource.st.ui.StCompletionProposal> process(java.util.List<org.be.textbe.st.textst.resource.st.ui.StCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
