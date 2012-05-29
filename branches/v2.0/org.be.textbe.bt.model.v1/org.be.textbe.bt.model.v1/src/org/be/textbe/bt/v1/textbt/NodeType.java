/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.bt.v1.textbt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.be.textbe.bt.v1.textbt.TextbtPackage#getNodeType()
 * @model
 * @generated
 */
public enum NodeType implements Enumerator
{
  /**
   * The '<em><b>Normal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORMAL_VALUE
   * @generated
   * @ordered
   */
  NORMAL(0, "Normal", "Normal"),

  /**
   * The '<em><b>Reversion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REVERSION_VALUE
   * @generated
   * @ordered
   */
  REVERSION(1, "Reversion", "Reversion"),

  /**
   * The '<em><b>Synchronization</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYNCHRONIZATION_VALUE
   * @generated
   * @ordered
   */
  SYNCHRONIZATION(2, "Synchronization", "Synchronization"),

  /**
   * The '<em><b>Reference</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REFERENCE_VALUE
   * @generated
   * @ordered
   */
  REFERENCE(3, "Reference", "Reference"),

  /**
   * The '<em><b>Branch Kill</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BRANCH_KILL_VALUE
   * @generated
   * @ordered
   */
  BRANCH_KILL(4, "BranchKill", "BranchKill"),

  /**
   * The '<em><b>May</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAY_VALUE
   * @generated
   * @ordered
   */
  MAY(5, "May", "May"),

  /**
   * The '<em><b>Start New</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START_NEW_VALUE
   * @generated
   * @ordered
   */
  START_NEW(6, "StartNew", "StartNew"), /**
   * The '<em><b>Xor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XOR_VALUE
   * @generated
   * @ordered
   */
  XOR(7, "Xor", "Xor"), /**
   * The '<em><b>Disjunction</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISJUNCTION_VALUE
   * @generated
   * @ordered
   */
  DISJUNCTION(8, "Disjunction", "Disjunction"), /**
   * The '<em><b>Conjunction</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONJUNCTION_VALUE
   * @generated
   * @ordered
   */
  CONJUNCTION(9, "Conjunction", "Conjunction");

  /**
   * The '<em><b>Normal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Normal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORMAL
   * @model name="Normal"
   * @generated
   * @ordered
   */
  public static final int NORMAL_VALUE = 0;

  /**
   * The '<em><b>Reversion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reversion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REVERSION
   * @model name="Reversion"
   * @generated
   * @ordered
   */
  public static final int REVERSION_VALUE = 1;

  /**
   * The '<em><b>Synchronization</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Synchronization</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYNCHRONIZATION
   * @model name="Synchronization"
   * @generated
   * @ordered
   */
  public static final int SYNCHRONIZATION_VALUE = 2;

  /**
   * The '<em><b>Reference</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reference</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REFERENCE
   * @model name="Reference"
   * @generated
   * @ordered
   */
  public static final int REFERENCE_VALUE = 3;

  /**
   * The '<em><b>Branch Kill</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Branch Kill</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BRANCH_KILL
   * @model name="BranchKill"
   * @generated
   * @ordered
   */
  public static final int BRANCH_KILL_VALUE = 4;

  /**
   * The '<em><b>May</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>May</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAY
   * @model name="May"
   * @generated
   * @ordered
   */
  public static final int MAY_VALUE = 5;

  /**
   * The '<em><b>Start New</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Start New</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #START_NEW
   * @model name="StartNew"
   * @generated
   * @ordered
   */
  public static final int START_NEW_VALUE = 6;

  /**
   * The '<em><b>Xor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Xor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XOR
   * @model name="Xor"
   * @generated
   * @ordered
   */
  public static final int XOR_VALUE = 7;

  /**
   * The '<em><b>Disjunction</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Disjunction</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISJUNCTION
   * @model name="Disjunction"
   * @generated
   * @ordered
   */
  public static final int DISJUNCTION_VALUE = 8;

  /**
   * The '<em><b>Conjunction</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Conjunction</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONJUNCTION
   * @model name="Conjunction"
   * @generated
   * @ordered
   */
  public static final int CONJUNCTION_VALUE = 9;

  /**
   * An array of all the '<em><b>Node Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NodeType[] VALUES_ARRAY =
    new NodeType[]
    {
      NORMAL,
      REVERSION,
      SYNCHRONIZATION,
      REFERENCE,
      BRANCH_KILL,
      MAY,
      START_NEW,
      XOR,
      DISJUNCTION,
      CONJUNCTION,
    };

  /**
   * A public read-only list of all the '<em><b>Node Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Node Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NodeType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NodeType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Node Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NodeType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NodeType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Node Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NodeType get(int value)
  {
    switch (value)
    {
      case NORMAL_VALUE: return NORMAL;
      case REVERSION_VALUE: return REVERSION;
      case SYNCHRONIZATION_VALUE: return SYNCHRONIZATION;
      case REFERENCE_VALUE: return REFERENCE;
      case BRANCH_KILL_VALUE: return BRANCH_KILL;
      case MAY_VALUE: return MAY;
      case START_NEW_VALUE: return START_NEW;
      case XOR_VALUE: return XOR;
      case DISJUNCTION_VALUE: return DISJUNCTION;
      case CONJUNCTION_VALUE: return CONJUNCTION;
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
  private NodeType(int value, String name, String literal)
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
  
} //NodeType
