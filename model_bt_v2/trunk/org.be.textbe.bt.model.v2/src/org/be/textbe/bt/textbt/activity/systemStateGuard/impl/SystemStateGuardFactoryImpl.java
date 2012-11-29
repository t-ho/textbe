/**
 */
package org.be.textbe.bt.textbt.activity.systemStateGuard.impl;

import org.be.textbe.bt.textbt.activity.systemStateGuard.*;

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
public class SystemStateGuardFactoryImpl extends EFactoryImpl implements SystemStateGuardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemStateGuardFactory init() {
		try {
			SystemStateGuardFactory theSystemStateGuardFactory = (SystemStateGuardFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.be.textbe/textbt/activity/systemStateGuard"); 
			if (theSystemStateGuardFactory != null) {
				return theSystemStateGuardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemStateGuardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStateGuardFactoryImpl() {
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
			case SystemStateGuardPackage.CONJUNCTION: return createConjunction();
			case SystemStateGuardPackage.DISJUNCTION: return createDisjunction();
			case SystemStateGuardPackage.MUTUAL_EXCLUSION: return createMutualExclusion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjunction createConjunction() {
		ConjunctionImpl conjunction = new ConjunctionImpl();
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualExclusion createMutualExclusion() {
		MutualExclusionImpl mutualExclusion = new MutualExclusionImpl();
		return mutualExclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStateGuardPackage getSystemStateGuardPackage() {
		return (SystemStateGuardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemStateGuardPackage getPackage() {
		return SystemStateGuardPackage.eINSTANCE;
	}

} //SystemStateGuardFactoryImpl
