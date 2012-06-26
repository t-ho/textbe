/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst.util;

import org.be.textbe.st.textst.*;

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
 * @see org.be.textbe.st.textst.TextstPackage
 * @generated
 */
public class TextstSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextstPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextstSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TextstPackage.eINSTANCE;
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
      case TextstPackage.TEXT_ST:
      {
        TextST textST = (TextST)theEObject;
        T result = caseTextST(textST);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.REQUIREMENT_LIST:
      {
        RequirementList requirementList = (RequirementList)theEObject;
        T result = caseRequirementList(requirementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.COMPONENT_LIST:
      {
        ComponentList componentList = (ComponentList)theEObject;
        T result = caseComponentList(componentList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.OPTION_LIST:
      {
        OptionList optionList = (OptionList)theEObject;
        T result = caseOptionList(optionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.STRUCTURE_TREE:
      {
        StructureTree structureTree = (StructureTree)theEObject;
        T result = caseStructureTree(structureTree);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.SYSTEM_COMPONENT:
      {
        SystemComponent systemComponent = (SystemComponent)theEObject;
        T result = caseSystemComponent(systemComponent);
        if (result == null) result = caseComponent(systemComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.ABSTRACT_BEHAVIOR:
      {
        AbstractBehavior abstractBehavior = (AbstractBehavior)theEObject;
        T result = caseAbstractBehavior(abstractBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.SECONDARY_RELATION:
      {
        SecondaryRelation secondaryRelation = (SecondaryRelation)theEObject;
        T result = caseSecondaryRelation(secondaryRelation);
        if (result == null) result = caseAbstractBehavior(secondaryRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.ABSTRACT_BLOCK_OR_NODE:
      {
        AbstractBlockOrNode abstractBlockOrNode = (AbstractBlockOrNode)theEObject;
        T result = caseAbstractBlockOrNode(abstractBlockOrNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.ABSTRACT_BLOCK:
      {
        AbstractBlock abstractBlock = (AbstractBlock)theEObject;
        T result = caseAbstractBlock(abstractBlock);
        if (result == null) result = caseAbstractBlockOrNode(abstractBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.ABSTRACT_NODE:
      {
        AbstractNode abstractNode = (AbstractNode)theEObject;
        T result = caseAbstractNode(abstractNode);
        if (result == null) result = caseAbstractBlockOrNode(abstractNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = caseAbstractNode(node);
        if (result == null) result = caseAbstractBlockOrNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.RELATED_TO_NODE:
      {
        RelatedToNode relatedToNode = (RelatedToNode)theEObject;
        T result = caseRelatedToNode(relatedToNode);
        if (result == null) result = caseAbstractNode(relatedToNode);
        if (result == null) result = caseAbstractBlockOrNode(relatedToNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.DEFINED_BY_NODE:
      {
        DefinedByNode definedByNode = (DefinedByNode)theEObject;
        T result = caseDefinedByNode(definedByNode);
        if (result == null) result = caseAbstractNode(definedByNode);
        if (result == null) result = caseAbstractBlockOrNode(definedByNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.PARALLEL_BLOCK:
      {
        ParallelBlock parallelBlock = (ParallelBlock)theEObject;
        T result = caseParallelBlock(parallelBlock);
        if (result == null) result = caseAbstractBlock(parallelBlock);
        if (result == null) result = caseAbstractBlockOrNode(parallelBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextstPackage.ALTERNATIVE_BLOCK:
      {
        AlternativeBlock alternativeBlock = (AlternativeBlock)theEObject;
        T result = caseAlternativeBlock(alternativeBlock);
        if (result == null) result = caseAbstractBlock(alternativeBlock);
        if (result == null) result = caseAbstractBlockOrNode(alternativeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text ST</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text ST</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextST(TextST object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementList(RequirementList object)
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
   * Returns the result of interpreting the object as an instance of '<em>Component List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentList(ComponentList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionList(OptionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOption(Option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Tree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Tree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureTree(StructureTree object)
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
   * Returns the result of interpreting the object as an instance of '<em>Abstract Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractBehavior(AbstractBehavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Secondary Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Secondary Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecondaryRelation(SecondaryRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Block Or Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Block Or Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractBlockOrNode(AbstractBlockOrNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractBlock(AbstractBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractNode(AbstractNode object)
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
   * Returns the result of interpreting the object as an instance of '<em>Related To Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Related To Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelatedToNode(RelatedToNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defined By Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defined By Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinedByNode(DefinedByNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallelBlock(ParallelBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternativeBlock(AlternativeBlock object)
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

} //TextstSwitch
