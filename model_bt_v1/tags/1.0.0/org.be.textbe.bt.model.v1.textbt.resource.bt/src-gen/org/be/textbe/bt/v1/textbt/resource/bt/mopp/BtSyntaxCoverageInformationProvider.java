/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.be.textbe.bt.v1.textbt.resource.bt.mopp;

public class BtSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getSpecification(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getRequirement(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getComponent(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getSystemComponent(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getEvent(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getInternalInput(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getExternalInput(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getInternalOutput(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getExternalOutput(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getStateRealization(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getAttributeRealization(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getSelection(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getGuard(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getAssertion(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getWhat(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getWho(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getWhy(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getHow(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getWhere(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getWhen(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getAtomic(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getInterleaving(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getAlternative(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getParallel(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getNode(),
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getTraceabilityLink(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.be.textbe.bt.v1.textbt.TextbtPackage.eINSTANCE.getSpecification(),
		};
	}
	
}
