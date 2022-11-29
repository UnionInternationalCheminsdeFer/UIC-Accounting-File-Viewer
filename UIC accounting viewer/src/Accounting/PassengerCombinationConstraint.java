/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Combination Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.PassengerCombinationConstraint#getMaxNumber <em>Max Number</em>}</li>
 *   <li>{@link Accounting.PassengerCombinationConstraint#getMinNumber <em>Min Number</em>}</li>
 *   <li>{@link Accounting.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}</li>
 *   <li>{@link Accounting.PassengerCombinationConstraint#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getPassengerCombinationConstraint()
 * @model
 * @generated
 */
public interface PassengerCombinationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number</em>' attribute.
	 * @see #setMaxNumber(int)
	 * @see Accounting.AccountingPackage#getPassengerCombinationConstraint_MaxNumber()
	 * @model
	 * @generated
	 */
	int getMaxNumber();

	/**
	 * Sets the value of the '{@link Accounting.PassengerCombinationConstraint#getMaxNumber <em>Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number</em>' attribute.
	 * @see #getMaxNumber()
	 * @generated
	 */
	void setMaxNumber(int value);

	/**
	 * Returns the value of the '<em><b>Min Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Number</em>' attribute.
	 * @see #setMinNumber(int)
	 * @see Accounting.AccountingPackage#getPassengerCombinationConstraint_MinNumber()
	 * @model
	 * @generated
	 */
	int getMinNumber();

	/**
	 * Sets the value of the '{@link Accounting.PassengerCombinationConstraint#getMinNumber <em>Min Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Number</em>' attribute.
	 * @see #getMinNumber()
	 * @generated
	 */
	void setMinNumber(int value);

	/**
	 * Returns the value of the '<em><b>Passenger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TravelerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Type</em>' attribute.
	 * @see Accounting.TravelerType
	 * @see #setPassengerType(TravelerType)
	 * @see Accounting.AccountingPackage#getPassengerCombinationConstraint_PassengerType()
	 * @model
	 * @generated
	 */
	TravelerType getPassengerType();

	/**
	 * Sets the value of the '{@link Accounting.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Type</em>' attribute.
	 * @see Accounting.TravelerType
	 * @see #getPassengerType()
	 * @generated
	 */
	void setPassengerType(TravelerType value);

	/**
	 * Returns the value of the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Constraint</em>' reference.
	 * @see #setPassengerConstraint(PassengerConstraint)
	 * @see Accounting.AccountingPackage#getPassengerCombinationConstraint_PassengerConstraint()
	 * @model
	 * @generated
	 */
	PassengerConstraint getPassengerConstraint();

	/**
	 * Sets the value of the '{@link Accounting.PassengerCombinationConstraint#getPassengerConstraint <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Constraint</em>' reference.
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	void setPassengerConstraint(PassengerConstraint value);

} // PassengerCombinationConstraint
