/**
 */
package org.be.textbe.bt.textbt.component.behavior.event;

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
 * @see org.be.textbe.bt.textbt.component.behavior.event.EventFactory
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
	EventPackage eINSTANCE = org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getEvent()
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
	int EVENT__ID = ComponentPackage.BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DEFINITION = ComponentPackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ComponentPackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.OutputImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getOutput()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DEFINITION = EVENT__DEFINITION;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.InputImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getInput()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFINITION = EVENT__DEFINITION;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.InternalOutputImpl <em>Internal Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.InternalOutputImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getInternalOutput()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__DEFINITION = OUTPUT__DEFINITION;

	/**
	 * The number of structural features of the '<em>Internal Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.InternalInputImpl <em>Internal Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.InternalInputImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getInternalInput()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__DEFINITION = INPUT__DEFINITION;

	/**
	 * The number of structural features of the '<em>Internal Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalInputImpl <em>External Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalInputImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getExternalInput()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT__DEFINITION = INPUT__DEFINITION;

	/**
	 * The number of structural features of the '<em>External Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalOutputImpl <em>External Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalOutputImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getExternalOutput()
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
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT__DEFINITION = OUTPUT__DEFINITION;

	/**
	 * The number of structural features of the '<em>External Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.EventDefinition <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.EventDefinition
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getEventDefinition()
	 * @generated
	 */
	int EVENT_DEFINITION = 7;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.TextualEventDefinitionImpl <em>Textual Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.TextualEventDefinitionImpl
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getTextualEventDefinition()
	 * @generated
	 */
	int TEXTUAL_EVENT_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EVENT_DEFINITION__EXPRESSION = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getEventExpression()
	 * @generated
	 */
	int EVENT_EXPRESSION = 9;


	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.component.behavior.event.Event#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.Event#getDefinition()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Definition();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.InternalOutput <em>Internal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Output</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.InternalOutput
	 * @generated
	 */
	EClass getInternalOutput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.InternalInput <em>Internal Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Input</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.InternalInput
	 * @generated
	 */
	EClass getInternalInput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.ExternalInput <em>External Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Input</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.ExternalInput
	 * @generated
	 */
	EClass getExternalInput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.ExternalOutput <em>External Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Output</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.ExternalOutput
	 * @generated
	 */
	EClass getExternalOutput();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.EventDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.EventDefinition
	 * @generated
	 */
	EClass getEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.be.textbe.bt.textbt.component.behavior.event.TextualEventDefinition <em>Textual Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Event Definition</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.TextualEventDefinition
	 * @generated
	 */
	EClass getTextualEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.component.behavior.event.TextualEventDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.be.textbe.bt.textbt.component.behavior.event.TextualEventDefinition#getExpression()
	 * @see #getTextualEventDefinition()
	 * @generated
	 */
	EAttribute getTextualEventDefinition_Expression();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
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
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__DEFINITION = eINSTANCE.getEvent_Definition();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.OutputImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.InputImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.InternalOutputImpl <em>Internal Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.InternalOutputImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getInternalOutput()
		 * @generated
		 */
		EClass INTERNAL_OUTPUT = eINSTANCE.getInternalOutput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.InternalInputImpl <em>Internal Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.InternalInputImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getInternalInput()
		 * @generated
		 */
		EClass INTERNAL_INPUT = eINSTANCE.getInternalInput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalInputImpl <em>External Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalInputImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getExternalInput()
		 * @generated
		 */
		EClass EXTERNAL_INPUT = eINSTANCE.getExternalInput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalOutputImpl <em>External Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.ExternalOutputImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getExternalOutput()
		 * @generated
		 */
		EClass EXTERNAL_OUTPUT = eINSTANCE.getExternalOutput();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.EventDefinition <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.EventDefinition
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getEventDefinition()
		 * @generated
		 */
		EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

		/**
		 * The meta object literal for the '{@link org.be.textbe.bt.textbt.component.behavior.event.impl.TextualEventDefinitionImpl <em>Textual Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.TextualEventDefinitionImpl
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getTextualEventDefinition()
		 * @generated
		 */
		EClass TEXTUAL_EVENT_DEFINITION = eINSTANCE.getTextualEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_EVENT_DEFINITION__EXPRESSION = eINSTANCE.getTextualEventDefinition_Expression();

		/**
		 * The meta object literal for the '<em>Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl#getEventExpression()
		 * @generated
		 */
		EDataType EVENT_EXPRESSION = eINSTANCE.getEventExpression();

	}

} //EventPackage
