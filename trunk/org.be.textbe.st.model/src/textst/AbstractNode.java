/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textst.AbstractNode#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link textst.AbstractNode#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link textst.AbstractNode#getMci <em>Mci</em>}</li>
 *   <li>{@link textst.AbstractNode#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link textst.AbstractNode#getSecondQualifier <em>Second Qualifier</em>}</li>
 *   <li>{@link textst.AbstractNode#getBehaviorRef <em>Behavior Ref</em>}</li>
 *   <li>{@link textst.AbstractNode#getRequirementRef <em>Requirement Ref</em>}</li>
 *   <li>{@link textst.AbstractNode#getTraceabilityStatus <em>Traceability Status</em>}</li>
 *   <li>{@link textst.AbstractNode#getOperator <em>Operator</em>}</li>
 *   <li>{@link textst.AbstractNode#getChildNode <em>Child Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see textst.TextstPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends AbstractBlockOrNode
{
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
   * @see textst.TextstPackage#getAbstractNode_ComponentRef()
   * @model required="true"
   * @generated
   */
  String getComponentRef();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getComponentRef <em>Component Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Ref</em>' attribute.
   * @see #getComponentRef()
   * @generated
   */
  void setComponentRef(String value);

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
   * @see textst.TextstPackage#getAbstractNode_ComponentSet()
   * @model
   * @generated
   */
  String getComponentSet();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getComponentSet <em>Component Set</em>}' attribute.
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
   * @see textst.TextstPackage#getAbstractNode_Mci()
   * @model
   * @generated
   */
  String getMci();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getMci <em>Mci</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mci</em>' attribute.
   * @see #getMci()
   * @generated
   */
  void setMci(String value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
   * The literals are from the enumeration {@link textst.Qualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' attribute.
   * @see textst.Qualifier
   * @see #setQualifier(Qualifier)
   * @see textst.TextstPackage#getAbstractNode_Qualifier()
   * @model
   * @generated
   */
  Qualifier getQualifier();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see textst.Qualifier
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(Qualifier value);

  /**
   * Returns the value of the '<em><b>Second Qualifier</b></em>' attribute.
   * The literals are from the enumeration {@link textst.Qualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Qualifier</em>' attribute.
   * @see textst.Qualifier
   * @see #setSecondQualifier(Qualifier)
   * @see textst.TextstPackage#getAbstractNode_SecondQualifier()
   * @model
   * @generated
   */
  Qualifier getSecondQualifier();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getSecondQualifier <em>Second Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Qualifier</em>' attribute.
   * @see textst.Qualifier
   * @see #getSecondQualifier()
   * @generated
   */
  void setSecondQualifier(Qualifier value);

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
   * @see textst.TextstPackage#getAbstractNode_BehaviorRef()
   * @model
   * @generated
   */
  String getBehaviorRef();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getBehaviorRef <em>Behavior Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior Ref</em>' attribute.
   * @see #getBehaviorRef()
   * @generated
   */
  void setBehaviorRef(String value);

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
   * @see textst.TextstPackage#getAbstractNode_RequirementRef()
   * @model
   * @generated
   */
  EList getRequirementRef();

  /**
   * Returns the value of the '<em><b>Traceability Status</b></em>' attribute.
   * The literals are from the enumeration {@link textst.Validity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traceability Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traceability Status</em>' attribute.
   * @see textst.Validity
   * @see #setTraceabilityStatus(Validity)
   * @see textst.TextstPackage#getAbstractNode_TraceabilityStatus()
   * @model
   * @generated
   */
  Validity getTraceabilityStatus();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getTraceabilityStatus <em>Traceability Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Traceability Status</em>' attribute.
   * @see textst.Validity
   * @see #getTraceabilityStatus()
   * @generated
   */
  void setTraceabilityStatus(Validity value);

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
   * @see textst.TextstPackage#getAbstractNode_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Child Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child Node</em>' containment reference.
   * @see #setChildNode(AbstractBlockOrNode)
   * @see textst.TextstPackage#getAbstractNode_ChildNode()
   * @model containment="true"
   * @generated
   */
  AbstractBlockOrNode getChildNode();

  /**
   * Sets the value of the '{@link textst.AbstractNode#getChildNode <em>Child Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child Node</em>' containment reference.
   * @see #getChildNode()
   * @generated
   */
  void setChildNode(AbstractBlockOrNode value);

} // AbstractNode
