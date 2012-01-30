/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.ct.textct.resource.ct.mopp;

public class CtSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getTextCT(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getCompositionTree(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAggregatedNode(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAssociatedNode(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getInheritedNode(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAggregatedBlock(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getAssociatedBlock(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getInheritedBlock(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getNode(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getOptionList(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getOption(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirementList(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getRequirement(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponentList(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getComponent(),
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getSystemComponent(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.ct.textct.TextctPackage.eINSTANCE.getTextCT(),
		};
	}
	
}
