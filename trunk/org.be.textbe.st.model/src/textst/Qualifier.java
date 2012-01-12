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
 * A representation of the literals of the enumeration '<em><b>Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see textst.TextstPackage#getQualifier()
 * @model
 * @generated
 */
public final class Qualifier extends AbstractEnumerator
{
  /**
   * The '<em><b>Null</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Null</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NULL_LITERAL
   * @model name="null" literal=""
   * @generated
   * @ordered
   */
  public static final int NULL = 0;

  /**
   * The '<em><b>Negated</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Negated</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEGATED_LITERAL
   * @model name="negated" literal="~"
   * @generated
   * @ordered
   */
  public static final int NEGATED = 1;

  /**
   * The '<em><b>Conditional</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Conditional</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONDITIONAL_LITERAL
   * @model name="conditional" literal="?"
   * @generated
   * @ordered
   */
  public static final int CONDITIONAL = 2;

  /**
   * The '<em><b>Assertion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Assertion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSERTION_LITERAL
   * @model name="assertion" literal="!"
   * @generated
   * @ordered
   */
  public static final int ASSERTION = 3;

  /**
   * The '<em><b>Null</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NULL
   * @generated
   * @ordered
   */
  public static final Qualifier NULL_LITERAL = new Qualifier(NULL, "null", "");

  /**
   * The '<em><b>Negated</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEGATED
   * @generated
   * @ordered
   */
  public static final Qualifier NEGATED_LITERAL = new Qualifier(NEGATED, "negated", "~");

  /**
   * The '<em><b>Conditional</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONDITIONAL
   * @generated
   * @ordered
   */
  public static final Qualifier CONDITIONAL_LITERAL = new Qualifier(CONDITIONAL, "conditional", "?");

  /**
   * The '<em><b>Assertion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSERTION
   * @generated
   * @ordered
   */
  public static final Qualifier ASSERTION_LITERAL = new Qualifier(ASSERTION, "assertion", "!");

  /**
   * An array of all the '<em><b>Qualifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Qualifier[] VALUES_ARRAY =
    new Qualifier[]
    {
      NULL_LITERAL,
      NEGATED_LITERAL,
      CONDITIONAL_LITERAL,
      ASSERTION_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Qualifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Qualifier</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Qualifier get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Qualifier result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Qualifier</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Qualifier getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Qualifier result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Qualifier</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Qualifier get(int value)
  {
    switch (value)
    {
      case NULL: return NULL_LITERAL;
      case NEGATED: return NEGATED_LITERAL;
      case CONDITIONAL: return CONDITIONAL_LITERAL;
      case ASSERTION: return ASSERTION_LITERAL;
    }
    return null;
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Qualifier(int value, String name, String literal)
  {
    super(value, name, literal);
  }

} //Qualifier
