/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt.node.operation.impl;

import org.be.textbe.bt.textbt.node.operation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationFactoryImpl extends EFactoryImpl implements OperationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationFactory init() {
		try {
			OperationFactory theOperationFactory = (OperationFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.be.textbe/textbt/node/operation"); 
			if (theOperationFactory != null) {
				return theOperationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationPackage.REFERENCE: return createReference();
			case OperationPackage.REVERSION: return createReversion();
			case OperationPackage.BRANCH_KILL: return createBranchKill();
			case OperationPackage.SYNCHRONISATION: return createSynchronisation();
			case OperationPackage.MAY: return createMay();
			case OperationPackage.START_NEW_NODE: return createStartNewNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reversion createReversion() {
		ReversionImpl reversion = new ReversionImpl();
		return reversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchKill createBranchKill() {
		BranchKillImpl branchKill = new BranchKillImpl();
		return branchKill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronisation createSynchronisation() {
		SynchronisationImpl synchronisation = new SynchronisationImpl();
		return synchronisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public May createMay() {
		MayImpl may = new MayImpl();
		return may;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNewNode createStartNewNode() {
		StartNewNodeImpl startNewNode = new StartNewNodeImpl();
		return startNewNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPackage getOperationPackage() {
		return (OperationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationPackage getPackage() {
		return OperationPackage.eINSTANCE;
	}

} //OperationFactoryImpl
