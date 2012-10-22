/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior.event.impl;

import org.be.textbe.bt.textbt.TextbtPackage;

import org.be.textbe.bt.textbt.activity.ActivityPackage;

import org.be.textbe.bt.textbt.activity.gate.GatePackage;

import org.be.textbe.bt.textbt.activity.gate.impl.GatePackageImpl;

import org.be.textbe.bt.textbt.activity.impl.ActivityPackageImpl;

import org.be.textbe.bt.textbt.activity.sequence.SequencePackage;

import org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl;

import org.be.textbe.bt.textbt.branch.BranchPackage;

import org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl;

import org.be.textbe.bt.textbt.component.ComponentPackage;

import org.be.textbe.bt.textbt.component.impl.ComponentPackageImpl;

import org.be.textbe.bt.textbt.impl.TextbtPackageImpl;

import org.be.textbe.bt.textbt.node.NodePackage;

import org.be.textbe.bt.textbt.node.behavior.BehaviorPackage;

import org.be.textbe.bt.textbt.node.behavior.event.Event;
import org.be.textbe.bt.textbt.node.behavior.event.EventFactory;
import org.be.textbe.bt.textbt.node.behavior.event.EventPackage;
import org.be.textbe.bt.textbt.node.behavior.event.ExternalInput;
import org.be.textbe.bt.textbt.node.behavior.event.ExternalOutput;
import org.be.textbe.bt.textbt.node.behavior.event.Input;
import org.be.textbe.bt.textbt.node.behavior.event.InternalInput;
import org.be.textbe.bt.textbt.node.behavior.event.InternalOutput;
import org.be.textbe.bt.textbt.node.behavior.event.Output;

import org.be.textbe.bt.textbt.node.behavior.impl.BehaviorPackageImpl;

import org.be.textbe.bt.textbt.node.behavior.state.StatePackage;

import org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl;

import org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationPackage;

import org.be.textbe.bt.textbt.node.componentInstantiation.impl.ComponentInstantiationPackageImpl;

import org.be.textbe.bt.textbt.node.impl.NodePackageImpl;

import org.be.textbe.bt.textbt.node.operation.OperationPackage;

import org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl;

import org.be.textbe.bt.textbt.traceability.TraceabilityPackage;

import org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventPackageImpl extends EPackageImpl implements EventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventExpressionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.be.textbe.bt.textbt.node.behavior.event.EventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventPackageImpl() {
		super(eNS_URI, EventFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventPackage init() {
		if (isInited) return (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);

		// Obtain or create and register package
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TextbtPackageImpl theTextbtPackage = (TextbtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) instanceof TextbtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) : TextbtPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		ComponentInstantiationPackageImpl theComponentInstantiationPackage = (ComponentInstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentInstantiationPackage.eNS_URI) instanceof ComponentInstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentInstantiationPackage.eNS_URI) : ComponentInstantiationPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) instanceof SequencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) : SequencePackage.eINSTANCE);
		GatePackageImpl theGatePackage = (GatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GatePackage.eNS_URI) instanceof GatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GatePackage.eNS_URI) : GatePackage.eINSTANCE);
		BranchPackageImpl theBranchPackage = (BranchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) instanceof BranchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) : BranchPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theEventPackage.createPackageContents();
		theTextbtPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theNodePackage.createPackageContents();
		theComponentInstantiationPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStatePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theSequencePackage.createPackageContents();
		theGatePackage.createPackageContents();
		theBranchPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theEventPackage.initializePackageContents();
		theTextbtPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theComponentInstantiationPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStatePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theSequencePackage.initializePackageContents();
		theGatePackage.initializePackageContents();
		theBranchPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventPackage.eNS_URI, theEventPackage);
		return theEventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Expression() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalOutput() {
		return internalOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalInput() {
		return internalInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalInput() {
		return externalInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalOutput() {
		return externalOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventExpression() {
		return eventExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFactory getEventFactory() {
		return (EventFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__EXPRESSION);

		outputEClass = createEClass(OUTPUT);

		inputEClass = createEClass(INPUT);

		internalOutputEClass = createEClass(INTERNAL_OUTPUT);

		internalInputEClass = createEClass(INTERNAL_INPUT);

		externalInputEClass = createEClass(EXTERNAL_INPUT);

		externalOutputEClass = createEClass(EXTERNAL_OUTPUT);

		// Create data types
		eventExpressionEDataType = createEDataType(EVENT_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventEClass.getESuperTypes().add(theBehaviorPackage.getBehavior());
		outputEClass.getESuperTypes().add(this.getEvent());
		inputEClass.getESuperTypes().add(this.getEvent());
		internalOutputEClass.getESuperTypes().add(this.getOutput());
		internalInputEClass.getESuperTypes().add(this.getInput());
		externalInputEClass.getESuperTypes().add(this.getInput());
		externalOutputEClass.getESuperTypes().add(this.getOutput());

		// Initialize classes and features; add operations and parameters
		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Expression(), this.getEventExpression(), "expression", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalOutputEClass, InternalOutput.class, "InternalOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalInputEClass, InternalInput.class, "InternalInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalInputEClass, ExternalInput.class, "ExternalInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalOutputEClass, ExternalOutput.class, "ExternalOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(eventExpressionEDataType, Object.class, "EventExpression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //EventPackageImpl
