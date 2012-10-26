/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior.state;

import org.be.textbe.bt.textbt.node.behavior.BehaviorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.be.textbe.bt.textbt.node.behavior.state.StateFactory
 * @model kind="package"
 * @generated
 */
public interface StatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "state";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/component/behavior/state";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "state";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatePackage eINSTANCE = org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.StatefulBehaviorImpl <em>Stateful Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatefulBehaviorImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getStatefulBehavior()
	 * @generated
	 */
	int STATEFUL_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_BEHAVIOR__ID = BehaviorPackage.BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_BEHAVIOR__EXPRESSION = BehaviorPackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stateful Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_BEHAVIOR_FEATURE_COUNT = BehaviorPackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.StateRealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StateRealizationImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getStateRealization()
	 * @generated
	 */
	int STATE_REALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REALIZATION__ID = STATEFUL_BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REALIZATION__EXPRESSION = STATEFUL_BEHAVIOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REALIZATION_FEATURE_COUNT = STATEFUL_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.SelectionImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ID = STATEFUL_BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__EXPRESSION = STATEFUL_BEHAVIOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = STATEFUL_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.GuardImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__ID = STATEFUL_BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__EXPRESSION = STATEFUL_BEHAVIOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = STATEFUL_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getStateExpression()
	 * @generated
	 */
	int STATE_EXPRESSION = 4;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.state.StatefulBehavior <em>Stateful Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateful Behavior</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.state.StatefulBehavior
	 * @generated
	 */
	EClass getStatefulBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.node.behavior.state.StatefulBehavior#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.state.StatefulBehavior#getExpression()
	 * @see #getStatefulBehavior()
	 * @generated
	 */
	EAttribute getStatefulBehavior_Expression();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.state.StateRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.state.StateRealization
	 * @generated
	 */
	EClass getStateRealization();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.state.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.state.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.state.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.state.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getStateExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateFactory getStateFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.StatefulBehaviorImpl <em>Stateful Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatefulBehaviorImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getStatefulBehavior()
		 * @generated
		 */
		EClass STATEFUL_BEHAVIOR = eINSTANCE.getStatefulBehavior();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEFUL_BEHAVIOR__EXPRESSION = eINSTANCE.getStatefulBehavior_Expression();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.StateRealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StateRealizationImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getStateRealization()
		 * @generated
		 */
		EClass STATE_REALIZATION = eINSTANCE.getStateRealization();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.SelectionImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.state.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.GuardImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em>Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl#getStateExpression()
		 * @generated
		 */
		EDataType STATE_EXPRESSION = eINSTANCE.getStateExpression();

	}

} //StatePackage
