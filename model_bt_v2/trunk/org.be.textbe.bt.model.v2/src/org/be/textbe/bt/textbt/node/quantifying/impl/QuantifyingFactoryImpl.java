/**
 */
package org.be.textbe.bt.textbt.node.quantifying.impl;

import org.be.textbe.bt.textbt.node.quantifying.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class QuantifyingFactoryImpl extends EFactoryImpl implements QuantifyingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuantifyingFactory init() {
		try {
			QuantifyingFactory theQuantifyingFactory = (QuantifyingFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.be.textbe/textbt/node/quantifying"); 
			if (theQuantifyingFactory != null) {
				return theQuantifyingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuantifyingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifyingFactoryImpl() {
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
			case QuantifyingPackage.FOR_ALL: return createForAll();
			case QuantifyingPackage.FOR_SOME: return createForSome();
			case QuantifyingPackage.AT_LEAST_ONE: return createAtLeastOne();
			case QuantifyingPackage.FOR_ONE_ARBITRARY: return createForOneArbitrary();
			case QuantifyingPackage.TEXTUAL_COMPONENT_SET_DEFINITION: return createTextualComponentSetDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QuantifyingPackage.COMPONENT_SET_DEFINITION_EXPRESSION:
				return createComponentSetDefinitionExpressionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QuantifyingPackage.COMPONENT_SET_DEFINITION_EXPRESSION:
				return convertComponentSetDefinitionExpressionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAll createForAll() {
		ForAllImpl forAll = new ForAllImpl();
		return forAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForSome createForSome() {
		ForSomeImpl forSome = new ForSomeImpl();
		return forSome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtLeastOne createAtLeastOne() {
		AtLeastOneImpl atLeastOne = new AtLeastOneImpl();
		return atLeastOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForOneArbitrary createForOneArbitrary() {
		ForOneArbitraryImpl forOneArbitrary = new ForOneArbitraryImpl();
		return forOneArbitrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualComponentSetDefinition createTextualComponentSetDefinition() {
		TextualComponentSetDefinitionImpl textualComponentSetDefinition = new TextualComponentSetDefinitionImpl();
		return textualComponentSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createComponentSetDefinitionExpressionFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentSetDefinitionExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifyingPackage getQuantifyingPackage() {
		return (QuantifyingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuantifyingPackage getPackage() {
		return QuantifyingPackage.eINSTANCE;
	}

} //QuantifyingFactoryImpl
