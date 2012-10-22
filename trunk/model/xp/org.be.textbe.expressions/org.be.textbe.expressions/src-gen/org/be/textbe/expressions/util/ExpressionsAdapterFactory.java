/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions.util;

import org.be.textbe.expressions.AtLeastOne;
import org.be.textbe.expressions.AttributeRealisation;
import org.be.textbe.expressions.Behavior;
import org.be.textbe.expressions.BehaviorNode;
import org.be.textbe.expressions.BinaryExpression;
import org.be.textbe.expressions.BinaryRelation;
import org.be.textbe.expressions.BracketedExpression;
import org.be.textbe.expressions.Cardinality;
import org.be.textbe.expressions.ComponentInstantiation;
import org.be.textbe.expressions.ComponentInstantiationNode;
import org.be.textbe.expressions.EnumeratedSet;
import org.be.textbe.expressions.Event;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpressionsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpressionsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionsSwitch<Adapter> modelSwitch =
    new ExpressionsSwitch<Adapter>()
    {
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseBehaviorNode(BehaviorNode object)
      {
        return createBehaviorNodeAdapter();
      }
      @Override
      public Adapter caseBehavior(Behavior object)
      {
        return createBehaviorAdapter();
      }
      @Override
      public Adapter caseStateRealisation(StateRealisation object)
      {
        return createStateRealisationAdapter();
      }
      @Override
      public Adapter caseAttributeRealisation(AttributeRealisation object)
      {
        return createAttributeRealisationAdapter();
      }
      @Override
      public Adapter caseSelection(Selection object)
      {
        return createSelectionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseGuard(Guard object)
      {
        return createGuardAdapter();
      }
      @Override
      public Adapter caseInternalOutputEvent(InternalOutputEvent object)
      {
        return createInternalOutputEventAdapter();
      }
      @Override
      public Adapter caseInternalInputEvent(InternalInputEvent object)
      {
        return createInternalInputEventAdapter();
      }
      @Override
      public Adapter caseExternalOutputEvent(ExternalOutputEvent object)
      {
        return createExternalOutputEventAdapter();
      }
      @Override
      public Adapter caseExternalInputEvent(ExternalInputEvent object)
      {
        return createExternalInputEventAdapter();
      }
      @Override
      public Adapter caseComponentInstantiationNode(ComponentInstantiationNode object)
      {
        return createComponentInstantiationNodeAdapter();
      }
      @Override
      public Adapter caseForAll(ForAll object)
      {
        return createForAllAdapter();
      }
      @Override
      public Adapter caseForSome(ForSome object)
      {
        return createForSomeAdapter();
      }
      @Override
      public Adapter caseAtLeastOne(AtLeastOne object)
      {
        return createAtLeastOneAdapter();
      }
      @Override
      public Adapter caseForOneArbitrary(ForOneArbitrary object)
      {
        return createForOneArbitraryAdapter();
      }
      @Override
      public Adapter caseComponentInstantiation(ComponentInstantiation object)
      {
        return createComponentInstantiationAdapter();
      }
      @Override
      public Adapter caseBinaryRelation(BinaryRelation object)
      {
        return createBinaryRelationAdapter();
      }
      @Override
      public Adapter caseBinaryExpression(BinaryExpression object)
      {
        return createBinaryExpressionAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseNumber(org.be.textbe.expressions.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter caseFunctionApplication(FunctionApplication object)
      {
        return createFunctionApplicationAdapter();
      }
      @Override
      public Adapter caseBracketedExpression(BracketedExpression object)
      {
        return createBracketedExpressionAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter caseEnumeratedSet(EnumeratedSet object)
      {
        return createEnumeratedSetAdapter();
      }
      @Override
      public Adapter caseFuzzyExp(FuzzyExp object)
      {
        return createFuzzyExpAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.BehaviorNode <em>Behavior Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.BehaviorNode
   * @generated
   */
  public Adapter createBehaviorNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Behavior
   * @generated
   */
  public Adapter createBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.StateRealisation <em>State Realisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.StateRealisation
   * @generated
   */
  public Adapter createStateRealisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.AttributeRealisation <em>Attribute Realisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.AttributeRealisation
   * @generated
   */
  public Adapter createAttributeRealisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Selection
   * @generated
   */
  public Adapter createSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Guard
   * @generated
   */
  public Adapter createGuardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.InternalOutputEvent <em>Internal Output Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.InternalOutputEvent
   * @generated
   */
  public Adapter createInternalOutputEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.InternalInputEvent <em>Internal Input Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.InternalInputEvent
   * @generated
   */
  public Adapter createInternalInputEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.ExternalOutputEvent <em>External Output Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.ExternalOutputEvent
   * @generated
   */
  public Adapter createExternalOutputEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.ExternalInputEvent <em>External Input Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.ExternalInputEvent
   * @generated
   */
  public Adapter createExternalInputEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.ComponentInstantiationNode <em>Component Instantiation Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.ComponentInstantiationNode
   * @generated
   */
  public Adapter createComponentInstantiationNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.ForAll <em>For All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.ForAll
   * @generated
   */
  public Adapter createForAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.ForSome <em>For Some</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.ForSome
   * @generated
   */
  public Adapter createForSomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.AtLeastOne <em>At Least One</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.AtLeastOne
   * @generated
   */
  public Adapter createAtLeastOneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.ForOneArbitrary <em>For One Arbitrary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.ForOneArbitrary
   * @generated
   */
  public Adapter createForOneArbitraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.ComponentInstantiation <em>Component Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.ComponentInstantiation
   * @generated
   */
  public Adapter createComponentInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.BinaryRelation <em>Binary Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.BinaryRelation
   * @generated
   */
  public Adapter createBinaryRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.BinaryExpression
   * @generated
   */
  public Adapter createBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.FunctionApplication <em>Function Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.FunctionApplication
   * @generated
   */
  public Adapter createFunctionApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.BracketedExpression <em>Bracketed Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.BracketedExpression
   * @generated
   */
  public Adapter createBracketedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.Cardinality
   * @generated
   */
  public Adapter createCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.EnumeratedSet <em>Enumerated Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.EnumeratedSet
   * @generated
   */
  public Adapter createEnumeratedSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.expressions.FuzzyExp <em>Fuzzy Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.expressions.FuzzyExp
   * @generated
   */
  public Adapter createFuzzyExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ExpressionsAdapterFactory
