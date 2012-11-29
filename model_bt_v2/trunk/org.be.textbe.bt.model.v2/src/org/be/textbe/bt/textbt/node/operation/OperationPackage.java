/**
 */
package org.be.textbe.bt.textbt.node.operation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.node.operation.OperationFactory
 * @model kind="package"
 * @generated
 */
public interface OperationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/node/operation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationPackage eINSTANCE = org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.operation.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationImpl
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.operation.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.operation.impl.ReferenceImpl
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Continue Like</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CONTINUE_LIKE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.operation.impl.ReversionImpl <em>Reversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.operation.impl.ReversionImpl
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getReversion()
	 * @generated
	 */
	int REVERSION = 2;

	/**
	 * The feature id for the '<em><b>Revert To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSION__REVERT_TO = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.operation.impl.BranchKillImpl <em>Branch Kill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.operation.impl.BranchKillImpl
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getBranchKill()
	 * @generated
	 */
	int BRANCH_KILL = 3;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_KILL__STOP = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch Kill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_KILL_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.operation.impl.SynchronisationImpl <em>Synchronisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.operation.impl.SynchronisationImpl
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getSynchronisation()
	 * @generated
	 */
	int SYNCHRONISATION = 4;

	/**
	 * The feature id for the '<em><b>Wait For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION__WAIT_FOR = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Synchronisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.operation.impl.MayImpl <em>May</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.operation.impl.MayImpl
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getMay()
	 * @generated
	 */
	int MAY = 5;

	/**
	 * The number of structural features of the '<em>May</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.operation.impl.StartNewImpl <em>Start New</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.operation.impl.StartNewImpl
	 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getStartNew()
	 * @generated
	 */
	int START_NEW = 6;

	/**
	 * The feature id for the '<em><b>Start New</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NEW__START_NEW = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start New</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NEW_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.operation.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.operation.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.node.operation.Reference#getContinueLike <em>Continue Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continue Like</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.Reference#getContinueLike()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ContinueLike();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.operation.Reversion <em>Reversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reversion</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.Reversion
	 * @generated
	 */
	EClass getReversion();

	/**
	 * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.node.operation.Reversion#getRevertTo <em>Revert To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Revert To</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.Reversion#getRevertTo()
	 * @see #getReversion()
	 * @generated
	 */
	EReference getReversion_RevertTo();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.operation.BranchKill <em>Branch Kill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Kill</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.BranchKill
	 * @generated
	 */
	EClass getBranchKill();

	/**
	 * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.node.operation.BranchKill#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.BranchKill#getStop()
	 * @see #getBranchKill()
	 * @generated
	 */
	EReference getBranchKill_Stop();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.operation.Synchronisation <em>Synchronisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronisation</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.Synchronisation
	 * @generated
	 */
	EClass getSynchronisation();

	/**
	 * Returns the meta object for the reference list '{@link org.be.textbe.bt.textbt.node.operation.Synchronisation#getWaitFor <em>Wait For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wait For</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.Synchronisation#getWaitFor()
	 * @see #getSynchronisation()
	 * @generated
	 */
	EReference getSynchronisation_WaitFor();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.operation.May <em>May</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>May</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.May
	 * @generated
	 */
	EClass getMay();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.operation.StartNew <em>Start New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start New</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.StartNew
	 * @generated
	 */
	EClass getStartNew();

	/**
	 * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.node.operation.StartNew#getStartNew <em>Start New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start New</em>'.
	 * @see org.be.textbe.bt.textbt.node.operation.StartNew#getStartNew()
	 * @see #getStartNew()
	 * @generated
	 */
	EReference getStartNew_StartNew();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationFactory getOperationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.operation.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationImpl
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.operation.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.operation.impl.ReferenceImpl
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Continue Like</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__CONTINUE_LIKE = eINSTANCE.getReference_ContinueLike();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.operation.impl.ReversionImpl <em>Reversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.operation.impl.ReversionImpl
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getReversion()
		 * @generated
		 */
		EClass REVERSION = eINSTANCE.getReversion();

		/**
		 * The meta object literal for the '<em><b>Revert To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVERSION__REVERT_TO = eINSTANCE.getReversion_RevertTo();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.operation.impl.BranchKillImpl <em>Branch Kill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.operation.impl.BranchKillImpl
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getBranchKill()
		 * @generated
		 */
		EClass BRANCH_KILL = eINSTANCE.getBranchKill();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_KILL__STOP = eINSTANCE.getBranchKill_Stop();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.operation.impl.SynchronisationImpl <em>Synchronisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.operation.impl.SynchronisationImpl
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getSynchronisation()
		 * @generated
		 */
		EClass SYNCHRONISATION = eINSTANCE.getSynchronisation();

		/**
		 * The meta object literal for the '<em><b>Wait For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION__WAIT_FOR = eINSTANCE.getSynchronisation_WaitFor();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.operation.impl.MayImpl <em>May</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.operation.impl.MayImpl
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getMay()
		 * @generated
		 */
		EClass MAY = eINSTANCE.getMay();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.operation.impl.StartNewImpl <em>Start New</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.operation.impl.StartNewImpl
		 * @see org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl#getStartNew()
		 * @generated
		 */
		EClass START_NEW = eINSTANCE.getStartNew();

		/**
		 * The meta object literal for the '<em><b>Start New</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_NEW__START_NEW = eINSTANCE.getStartNew_StartNew();

	}

} //OperationPackage
