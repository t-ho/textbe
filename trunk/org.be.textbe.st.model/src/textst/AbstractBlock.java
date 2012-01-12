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
 * A representation of the model object '<em><b>Abstract Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link textst.AbstractBlock#getChildNode <em>Child Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see textst.TextstPackage#getAbstractBlock()
 * @model abstract="true"
 * @generated
 */
public interface AbstractBlock extends AbstractBlockOrNode
{
  /**
   * Returns the value of the '<em><b>Child Node</b></em>' containment reference list.
   * The list contents are of type {@link textst.AbstractNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child Node</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child Node</em>' containment reference list.
   * @see textst.TextstPackage#getAbstractBlock_ChildNode()
   * @model type="textst.AbstractNode" containment="true" lower="2"
   * @generated
   */
  EList getChildNode();

} // AbstractBlock
