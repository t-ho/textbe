/**
 */
package org.be.textbe.bt.textbt.activity.systemStateGuard;

import org.be.textbe.bt.textbt.activity.ActivityPackage;

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
 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardFactory
 * @model kind="package"
 * @generated
 */
public interface SystemStateGuardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "systemStateGuard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/activity/systemStateGuard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "systemStateGuard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemStateGuardPackage eINSTANCE = org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardImpl <em>System State Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardImpl
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getSystemStateGuard()
	 * @generated
	 */
	int SYSTEM_STATE_GUARD = 0;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATE_GUARD__SUBTREES = ActivityPackage.ACTIVITY__SUBTREES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATE_GUARD__CHILD = ActivityPackage.ACTIVITY__CHILD;

	/**
	 * The feature id for the '<em><b>Component Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATE_GUARD__COMPONENT_SELECTION = ActivityPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System State Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATE_GUARD_FEATURE_COUNT = ActivityPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.ConjunctionImpl <em>Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.ConjunctionImpl
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getConjunction()
	 * @generated
	 */
	int CONJUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__SUBTREES = SYSTEM_STATE_GUARD__SUBTREES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__CHILD = SYSTEM_STATE_GUARD__CHILD;

	/**
	 * The feature id for the '<em><b>Component Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__COMPONENT_SELECTION = SYSTEM_STATE_GUARD__COMPONENT_SELECTION;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = SYSTEM_STATE_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.DisjunctionImpl
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__SUBTREES = SYSTEM_STATE_GUARD__SUBTREES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__CHILD = SYSTEM_STATE_GUARD__CHILD;

	/**
	 * The feature id for the '<em><b>Component Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__COMPONENT_SELECTION = SYSTEM_STATE_GUARD__COMPONENT_SELECTION;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = SYSTEM_STATE_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.MutualExclusionImpl <em>Mutual Exclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.MutualExclusionImpl
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getMutualExclusion()
	 * @generated
	 */
	int MUTUAL_EXCLUSION = 3;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION__SUBTREES = SYSTEM_STATE_GUARD__SUBTREES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION__CHILD = SYSTEM_STATE_GUARD__CHILD;

	/**
	 * The feature id for the '<em><b>Component Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION__COMPONENT_SELECTION = SYSTEM_STATE_GUARD__COMPONENT_SELECTION;

	/**
	 * The number of structural features of the '<em>Mutual Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUAL_EXCLUSION_FEATURE_COUNT = SYSTEM_STATE_GUARD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuard <em>System State Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System State Guard</em>'.
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuard
	 * @generated
	 */
	EClass getSystemStateGuard();

	/**
	 * Returns the meta object for the reference list '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuard#getComponentSelection <em>Component Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Selection</em>'.
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuard#getComponentSelection()
	 * @see #getSystemStateGuard()
	 * @generated
	 */
	EReference getSystemStateGuard_ComponentSelection();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction</em>'.
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.Conjunction
	 * @generated
	 */
	EClass getConjunction();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.MutualExclusion <em>Mutual Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutual Exclusion</em>'.
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.MutualExclusion
	 * @generated
	 */
	EClass getMutualExclusion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemStateGuardFactory getSystemStateGuardFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardImpl <em>System State Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardImpl
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getSystemStateGuard()
		 * @generated
		 */
		EClass SYSTEM_STATE_GUARD = eINSTANCE.getSystemStateGuard();

		/**
		 * The meta object literal for the '<em><b>Component Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STATE_GUARD__COMPONENT_SELECTION = eINSTANCE.getSystemStateGuard_ComponentSelection();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.ConjunctionImpl <em>Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.ConjunctionImpl
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getConjunction()
		 * @generated
		 */
		EClass CONJUNCTION = eINSTANCE.getConjunction();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.DisjunctionImpl
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.activity.systemStateGuard.impl.MutualExclusionImpl <em>Mutual Exclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.MutualExclusionImpl
		 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl#getMutualExclusion()
		 * @generated
		 */
		EClass MUTUAL_EXCLUSION = eINSTANCE.getMutualExclusion();

	}

} //SystemStateGuardPackage
