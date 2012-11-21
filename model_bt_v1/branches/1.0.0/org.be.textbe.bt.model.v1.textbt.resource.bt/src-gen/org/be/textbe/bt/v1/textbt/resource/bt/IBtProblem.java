/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt;

public interface IBtProblem {
	public String getMessage();
	public org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemSeverity getSeverity();
	public org.be.textbe.bt.v1.textbt.resource.bt.BtEProblemType getType();
	public java.util.Collection<org.be.textbe.bt.v1.textbt.resource.bt.IBtQuickFix> getQuickFixes();
}
