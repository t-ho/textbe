/**
 */
package org.be.textbe.bt.textbt.node.quantifying.util;

import org.be.textbe.bt.textbt.node.Node;

import org.be.textbe.bt.textbt.node.quantifying.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.textbt.node.quantifying.QuantifyingPackage
 * @generated
 */
public class QuantifyingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuantifyingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifyingSwitch() {
		if (modelPackage == null) {
			modelPackage = QuantifyingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QuantifyingPackage.QUANTIFYING_NODE: {
				QuantifyingNode quantifyingNode = (QuantifyingNode)theEObject;
				T result = caseQuantifyingNode(quantifyingNode);
				if (result == null) result = caseNode(quantifyingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifyingPackage.FOR_ALL: {
				ForAll forAll = (ForAll)theEObject;
				T result = caseForAll(forAll);
				if (result == null) result = caseQuantifyingNode(forAll);
				if (result == null) result = caseNode(forAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifyingPackage.FOR_SOME: {
				ForSome forSome = (ForSome)theEObject;
				T result = caseForSome(forSome);
				if (result == null) result = caseQuantifyingNode(forSome);
				if (result == null) result = caseNode(forSome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifyingPackage.AT_LEAST_ONE: {
				AtLeastOne atLeastOne = (AtLeastOne)theEObject;
				T result = caseAtLeastOne(atLeastOne);
				if (result == null) result = caseQuantifyingNode(atLeastOne);
				if (result == null) result = caseNode(atLeastOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifyingPackage.FOR_ONE_ARBITRARY: {
				ForOneArbitrary forOneArbitrary = (ForOneArbitrary)theEObject;
				T result = caseForOneArbitrary(forOneArbitrary);
				if (result == null) result = caseQuantifyingNode(forOneArbitrary);
				if (result == null) result = caseNode(forOneArbitrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifyingPackage.TEXTUAL_COMPONENT_SET_DEFINITION: {
				TextualComponentSetDefinition textualComponentSetDefinition = (TextualComponentSetDefinition)theEObject;
				T result = caseTextualComponentSetDefinition(textualComponentSetDefinition);
				if (result == null) result = caseComponentSetDefinition(textualComponentSetDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifyingPackage.COMPONENT_SET_DEFINITION: {
				ComponentSetDefinition componentSetDefinition = (ComponentSetDefinition)theEObject;
				T result = caseComponentSetDefinition(componentSetDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifyingNode(QuantifyingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForAll(ForAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Some</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Some</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForSome(ForSome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Least One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Least One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtLeastOne(AtLeastOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For One Arbitrary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For One Arbitrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForOneArbitrary(ForOneArbitrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Component Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Component Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualComponentSetDefinition(TextualComponentSetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSetDefinition(ComponentSetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuantifyingSwitch
