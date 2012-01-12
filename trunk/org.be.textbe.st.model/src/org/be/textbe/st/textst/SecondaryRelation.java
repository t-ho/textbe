/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secondary Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getBehaviorRef <em>Behavior Ref</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getPrimaryLowerBound <em>Primary Lower Bound</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getPrimaryUpperBound <em>Primary Upper Bound</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getSecondaryLowerBound <em>Secondary Lower Bound</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getSecondaryUpperBound <em>Secondary Upper Bound</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getComponentAttribute <em>Component Attribute</em>}</li>
 *   <li>{@link org.be.textbe.st.textst.SecondaryRelation#getRelationName <em>Relation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation()
 * @model
 * @generated
 */
public interface SecondaryRelation extends AbstractBehavior
{
  /**
	 * Returns the value of the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Ref</em>' attribute.
	 * @see #setBehaviorRef(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_BehaviorRef()
	 * @model required="true"
	 * @generated
	 */
  String getBehaviorRef();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getBehaviorRef <em>Behavior Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Ref</em>' attribute.
	 * @see #getBehaviorRef()
	 * @generated
	 */
  void setBehaviorRef(String value);

  /**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_Attribute()
	 * @model
	 * @generated
	 */
  String getAttribute();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
  void setAttribute(String value);

  /**
	 * Returns the value of the '<em><b>Primary Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Lower Bound</em>' attribute.
	 * @see #setPrimaryLowerBound(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_PrimaryLowerBound()
	 * @model
	 * @generated
	 */
  String getPrimaryLowerBound();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getPrimaryLowerBound <em>Primary Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Lower Bound</em>' attribute.
	 * @see #getPrimaryLowerBound()
	 * @generated
	 */
  void setPrimaryLowerBound(String value);

  /**
	 * Returns the value of the '<em><b>Primary Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Upper Bound</em>' attribute.
	 * @see #setPrimaryUpperBound(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_PrimaryUpperBound()
	 * @model
	 * @generated
	 */
  String getPrimaryUpperBound();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getPrimaryUpperBound <em>Primary Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Upper Bound</em>' attribute.
	 * @see #getPrimaryUpperBound()
	 * @generated
	 */
  void setPrimaryUpperBound(String value);

  /**
	 * Returns the value of the '<em><b>Secondary Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secondary Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Lower Bound</em>' attribute.
	 * @see #setSecondaryLowerBound(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_SecondaryLowerBound()
	 * @model
	 * @generated
	 */
  String getSecondaryLowerBound();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getSecondaryLowerBound <em>Secondary Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Lower Bound</em>' attribute.
	 * @see #getSecondaryLowerBound()
	 * @generated
	 */
  void setSecondaryLowerBound(String value);

  /**
	 * Returns the value of the '<em><b>Secondary Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secondary Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Upper Bound</em>' attribute.
	 * @see #setSecondaryUpperBound(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_SecondaryUpperBound()
	 * @model
	 * @generated
	 */
  String getSecondaryUpperBound();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getSecondaryUpperBound <em>Secondary Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Upper Bound</em>' attribute.
	 * @see #getSecondaryUpperBound()
	 * @generated
	 */
  void setSecondaryUpperBound(String value);

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
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_ComponentRef()
	 * @model required="true"
	 * @generated
	 */
  String getComponentRef();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getComponentRef <em>Component Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Ref</em>' attribute.
	 * @see #getComponentRef()
	 * @generated
	 */
  void setComponentRef(String value);

  /**
	 * Returns the value of the '<em><b>Component Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Attribute</em>' attribute.
	 * @see #setComponentAttribute(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_ComponentAttribute()
	 * @model
	 * @generated
	 */
  String getComponentAttribute();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getComponentAttribute <em>Component Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Attribute</em>' attribute.
	 * @see #getComponentAttribute()
	 * @generated
	 */
  void setComponentAttribute(String value);

  /**
	 * Returns the value of the '<em><b>Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Name</em>' attribute.
	 * @see #setRelationName(String)
	 * @see org.be.textbe.st.textst.TextstPackage#getSecondaryRelation_RelationName()
	 * @model
	 * @generated
	 */
  String getRelationName();

  /**
	 * Sets the value of the '{@link org.be.textbe.st.textst.SecondaryRelation#getRelationName <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Name</em>' attribute.
	 * @see #getRelationName()
	 * @generated
	 */
  void setRelationName(String value);

} // SecondaryRelation
