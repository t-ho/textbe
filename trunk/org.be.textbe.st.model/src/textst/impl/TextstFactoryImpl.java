/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textst.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import textst.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextstFactoryImpl extends EFactoryImpl implements TextstFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TextstFactory init()
  {
    try
    {
      TextstFactory theTextstFactory = (TextstFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.be.textbe/textst"); 
      if (theTextstFactory != null)
      {
        return theTextstFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextstFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextstFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TextstPackage.TEXT_ST: return createTextST();
      case TextstPackage.REQUIREMENT_LIST: return createRequirementList();
      case TextstPackage.REQUIREMENT: return createRequirement();
      case TextstPackage.COMPONENT_LIST: return createComponentList();
      case TextstPackage.OPTION_LIST: return createOptionList();
      case TextstPackage.OPTION: return createOption();
      case TextstPackage.STRUCTURE_TREE: return createStructureTree();
      case TextstPackage.COMPONENT: return createComponent();
      case TextstPackage.SYSTEM_COMPONENT: return createSystemComponent();
      case TextstPackage.SECONDARY_RELATION: return createSecondaryRelation();
      case TextstPackage.NODE: return createNode();
      case TextstPackage.RELATED_TO_NODE: return createRelatedToNode();
      case TextstPackage.DEFINED_BY_NODE: return createDefinedByNode();
      case TextstPackage.PARALLEL_BLOCK: return createParallelBlock();
      case TextstPackage.ALTERNATIVE_BLOCK: return createAlternativeBlock();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextstPackage.QUALIFIER:
        return createQualifierFromString(eDataType, initialValue);
      case TextstPackage.VALIDITY:
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextstPackage.QUALIFIER:
        return convertQualifierToString(eDataType, instanceValue);
      case TextstPackage.VALIDITY:
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
  public TextST createTextST()
  {
    TextSTImpl textST = new TextSTImpl();
    return textST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementList createRequirementList()
  {
    RequirementListImpl requirementList = new RequirementListImpl();
    return requirementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentList createComponentList()
  {
    ComponentListImpl componentList = new ComponentListImpl();
    return componentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionList createOptionList()
  {
    OptionListImpl optionList = new OptionListImpl();
    return optionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureTree createStructureTree()
  {
    StructureTreeImpl structureTree = new StructureTreeImpl();
    return structureTree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemComponent createSystemComponent()
  {
    SystemComponentImpl systemComponent = new SystemComponentImpl();
    return systemComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondaryRelation createSecondaryRelation()
  {
    SecondaryRelationImpl secondaryRelation = new SecondaryRelationImpl();
    return secondaryRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelatedToNode createRelatedToNode()
  {
    RelatedToNodeImpl relatedToNode = new RelatedToNodeImpl();
    return relatedToNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinedByNode createDefinedByNode()
  {
    DefinedByNodeImpl definedByNode = new DefinedByNodeImpl();
    return definedByNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParallelBlock createParallelBlock()
  {
    ParallelBlockImpl parallelBlock = new ParallelBlockImpl();
    return parallelBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlternativeBlock createAlternativeBlock()
  {
    AlternativeBlockImpl alternativeBlock = new AlternativeBlockImpl();
    return alternativeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualifier createQualifierFromString(EDataType eDataType, String initialValue)
  {
    Qualifier result = Qualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validity createValidityFromString(EDataType eDataType, String initialValue)
  {
    Validity result = Validity.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValidityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextstPackage getTextstPackage()
  {
    return (TextstPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static TextstPackage getPackage()
  {
    return TextstPackage.eINSTANCE;
  }

} //TextstFactoryImpl
