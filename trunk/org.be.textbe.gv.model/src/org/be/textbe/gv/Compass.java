/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.textbe.gv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compass</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.be.textbe.gv.GvPackage#getCompass()
 * @model
 * @generated
 */
public enum Compass implements Enumerator {
	/**
	 * The '<em><b>NORTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH(0, "NORTH", "n"),

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_EAST(1, "NORTH_EAST", "ne"),

	/**
	 * The '<em><b>EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_VALUE
	 * @generated
	 * @ordered
	 */
	EAST(2, "EAST", "e"),

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_EAST(3, "SOUTH_EAST", "se"),

	/**
	 * The '<em><b>SOUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH(4, "SOUTH", "s"),

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_WEST(5, "SOUTH_WEST", "sw"),

	/**
	 * The '<em><b>WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_VALUE
	 * @generated
	 * @ordered
	 */
	WEST(6, "WEST", "w"),

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_WEST(7, "NORTH_WEST", "nw"),

	/**
	 * The '<em><b>CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(8, "CENTER", "c"),

	/**
	 * The '<em><b>APPROPRIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROPRIATE_VALUE
	 * @generated
	 * @ordered
	 */
	APPROPRIATE(9, "APPROPRIATE", "_");

	/**
	 * The '<em><b>NORTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @model literal="n"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_VALUE = 0;

	/**
	 * The '<em><b>NORTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST
	 * @model literal="ne"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_EAST_VALUE = 1;

	/**
	 * The '<em><b>EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAST
	 * @model literal="e"
	 * @generated
	 * @ordered
	 */
	public static final int EAST_VALUE = 2;

	/**
	 * The '<em><b>SOUTH EAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH EAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST
	 * @model literal="se"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_EAST_VALUE = 3;

	/**
	 * The '<em><b>SOUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH
	 * @model literal="s"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_VALUE = 4;

	/**
	 * The '<em><b>SOUTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUTH WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST
	 * @model literal="sw"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_WEST_VALUE = 5;

	/**
	 * The '<em><b>WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEST
	 * @model literal="w"
	 * @generated
	 * @ordered
	 */
	public static final int WEST_VALUE = 6;

	/**
	 * The '<em><b>NORTH WEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORTH WEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST
	 * @model literal="nw"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_WEST_VALUE = 7;

	/**
	 * The '<em><b>CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model literal="c"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 8;

	/**
	 * The '<em><b>APPROPRIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPROPRIATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPROPRIATE
	 * @model literal="_"
	 * @generated
	 * @ordered
	 */
	public static final int APPROPRIATE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Compass</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Compass[] VALUES_ARRAY =
		new Compass[] {
			NORTH,
			NORTH_EAST,
			EAST,
			SOUTH_EAST,
			SOUTH,
			SOUTH_WEST,
			WEST,
			NORTH_WEST,
			CENTER,
			APPROPRIATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Compass</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Compass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compass</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Compass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Compass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compass</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Compass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Compass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compass</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Compass get(int value) {
		switch (value) {
			case NORTH_VALUE: return NORTH;
			case NORTH_EAST_VALUE: return NORTH_EAST;
			case EAST_VALUE: return EAST;
			case SOUTH_EAST_VALUE: return SOUTH_EAST;
			case SOUTH_VALUE: return SOUTH;
			case SOUTH_WEST_VALUE: return SOUTH_WEST;
			case WEST_VALUE: return WEST;
			case NORTH_WEST_VALUE: return NORTH_WEST;
			case CENTER_VALUE: return CENTER;
			case APPROPRIATE_VALUE: return APPROPRIATE;
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
	private Compass(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Compass
