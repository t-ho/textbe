/**
 */
package org.be.textbe.bt.textbt.branch.impl;

import org.be.textbe.bt.textbt.branch.*;

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
public class BranchFactoryImpl extends EFactoryImpl implements BranchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BranchFactory init() {
		try {
			BranchFactory theBranchFactory = (BranchFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.be.textbe/textbt/branch"); 
			if (theBranchFactory != null) {
				return theBranchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BranchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchFactoryImpl() {
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
			case BranchPackage.FORK_BRANCH: return createForkBranch();
			case BranchPackage.RANDOM_CHOICE_BRANCH: return createRandomChoiceBranch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkBranch createForkBranch() {
		ForkBranchImpl forkBranch = new ForkBranchImpl();
		return forkBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomChoiceBranch createRandomChoiceBranch() {
		RandomChoiceBranchImpl randomChoiceBranch = new RandomChoiceBranchImpl();
		return randomChoiceBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchPackage getBranchPackage() {
		return (BranchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BranchPackage getPackage() {
		return BranchPackage.eINSTANCE;
	}

} //BranchFactoryImpl
