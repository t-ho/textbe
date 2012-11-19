/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StProblem implements org.be.textbe.st.textst.resource.st.IStProblem {
	
	private String message;
	private org.be.textbe.st.textst.resource.st.StEProblemType type;
	private org.be.textbe.st.textst.resource.st.StEProblemSeverity severity;
	private java.util.Collection<org.be.textbe.st.textst.resource.st.IStQuickFix> quickFixes;
	
	public StProblem(String message, org.be.textbe.st.textst.resource.st.StEProblemType type, org.be.textbe.st.textst.resource.st.StEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.be.textbe.st.textst.resource.st.IStQuickFix>emptySet());
	}
	
	public StProblem(String message, org.be.textbe.st.textst.resource.st.StEProblemType type, org.be.textbe.st.textst.resource.st.StEProblemSeverity severity, org.be.textbe.st.textst.resource.st.IStQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public StProblem(String message, org.be.textbe.st.textst.resource.st.StEProblemType type, org.be.textbe.st.textst.resource.st.StEProblemSeverity severity, java.util.Collection<org.be.textbe.st.textst.resource.st.IStQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.be.textbe.st.textst.resource.st.IStQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.be.textbe.st.textst.resource.st.StEProblemType getType() {
		return type;
	}
	
	public org.be.textbe.st.textst.resource.st.StEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.be.textbe.st.textst.resource.st.IStQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
