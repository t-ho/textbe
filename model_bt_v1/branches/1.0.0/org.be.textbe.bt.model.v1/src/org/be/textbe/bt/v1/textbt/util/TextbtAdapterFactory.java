/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.util;

import org.be.textbe.bt.v1.textbt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.v1.textbt.TextbtPackage
 * @generated
 */
public class TextbtAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextbtPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextbtAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TextbtPackage.eINSTANCE;
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
  protected TextbtSwitch<Adapter> modelSwitch =
    new TextbtSwitch<Adapter>()
    {
      @Override
      public Adapter caseSpecification(Specification object)
      {
        return createSpecificationAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseBehavior(Behavior object)
      {
        return createBehaviorAdapter();
      }
      @Override
      public Adapter caseStateRealization(StateRealization object)
      {
        return createStateRealizationAdapter();
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
      public Adapter caseInternalInput(InternalInput object)
      {
        return createInternalInputAdapter();
      }
      @Override
      public Adapter caseInternalOutput(InternalOutput object)
      {
        return createInternalOutputAdapter();
      }
      @Override
      public Adapter caseExternalInput(ExternalInput object)
      {
        return createExternalInputAdapter();
      }
      @Override
      public Adapter caseExternalOutput(ExternalOutput object)
      {
        return createExternalOutputAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseOutput(Output object)
      {
        return createOutputAdapter();
      }
      @Override
      public Adapter caseTraceabilityLink(TraceabilityLink object)
      {
        return createTraceabilityLinkAdapter();
      }
      @Override
      public Adapter caseBehaviorTree(BehaviorTree object)
      {
        return createBehaviorTreeAdapter();
      }
      @Override
      public Adapter caseSequence(Sequence object)
      {
        return createSequenceAdapter();
      }
      @Override
      public Adapter caseBranch(Branch object)
      {
        return createBranchAdapter();
      }
      @Override
      public Adapter caseParallel(Parallel object)
      {
        return createParallelAdapter();
      }
      @Override
      public Adapter caseAlternative(Alternative object)
      {
        return createAlternativeAdapter();
      }
      @Override
      public Adapter caseAtomic(Atomic object)
      {
        return createAtomicAdapter();
      }
      @Override
      public Adapter caseInterleaving(Interleaving object)
      {
        return createInterleavingAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseWho(Who object)
      {
        return createWhoAdapter();
      }
      @Override
      public Adapter caseWhat(What object)
      {
        return createWhatAdapter();
      }
      @Override
      public Adapter caseWhere(Where object)
      {
        return createWhereAdapter();
      }
      @Override
      public Adapter caseWhen(When object)
      {
        return createWhenAdapter();
      }
      @Override
      public Adapter caseWhy(Why object)
      {
        return createWhyAdapter();
      }
      @Override
      public Adapter caseFreeTextRelation(FreeTextRelation object)
      {
        return createFreeTextRelationAdapter();
      }
      @Override
      public Adapter caseHow(How object)
      {
        return createHowAdapter();
      }
      @Override
      public Adapter caseAttributeRealization(AttributeRealization object)
      {
        return createAttributeRealizationAdapter();
      }
      @Override
      public Adapter caseNamedBehavior(NamedBehavior object)
      {
        return createNamedBehaviorAdapter();
      }
      @Override
      public Adapter caseSystemComponent(SystemComponent object)
      {
        return createSystemComponentAdapter();
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
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Specification
   * @generated
   */
  public Adapter createSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Behavior
   * @generated
   */
  public Adapter createBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.StateRealization <em>State Realization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.StateRealization
   * @generated
   */
  public Adapter createStateRealizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Selection
   * @generated
   */
  public Adapter createSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Guard
   * @generated
   */
  public Adapter createGuardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.InternalInput <em>Internal Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.InternalInput
   * @generated
   */
  public Adapter createInternalInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.InternalOutput <em>Internal Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.InternalOutput
   * @generated
   */
  public Adapter createInternalOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.ExternalInput <em>External Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.ExternalInput
   * @generated
   */
  public Adapter createExternalInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.ExternalOutput <em>External Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.ExternalOutput
   * @generated
   */
  public Adapter createExternalOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Output
   * @generated
   */
  public Adapter createOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.TraceabilityLink <em>Traceability Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.TraceabilityLink
   * @generated
   */
  public Adapter createTraceabilityLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.BehaviorTree <em>Behavior Tree</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.BehaviorTree
   * @generated
   */
  public Adapter createBehaviorTreeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Sequence
   * @generated
   */
  public Adapter createSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Branch
   * @generated
   */
  public Adapter createBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Parallel <em>Parallel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Parallel
   * @generated
   */
  public Adapter createParallelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Alternative
   * @generated
   */
  public Adapter createAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Atomic
   * @generated
   */
  public Adapter createAtomicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Interleaving <em>Interleaving</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Interleaving
   * @generated
   */
  public Adapter createInterleavingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Who <em>Who</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Who
   * @generated
   */
  public Adapter createWhoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.What <em>What</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.What
   * @generated
   */
  public Adapter createWhatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Where <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Where
   * @generated
   */
  public Adapter createWhereAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.When
   * @generated
   */
  public Adapter createWhenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.Why <em>Why</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.Why
   * @generated
   */
  public Adapter createWhyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.FreeTextRelation <em>Free Text Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.FreeTextRelation
   * @generated
   */
  public Adapter createFreeTextRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.How <em>How</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.How
   * @generated
   */
  public Adapter createHowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.AttributeRealization <em>Attribute Realization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.AttributeRealization
   * @generated
   */
  public Adapter createAttributeRealizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.NamedBehavior <em>Named Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.NamedBehavior
   * @generated
   */
  public Adapter createNamedBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.be.textbe.bt.v1.textbt.SystemComponent <em>System Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.be.textbe.bt.v1.textbt.SystemComponent
   * @generated
   */
  public Adapter createSystemComponentAdapter()
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

} //TextbtAdapterFactory
