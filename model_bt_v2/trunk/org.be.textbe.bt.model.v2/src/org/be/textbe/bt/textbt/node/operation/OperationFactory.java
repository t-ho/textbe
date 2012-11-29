/**
 */
package org.be.textbe.bt.textbt.node.operation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.node.operation.OperationPackage
 * @generated
 */
public interface OperationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationFactory eINSTANCE = org.be.textbe.bt.textbt.node.operation.impl.OperationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Reversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reversion</em>'.
	 * @generated
	 */
	Reversion createReversion();

	/**
	 * Returns a new object of class '<em>Branch Kill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Kill</em>'.
	 * @generated
	 */
	BranchKill createBranchKill();

	/**
	 * Returns a new object of class '<em>Synchronisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronisation</em>'.
	 * @generated
	 */
	Synchronisation createSynchronisation();

	/**
	 * Returns a new object of class '<em>May</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>May</em>'.
	 * @generated
	 */
	May createMay();

	/**
	 * Returns a new object of class '<em>Start New</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start New</em>'.
	 * @generated
	 */
	StartNew createStartNew();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationPackage getOperationPackage();

} //OperationFactory
