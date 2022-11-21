/**
 */
package Accounting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transaction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Accounting.AccountingPackage#getTransactionType()
 * @model
 * @generated
 */
public enum TransactionType implements Enumerator {
	/**
	 * The '<em><b>BOOKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKING_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKING(0, "BOOKING", "BOOKING"),

	/**
	 * The '<em><b>CANCELATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELATION_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELATION(1, "CANCELATION", "CANCELATION"),

	/**
	 * The '<em><b>EXCHANGE CANCELATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_CANCELATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE_CANCELATION(2, "EXCHANGE_CANCELATION", "EXCHANGE_CANCELATION"),

	/**
	 * The '<em><b>EXCHANGE BOOKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_BOOKING_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE_BOOKING(3, "EXCHANGE_BOOKING", "EXCHANGE_BOOKING"),

	/**
	 * The '<em><b>COMPENSATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPENSATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPENSATION(4, "COMPENSATION", "COMPENSATION"),

	/**
	 * The '<em><b>MANUAL REFUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_REFUND_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_REFUND(5, "MANUAL_REFUND", "MANUAL_REFUND");

	/**
	 * The '<em><b>BOOKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOKING_VALUE = 0;

	/**
	 * The '<em><b>CANCELATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCELATION_VALUE = 1;

	/**
	 * The '<em><b>EXCHANGE CANCELATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_CANCELATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_CANCELATION_VALUE = 2;

	/**
	 * The '<em><b>EXCHANGE BOOKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_BOOKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_BOOKING_VALUE = 3;

	/**
	 * The '<em><b>COMPENSATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPENSATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPENSATION_VALUE = 4;

	/**
	 * The '<em><b>MANUAL REFUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_REFUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_REFUND_VALUE = 5;

	/**
	 * An array of all the '<em><b>Transaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransactionType[] VALUES_ARRAY =
		new TransactionType[] {
			BOOKING,
			CANCELATION,
			EXCHANGE_CANCELATION,
			EXCHANGE_BOOKING,
			COMPENSATION,
			MANUAL_REFUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Transaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransactionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transaction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionType get(int value) {
		switch (value) {
			case BOOKING_VALUE: return BOOKING;
			case CANCELATION_VALUE: return CANCELATION;
			case EXCHANGE_CANCELATION_VALUE: return EXCHANGE_CANCELATION;
			case EXCHANGE_BOOKING_VALUE: return EXCHANGE_BOOKING;
			case COMPENSATION_VALUE: return COMPENSATION;
			case MANUAL_REFUND_VALUE: return MANUAL_REFUND;
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
	private TransactionType(int value, String name, String literal) {
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
	
} //TransactionType
