/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textst.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import textst.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see textst.TextstPackage
 * @generated
 */
public class TextstAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextstPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextstAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TextstPackage.eINSTANCE;
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
  protected TextstSwitch modelSwitch =
    new TextstSwitch()
    {
      public Object caseTextST(TextST object)
      {
        return createTextSTAdapter();
      }
      public Object caseRequirementList(RequirementList object)
      {
        return createRequirementListAdapter();
      }
      public Object caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      public Object caseComponentList(ComponentList object)
      {
        return createComponentListAdapter();
      }
      public Object caseOptionList(OptionList object)
      {
        return createOptionListAdapter();
      }
      public Object caseOption(Option object)
      {
        return createOptionAdapter();
      }
      public Object caseStructureTree(StructureTree object)
      {
        return createStructureTreeAdapter();
      }
      public Object caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      public Object caseSystemComponent(SystemComponent object)
      {
        return createSystemComponentAdapter();
      }
      public Object caseAbstractBehavior(AbstractBehavior object)
      {
        return createAbstractBehaviorAdapter();
      }
      public Object caseSecondaryRelation(SecondaryRelation object)
      {
        return createSecondaryRelationAdapter();
      }
      public Object caseAbstractBlockOrNode(AbstractBlockOrNode object)
      {
        return createAbstractBlockOrNodeAdapter();
      }
      public Object caseAbstractBlock(AbstractBlock object)
      {
        return createAbstractBlockAdapter();
      }
      public Object caseAbstractNode(AbstractNode object)
      {
        return createAbstractNodeAdapter();
      }
      public Object caseNode(Node object)
      {
        return createNodeAdapter();
      }
      public Object caseRelatedToNode(RelatedToNode object)
      {
        return createRelatedToNodeAdapter();
      }
      public Object caseDefinedByNode(DefinedByNode object)
      {
        return createDefinedByNodeAdapter();
      }
      public Object caseParallelBlock(ParallelBlock object)
      {
        return createParallelBlockAdapter();
      }
      public Object caseAlternativeBlock(AlternativeBlock object)
      {
        return createAlternativeBlockAdapter();
      }
      public Object defaultCase(EObject object)
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
  public Adapter createAdapter(Notifier target)
  {
    return (Adapter)modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link textst.TextST <em>Text ST</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.TextST
   * @generated
   */
  public Adapter createTextSTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.RequirementList <em>Requirement List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.RequirementList
   * @generated
   */
  public Adapter createRequirementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.ComponentList <em>Component List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.ComponentList
   * @generated
   */
  public Adapter createComponentListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.OptionList <em>Option List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.OptionList
   * @generated
   */
  public Adapter createOptionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.StructureTree <em>Structure Tree</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.StructureTree
   * @generated
   */
  public Adapter createStructureTreeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.SystemComponent <em>System Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.SystemComponent
   * @generated
   */
  public Adapter createSystemComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.AbstractBehavior <em>Abstract Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.AbstractBehavior
   * @generated
   */
  public Adapter createAbstractBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.SecondaryRelation <em>Secondary Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.SecondaryRelation
   * @generated
   */
  public Adapter createSecondaryRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.AbstractBlockOrNode <em>Abstract Block Or Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.AbstractBlockOrNode
   * @generated
   */
  public Adapter createAbstractBlockOrNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.AbstractBlock <em>Abstract Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.AbstractBlock
   * @generated
   */
  public Adapter createAbstractBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.AbstractNode <em>Abstract Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.AbstractNode
   * @generated
   */
  public Adapter createAbstractNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.RelatedToNode <em>Related To Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.RelatedToNode
   * @generated
   */
  public Adapter createRelatedToNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.DefinedByNode <em>Defined By Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.DefinedByNode
   * @generated
   */
  public Adapter createDefinedByNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.ParallelBlock <em>Parallel Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.ParallelBlock
   * @generated
   */
  public Adapter createParallelBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textst.AlternativeBlock <em>Alternative Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textst.AlternativeBlock
   * @generated
   */
  public Adapter createAlternativeBlockAdapter()
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

} //TextstAdapterFactory
