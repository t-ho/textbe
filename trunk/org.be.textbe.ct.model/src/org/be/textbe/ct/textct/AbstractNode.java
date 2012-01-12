/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.ct.textct;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getRequirementRef <em>Requirement Ref</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getTraceabilityStatus <em>Traceability Status</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getLabel <em>Label</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getMci <em>Mci</em>}</li>
 *   <li>{@link org.be.textbe.ct.textct.AbstractNode#getChildNode <em>Child Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends AbstractBlockOrNode {
	/**
	 * Returns the value of the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Ref</em>' attribute.
	 * @see #setComponentRef(String)
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_ComponentRef()
	 * @model
	 * @generated
	 */
	String getComponentRef();

	/**
	 * Sets the value of the '{@link org.be.textbe.ct.textct.AbstractNode#getComponentRef <em>Component Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Ref</em>' attribute.
	 * @see #getComponentRef()
	 * @generated
	 */
	void setComponentRef(String value);

	/**
	 * Returns the value of the '<em><b>Requirement Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Ref</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Ref</em>' attribute list.
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_RequirementRef()
	 * @model
	 * @generated
	 */
	EList<String> getRequirementRef();

	/**
	 * Returns the value of the '<em><b>Traceability Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.be.textbe.ct.textct.Validity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traceability Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceability Status</em>' attribute.
	 * @see org.be.textbe.ct.textct.Validity
	 * @see #setTraceabilityStatus(Validity)
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_TraceabilityStatus()
	 * @model
	 * @generated
	 */
	Validity getTraceabilityStatus();

	/**
	 * Sets the value of the '{@link org.be.textbe.ct.textct.AbstractNode#getTraceabilityStatus <em>Traceability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceability Status</em>' attribute.
	 * @see org.be.textbe.ct.textct.Validity
	 * @see #getTraceabilityStatus()
	 * @generated
	 */
	void setTraceabilityStatus(Validity value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.be.textbe.ct.textct.AbstractNode#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link org.be.textbe.ct.textct.AbstractNode#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Component Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Set</em>' attribute.
	 * @see #setComponentSet(String)
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_ComponentSet()
	 * @model
	 * @generated
	 */
	String getComponentSet();

	/**
	 * Sets the value of the '{@link org.be.textbe.ct.textct.AbstractNode#getComponentSet <em>Component Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Set</em>' attribute.
	 * @see #getComponentSet()
	 * @generated
	 */
	void setComponentSet(String value);

	/**
	 * Returns the value of the '<em><b>Mci</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mci</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mci</em>' attribute.
	 * @see #setMci(String)
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_Mci()
	 * @model
	 * @generated
	 */
	String getMci();

	/**
	 * Sets the value of the '{@link org.be.textbe.ct.textct.AbstractNode#getMci <em>Mci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mci</em>' attribute.
	 * @see #getMci()
	 * @generated
	 */
	void setMci(String value);

	/**
	 * Returns the value of the '<em><b>Child Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.ct.textct.AbstractBlockOrNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Node</em>' containment reference list.
	 * @see org.be.textbe.ct.textct.TextctPackage#getAbstractNode_ChildNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractBlockOrNode> getChildNode();

} // AbstractNode
