/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct;

public interface ICtProblem {
	public String getMessage();
	public org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity getSeverity();
	public org.be.textbe.ct.textct.resource.ct.CtEProblemType getType();
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtQuickFix> getQuickFixes();
}
