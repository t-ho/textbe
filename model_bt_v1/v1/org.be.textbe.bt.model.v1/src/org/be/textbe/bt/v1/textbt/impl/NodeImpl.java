/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt.impl;

import java.util.Collection;
import org.be.textbe.bt.v1.textbt.Behavior;
import org.be.textbe.bt.v1.textbt.Node;
import org.be.textbe.bt.v1.textbt.NodeType;
import org.be.textbe.bt.v1.textbt.TextbtPackage;
import org.be.textbe.bt.v1.textbt.TraceabilityLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NodeImpl#getTraceability <em>Traceability</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NodeImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NodeImpl#isShowTag <em>Show Tag</em>}</li>
 *   <li>{@link org.be.textbe.bt.v1.textbt.impl.NodeImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node
{
  /**
   * The cached value of the '{@link #getTraceability() <em>Traceability</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraceability()
   * @generated
   * @ordered
   */
  protected EList<TraceabilityLink> traceability;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected Behavior behavior;

  /**
   * The default value of the '{@link #isShowTag() <em>Show Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowTag()
   * @generated
   * @ordered
   */
  protected static final boolean SHOW_TAG_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isShowTag() <em>Show Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowTag()
   * @generated
   * @ordered
   */
  protected boolean showTag = SHOW_TAG_EDEFAULT;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final NodeType OPERATOR_EDEFAULT = NodeType.NORMAL;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected NodeType operator = OPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
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
    return TextbtPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TraceabilityLink> getTraceability()
  {
    if (traceability == null)
    {
      traceability = new EObjectContainmentWithInverseEList<TraceabilityLink>(TraceabilityLink.class, this, TextbtPackage.NODE__TRACEABILITY, TextbtPackage.TRACEABILITY_LINK__NODE);
    }
    return traceability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.NODE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior getBehavior()
  {
    if (behavior != null && behavior.eIsProxy())
    {
      InternalEObject oldBehavior = (InternalEObject)behavior;
      behavior = (Behavior)eResolveProxy(oldBehavior);
      if (behavior != oldBehavior)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextbtPackage.NODE__BEHAVIOR, oldBehavior, behavior));
      }
    }
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior basicGetBehavior()
  {
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehavior(Behavior newBehavior)
  {
    Behavior oldBehavior = behavior;
    behavior = newBehavior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.NODE__BEHAVIOR, oldBehavior, behavior));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShowTag()
  {
    return showTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShowTag(boolean newShowTag)
  {
    boolean oldShowTag = showTag;
    showTag = newShowTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.NODE__SHOW_TAG, oldShowTag, showTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(NodeType newOperator)
  {
    NodeType oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextbtPackage.NODE__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextbtPackage.NODE__TRACEABILITY:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraceability()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case TextbtPackage.NODE__TRACEABILITY:
        return ((InternalEList<?>)getTraceability()).basicRemove(otherEnd, msgs);
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
      case TextbtPackage.NODE__TRACEABILITY:
        return getTraceability();
      case TextbtPackage.NODE__LABEL:
        return getLabel();
      case TextbtPackage.NODE__BEHAVIOR:
        if (resolve) return getBehavior();
        return basicGetBehavior();
      case TextbtPackage.NODE__SHOW_TAG:
        return isShowTag();
      case TextbtPackage.NODE__OPERATOR:
        return getOperator();
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
      case TextbtPackage.NODE__TRACEABILITY:
        getTraceability().clear();
        getTraceability().addAll((Collection<? extends TraceabilityLink>)newValue);
        return;
      case TextbtPackage.NODE__LABEL:
        setLabel((String)newValue);
        return;
      case TextbtPackage.NODE__BEHAVIOR:
        setBehavior((Behavior)newValue);
        return;
      case TextbtPackage.NODE__SHOW_TAG:
        setShowTag((Boolean)newValue);
        return;
      case TextbtPackage.NODE__OPERATOR:
        setOperator((NodeType)newValue);
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
      case TextbtPackage.NODE__TRACEABILITY:
        getTraceability().clear();
        return;
      case TextbtPackage.NODE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TextbtPackage.NODE__BEHAVIOR:
        setBehavior((Behavior)null);
        return;
      case TextbtPackage.NODE__SHOW_TAG:
        setShowTag(SHOW_TAG_EDEFAULT);
        return;
      case TextbtPackage.NODE__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
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
      case TextbtPackage.NODE__TRACEABILITY:
        return traceability != null && !traceability.isEmpty();
      case TextbtPackage.NODE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TextbtPackage.NODE__BEHAVIOR:
        return behavior != null;
      case TextbtPackage.NODE__SHOW_TAG:
        return showTag != SHOW_TAG_EDEFAULT;
      case TextbtPackage.NODE__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (label: ");
    result.append(label);
    result.append(", showTag: ");
    result.append(showTag);
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
