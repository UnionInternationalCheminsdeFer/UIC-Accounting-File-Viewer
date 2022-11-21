/**
 */
package Accounting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Accounting.AccountingPackage#getPaymentType()
 * @model
 * @generated
 */
public enum PaymentType implements Enumerator {
	/**
	 * The '<em><b>BCC CLEARING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCC_CLEARING_VALUE
	 * @generated
	 * @ordered
	 */
	BCC_CLEARING(0, "BCC_CLEARING", "BCC_CLEARING"), /**
	 * The '<em><b>CURRENT ACCOUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_ACCOUNT(1, "CURRENT_ACCOUNT", "CURRENT_ACCOUNT"),

	/**
	 * The '<em><b>CURRENT ACCOUNT CLEARING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_ACCOUNT_CLEARING_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_ACCOUNT_CLEARING(2, "CURRENT_ACCOUNT_CLEARING", "CURRENT_ACCOUNT_CLEARING"),

	/**
	 * The '<em><b>BANK ACCOUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	BANK_ACCOUNT(3, "BANK_ACCOUNT", "BANK_ACCOUNT");

	/**
	 * The '<em><b>BCC CLEARING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCC_CLEARING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BCC_CLEARING_VALUE = 0;

	/**
	 * The '<em><b>CURRENT ACCOUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_ACCOUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_ACCOUNT_VALUE = 1;

	/**
	 * The '<em><b>CURRENT ACCOUNT CLEARING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_ACCOUNT_CLEARING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_ACCOUNT_CLEARING_VALUE = 2;

	/**
	 * The '<em><b>BANK ACCOUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_ACCOUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaymentType[] VALUES_ARRAY =
		new PaymentType[] {
			BCC_CLEARING,
			CURRENT_ACCOUNT,
			CURRENT_ACCOUNT_CLEARING,
			BANK_ACCOUNT,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PaymentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType get(int value) {
		switch (value) {
			case BCC_CLEARING_VALUE: return BCC_CLEARING;
			case CURRENT_ACCOUNT_VALUE: return CURRENT_ACCOUNT;
			case CURRENT_ACCOUNT_CLEARING_VALUE: return CURRENT_ACCOUNT_CLEARING;
			case BANK_ACCOUNT_VALUE: return BANK_ACCOUNT;
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
	private PaymentType(int value, String name, String literal) {
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
	
} //PaymentType
