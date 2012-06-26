/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtProblem implements org.be.textbe.ct.textct.resource.ct.ICtProblem {
	
	private String message;
	private org.be.textbe.ct.textct.resource.ct.CtEProblemType type;
	private org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity severity;
	private java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtQuickFix> quickFixes;
	
	public CtProblem(String message, org.be.textbe.ct.textct.resource.ct.CtEProblemType type, org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.be.textbe.ct.textct.resource.ct.ICtQuickFix>emptySet());
	}
	
	public CtProblem(String message, org.be.textbe.ct.textct.resource.ct.CtEProblemType type, org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity severity, org.be.textbe.ct.textct.resource.ct.ICtQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public CtProblem(String message, org.be.textbe.ct.textct.resource.ct.CtEProblemType type, org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity severity, java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.be.textbe.ct.textct.resource.ct.ICtQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.be.textbe.ct.textct.resource.ct.CtEProblemType getType() {
		return type;
	}
	
	public org.be.textbe.ct.textct.resource.ct.CtEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.be.textbe.ct.textct.resource.ct.ICtQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
