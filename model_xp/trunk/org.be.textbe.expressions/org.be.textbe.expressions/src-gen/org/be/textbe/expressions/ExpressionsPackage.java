/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;

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
 * @see org.be.textbe.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "expressions";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.be.org/textbe/Expressions";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "expressions";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExpressionsPackage eINSTANCE = org.be.textbe.expressions.impl.ExpressionsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.NodeImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getNode()
   * @generated
   */
  int NODE = 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.BehaviorNodeImpl <em>Behavior Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.BehaviorNodeImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBehaviorNode()
   * @generated
   */
  int BEHAVIOR_NODE = 1;

  /**
   * The feature id for the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_NODE__COMPONENT = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_NODE__BEHAVIOR = NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Behavior Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.BehaviorImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 2;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.StateRealisationImpl <em>State Realisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.StateRealisationImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getStateRealisation()
   * @generated
   */
  int STATE_REALISATION = 3;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALISATION__STATE = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Realisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALISATION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.AttributeRealisationImpl <em>Attribute Realisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.AttributeRealisationImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getAttributeRealisation()
   * @generated
   */
  int ATTRIBUTE_REALISATION = 4;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALISATION__ATTRIBUTE = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALISATION__VALUE = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Realisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALISATION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.SelectionImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 5;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.EventImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 6;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.GuardImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 7;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__STATE = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.InternalOutputEventImpl <em>Internal Output Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.InternalOutputEventImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getInternalOutputEvent()
   * @generated
   */
  int INTERNAL_OUTPUT_EVENT = 8;

  /**
   * The number of structural features of the '<em>Internal Output Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_OUTPUT_EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.InternalInputEventImpl <em>Internal Input Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.InternalInputEventImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getInternalInputEvent()
   * @generated
   */
  int INTERNAL_INPUT_EVENT = 9;

  /**
   * The number of structural features of the '<em>Internal Input Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_INPUT_EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ExternalOutputEventImpl <em>External Output Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ExternalOutputEventImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getExternalOutputEvent()
   * @generated
   */
  int EXTERNAL_OUTPUT_EVENT = 10;

  /**
   * The number of structural features of the '<em>External Output Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OUTPUT_EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ExternalInputEventImpl <em>External Input Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ExternalInputEventImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getExternalInputEvent()
   * @generated
   */
  int EXTERNAL_INPUT_EVENT = 11;

  /**
   * The number of structural features of the '<em>External Input Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_INPUT_EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ComponentInstantiationNodeImpl <em>Component Instantiation Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ComponentInstantiationNodeImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getComponentInstantiationNode()
   * @generated
   */
  int COMPONENT_INSTANTIATION_NODE = 12;

  /**
   * The number of structural features of the '<em>Component Instantiation Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ForAllImpl <em>For All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ForAllImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getForAll()
   * @generated
   */
  int FOR_ALL = 13;

  /**
   * The number of structural features of the '<em>For All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ForSomeImpl <em>For Some</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ForSomeImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getForSome()
   * @generated
   */
  int FOR_SOME = 14;

  /**
   * The number of structural features of the '<em>For Some</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_SOME_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.AtLeastOneImpl <em>At Least One</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.AtLeastOneImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getAtLeastOne()
   * @generated
   */
  int AT_LEAST_ONE = 15;

  /**
   * The number of structural features of the '<em>At Least One</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST_ONE_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ForOneArbitraryImpl <em>For One Arbitrary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ForOneArbitraryImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getForOneArbitrary()
   * @generated
   */
  int FOR_ONE_ARBITRARY = 16;

  /**
   * The number of structural features of the '<em>For One Arbitrary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ONE_ARBITRARY_FEATURE_COUNT = COMPONENT_INSTANTIATION_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ComponentInstantiationImpl <em>Component Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ComponentInstantiationImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getComponentInstantiation()
   * @generated
   */
  int COMPONENT_INSTANTIATION = 17;

  /**
   * The feature id for the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANTIATION__COMPONENT = FOR_ALL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Component Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANTIATION__COMPONENT_SET = FOR_ALL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INSTANTIATION_FEATURE_COUNT = FOR_ALL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.BinaryRelationImpl <em>Binary Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.BinaryRelationImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBinaryRelation()
   * @generated
   */
  int BINARY_RELATION = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_RELATION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_RELATION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_RELATION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Binary Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_RELATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.BinaryExpressionImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__LEFT_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__RIGHT_EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ValueImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getValue()
   * @generated
   */
  int VALUE = 20;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.ReferenceImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 21;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OBJECT = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.NumberImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.FunctionApplicationImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getFunctionApplication()
   * @generated
   */
  int FUNCTION_APPLICATION = 23;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_APPLICATION__FUNCTION_NAME = SELECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_APPLICATION__PARAMETER = SELECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_APPLICATION_FEATURE_COUNT = SELECTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.BracketedExpressionImpl <em>Bracketed Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.BracketedExpressionImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBracketedExpression()
   * @generated
   */
  int BRACKETED_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETED_EXPRESSION__EXPRESSION = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bracketed Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETED_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.CardinalityImpl <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.CardinalityImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 25;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__EXPRESSION = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.EnumeratedSetImpl <em>Enumerated Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.EnumeratedSetImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getEnumeratedSet()
   * @generated
   */
  int ENUMERATED_SET = 26;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_SET__EXPRESSIONS = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumerated Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_SET_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.impl.FuzzyExpImpl <em>Fuzzy Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.impl.FuzzyExpImpl
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getFuzzyExp()
   * @generated
   */
  int FUZZY_EXP = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_EXP__EXPRESSION = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fuzzy Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_EXP_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.binarySymbol <em>binary Symbol</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.binarySymbol
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getbinarySymbol()
   * @generated
   */
  int BINARY_SYMBOL = 28;

  /**
   * The meta object id for the '{@link org.be.textbe.expressions.BinaryOperator <em>Binary Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.expressions.BinaryOperator
   * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
   * @generated
   */
  int BINARY_OPERATOR = 29;


  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.be.textbe.expressions.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.BehaviorNode <em>Behavior Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Node</em>'.
   * @see org.be.textbe.expressions.BehaviorNode
   * @generated
   */
  EClass getBehaviorNode();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.BehaviorNode#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component</em>'.
   * @see org.be.textbe.expressions.BehaviorNode#getComponent()
   * @see #getBehaviorNode()
   * @generated
   */
  EAttribute getBehaviorNode_Component();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.BehaviorNode#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behavior</em>'.
   * @see org.be.textbe.expressions.BehaviorNode#getBehavior()
   * @see #getBehaviorNode()
   * @generated
   */
  EReference getBehaviorNode_Behavior();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see org.be.textbe.expressions.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.StateRealisation <em>State Realisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Realisation</em>'.
   * @see org.be.textbe.expressions.StateRealisation
   * @generated
   */
  EClass getStateRealisation();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.StateRealisation#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.be.textbe.expressions.StateRealisation#getState()
   * @see #getStateRealisation()
   * @generated
   */
  EReference getStateRealisation_State();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.AttributeRealisation <em>Attribute Realisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Realisation</em>'.
   * @see org.be.textbe.expressions.AttributeRealisation
   * @generated
   */
  EClass getAttributeRealisation();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.AttributeRealisation#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.be.textbe.expressions.AttributeRealisation#getAttribute()
   * @see #getAttributeRealisation()
   * @generated
   */
  EAttribute getAttributeRealisation_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.AttributeRealisation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.be.textbe.expressions.AttributeRealisation#getValue()
   * @see #getAttributeRealisation()
   * @generated
   */
  EReference getAttributeRealisation_Value();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see org.be.textbe.expressions.Selection
   * @generated
   */
  EClass getSelection();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.be.textbe.expressions.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.be.textbe.expressions.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.Guard#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.be.textbe.expressions.Guard#getState()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_State();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.InternalOutputEvent <em>Internal Output Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Output Event</em>'.
   * @see org.be.textbe.expressions.InternalOutputEvent
   * @generated
   */
  EClass getInternalOutputEvent();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.InternalInputEvent <em>Internal Input Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Input Event</em>'.
   * @see org.be.textbe.expressions.InternalInputEvent
   * @generated
   */
  EClass getInternalInputEvent();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.ExternalOutputEvent <em>External Output Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Output Event</em>'.
   * @see org.be.textbe.expressions.ExternalOutputEvent
   * @generated
   */
  EClass getExternalOutputEvent();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.ExternalInputEvent <em>External Input Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Input Event</em>'.
   * @see org.be.textbe.expressions.ExternalInputEvent
   * @generated
   */
  EClass getExternalInputEvent();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.ComponentInstantiationNode <em>Component Instantiation Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Instantiation Node</em>'.
   * @see org.be.textbe.expressions.ComponentInstantiationNode
   * @generated
   */
  EClass getComponentInstantiationNode();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.ForAll <em>For All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For All</em>'.
   * @see org.be.textbe.expressions.ForAll
   * @generated
   */
  EClass getForAll();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.ForSome <em>For Some</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Some</em>'.
   * @see org.be.textbe.expressions.ForSome
   * @generated
   */
  EClass getForSome();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.AtLeastOne <em>At Least One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Least One</em>'.
   * @see org.be.textbe.expressions.AtLeastOne
   * @generated
   */
  EClass getAtLeastOne();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.ForOneArbitrary <em>For One Arbitrary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For One Arbitrary</em>'.
   * @see org.be.textbe.expressions.ForOneArbitrary
   * @generated
   */
  EClass getForOneArbitrary();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.ComponentInstantiation <em>Component Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Instantiation</em>'.
   * @see org.be.textbe.expressions.ComponentInstantiation
   * @generated
   */
  EClass getComponentInstantiation();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.ComponentInstantiation#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component</em>'.
   * @see org.be.textbe.expressions.ComponentInstantiation#getComponent()
   * @see #getComponentInstantiation()
   * @generated
   */
  EAttribute getComponentInstantiation_Component();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.ComponentInstantiation#getComponentSet <em>Component Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component Set</em>'.
   * @see org.be.textbe.expressions.ComponentInstantiation#getComponentSet()
   * @see #getComponentInstantiation()
   * @generated
   */
  EReference getComponentInstantiation_ComponentSet();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.BinaryRelation <em>Binary Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Relation</em>'.
   * @see org.be.textbe.expressions.BinaryRelation
   * @generated
   */
  EClass getBinaryRelation();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.BinaryRelation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.be.textbe.expressions.BinaryRelation#getLeft()
   * @see #getBinaryRelation()
   * @generated
   */
  EReference getBinaryRelation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.BinaryRelation#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.be.textbe.expressions.BinaryRelation#getOperator()
   * @see #getBinaryRelation()
   * @generated
   */
  EAttribute getBinaryRelation_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.BinaryRelation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.be.textbe.expressions.BinaryRelation#getRight()
   * @see #getBinaryRelation()
   * @generated
   */
  EReference getBinaryRelation_Right();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see org.be.textbe.expressions.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.BinaryExpression#getLeftExpression <em>Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expression</em>'.
   * @see org.be.textbe.expressions.BinaryExpression#getLeftExpression()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_LeftExpression();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.BinaryExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.be.textbe.expressions.BinaryExpression#getOperator()
   * @see #getBinaryExpression()
   * @generated
   */
  EAttribute getBinaryExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.BinaryExpression#getRightExpression <em>Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expression</em>'.
   * @see org.be.textbe.expressions.BinaryExpression#getRightExpression()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_RightExpression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.be.textbe.expressions.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.be.textbe.expressions.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.Reference#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.be.textbe.expressions.Reference#getObject()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Object();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see org.be.textbe.expressions.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.be.textbe.expressions.Number#getValue()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_Value();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.FunctionApplication <em>Function Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Application</em>'.
   * @see org.be.textbe.expressions.FunctionApplication
   * @generated
   */
  EClass getFunctionApplication();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.expressions.FunctionApplication#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.be.textbe.expressions.FunctionApplication#getFunctionName()
   * @see #getFunctionApplication()
   * @generated
   */
  EAttribute getFunctionApplication_FunctionName();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.expressions.FunctionApplication#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see org.be.textbe.expressions.FunctionApplication#getParameter()
   * @see #getFunctionApplication()
   * @generated
   */
  EReference getFunctionApplication_Parameter();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.BracketedExpression <em>Bracketed Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracketed Expression</em>'.
   * @see org.be.textbe.expressions.BracketedExpression
   * @generated
   */
  EClass getBracketedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.BracketedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.be.textbe.expressions.BracketedExpression#getExpression()
   * @see #getBracketedExpression()
   * @generated
   */
  EReference getBracketedExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see org.be.textbe.expressions.Cardinality
   * @generated
   */
  EClass getCardinality();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.Cardinality#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.be.textbe.expressions.Cardinality#getExpression()
   * @see #getCardinality()
   * @generated
   */
  EReference getCardinality_Expression();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.EnumeratedSet <em>Enumerated Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumerated Set</em>'.
   * @see org.be.textbe.expressions.EnumeratedSet
   * @generated
   */
  EClass getEnumeratedSet();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.expressions.EnumeratedSet#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.be.textbe.expressions.EnumeratedSet#getExpressions()
   * @see #getEnumeratedSet()
   * @generated
   */
  EReference getEnumeratedSet_Expressions();

  /**
   * Returns the meta object for class '{@link org.be.textbe.expressions.FuzzyExp <em>Fuzzy Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Exp</em>'.
   * @see org.be.textbe.expressions.FuzzyExp
   * @generated
   */
  EClass getFuzzyExp();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.expressions.FuzzyExp#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.be.textbe.expressions.FuzzyExp#getExpression()
   * @see #getFuzzyExp()
   * @generated
   */
  EReference getFuzzyExp_Expression();

  /**
   * Returns the meta object for enum '{@link org.be.textbe.expressions.binarySymbol <em>binary Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>binary Symbol</em>'.
   * @see org.be.textbe.expressions.binarySymbol
   * @generated
   */
  EEnum getbinarySymbol();

  /**
   * Returns the meta object for enum '{@link org.be.textbe.expressions.BinaryOperator <em>Binary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Operator</em>'.
   * @see org.be.textbe.expressions.BinaryOperator
   * @generated
   */
  EEnum getBinaryOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExpressionsFactory getExpressionsFactory();

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
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.NodeImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.BehaviorNodeImpl <em>Behavior Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.BehaviorNodeImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBehaviorNode()
     * @generated
     */
    EClass BEHAVIOR_NODE = eINSTANCE.getBehaviorNode();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR_NODE__COMPONENT = eINSTANCE.getBehaviorNode_Component();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_NODE__BEHAVIOR = eINSTANCE.getBehaviorNode_Behavior();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.BehaviorImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.StateRealisationImpl <em>State Realisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.StateRealisationImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getStateRealisation()
     * @generated
     */
    EClass STATE_REALISATION = eINSTANCE.getStateRealisation();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_REALISATION__STATE = eINSTANCE.getStateRealisation_State();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.AttributeRealisationImpl <em>Attribute Realisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.AttributeRealisationImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getAttributeRealisation()
     * @generated
     */
    EClass ATTRIBUTE_REALISATION = eINSTANCE.getAttributeRealisation();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_REALISATION__ATTRIBUTE = eINSTANCE.getAttributeRealisation_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_REALISATION__VALUE = eINSTANCE.getAttributeRealisation_Value();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.SelectionImpl <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.SelectionImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getSelection()
     * @generated
     */
    EClass SELECTION = eINSTANCE.getSelection();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.EventImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.GuardImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__STATE = eINSTANCE.getGuard_State();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.InternalOutputEventImpl <em>Internal Output Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.InternalOutputEventImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getInternalOutputEvent()
     * @generated
     */
    EClass INTERNAL_OUTPUT_EVENT = eINSTANCE.getInternalOutputEvent();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.InternalInputEventImpl <em>Internal Input Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.InternalInputEventImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getInternalInputEvent()
     * @generated
     */
    EClass INTERNAL_INPUT_EVENT = eINSTANCE.getInternalInputEvent();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ExternalOutputEventImpl <em>External Output Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ExternalOutputEventImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getExternalOutputEvent()
     * @generated
     */
    EClass EXTERNAL_OUTPUT_EVENT = eINSTANCE.getExternalOutputEvent();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ExternalInputEventImpl <em>External Input Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ExternalInputEventImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getExternalInputEvent()
     * @generated
     */
    EClass EXTERNAL_INPUT_EVENT = eINSTANCE.getExternalInputEvent();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ComponentInstantiationNodeImpl <em>Component Instantiation Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ComponentInstantiationNodeImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getComponentInstantiationNode()
     * @generated
     */
    EClass COMPONENT_INSTANTIATION_NODE = eINSTANCE.getComponentInstantiationNode();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ForAllImpl <em>For All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ForAllImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getForAll()
     * @generated
     */
    EClass FOR_ALL = eINSTANCE.getForAll();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ForSomeImpl <em>For Some</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ForSomeImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getForSome()
     * @generated
     */
    EClass FOR_SOME = eINSTANCE.getForSome();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.AtLeastOneImpl <em>At Least One</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.AtLeastOneImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getAtLeastOne()
     * @generated
     */
    EClass AT_LEAST_ONE = eINSTANCE.getAtLeastOne();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ForOneArbitraryImpl <em>For One Arbitrary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ForOneArbitraryImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getForOneArbitrary()
     * @generated
     */
    EClass FOR_ONE_ARBITRARY = eINSTANCE.getForOneArbitrary();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ComponentInstantiationImpl <em>Component Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ComponentInstantiationImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getComponentInstantiation()
     * @generated
     */
    EClass COMPONENT_INSTANTIATION = eINSTANCE.getComponentInstantiation();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_INSTANTIATION__COMPONENT = eINSTANCE.getComponentInstantiation_Component();

    /**
     * The meta object literal for the '<em><b>Component Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_INSTANTIATION__COMPONENT_SET = eINSTANCE.getComponentInstantiation_ComponentSet();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.BinaryRelationImpl <em>Binary Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.BinaryRelationImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBinaryRelation()
     * @generated
     */
    EClass BINARY_RELATION = eINSTANCE.getBinaryRelation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_RELATION__LEFT = eINSTANCE.getBinaryRelation_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_RELATION__OPERATOR = eINSTANCE.getBinaryRelation_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_RELATION__RIGHT = eINSTANCE.getBinaryRelation_Right();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.BinaryExpressionImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
     * @generated
     */
    EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

    /**
     * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__LEFT_EXPRESSION = eINSTANCE.getBinaryExpression_LeftExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__RIGHT_EXPRESSION = eINSTANCE.getBinaryExpression_RightExpression();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ValueImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.ReferenceImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__OBJECT = eINSTANCE.getReference_Object();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.NumberImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.FunctionApplicationImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getFunctionApplication()
     * @generated
     */
    EClass FUNCTION_APPLICATION = eINSTANCE.getFunctionApplication();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_APPLICATION__FUNCTION_NAME = eINSTANCE.getFunctionApplication_FunctionName();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_APPLICATION__PARAMETER = eINSTANCE.getFunctionApplication_Parameter();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.BracketedExpressionImpl <em>Bracketed Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.BracketedExpressionImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBracketedExpression()
     * @generated
     */
    EClass BRACKETED_EXPRESSION = eINSTANCE.getBracketedExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRACKETED_EXPRESSION__EXPRESSION = eINSTANCE.getBracketedExpression_Expression();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.CardinalityImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getCardinality()
     * @generated
     */
    EClass CARDINALITY = eINSTANCE.getCardinality();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARDINALITY__EXPRESSION = eINSTANCE.getCardinality_Expression();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.EnumeratedSetImpl <em>Enumerated Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.EnumeratedSetImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getEnumeratedSet()
     * @generated
     */
    EClass ENUMERATED_SET = eINSTANCE.getEnumeratedSet();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATED_SET__EXPRESSIONS = eINSTANCE.getEnumeratedSet_Expressions();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.impl.FuzzyExpImpl <em>Fuzzy Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.impl.FuzzyExpImpl
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getFuzzyExp()
     * @generated
     */
    EClass FUZZY_EXP = eINSTANCE.getFuzzyExp();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUZZY_EXP__EXPRESSION = eINSTANCE.getFuzzyExp_Expression();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.binarySymbol <em>binary Symbol</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.binarySymbol
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getbinarySymbol()
     * @generated
     */
    EEnum BINARY_SYMBOL = eINSTANCE.getbinarySymbol();

    /**
     * The meta object literal for the '{@link org.be.textbe.expressions.BinaryOperator <em>Binary Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.expressions.BinaryOperator
     * @see org.be.textbe.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
     * @generated
     */
    EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

  }

} //ExpressionsPackage
