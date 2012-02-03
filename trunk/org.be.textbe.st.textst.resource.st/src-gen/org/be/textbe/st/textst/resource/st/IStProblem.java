/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st;

public interface IStProblem {
	public String getMessage();
	public org.be.textbe.st.textst.resource.st.StEProblemSeverity getSeverity();
	public org.be.textbe.st.textst.resource.st.StEProblemType getType();
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStQuickFix> getQuickFixes();
}
