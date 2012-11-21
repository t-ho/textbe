/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.impl;

import org.be.textbe.bt.v1.textbt.*;

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
public class TextbtFactoryImpl extends EFactoryImpl implements TextbtFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TextbtFactory init()
  {
    try
    {
      TextbtFactory theTextbtFactory = (TextbtFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.be.textbe/textbt/v1"); 
      if (theTextbtFactory != null)
      {
        return theTextbtFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextbtFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextbtFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TextbtPackage.SPECIFICATION: return createSpecification();
      case TextbtPackage.REQUIREMENT: return createRequirement();
      case TextbtPackage.COMPONENT: return createComponent();
      case TextbtPackage.STATE_REALIZATION: return createStateRealization();
      case TextbtPackage.SELECTION: return createSelection();
      case TextbtPackage.EVENT: return createEvent();
      case TextbtPackage.GUARD: return createGuard();
      case TextbtPackage.INTERNAL_INPUT: return createInternalInput();
      case TextbtPackage.INTERNAL_OUTPUT: return createInternalOutput();
      case TextbtPackage.EXTERNAL_INPUT: return createExternalInput();
      case TextbtPackage.EXTERNAL_OUTPUT: return createExternalOutput();
      case TextbtPackage.NODE: return createNode();
      case TextbtPackage.TRACEABILITY_LINK: return createTraceabilityLink();
      case TextbtPackage.PARALLEL: return createParallel();
      case TextbtPackage.ALTERNATIVE: return createAlternative();
      case TextbtPackage.ATOMIC: return createAtomic();
      case TextbtPackage.INTERLEAVING: return createInterleaving();
      case TextbtPackage.ASSERTION: return createAssertion();
      case TextbtPackage.WHO: return createWho();
      case TextbtPackage.WHAT: return createWhat();
      case TextbtPackage.WHERE: return createWhere();
      case TextbtPackage.WHEN: return createWhen();
      case TextbtPackage.WHY: return createWhy();
      case TextbtPackage.HOW: return createHow();
      case TextbtPackage.ATTRIBUTE_REALIZATION: return createAttributeRealization();
      case TextbtPackage.SYSTEM_COMPONENT: return createSystemComponent();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextbtPackage.TRACEABILITY_STATUS:
        return createTraceabilityStatusFromString(eDataType, initialValue);
      case TextbtPackage.NODE_TYPE:
        return createNodeTypeFromString(eDataType, initialValue);
      case TextbtPackage.COMPONENT_MARKER:
        return createComponentMarkerFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextbtPackage.TRACEABILITY_STATUS:
        return convertTraceabilityStatusToString(eDataType, instanceValue);
      case TextbtPackage.NODE_TYPE:
        return convertNodeTypeToString(eDataType, instanceValue);
      case TextbtPackage.COMPONENT_MARKER:
        return convertComponentMarkerToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
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
  public StateRealization createStateRealization()
  {
    StateRealizationImpl stateRealization = new StateRealizationImpl();
    return stateRealization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selection createSelection()
  {
    SelectionImpl selection = new SelectionImpl();
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalInput createInternalInput()
  {
    InternalInputImpl internalInput = new InternalInputImpl();
    return internalInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalOutput createInternalOutput()
  {
    InternalOutputImpl internalOutput = new InternalOutputImpl();
    return internalOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalInput createExternalInput()
  {
    ExternalInputImpl externalInput = new ExternalInputImpl();
    return externalInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalOutput createExternalOutput()
  {
    ExternalOutputImpl externalOutput = new ExternalOutputImpl();
    return externalOutput;
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
  public TraceabilityLink createTraceabilityLink()
  {
    TraceabilityLinkImpl traceabilityLink = new TraceabilityLinkImpl();
    return traceabilityLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallel createParallel()
  {
    ParallelImpl parallel = new ParallelImpl();
    return parallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interleaving createInterleaving()
  {
    InterleavingImpl interleaving = new InterleavingImpl();
    return interleaving;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Who createWho()
  {
    WhoImpl who = new WhoImpl();
    return who;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public What createWhat()
  {
    WhatImpl what = new WhatImpl();
    return what;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Where createWhere()
  {
    WhereImpl where = new WhereImpl();
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Why createWhy()
  {
    WhyImpl why = new WhyImpl();
    return why;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public How createHow()
  {
    HowImpl how = new HowImpl();
    return how;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeRealization createAttributeRealization()
  {
    AttributeRealizationImpl attributeRealization = new AttributeRealizationImpl();
    return attributeRealization;
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
  public TraceabilityStatus createTraceabilityStatusFromString(EDataType eDataType, String initialValue)
  {
    TraceabilityStatus result = TraceabilityStatus.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTraceabilityStatusToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue)
  {
    NodeType result = NodeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNodeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentMarker createComponentMarkerFromString(EDataType eDataType, String initialValue)
  {
    ComponentMarker result = ComponentMarker.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComponentMarkerToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextbtPackage getTextbtPackage()
  {
    return (TextbtPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TextbtPackage getPackage()
  {
    return TextbtPackage.eINSTANCE;
  }

} //TextbtFactoryImpl
