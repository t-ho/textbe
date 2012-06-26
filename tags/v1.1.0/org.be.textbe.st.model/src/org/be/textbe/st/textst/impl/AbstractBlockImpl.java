/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst.impl;

import java.util.Collection;

import org.be.textbe.st.textst.AbstractBlock;
import org.be.textbe.st.textst.AbstractNode;
import org.be.textbe.st.textst.TextstPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.st.textst.impl.AbstractBlockImpl#getChildNode <em>Child Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractBlockImpl extends AbstractBlockOrNodeImpl implements AbstractBlock
{
  /**
   * The cached value of the '{@link #getChildNode() <em>Child Node</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildNode()
   * @generated
   * @ordered
   */
  protected EList<AbstractNode> childNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractBlockImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextstPackage.Literals.ABSTRACT_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractNode> getChildNode()
  {
    if (childNode == null)
    {
      childNode = new EObjectContainmentEList<AbstractNode>(AbstractNode.class, this, TextstPackage.ABSTRACT_BLOCK__CHILD_NODE);
    }
    return childNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextstPackage.ABSTRACT_BLOCK__CHILD_NODE:
        return ((InternalEList<?>)getChildNode()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextstPackage.ABSTRACT_BLOCK__CHILD_NODE:
        return getChildNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextstPackage.ABSTRACT_BLOCK__CHILD_NODE:
        getChildNode().clear();
        getChildNode().addAll((Collection<? extends AbstractNode>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextstPackage.ABSTRACT_BLOCK__CHILD_NODE:
        getChildNode().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextstPackage.ABSTRACT_BLOCK__CHILD_NODE:
        return childNode != null && !childNode.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AbstractBlockImpl
