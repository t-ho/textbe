/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace.impl;

import org.be.textbe.bttrace.Activate;
import org.be.textbe.bttrace.BT;
import org.be.textbe.bttrace.BttracePackage;
import org.be.textbe.bttrace.Delay;
import org.be.textbe.bttrace.Interleave;
import org.be.textbe.bttrace.TextBTTrace;
import org.be.textbe.bttrace.Trace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text BT Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.textbe.bttrace.impl.TextBTTraceImpl#getBt <em>Bt</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.impl.TextBTTraceImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.impl.TextBTTraceImpl#getActivate <em>Activate</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.impl.TextBTTraceImpl#getInterleave <em>Interleave</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.impl.TextBTTraceImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextBTTraceImpl extends EObjectImpl implements TextBTTrace {
	/**
	 * The cached value of the '{@link #getBt() <em>Bt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBt()
	 * @generated
	 * @ordered
	 */
	protected BT bt;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected Delay delay;

	/**
	 * The cached value of the '{@link #getActivate() <em>Activate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivate()
	 * @generated
	 * @ordered
	 */
	protected Activate activate;

	/**
	 * The cached value of the '{@link #getInterleave() <em>Interleave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterleave()
	 * @generated
	 * @ordered
	 */
	protected Interleave interleave;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected Trace trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBTTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BttracePackage.Literals.TEXT_BT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BT getBt() {
		return bt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBt(BT newBt, NotificationChain msgs) {
		BT oldBt = bt;
		bt = newBt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__BT, oldBt, newBt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBt(BT newBt) {
		if (newBt != bt) {
			NotificationChain msgs = null;
			if (bt != null)
				msgs = ((InternalEObject)bt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__BT, null, msgs);
			if (newBt != null)
				msgs = ((InternalEObject)newBt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__BT, null, msgs);
			msgs = basicSetBt(newBt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__BT, newBt, newBt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(Delay newDelay, NotificationChain msgs) {
		Delay oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__DELAY, oldDelay, newDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(Delay newDelay) {
		if (newDelay != delay) {
			NotificationChain msgs = null;
			if (delay != null)
				msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__DELAY, null, msgs);
			if (newDelay != null)
				msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__DELAY, null, msgs);
			msgs = basicSetDelay(newDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__DELAY, newDelay, newDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activate getActivate() {
		return activate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivate(Activate newActivate, NotificationChain msgs) {
		Activate oldActivate = activate;
		activate = newActivate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__ACTIVATE, oldActivate, newActivate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivate(Activate newActivate) {
		if (newActivate != activate) {
			NotificationChain msgs = null;
			if (activate != null)
				msgs = ((InternalEObject)activate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__ACTIVATE, null, msgs);
			if (newActivate != null)
				msgs = ((InternalEObject)newActivate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__ACTIVATE, null, msgs);
			msgs = basicSetActivate(newActivate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__ACTIVATE, newActivate, newActivate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interleave getInterleave() {
		return interleave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterleave(Interleave newInterleave, NotificationChain msgs) {
		Interleave oldInterleave = interleave;
		interleave = newInterleave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__INTERLEAVE, oldInterleave, newInterleave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterleave(Interleave newInterleave) {
		if (newInterleave != interleave) {
			NotificationChain msgs = null;
			if (interleave != null)
				msgs = ((InternalEObject)interleave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__INTERLEAVE, null, msgs);
			if (newInterleave != null)
				msgs = ((InternalEObject)newInterleave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__INTERLEAVE, null, msgs);
			msgs = basicSetInterleave(newInterleave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__INTERLEAVE, newInterleave, newInterleave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace getTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(Trace newTrace, NotificationChain msgs) {
		Trace oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(Trace newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__TRACE, null, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BttracePackage.TEXT_BT_TRACE__TRACE, null, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BttracePackage.TEXT_BT_TRACE__TRACE, newTrace, newTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BttracePackage.TEXT_BT_TRACE__BT:
				return basicSetBt(null, msgs);
			case BttracePackage.TEXT_BT_TRACE__DELAY:
				return basicSetDelay(null, msgs);
			case BttracePackage.TEXT_BT_TRACE__ACTIVATE:
				return basicSetActivate(null, msgs);
			case BttracePackage.TEXT_BT_TRACE__INTERLEAVE:
				return basicSetInterleave(null, msgs);
			case BttracePackage.TEXT_BT_TRACE__TRACE:
				return basicSetTrace(null, msgs);
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
			case BttracePackage.TEXT_BT_TRACE__BT:
				return getBt();
			case BttracePackage.TEXT_BT_TRACE__DELAY:
				return getDelay();
			case BttracePackage.TEXT_BT_TRACE__ACTIVATE:
				return getActivate();
			case BttracePackage.TEXT_BT_TRACE__INTERLEAVE:
				return getInterleave();
			case BttracePackage.TEXT_BT_TRACE__TRACE:
				return getTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BttracePackage.TEXT_BT_TRACE__BT:
				setBt((BT)newValue);
				return;
			case BttracePackage.TEXT_BT_TRACE__DELAY:
				setDelay((Delay)newValue);
				return;
			case BttracePackage.TEXT_BT_TRACE__ACTIVATE:
				setActivate((Activate)newValue);
				return;
			case BttracePackage.TEXT_BT_TRACE__INTERLEAVE:
				setInterleave((Interleave)newValue);
				return;
			case BttracePackage.TEXT_BT_TRACE__TRACE:
				setTrace((Trace)newValue);
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
			case BttracePackage.TEXT_BT_TRACE__BT:
				setBt((BT)null);
				return;
			case BttracePackage.TEXT_BT_TRACE__DELAY:
				setDelay((Delay)null);
				return;
			case BttracePackage.TEXT_BT_TRACE__ACTIVATE:
				setActivate((Activate)null);
				return;
			case BttracePackage.TEXT_BT_TRACE__INTERLEAVE:
				setInterleave((Interleave)null);
				return;
			case BttracePackage.TEXT_BT_TRACE__TRACE:
				setTrace((Trace)null);
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
			case BttracePackage.TEXT_BT_TRACE__BT:
				return bt != null;
			case BttracePackage.TEXT_BT_TRACE__DELAY:
				return delay != null;
			case BttracePackage.TEXT_BT_TRACE__ACTIVATE:
				return activate != null;
			case BttracePackage.TEXT_BT_TRACE__INTERLEAVE:
				return interleave != null;
			case BttracePackage.TEXT_BT_TRACE__TRACE:
				return trace != null;
		}
		return super.eIsSet(featureID);
	}

} //TextBTTraceImpl
