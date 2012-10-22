/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.behavior.state.impl;

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

import org.be.textbe.bt.textbt.node.behavior.event.EventPackage;

import org.be.textbe.bt.textbt.node.behavior.event.impl.EventPackageImpl;

import org.be.textbe.bt.textbt.node.behavior.impl.BehaviorPackageImpl;

import org.be.textbe.bt.textbt.node.behavior.state.Guard;
import org.be.textbe.bt.textbt.node.behavior.state.Selection;
import org.be.textbe.bt.textbt.node.behavior.state.StateFactory;
import org.be.textbe.bt.textbt.node.behavior.state.StatePackage;
import org.be.textbe.bt.textbt.node.behavior.state.StateRealization;
import org.be.textbe.bt.textbt.node.behavior.state.StatefulBehavior;

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
public class StatePackageImpl extends EPackageImpl implements StatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statefulBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stateExpressionEDataType = null;

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
	 * @see org.be.textbe.bt.textbt.node.behavior.state.StatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatePackageImpl() {
		super(eNS_URI, StateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatePackage init() {
		if (isInited) return (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);

		// Obtain or create and register package
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TextbtPackageImpl theTextbtPackage = (TextbtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) instanceof TextbtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) : TextbtPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		ComponentInstantiationPackageImpl theComponentInstantiationPackage = (ComponentInstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentInstantiationPackage.eNS_URI) instanceof ComponentInstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentInstantiationPackage.eNS_URI) : ComponentInstantiationPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) instanceof SequencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) : SequencePackage.eINSTANCE);
		GatePackageImpl theGatePackage = (GatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GatePackage.eNS_URI) instanceof GatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GatePackage.eNS_URI) : GatePackage.eINSTANCE);
		BranchPackageImpl theBranchPackage = (BranchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) instanceof BranchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) : BranchPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theStatePackage.createPackageContents();
		theTextbtPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theNodePackage.createPackageContents();
		theComponentInstantiationPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theSequencePackage.createPackageContents();
		theGatePackage.createPackageContents();
		theBranchPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theStatePackage.initializePackageContents();
		theTextbtPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theComponentInstantiationPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theSequencePackage.initializePackageContents();
		theGatePackage.initializePackageContents();
		theBranchPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatePackage.eNS_URI, theStatePackage);
		return theStatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatefulBehavior() {
		return statefulBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatefulBehavior_Expression() {
		return (EAttribute)statefulBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateRealization() {
		return stateRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStateExpression() {
		return stateExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFactory getStateFactory() {
		return (StateFactory)getEFactoryInstance();
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
		statefulBehaviorEClass = createEClass(STATEFUL_BEHAVIOR);
		createEAttribute(statefulBehaviorEClass, STATEFUL_BEHAVIOR__EXPRESSION);

		stateRealizationEClass = createEClass(STATE_REALIZATION);

		selectionEClass = createEClass(SELECTION);

		guardEClass = createEClass(GUARD);

		// Create data types
		stateExpressionEDataType = createEDataType(STATE_EXPRESSION);
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
		statefulBehaviorEClass.getESuperTypes().add(theBehaviorPackage.getBehavior());
		stateRealizationEClass.getESuperTypes().add(this.getStatefulBehavior());
		selectionEClass.getESuperTypes().add(this.getStatefulBehavior());
		guardEClass.getESuperTypes().add(this.getStatefulBehavior());

		// Initialize classes and features; add operations and parameters
		initEClass(statefulBehaviorEClass, StatefulBehavior.class, "StatefulBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatefulBehavior_Expression(), this.getStateExpression(), "expression", null, 0, 1, StatefulBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateRealizationEClass, StateRealization.class, "StateRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(stateExpressionEDataType, Object.class, "StateExpression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //StatePackageImpl
