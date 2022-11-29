/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Preference Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ReservationPreferenceGroup#getPreference <em>Preference</em>}</li>
 *   <li>{@link Accounting.ReservationPreferenceGroup#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getReservationPreferenceGroup()
 * @model
 * @generated
 */
public interface ReservationPreferenceGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Preference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference</em>' attribute list.
	 * @see Accounting.AccountingPackage#getReservationPreferenceGroup_Preference()
	 * @model
	 * @generated
	 */
	EList<String> getPreference();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see Accounting.AccountingPackage#getReservationPreferenceGroup_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link Accounting.ReservationPreferenceGroup#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

} // ReservationPreferenceGroup
