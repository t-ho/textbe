/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions.impl;

import org.be.textbe.expressions.AtLeastOne;
import org.be.textbe.expressions.AttributeRealisation;
import org.be.textbe.expressions.Behavior;
import org.be.textbe.expressions.BehaviorNode;
import org.be.textbe.expressions.BinaryExpression;
import org.be.textbe.expressions.BinaryOperator;
import org.be.textbe.expressions.BinaryRelation;
import org.be.textbe.expressions.BracketedExpression;
import org.be.textbe.expressions.Cardinality;
import org.be.textbe.expressions.ComponentInstantiation;
import org.be.textbe.expressions.ComponentInstantiationNode;
import org.be.textbe.expressions.EnumeratedSet;
import org.be.textbe.expressions.Event;
import org.be.textbe.expressions.ExpressionsFactory;
import org.be.textbe.expressions.ExpressionsPackage;
import org.be.textbe.expressions.ExternalInputEvent;
import org.be.textbe.expressions.ExternalOutputEvent;
import org.be.textbe.expressions.ForAll;
import org.be.textbe.expressions.ForOneArbitrary;
import org.be.textbe.expressions.ForSome;
import org.be.textbe.expressions.FunctionApplication;
import org.be.textbe.expressions.FuzzyExp;
import org.be.textbe.expressions.Guard;
import org.be.textbe.expressions.InternalInputEvent;
import org.be.textbe.expressions.InternalOutputEvent;
import org.be.textbe.expressions.Node;
import org.be.textbe.expressions.Reference;
import org.be.textbe.expressions.Selection;
import org.be.textbe.expressions.StateRealisation;
import org.be.textbe.expressions.Value;
import org.be.textbe.expressions.binarySymbol;

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
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpressionsFactory init()
  {
    try
    {
      ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.be.org/textbe/Expressions"); 
      if (theExpressionsFactory != null)
      {
        return theExpressionsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpressionsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsFactoryImpl()
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
      case ExpressionsPackage.NODE: return createNode();
      case ExpressionsPackage.BEHAVIOR_NODE: return createBehaviorNode();
      case ExpressionsPackage.BEHAVIOR: return createBehavior();
      case ExpressionsPackage.STATE_REALISATION: return createStateRealisation();
      case ExpressionsPackage.ATTRIBUTE_REALISATION: return createAttributeRealisation();
      case ExpressionsPackage.SELECTION: return createSelection();
      case ExpressionsPackage.EVENT: return createEvent();
      case ExpressionsPackage.GUARD: return createGuard();
      case ExpressionsPackage.INTERNAL_OUTPUT_EVENT: return createInternalOutputEvent();
      case ExpressionsPackage.INTERNAL_INPUT_EVENT: return createInternalInputEvent();
      case ExpressionsPackage.EXTERNAL_OUTPUT_EVENT: return createExternalOutputEvent();
      case ExpressionsPackage.EXTERNAL_INPUT_EVENT: return createExternalInputEvent();
      case ExpressionsPackage.COMPONENT_INSTANTIATION_NODE: return createComponentInstantiationNode();
      case ExpressionsPackage.FOR_ALL: return createForAll();
      case ExpressionsPackage.FOR_SOME: return createForSome();
      case ExpressionsPackage.AT_LEAST_ONE: return createAtLeastOne();
      case ExpressionsPackage.FOR_ONE_ARBITRARY: return createForOneArbitrary();
      case ExpressionsPackage.COMPONENT_INSTANTIATION: return createComponentInstantiation();
      case ExpressionsPackage.BINARY_RELATION: return createBinaryRelation();
      case ExpressionsPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case ExpressionsPackage.VALUE: return createValue();
      case ExpressionsPackage.REFERENCE: return createReference();
      case ExpressionsPackage.NUMBER: return createNumber();
      case ExpressionsPackage.FUNCTION_APPLICATION: return createFunctionApplication();
      case ExpressionsPackage.BRACKETED_EXPRESSION: return createBracketedExpression();
      case ExpressionsPackage.CARDINALITY: return createCardinality();
      case ExpressionsPackage.ENUMERATED_SET: return createEnumeratedSet();
      case ExpressionsPackage.FUZZY_EXP: return createFuzzyExp();
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
      case ExpressionsPackage.BINARY_SYMBOL:
        return createbinarySymbolFromString(eDataType, initialValue);
      case ExpressionsPackage.BINARY_OPERATOR:
        return createBinaryOperatorFromString(eDataType, initialValue);
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
      case ExpressionsPackage.BINARY_SYMBOL:
        return convertbinarySymbolToString(eDataType, instanceValue);
      case ExpressionsPackage.BINARY_OPERATOR:
        return convertBinaryOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
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
  public BehaviorNode createBehaviorNode()
  {
    BehaviorNodeImpl behaviorNode = new BehaviorNodeImpl();
    return behaviorNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior createBehavior()
  {
    BehaviorImpl behavior = new BehaviorImpl();
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateRealisation createStateRealisation()
  {
    StateRealisationImpl stateRealisation = new StateRealisationImpl();
    return stateRealisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeRealisation createAttributeRealisation()
  {
    AttributeRealisationImpl attributeRealisation = new AttributeRealisationImpl();
    return attributeRealisation;
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
  public InternalOutputEvent createInternalOutputEvent()
  {
    InternalOutputEventImpl internalOutputEvent = new InternalOutputEventImpl();
    return internalOutputEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalInputEvent createInternalInputEvent()
  {
    InternalInputEventImpl internalInputEvent = new InternalInputEventImpl();
    return internalInputEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalOutputEvent createExternalOutputEvent()
  {
    ExternalOutputEventImpl externalOutputEvent = new ExternalOutputEventImpl();
    return externalOutputEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalInputEvent createExternalInputEvent()
  {
    ExternalInputEventImpl externalInputEvent = new ExternalInputEventImpl();
    return externalInputEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentInstantiationNode createComponentInstantiationNode()
  {
    ComponentInstantiationNodeImpl componentInstantiationNode = new ComponentInstantiationNodeImpl();
    return componentInstantiationNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAll createForAll()
  {
    ForAllImpl forAll = new ForAllImpl();
    return forAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForSome createForSome()
  {
    ForSomeImpl forSome = new ForSomeImpl();
    return forSome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtLeastOne createAtLeastOne()
  {
    AtLeastOneImpl atLeastOne = new AtLeastOneImpl();
    return atLeastOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForOneArbitrary createForOneArbitrary()
  {
    ForOneArbitraryImpl forOneArbitrary = new ForOneArbitraryImpl();
    return forOneArbitrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentInstantiation createComponentInstantiation()
  {
    ComponentInstantiationImpl componentInstantiation = new ComponentInstantiationImpl();
    return componentInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryRelation createBinaryRelation()
  {
    BinaryRelationImpl binaryRelation = new BinaryRelationImpl();
    return binaryRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.be.textbe.expressions.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionApplication createFunctionApplication()
  {
    FunctionApplicationImpl functionApplication = new FunctionApplicationImpl();
    return functionApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BracketedExpression createBracketedExpression()
  {
    BracketedExpressionImpl bracketedExpression = new BracketedExpressionImpl();
    return bracketedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinality()
  {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumeratedSet createEnumeratedSet()
  {
    EnumeratedSetImpl enumeratedSet = new EnumeratedSetImpl();
    return enumeratedSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyExp createFuzzyExp()
  {
    FuzzyExpImpl fuzzyExp = new FuzzyExpImpl();
    return fuzzyExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binarySymbol createbinarySymbolFromString(EDataType eDataType, String initialValue)
  {
    binarySymbol result = binarySymbol.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertbinarySymbolToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryOperator result = BinaryOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsPackage getExpressionsPackage()
  {
    return (ExpressionsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpressionsPackage getPackage()
  {
    return ExpressionsPackage.eINSTANCE;
  }

} //ExpressionsFactoryImpl
