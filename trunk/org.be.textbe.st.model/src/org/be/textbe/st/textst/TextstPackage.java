/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.be.textbe.st.textst.TextstFactory
 * @model kind="package"
 * @generated
 */
public interface TextstPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "textst";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://org.be.textbe/textst";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "textst";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  TextstPackage eINSTANCE = org.be.textbe.st.textst.impl.TextstPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.TextSTImpl <em>Text ST</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.TextSTImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getTextST()
	 * @generated
	 */
  int TEXT_ST = 0;

  /**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_ST__OPTIONS = 0;

  /**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_ST__REQUIREMENTS = 1;

  /**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_ST__COMPONENTS = 2;

  /**
	 * The feature id for the '<em><b>Structure Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_ST__STRUCTURE_TREE = 3;

  /**
	 * The number of structural features of the '<em>Text ST</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_ST_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.RequirementListImpl <em>Requirement List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.RequirementListImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getRequirementList()
	 * @generated
	 */
  int REQUIREMENT_LIST = 1;

  /**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REQUIREMENT_LIST__REQUIREMENTS = 0;

  /**
	 * The number of structural features of the '<em>Requirement List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REQUIREMENT_LIST_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.RequirementImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getRequirement()
	 * @generated
	 */
  int REQUIREMENT = 2;

  /**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REQUIREMENT__REF = 0;

  /**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REQUIREMENT__VAL = 1;

  /**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REQUIREMENT_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.ComponentListImpl <em>Component List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.ComponentListImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getComponentList()
	 * @generated
	 */
  int COMPONENT_LIST = 3;

  /**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPONENT_LIST__COMPONENTS = 0;

  /**
	 * The number of structural features of the '<em>Component List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPONENT_LIST_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.OptionListImpl <em>Option List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.OptionListImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getOptionList()
	 * @generated
	 */
  int OPTION_LIST = 4;

  /**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION_LIST__OPTIONS = 0;

  /**
	 * The number of structural features of the '<em>Option List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION_LIST_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.OptionImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getOption()
	 * @generated
	 */
  int OPTION = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION__NAME = 0;

  /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION__VALUE = 1;

  /**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPTION_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.StructureTreeImpl <em>Structure Tree</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.StructureTreeImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getStructureTree()
	 * @generated
	 */
  int STRUCTURE_TREE = 6;

  /**
	 * The feature id for the '<em><b>Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURE_TREE__ROOT_NODE = 0;

  /**
	 * The number of structural features of the '<em>Structure Tree</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRUCTURE_TREE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.ComponentImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getComponent()
	 * @generated
	 */
  int COMPONENT = 7;

  /**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPONENT__REF = 0;

  /**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPONENT__VAL = 1;

  /**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPONENT__BEHAVIORS = 2;

  /**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPONENT_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.SystemComponentImpl <em>System Component</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.SystemComponentImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getSystemComponent()
	 * @generated
	 */
  int SYSTEM_COMPONENT = 8;

  /**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEM_COMPONENT__REF = COMPONENT__REF;

  /**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEM_COMPONENT__VAL = COMPONENT__VAL;

  /**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEM_COMPONENT__BEHAVIORS = COMPONENT__BEHAVIORS;

  /**
	 * The number of structural features of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYSTEM_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.AbstractBehaviorImpl <em>Abstract Behavior</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.AbstractBehaviorImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractBehavior()
	 * @generated
	 */
  int ABSTRACT_BEHAVIOR = 9;

  /**
	 * The number of structural features of the '<em>Abstract Behavior</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_BEHAVIOR_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.SecondaryRelationImpl <em>Secondary Relation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.SecondaryRelationImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getSecondaryRelation()
	 * @generated
	 */
  int SECONDARY_RELATION = 10;

  /**
	 * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__BEHAVIOR_REF = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__ATTRIBUTE = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Primary Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__PRIMARY_LOWER_BOUND = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Primary Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__PRIMARY_UPPER_BOUND = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Secondary Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__SECONDARY_LOWER_BOUND = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Secondary Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__SECONDARY_UPPER_BOUND = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__COMPONENT_REF = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Component Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__COMPONENT_ATTRIBUTE = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION__RELATION_NAME = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 8;

  /**
	 * The number of structural features of the '<em>Secondary Relation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECONDARY_RELATION_FEATURE_COUNT = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 9;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.AbstractBlockOrNodeImpl <em>Abstract Block Or Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.AbstractBlockOrNodeImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractBlockOrNode()
	 * @generated
	 */
  int ABSTRACT_BLOCK_OR_NODE = 11;

  /**
	 * The number of structural features of the '<em>Abstract Block Or Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.AbstractBlockImpl <em>Abstract Block</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.AbstractBlockImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractBlock()
	 * @generated
	 */
  int ABSTRACT_BLOCK = 12;

  /**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_BLOCK__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Abstract Block</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_BLOCK_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.AbstractNodeImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractNode()
	 * @generated
	 */
  int ABSTRACT_NODE = 13;

  /**
	 * The feature id for the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__COMPONENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Component Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__COMPONENT_SET = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Mci</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__MCI = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__QUALIFIER = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Second Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__SECOND_QUALIFIER = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__BEHAVIOR_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__REQUIREMENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__TRACEABILITY_STATUS = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__OPERATOR = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 9;

  /**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_NODE_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 10;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.NodeImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getNode()
	 * @generated
	 */
  int NODE = 14;

  /**
	 * The feature id for the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__COMPONENT_REF = ABSTRACT_NODE__COMPONENT_REF;

  /**
	 * The feature id for the '<em><b>Component Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__COMPONENT_SET = ABSTRACT_NODE__COMPONENT_SET;

  /**
	 * The feature id for the '<em><b>Mci</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__MCI = ABSTRACT_NODE__MCI;

  /**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__QUALIFIER = ABSTRACT_NODE__QUALIFIER;

  /**
	 * The feature id for the '<em><b>Second Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__SECOND_QUALIFIER = ABSTRACT_NODE__SECOND_QUALIFIER;

  /**
	 * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__BEHAVIOR_REF = ABSTRACT_NODE__BEHAVIOR_REF;

  /**
	 * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__REQUIREMENT_REF = ABSTRACT_NODE__REQUIREMENT_REF;

  /**
	 * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__TRACEABILITY_STATUS = ABSTRACT_NODE__TRACEABILITY_STATUS;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__OPERATOR = ABSTRACT_NODE__OPERATOR;

  /**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__CHILD_NODE = ABSTRACT_NODE__CHILD_NODE;

  /**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.RelatedToNodeImpl <em>Related To Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.RelatedToNodeImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getRelatedToNode()
	 * @generated
	 */
  int RELATED_TO_NODE = 15;

  /**
	 * The feature id for the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__COMPONENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Component Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__COMPONENT_SET = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Mci</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__MCI = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__QUALIFIER = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Second Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__SECOND_QUALIFIER = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__BEHAVIOR_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__REQUIREMENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__TRACEABILITY_STATUS = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__OPERATOR = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 9;

  /**
	 * The number of structural features of the '<em>Related To Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATED_TO_NODE_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 10;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.DefinedByNodeImpl <em>Defined By Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.DefinedByNodeImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getDefinedByNode()
	 * @generated
	 */
  int DEFINED_BY_NODE = 16;

  /**
	 * The feature id for the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__COMPONENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Component Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__COMPONENT_SET = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Mci</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__MCI = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__QUALIFIER = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Second Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__SECOND_QUALIFIER = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__BEHAVIOR_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__REQUIREMENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__TRACEABILITY_STATUS = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__OPERATOR = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 9;

  /**
	 * The number of structural features of the '<em>Defined By Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFINED_BY_NODE_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 10;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.ParallelBlockImpl <em>Parallel Block</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.ParallelBlockImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getParallelBlock()
	 * @generated
	 */
  int PARALLEL_BLOCK = 17;

  /**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARALLEL_BLOCK__CHILD_NODE = ABSTRACT_BLOCK__CHILD_NODE;

  /**
	 * The number of structural features of the '<em>Parallel Block</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARALLEL_BLOCK_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.impl.AlternativeBlockImpl <em>Alternative Block</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.impl.AlternativeBlockImpl
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAlternativeBlock()
	 * @generated
	 */
  int ALTERNATIVE_BLOCK = 18;

  /**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALTERNATIVE_BLOCK__CHILD_NODE = ABSTRACT_BLOCK__CHILD_NODE;

  /**
	 * The number of structural features of the '<em>Alternative Block</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ALTERNATIVE_BLOCK_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.Qualifier <em>Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.Qualifier
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getQualifier()
	 * @generated
	 */
  int QUALIFIER = 19;

  /**
	 * The meta object id for the '{@link org.be.textbe.st.textst.Validity <em>Validity</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.be.textbe.st.textst.Validity
	 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getValidity()
	 * @generated
	 */
  int VALIDITY = 20;


  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.TextST <em>Text ST</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text ST</em>'.
	 * @see org.be.textbe.st.textst.TextST
	 * @generated
	 */
  EClass getTextST();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.st.textst.TextST#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org.be.textbe.st.textst.TextST#getOptions()
	 * @see #getTextST()
	 * @generated
	 */
  EReference getTextST_Options();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.st.textst.TextST#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see org.be.textbe.st.textst.TextST#getRequirements()
	 * @see #getTextST()
	 * @generated
	 */
  EReference getTextST_Requirements();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.st.textst.TextST#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see org.be.textbe.st.textst.TextST#getComponents()
	 * @see #getTextST()
	 * @generated
	 */
  EReference getTextST_Components();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.st.textst.TextST#getStructureTree <em>Structure Tree</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure Tree</em>'.
	 * @see org.be.textbe.st.textst.TextST#getStructureTree()
	 * @see #getTextST()
	 * @generated
	 */
  EReference getTextST_StructureTree();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.RequirementList <em>Requirement List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement List</em>'.
	 * @see org.be.textbe.st.textst.RequirementList
	 * @generated
	 */
  EClass getRequirementList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.st.textst.RequirementList#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.be.textbe.st.textst.RequirementList#getRequirements()
	 * @see #getRequirementList()
	 * @generated
	 */
  EReference getRequirementList_Requirements();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.be.textbe.st.textst.Requirement
	 * @generated
	 */
  EClass getRequirement();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.Requirement#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.be.textbe.st.textst.Requirement#getRef()
	 * @see #getRequirement()
	 * @generated
	 */
  EAttribute getRequirement_Ref();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.Requirement#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see org.be.textbe.st.textst.Requirement#getVal()
	 * @see #getRequirement()
	 * @generated
	 */
  EAttribute getRequirement_Val();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.ComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component List</em>'.
	 * @see org.be.textbe.st.textst.ComponentList
	 * @generated
	 */
  EClass getComponentList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.st.textst.ComponentList#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.be.textbe.st.textst.ComponentList#getComponents()
	 * @see #getComponentList()
	 * @generated
	 */
  EReference getComponentList_Components();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.OptionList <em>Option List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option List</em>'.
	 * @see org.be.textbe.st.textst.OptionList
	 * @generated
	 */
  EClass getOptionList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.st.textst.OptionList#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.be.textbe.st.textst.OptionList#getOptions()
	 * @see #getOptionList()
	 * @generated
	 */
  EReference getOptionList_Options();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org.be.textbe.st.textst.Option
	 * @generated
	 */
  EClass getOption();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.textbe.st.textst.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
  EAttribute getOption_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.be.textbe.st.textst.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
  EAttribute getOption_Value();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.StructureTree <em>Structure Tree</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Tree</em>'.
	 * @see org.be.textbe.st.textst.StructureTree
	 * @generated
	 */
  EClass getStructureTree();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.st.textst.StructureTree#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Node</em>'.
	 * @see org.be.textbe.st.textst.StructureTree#getRootNode()
	 * @see #getStructureTree()
	 * @generated
	 */
  EReference getStructureTree_RootNode();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.be.textbe.st.textst.Component
	 * @generated
	 */
  EClass getComponent();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.Component#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.be.textbe.st.textst.Component#getRef()
	 * @see #getComponent()
	 * @generated
	 */
  EAttribute getComponent_Ref();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.Component#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see org.be.textbe.st.textst.Component#getVal()
	 * @see #getComponent()
	 * @generated
	 */
  EAttribute getComponent_Val();

  /**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.st.textst.Component#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see org.be.textbe.st.textst.Component#getBehaviors()
	 * @see #getComponent()
	 * @generated
	 */
  EReference getComponent_Behaviors();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component</em>'.
	 * @see org.be.textbe.st.textst.SystemComponent
	 * @generated
	 */
  EClass getSystemComponent();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.AbstractBehavior <em>Abstract Behavior</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Behavior</em>'.
	 * @see org.be.textbe.st.textst.AbstractBehavior
	 * @generated
	 */
  EClass getAbstractBehavior();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.SecondaryRelation <em>Secondary Relation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Relation</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation
	 * @generated
	 */
  EClass getSecondaryRelation();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getBehaviorRef <em>Behavior Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Ref</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getBehaviorRef()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_BehaviorRef();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getAttribute()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_Attribute();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getPrimaryLowerBound <em>Primary Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Lower Bound</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getPrimaryLowerBound()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_PrimaryLowerBound();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getPrimaryUpperBound <em>Primary Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Upper Bound</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getPrimaryUpperBound()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_PrimaryUpperBound();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getSecondaryLowerBound <em>Secondary Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary Lower Bound</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getSecondaryLowerBound()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_SecondaryLowerBound();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getSecondaryUpperBound <em>Secondary Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary Upper Bound</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getSecondaryUpperBound()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_SecondaryUpperBound();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getComponentRef <em>Component Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Ref</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getComponentRef()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_ComponentRef();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getComponentAttribute <em>Component Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Attribute</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getComponentAttribute()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_ComponentAttribute();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.SecondaryRelation#getRelationName <em>Relation Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Name</em>'.
	 * @see org.be.textbe.st.textst.SecondaryRelation#getRelationName()
	 * @see #getSecondaryRelation()
	 * @generated
	 */
  EAttribute getSecondaryRelation_RelationName();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.AbstractBlockOrNode <em>Abstract Block Or Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Block Or Node</em>'.
	 * @see org.be.textbe.st.textst.AbstractBlockOrNode
	 * @generated
	 */
  EClass getAbstractBlockOrNode();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.AbstractBlock <em>Abstract Block</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Block</em>'.
	 * @see org.be.textbe.st.textst.AbstractBlock
	 * @generated
	 */
  EClass getAbstractBlock();

  /**
	 * Returns the meta object for the containment reference list '{@link org.be.textbe.st.textst.AbstractBlock#getChildNode <em>Child Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Node</em>'.
	 * @see org.be.textbe.st.textst.AbstractBlock#getChildNode()
	 * @see #getAbstractBlock()
	 * @generated
	 */
  EReference getAbstractBlock_ChildNode();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode
	 * @generated
	 */
  EClass getAbstractNode();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getComponentRef <em>Component Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Ref</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getComponentRef()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_ComponentRef();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Set</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getComponentSet()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_ComponentSet();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getMci <em>Mci</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mci</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getMci()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_Mci();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getQualifier()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_Qualifier();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getSecondQualifier <em>Second Qualifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Qualifier</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getSecondQualifier()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_SecondQualifier();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getBehaviorRef <em>Behavior Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Ref</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getBehaviorRef()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_BehaviorRef();

  /**
	 * Returns the meta object for the attribute list '{@link org.be.textbe.st.textst.AbstractNode#getRequirementRef <em>Requirement Ref</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requirement Ref</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getRequirementRef()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_RequirementRef();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getTraceabilityStatus <em>Traceability Status</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Status</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getTraceabilityStatus()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_TraceabilityStatus();

  /**
	 * Returns the meta object for the attribute '{@link org.be.textbe.st.textst.AbstractNode#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getOperator()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EAttribute getAbstractNode_Operator();

  /**
	 * Returns the meta object for the containment reference '{@link org.be.textbe.st.textst.AbstractNode#getChildNode <em>Child Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Node</em>'.
	 * @see org.be.textbe.st.textst.AbstractNode#getChildNode()
	 * @see #getAbstractNode()
	 * @generated
	 */
  EReference getAbstractNode_ChildNode();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.be.textbe.st.textst.Node
	 * @generated
	 */
  EClass getNode();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.RelatedToNode <em>Related To Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related To Node</em>'.
	 * @see org.be.textbe.st.textst.RelatedToNode
	 * @generated
	 */
  EClass getRelatedToNode();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.DefinedByNode <em>Defined By Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined By Node</em>'.
	 * @see org.be.textbe.st.textst.DefinedByNode
	 * @generated
	 */
  EClass getDefinedByNode();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.ParallelBlock <em>Parallel Block</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Block</em>'.
	 * @see org.be.textbe.st.textst.ParallelBlock
	 * @generated
	 */
  EClass getParallelBlock();

  /**
	 * Returns the meta object for class '{@link org.be.textbe.st.textst.AlternativeBlock <em>Alternative Block</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Block</em>'.
	 * @see org.be.textbe.st.textst.AlternativeBlock
	 * @generated
	 */
  EClass getAlternativeBlock();

  /**
	 * Returns the meta object for enum '{@link org.be.textbe.st.textst.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualifier</em>'.
	 * @see org.be.textbe.st.textst.Qualifier
	 * @generated
	 */
  EEnum getQualifier();

  /**
	 * Returns the meta object for enum '{@link org.be.textbe.st.textst.Validity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validity</em>'.
	 * @see org.be.textbe.st.textst.Validity
	 * @generated
	 */
  EEnum getValidity();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  TextstFactory getTextstFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.TextSTImpl <em>Text ST</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.TextSTImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getTextST()
		 * @generated
		 */
    EClass TEXT_ST = eINSTANCE.getTextST();

    /**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TEXT_ST__OPTIONS = eINSTANCE.getTextST_Options();

    /**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TEXT_ST__REQUIREMENTS = eINSTANCE.getTextST_Requirements();

    /**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TEXT_ST__COMPONENTS = eINSTANCE.getTextST_Components();

    /**
		 * The meta object literal for the '<em><b>Structure Tree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TEXT_ST__STRUCTURE_TREE = eINSTANCE.getTextST_StructureTree();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.RequirementListImpl <em>Requirement List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.RequirementListImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getRequirementList()
		 * @generated
		 */
    EClass REQUIREMENT_LIST = eINSTANCE.getRequirementList();

    /**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REQUIREMENT_LIST__REQUIREMENTS = eINSTANCE.getRequirementList_Requirements();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.RequirementImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getRequirement()
		 * @generated
		 */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REQUIREMENT__REF = eINSTANCE.getRequirement_Ref();

    /**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REQUIREMENT__VAL = eINSTANCE.getRequirement_Val();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.ComponentListImpl <em>Component List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.ComponentListImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getComponentList()
		 * @generated
		 */
    EClass COMPONENT_LIST = eINSTANCE.getComponentList();

    /**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COMPONENT_LIST__COMPONENTS = eINSTANCE.getComponentList_Components();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.OptionListImpl <em>Option List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.OptionListImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getOptionList()
		 * @generated
		 */
    EClass OPTION_LIST = eINSTANCE.getOptionList();

    /**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OPTION_LIST__OPTIONS = eINSTANCE.getOptionList_Options();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.OptionImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getOption()
		 * @generated
		 */
    EClass OPTION = eINSTANCE.getOption();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.StructureTreeImpl <em>Structure Tree</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.StructureTreeImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getStructureTree()
		 * @generated
		 */
    EClass STRUCTURE_TREE = eINSTANCE.getStructureTree();

    /**
		 * The meta object literal for the '<em><b>Root Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference STRUCTURE_TREE__ROOT_NODE = eINSTANCE.getStructureTree_RootNode();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.ComponentImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getComponent()
		 * @generated
		 */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COMPONENT__REF = eINSTANCE.getComponent_Ref();

    /**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COMPONENT__VAL = eINSTANCE.getComponent_Val();

    /**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COMPONENT__BEHAVIORS = eINSTANCE.getComponent_Behaviors();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.SystemComponentImpl <em>System Component</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.SystemComponentImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getSystemComponent()
		 * @generated
		 */
    EClass SYSTEM_COMPONENT = eINSTANCE.getSystemComponent();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.AbstractBehaviorImpl <em>Abstract Behavior</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.AbstractBehaviorImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractBehavior()
		 * @generated
		 */
    EClass ABSTRACT_BEHAVIOR = eINSTANCE.getAbstractBehavior();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.SecondaryRelationImpl <em>Secondary Relation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.SecondaryRelationImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getSecondaryRelation()
		 * @generated
		 */
    EClass SECONDARY_RELATION = eINSTANCE.getSecondaryRelation();

    /**
		 * The meta object literal for the '<em><b>Behavior Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__BEHAVIOR_REF = eINSTANCE.getSecondaryRelation_BehaviorRef();

    /**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__ATTRIBUTE = eINSTANCE.getSecondaryRelation_Attribute();

    /**
		 * The meta object literal for the '<em><b>Primary Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__PRIMARY_LOWER_BOUND = eINSTANCE.getSecondaryRelation_PrimaryLowerBound();

    /**
		 * The meta object literal for the '<em><b>Primary Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__PRIMARY_UPPER_BOUND = eINSTANCE.getSecondaryRelation_PrimaryUpperBound();

    /**
		 * The meta object literal for the '<em><b>Secondary Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__SECONDARY_LOWER_BOUND = eINSTANCE.getSecondaryRelation_SecondaryLowerBound();

    /**
		 * The meta object literal for the '<em><b>Secondary Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__SECONDARY_UPPER_BOUND = eINSTANCE.getSecondaryRelation_SecondaryUpperBound();

    /**
		 * The meta object literal for the '<em><b>Component Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__COMPONENT_REF = eINSTANCE.getSecondaryRelation_ComponentRef();

    /**
		 * The meta object literal for the '<em><b>Component Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__COMPONENT_ATTRIBUTE = eINSTANCE.getSecondaryRelation_ComponentAttribute();

    /**
		 * The meta object literal for the '<em><b>Relation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SECONDARY_RELATION__RELATION_NAME = eINSTANCE.getSecondaryRelation_RelationName();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.AbstractBlockOrNodeImpl <em>Abstract Block Or Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.AbstractBlockOrNodeImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractBlockOrNode()
		 * @generated
		 */
    EClass ABSTRACT_BLOCK_OR_NODE = eINSTANCE.getAbstractBlockOrNode();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.AbstractBlockImpl <em>Abstract Block</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.AbstractBlockImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractBlock()
		 * @generated
		 */
    EClass ABSTRACT_BLOCK = eINSTANCE.getAbstractBlock();

    /**
		 * The meta object literal for the '<em><b>Child Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_BLOCK__CHILD_NODE = eINSTANCE.getAbstractBlock_ChildNode();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.AbstractNodeImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAbstractNode()
		 * @generated
		 */
    EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

    /**
		 * The meta object literal for the '<em><b>Component Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__COMPONENT_REF = eINSTANCE.getAbstractNode_ComponentRef();

    /**
		 * The meta object literal for the '<em><b>Component Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__COMPONENT_SET = eINSTANCE.getAbstractNode_ComponentSet();

    /**
		 * The meta object literal for the '<em><b>Mci</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__MCI = eINSTANCE.getAbstractNode_Mci();

    /**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__QUALIFIER = eINSTANCE.getAbstractNode_Qualifier();

    /**
		 * The meta object literal for the '<em><b>Second Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__SECOND_QUALIFIER = eINSTANCE.getAbstractNode_SecondQualifier();

    /**
		 * The meta object literal for the '<em><b>Behavior Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__BEHAVIOR_REF = eINSTANCE.getAbstractNode_BehaviorRef();

    /**
		 * The meta object literal for the '<em><b>Requirement Ref</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__REQUIREMENT_REF = eINSTANCE.getAbstractNode_RequirementRef();

    /**
		 * The meta object literal for the '<em><b>Traceability Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__TRACEABILITY_STATUS = eINSTANCE.getAbstractNode_TraceabilityStatus();

    /**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_NODE__OPERATOR = eINSTANCE.getAbstractNode_Operator();

    /**
		 * The meta object literal for the '<em><b>Child Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_NODE__CHILD_NODE = eINSTANCE.getAbstractNode_ChildNode();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.NodeImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getNode()
		 * @generated
		 */
    EClass NODE = eINSTANCE.getNode();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.RelatedToNodeImpl <em>Related To Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.RelatedToNodeImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getRelatedToNode()
		 * @generated
		 */
    EClass RELATED_TO_NODE = eINSTANCE.getRelatedToNode();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.DefinedByNodeImpl <em>Defined By Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.DefinedByNodeImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getDefinedByNode()
		 * @generated
		 */
    EClass DEFINED_BY_NODE = eINSTANCE.getDefinedByNode();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.ParallelBlockImpl <em>Parallel Block</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.ParallelBlockImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getParallelBlock()
		 * @generated
		 */
    EClass PARALLEL_BLOCK = eINSTANCE.getParallelBlock();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.impl.AlternativeBlockImpl <em>Alternative Block</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.impl.AlternativeBlockImpl
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getAlternativeBlock()
		 * @generated
		 */
    EClass ALTERNATIVE_BLOCK = eINSTANCE.getAlternativeBlock();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.Qualifier <em>Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.Qualifier
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getQualifier()
		 * @generated
		 */
    EEnum QUALIFIER = eINSTANCE.getQualifier();

    /**
		 * The meta object literal for the '{@link org.be.textbe.st.textst.Validity <em>Validity</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.be.textbe.st.textst.Validity
		 * @see org.be.textbe.st.textst.impl.TextstPackageImpl#getValidity()
		 * @generated
		 */
    EEnum VALIDITY = eINSTANCE.getValidity();

  }

} //TextstPackage
