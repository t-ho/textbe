/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.util;

import org.be.textbe.bt.v1.textbt.*;

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
 * @see org.be.textbe.bt.v1.textbt.TextbtPackage
 * @generated
 */
public class TextbtSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextbtPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextbtSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TextbtPackage.eINSTANCE;
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
      case TextbtPackage.SPECIFICATION:
      {
        Specification specification = (Specification)theEObject;
        T result = caseSpecification(specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = caseNamedElement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseNamedElement(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.BEHAVIOR:
      {
        Behavior behavior = (Behavior)theEObject;
        T result = caseBehavior(behavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.STATE_REALIZATION:
      {
        StateRealization stateRealization = (StateRealization)theEObject;
        T result = caseStateRealization(stateRealization);
        if (result == null) result = caseNamedBehavior(stateRealization);
        if (result == null) result = caseNamedElement(stateRealization);
        if (result == null) result = caseBehavior(stateRealization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.SELECTION:
      {
        Selection selection = (Selection)theEObject;
        T result = caseSelection(selection);
        if (result == null) result = caseNamedBehavior(selection);
        if (result == null) result = caseNamedElement(selection);
        if (result == null) result = caseBehavior(selection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseNamedBehavior(event);
        if (result == null) result = caseNamedElement(event);
        if (result == null) result = caseBehavior(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.GUARD:
      {
        Guard guard = (Guard)theEObject;
        T result = caseGuard(guard);
        if (result == null) result = caseNamedBehavior(guard);
        if (result == null) result = caseNamedElement(guard);
        if (result == null) result = caseBehavior(guard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.INTERNAL_INPUT:
      {
        InternalInput internalInput = (InternalInput)theEObject;
        T result = caseInternalInput(internalInput);
        if (result == null) result = caseInput(internalInput);
        if (result == null) result = caseEvent(internalInput);
        if (result == null) result = caseNamedBehavior(internalInput);
        if (result == null) result = caseNamedElement(internalInput);
        if (result == null) result = caseBehavior(internalInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.INTERNAL_OUTPUT:
      {
        InternalOutput internalOutput = (InternalOutput)theEObject;
        T result = caseInternalOutput(internalOutput);
        if (result == null) result = caseOutput(internalOutput);
        if (result == null) result = caseEvent(internalOutput);
        if (result == null) result = caseNamedBehavior(internalOutput);
        if (result == null) result = caseNamedElement(internalOutput);
        if (result == null) result = caseBehavior(internalOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.EXTERNAL_INPUT:
      {
        ExternalInput externalInput = (ExternalInput)theEObject;
        T result = caseExternalInput(externalInput);
        if (result == null) result = caseInput(externalInput);
        if (result == null) result = caseEvent(externalInput);
        if (result == null) result = caseNamedBehavior(externalInput);
        if (result == null) result = caseNamedElement(externalInput);
        if (result == null) result = caseBehavior(externalInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.EXTERNAL_OUTPUT:
      {
        ExternalOutput externalOutput = (ExternalOutput)theEObject;
        T result = caseExternalOutput(externalOutput);
        if (result == null) result = caseOutput(externalOutput);
        if (result == null) result = caseEvent(externalOutput);
        if (result == null) result = caseNamedBehavior(externalOutput);
        if (result == null) result = caseNamedElement(externalOutput);
        if (result == null) result = caseBehavior(externalOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseEvent(input);
        if (result == null) result = caseNamedBehavior(input);
        if (result == null) result = caseNamedElement(input);
        if (result == null) result = caseBehavior(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = caseEvent(output);
        if (result == null) result = caseNamedBehavior(output);
        if (result == null) result = caseNamedElement(output);
        if (result == null) result = caseBehavior(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.TRACEABILITY_LINK:
      {
        TraceabilityLink traceabilityLink = (TraceabilityLink)theEObject;
        T result = caseTraceabilityLink(traceabilityLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.BEHAVIOR_TREE:
      {
        BehaviorTree behaviorTree = (BehaviorTree)theEObject;
        T result = caseBehaviorTree(behaviorTree);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.SEQUENCE:
      {
        Sequence sequence = (Sequence)theEObject;
        T result = caseSequence(sequence);
        if (result == null) result = caseBehaviorTree(sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.BRANCH:
      {
        Branch branch = (Branch)theEObject;
        T result = caseBranch(branch);
        if (result == null) result = caseBehaviorTree(branch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.PARALLEL:
      {
        Parallel parallel = (Parallel)theEObject;
        T result = caseParallel(parallel);
        if (result == null) result = caseBranch(parallel);
        if (result == null) result = caseBehaviorTree(parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.ALTERNATIVE:
      {
        Alternative alternative = (Alternative)theEObject;
        T result = caseAlternative(alternative);
        if (result == null) result = caseBranch(alternative);
        if (result == null) result = caseBehaviorTree(alternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.ATOMIC:
      {
        Atomic atomic = (Atomic)theEObject;
        T result = caseAtomic(atomic);
        if (result == null) result = caseSequence(atomic);
        if (result == null) result = caseBehaviorTree(atomic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.INTERLEAVING:
      {
        Interleaving interleaving = (Interleaving)theEObject;
        T result = caseInterleaving(interleaving);
        if (result == null) result = caseSequence(interleaving);
        if (result == null) result = caseBehaviorTree(interleaving);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = caseNamedBehavior(assertion);
        if (result == null) result = caseNamedElement(assertion);
        if (result == null) result = caseBehavior(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.WHO:
      {
        Who who = (Who)theEObject;
        T result = caseWho(who);
        if (result == null) result = caseFreeTextRelation(who);
        if (result == null) result = caseRelation(who);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.WHAT:
      {
        What what = (What)theEObject;
        T result = caseWhat(what);
        if (result == null) result = caseFreeTextRelation(what);
        if (result == null) result = caseRelation(what);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.WHERE:
      {
        Where where = (Where)theEObject;
        T result = caseWhere(where);
        if (result == null) result = caseFreeTextRelation(where);
        if (result == null) result = caseRelation(where);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.WHEN:
      {
        When when = (When)theEObject;
        T result = caseWhen(when);
        if (result == null) result = caseFreeTextRelation(when);
        if (result == null) result = caseRelation(when);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.WHY:
      {
        Why why = (Why)theEObject;
        T result = caseWhy(why);
        if (result == null) result = caseFreeTextRelation(why);
        if (result == null) result = caseRelation(why);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.FREE_TEXT_RELATION:
      {
        FreeTextRelation freeTextRelation = (FreeTextRelation)theEObject;
        T result = caseFreeTextRelation(freeTextRelation);
        if (result == null) result = caseRelation(freeTextRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.HOW:
      {
        How how = (How)theEObject;
        T result = caseHow(how);
        if (result == null) result = caseFreeTextRelation(how);
        if (result == null) result = caseRelation(how);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.ATTRIBUTE_REALIZATION:
      {
        AttributeRealization attributeRealization = (AttributeRealization)theEObject;
        T result = caseAttributeRealization(attributeRealization);
        if (result == null) result = caseNamedBehavior(attributeRealization);
        if (result == null) result = caseNamedElement(attributeRealization);
        if (result == null) result = caseBehavior(attributeRealization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.NAMED_BEHAVIOR:
      {
        NamedBehavior namedBehavior = (NamedBehavior)theEObject;
        T result = caseNamedBehavior(namedBehavior);
        if (result == null) result = caseNamedElement(namedBehavior);
        if (result == null) result = caseBehavior(namedBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextbtPackage.SYSTEM_COMPONENT:
      {
        SystemComponent systemComponent = (SystemComponent)theEObject;
        T result = caseSystemComponent(systemComponent);
        if (result == null) result = caseComponent(systemComponent);
        if (result == null) result = caseNamedElement(systemComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecification(Specification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
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
   * Returns the result of interpreting the object as an instance of '<em>State Realization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Realization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateRealization(StateRealization object)
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
   * Returns the result of interpreting the object as an instance of '<em>Internal Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalInput(InternalInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalOutput(InternalOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalInput(ExternalInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalOutput(ExternalOutput object)
  {
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
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Traceability Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Traceability Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceabilityLink(TraceabilityLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior Tree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior Tree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviorTree(BehaviorTree object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequence(Sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBranch(Branch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallel(Parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternative(Alternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomic(Atomic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interleaving</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interleaving</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterleaving(Interleaving object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertion(Assertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Who</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Who</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWho(Who object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>What</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>What</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhat(What object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhere(Where object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhen(When object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Why</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Why</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhy(Why object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Text Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Text Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeTextRelation(FreeTextRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>How</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>How</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHow(How object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Realization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Realization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeRealization(AttributeRealization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedBehavior(NamedBehavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemComponent(SystemComponent object)
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

} //TextbtSwitch
