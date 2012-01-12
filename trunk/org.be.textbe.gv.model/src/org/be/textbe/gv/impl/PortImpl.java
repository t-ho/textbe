/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv.impl;

import java.util.Collection;

import org.be.textbe.gv.Commentable;
import org.be.textbe.gv.Compass;
import org.be.textbe.gv.GvPackage;
import org.be.textbe.gv.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.gv.impl.PortImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.PortImpl#getCompass <em>Compass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends IdentifiableImpl implements Port
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
	 * The default value of the '{@link #getCompass() <em>Compass</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCompass()
	 * @generated
	 * @ordered
	 */
  protected static final Compass COMPASS_EDEFAULT = Compass.NORTH;

  /**
	 * The cached value of the '{@link #getCompass() <em>Compass</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCompass()
	 * @generated
	 * @ordered
	 */
  protected Compass compass = COMPASS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PortImpl()
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
		return GvPackage.Literals.PORT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getComments()
  {
		if (comments == null) {
			comments = new EDataTypeUniqueEList<String>(String.class, this, GvPackage.PORT__COMMENTS);
		}
		return comments;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Compass getCompass()
  {
		return compass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCompass(Compass newCompass)
  {
		Compass oldCompass = compass;
		compass = newCompass == null ? COMPASS_EDEFAULT : newCompass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.PORT__COMPASS, oldCompass, compass));
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
			case GvPackage.PORT__COMMENTS:
				return getComments();
			case GvPackage.PORT__COMPASS:
				return getCompass();
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
			case GvPackage.PORT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends String>)newValue);
				return;
			case GvPackage.PORT__COMPASS:
				setCompass((Compass)newValue);
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
			case GvPackage.PORT__COMMENTS:
				getComments().clear();
				return;
			case GvPackage.PORT__COMPASS:
				setCompass(COMPASS_EDEFAULT);
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
			case GvPackage.PORT__COMMENTS:
				return comments != null && !comments.isEmpty();
			case GvPackage.PORT__COMPASS:
				return compass != COMPASS_EDEFAULT;
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
				case GvPackage.PORT__COMMENTS: return GvPackage.COMMENTABLE__COMMENTS;
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
				case GvPackage.COMMENTABLE__COMMENTS: return GvPackage.PORT__COMMENTS;
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
		result.append(", compass: ");
		result.append(compass);
		result.append(')');
		return result.toString();
	}

} //PortImpl
