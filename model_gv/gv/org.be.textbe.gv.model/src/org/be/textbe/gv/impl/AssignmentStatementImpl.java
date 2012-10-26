/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv.impl;

import java.util.Collection;

import org.be.textbe.gv.AssignmentStatement;
import org.be.textbe.gv.Commentable;
import org.be.textbe.gv.GvPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.gv.impl.AssignmentStatementImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.AssignmentStatementImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.AssignmentStatementImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentStatementImpl extends StatementImpl implements AssignmentStatement
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
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
  protected static final String LEFT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
  protected String left = LEFT_EDEFAULT;

  /**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
  protected static final String RIGHT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
  protected String right = RIGHT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AssignmentStatementImpl()
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
		return GvPackage.Literals.ASSIGNMENT_STATEMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getComments()
  {
		if (comments == null) {
			comments = new EDataTypeUniqueEList<String>(String.class, this, GvPackage.ASSIGNMENT_STATEMENT__COMMENTS);
		}
		return comments;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLeft()
  {
		return left;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLeft(String newLeft)
  {
		String oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.ASSIGNMENT_STATEMENT__LEFT, oldLeft, left));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getRight()
  {
		return right;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRight(String newRight)
  {
		String oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.ASSIGNMENT_STATEMENT__RIGHT, oldRight, right));
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
			case GvPackage.ASSIGNMENT_STATEMENT__COMMENTS:
				return getComments();
			case GvPackage.ASSIGNMENT_STATEMENT__LEFT:
				return getLeft();
			case GvPackage.ASSIGNMENT_STATEMENT__RIGHT:
				return getRight();
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
			case GvPackage.ASSIGNMENT_STATEMENT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends String>)newValue);
				return;
			case GvPackage.ASSIGNMENT_STATEMENT__LEFT:
				setLeft((String)newValue);
				return;
			case GvPackage.ASSIGNMENT_STATEMENT__RIGHT:
				setRight((String)newValue);
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
			case GvPackage.ASSIGNMENT_STATEMENT__COMMENTS:
				getComments().clear();
				return;
			case GvPackage.ASSIGNMENT_STATEMENT__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case GvPackage.ASSIGNMENT_STATEMENT__RIGHT:
				setRight(RIGHT_EDEFAULT);
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
			case GvPackage.ASSIGNMENT_STATEMENT__COMMENTS:
				return comments != null && !comments.isEmpty();
			case GvPackage.ASSIGNMENT_STATEMENT__LEFT:
				return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
			case GvPackage.ASSIGNMENT_STATEMENT__RIGHT:
				return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				case GvPackage.ASSIGNMENT_STATEMENT__COMMENTS: return GvPackage.COMMENTABLE__COMMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				case GvPackage.COMMENTABLE__COMMENTS: return GvPackage.ASSIGNMENT_STATEMENT__COMMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", left: ");
		result.append(left);
		result.append(", right: ");
		result.append(right);
		result.append(')');
		return result.toString();
	}

} //AssignmentStatementImpl
