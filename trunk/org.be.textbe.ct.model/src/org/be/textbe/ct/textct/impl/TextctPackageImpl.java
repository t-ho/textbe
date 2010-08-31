/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct.impl;

import org.be.textbe.ct.textct.AbstractBehavior;
import org.be.textbe.ct.textct.AbstractBlock;
import org.be.textbe.ct.textct.AbstractBlockOrNode;
import org.be.textbe.ct.textct.AbstractNode;
import org.be.textbe.ct.textct.AggregatedBlock;
import org.be.textbe.ct.textct.AggregatedNode;
import org.be.textbe.ct.textct.AlternativeBlock;
import org.be.textbe.ct.textct.Assertion;
import org.be.textbe.ct.textct.AssociatedBlock;
import org.be.textbe.ct.textct.AssociatedNode;
import org.be.textbe.ct.textct.Behavior;
import org.be.textbe.ct.textct.Component;
import org.be.textbe.ct.textct.ComponentList;
import org.be.textbe.ct.textct.CompositionTree;
import org.be.textbe.ct.textct.Event;
import org.be.textbe.ct.textct.ExternalInput;
import org.be.textbe.ct.textct.ExternalOutput;
import org.be.textbe.ct.textct.FiveWs;
import org.be.textbe.ct.textct.Guard;
import org.be.textbe.ct.textct.InheritedBlock;
import org.be.textbe.ct.textct.InheritedNode;
import org.be.textbe.ct.textct.InternalInput;
import org.be.textbe.ct.textct.InternalOutput;
import org.be.textbe.ct.textct.Node;
import org.be.textbe.ct.textct.Option;
import org.be.textbe.ct.textct.OptionList;
import org.be.textbe.ct.textct.Relation;
import org.be.textbe.ct.textct.RelationalBehavior;
import org.be.textbe.ct.textct.Requirement;
import org.be.textbe.ct.textct.RequirementList;
import org.be.textbe.ct.textct.Selection;
import org.be.textbe.ct.textct.State;
import org.be.textbe.ct.textct.SystemComponent;
import org.be.textbe.ct.textct.TextCT;
import org.be.textbe.ct.textct.TextctFactory;
import org.be.textbe.ct.textct.TextctPackage;
import org.be.textbe.ct.textct.Validity;

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
public class TextctPackageImpl extends EPackageImpl implements TextctPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass textCTEClass = null;

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
  private EClass compositionTreeEClass = null;

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
  private EClass relationalBehaviorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass relationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass behaviorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass selectionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass guardEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass internalInputEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass internalOutputEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass externalInputEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass externalOutputEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass assertionEClass = null;

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
  private EClass nodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass aggregatedNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass inheritedNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass associatedNodeEClass = null;

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
  private EClass aggregatedBlockEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass associatedBlockEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass inheritedBlockEClass = null;

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
  private EEnum fiveWsEEnum = null;

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
	 * @see org.be.textbe.ct.textct.TextctPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private TextctPackageImpl()
  {
		super(eNS_URI, TextctFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TextctPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static TextctPackage init()
  {
		if (isInited) return (TextctPackage)EPackage.Registry.INSTANCE.getEPackage(TextctPackage.eNS_URI);

		// Obtain or create and register package
		TextctPackageImpl theTextctPackage = (TextctPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextctPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextctPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTextctPackage.createPackageContents();

		// Initialize created meta-data
		theTextctPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTextctPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TextctPackage.eNS_URI, theTextctPackage);
		return theTextctPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTextCT()
  {
		return textCTEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTextCT_Options()
  {
		return (EReference)textCTEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTextCT_Requirements()
  {
		return (EReference)textCTEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTextCT_Components()
  {
		return (EReference)textCTEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTextCT_CompositionTree()
  {
		return (EReference)textCTEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getComponent_Quantifier()
  {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(3);
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
  public EClass getCompositionTree()
  {
		return compositionTreeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCompositionTree_RootNode()
  {
		return (EReference)compositionTreeEClass.getEStructuralFeatures().get(0);
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
  public EClass getRelationalBehavior()
  {
		return relationalBehaviorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationalBehavior_Behavior()
  {
		return (EReference)relationalBehaviorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationalBehavior_Relations()
  {
		return (EReference)relationalBehaviorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRelation()
  {
		return relationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_Question()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_Preposition()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_ComponentRef()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_BehaviorRef()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_Level()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_ComponentLevel()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_ComponentSet()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelation_Mci()
  {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBehavior()
  {
		return behaviorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getBehavior_Ref()
  {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getBehavior_Val()
  {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getBehavior_Relations()
  {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getState()
  {
		return stateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSelection()
  {
		return selectionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEvent()
  {
		return eventEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGuard()
  {
		return guardEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInternalInput()
  {
		return internalInputEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInternalOutput()
  {
		return internalOutputEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getExternalInput()
  {
		return externalInputEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getExternalOutput()
  {
		return externalOutputEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssertion()
  {
		return assertionEClass;
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
  public EClass getNode()
  {
		return nodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAggregatedNode()
  {
		return aggregatedNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInheritedNode()
  {
		return inheritedNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssociatedNode()
  {
		return associatedNodeEClass;
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
  public EClass getAggregatedBlock()
  {
		return aggregatedBlockEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssociatedBlock()
  {
		return associatedBlockEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInheritedBlock()
  {
		return inheritedBlockEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_ComponentRef() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_RequirementRef() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_TraceabilityStatus() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Label() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Operator() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_ComponentSet() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Mci() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_ChildNode() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getFiveWs()
  {
		return fiveWsEEnum;
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
  public TextctFactory getTextctFactory()
  {
		return (TextctFactory)getEFactoryInstance();
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
		textCTEClass = createEClass(TEXT_CT);
		createEReference(textCTEClass, TEXT_CT__OPTIONS);
		createEReference(textCTEClass, TEXT_CT__REQUIREMENTS);
		createEReference(textCTEClass, TEXT_CT__COMPONENTS);
		createEReference(textCTEClass, TEXT_CT__COMPOSITION_TREE);

		requirementListEClass = createEClass(REQUIREMENT_LIST);
		createEReference(requirementListEClass, REQUIREMENT_LIST__REQUIREMENTS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__REF);
		createEAttribute(requirementEClass, REQUIREMENT__VAL);

		componentListEClass = createEClass(COMPONENT_LIST);
		createEReference(componentListEClass, COMPONENT_LIST__COMPONENTS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__REF);
		createEAttribute(componentEClass, COMPONENT__VAL);
		createEReference(componentEClass, COMPONENT__BEHAVIORS);
		createEAttribute(componentEClass, COMPONENT__QUANTIFIER);

		systemComponentEClass = createEClass(SYSTEM_COMPONENT);

		optionListEClass = createEClass(OPTION_LIST);
		createEReference(optionListEClass, OPTION_LIST__OPTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__VALUE);

		compositionTreeEClass = createEClass(COMPOSITION_TREE);
		createEReference(compositionTreeEClass, COMPOSITION_TREE__ROOT_NODE);

		abstractBehaviorEClass = createEClass(ABSTRACT_BEHAVIOR);

		relationalBehaviorEClass = createEClass(RELATIONAL_BEHAVIOR);
		createEReference(relationalBehaviorEClass, RELATIONAL_BEHAVIOR__BEHAVIOR);
		createEReference(relationalBehaviorEClass, RELATIONAL_BEHAVIOR__RELATIONS);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__QUESTION);
		createEAttribute(relationEClass, RELATION__PREPOSITION);
		createEAttribute(relationEClass, RELATION__COMPONENT_REF);
		createEAttribute(relationEClass, RELATION__BEHAVIOR_REF);
		createEAttribute(relationEClass, RELATION__LEVEL);
		createEAttribute(relationEClass, RELATION__COMPONENT_LEVEL);
		createEAttribute(relationEClass, RELATION__COMPONENT_SET);
		createEAttribute(relationEClass, RELATION__MCI);

		behaviorEClass = createEClass(BEHAVIOR);
		createEAttribute(behaviorEClass, BEHAVIOR__REF);
		createEAttribute(behaviorEClass, BEHAVIOR__VAL);
		createEReference(behaviorEClass, BEHAVIOR__RELATIONS);

		stateEClass = createEClass(STATE);

		selectionEClass = createEClass(SELECTION);

		eventEClass = createEClass(EVENT);

		guardEClass = createEClass(GUARD);

		internalInputEClass = createEClass(INTERNAL_INPUT);

		internalOutputEClass = createEClass(INTERNAL_OUTPUT);

		externalInputEClass = createEClass(EXTERNAL_INPUT);

		externalOutputEClass = createEClass(EXTERNAL_OUTPUT);

		assertionEClass = createEClass(ASSERTION);

		abstractBlockOrNodeEClass = createEClass(ABSTRACT_BLOCK_OR_NODE);

		abstractBlockEClass = createEClass(ABSTRACT_BLOCK);
		createEReference(abstractBlockEClass, ABSTRACT_BLOCK__CHILD_NODE);

		nodeEClass = createEClass(NODE);

		aggregatedNodeEClass = createEClass(AGGREGATED_NODE);

		inheritedNodeEClass = createEClass(INHERITED_NODE);

		associatedNodeEClass = createEClass(ASSOCIATED_NODE);

		alternativeBlockEClass = createEClass(ALTERNATIVE_BLOCK);

		aggregatedBlockEClass = createEClass(AGGREGATED_BLOCK);

		associatedBlockEClass = createEClass(ASSOCIATED_BLOCK);

		inheritedBlockEClass = createEClass(INHERITED_BLOCK);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__COMPONENT_REF);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__REQUIREMENT_REF);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__TRACEABILITY_STATUS);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__LABEL);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__OPERATOR);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__COMPONENT_SET);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__MCI);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__CHILD_NODE);

		// Create enums
		fiveWsEEnum = createEEnum(FIVE_WS);
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
		relationalBehaviorEClass.getESuperTypes().add(this.getAbstractBehavior());
		behaviorEClass.getESuperTypes().add(this.getAbstractBehavior());
		stateEClass.getESuperTypes().add(this.getBehavior());
		selectionEClass.getESuperTypes().add(this.getBehavior());
		eventEClass.getESuperTypes().add(this.getBehavior());
		guardEClass.getESuperTypes().add(this.getBehavior());
		internalInputEClass.getESuperTypes().add(this.getBehavior());
		internalOutputEClass.getESuperTypes().add(this.getBehavior());
		externalInputEClass.getESuperTypes().add(this.getBehavior());
		externalOutputEClass.getESuperTypes().add(this.getBehavior());
		assertionEClass.getESuperTypes().add(this.getBehavior());
		abstractBlockEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
		nodeEClass.getESuperTypes().add(this.getAbstractNode());
		aggregatedNodeEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
		aggregatedNodeEClass.getESuperTypes().add(this.getAbstractNode());
		inheritedNodeEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
		inheritedNodeEClass.getESuperTypes().add(this.getAbstractNode());
		associatedNodeEClass.getESuperTypes().add(this.getAbstractBlockOrNode());
		associatedNodeEClass.getESuperTypes().add(this.getAbstractNode());
		alternativeBlockEClass.getESuperTypes().add(this.getAbstractBlock());
		aggregatedBlockEClass.getESuperTypes().add(this.getAbstractBlock());
		associatedBlockEClass.getESuperTypes().add(this.getAbstractBlock());
		inheritedBlockEClass.getESuperTypes().add(this.getAbstractBlock());
		abstractNodeEClass.getESuperTypes().add(this.getAbstractBlockOrNode());

		// Initialize classes and features; add operations and parameters
		initEClass(textCTEClass, TextCT.class, "TextCT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextCT_Options(), this.getOptionList(), null, "options", null, 0, 1, TextCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextCT_Requirements(), this.getRequirementList(), null, "requirements", null, 0, 1, TextCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextCT_Components(), this.getComponentList(), null, "components", null, 1, 1, TextCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextCT_CompositionTree(), this.getCompositionTree(), null, "compositionTree", null, 1, 1, TextCT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementListEClass, RequirementList.class, "RequirementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementList_Requirements(), this.getRequirement(), null, "requirements", null, 1, -1, RequirementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Val(), ecorePackage.getEString(), "val", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentListEClass, ComponentList.class, "ComponentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentList_Components(), this.getComponent(), null, "components", null, 1, -1, ComponentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Val(), ecorePackage.getEString(), "val", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Behaviors(), this.getAbstractBehavior(), null, "behaviors", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Quantifier(), ecorePackage.getEString(), "quantifier", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemComponentEClass, SystemComponent.class, "SystemComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionListEClass, OptionList.class, "OptionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionList_Options(), this.getOption(), null, "options", null, 0, -1, OptionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Name(), ecorePackage.getEString(), "name", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionTreeEClass, CompositionTree.class, "CompositionTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionTree_RootNode(), this.getNode(), null, "rootNode", null, 1, 1, CompositionTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractBehaviorEClass, AbstractBehavior.class, "AbstractBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalBehaviorEClass, RelationalBehavior.class, "RelationalBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalBehavior_Behavior(), this.getBehavior(), null, "behavior", null, 1, 1, RelationalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalBehavior_Relations(), this.getRelation(), null, "relations", null, 1, -1, RelationalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Question(), ecorePackage.getEString(), "question", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Preposition(), ecorePackage.getEString(), "preposition", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_ComponentRef(), ecorePackage.getEString(), "componentRef", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_BehaviorRef(), ecorePackage.getEString(), "behaviorRef", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Level(), ecorePackage.getEString(), "level", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_ComponentLevel(), ecorePackage.getEString(), "componentLevel", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_ComponentSet(), ecorePackage.getEString(), "componentSet", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Mci(), ecorePackage.getEString(), "mci", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavior_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavior_Val(), ecorePackage.getEString(), "val", null, 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_Relations(), this.getRelation(), null, "relations", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalInputEClass, InternalInput.class, "InternalInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalOutputEClass, InternalOutput.class, "InternalOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalInputEClass, ExternalInput.class, "ExternalInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalOutputEClass, ExternalOutput.class, "ExternalOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractBlockOrNodeEClass, AbstractBlockOrNode.class, "AbstractBlockOrNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractBlockEClass, AbstractBlock.class, "AbstractBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractBlock_ChildNode(), this.getAbstractBlockOrNode(), null, "childNode", null, 2, -1, AbstractBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregatedNodeEClass, AggregatedNode.class, "AggregatedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inheritedNodeEClass, InheritedNode.class, "InheritedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associatedNodeEClass, AssociatedNode.class, "AssociatedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alternativeBlockEClass, AlternativeBlock.class, "AlternativeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregatedBlockEClass, AggregatedBlock.class, "AggregatedBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associatedBlockEClass, AssociatedBlock.class, "AssociatedBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inheritedBlockEClass, InheritedBlock.class, "InheritedBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNode_ComponentRef(), ecorePackage.getEString(), "componentRef", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_RequirementRef(), ecorePackage.getEString(), "requirementRef", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_TraceabilityStatus(), this.getValidity(), "traceabilityStatus", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_ComponentSet(), ecorePackage.getEString(), "componentSet", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_Mci(), ecorePackage.getEString(), "mci", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_ChildNode(), this.getAbstractBlockOrNode(), null, "childNode", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fiveWsEEnum, FiveWs.class, "FiveWs");
		addEEnumLiteral(fiveWsEEnum, FiveWs.WHO);
		addEEnumLiteral(fiveWsEEnum, FiveWs.WHAT);
		addEEnumLiteral(fiveWsEEnum, FiveWs.WHERE);
		addEEnumLiteral(fiveWsEEnum, FiveWs.WHEN);
		addEEnumLiteral(fiveWsEEnum, FiveWs.WHY);
		addEEnumLiteral(fiveWsEEnum, FiveWs.HOW);

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

} //TextctPackageImpl
