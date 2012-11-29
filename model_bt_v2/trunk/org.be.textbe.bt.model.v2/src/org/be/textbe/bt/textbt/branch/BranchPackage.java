/**
 */
package org.be.textbe.bt.textbt.branch;

import org.be.textbe.bt.textbt.TextbtPackage;

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
 * @see org.be.textbe.bt.textbt.branch.BranchFactory
 * @model kind="package"
 * @generated
 */
public interface BranchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "branch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/branch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "branch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BranchPackage eINSTANCE = org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.branch.Branch <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.branch.Branch
	 * @see org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 0;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__SUBTREES = TextbtPackage.BEHAVIOR_TREE__SUBTREES;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = TextbtPackage.BEHAVIOR_TREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.branch.impl.ForkBranchImpl <em>Fork Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.branch.impl.ForkBranchImpl
	 * @see org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl#getForkBranch()
	 * @generated
	 */
	int FORK_BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_BRANCH__SUBTREES = BRANCH__SUBTREES;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_BRANCH__PROCESSES = BRANCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fork Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.branch.impl.RandomChoiceBranchImpl <em>Random Choice Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.branch.impl.RandomChoiceBranchImpl
	 * @see org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl#getRandomChoiceBranch()
	 * @generated
	 */
	int RANDOM_CHOICE_BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_CHOICE_BRANCH__SUBTREES = BRANCH__SUBTREES;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_CHOICE_BRANCH__CHOICES = BRANCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random Choice Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_CHOICE_BRANCH_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.branch.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see org.be.textbe.bt.textbt.branch.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.branch.ForkBranch <em>Fork Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Branch</em>'.
	 * @see org.be.textbe.bt.textbt.branch.ForkBranch
	 * @generated
	 */
	EClass getForkBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.branch.ForkBranch#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see org.be.textbe.bt.textbt.branch.ForkBranch#getProcesses()
	 * @see #getForkBranch()
	 * @generated
	 */
	EReference getForkBranch_Processes();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.branch.RandomChoiceBranch <em>Random Choice Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Choice Branch</em>'.
	 * @see org.be.textbe.bt.textbt.branch.RandomChoiceBranch
	 * @generated
	 */
	EClass getRandomChoiceBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.branch.RandomChoiceBranch#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see org.be.textbe.bt.textbt.branch.RandomChoiceBranch#getChoices()
	 * @see #getRandomChoiceBranch()
	 * @generated
	 */
	EReference getRandomChoiceBranch_Choices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BranchFactory getBranchFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.branch.Branch <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.branch.Branch
		 * @see org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.branch.impl.ForkBranchImpl <em>Fork Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.branch.impl.ForkBranchImpl
		 * @see org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl#getForkBranch()
		 * @generated
		 */
		EClass FORK_BRANCH = eINSTANCE.getForkBranch();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_BRANCH__PROCESSES = eINSTANCE.getForkBranch_Processes();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.branch.impl.RandomChoiceBranchImpl <em>Random Choice Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.branch.impl.RandomChoiceBranchImpl
		 * @see org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl#getRandomChoiceBranch()
		 * @generated
		 */
		EClass RANDOM_CHOICE_BRANCH = eINSTANCE.getRandomChoiceBranch();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANDOM_CHOICE_BRANCH__CHOICES = eINSTANCE.getRandomChoiceBranch_Choices();

	}

} //BranchPackage
