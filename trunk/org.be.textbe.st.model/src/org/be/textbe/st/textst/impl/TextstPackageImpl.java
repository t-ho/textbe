/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst.impl;

import org.be.textbe.st.textst.AbstractBehavior;
import org.be.textbe.st.textst.AbstractBlock;
import org.be.textbe.st.textst.AbstractBlockOrNode;
import org.be.textbe.st.textst.AbstractNode;
import org.be.textbe.st.textst.AlternativeBlock;
import org.be.textbe.st.textst.Component;
import org.be.textbe.st.textst.ComponentList;
import org.be.textbe.st.textst.DefinedByNode;
import org.be.textbe.st.textst.Node;
import org.be.textbe.st.textst.Option;
import org.be.textbe.st.textst.OptionList;
import org.be.textbe.st.textst.ParallelBlock;
import org.be.textbe.st.textst.Qualifier;
import org.be.textbe.st.textst.RelatedToNode;
import org.be.textbe.st.textst.Requirement;
import org.be.textbe.st.textst.RequirementList;
import org.be.textbe.st.textst.SecondaryRelation;
import org.be.textbe.st.textst.StructureTree;
import org.be.textbe.st.textst.SystemComponent;
import org.be.textbe.st.textst.TextST;
import org.be.textbe.st.textst.TextstFactory;
import org.be.textbe.st.textst.TextstPackage;
import org.be.textbe.st.textst.Validity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextstPackageImpl extends EPackageImpl implements TextstPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textSTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureTreeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secondaryRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractBlockOrNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relatedToNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definedByNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parallelBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum qualifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum validityEEnum = null;

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
   * @see org.be.textbe.st.textst.TextstPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TextstPackageImpl()
  {
    super(eNS_URI, TextstFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TextstPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TextstPackage init()
  {
    if (isInited) return (TextstPackage)EPackage.Registry.INSTANCE.getEPackage(TextstPackage.eNS_URI);

    // Obtain or create and register package
    TextstPackageImpl theTextstPackage = (TextstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextstPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTextstPackage.createPackageContents();

    // Initialize created meta-data
    theTextstPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTextstPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TextstPackage.eNS_URI, theTextstPackage);
    return theTextstPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextST()
  {
    return textSTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextST_Options()
  {
    return (EReference)textSTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextST_Requirements()
  {
    return (EReference)textSTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextST_Components()
  {
    return (EReference)textSTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextST_StructureTree()
  {
    return (EReference)textSTEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirementList()
  {
    return requirementListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementList_Requirements()
  {
    return (EReference)requirementListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Ref()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Val()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentList()
  {
    return componentListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentList_Components()
  {
    return (EReference)componentListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionList()
  {
    return optionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionList_Options()
  {
    return (EReference)optionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_Name()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_Value()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureTree()
  {
    return structureTreeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureTree_RootNode()
  {
    return (EReference)structureTreeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Ref()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Val()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Behaviors()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemComponent()
  {
    return systemComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractBehavior()
  {
    return abstractBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecondaryRelation()
  {
    return secondaryRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_BehaviorRef()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_Attribute()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_PrimaryLowerBound()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_PrimaryUpperBound()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_SecondaryLowerBound()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_SecondaryUpperBound()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_ComponentRef()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_ComponentAttribute()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecondaryRelation_RelationName()
  {
    return (EAttribute)secondaryRelationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractBlockOrNode()
  {
    return abstractBlockOrNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractBlock()
  {
    return abstractBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractBlock_ChildNode()
  {
    return (EReference)abstractBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractNode()
  {
    return abstractNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_ComponentRef()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_ComponentSet()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_Mci()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_Qualifier()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_SecondQualifier()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_BehaviorRef()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_RequirementRef()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_TraceabilityStatus()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractNode_Operator()
  {
    return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractNode_ChildNode()
  {
    return (EReference)abstractNodeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelatedToNode()
  {
    return relatedToNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinedByNode()
  {
    return definedByNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParallelBlock()
  {
    return parallelBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternativeBlock()
  {
    return alternativeBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQualifier()
  {
    return qualifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValidity()
  {
    return validityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextstFactory getTextstFactory()
  {
    return (TextstFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    textSTEClass = createEClass(TEXT_ST);
    createEReference(textSTEClass, TEXT_ST__OPTIONS);
    createEReference(textSTEClass, TEXT_ST__REQUIREMENTS);
    createEReference(textSTEClass, TEXT_ST__COMPONENTS);
    createEReference(textSTEClass, TEXT_ST__STRUCTURE_TREE);

    requirementListEClass = createEClass(REQUIREMENT_LIST);
    createEReference(requirementListEClass, REQUIREMENT_LIST__REQUIREMENTS);

    requirementEClass = createEClass(REQUIREMENT);
    createEAttribute(requirementEClass, REQUIREMENT__REF);
    createEAttribute(requirementEClass, REQUIREMENT__VAL);

    componentListEClass = createEClass(COMPONENT_LIST);
    createEReference(componentListEClass, COMPONENT_LIST__COMPONENTS);

    optionListEClass = createEClass(OPTION_LIST);
    createEReference(optionListEClass, OPTION_LIST__OPTIONS);

    optionEClass = createEClass(OPTION);
    createEAttribute(optionEClass, OPTION__NAME);
    createEAttribute(optionEClass, OPTION__VALUE);

    structureTreeEClass = createEClass(STRUCTURE_TREE);
    createEReference(structureTreeEClass, STRUCTURE_TREE__ROOT_NODE);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__REF);
    createEAttribute(componentEClass, COMPONENT__VAL);
    createEReference(componentEClass, COMPONENT__BEHAVIORS);

    systemComponentEClass = createEClass(SYSTEM_COMPONENT);

    abstractBehaviorEClass = createEClass(ABSTRACT_BEHAVIOR);

    secondaryRelationEClass = createEClass(SECONDARY_RELATION);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__BEHAVIOR_REF);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__ATTRIBUTE);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__PRIMARY_LOWER_BOUND);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__PRIMARY_UPPER_BOUND);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__SECONDARY_LOWER_BOUND);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__SECONDARY_UPPER_BOUND);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__COMPONENT_REF);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__COMPONENT_ATTRIBUTE);
    createEAttribute(secondaryRelationEClass, SECONDARY_RELATION__RELATION_NAME);

    abstractBlockOrNodeEClass = createEClass(ABSTRACT_BLOCK_OR_NODE);

    abstractBlockEClass = createEClass(ABSTRACT_BLOCK);
    createEReference(abstractBlockEClass, ABSTRACT_BLOCK__CHILD_NODE);

    abstractNodeEClass = createEClass(ABSTRACT_NODE);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__COMPONENT_REF);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__COMPONENT_SET);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__MCI);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__QUALIFIER);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__SECOND_QUALIFIER);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__BEHAVIOR_REF);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__REQUIREMENT_REF);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__TRACEABILITY_STATUS);
    createEAttribute(abstractNodeEClass, ABSTRACT_NODE__OPERATOR);
    createEReference(abstractNodeEClass, ABSTRACT_NODE__CHILD_NODE);

    nodeEClass = createEClass(NODE);

    relatedToNodeEClass = createEClass(RELATED_TO_NODE);

    definedByNodeEClass = createEClass(DEFINED_BY_NODE);

    parallelBlockEClass = createEClass(PARALLEL_BLOCK);

    alternativeBlockEClass = createEClass(ALTERNATIVE_BLOCK);

    // Create enums
    qualifierEEnum = createEEnum(QUALIFIER);
    validityEEnum = createEEnum(VALIDITY);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    systemComponentEClass.getESuperTypes().add(this.getComponent());
    secondaryRelationEClass.getESuperTypes().add(this.getAbstractBehavior());
    abstractBlockEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
    abstractNodeEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
    nodeEClass.getESuperTypes().add(this.getAbstractNode());
    relatedToNodeEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
    relatedToNodeEClass.getESuperTypes().add(this.getAbstractNode());
    definedByNodeEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
    definedByNodeEClass.getESuperTypes().add(this.getAbstractNode());
    parallelBlockEClass.getESuperTypes().add(this.getAbstractBlock());
    alternativeBlockEClass.getESuperTypes().add(this.getAbstractBlock());

    // Initialize classes and features; add operations and parameters
    initEClass(textSTEClass, TextST.class, "TextST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextST_Options(), this.getOptionList(), null, "options", null, 0, 1, TextST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextST_Requirements(), this.getRequirementList(), null, "requirements", null, 0, 1, TextST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextST_Components(), this.getComponentList(), null, "components", null, 0, 1, TextST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextST_StructureTree(), this.getStructureTree(), null, "structureTree", null, 1, 1, TextST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementListEClass, RequirementList.class, "RequirementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequirementList_Requirements(), this.getRequirement(), null, "requirements", null, 1, -1, RequirementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirement_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Val(), ecorePackage.getEString(), "val", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentListEClass, ComponentList.class, "ComponentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentList_Components(), this.getComponent(), null, "components", null, 0, -1, ComponentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionListEClass, OptionList.class, "OptionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionList_Options(), this.getOption(), null, "options", null, 1, -1, OptionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOption_Name(), ecorePackage.getEString(), "name", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureTreeEClass, StructureTree.class, "StructureTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructureTree_RootNode(), this.getNode(), null, "rootNode", null, 1, 1, StructureTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_Val(), ecorePackage.getEString(), "val", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Behaviors(), this.getAbstractBehavior(), null, "behaviors", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemComponentEClass, SystemComponent.class, "SystemComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractBehaviorEClass, AbstractBehavior.class, "AbstractBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(secondaryRelationEClass, SecondaryRelation.class, "SecondaryRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSecondaryRelation_BehaviorRef(), ecorePackage.getEString(), "behaviorRef", null, 1, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_PrimaryLowerBound(), ecorePackage.getEString(), "primaryLowerBound", null, 0, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_PrimaryUpperBound(), ecorePackage.getEString(), "primaryUpperBound", null, 0, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_SecondaryLowerBound(), ecorePackage.getEString(), "secondaryLowerBound", null, 0, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_SecondaryUpperBound(), ecorePackage.getEString(), "secondaryUpperBound", null, 0, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_ComponentRef(), ecorePackage.getEString(), "componentRef", null, 1, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_ComponentAttribute(), ecorePackage.getEString(), "componentAttribute", null, 0, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSecondaryRelation_RelationName(), ecorePackage.getEString(), "relationName", null, 0, 1, SecondaryRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractBlockOrNodeEClass, AbstractBlockOrNode.class, "AbstractBlockOrNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractBlockEClass, AbstractBlock.class, "AbstractBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractBlock_ChildNode(), this.getAbstractNode(), null, "childNode", null, 2, -1, AbstractBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractNode_ComponentRef(), ecorePackage.getEString(), "componentRef", null, 1, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_ComponentSet(), ecorePackage.getEString(), "componentSet", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_Mci(), ecorePackage.getEString(), "mci", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_Qualifier(), this.getQualifier(), "qualifier", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_SecondQualifier(), this.getQualifier(), "secondQualifier", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_BehaviorRef(), ecorePackage.getEString(), "behaviorRef", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_RequirementRef(), ecorePackage.getEString(), "requirementRef", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_TraceabilityStatus(), this.getValidity(), "traceabilityStatus", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractNode_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractNode_ChildNode(), this.getAbstractBlockOrNode(), null, "childNode", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relatedToNodeEClass, RelatedToNode.class, "RelatedToNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definedByNodeEClass, DefinedByNode.class, "DefinedByNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parallelBlockEClass, ParallelBlock.class, "ParallelBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alternativeBlockEClass, AlternativeBlock.class, "AlternativeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(qualifierEEnum, Qualifier.class, "Qualifier");
    addEEnumLiteral(qualifierEEnum, Qualifier.NULL);
    addEEnumLiteral(qualifierEEnum, Qualifier.NEGATED);
    addEEnumLiteral(qualifierEEnum, Qualifier.CONDITIONAL);
    addEEnumLiteral(qualifierEEnum, Qualifier.ASSERTION);

    initEEnum(validityEEnum, Validity.class, "Validity");
    addEEnumLiteral(validityEEnum, Validity.VALID);
    addEEnumLiteral(validityEEnum, Validity.IMPLIED);
    addEEnumLiteral(validityEEnum, Validity.INVALID);
    addEEnumLiteral(validityEEnum, Validity.DELETED);
    addEEnumLiteral(validityEEnum, Validity.REFINED);
    addEEnumLiteral(validityEEnum, Validity.UPDATED);

    // Create resource
    createResource(eNS_URI);
  }

} //TextstPackageImpl
