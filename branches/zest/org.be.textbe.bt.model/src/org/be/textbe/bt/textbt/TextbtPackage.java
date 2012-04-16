/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.textbt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.be.textbe.bt.textbt.TextbtFactory
 * @model kind="package"
 * @generated
 */
public interface TextbtPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textbt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org.be.textbe/textbt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textbt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextbtPackage eINSTANCE = org.be.textbe.bt.textbt.impl.TextbtPackageImpl.init();

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.SpecificationImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSpecification()
   * @generated
   */
  int SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__COMPONENTS = 0;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__REQUIREMENTS = 1;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__ROOT = 2;

  /**
   * The number of structural features of the '<em>Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.NamedElementImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.RequirementImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.ComponentImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__BEHAVIOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.BehaviorImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 3;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__NUMBER = 0;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__RELATIONS = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__ID = 2;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.StateRealizationImpl <em>State Realization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.StateRealizationImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getStateRealization()
   * @generated
   */
  int STATE_REALIZATION = 4;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALIZATION__NUMBER = BEHAVIOR__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALIZATION__RELATIONS = BEHAVIOR__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALIZATION__ID = BEHAVIOR__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALIZATION__NAME = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALIZATION__QUALIFIER = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Realization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REALIZATION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.SelectionImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 5;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__NUMBER = BEHAVIOR__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__RELATIONS = BEHAVIOR__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__ID = BEHAVIOR__ID;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.EventImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 6;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NUMBER = BEHAVIOR__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__RELATIONS = BEHAVIOR__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ID = BEHAVIOR__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.GuardImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 7;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__NUMBER = BEHAVIOR__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__RELATIONS = BEHAVIOR__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__ID = BEHAVIOR__ID;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.InputImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInput()
   * @generated
   */
  int INPUT = 13;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__NUMBER = EVENT__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__RELATIONS = EVENT__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__ID = EVENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__NAME = EVENT__NAME;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.InternalInputImpl <em>Internal Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.InternalInputImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInternalInput()
   * @generated
   */
  int INTERNAL_INPUT = 8;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_INPUT__NUMBER = INPUT__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_INPUT__RELATIONS = INPUT__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_INPUT__ID = INPUT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_INPUT__NAME = INPUT__NAME;

  /**
   * The number of structural features of the '<em>Internal Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.OutputImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 14;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__NUMBER = EVENT__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__RELATIONS = EVENT__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__ID = EVENT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__NAME = EVENT__NAME;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.InternalOutputImpl <em>Internal Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.InternalOutputImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInternalOutput()
   * @generated
   */
  int INTERNAL_OUTPUT = 9;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_OUTPUT__NUMBER = OUTPUT__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_OUTPUT__RELATIONS = OUTPUT__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_OUTPUT__ID = OUTPUT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_OUTPUT__NAME = OUTPUT__NAME;

  /**
   * The number of structural features of the '<em>Internal Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.ExternalInputImpl <em>External Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.ExternalInputImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getExternalInput()
   * @generated
   */
  int EXTERNAL_INPUT = 10;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_INPUT__NUMBER = INPUT__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_INPUT__RELATIONS = INPUT__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_INPUT__ID = INPUT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_INPUT__NAME = INPUT__NAME;

  /**
   * The number of structural features of the '<em>External Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.ExternalOutputImpl <em>External Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.ExternalOutputImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getExternalOutput()
   * @generated
   */
  int EXTERNAL_OUTPUT = 11;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OUTPUT__NUMBER = OUTPUT__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OUTPUT__RELATIONS = OUTPUT__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OUTPUT__ID = OUTPUT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OUTPUT__NAME = OUTPUT__NAME;

  /**
   * The number of structural features of the '<em>External Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.NodeImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNode()
   * @generated
   */
  int NODE = 12;

  /**
   * The feature id for the '<em><b>Traceability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TRACEABILITY = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__LABEL = 1;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__BEHAVIOR = 2;

  /**
   * The feature id for the '<em><b>Show Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__SHOW_TAG = 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__OPERATOR = 4;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.TraceabilityLinkImpl <em>Traceability Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.TraceabilityLinkImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getTraceabilityLink()
   * @generated
   */
  int TRACEABILITY_LINK = 15;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACEABILITY_LINK__STATUS = 0;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACEABILITY_LINK__REQUIREMENT = 1;

  /**
   * The number of structural features of the '<em>Traceability Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACEABILITY_LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.BehaviorTreeImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getBehaviorTree()
   * @generated
   */
  int BEHAVIOR_TREE = 16;

  /**
   * The number of structural features of the '<em>Behavior Tree</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_TREE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.SequenceImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 17;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__STEPS = BEHAVIOR_TREE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__CHILD = BEHAVIOR_TREE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = BEHAVIOR_TREE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.BranchImpl <em>Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.BranchImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 18;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = BEHAVIOR_TREE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.ParallelImpl <em>Parallel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.ParallelImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getParallel()
   * @generated
   */
  int PARALLEL = 19;

  /**
   * The feature id for the '<em><b>Processes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL__PROCESSES = BRANCH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parallel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.AlternativeImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 20;

  /**
   * The feature id for the '<em><b>Choices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__CHOICES = BRANCH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = BRANCH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.TransactionImpl <em>Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.TransactionImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getTransaction()
   * @generated
   */
  int TRANSACTION = 21;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__STEPS = SEQUENCE__STEPS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__CHILD = SEQUENCE__CHILD;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.InterleavingImpl <em>Interleaving</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.InterleavingImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInterleaving()
   * @generated
   */
  int INTERLEAVING = 22;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERLEAVING__STEPS = SEQUENCE__STEPS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERLEAVING__CHILD = SEQUENCE__CHILD;

  /**
   * The number of structural features of the '<em>Interleaving</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERLEAVING_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.AssertionImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 24;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__NUMBER = BEHAVIOR__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__RELATIONS = BEHAVIOR__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__ID = BEHAVIOR__ID;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.RelationImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 25;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__MULTI_LEVEL = 0;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.FreeTextRelationImpl <em>Free Text Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.FreeTextRelationImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getFreeTextRelation()
   * @generated
   */
  int FREE_TEXT_RELATION = 31;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_TEXT_RELATION__MULTI_LEVEL = RELATION__MULTI_LEVEL;

  /**
   * The number of structural features of the '<em>Free Text Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_TEXT_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.WhoImpl <em>Who</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.WhoImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWho()
   * @generated
   */
  int WHO = 26;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHO__MULTI_LEVEL = FREE_TEXT_RELATION__MULTI_LEVEL;

  /**
   * The feature id for the '<em><b>Person</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHO__PERSON = FREE_TEXT_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Who</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHO_FEATURE_COUNT = FREE_TEXT_RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.WhatImpl <em>What</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.WhatImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhat()
   * @generated
   */
  int WHAT = 27;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHAT__MULTI_LEVEL = FREE_TEXT_RELATION__MULTI_LEVEL;

  /**
   * The feature id for the '<em><b>Observation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHAT__OBSERVATION = FREE_TEXT_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>What</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHAT_FEATURE_COUNT = FREE_TEXT_RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.WhereImpl <em>Where</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.WhereImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhere()
   * @generated
   */
  int WHERE = 28;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__MULTI_LEVEL = FREE_TEXT_RELATION__MULTI_LEVEL;

  /**
   * The feature id for the '<em><b>Place</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__PLACE = FREE_TEXT_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Where</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_FEATURE_COUNT = FREE_TEXT_RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.WhenImpl <em>When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.WhenImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhen()
   * @generated
   */
  int WHEN = 29;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__MULTI_LEVEL = FREE_TEXT_RELATION__MULTI_LEVEL;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__TIME = FREE_TEXT_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_FEATURE_COUNT = FREE_TEXT_RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.WhyImpl <em>Why</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.WhyImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhy()
   * @generated
   */
  int WHY = 30;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHY__MULTI_LEVEL = FREE_TEXT_RELATION__MULTI_LEVEL;

  /**
   * The feature id for the '<em><b>Reason</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHY__REASON = FREE_TEXT_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Why</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHY_FEATURE_COUNT = FREE_TEXT_RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.HowImpl <em>How</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.HowImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getHow()
   * @generated
   */
  int HOW = 32;

  /**
   * The feature id for the '<em><b>Multi Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOW__MULTI_LEVEL = FREE_TEXT_RELATION__MULTI_LEVEL;

  /**
   * The feature id for the '<em><b>Means</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOW__MEANS = FREE_TEXT_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>How</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOW_FEATURE_COUNT = FREE_TEXT_RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.NamedBehaviorImpl <em>Named Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.NamedBehaviorImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNamedBehavior()
   * @generated
   */
  int NAMED_BEHAVIOR = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_BEHAVIOR__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_BEHAVIOR__NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_BEHAVIOR__RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_BEHAVIOR__ID = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Named Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_BEHAVIOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.AttributeRealizationImpl <em>Attribute Realization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.AttributeRealizationImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getAttributeRealization()
   * @generated
   */
  int ATTRIBUTE_REALIZATION = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALIZATION__NAME = NAMED_BEHAVIOR__NAME;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALIZATION__NUMBER = NAMED_BEHAVIOR__NUMBER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALIZATION__RELATIONS = NAMED_BEHAVIOR__RELATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALIZATION__ID = NAMED_BEHAVIOR__ID;

  /**
   * The number of structural features of the '<em>Attribute Realization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REALIZATION_FEATURE_COUNT = NAMED_BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.impl.SystemComponentImpl <em>System Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.impl.SystemComponentImpl
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSystemComponent()
   * @generated
   */
  int SYSTEM_COMPONENT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_COMPONENT__NAME = COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_COMPONENT__BEHAVIOR = COMPONENT__BEHAVIOR;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_COMPONENT__ID = COMPONENT__ID;

  /**
   * The number of structural features of the '<em>System Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.TraceabilityStatus <em>Traceability Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.TraceabilityStatus
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getTraceabilityStatus()
   * @generated
   */
  int TRACEABILITY_STATUS = 36;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.NodeType <em>Node Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.NodeType
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNodeType()
   * @generated
   */
  int NODE_TYPE = 37;

  /**
   * The meta object id for the '{@link org.be.textbe.bt.textbt.ComponentMarker <em>Component Marker</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.be.textbe.bt.textbt.ComponentMarker
   * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getComponentMarker()
   * @generated
   */
  int COMPONENT_MARKER = 38;

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see org.be.textbe.bt.textbt.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.Specification#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.be.textbe.bt.textbt.Specification#getComponents()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Components();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.Specification#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements</em>'.
   * @see org.be.textbe.bt.textbt.Specification#getRequirements()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Requirements();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.Specification#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see org.be.textbe.bt.textbt.Specification#getRoot()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Root();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see org.be.textbe.bt.textbt.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Requirement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.be.textbe.bt.textbt.Requirement#getId()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Id();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.be.textbe.bt.textbt.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.Component#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behavior</em>'.
   * @see org.be.textbe.bt.textbt.Component#getBehavior()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Behavior();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Component#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.be.textbe.bt.textbt.Component#getId()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Id();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see org.be.textbe.bt.textbt.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Behavior#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.be.textbe.bt.textbt.Behavior#getNumber()
   * @see #getBehavior()
   * @generated
   */
  EAttribute getBehavior_Number();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.Behavior#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.be.textbe.bt.textbt.Behavior#getRelations()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Relations();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Behavior#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.be.textbe.bt.textbt.Behavior#getId()
   * @see #getBehavior()
   * @generated
   */
  EAttribute getBehavior_Id();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.StateRealization <em>State Realization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Realization</em>'.
   * @see org.be.textbe.bt.textbt.StateRealization
   * @generated
   */
  EClass getStateRealization();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.StateRealization#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see org.be.textbe.bt.textbt.StateRealization#getQualifier()
   * @see #getStateRealization()
   * @generated
   */
  EAttribute getStateRealization_Qualifier();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see org.be.textbe.bt.textbt.Selection
   * @generated
   */
  EClass getSelection();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.be.textbe.bt.textbt.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.be.textbe.bt.textbt.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.InternalInput <em>Internal Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Input</em>'.
   * @see org.be.textbe.bt.textbt.InternalInput
   * @generated
   */
  EClass getInternalInput();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.InternalOutput <em>Internal Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Output</em>'.
   * @see org.be.textbe.bt.textbt.InternalOutput
   * @generated
   */
  EClass getInternalOutput();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.ExternalInput <em>External Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Input</em>'.
   * @see org.be.textbe.bt.textbt.ExternalInput
   * @generated
   */
  EClass getExternalInput();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.ExternalOutput <em>External Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Output</em>'.
   * @see org.be.textbe.bt.textbt.ExternalOutput
   * @generated
   */
  EClass getExternalOutput();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.be.textbe.bt.textbt.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.Node#getTraceability <em>Traceability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Traceability</em>'.
   * @see org.be.textbe.bt.textbt.Node#getTraceability()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Traceability();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Node#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.be.textbe.bt.textbt.Node#getLabel()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Label();

  /**
   * Returns the meta object for the reference '{@link org.be.textbe.bt.textbt.Node#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Behavior</em>'.
   * @see org.be.textbe.bt.textbt.Node#getBehavior()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Behavior();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Node#isShowTag <em>Show Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show Tag</em>'.
   * @see org.be.textbe.bt.textbt.Node#isShowTag()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_ShowTag();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Node#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.be.textbe.bt.textbt.Node#getOperator()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Operator();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.be.textbe.bt.textbt.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.be.textbe.bt.textbt.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.TraceabilityLink <em>Traceability Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Traceability Link</em>'.
   * @see org.be.textbe.bt.textbt.TraceabilityLink
   * @generated
   */
  EClass getTraceabilityLink();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.TraceabilityLink#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see org.be.textbe.bt.textbt.TraceabilityLink#getStatus()
   * @see #getTraceabilityLink()
   * @generated
   */
  EAttribute getTraceabilityLink_Status();

  /**
   * Returns the meta object for the reference list '{@link org.be.textbe.bt.textbt.TraceabilityLink#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Requirement</em>'.
   * @see org.be.textbe.bt.textbt.TraceabilityLink#getRequirement()
   * @see #getTraceabilityLink()
   * @generated
   */
  EReference getTraceabilityLink_Requirement();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.BehaviorTree <em>Behavior Tree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Tree</em>'.
   * @see org.be.textbe.bt.textbt.BehaviorTree
   * @generated
   */
  EClass getBehaviorTree();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see org.be.textbe.bt.textbt.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.Sequence#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see org.be.textbe.bt.textbt.Sequence#getSteps()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Steps();

  /**
   * Returns the meta object for the containment reference '{@link org.be.textbe.bt.textbt.Sequence#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.be.textbe.bt.textbt.Sequence#getChild()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Child();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch</em>'.
   * @see org.be.textbe.bt.textbt.Branch
   * @generated
   */
  EClass getBranch();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel</em>'.
   * @see org.be.textbe.bt.textbt.Parallel
   * @generated
   */
  EClass getParallel();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.Parallel#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processes</em>'.
   * @see org.be.textbe.bt.textbt.Parallel#getProcesses()
   * @see #getParallel()
   * @generated
   */
  EReference getParallel_Processes();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see org.be.textbe.bt.textbt.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.be.textbe.bt.textbt.Alternative#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choices</em>'.
   * @see org.be.textbe.bt.textbt.Alternative#getChoices()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_Choices();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction</em>'.
   * @see org.be.textbe.bt.textbt.Transaction
   * @generated
   */
  EClass getTransaction();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Interleaving <em>Interleaving</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interleaving</em>'.
   * @see org.be.textbe.bt.textbt.Interleaving
   * @generated
   */
  EClass getInterleaving();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.be.textbe.bt.textbt.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.be.textbe.bt.textbt.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see org.be.textbe.bt.textbt.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.be.textbe.bt.textbt.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link org.be.textbe.bt.textbt.Relation#isMultiLevel <em>Multi Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi Level</em>'.
   * @see org.be.textbe.bt.textbt.Relation#isMultiLevel()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_MultiLevel();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Who <em>Who</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Who</em>'.
   * @see org.be.textbe.bt.textbt.Who
   * @generated
   */
  EClass getWho();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt.textbt.Who#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Person</em>'.
   * @see org.be.textbe.bt.textbt.Who#getPerson()
   * @see #getWho()
   * @generated
   */
  EAttribute getWho_Person();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.What <em>What</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>What</em>'.
   * @see org.be.textbe.bt.textbt.What
   * @generated
   */
  EClass getWhat();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt.textbt.What#getObservation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Observation</em>'.
   * @see org.be.textbe.bt.textbt.What#getObservation()
   * @see #getWhat()
   * @generated
   */
  EAttribute getWhat_Observation();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Where <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where</em>'.
   * @see org.be.textbe.bt.textbt.Where
   * @generated
   */
  EClass getWhere();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt.textbt.Where#getPlace <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Place</em>'.
   * @see org.be.textbe.bt.textbt.Where#getPlace()
   * @see #getWhere()
   * @generated
   */
  EAttribute getWhere_Place();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When</em>'.
   * @see org.be.textbe.bt.textbt.When
   * @generated
   */
  EClass getWhen();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt.textbt.When#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Time</em>'.
   * @see org.be.textbe.bt.textbt.When#getTime()
   * @see #getWhen()
   * @generated
   */
  EAttribute getWhen_Time();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.Why <em>Why</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Why</em>'.
   * @see org.be.textbe.bt.textbt.Why
   * @generated
   */
  EClass getWhy();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt.textbt.Why#getReason <em>Reason</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reason</em>'.
   * @see org.be.textbe.bt.textbt.Why#getReason()
   * @see #getWhy()
   * @generated
   */
  EAttribute getWhy_Reason();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.FreeTextRelation <em>Free Text Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Text Relation</em>'.
   * @see org.be.textbe.bt.textbt.FreeTextRelation
   * @generated
   */
  EClass getFreeTextRelation();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.How <em>How</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>How</em>'.
   * @see org.be.textbe.bt.textbt.How
   * @generated
   */
  EClass getHow();

  /**
   * Returns the meta object for the attribute list '{@link org.be.textbe.bt.textbt.How#getMeans <em>Means</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Means</em>'.
   * @see org.be.textbe.bt.textbt.How#getMeans()
   * @see #getHow()
   * @generated
   */
  EAttribute getHow_Means();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.AttributeRealization <em>Attribute Realization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Realization</em>'.
   * @see org.be.textbe.bt.textbt.AttributeRealization
   * @generated
   */
  EClass getAttributeRealization();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.NamedBehavior <em>Named Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Behavior</em>'.
   * @see org.be.textbe.bt.textbt.NamedBehavior
   * @generated
   */
  EClass getNamedBehavior();

  /**
   * Returns the meta object for class '{@link org.be.textbe.bt.textbt.SystemComponent <em>System Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Component</em>'.
   * @see org.be.textbe.bt.textbt.SystemComponent
   * @generated
   */
  EClass getSystemComponent();

  /**
   * Returns the meta object for enum '{@link org.be.textbe.bt.textbt.TraceabilityStatus <em>Traceability Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Traceability Status</em>'.
   * @see org.be.textbe.bt.textbt.TraceabilityStatus
   * @generated
   */
  EEnum getTraceabilityStatus();

  /**
   * Returns the meta object for enum '{@link org.be.textbe.bt.textbt.NodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Type</em>'.
   * @see org.be.textbe.bt.textbt.NodeType
   * @generated
   */
  EEnum getNodeType();

  /**
   * Returns the meta object for enum '{@link org.be.textbe.bt.textbt.ComponentMarker <em>Component Marker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Component Marker</em>'.
   * @see org.be.textbe.bt.textbt.ComponentMarker
   * @generated
   */
  EEnum getComponentMarker();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextbtFactory getTextbtFactory();

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
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.SpecificationImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSpecification()
     * @generated
     */
    EClass SPECIFICATION = eINSTANCE.getSpecification();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__COMPONENTS = eINSTANCE.getSpecification_Components();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__REQUIREMENTS = eINSTANCE.getSpecification_Requirements();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__ROOT = eINSTANCE.getSpecification_Root();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.RequirementImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.ComponentImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__BEHAVIOR = eINSTANCE.getComponent_Behavior();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.BehaviorImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR__NUMBER = eINSTANCE.getBehavior_Number();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__RELATIONS = eINSTANCE.getBehavior_Relations();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR__ID = eINSTANCE.getBehavior_Id();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.StateRealizationImpl <em>State Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.StateRealizationImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getStateRealization()
     * @generated
     */
    EClass STATE_REALIZATION = eINSTANCE.getStateRealization();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_REALIZATION__QUALIFIER = eINSTANCE.getStateRealization_Qualifier();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.SelectionImpl <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.SelectionImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSelection()
     * @generated
     */
    EClass SELECTION = eINSTANCE.getSelection();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.EventImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.GuardImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.InternalInputImpl <em>Internal Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.InternalInputImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInternalInput()
     * @generated
     */
    EClass INTERNAL_INPUT = eINSTANCE.getInternalInput();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.InternalOutputImpl <em>Internal Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.InternalOutputImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInternalOutput()
     * @generated
     */
    EClass INTERNAL_OUTPUT = eINSTANCE.getInternalOutput();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.ExternalInputImpl <em>External Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.ExternalInputImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getExternalInput()
     * @generated
     */
    EClass EXTERNAL_INPUT = eINSTANCE.getExternalInput();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.ExternalOutputImpl <em>External Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.ExternalOutputImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getExternalOutput()
     * @generated
     */
    EClass EXTERNAL_OUTPUT = eINSTANCE.getExternalOutput();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.NodeImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Traceability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__TRACEABILITY = eINSTANCE.getNode_Traceability();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__BEHAVIOR = eINSTANCE.getNode_Behavior();

    /**
     * The meta object literal for the '<em><b>Show Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__SHOW_TAG = eINSTANCE.getNode_ShowTag();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__OPERATOR = eINSTANCE.getNode_Operator();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.InputImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.OutputImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.TraceabilityLinkImpl <em>Traceability Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.TraceabilityLinkImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getTraceabilityLink()
     * @generated
     */
    EClass TRACEABILITY_LINK = eINSTANCE.getTraceabilityLink();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACEABILITY_LINK__STATUS = eINSTANCE.getTraceabilityLink_Status();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACEABILITY_LINK__REQUIREMENT = eINSTANCE.getTraceabilityLink_Requirement();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.BehaviorTreeImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getBehaviorTree()
     * @generated
     */
    EClass BEHAVIOR_TREE = eINSTANCE.getBehaviorTree();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.SequenceImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__STEPS = eINSTANCE.getSequence_Steps();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__CHILD = eINSTANCE.getSequence_Child();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.BranchImpl <em>Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.BranchImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getBranch()
     * @generated
     */
    EClass BRANCH = eINSTANCE.getBranch();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.ParallelImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getParallel()
     * @generated
     */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL__PROCESSES = eINSTANCE.getParallel_Processes();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.AlternativeImpl <em>Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.AlternativeImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getAlternative()
     * @generated
     */
    EClass ALTERNATIVE = eINSTANCE.getAlternative();

    /**
     * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__CHOICES = eINSTANCE.getAlternative_Choices();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.TransactionImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getTransaction()
     * @generated
     */
    EClass TRANSACTION = eINSTANCE.getTransaction();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.InterleavingImpl <em>Interleaving</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.InterleavingImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getInterleaving()
     * @generated
     */
    EClass INTERLEAVING = eINSTANCE.getInterleaving();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.NamedElementImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.AssertionImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.RelationImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Multi Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__MULTI_LEVEL = eINSTANCE.getRelation_MultiLevel();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.WhoImpl <em>Who</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.WhoImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWho()
     * @generated
     */
    EClass WHO = eINSTANCE.getWho();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHO__PERSON = eINSTANCE.getWho_Person();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.WhatImpl <em>What</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.WhatImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhat()
     * @generated
     */
    EClass WHAT = eINSTANCE.getWhat();

    /**
     * The meta object literal for the '<em><b>Observation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHAT__OBSERVATION = eINSTANCE.getWhat_Observation();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.WhereImpl <em>Where</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.WhereImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhere()
     * @generated
     */
    EClass WHERE = eINSTANCE.getWhere();

    /**
     * The meta object literal for the '<em><b>Place</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE__PLACE = eINSTANCE.getWhere_Place();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.WhenImpl <em>When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.WhenImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhen()
     * @generated
     */
    EClass WHEN = eINSTANCE.getWhen();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHEN__TIME = eINSTANCE.getWhen_Time();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.WhyImpl <em>Why</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.WhyImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getWhy()
     * @generated
     */
    EClass WHY = eINSTANCE.getWhy();

    /**
     * The meta object literal for the '<em><b>Reason</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHY__REASON = eINSTANCE.getWhy_Reason();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.FreeTextRelationImpl <em>Free Text Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.FreeTextRelationImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getFreeTextRelation()
     * @generated
     */
    EClass FREE_TEXT_RELATION = eINSTANCE.getFreeTextRelation();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.HowImpl <em>How</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.HowImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getHow()
     * @generated
     */
    EClass HOW = eINSTANCE.getHow();

    /**
     * The meta object literal for the '<em><b>Means</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOW__MEANS = eINSTANCE.getHow_Means();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.AttributeRealizationImpl <em>Attribute Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.AttributeRealizationImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getAttributeRealization()
     * @generated
     */
    EClass ATTRIBUTE_REALIZATION = eINSTANCE.getAttributeRealization();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.NamedBehaviorImpl <em>Named Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.NamedBehaviorImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNamedBehavior()
     * @generated
     */
    EClass NAMED_BEHAVIOR = eINSTANCE.getNamedBehavior();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.impl.SystemComponentImpl <em>System Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.impl.SystemComponentImpl
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getSystemComponent()
     * @generated
     */
    EClass SYSTEM_COMPONENT = eINSTANCE.getSystemComponent();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.TraceabilityStatus <em>Traceability Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.TraceabilityStatus
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getTraceabilityStatus()
     * @generated
     */
    EEnum TRACEABILITY_STATUS = eINSTANCE.getTraceabilityStatus();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.NodeType <em>Node Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.NodeType
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getNodeType()
     * @generated
     */
    EEnum NODE_TYPE = eINSTANCE.getNodeType();

    /**
     * The meta object literal for the '{@link org.be.textbe.bt.textbt.ComponentMarker <em>Component Marker</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.be.textbe.bt.textbt.ComponentMarker
     * @see org.be.textbe.bt.textbt.impl.TextbtPackageImpl#getComponentMarker()
     * @generated
     */
    EEnum COMPONENT_MARKER = eINSTANCE.getComponentMarker();

  }

} //TextbtPackage
