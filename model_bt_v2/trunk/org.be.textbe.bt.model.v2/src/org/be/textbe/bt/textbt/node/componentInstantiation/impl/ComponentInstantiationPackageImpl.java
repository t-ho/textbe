/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.componentInstantiation.impl;

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

import org.be.textbe.bt.textbt.node.behavior.state.StatePackage;

import org.be.textbe.bt.textbt.node.behavior.state.impl.StatePackageImpl;

import org.be.textbe.bt.textbt.node.componentInstantiation.AtLeastOne;
import org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationFactory;
import org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationNode;
import org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationPackage;
import org.be.textbe.bt.textbt.node.componentInstantiation.ForAll;
import org.be.textbe.bt.textbt.node.componentInstantiation.ForOneArbitrary;
import org.be.textbe.bt.textbt.node.componentInstantiation.ForSome;

import org.be.textbe.bt.textbt.node.impl.NodePackageImpl;

import org.be.textbe.bt.textbt.node.operation.OperationPackage;

import org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl;

import org.be.textbe.bt.textbt.traceability.TraceabilityPackage;

import org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInstantiationPackageImpl extends EPackageImpl implements ComponentInstantiationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forSomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atLeastOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forOneArbitraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstantiationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentSetDefinitionExpressionEDataType = null;

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
	 * @see org.be.textbe.bt.textbt.node.componentInstantiation.ComponentInstantiationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentInstantiationPackageImpl() {
		super(eNS_URI, ComponentInstantiationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentInstantiationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentInstantiationPackage init() {
		if (isInited) return (ComponentInstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInstantiationPackage.eNS_URI);

		// Obtain or create and register package
		ComponentInstantiationPackageImpl theComponentInstantiationPackage = (ComponentInstantiationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentInstantiationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentInstantiationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TextbtPackageImpl theTextbtPackage = (TextbtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) instanceof TextbtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) : TextbtPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) instanceof SequencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) : SequencePackage.eINSTANCE);
		GatePackageImpl theGatePackage = (GatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GatePackage.eNS_URI) instanceof GatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GatePackage.eNS_URI) : GatePackage.eINSTANCE);
		BranchPackageImpl theBranchPackage = (BranchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) instanceof BranchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) : BranchPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentInstantiationPackage.createPackageContents();
		theTextbtPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theNodePackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theStatePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theSequencePackage.createPackageContents();
		theGatePackage.createPackageContents();
		theBranchPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theComponentInstantiationPackage.initializePackageContents();
		theTextbtPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theStatePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theSequencePackage.initializePackageContents();
		theGatePackage.initializePackageContents();
		theBranchPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentInstantiationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentInstantiationPackage.eNS_URI, theComponentInstantiationPackage);
		return theComponentInstantiationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForAll() {
		return forAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForSome() {
		return forSomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtLeastOne() {
		return atLeastOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForOneArbitrary() {
		return forOneArbitraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstantiationNode() {
		return componentInstantiationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstantiationNode_Member() {
		return (EReference)componentInstantiationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstantiationNode_Expression() {
		return (EAttribute)componentInstantiationNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComponentSetDefinitionExpression() {
		return componentSetDefinitionExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationFactory getComponentInstantiationFactory() {
		return (ComponentInstantiationFactory)getEFactoryInstance();
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
		forAllEClass = createEClass(FOR_ALL);

		forSomeEClass = createEClass(FOR_SOME);

		atLeastOneEClass = createEClass(AT_LEAST_ONE);

		forOneArbitraryEClass = createEClass(FOR_ONE_ARBITRARY);

		componentInstantiationNodeEClass = createEClass(COMPONENT_INSTANTIATION_NODE);
		createEReference(componentInstantiationNodeEClass, COMPONENT_INSTANTIATION_NODE__MEMBER);
		createEAttribute(componentInstantiationNodeEClass, COMPONENT_INSTANTIATION_NODE__EXPRESSION);

		// Create data types
		componentSetDefinitionExpressionEDataType = createEDataType(COMPONENT_SET_DEFINITION_EXPRESSION);
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
		NodePackage theNodePackage = (NodePackage)EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		forAllEClass.getESuperTypes().add(this.getComponentInstantiationNode());
		forSomeEClass.getESuperTypes().add(this.getComponentInstantiationNode());
		atLeastOneEClass.getESuperTypes().add(this.getComponentInstantiationNode());
		forOneArbitraryEClass.getESuperTypes().add(this.getComponentInstantiationNode());
		componentInstantiationNodeEClass.getESuperTypes().add(theNodePackage.getNode());

		// Initialize classes and features; add operations and parameters
		initEClass(forAllEClass, ForAll.class, "ForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forSomeEClass, ForSome.class, "ForSome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atLeastOneEClass, AtLeastOne.class, "AtLeastOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forOneArbitraryEClass, ForOneArbitrary.class, "ForOneArbitrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInstantiationNodeEClass, ComponentInstantiationNode.class, "ComponentInstantiationNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstantiationNode_Member(), theComponentPackage.getMember(), null, "member", null, 1, 1, ComponentInstantiationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstantiationNode_Expression(), this.getComponentSetDefinitionExpression(), "expression", null, 0, 1, ComponentInstantiationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(componentSetDefinitionExpressionEDataType, Object.class, "ComponentSetDefinitionExpression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ComponentInstantiationPackageImpl
