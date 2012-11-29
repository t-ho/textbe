/**
 */
package org.be.textbe.bt.textbt.component.behavior.state;

import org.be.textbe.bt.textbt.component.ComponentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.be.textbe.bt.textbt.component.behavior.state.StateFactory
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
	StatePackage eINSTANCE = org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.StatefulBehaviorImpl <em>Stateful Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatefulBehaviorImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStatefulBehavior()
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
	int STATEFUL_BEHAVIOR__ID = ComponentPackage.BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_BEHAVIOR__DEFINITION = ComponentPackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stateful Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_BEHAVIOR_FEATURE_COUNT = ComponentPackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.StateRealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StateRealizationImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStateRealization()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REALIZATION__DEFINITION = STATEFUL_BEHAVIOR__DEFINITION;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REALIZATION_FEATURE_COUNT = STATEFUL_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.SelectionImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getSelection()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__DEFINITION = STATEFUL_BEHAVIOR__DEFINITION;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = STATEFUL_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.GuardImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getGuard()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__DEFINITION = STATEFUL_BEHAVIOR__DEFINITION;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = STATEFUL_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.state.StateDefinition <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.state.StateDefinition
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStateDefinition()
	 * @generated
	 */
	int STATE_DEFINITION = 4;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.TextualStateDefinitionImpl <em>Textual State Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.TextualStateDefinitionImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getTextualStateDefinition()
	 * @generated
	 */
	int TEXTUAL_STATE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_STATE_DEFINITION__EXPRESSION = STATE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual State Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_STATE_DEFINITION_FEATURE_COUNT = STATE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStateExpression()
	 * @generated
	 */
	int STATE_EXPRESSION = 6;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.state.StatefulBehavior <em>Stateful Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateful Behavior</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.StatefulBehavior
	 * @generated
	 */
	EClass getStatefulBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.component.behavior.state.StatefulBehavior#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.StatefulBehavior#getDefinition()
	 * @see #getStatefulBehavior()
	 * @generated
	 */
	EReference getStatefulBehavior_Definition();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.state.StateRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.StateRealization
	 * @generated
	 */
	EClass getStateRealization();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.state.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.state.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.state.StateDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.StateDefinition
	 * @generated
	 */
	EClass getStateDefinition();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.state.TextualStateDefinition <em>Textual State Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual State Definition</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.TextualStateDefinition
	 * @generated
	 */
	EClass getTextualStateDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.component.behavior.state.TextualStateDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.state.TextualStateDefinition#getExpression()
	 * @see #getTextualStateDefinition()
	 * @generated
	 */
	EAttribute getTextualStateDefinition_Expression();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.StatefulBehaviorImpl <em>Stateful Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatefulBehaviorImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStatefulBehavior()
		 * @generated
		 */
		EClass STATEFUL_BEHAVIOR = eINSTANCE.getStatefulBehavior();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFUL_BEHAVIOR__DEFINITION = eINSTANCE.getStatefulBehavior_Definition();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.StateRealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StateRealizationImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStateRealization()
		 * @generated
		 */
		EClass STATE_REALIZATION = eINSTANCE.getStateRealization();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.SelectionImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.GuardImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.state.StateDefinition <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.state.StateDefinition
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStateDefinition()
		 * @generated
		 */
		EClass STATE_DEFINITION = eINSTANCE.getStateDefinition();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.state.impl.TextualStateDefinitionImpl <em>Textual State Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.TextualStateDefinitionImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getTextualStateDefinition()
		 * @generated
		 */
		EClass TEXTUAL_STATE_DEFINITION = eINSTANCE.getTextualStateDefinition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_STATE_DEFINITION__EXPRESSION = eINSTANCE.getTextualStateDefinition_Expression();

		/**
		 * The meta object literal for the '<em>Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl#getStateExpression()
		 * @generated
		 */
		EDataType STATE_EXPRESSION = eINSTANCE.getStateExpression();

	}

} //StatePackage
