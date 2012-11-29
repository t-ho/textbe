/**
 */
package org.be.textbe.bt.textbt.node.quantifying.impl;

import org.be.textbe.bt.textbt.TextbtPackage;

import org.be.textbe.bt.textbt.activity.ActivityPackage;

import org.be.textbe.bt.textbt.activity.impl.ActivityPackageImpl;

import org.be.textbe.bt.textbt.activity.sequence.SequencePackage;

import org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl;

import org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardPackage;

import org.be.textbe.bt.textbt.activity.systemStateGuard.impl.SystemStateGuardPackageImpl;

import org.be.textbe.bt.textbt.branch.BranchPackage;

import org.be.textbe.bt.textbt.branch.impl.BranchPackageImpl;

import org.be.textbe.bt.textbt.component.ComponentPackage;

import org.be.textbe.bt.textbt.component.behavior.event.EventPackage;

import org.be.textbe.bt.textbt.component.behavior.event.impl.EventPackageImpl;

import org.be.textbe.bt.textbt.component.behavior.state.StatePackage;

import org.be.textbe.bt.textbt.component.behavior.state.impl.StatePackageImpl;

import org.be.textbe.bt.textbt.component.impl.ComponentPackageImpl;

import org.be.textbe.bt.textbt.impl.TextbtPackageImpl;

import org.be.textbe.bt.textbt.node.NodePackage;

import org.be.textbe.bt.textbt.node.impl.NodePackageImpl;

import org.be.textbe.bt.textbt.node.operation.OperationPackage;

import org.be.textbe.bt.textbt.node.operation.impl.OperationPackageImpl;

import org.be.textbe.bt.textbt.node.quantifying.AtLeastOne;
import org.be.textbe.bt.textbt.node.quantifying.ComponentSetDefinition;
import org.be.textbe.bt.textbt.node.quantifying.ForAll;
import org.be.textbe.bt.textbt.node.quantifying.ForOneArbitrary;
import org.be.textbe.bt.textbt.node.quantifying.ForSome;
import org.be.textbe.bt.textbt.node.quantifying.QuantifyingFactory;
import org.be.textbe.bt.textbt.node.quantifying.QuantifyingNode;
import org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage;
import org.be.textbe.bt.textbt.node.quantifying.TextualComponentSetDefinition;

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
public class QuantifyingPackageImpl extends EPackageImpl implements QuantifyingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifyingNodeEClass = null;

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
	private EClass textualComponentSetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSetDefinitionEClass = null;

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
	 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuantifyingPackageImpl() {
		super(eNS_URI, QuantifyingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QuantifyingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuantifyingPackage init() {
		if (isInited) return (QuantifyingPackage)EPackage.Registry.INSTANCE.getEPackage(QuantifyingPackage.eNS_URI);

		// Obtain or create and register package
		QuantifyingPackageImpl theQuantifyingPackage = (QuantifyingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuantifyingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuantifyingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TextbtPackageImpl theTextbtPackage = (TextbtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) instanceof TextbtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) : TextbtPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) instanceof SequencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) : SequencePackage.eINSTANCE);
		SystemStateGuardPackageImpl theSystemStateGuardPackage = (SystemStateGuardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemStateGuardPackage.eNS_URI) instanceof SystemStateGuardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemStateGuardPackage.eNS_URI) : SystemStateGuardPackage.eINSTANCE);
		BranchPackageImpl theBranchPackage = (BranchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) instanceof BranchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) : BranchPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theQuantifyingPackage.createPackageContents();
		theTextbtPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theStatePackage.createPackageContents();
		theNodePackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theSequencePackage.createPackageContents();
		theSystemStateGuardPackage.createPackageContents();
		theBranchPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theQuantifyingPackage.initializePackageContents();
		theTextbtPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theStatePackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theSequencePackage.initializePackageContents();
		theSystemStateGuardPackage.initializePackageContents();
		theBranchPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuantifyingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuantifyingPackage.eNS_URI, theQuantifyingPackage);
		return theQuantifyingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifyingNode() {
		return quantifyingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifyingNode_Variable() {
		return (EReference)quantifyingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifyingNode_Set() {
		return (EReference)quantifyingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifyingNode_Definition() {
		return (EReference)quantifyingNodeEClass.getEStructuralFeatures().get(2);
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
	public EClass getTextualComponentSetDefinition() {
		return textualComponentSetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualComponentSetDefinition_Expression() {
		return (EAttribute)textualComponentSetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSetDefinition() {
		return componentSetDefinitionEClass;
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
	public QuantifyingFactory getQuantifyingFactory() {
		return (QuantifyingFactory)getEFactoryInstance();
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
		quantifyingNodeEClass = createEClass(QUANTIFYING_NODE);
		createEReference(quantifyingNodeEClass, QUANTIFYING_NODE__VARIABLE);
		createEReference(quantifyingNodeEClass, QUANTIFYING_NODE__SET);
		createEReference(quantifyingNodeEClass, QUANTIFYING_NODE__DEFINITION);

		forAllEClass = createEClass(FOR_ALL);

		forSomeEClass = createEClass(FOR_SOME);

		atLeastOneEClass = createEClass(AT_LEAST_ONE);

		forOneArbitraryEClass = createEClass(FOR_ONE_ARBITRARY);

		textualComponentSetDefinitionEClass = createEClass(TEXTUAL_COMPONENT_SET_DEFINITION);
		createEAttribute(textualComponentSetDefinitionEClass, TEXTUAL_COMPONENT_SET_DEFINITION__EXPRESSION);

		componentSetDefinitionEClass = createEClass(COMPONENT_SET_DEFINITION);

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
		quantifyingNodeEClass.getESuperTypes().add(theNodePackage.getNode());
		forAllEClass.getESuperTypes().add(this.getQuantifyingNode());
		forSomeEClass.getESuperTypes().add(this.getQuantifyingNode());
		atLeastOneEClass.getESuperTypes().add(this.getQuantifyingNode());
		forOneArbitraryEClass.getESuperTypes().add(this.getQuantifyingNode());
		textualComponentSetDefinitionEClass.getESuperTypes().add(this.getComponentSetDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(quantifyingNodeEClass, QuantifyingNode.class, "QuantifyingNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifyingNode_Variable(), theComponentPackage.getComponent(), null, "variable", null, 1, 1, QuantifyingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifyingNode_Set(), this.getComponentSetDefinition(), null, "set", null, 1, 1, QuantifyingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifyingNode_Definition(), this.getComponentSetDefinition(), null, "definition", null, 1, 1, QuantifyingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forAllEClass, ForAll.class, "ForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forSomeEClass, ForSome.class, "ForSome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atLeastOneEClass, AtLeastOne.class, "AtLeastOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forOneArbitraryEClass, ForOneArbitrary.class, "ForOneArbitrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualComponentSetDefinitionEClass, TextualComponentSetDefinition.class, "TextualComponentSetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualComponentSetDefinition_Expression(), this.getComponentSetDefinitionExpression(), "expression", null, 1, 1, TextualComponentSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSetDefinitionEClass, ComponentSetDefinition.class, "ComponentSetDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(componentSetDefinitionExpressionEDataType, String.class, "ComponentSetDefinitionExpression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //QuantifyingPackageImpl
