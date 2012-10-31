/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtProblem implements org.be.textbe.bt.textbt.resource.bt.IBtProblem {
	
	private String message;
	private org.be.textbe.bt.textbt.resource.bt.BtEProblemType type;
	private org.be.textbe.bt.textbt.resource.bt.BtEProblemSeverity severity;
	private java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtQuickFix> quickFixes;
	
	public BtProblem(String message, org.be.textbe.bt.textbt.resource.bt.BtEProblemType type, org.be.textbe.bt.textbt.resource.bt.BtEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.be.textbe.bt.textbt.resource.bt.IBtQuickFix>emptySet());
	}
	
	public BtProblem(String message, org.be.textbe.bt.textbt.resource.bt.BtEProblemType type, org.be.textbe.bt.textbt.resource.bt.BtEProblemSeverity severity, org.be.textbe.bt.textbt.resource.bt.IBtQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public BtProblem(String message, org.be.textbe.bt.textbt.resource.bt.BtEProblemType type, org.be.textbe.bt.textbt.resource.bt.BtEProblemSeverity severity, java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.be.textbe.bt.textbt.resource.bt.IBtQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.be.textbe.bt.textbt.resource.bt.BtEProblemType getType() {
		return type;
	}
	
	public org.be.textbe.bt.textbt.resource.bt.BtEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.be.textbe.bt.textbt.resource.bt.IBtQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
