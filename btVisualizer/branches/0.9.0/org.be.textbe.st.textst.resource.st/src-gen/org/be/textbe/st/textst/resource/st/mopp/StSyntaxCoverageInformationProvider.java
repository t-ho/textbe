/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.st.textst.resource.st.mopp;

public class StSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getTextST(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getStructureTree(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getParallelBlock(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getAlternativeBlock(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getRelatedToNode(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getDefinedByNode(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getNode(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getOptionList(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getOption(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getRequirementList(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getRequirement(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getComponentList(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getComponent(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getSystemComponent(),
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getSecondaryRelation(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.st.textst.TextstPackage.eINSTANCE.getTextST(),
		};
	}
	
}
