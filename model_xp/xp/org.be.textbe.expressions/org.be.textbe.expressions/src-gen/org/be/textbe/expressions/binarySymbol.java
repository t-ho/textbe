/**
 * <copyright>
 * </copyright>
 *

 */
package org.be.textbe.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>binary Symbol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.be.textbe.expressions.ExpressionsPackage#getbinarySymbol()
 * @model
 * @generated
 */
public enum binarySymbol implements Enumerator
{
  /**
   * The '<em><b>LESS THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN_VALUE
   * @generated
   * @ordered
   */
  LESS_THAN(0, "LESS_THAN", "<"),

  /**
   * The '<em><b>GREATER THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_VALUE
   * @generated
   * @ordered
   */
  GREATER_THAN(1, "GREATER_THAN", ">"),

  /**
   * The '<em><b>EQUAL TO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL_TO_VALUE
   * @generated
   * @ordered
   */
  EQUAL_TO(2, "EQUAL_TO", "="),

  /**
   * The '<em><b>LESS THAN OR EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN_OR_EQUAL_VALUE
   * @generated
   * @ordered
   */
  LESS_THAN_OR_EQUAL(3, "LESS_THAN_OR_EQUAL", "=<"),

  /**
   * The '<em><b>GREATER THAN OR EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_OR_EQUAL_VALUE
   * @generated
   * @ordered
   */
  GREATER_THAN_OR_EQUAL(4, "GREATER_THAN_OR_EQUAL", ">="),

  /**
   * The '<em><b>COLON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLON_VALUE
   * @generated
   * @ordered
   */
  COLON(5, "COLON", ":"),

  /**
   * The '<em><b>SUBSET EXP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBSET_EXP_VALUE
   * @generated
   * @ordered
   */
  SUBSET_EXP(6, "SUBSET_EXP", "<:");

  /**
   * The '<em><b>LESS THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LESS THAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESS_THAN
   * @model literal="<"
   * @generated
   * @ordered
   */
  public static final int LESS_THAN_VALUE = 0;

  /**
   * The '<em><b>GREATER THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GREATER THAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREATER_THAN
   * @model literal=">"
   * @generated
   * @ordered
   */
  public static final int GREATER_THAN_VALUE = 1;

  /**
   * The '<em><b>EQUAL TO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EQUAL TO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUAL_TO
   * @model literal="="
   * @generated
   * @ordered
   */
  public static final int EQUAL_TO_VALUE = 2;

  /**
   * The '<em><b>LESS THAN OR EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LESS THAN OR EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESS_THAN_OR_EQUAL
   * @model literal="=<"
   * @generated
   * @ordered
   */
  public static final int LESS_THAN_OR_EQUAL_VALUE = 3;

  /**
   * The '<em><b>GREATER THAN OR EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GREATER THAN OR EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_OR_EQUAL
   * @model literal=">="
   * @generated
   * @ordered
   */
  public static final int GREATER_THAN_OR_EQUAL_VALUE = 4;

  /**
   * The '<em><b>COLON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COLON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLON
   * @model literal=":"
   * @generated
   * @ordered
   */
  public static final int COLON_VALUE = 5;

  /**
   * The '<em><b>SUBSET EXP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUBSET EXP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBSET_EXP
   * @model literal="<:"
   * @generated
   * @ordered
   */
  public static final int SUBSET_EXP_VALUE = 6;

  /**
   * An array of all the '<em><b>binary Symbol</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final binarySymbol[] VALUES_ARRAY =
    new binarySymbol[]
    {
      LESS_THAN,
      GREATER_THAN,
      EQUAL_TO,
      LESS_THAN_OR_EQUAL,
      GREATER_THAN_OR_EQUAL,
      COLON,
      SUBSET_EXP,
    };

  /**
   * A public read-only list of all the '<em><b>binary Symbol</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<binarySymbol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>binary Symbol</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static binarySymbol get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      binarySymbol result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>binary Symbol</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static binarySymbol getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      binarySymbol result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>binary Symbol</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static binarySymbol get(int value)
  {
    switch (value)
    {
      case LESS_THAN_VALUE: return LESS_THAN;
      case GREATER_THAN_VALUE: return GREATER_THAN;
      case EQUAL_TO_VALUE: return EQUAL_TO;
      case LESS_THAN_OR_EQUAL_VALUE: return LESS_THAN_OR_EQUAL;
      case GREATER_THAN_OR_EQUAL_VALUE: return GREATER_THAN_OR_EQUAL;
      case COLON_VALUE: return COLON;
      case SUBSET_EXP_VALUE: return SUBSET_EXP;
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
  private binarySymbol(int value, String name, String literal)
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
  
} //binarySymbol
