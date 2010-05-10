/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv.impl;

import java.util.Collection;

import org.be.textbe.gv.Attributable;
import org.be.textbe.gv.Attribute;
import org.be.textbe.gv.AttributeList;
import org.be.textbe.gv.Commentable;
import org.be.textbe.gv.GvPackage;
import org.be.textbe.gv.NodeID;
import org.be.textbe.gv.NodeStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.gv.impl.NodeStatementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.NodeStatementImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.NodeStatementImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.NodeStatementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.be.textbe.gv.impl.NodeStatementImpl#getNode_id <em>Node id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeStatementImpl extends StatementImpl implements NodeStatement {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributeList attributes;

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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode_id() <em>Node id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_id()
	 * @generated
	 * @ordered
	 */
	protected NodeID node_id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GvPackage.Literals.NODE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeList getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributeList newAttributes, NotificationChain msgs) {
		AttributeList oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GvPackage.NODE_STATEMENT__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributeList newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GvPackage.NODE_STATEMENT__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GvPackage.NODE_STATEMENT__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.NODE_STATEMENT__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComments() {
		if (comments == null) {
			comments = new EDataTypeUniqueEList<String>(String.class, this, GvPackage.NODE_STATEMENT__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.NODE_STATEMENT__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.NODE_STATEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeID getNode_id() {
		return node_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode_id(NodeID newNode_id, NotificationChain msgs) {
		NodeID oldNode_id = node_id;
		node_id = newNode_id;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GvPackage.NODE_STATEMENT__NODE_ID, oldNode_id, newNode_id);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode_id(NodeID newNode_id) {
		if (newNode_id != node_id) {
			NotificationChain msgs = null;
			if (node_id != null)
				msgs = ((InternalEObject)node_id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GvPackage.NODE_STATEMENT__NODE_ID, null, msgs);
			if (newNode_id != null)
				msgs = ((InternalEObject)newNode_id).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GvPackage.NODE_STATEMENT__NODE_ID, null, msgs);
			msgs = basicSetNode_id(newNode_id, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GvPackage.NODE_STATEMENT__NODE_ID, newNode_id, newNode_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GvPackage.NODE_STATEMENT__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case GvPackage.NODE_STATEMENT__NODE_ID:
				return basicSetNode_id(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GvPackage.NODE_STATEMENT__ATTRIBUTES:
				return getAttributes();
			case GvPackage.NODE_STATEMENT__COMMENTS:
				return getComments();
			case GvPackage.NODE_STATEMENT__KEY:
				return getKey();
			case GvPackage.NODE_STATEMENT__VALUE:
				return getValue();
			case GvPackage.NODE_STATEMENT__NODE_ID:
				return getNode_id();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GvPackage.NODE_STATEMENT__ATTRIBUTES:
				setAttributes((AttributeList)newValue);
				return;
			case GvPackage.NODE_STATEMENT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends String>)newValue);
				return;
			case GvPackage.NODE_STATEMENT__KEY:
				setKey((String)newValue);
				return;
			case GvPackage.NODE_STATEMENT__VALUE:
				setValue((String)newValue);
				return;
			case GvPackage.NODE_STATEMENT__NODE_ID:
				setNode_id((NodeID)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GvPackage.NODE_STATEMENT__ATTRIBUTES:
				setAttributes((AttributeList)null);
				return;
			case GvPackage.NODE_STATEMENT__COMMENTS:
				getComments().clear();
				return;
			case GvPackage.NODE_STATEMENT__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GvPackage.NODE_STATEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GvPackage.NODE_STATEMENT__NODE_ID:
				setNode_id((NodeID)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GvPackage.NODE_STATEMENT__ATTRIBUTES:
				return attributes != null;
			case GvPackage.NODE_STATEMENT__COMMENTS:
				return comments != null && !comments.isEmpty();
			case GvPackage.NODE_STATEMENT__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GvPackage.NODE_STATEMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GvPackage.NODE_STATEMENT__NODE_ID:
				return node_id != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Attributable.class) {
			switch (derivedFeatureID) {
				case GvPackage.NODE_STATEMENT__ATTRIBUTES: return GvPackage.ATTRIBUTABLE__ATTRIBUTES;
				default: return -1;
			}
		}
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				case GvPackage.NODE_STATEMENT__COMMENTS: return GvPackage.COMMENTABLE__COMMENTS;
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (derivedFeatureID) {
				case GvPackage.NODE_STATEMENT__KEY: return GvPackage.ATTRIBUTE__KEY;
				case GvPackage.NODE_STATEMENT__VALUE: return GvPackage.ATTRIBUTE__VALUE;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Attributable.class) {
			switch (baseFeatureID) {
				case GvPackage.ATTRIBUTABLE__ATTRIBUTES: return GvPackage.NODE_STATEMENT__ATTRIBUTES;
				default: return -1;
			}
		}
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				case GvPackage.COMMENTABLE__COMMENTS: return GvPackage.NODE_STATEMENT__COMMENTS;
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (baseFeatureID) {
				case GvPackage.ATTRIBUTE__KEY: return GvPackage.NODE_STATEMENT__KEY;
				case GvPackage.ATTRIBUTE__VALUE: return GvPackage.NODE_STATEMENT__VALUE;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comments: ");
		result.append(comments);
		result.append(", key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //NodeStatementImpl
