/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior.event;

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
 * @see org.be.textbe.bt.textbt.node.behavior.event.EventFactory
 * @model kind="package"
 * @generated
 */
public interface EventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "event";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.be.textbe/textbt/component/behavior/event";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "event";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventPackage eINSTANCE = org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = BehaviorPackage.BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXPRESSION = BehaviorPackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = BehaviorPackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.OutputImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__EXPRESSION = EVENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.InputImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__EXPRESSION = EVENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.InternalOutputImpl <em>Internal Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.InternalOutputImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getInternalOutput()
	 * @generated
	 */
	int INTERNAL_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__ID = OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__EXPRESSION = OUTPUT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Internal Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.InternalInputImpl <em>Internal Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.InternalInputImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getInternalInput()
	 * @generated
	 */
	int INTERNAL_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__EXPRESSION = INPUT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Internal Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalInputImpl <em>External Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalInputImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getExternalInput()
	 * @generated
	 */
	int EXTERNAL_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT__EXPRESSION = INPUT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>External Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalOutputImpl <em>External Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalOutputImpl
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getExternalOutput()
	 * @generated
	 */
	int EXTERNAL_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT__ID = OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT__EXPRESSION = OUTPUT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>External Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getEventExpression()
	 * @generated
	 */
	int EVENT_EXPRESSION = 7;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.node.behavior.event.Event#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.Event#getExpression()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Expression();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.event.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.event.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.event.InternalOutput <em>Internal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Output</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.InternalOutput
	 * @generated
	 */
	EClass getInternalOutput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.event.InternalInput <em>Internal Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Input</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.InternalInput
	 * @generated
	 */
	EClass getInternalInput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.event.ExternalInput <em>External Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Input</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.ExternalInput
	 * @generated
	 */
	EClass getExternalInput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.node.behavior.event.ExternalOutput <em>External Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Output</em>'.
	 * @see org.be.textbe.bt.textbt.node.behavior.event.ExternalOutput
	 * @generated
	 */
	EClass getExternalOutput();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getEventExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventFactory getEventFactory();

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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EXPRESSION = eINSTANCE.getEvent_Expression();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.OutputImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.InputImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.InternalOutputImpl <em>Internal Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.InternalOutputImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getInternalOutput()
		 * @generated
		 */
		EClass INTERNAL_OUTPUT = eINSTANCE.getInternalOutput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.InternalInputImpl <em>Internal Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.InternalInputImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getInternalInput()
		 * @generated
		 */
		EClass INTERNAL_INPUT = eINSTANCE.getInternalInput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalInputImpl <em>External Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalInputImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getExternalInput()
		 * @generated
		 */
		EClass EXTERNAL_INPUT = eINSTANCE.getExternalInput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalOutputImpl <em>External Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.ExternalOutputImpl
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getExternalOutput()
		 * @generated
		 */
		EClass EXTERNAL_OUTPUT = eINSTANCE.getExternalOutput();

		/**
		 * The meta object literal for the '<em>Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl#getEventExpression()
		 * @generated
		 */
		EDataType EVENT_EXPRESSION = eINSTANCE.getEventExpression();

	}

} //EventPackage
