/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.st.textst;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.be.textbe.st.textst.TextstPackage#getQualifier()
 * @model
 * @generated
 */
public enum Qualifier implements Enumerator
{
  /**
	 * The '<em><b>Null</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
  NULL(0, "null", ""),

  /**
	 * The '<em><b>Negated</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #NEGATED_VALUE
	 * @generated
	 * @ordered
	 */
  NEGATED(1, "negated", "~"),

  /**
	 * The '<em><b>Conditional</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CONDITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
  CONDITIONAL(2, "conditional", "?"),

  /**
	 * The '<em><b>Assertion</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ASSERTION_VALUE
	 * @generated
	 * @ordered
	 */
  ASSERTION(3, "assertion", "!");

  /**
	 * The '<em><b>Null</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Null</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #NULL
	 * @model name="null" literal=""
	 * @generated
	 * @ordered
	 */
  public static final int NULL_VALUE = 0;

  /**
	 * The '<em><b>Negated</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Negated</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #NEGATED
	 * @model name="negated" literal="~"
	 * @generated
	 * @ordered
	 */
  public static final int NEGATED_VALUE = 1;

  /**
	 * The '<em><b>Conditional</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Conditional</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CONDITIONAL
	 * @model name="conditional" literal="?"
	 * @generated
	 * @ordered
	 */
  public static final int CONDITIONAL_VALUE = 2;

  /**
	 * The '<em><b>Assertion</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Assertion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ASSERTION
	 * @model name="assertion" literal="!"
	 * @generated
	 * @ordered
	 */
  public static final int ASSERTION_VALUE = 3;

  /**
	 * An array of all the '<em><b>Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Qualifier[] VALUES_ARRAY =
    new Qualifier[] {
			NULL,
			NEGATED,
			CONDITIONAL,
			ASSERTION,
		};

  /**
	 * A public read-only list of all the '<em><b>Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Qualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Qualifier get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Qualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
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
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Qualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
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
		switch (value) {
			case NULL_VALUE: return NULL;
			case NEGATED_VALUE: return NEGATED;
			case CONDITIONAL_VALUE: return CONDITIONAL;
			case ASSERTION_VALUE: return ASSERTION;
		}
		return null;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final int value;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String name;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String literal;

  /**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private Qualifier(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //Qualifier
