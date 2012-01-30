/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct.impl;

import org.be.textbe.ct.textct.*;

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
public class TextctFactoryImpl extends EFactoryImpl implements TextctFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static TextctFactory init() {
    try
    {
      TextctFactory theTextctFactory = (TextctFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.be.textbe/textct"); 
      if (theTextctFactory != null)
      {
        return theTextctFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextctFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextctFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case TextctPackage.TEXT_CT: return createTextCT();
      case TextctPackage.REQUIREMENT_LIST: return createRequirementList();
      case TextctPackage.REQUIREMENT: return createRequirement();
      case TextctPackage.COMPONENT_LIST: return createComponentList();
      case TextctPackage.COMPONENT: return createComponent();
      case TextctPackage.SYSTEM_COMPONENT: return createSystemComponent();
      case TextctPackage.OPTION_LIST: return createOptionList();
      case TextctPackage.OPTION: return createOption();
      case TextctPackage.COMPOSITION_TREE: return createCompositionTree();
      case TextctPackage.RELATIONAL_BEHAVIOR: return createRelationalBehavior();
      case TextctPackage.RELATION: return createRelation();
      case TextctPackage.STATE: return createState();
      case TextctPackage.SELECTION: return createSelection();
      case TextctPackage.EVENT: return createEvent();
      case TextctPackage.GUARD: return createGuard();
      case TextctPackage.INTERNAL_INPUT: return createInternalInput();
      case TextctPackage.INTERNAL_OUTPUT: return createInternalOutput();
      case TextctPackage.EXTERNAL_INPUT: return createExternalInput();
      case TextctPackage.EXTERNAL_OUTPUT: return createExternalOutput();
      case TextctPackage.ASSERTION: return createAssertion();
      case TextctPackage.NODE: return createNode();
      case TextctPackage.AGGREGATED_NODE: return createAggregatedNode();
      case TextctPackage.INHERITED_NODE: return createInheritedNode();
      case TextctPackage.ASSOCIATED_NODE: return createAssociatedNode();
      case TextctPackage.ALTERNATIVE_BLOCK: return createAlternativeBlock();
      case TextctPackage.AGGREGATED_BLOCK: return createAggregatedBlock();
      case TextctPackage.ASSOCIATED_BLOCK: return createAssociatedBlock();
      case TextctPackage.INHERITED_BLOCK: return createInheritedBlock();
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
    switch (eDataType.getClassifierID())
    {
      case TextctPackage.FIVE_WS:
        return createFiveWsFromString(eDataType, initialValue);
      case TextctPackage.VALIDITY:
        return createValidityFromString(eDataType, initialValue);
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
    switch (eDataType.getClassifierID())
    {
      case TextctPackage.FIVE_WS:
        return convertFiveWsToString(eDataType, instanceValue);
      case TextctPackage.VALIDITY:
        return convertValidityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextCT createTextCT() {
    TextCTImpl textCT = new TextCTImpl();
    return textCT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RequirementList createRequirementList() {
    RequirementListImpl requirementList = new RequirementListImpl();
    return requirementList;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Requirement createRequirement() {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ComponentList createComponentList() {
    ComponentListImpl componentList = new ComponentListImpl();
    return componentList;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Component createComponent() {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SystemComponent createSystemComponent() {
    SystemComponentImpl systemComponent = new SystemComponentImpl();
    return systemComponent;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OptionList createOptionList() {
    OptionListImpl optionList = new OptionListImpl();
    return optionList;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Option createOption() {
    OptionImpl option = new OptionImpl();
    return option;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CompositionTree createCompositionTree() {
    CompositionTreeImpl compositionTree = new CompositionTreeImpl();
    return compositionTree;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RelationalBehavior createRelationalBehavior() {
    RelationalBehaviorImpl relationalBehavior = new RelationalBehaviorImpl();
    return relationalBehavior;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Relation createRelation() {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public State createState() {
    StateImpl state = new StateImpl();
    return state;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Selection createSelection() {
    SelectionImpl selection = new SelectionImpl();
    return selection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Event createEvent() {
    EventImpl event = new EventImpl();
    return event;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Guard createGuard() {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InternalInput createInternalInput() {
    InternalInputImpl internalInput = new InternalInputImpl();
    return internalInput;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InternalOutput createInternalOutput() {
    InternalOutputImpl internalOutput = new InternalOutputImpl();
    return internalOutput;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExternalInput createExternalInput() {
    ExternalInputImpl externalInput = new ExternalInputImpl();
    return externalInput;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExternalOutput createExternalOutput() {
    ExternalOutputImpl externalOutput = new ExternalOutputImpl();
    return externalOutput;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Assertion createAssertion() {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Node createNode() {
    NodeImpl node = new NodeImpl();
    return node;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AggregatedNode createAggregatedNode() {
    AggregatedNodeImpl aggregatedNode = new AggregatedNodeImpl();
    return aggregatedNode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InheritedNode createInheritedNode() {
    InheritedNodeImpl inheritedNode = new InheritedNodeImpl();
    return inheritedNode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssociatedNode createAssociatedNode() {
    AssociatedNodeImpl associatedNode = new AssociatedNodeImpl();
    return associatedNode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AlternativeBlock createAlternativeBlock() {
    AlternativeBlockImpl alternativeBlock = new AlternativeBlockImpl();
    return alternativeBlock;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AggregatedBlock createAggregatedBlock() {
    AggregatedBlockImpl aggregatedBlock = new AggregatedBlockImpl();
    return aggregatedBlock;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssociatedBlock createAssociatedBlock() {
    AssociatedBlockImpl associatedBlock = new AssociatedBlockImpl();
    return associatedBlock;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InheritedBlock createInheritedBlock() {
    InheritedBlockImpl inheritedBlock = new InheritedBlockImpl();
    return inheritedBlock;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FiveWs createFiveWsFromString(EDataType eDataType, String initialValue) {
    FiveWs result = FiveWs.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFiveWsToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Validity createValidityFromString(EDataType eDataType, String initialValue) {
    Validity result = Validity.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertValidityToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TextctPackage getTextctPackage() {
    return (TextctPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static TextctPackage getPackage() {
    return TextctPackage.eINSTANCE;
  }

} //TextctFactoryImpl
