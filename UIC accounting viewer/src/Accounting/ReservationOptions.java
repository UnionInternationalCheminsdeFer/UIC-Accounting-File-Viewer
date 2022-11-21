/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ReservationOptions#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link Accounting.ReservationOptions#getServiceBrands <em>Service Brands</em>}</li>
 *   <li>{@link Accounting.ReservationOptions#getGraphicalReservation <em>Graphical Reservation</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getReservationOptions()
 * @model
 * @generated
 */
public interface ReservationOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ReservationPreferenceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getReservationOptions_Preferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReservationPreferenceGroup> getPreferences();

	/**
	 * Returns the value of the '<em><b>Service Brands</b></em>' reference list.
	 * The list contents are of type {@link Accounting.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Brands</em>' reference list.
	 * @see Accounting.AccountingPackage#getReservationOptions_ServiceBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getServiceBrands();

	/**
	 * Returns the value of the '<em><b>Graphical Reservation</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.GraphicalReservationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphical Reservation</em>' attribute.
	 * @see Accounting.GraphicalReservationType
	 * @see #setGraphicalReservation(GraphicalReservationType)
	 * @see Accounting.AccountingPackage#getReservationOptions_GraphicalReservation()
	 * @model
	 * @generated
	 */
	GraphicalReservationType getGraphicalReservation();

	/**
	 * Sets the value of the '{@link Accounting.ReservationOptions#getGraphicalReservation <em>Graphical Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphical Reservation</em>' attribute.
	 * @see Accounting.GraphicalReservationType
	 * @see #getGraphicalReservation()
	 * @generated
	 */
	void setGraphicalReservation(GraphicalReservationType value);

} // ReservationOptions
