/**
 */
package org.be.textbe.bt.textbt.activity.sequence;

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
 * @see org.be.textbe.bt.textbt.activity.sequence.SequenceFactory
 * @model kind="package"
 * @generated
 */
public interface SequencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/activity/sequence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequencePackage eINSTANCE = org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl
	 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUBTREES = ActivityPackage.ACTIVITY__SUBTREES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CHILD = ActivityPackage.ACTIVITY__CHILD;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STEP = ActivityPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__QUANTIFIER = ActivityPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ActivityPackage.ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.activity.sequence.impl.AtomicSequenceImpl <em>Atomic Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.activity.sequence.impl.AtomicSequenceImpl
	 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl#getAtomicSequence()
	 * @generated
	 */
	int ATOMIC_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE__SUBTREES = SEQUENCE__SUBTREES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE__CHILD = SEQUENCE__CHILD;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE__STEP = SEQUENCE__STEP;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE__QUANTIFIER = SEQUENCE__QUANTIFIER;

	/**
	 * The number of structural features of the '<em>Atomic Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.activity.sequence.impl.InterleavingSequenceImpl <em>Interleaving Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.activity.sequence.impl.InterleavingSequenceImpl
	 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl#getInterleavingSequence()
	 * @generated
	 */
	int INTERLEAVING_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING_SEQUENCE__SUBTREES = SEQUENCE__SUBTREES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING_SEQUENCE__CHILD = SEQUENCE__CHILD;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING_SEQUENCE__STEP = SEQUENCE__STEP;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING_SEQUENCE__QUANTIFIER = SEQUENCE__QUANTIFIER;

	/**
	 * The number of structural features of the '<em>Interleaving Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING_SEQUENCE_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.activity.sequence.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.be.textbe.bt.textbt.activity.sequence.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.activity.sequence.Sequence#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see org.be.textbe.bt.textbt.activity.sequence.Sequence#getStep()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Step();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.activity.sequence.Sequence#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantifier</em>'.
	 * @see org.be.textbe.bt.textbt.activity.sequence.Sequence#getQuantifier()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Quantifier();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.activity.sequence.AtomicSequence <em>Atomic Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Sequence</em>'.
	 * @see org.be.textbe.bt.textbt.activity.sequence.AtomicSequence
	 * @generated
	 */
	EClass getAtomicSequence();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.activity.sequence.InterleavingSequence <em>Interleaving Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interleaving Sequence</em>'.
	 * @see org.be.textbe.bt.textbt.activity.sequence.InterleavingSequence
	 * @generated
	 */
	EClass getInterleavingSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequenceFactory getSequenceFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequenceImpl
		 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__STEP = eINSTANCE.getSequence_Step();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__QUANTIFIER = eINSTANCE.getSequence_Quantifier();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.activity.sequence.impl.AtomicSequenceImpl <em>Atomic Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.activity.sequence.impl.AtomicSequenceImpl
		 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl#getAtomicSequence()
		 * @generated
		 */
		EClass ATOMIC_SEQUENCE = eINSTANCE.getAtomicSequence();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.activity.sequence.impl.InterleavingSequenceImpl <em>Interleaving Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.activity.sequence.impl.InterleavingSequenceImpl
		 * @see org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl#getInterleavingSequence()
		 * @generated
		 */
		EClass INTERLEAVING_SEQUENCE = eINSTANCE.getInterleavingSequence();

	}

} //SequencePackage
