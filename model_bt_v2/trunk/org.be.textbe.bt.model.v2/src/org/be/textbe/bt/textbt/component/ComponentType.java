/**
 */
package org.be.textbe.bt.textbt.component;

import org.be.textbe.bt.textbt.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An identifier for components that by manufacture have the same properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.bt.textbt.component.ComponentType#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.be.textbe.bt.textbt.component.ComponentType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.bt.textbt.component.ComponentPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.be.textbe.bt.textbt.component.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior exhibited by all components that have this type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see org.be.textbe.bt.textbt.component.ComponentPackage#getComponentType_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehavior();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the unique identifier of this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.be.textbe.bt.textbt.component.ComponentPackage#getComponentType_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.be.textbe.bt.textbt.component.ComponentType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ComponentType
