/**
 */
package Accounting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sales Channel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Accounting.AccountingPackage#getSalesChannel()
 * @model
 * @generated
 */
public enum SalesChannel implements Enumerator {
	/**
	 * The '<em><b>AGENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	AGENCY(0, "AGENCY", "AGENCY"),

	/**
	 * The '<em><b>AGENCY WEB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENCY_WEB_VALUE
	 * @generated
	 * @ordered
	 */
	AGENCY_WEB(1, "AGENCY_WEB", "AGENCY_WEB"),

	/**
	 * The '<em><b>MOBILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE(2, "MOBILE", "MOBILE"),

	/**
	 * The '<em><b>RAIL OFFICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_OFFICE_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL_OFFICE(3, "RAIL_OFFICE", "RAIL_OFFICE"),

	/**
	 * The '<em><b>VENDING MACHINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENDING_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	VENDING_MACHINE(4, "VENDING_MACHINE", "VENDING_MACHINE"),

	/**
	 * The '<em><b>WEB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_VALUE
	 * @generated
	 * @ordered
	 */
	WEB(5, "WEB", "WEB"),

	/**
	 * The '<em><b>WEB MOBILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_MOBILE_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_MOBILE(6, "WEB_MOBILE", "WEB_MOBILE"),

	/**
	 * The '<em><b>ON BOARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_BOARD_VALUE
	 * @generated
	 * @ordered
	 */
	ON_BOARD(7, "ON_BOARD", "ON_BOARD");

	/**
	 * The '<em><b>AGENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGENCY_VALUE = 0;

	/**
	 * The '<em><b>AGENCY WEB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENCY_WEB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGENCY_WEB_VALUE = 1;

	/**
	 * The '<em><b>MOBILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_VALUE = 2;

	/**
	 * The '<em><b>RAIL OFFICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_OFFICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_OFFICE_VALUE = 3;

	/**
	 * The '<em><b>VENDING MACHINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENDING_MACHINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENDING_MACHINE_VALUE = 4;

	/**
	 * The '<em><b>WEB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEB_VALUE = 5;

	/**
	 * The '<em><b>WEB MOBILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_MOBILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEB_MOBILE_VALUE = 6;

	/**
	 * The '<em><b>ON BOARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_BOARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_BOARD_VALUE = 7;

	/**
	 * An array of all the '<em><b>Sales Channel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SalesChannel[] VALUES_ARRAY =
		new SalesChannel[] {
			AGENCY,
			AGENCY_WEB,
			MOBILE,
			RAIL_OFFICE,
			VENDING_MACHINE,
			WEB,
			WEB_MOBILE,
			ON_BOARD,
		};

	/**
	 * A public read-only list of all the '<em><b>Sales Channel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SalesChannel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sales Channel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SalesChannel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SalesChannel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sales Channel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SalesChannel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SalesChannel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sales Channel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SalesChannel get(int value) {
		switch (value) {
			case AGENCY_VALUE: return AGENCY;
			case AGENCY_WEB_VALUE: return AGENCY_WEB;
			case MOBILE_VALUE: return MOBILE;
			case RAIL_OFFICE_VALUE: return RAIL_OFFICE;
			case VENDING_MACHINE_VALUE: return VENDING_MACHINE;
			case WEB_VALUE: return WEB;
			case WEB_MOBILE_VALUE: return WEB_MOBILE;
			case ON_BOARD_VALUE: return ON_BOARD;
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
	private SalesChannel(int value, String name, String literal) {
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
	
} //SalesChannel
