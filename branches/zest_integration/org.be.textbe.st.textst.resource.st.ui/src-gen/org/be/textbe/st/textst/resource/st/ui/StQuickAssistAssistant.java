/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.ui;

public class StQuickAssistAssistant extends org.eclipse.jface.text.quickassist.QuickAssistAssistant implements org.eclipse.jface.text.quickassist.IQuickAssistAssistant {
	
	public StQuickAssistAssistant(org.be.textbe.st.textst.resource.st.IStResourceProvider resourceProvider, org.be.textbe.st.textst.resource.st.ui.IStAnnotationModelProvider annotationModelProvider) {
		setQuickAssistProcessor(new org.be.textbe.st.textst.resource.st.ui.StQuickAssistProcessor(resourceProvider, annotationModelProvider));
		setInformationControlCreator(new org.eclipse.jface.text.AbstractReusableInformationControlCreator() {
			public org.eclipse.jface.text.IInformationControl doCreateInformationControl(org.eclipse.swt.widgets.Shell parent) {
				return new org.eclipse.jface.text.DefaultInformationControl(parent, (org.eclipse.jface.text.DefaultInformationControl.IInformationPresenter) null);
			}
		});
	}
	
	public boolean canAssist(org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(org.eclipse.jface.text.source.Annotation annotation) {
		return true;
	}
	
}
