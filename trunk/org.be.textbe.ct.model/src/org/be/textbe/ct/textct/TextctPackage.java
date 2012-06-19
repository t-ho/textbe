/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct;

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
 * @see org.be.textbe.ct.textct.TextctFactory
 * @model kind="package"
 * @generated
 */
public interface TextctPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "textct";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://org.be.textbe/textct";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "textct";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	TextctPackage eINSTANCE = org.be.textbe.ct.textct.impl.TextctPackageImpl.init();

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.TextCTImpl <em>Text CT</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.TextCTImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getTextCT()
   * @generated
   */
	int TEXT_CT = 0;

	/**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TEXT_CT__OPTIONS = 0;

	/**
   * The feature id for the '<em><b>Requirements</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TEXT_CT__REQUIREMENTS = 1;

	/**
   * The feature id for the '<em><b>Components</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TEXT_CT__COMPONENTS = 2;

	/**
   * The feature id for the '<em><b>Composition Tree</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TEXT_CT__COMPOSITION_TREE = 3;

	/**
   * The number of structural features of the '<em>Text CT</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TEXT_CT_FEATURE_COUNT = 4;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.RequirementListImpl <em>Requirement List</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.RequirementListImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRequirementList()
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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.RequirementImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRequirement()
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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.ComponentListImpl <em>Component List</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.ComponentListImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getComponentList()
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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.ComponentImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getComponent()
   * @generated
   */
	int COMPONENT = 4;

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
   * The feature id for the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMPONENT__QUANTIFIER = 3;

	/**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMPONENT_FEATURE_COUNT = 4;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.SystemComponentImpl <em>System Component</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.SystemComponentImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getSystemComponent()
   * @generated
   */
	int SYSTEM_COMPONENT = 5;

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
   * The feature id for the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SYSTEM_COMPONENT__QUANTIFIER = COMPONENT__QUANTIFIER;

	/**
   * The number of structural features of the '<em>System Component</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SYSTEM_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.OptionListImpl <em>Option List</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.OptionListImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getOptionList()
   * @generated
   */
	int OPTION_LIST = 6;

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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.OptionImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getOption()
   * @generated
   */
	int OPTION = 7;

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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.CompositionTreeImpl <em>Composition Tree</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.CompositionTreeImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getCompositionTree()
   * @generated
   */
	int COMPOSITION_TREE = 8;

	/**
   * The feature id for the '<em><b>Root Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMPOSITION_TREE__ROOT_NODE = 0;

	/**
   * The number of structural features of the '<em>Composition Tree</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMPOSITION_TREE_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AbstractBehaviorImpl <em>Abstract Behavior</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AbstractBehaviorImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractBehavior()
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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.RelationalBehaviorImpl <em>Relational Behavior</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.RelationalBehaviorImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRelationalBehavior()
   * @generated
   */
	int RELATIONAL_BEHAVIOR = 10;

	/**
   * The feature id for the '<em><b>Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONAL_BEHAVIOR__BEHAVIOR = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONAL_BEHAVIOR__RELATIONS = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Relational Behavior</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONAL_BEHAVIOR_FEATURE_COUNT = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.RelationImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRelation()
   * @generated
   */
	int RELATION = 11;

	/**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__QUESTION = 0;

	/**
   * The feature id for the '<em><b>Preposition</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__PREPOSITION = 1;

	/**
   * The feature id for the '<em><b>Component Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__COMPONENT_REF = 2;

	/**
   * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__BEHAVIOR_REF = 3;

	/**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__LEVEL = 4;

	/**
   * The feature id for the '<em><b>Component Level</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__COMPONENT_LEVEL = 5;

	/**
   * The feature id for the '<em><b>Component Set</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__COMPONENT_SET = 6;

	/**
   * The feature id for the '<em><b>Mci</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION__MCI = 7;

	/**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATION_FEATURE_COUNT = 8;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.BehaviorImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getBehavior()
   * @generated
   */
	int BEHAVIOR = 12;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BEHAVIOR__REF = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BEHAVIOR__VAL = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BEHAVIOR__RELATIONS = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BEHAVIOR_FEATURE_COUNT = ABSTRACT_BEHAVIOR_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.StateImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getState()
   * @generated
   */
	int STATE = 13;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATE__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATE__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATE__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.SelectionImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getSelection()
   * @generated
   */
	int SELECTION = 14;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SELECTION__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SELECTION__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SELECTION__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SELECTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.EventImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getEvent()
   * @generated
   */
	int EVENT = 15;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EVENT__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EVENT__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EVENT__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.GuardImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getGuard()
   * @generated
   */
	int GUARD = 16;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GUARD__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GUARD__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GUARD__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GUARD_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.InternalInputImpl <em>Internal Input</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.InternalInputImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInternalInput()
   * @generated
   */
	int INTERNAL_INPUT = 17;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_INPUT__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_INPUT__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_INPUT__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>Internal Input</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_INPUT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.InternalOutputImpl <em>Internal Output</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.InternalOutputImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInternalOutput()
   * @generated
   */
	int INTERNAL_OUTPUT = 18;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_OUTPUT__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_OUTPUT__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_OUTPUT__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>Internal Output</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INTERNAL_OUTPUT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.ExternalInputImpl <em>External Input</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.ExternalInputImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getExternalInput()
   * @generated
   */
	int EXTERNAL_INPUT = 19;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_INPUT__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_INPUT__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_INPUT__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>External Input</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_INPUT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.ExternalOutputImpl <em>External Output</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.ExternalOutputImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getExternalOutput()
   * @generated
   */
	int EXTERNAL_OUTPUT = 20;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_OUTPUT__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_OUTPUT__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_OUTPUT__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>External Output</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTERNAL_OUTPUT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AssertionImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAssertion()
   * @generated
   */
	int ASSERTION = 21;

	/**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSERTION__REF = BEHAVIOR__REF;

	/**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSERTION__VAL = BEHAVIOR__VAL;

	/**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSERTION__RELATIONS = BEHAVIOR__RELATIONS;

	/**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSERTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AbstractBlockOrNodeImpl <em>Abstract Block Or Node</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AbstractBlockOrNodeImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractBlockOrNode()
   * @generated
   */
	int ABSTRACT_BLOCK_OR_NODE = 22;

	/**
   * The number of structural features of the '<em>Abstract Block Or Node</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AbstractBlockImpl <em>Abstract Block</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AbstractBlockImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractBlock()
   * @generated
   */
	int ABSTRACT_BLOCK = 23;

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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AbstractNodeImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractNode()
   * @generated
   */
	int ABSTRACT_NODE = 24;

	/**
   * The feature id for the '<em><b>Component Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__COMPONENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__REQUIREMENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__TRACEABILITY_STATUS = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__LABEL = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__OPERATOR = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Component Set</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__COMPONENT_SET = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Mci</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__MCI = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 6;

	/**
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 7;

	/**
   * The number of structural features of the '<em>Abstract Node</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NODE_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 8;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.NodeImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getNode()
   * @generated
   */
	int NODE = 25;

	/**
   * The feature id for the '<em><b>Component Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NODE__COMPONENT_REF = ABSTRACT_NODE__COMPONENT_REF;

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
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NODE__LABEL = ABSTRACT_NODE__LABEL;

	/**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NODE__OPERATOR = ABSTRACT_NODE__OPERATOR;

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
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AggregatedNodeImpl <em>Aggregated Node</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AggregatedNodeImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAggregatedNode()
   * @generated
   */
	int AGGREGATED_NODE = 26;

	/**
   * The feature id for the '<em><b>Component Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__COMPONENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__REQUIREMENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__TRACEABILITY_STATUS = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__LABEL = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__OPERATOR = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Component Set</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__COMPONENT_SET = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Mci</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__MCI = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 6;

	/**
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 7;

	/**
   * The number of structural features of the '<em>Aggregated Node</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_NODE_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 8;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.InheritedNodeImpl <em>Inherited Node</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.InheritedNodeImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInheritedNode()
   * @generated
   */
	int INHERITED_NODE = 27;

	/**
   * The feature id for the '<em><b>Component Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__COMPONENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__REQUIREMENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__TRACEABILITY_STATUS = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__LABEL = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__OPERATOR = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Component Set</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__COMPONENT_SET = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Mci</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__MCI = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 6;

	/**
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 7;

	/**
   * The number of structural features of the '<em>Inherited Node</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_NODE_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 8;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AssociatedNodeImpl <em>Associated Node</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AssociatedNodeImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAssociatedNode()
   * @generated
   */
	int ASSOCIATED_NODE = 28;

	/**
   * The feature id for the '<em><b>Component Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__COMPONENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Requirement Ref</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__REQUIREMENT_REF = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__TRACEABILITY_STATUS = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__LABEL = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 3;

	/**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__OPERATOR = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 4;

	/**
   * The feature id for the '<em><b>Component Set</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__COMPONENT_SET = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Mci</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__MCI = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 6;

	/**
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE__CHILD_NODE = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 7;

	/**
   * The number of structural features of the '<em>Associated Node</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_NODE_FEATURE_COUNT = ABSTRACT_BLOCK_OR_NODE_FEATURE_COUNT + 8;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AlternativeBlockImpl <em>Alternative Block</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AlternativeBlockImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAlternativeBlock()
   * @generated
   */
	int ALTERNATIVE_BLOCK = 29;

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
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AggregatedBlockImpl <em>Aggregated Block</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AggregatedBlockImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAggregatedBlock()
   * @generated
   */
	int AGGREGATED_BLOCK = 30;

	/**
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_BLOCK__CHILD_NODE = ABSTRACT_BLOCK__CHILD_NODE;

	/**
   * The number of structural features of the '<em>Aggregated Block</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AGGREGATED_BLOCK_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.AssociatedBlockImpl <em>Associated Block</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.AssociatedBlockImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAssociatedBlock()
   * @generated
   */
	int ASSOCIATED_BLOCK = 31;

	/**
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_BLOCK__CHILD_NODE = ABSTRACT_BLOCK__CHILD_NODE;

	/**
   * The number of structural features of the '<em>Associated Block</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATED_BLOCK_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.impl.InheritedBlockImpl <em>Inherited Block</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.impl.InheritedBlockImpl
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInheritedBlock()
   * @generated
   */
	int INHERITED_BLOCK = 32;

	/**
   * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_BLOCK__CHILD_NODE = ABSTRACT_BLOCK__CHILD_NODE;

	/**
   * The number of structural features of the '<em>Inherited Block</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITED_BLOCK_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.FiveWs <em>Five Ws</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.FiveWs
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getFiveWs()
   * @generated
   */
	int FIVE_WS = 33;

	/**
   * The meta object id for the '{@link org.be.textbe.ct.textct.Validity <em>Validity</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.be.textbe.ct.textct.Validity
   * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getValidity()
   * @generated
   */
	int VALIDITY = 34;


	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.TextCT <em>Text CT</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text CT</em>'.
   * @see org.be.textbe.ct.textct.TextCT
   * @generated
   */
	EClass getTextCT();

	/**
   * Returns the meta object for the containment reference '{@link org.be.textbe.ct.textct.TextCT#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Options</em>'.
   * @see org.be.textbe.ct.textct.TextCT#getOptions()
   * @see #getTextCT()
   * @generated
   */
	EReference getTextCT_Options();

	/**
   * Returns the meta object for the containment reference '{@link org.be.textbe.ct.textct.TextCT#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Requirements</em>'.
   * @see org.be.textbe.ct.textct.TextCT#getRequirements()
   * @see #getTextCT()
   * @generated
   */
	EReference getTextCT_Requirements();

	/**
   * Returns the meta object for the containment reference '{@link org.be.textbe.ct.textct.TextCT#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Components</em>'.
   * @see org.be.textbe.ct.textct.TextCT#getComponents()
   * @see #getTextCT()
   * @generated
   */
	EReference getTextCT_Components();

	/**
   * Returns the meta object for the containment reference '{@link org.be.textbe.ct.textct.TextCT#getCompositionTree <em>Composition Tree</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition Tree</em>'.
   * @see org.be.textbe.ct.textct.TextCT#getCompositionTree()
   * @see #getTextCT()
   * @generated
   */
	EReference getTextCT_CompositionTree();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.RequirementList <em>Requirement List</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement List</em>'.
   * @see org.be.textbe.ct.textct.RequirementList
   * @generated
   */
	EClass getRequirementList();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.RequirementList#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements</em>'.
   * @see org.be.textbe.ct.textct.RequirementList#getRequirements()
   * @see #getRequirementList()
   * @generated
   */
	EReference getRequirementList_Requirements();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see org.be.textbe.ct.textct.Requirement
   * @generated
   */
	EClass getRequirement();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Requirement#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see org.be.textbe.ct.textct.Requirement#getRef()
   * @see #getRequirement()
   * @generated
   */
	EAttribute getRequirement_Ref();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Requirement#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.be.textbe.ct.textct.Requirement#getVal()
   * @see #getRequirement()
   * @generated
   */
	EAttribute getRequirement_Val();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.ComponentList <em>Component List</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component List</em>'.
   * @see org.be.textbe.ct.textct.ComponentList
   * @generated
   */
	EClass getComponentList();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.ComponentList#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.be.textbe.ct.textct.ComponentList#getComponents()
   * @see #getComponentList()
   * @generated
   */
	EReference getComponentList_Components();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.be.textbe.ct.textct.Component
   * @generated
   */
	EClass getComponent();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Component#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see org.be.textbe.ct.textct.Component#getRef()
   * @see #getComponent()
   * @generated
   */
	EAttribute getComponent_Ref();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Component#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.be.textbe.ct.textct.Component#getVal()
   * @see #getComponent()
   * @generated
   */
	EAttribute getComponent_Val();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.Component#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviors</em>'.
   * @see org.be.textbe.ct.textct.Component#getBehaviors()
   * @see #getComponent()
   * @generated
   */
	EReference getComponent_Behaviors();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Component#getQuantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantifier</em>'.
   * @see org.be.textbe.ct.textct.Component#getQuantifier()
   * @see #getComponent()
   * @generated
   */
	EAttribute getComponent_Quantifier();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.SystemComponent <em>System Component</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Component</em>'.
   * @see org.be.textbe.ct.textct.SystemComponent
   * @generated
   */
	EClass getSystemComponent();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.OptionList <em>Option List</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option List</em>'.
   * @see org.be.textbe.ct.textct.OptionList
   * @generated
   */
	EClass getOptionList();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.OptionList#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see org.be.textbe.ct.textct.OptionList#getOptions()
   * @see #getOptionList()
   * @generated
   */
	EReference getOptionList_Options();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see org.be.textbe.ct.textct.Option
   * @generated
   */
	EClass getOption();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.be.textbe.ct.textct.Option#getName()
   * @see #getOption()
   * @generated
   */
	EAttribute getOption_Name();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Option#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.be.textbe.ct.textct.Option#getValue()
   * @see #getOption()
   * @generated
   */
	EAttribute getOption_Value();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.CompositionTree <em>Composition Tree</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Tree</em>'.
   * @see org.be.textbe.ct.textct.CompositionTree
   * @generated
   */
	EClass getCompositionTree();

	/**
   * Returns the meta object for the containment reference '{@link org.be.textbe.ct.textct.CompositionTree#getRootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Node</em>'.
   * @see org.be.textbe.ct.textct.CompositionTree#getRootNode()
   * @see #getCompositionTree()
   * @generated
   */
	EReference getCompositionTree_RootNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AbstractBehavior <em>Abstract Behavior</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Behavior</em>'.
   * @see org.be.textbe.ct.textct.AbstractBehavior
   * @generated
   */
	EClass getAbstractBehavior();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.RelationalBehavior <em>Relational Behavior</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Behavior</em>'.
   * @see org.be.textbe.ct.textct.RelationalBehavior
   * @generated
   */
	EClass getRelationalBehavior();

	/**
   * Returns the meta object for the containment reference '{@link org.be.textbe.ct.textct.RelationalBehavior#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behavior</em>'.
   * @see org.be.textbe.ct.textct.RelationalBehavior#getBehavior()
   * @see #getRelationalBehavior()
   * @generated
   */
	EReference getRelationalBehavior_Behavior();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.RelationalBehavior#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.be.textbe.ct.textct.RelationalBehavior#getRelations()
   * @see #getRelationalBehavior()
   * @generated
   */
	EReference getRelationalBehavior_Relations();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.be.textbe.ct.textct.Relation
   * @generated
   */
	EClass getRelation();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see org.be.textbe.ct.textct.Relation#getQuestion()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_Question();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getPreposition <em>Preposition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preposition</em>'.
   * @see org.be.textbe.ct.textct.Relation#getPreposition()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_Preposition();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Ref</em>'.
   * @see org.be.textbe.ct.textct.Relation#getComponentRef()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_ComponentRef();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getBehaviorRef <em>Behavior Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Behavior Ref</em>'.
   * @see org.be.textbe.ct.textct.Relation#getBehaviorRef()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_BehaviorRef();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see org.be.textbe.ct.textct.Relation#getLevel()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_Level();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getComponentLevel <em>Component Level</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Level</em>'.
   * @see org.be.textbe.ct.textct.Relation#getComponentLevel()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_ComponentLevel();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getComponentSet <em>Component Set</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Set</em>'.
   * @see org.be.textbe.ct.textct.Relation#getComponentSet()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_ComponentSet();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Relation#getMci <em>Mci</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mci</em>'.
   * @see org.be.textbe.ct.textct.Relation#getMci()
   * @see #getRelation()
   * @generated
   */
	EAttribute getRelation_Mci();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see org.be.textbe.ct.textct.Behavior
   * @generated
   */
	EClass getBehavior();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Behavior#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see org.be.textbe.ct.textct.Behavior#getRef()
   * @see #getBehavior()
   * @generated
   */
	EAttribute getBehavior_Ref();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.Behavior#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.be.textbe.ct.textct.Behavior#getVal()
   * @see #getBehavior()
   * @generated
   */
	EAttribute getBehavior_Val();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.Behavior#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.be.textbe.ct.textct.Behavior#getRelations()
   * @see #getBehavior()
   * @generated
   */
	EReference getBehavior_Relations();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.State <em>State</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.be.textbe.ct.textct.State
   * @generated
   */
	EClass getState();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see org.be.textbe.ct.textct.Selection
   * @generated
   */
	EClass getSelection();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.be.textbe.ct.textct.Event
   * @generated
   */
	EClass getEvent();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.be.textbe.ct.textct.Guard
   * @generated
   */
	EClass getGuard();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.InternalInput <em>Internal Input</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Input</em>'.
   * @see org.be.textbe.ct.textct.InternalInput
   * @generated
   */
	EClass getInternalInput();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.InternalOutput <em>Internal Output</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Output</em>'.
   * @see org.be.textbe.ct.textct.InternalOutput
   * @generated
   */
	EClass getInternalOutput();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.ExternalInput <em>External Input</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Input</em>'.
   * @see org.be.textbe.ct.textct.ExternalInput
   * @generated
   */
	EClass getExternalInput();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.ExternalOutput <em>External Output</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Output</em>'.
   * @see org.be.textbe.ct.textct.ExternalOutput
   * @generated
   */
	EClass getExternalOutput();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see org.be.textbe.ct.textct.Assertion
   * @generated
   */
	EClass getAssertion();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AbstractBlockOrNode <em>Abstract Block Or Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Block Or Node</em>'.
   * @see org.be.textbe.ct.textct.AbstractBlockOrNode
   * @generated
   */
	EClass getAbstractBlockOrNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AbstractBlock <em>Abstract Block</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Block</em>'.
   * @see org.be.textbe.ct.textct.AbstractBlock
   * @generated
   */
	EClass getAbstractBlock();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.AbstractBlock#getChildNode <em>Child Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child Node</em>'.
   * @see org.be.textbe.ct.textct.AbstractBlock#getChildNode()
   * @see #getAbstractBlock()
   * @generated
   */
	EReference getAbstractBlock_ChildNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AbstractNode <em>Abstract Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Node</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode
   * @generated
   */
	EClass getAbstractNode();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.AbstractNode#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Ref</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getComponentRef()
   * @see #getAbstractNode()
   * @generated
   */
	EAttribute getAbstractNode_ComponentRef();

	/**
   * Returns the meta object for the attribute list '{@link org.be.textbe.ct.textct.AbstractNode#getRequirementRef <em>Requirement Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Requirement Ref</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getRequirementRef()
   * @see #getAbstractNode()
   * @generated
   */
	EAttribute getAbstractNode_RequirementRef();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.AbstractNode#getTraceabilityStatus <em>Traceability Status</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Traceability Status</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getTraceabilityStatus()
   * @see #getAbstractNode()
   * @generated
   */
	EAttribute getAbstractNode_TraceabilityStatus();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.AbstractNode#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getLabel()
   * @see #getAbstractNode()
   * @generated
   */
	EAttribute getAbstractNode_Label();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.AbstractNode#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getOperator()
   * @see #getAbstractNode()
   * @generated
   */
	EAttribute getAbstractNode_Operator();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.AbstractNode#getComponentSet <em>Component Set</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Set</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getComponentSet()
   * @see #getAbstractNode()
   * @generated
   */
	EAttribute getAbstractNode_ComponentSet();

	/**
   * Returns the meta object for the attribute '{@link org.be.textbe.ct.textct.AbstractNode#getMci <em>Mci</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mci</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getMci()
   * @see #getAbstractNode()
   * @generated
   */
	EAttribute getAbstractNode_Mci();

	/**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.ct.textct.AbstractNode#getChildNode <em>Child Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child Node</em>'.
   * @see org.be.textbe.ct.textct.AbstractNode#getChildNode()
   * @see #getAbstractNode()
   * @generated
   */
	EReference getAbstractNode_ChildNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.be.textbe.ct.textct.Node
   * @generated
   */
	EClass getNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AggregatedNode <em>Aggregated Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregated Node</em>'.
   * @see org.be.textbe.ct.textct.AggregatedNode
   * @generated
   */
	EClass getAggregatedNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.InheritedNode <em>Inherited Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inherited Node</em>'.
   * @see org.be.textbe.ct.textct.InheritedNode
   * @generated
   */
	EClass getInheritedNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AssociatedNode <em>Associated Node</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Associated Node</em>'.
   * @see org.be.textbe.ct.textct.AssociatedNode
   * @generated
   */
	EClass getAssociatedNode();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AlternativeBlock <em>Alternative Block</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative Block</em>'.
   * @see org.be.textbe.ct.textct.AlternativeBlock
   * @generated
   */
	EClass getAlternativeBlock();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AggregatedBlock <em>Aggregated Block</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregated Block</em>'.
   * @see org.be.textbe.ct.textct.AggregatedBlock
   * @generated
   */
	EClass getAggregatedBlock();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.AssociatedBlock <em>Associated Block</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Associated Block</em>'.
   * @see org.be.textbe.ct.textct.AssociatedBlock
   * @generated
   */
	EClass getAssociatedBlock();

	/**
   * Returns the meta object for class '{@link org.be.textbe.ct.textct.InheritedBlock <em>Inherited Block</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inherited Block</em>'.
   * @see org.be.textbe.ct.textct.InheritedBlock
   * @generated
   */
	EClass getInheritedBlock();

	/**
   * Returns the meta object for enum '{@link org.be.textbe.ct.textct.FiveWs <em>Five Ws</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Five Ws</em>'.
   * @see org.be.textbe.ct.textct.FiveWs
   * @generated
   */
	EEnum getFiveWs();

	/**
   * Returns the meta object for enum '{@link org.be.textbe.ct.textct.Validity <em>Validity</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Validity</em>'.
   * @see org.be.textbe.ct.textct.Validity
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
	TextctFactory getTextctFactory();

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
	interface Literals {
		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.TextCTImpl <em>Text CT</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.TextCTImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getTextCT()
     * @generated
     */
		EClass TEXT_CT = eINSTANCE.getTextCT();

		/**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TEXT_CT__OPTIONS = eINSTANCE.getTextCT_Options();

		/**
     * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TEXT_CT__REQUIREMENTS = eINSTANCE.getTextCT_Requirements();

		/**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TEXT_CT__COMPONENTS = eINSTANCE.getTextCT_Components();

		/**
     * The meta object literal for the '<em><b>Composition Tree</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TEXT_CT__COMPOSITION_TREE = eINSTANCE.getTextCT_CompositionTree();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.RequirementListImpl <em>Requirement List</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.RequirementListImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRequirementList()
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
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.RequirementImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRequirement()
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
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.ComponentListImpl <em>Component List</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.ComponentListImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getComponentList()
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
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.ComponentImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getComponent()
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
     * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COMPONENT__QUANTIFIER = eINSTANCE.getComponent_Quantifier();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.SystemComponentImpl <em>System Component</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.SystemComponentImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getSystemComponent()
     * @generated
     */
		EClass SYSTEM_COMPONENT = eINSTANCE.getSystemComponent();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.OptionListImpl <em>Option List</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.OptionListImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getOptionList()
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
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.OptionImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getOption()
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
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.CompositionTreeImpl <em>Composition Tree</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.CompositionTreeImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getCompositionTree()
     * @generated
     */
		EClass COMPOSITION_TREE = eINSTANCE.getCompositionTree();

		/**
     * The meta object literal for the '<em><b>Root Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference COMPOSITION_TREE__ROOT_NODE = eINSTANCE.getCompositionTree_RootNode();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AbstractBehaviorImpl <em>Abstract Behavior</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AbstractBehaviorImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractBehavior()
     * @generated
     */
		EClass ABSTRACT_BEHAVIOR = eINSTANCE.getAbstractBehavior();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.RelationalBehaviorImpl <em>Relational Behavior</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.RelationalBehaviorImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRelationalBehavior()
     * @generated
     */
		EClass RELATIONAL_BEHAVIOR = eINSTANCE.getRelationalBehavior();

		/**
     * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RELATIONAL_BEHAVIOR__BEHAVIOR = eINSTANCE.getRelationalBehavior_Behavior();

		/**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RELATIONAL_BEHAVIOR__RELATIONS = eINSTANCE.getRelationalBehavior_Relations();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.RelationImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getRelation()
     * @generated
     */
		EClass RELATION = eINSTANCE.getRelation();

		/**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__QUESTION = eINSTANCE.getRelation_Question();

		/**
     * The meta object literal for the '<em><b>Preposition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__PREPOSITION = eINSTANCE.getRelation_Preposition();

		/**
     * The meta object literal for the '<em><b>Component Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__COMPONENT_REF = eINSTANCE.getRelation_ComponentRef();

		/**
     * The meta object literal for the '<em><b>Behavior Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__BEHAVIOR_REF = eINSTANCE.getRelation_BehaviorRef();

		/**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__LEVEL = eINSTANCE.getRelation_Level();

		/**
     * The meta object literal for the '<em><b>Component Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__COMPONENT_LEVEL = eINSTANCE.getRelation_ComponentLevel();

		/**
     * The meta object literal for the '<em><b>Component Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__COMPONENT_SET = eINSTANCE.getRelation_ComponentSet();

		/**
     * The meta object literal for the '<em><b>Mci</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATION__MCI = eINSTANCE.getRelation_Mci();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.BehaviorImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getBehavior()
     * @generated
     */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BEHAVIOR__REF = eINSTANCE.getBehavior_Ref();

		/**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BEHAVIOR__VAL = eINSTANCE.getBehavior_Val();

		/**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference BEHAVIOR__RELATIONS = eINSTANCE.getBehavior_Relations();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.StateImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getState()
     * @generated
     */
		EClass STATE = eINSTANCE.getState();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.SelectionImpl <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.SelectionImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getSelection()
     * @generated
     */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.EventImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getEvent()
     * @generated
     */
		EClass EVENT = eINSTANCE.getEvent();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.GuardImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getGuard()
     * @generated
     */
		EClass GUARD = eINSTANCE.getGuard();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.InternalInputImpl <em>Internal Input</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.InternalInputImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInternalInput()
     * @generated
     */
		EClass INTERNAL_INPUT = eINSTANCE.getInternalInput();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.InternalOutputImpl <em>Internal Output</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.InternalOutputImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInternalOutput()
     * @generated
     */
		EClass INTERNAL_OUTPUT = eINSTANCE.getInternalOutput();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.ExternalInputImpl <em>External Input</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.ExternalInputImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getExternalInput()
     * @generated
     */
		EClass EXTERNAL_INPUT = eINSTANCE.getExternalInput();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.ExternalOutputImpl <em>External Output</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.ExternalOutputImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getExternalOutput()
     * @generated
     */
		EClass EXTERNAL_OUTPUT = eINSTANCE.getExternalOutput();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AssertionImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAssertion()
     * @generated
     */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AbstractBlockOrNodeImpl <em>Abstract Block Or Node</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AbstractBlockOrNodeImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractBlockOrNode()
     * @generated
     */
		EClass ABSTRACT_BLOCK_OR_NODE = eINSTANCE.getAbstractBlockOrNode();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AbstractBlockImpl <em>Abstract Block</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AbstractBlockImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractBlock()
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
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AbstractNodeImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAbstractNode()
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
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ABSTRACT_NODE__LABEL = eINSTANCE.getAbstractNode_Label();

		/**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ABSTRACT_NODE__OPERATOR = eINSTANCE.getAbstractNode_Operator();

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
     * The meta object literal for the '<em><b>Child Node</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ABSTRACT_NODE__CHILD_NODE = eINSTANCE.getAbstractNode_ChildNode();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.NodeImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getNode()
     * @generated
     */
		EClass NODE = eINSTANCE.getNode();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AggregatedNodeImpl <em>Aggregated Node</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AggregatedNodeImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAggregatedNode()
     * @generated
     */
		EClass AGGREGATED_NODE = eINSTANCE.getAggregatedNode();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.InheritedNodeImpl <em>Inherited Node</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.InheritedNodeImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInheritedNode()
     * @generated
     */
		EClass INHERITED_NODE = eINSTANCE.getInheritedNode();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AssociatedNodeImpl <em>Associated Node</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AssociatedNodeImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAssociatedNode()
     * @generated
     */
		EClass ASSOCIATED_NODE = eINSTANCE.getAssociatedNode();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AlternativeBlockImpl <em>Alternative Block</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AlternativeBlockImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAlternativeBlock()
     * @generated
     */
		EClass ALTERNATIVE_BLOCK = eINSTANCE.getAlternativeBlock();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AggregatedBlockImpl <em>Aggregated Block</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AggregatedBlockImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAggregatedBlock()
     * @generated
     */
		EClass AGGREGATED_BLOCK = eINSTANCE.getAggregatedBlock();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.AssociatedBlockImpl <em>Associated Block</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.AssociatedBlockImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getAssociatedBlock()
     * @generated
     */
		EClass ASSOCIATED_BLOCK = eINSTANCE.getAssociatedBlock();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.impl.InheritedBlockImpl <em>Inherited Block</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.impl.InheritedBlockImpl
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getInheritedBlock()
     * @generated
     */
		EClass INHERITED_BLOCK = eINSTANCE.getInheritedBlock();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.FiveWs <em>Five Ws</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.FiveWs
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getFiveWs()
     * @generated
     */
		EEnum FIVE_WS = eINSTANCE.getFiveWs();

		/**
     * The meta object literal for the '{@link org.be.textbe.ct.textct.Validity <em>Validity</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.be.textbe.ct.textct.Validity
     * @see org.be.textbe.ct.textct.impl.TextctPackageImpl#getValidity()
     * @generated
     */
		EEnum VALIDITY = eINSTANCE.getValidity();

	}

} //TextctPackage
