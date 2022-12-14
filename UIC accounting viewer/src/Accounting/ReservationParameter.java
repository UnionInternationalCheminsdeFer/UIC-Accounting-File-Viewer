/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ReservationParameter#isMandatoryReservation <em>Mandatory Reservation</em>}</li>
 *   <li>{@link Accounting.ReservationParameter#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.ReservationParameter#getParams9181 <em>Params9181</em>}</li>
 *   <li>{@link Accounting.ReservationParameter#getOptions <em>Options</em>}</li>
 *   <li>{@link Accounting.ReservationParameter#getMandatoryReservationForBrands <em>Mandatory Reservation For Brands</em>}</li>
 *   <li>{@link Accounting.ReservationParameter#getMandatoryReservationsForMode <em>Mandatory Reservations For Mode</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getReservationParameter()
 * @model
 * @generated
 */
public interface ReservationParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Reservation</em>' attribute.
	 * @see #setMandatoryReservation(boolean)
	 * @see Accounting.AccountingPackage#getReservationParameter_MandatoryReservation()
	 * @model
	 * @generated
	 */
	boolean isMandatoryReservation();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParameter#isMandatoryReservation <em>Mandatory Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Reservation</em>' attribute.
	 * @see #isMandatoryReservation()
	 * @generated
	 */
	void setMandatoryReservation(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getReservationParameter_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParameter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Params9181</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params9181</em>' containment reference.
	 * @see #setParams9181(ReservationParams9181)
	 * @see Accounting.AccountingPackage#getReservationParameter_Params9181()
	 * @model containment="true"
	 * @generated
	 */
	ReservationParams9181 getParams9181();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParameter#getParams9181 <em>Params9181</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params9181</em>' containment reference.
	 * @see #getParams9181()
	 * @generated
	 */
	void setParams9181(ReservationParams9181 value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(ReservationOptions)
	 * @see Accounting.AccountingPackage#getReservationParameter_Options()
	 * @model containment="true"
	 * @generated
	 */
	ReservationOptions getOptions();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParameter#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(ReservationOptions value);

	/**
	 * Returns the value of the '<em><b>Mandatory Reservation For Brands</b></em>' reference list.
	 * The list contents are of type {@link Accounting.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Reservation For Brands</em>' reference list.
	 * @see Accounting.AccountingPackage#getReservationParameter_MandatoryReservationForBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getMandatoryReservationForBrands();

	/**
	 * Returns the value of the '<em><b>Mandatory Reservations For Mode</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.ServiceMode}.
	 * The literals are from the enumeration {@link Accounting.ServiceMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Reservations For Mode</em>' attribute list.
	 * @see Accounting.ServiceMode
	 * @see Accounting.AccountingPackage#getReservationParameter_MandatoryReservationsForMode()
	 * @model
	 * @generated
	 */
	EList<ServiceMode> getMandatoryReservationsForMode();

} // ReservationParameter
