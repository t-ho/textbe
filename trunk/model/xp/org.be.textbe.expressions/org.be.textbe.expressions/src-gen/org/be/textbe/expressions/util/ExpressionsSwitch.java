/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions.util;

import org.be.textbe.expressions.AtLeastOne;
import org.be.textbe.expressions.AttributeRealisation;
import org.be.textbe.expressions.Behavior;
import org.be.textbe.expressions.BehaviorNode;
import org.be.textbe.expressions.BinaryExpression;
import org.be.textbe.expressions.BinaryRelation;
import org.be.textbe.expressions.BracketedExpression;
import org.be.textbe.expressions.Cardinality;
import org.be.textbe.expressions.ComponentInstantiation;
import org.be.textbe.expressions.ComponentInstantiationNode;
import org.be.textbe.expressions.EnumeratedSet;
import org.be.textbe.expressions.Event;
import org.be.textbe.expressions.ExpressionsPackage;
import org.be.textbe.expressions.ExternalInputEvent;
import org.be.textbe.expressions.ExternalOutputEvent;
import org.be.textbe.expressions.ForAll;
import org.be.textbe.expressions.ForOneArbitrary;
import org.be.textbe.expressions.ForSome;
import org.be.textbe.expressions.FunctionApplication;
import org.be.textbe.expressions.FuzzyExp;
import org.be.textbe.expressions.Guard;
import org.be.textbe.expressions.InternalInputEvent;
import org.be.textbe.expressions.InternalOutputEvent;
import org.be.textbe.expressions.Node;
import org.be.textbe.expressions.Reference;
import org.be.textbe.expressions.Selection;
import org.be.textbe.expressions.StateRealisation;
import org.be.textbe.expressions.Value;

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
 * @see org.be.textbe.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpressionsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpressionsPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ExpressionsPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.BEHAVIOR_NODE:
      {
        BehaviorNode behaviorNode = (BehaviorNode)theEObject;
        T result = caseBehaviorNode(behaviorNode);
        if (result == null) result = caseNode(behaviorNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.BEHAVIOR:
      {
        Behavior behavior = (Behavior)theEObject;
        T result = caseBehavior(behavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.STATE_REALISATION:
      {
        StateRealisation stateRealisation = (StateRealisation)theEObject;
        T result = caseStateRealisation(stateRealisation);
        if (result == null) result = caseBehavior(stateRealisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.ATTRIBUTE_REALISATION:
      {
        AttributeRealisation attributeRealisation = (AttributeRealisation)theEObject;
        T result = caseAttributeRealisation(attributeRealisation);
        if (result == null) result = caseBehavior(attributeRealisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.SELECTION:
      {
        Selection selection = (Selection)theEObject;
        T result = caseSelection(selection);
        if (result == null) result = caseBehavior(selection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseBehavior(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.GUARD:
      {
        Guard guard = (Guard)theEObject;
        T result = caseGuard(guard);
        if (result == null) result = caseBehavior(guard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.INTERNAL_OUTPUT_EVENT:
      {
        InternalOutputEvent internalOutputEvent = (InternalOutputEvent)theEObject;
        T result = caseInternalOutputEvent(internalOutputEvent);
        if (result == null) result = caseBehavior(internalOutputEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.INTERNAL_INPUT_EVENT:
      {
        InternalInputEvent internalInputEvent = (InternalInputEvent)theEObject;
        T result = caseInternalInputEvent(internalInputEvent);
        if (result == null) result = caseBehavior(internalInputEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.EXTERNAL_OUTPUT_EVENT:
      {
        ExternalOutputEvent externalOutputEvent = (ExternalOutputEvent)theEObject;
        T result = caseExternalOutputEvent(externalOutputEvent);
        if (result == null) result = caseBehavior(externalOutputEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.EXTERNAL_INPUT_EVENT:
      {
        ExternalInputEvent externalInputEvent = (ExternalInputEvent)theEObject;
        T result = caseExternalInputEvent(externalInputEvent);
        if (result == null) result = caseBehavior(externalInputEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.COMPONENT_INSTANTIATION_NODE:
      {
        ComponentInstantiationNode componentInstantiationNode = (ComponentInstantiationNode)theEObject;
        T result = caseComponentInstantiationNode(componentInstantiationNode);
        if (result == null) result = caseNode(componentInstantiationNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.FOR_ALL:
      {
        ForAll forAll = (ForAll)theEObject;
        T result = caseForAll(forAll);
        if (result == null) result = caseComponentInstantiationNode(forAll);
        if (result == null) result = caseNode(forAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.FOR_SOME:
      {
        ForSome forSome = (ForSome)theEObject;
        T result = caseForSome(forSome);
        if (result == null) result = caseComponentInstantiationNode(forSome);
        if (result == null) result = caseNode(forSome);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.AT_LEAST_ONE:
      {
        AtLeastOne atLeastOne = (AtLeastOne)theEObject;
        T result = caseAtLeastOne(atLeastOne);
        if (result == null) result = caseComponentInstantiationNode(atLeastOne);
        if (result == null) result = caseNode(atLeastOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.FOR_ONE_ARBITRARY:
      {
        ForOneArbitrary forOneArbitrary = (ForOneArbitrary)theEObject;
        T result = caseForOneArbitrary(forOneArbitrary);
        if (result == null) result = caseComponentInstantiationNode(forOneArbitrary);
        if (result == null) result = caseNode(forOneArbitrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.COMPONENT_INSTANTIATION:
      {
        ComponentInstantiation componentInstantiation = (ComponentInstantiation)theEObject;
        T result = caseComponentInstantiation(componentInstantiation);
        if (result == null) result = caseForAll(componentInstantiation);
        if (result == null) result = caseForSome(componentInstantiation);
        if (result == null) result = caseAtLeastOne(componentInstantiation);
        if (result == null) result = caseForOneArbitrary(componentInstantiation);
        if (result == null) result = caseComponentInstantiationNode(componentInstantiation);
        if (result == null) result = caseNode(componentInstantiation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.BINARY_RELATION:
      {
        BinaryRelation binaryRelation = (BinaryRelation)theEObject;
        T result = caseBinaryRelation(binaryRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.BINARY_EXPRESSION:
      {
        BinaryExpression binaryExpression = (BinaryExpression)theEObject;
        T result = caseBinaryExpression(binaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseValue(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.NUMBER:
      {
        org.be.textbe.expressions.Number number = (org.be.textbe.expressions.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseValue(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.FUNCTION_APPLICATION:
      {
        FunctionApplication functionApplication = (FunctionApplication)theEObject;
        T result = caseFunctionApplication(functionApplication);
        if (result == null) result = caseSelection(functionApplication);
        if (result == null) result = caseEvent(functionApplication);
        if (result == null) result = caseInternalOutputEvent(functionApplication);
        if (result == null) result = caseInternalInputEvent(functionApplication);
        if (result == null) result = caseExternalOutputEvent(functionApplication);
        if (result == null) result = caseExternalInputEvent(functionApplication);
        if (result == null) result = caseValue(functionApplication);
        if (result == null) result = caseBehavior(functionApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.BRACKETED_EXPRESSION:
      {
        BracketedExpression bracketedExpression = (BracketedExpression)theEObject;
        T result = caseBracketedExpression(bracketedExpression);
        if (result == null) result = caseValue(bracketedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.CARDINALITY:
      {
        Cardinality cardinality = (Cardinality)theEObject;
        T result = caseCardinality(cardinality);
        if (result == null) result = caseValue(cardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.ENUMERATED_SET:
      {
        EnumeratedSet enumeratedSet = (EnumeratedSet)theEObject;
        T result = caseEnumeratedSet(enumeratedSet);
        if (result == null) result = caseValue(enumeratedSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionsPackage.FUZZY_EXP:
      {
        FuzzyExp fuzzyExp = (FuzzyExp)theEObject;
        T result = caseFuzzyExp(fuzzyExp);
        if (result == null) result = caseValue(fuzzyExp);
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
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviorNode(BehaviorNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehavior(Behavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Realisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Realisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateRealisation(StateRealisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Realisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Realisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeRealisation(AttributeRealisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelection(Selection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuard(Guard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Output Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Output Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalOutputEvent(InternalOutputEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Input Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Input Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalInputEvent(InternalInputEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Output Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Output Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalOutputEvent(ExternalOutputEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Input Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Input Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalInputEvent(ExternalInputEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Instantiation Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Instantiation Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentInstantiationNode(ComponentInstantiationNode object)
  {
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
  public T caseForAll(ForAll object)
  {
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
  public T caseForSome(ForSome object)
  {
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
  public T caseAtLeastOne(AtLeastOne object)
  {
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
  public T caseForOneArbitrary(ForOneArbitrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Instantiation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Instantiation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentInstantiation(ComponentInstantiation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryRelation(BinaryRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpression(BinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(org.be.textbe.expressions.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionApplication(FunctionApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracketed Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracketed Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBracketedExpression(BracketedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCardinality(Cardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumerated Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumerated Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeratedSet(EnumeratedSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fuzzy Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fuzzy Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuzzyExp(FuzzyExp object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ExpressionsSwitch
