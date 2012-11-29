/**
 */
package org.be.textbe.bt.textbt.branch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.branch.BranchPackage
 * @generated
 */
public interface BranchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BranchFactory eINSTANCE = org.be.textbe.bt.textbt.branch.impl.BranchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fork Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Branch</em>'.
	 * @generated
	 */
	ForkBranch createForkBranch();

	/**
	 * Returns a new object of class '<em>Random Choice Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Choice Branch</em>'.
	 * @generated
	 */
	RandomChoiceBranch createRandomChoiceBranch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BranchPackage getBranchPackage();

} //BranchFactory
