/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Personal Data Changes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AllowedPersonalDataChanges#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link Accounting.AllowedPersonalDataChanges#getAcceptedReason <em>Accepted Reason</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAllowedPersonalDataChanges()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TIME_LIMIT_TOO_SHORT TIME_LIMIT_TOO_LONG'"
 * @generated
 */
public interface AllowedPersonalDataChanges extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Limit</em>' attribute.
	 * @see #setTimeLimit(float)
	 * @see Accounting.AccountingPackage#getAllowedPersonalDataChanges_TimeLimit()
	 * @model
	 * @generated
	 */
	float getTimeLimit();

	/**
	 * Sets the value of the '{@link Accounting.AllowedPersonalDataChanges#getTimeLimit <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit</em>' attribute.
	 * @see #getTimeLimit()
	 * @generated
	 */
	void setTimeLimit(float value);

	/**
	 * Returns the value of the '<em><b>Accepted Reason</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.PersonalDataChangeReason}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Reason</em>' attribute.
	 * @see Accounting.PersonalDataChangeReason
	 * @see #setAcceptedReason(PersonalDataChangeReason)
	 * @see Accounting.AccountingPackage#getAllowedPersonalDataChanges_AcceptedReason()
	 * @model
	 * @generated
	 */
	PersonalDataChangeReason getAcceptedReason();

	/**
	 * Sets the value of the '{@link Accounting.AllowedPersonalDataChanges#getAcceptedReason <em>Accepted Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Reason</em>' attribute.
	 * @see Accounting.PersonalDataChangeReason
	 * @see #getAcceptedReason()
	 * @generated
	 */
	void setAcceptedReason(PersonalDataChangeReason value);

} // AllowedPersonalDataChanges
