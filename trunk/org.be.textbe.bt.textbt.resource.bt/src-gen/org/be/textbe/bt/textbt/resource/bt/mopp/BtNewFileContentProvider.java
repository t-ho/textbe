package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtNewFileContentProvider {
	
	public org.be.textbe.bt.textbt.resource.bt.IBtMetaInformation getMetaInformation() {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getTextBT(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new org.be.textbe.bt.textbt.resource.bt.util.BtMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		org.be.textbe.bt.textbt.resource.bt.IBtTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			org.be.textbe.bt.textbt.resource.bt.mopp.BtPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public org.be.textbe.bt.textbt.resource.bt.IBtTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return new org.be.textbe.bt.textbt.resource.bt.mopp.BtPrinter(outputStream, new org.be.textbe.bt.textbt.resource.bt.mopp.BtResource());
	}
	
}
