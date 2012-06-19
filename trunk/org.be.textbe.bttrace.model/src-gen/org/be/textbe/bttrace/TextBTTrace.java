/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bttrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text BT Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bttrace.TextBTTrace#getBt <em>Bt</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.TextBTTrace#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.TextBTTrace#getActivate <em>Activate</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.TextBTTrace#getInterleave <em>Interleave</em>}</li>
 *   <li>{@link org.be.textbe.bttrace.TextBTTrace#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bttrace.BttracePackage#getTextBTTrace()
 * @model
 * @generated
 */
public interface TextBTTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Bt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bt</em>' containment reference.
	 * @see #setBt(BT)
	 * @see org.be.textbe.bttrace.BttracePackage#getTextBTTrace_Bt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BT getBt();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.TextBTTrace#getBt <em>Bt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bt</em>' containment reference.
	 * @see #getBt()
	 * @generated
	 */
	void setBt(BT value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(Delay)
	 * @see org.be.textbe.bttrace.BttracePackage#getTextBTTrace_Delay()
	 * @model containment="true"
	 * @generated
	 */
	Delay getDelay();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.TextBTTrace#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Delay value);

	/**
	 * Returns the value of the '<em><b>Activate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate</em>' containment reference.
	 * @see #setActivate(Activate)
	 * @see org.be.textbe.bttrace.BttracePackage#getTextBTTrace_Activate()
	 * @model containment="true"
	 * @generated
	 */
	Activate getActivate();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.TextBTTrace#getActivate <em>Activate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activate</em>' containment reference.
	 * @see #getActivate()
	 * @generated
	 */
	void setActivate(Activate value);

	/**
	 * Returns the value of the '<em><b>Interleave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interleave</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interleave</em>' containment reference.
	 * @see #setInterleave(Interleave)
	 * @see org.be.textbe.bttrace.BttracePackage#getTextBTTrace_Interleave()
	 * @model containment="true"
	 * @generated
	 */
	Interleave getInterleave();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.TextBTTrace#getInterleave <em>Interleave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interleave</em>' containment reference.
	 * @see #getInterleave()
	 * @generated
	 */
	void setInterleave(Interleave value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(Trace)
	 * @see org.be.textbe.bttrace.BttracePackage#getTextBTTrace_Trace()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link org.be.textbe.bttrace.TextBTTrace#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

} // TextBTTrace
