/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv.impl;

import java.util.Collection;

import org.be.textbe.gv.GvPackage;
import org.be.textbe.gv.Statement;
import org.be.textbe.gv.StatementList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.gv.impl.StatementListImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.StatementListImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.StatementListImpl#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementListImpl extends EObjectImpl implements StatementList
{
  /**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
  protected EList<String> comments;

  /**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
  protected Statement statement;

  /**
	 * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTail()
	 * @generated
	 * @ordered
	 */
  protected StatementList tail;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StatementListImpl()
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
		return GvPackage.Literals.STATEMENT_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getComments()
  {
		if (comments == null) {
			comments = new EDataTypeUniqueEList<String>(String.class, this, GvPackage.STATEMENT_LIST__COMMENTS);
		}
		return comments;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Statement getStatement()
  {
		return statement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GvPackage.STATEMENT_LIST__STATEMENT, oldStatement, newStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStatement(Statement newStatement)
  {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GvPackage.STATEMENT_LIST__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GvPackage.STATEMENT_LIST__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.STATEMENT_LIST__STATEMENT, newStatement, newStatement));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StatementList getTail()
  {
		return tail;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTail(StatementList newTail, NotificationChain msgs)
  {
		StatementList oldTail = tail;
		tail = newTail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GvPackage.STATEMENT_LIST__TAIL, oldTail, newTail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTail(StatementList newTail)
  {
		if (newTail != tail) {
			NotificationChain msgs = null;
			if (tail != null)
				msgs = ((InternalEObject)tail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GvPackage.STATEMENT_LIST__TAIL, null, msgs);
			if (newTail != null)
				msgs = ((InternalEObject)newTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GvPackage.STATEMENT_LIST__TAIL, null, msgs);
			msgs = basicSetTail(newTail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.STATEMENT_LIST__TAIL, newTail, newTail));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case GvPackage.STATEMENT_LIST__STATEMENT:
				return basicSetStatement(null, msgs);
			case GvPackage.STATEMENT_LIST__TAIL:
				return basicSetTail(null, msgs);
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
		switch (featureID) {
			case GvPackage.STATEMENT_LIST__COMMENTS:
				return getComments();
			case GvPackage.STATEMENT_LIST__STATEMENT:
				return getStatement();
			case GvPackage.STATEMENT_LIST__TAIL:
				return getTail();
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
		switch (featureID) {
			case GvPackage.STATEMENT_LIST__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends String>)newValue);
				return;
			case GvPackage.STATEMENT_LIST__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case GvPackage.STATEMENT_LIST__TAIL:
				setTail((StatementList)newValue);
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
		switch (featureID) {
			case GvPackage.STATEMENT_LIST__COMMENTS:
				getComments().clear();
				return;
			case GvPackage.STATEMENT_LIST__STATEMENT:
				setStatement((Statement)null);
				return;
			case GvPackage.STATEMENT_LIST__TAIL:
				setTail((StatementList)null);
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
		switch (featureID) {
			case GvPackage.STATEMENT_LIST__COMMENTS:
				return comments != null && !comments.isEmpty();
			case GvPackage.STATEMENT_LIST__STATEMENT:
				return statement != null;
			case GvPackage.STATEMENT_LIST__TAIL:
				return tail != null;
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
		result.append(" (comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //StatementListImpl
