/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.textbt.resource.bt.mopp;

public class BtSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getTextBT(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getBehaviorTree(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getAtomicNode(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getSequentialNode(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getParallelBlock(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getAlternativeBlock(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getNode(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getOptionList(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getOption(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getRequirementList(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getRequirement(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getComponentList(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getComponent(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getSystemComponent(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getState(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getSelection(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getEvent(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getGuard(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getInternalInput(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getInternalOutput(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getExternalInput(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getExternalOutput(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getAssertion(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getRelation(),
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getRelationalBehavior(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.bt.textbt.TextbtPackage.eINSTANCE.getTextBT(),
		};
	}
	
}
