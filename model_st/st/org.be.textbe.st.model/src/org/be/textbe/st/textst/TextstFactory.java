/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.st.textst.TextstPackage
 * @generated
 */
public interface TextstFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextstFactory eINSTANCE = org.be.textbe.st.textst.impl.TextstFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Text ST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text ST</em>'.
   * @generated
   */
  TextST createTextST();

  /**
   * Returns a new object of class '<em>Requirement List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement List</em>'.
   * @generated
   */
  RequirementList createRequirementList();

  /**
   * Returns a new object of class '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement</em>'.
   * @generated
   */
  Requirement createRequirement();

  /**
   * Returns a new object of class '<em>Component List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component List</em>'.
   * @generated
   */
  ComponentList createComponentList();

  /**
   * Returns a new object of class '<em>Option List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option List</em>'.
   * @generated
   */
  OptionList createOptionList();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Structure Tree</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Tree</em>'.
   * @generated
   */
  StructureTree createStructureTree();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>System Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Component</em>'.
   * @generated
   */
  SystemComponent createSystemComponent();

  /**
   * Returns a new object of class '<em>Secondary Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Secondary Relation</em>'.
   * @generated
   */
  SecondaryRelation createSecondaryRelation();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Related To Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Related To Node</em>'.
   * @generated
   */
  RelatedToNode createRelatedToNode();

  /**
   * Returns a new object of class '<em>Defined By Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defined By Node</em>'.
   * @generated
   */
  DefinedByNode createDefinedByNode();

  /**
   * Returns a new object of class '<em>Parallel Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parallel Block</em>'.
   * @generated
   */
  ParallelBlock createParallelBlock();

  /**
   * Returns a new object of class '<em>Alternative Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative Block</em>'.
   * @generated
   */
  AlternativeBlock createAlternativeBlock();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TextstPackage getTextstPackage();

} //TextstFactory
