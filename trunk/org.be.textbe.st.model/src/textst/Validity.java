/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textst;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Validity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see textst.TextstPackage#getValidity()
 * @model
 * @generated
 */
public final class Validity extends AbstractEnumerator
{
  /**
   * The '<em><b>Valid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Valid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALID_LITERAL
   * @model name="Valid" literal=""
   * @generated
   * @ordered
   */
  public static final int VALID = 0;

  /**
   * The '<em><b>Implied</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Implied</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMPLIED_LITERAL
   * @model name="Implied" literal="+"
   * @generated
   * @ordered
   */
  public static final int IMPLIED = 1;

  /**
   * The '<em><b>Invalid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Invalid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVALID_LITERAL
   * @model name="Invalid" literal="-"
   * @generated
   * @ordered
   */
  public static final int INVALID = 2;

  /**
   * The '<em><b>Deleted</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deleted</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELETED_LITERAL
   * @model name="Deleted" literal="--"
   * @generated
   * @ordered
   */
  public static final int DELETED = 3;

  /**
   * The '<em><b>Refined</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Refined</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REFINED_LITERAL
   * @model name="Refined" literal="+-"
   * @generated
   * @ordered
   */
  public static final int REFINED = 4;

  /**
   * The '<em><b>Updated</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Updated</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UPDATED_LITERAL
   * @model name="Updated" literal="++"
   * @generated
   * @ordered
   */
  public static final int UPDATED = 5;

  /**
   * The '<em><b>Valid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALID
   * @generated
   * @ordered
   */
  public static final Validity VALID_LITERAL = new Validity(VALID, "Valid", "");

  /**
   * The '<em><b>Implied</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMPLIED
   * @generated
   * @ordered
   */
  public static final Validity IMPLIED_LITERAL = new Validity(IMPLIED, "Implied", "+");

  /**
   * The '<em><b>Invalid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVALID
   * @generated
   * @ordered
   */
  public static final Validity INVALID_LITERAL = new Validity(INVALID, "Invalid", "-");

  /**
   * The '<em><b>Deleted</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELETED
   * @generated
   * @ordered
   */
  public static final Validity DELETED_LITERAL = new Validity(DELETED, "Deleted", "--");

  /**
   * The '<em><b>Refined</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REFINED
   * @generated
   * @ordered
   */
  public static final Validity REFINED_LITERAL = new Validity(REFINED, "Refined", "+-");

  /**
   * The '<em><b>Updated</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UPDATED
   * @generated
   * @ordered
   */
  public static final Validity UPDATED_LITERAL = new Validity(UPDATED, "Updated", "++");

  /**
   * An array of all the '<em><b>Validity</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Validity[] VALUES_ARRAY =
    new Validity[]
    {
      VALID_LITERAL,
      IMPLIED_LITERAL,
      INVALID_LITERAL,
      DELETED_LITERAL,
      REFINED_LITERAL,
      UPDATED_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Validity</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Validity</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Validity get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Validity result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Validity</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Validity getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Validity result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Validity</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Validity get(int value)
  {
    switch (value)
    {
      case VALID: return VALID_LITERAL;
      case IMPLIED: return IMPLIED_LITERAL;
      case INVALID: return INVALID_LITERAL;
      case DELETED: return DELETED_LITERAL;
      case REFINED: return REFINED_LITERAL;
      case UPDATED: return UPDATED_LITERAL;
    }
    return null;
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Validity(int value, String name, String literal)
  {
    super(value, name, literal);
  }

} //Validity
