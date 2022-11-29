/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Free Passenger Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.IncludedFreePassengerLimit#getNumber <em>Number</em>}</li>
 *   <li>{@link Accounting.IncludedFreePassengerLimit#getPassengerType <em>Passenger Type</em>}</li>
 *   <li>{@link Accounting.IncludedFreePassengerLimit#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getIncludedFreePassengerLimit()
 * @model
 * @generated
 */
public interface IncludedFreePassengerLimit extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see Accounting.AccountingPackage#getIncludedFreePassengerLimit_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link Accounting.IncludedFreePassengerLimit#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Passenger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TravelerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Type</em>' attribute.
	 * @see Accounting.TravelerType
	 * @see #setPassengerType(TravelerType)
	 * @see Accounting.AccountingPackage#getIncludedFreePassengerLimit_PassengerType()
	 * @model
	 * @generated
	 */
	TravelerType getPassengerType();

	/**
	 * Sets the value of the '{@link Accounting.IncludedFreePassengerLimit#getPassengerType <em>Passenger Type</em>}' attribute.
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
	 * @see Accounting.AccountingPackage#getIncludedFreePassengerLimit_PassengerConstraint()
	 * @model
	 * @generated
	 */
	PassengerConstraint getPassengerConstraint();

	/**
	 * Sets the value of the '{@link Accounting.IncludedFreePassengerLimit#getPassengerConstraint <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Constraint</em>' reference.
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	void setPassengerConstraint(PassengerConstraint value);

} // IncludedFreePassengerLimit
