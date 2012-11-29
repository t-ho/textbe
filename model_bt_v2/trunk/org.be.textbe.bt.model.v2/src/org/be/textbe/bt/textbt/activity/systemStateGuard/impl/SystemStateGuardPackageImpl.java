/**
 */
package org.be.textbe.bt.textbt.activity.systemStateGuard.impl;

import org.be.textbe.bt.textbt.TextbtPackage;

import org.be.textbe.bt.textbt.activity.ActivityPackage;

import org.be.textbe.bt.textbt.activity.impl.ActivityPackageImpl;

import org.be.textbe.bt.textbt.activity.sequence.SequencePackage;

import org.be.textbe.bt.textbt.activity.sequence.impl.SequencePackageImpl;

import org.be.textbe.bt.textbt.activity.systemStateGuard.Conjunction;
import org.be.textbe.bt.textbt.activity.systemStateGuard.Disjunction;
import org.be.textbe.bt.textbt.activity.systemStateGuard.MutualExclusion;
import org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuard;
import org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardFactory;
import org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardPackage;

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

import org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage;

import org.be.textbe.bt.textbt.node.quantifying.impl.QuantifyingPackageImpl;

import org.be.textbe.bt.textbt.traceability.TraceabilityPackage;

import org.be.textbe.bt.textbt.traceability.impl.TraceabilityPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemStateGuardPackageImpl extends EPackageImpl implements SystemStateGuardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemStateGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutualExclusionEClass = null;

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
	 * @see org.be.textbe.bt.textbt.activity.systemStateGuard.SystemStateGuardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemStateGuardPackageImpl() {
		super(eNS_URI, SystemStateGuardFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemStateGuardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemStateGuardPackage init() {
		if (isInited) return (SystemStateGuardPackage)EPackage.Registry.INSTANCE.getEPackage(SystemStateGuardPackage.eNS_URI);

		// Obtain or create and register package
		SystemStateGuardPackageImpl theSystemStateGuardPackage = (SystemStateGuardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SystemStateGuardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SystemStateGuardPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TextbtPackageImpl theTextbtPackage = (TextbtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) instanceof TextbtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextbtPackage.eNS_URI) : TextbtPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		QuantifyingPackageImpl theQuantifyingPackage = (QuantifyingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantifyingPackage.eNS_URI) instanceof QuantifyingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantifyingPackage.eNS_URI) : QuantifyingPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) instanceof SequencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI) : SequencePackage.eINSTANCE);
		BranchPackageImpl theBranchPackage = (BranchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) instanceof BranchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BranchPackage.eNS_URI) : BranchPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemStateGuardPackage.createPackageContents();
		theTextbtPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theStatePackage.createPackageContents();
		theNodePackage.createPackageContents();
		theQuantifyingPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theSequencePackage.createPackageContents();
		theBranchPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theSystemStateGuardPackage.initializePackageContents();
		theTextbtPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theStatePackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theQuantifyingPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theSequencePackage.initializePackageContents();
		theBranchPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemStateGuardPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemStateGuardPackage.eNS_URI, theSystemStateGuardPackage);
		return theSystemStateGuardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemStateGuard() {
		return systemStateGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemStateGuard_ComponentSelection() {
		return (EReference)systemStateGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunction() {
		return conjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunction() {
		return disjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutualExclusion() {
		return mutualExclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStateGuardFactory getSystemStateGuardFactory() {
		return (SystemStateGuardFactory)getEFactoryInstance();
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
		systemStateGuardEClass = createEClass(SYSTEM_STATE_GUARD);
		createEReference(systemStateGuardEClass, SYSTEM_STATE_GUARD__COMPONENT_SELECTION);

		conjunctionEClass = createEClass(CONJUNCTION);

		disjunctionEClass = createEClass(DISJUNCTION);

		mutualExclusionEClass = createEClass(MUTUAL_EXCLUSION);
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
		ActivityPackage theActivityPackage = (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemStateGuardEClass.getESuperTypes().add(theActivityPackage.getActivity());
		conjunctionEClass.getESuperTypes().add(this.getSystemStateGuard());
		disjunctionEClass.getESuperTypes().add(this.getSystemStateGuard());
		mutualExclusionEClass.getESuperTypes().add(this.getSystemStateGuard());

		// Initialize classes and features; add operations and parameters
		initEClass(systemStateGuardEClass, SystemStateGuard.class, "SystemStateGuard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemStateGuard_ComponentSelection(), theStatePackage.getSelection(), null, "componentSelection", null, 1, -1, SystemStateGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mutualExclusionEClass, MutualExclusion.class, "MutualExclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SystemStateGuardPackageImpl
