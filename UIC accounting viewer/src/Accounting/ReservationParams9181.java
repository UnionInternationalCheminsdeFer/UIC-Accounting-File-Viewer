/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Params9181</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ReservationParams9181#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link Accounting.ReservationParams9181#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Accounting.ReservationParams9181#getService <em>Service</em>}</li>
 *   <li>{@link Accounting.ReservationParams9181#getBerthType <em>Berth Type</em>}</li>
 *   <li>{@link Accounting.ReservationParams9181#getCoachType <em>Coach Type</em>}</li>
 *   <li>{@link Accounting.ReservationParams9181#getCompartmentType <em>Compartment Type</em>}</li>
 *   <li>{@link Accounting.ReservationParams9181#getTariff <em>Tariff</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getReservationParams9181()
 * @model
 * @generated
 */
public interface ReservationParams9181 extends EObject {
	/**
	 * Returns the value of the '<em><b>Travel Class</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.ReservationTravelClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Class</em>' attribute.
	 * @see Accounting.ReservationTravelClass
	 * @see #setTravelClass(ReservationTravelClass)
	 * @see Accounting.AccountingPackage#getReservationParams9181_TravelClass()
	 * @model
	 * @generated
	 */
	ReservationTravelClass getTravelClass();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParams9181#getTravelClass <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Class</em>' attribute.
	 * @see Accounting.ReservationTravelClass
	 * @see #getTravelClass()
	 * @generated
	 */
	void setTravelClass(ReservationTravelClass value);

	/**
	 * Returns the value of the '<em><b>Service Level</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.ReservationServiceLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level</em>' attribute.
	 * @see Accounting.ReservationServiceLevel
	 * @see #setServiceLevel(ReservationServiceLevel)
	 * @see Accounting.AccountingPackage#getReservationParams9181_ServiceLevel()
	 * @model
	 * @generated
	 */
	ReservationServiceLevel getServiceLevel();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParams9181#getServiceLevel <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level</em>' attribute.
	 * @see Accounting.ReservationServiceLevel
	 * @see #getServiceLevel()
	 * @generated
	 */
	void setServiceLevel(ReservationServiceLevel value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.ReservationService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see Accounting.ReservationService
	 * @see #setService(ReservationService)
	 * @see Accounting.AccountingPackage#getReservationParams9181_Service()
	 * @model
	 * @generated
	 */
	ReservationService getService();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParams9181#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see Accounting.ReservationService
	 * @see #getService()
	 * @generated
	 */
	void setService(ReservationService value);

	/**
	 * Returns the value of the '<em><b>Berth Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.ReservationBerthType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Berth Type</em>' attribute.
	 * @see Accounting.ReservationBerthType
	 * @see #setBerthType(ReservationBerthType)
	 * @see Accounting.AccountingPackage#getReservationParams9181_BerthType()
	 * @model
	 * @generated
	 */
	ReservationBerthType getBerthType();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParams9181#getBerthType <em>Berth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Berth Type</em>' attribute.
	 * @see Accounting.ReservationBerthType
	 * @see #getBerthType()
	 * @generated
	 */
	void setBerthType(ReservationBerthType value);

	/**
	 * Returns the value of the '<em><b>Coach Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach Type</em>' attribute.
	 * @see #setCoachType(int)
	 * @see Accounting.AccountingPackage#getReservationParams9181_CoachType()
	 * @model
	 * @generated
	 */
	int getCoachType();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParams9181#getCoachType <em>Coach Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach Type</em>' attribute.
	 * @see #getCoachType()
	 * @generated
	 */
	void setCoachType(int value);

	/**
	 * Returns the value of the '<em><b>Compartment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Type</em>' attribute.
	 * @see #setCompartmentType(int)
	 * @see Accounting.AccountingPackage#getReservationParams9181_CompartmentType()
	 * @model
	 * @generated
	 */
	int getCompartmentType();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParams9181#getCompartmentType <em>Compartment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment Type</em>' attribute.
	 * @see #getCompartmentType()
	 * @generated
	 */
	void setCompartmentType(int value);

	/**
	 * Returns the value of the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff</em>' attribute.
	 * @see #setTariff(int)
	 * @see Accounting.AccountingPackage#getReservationParams9181_Tariff()
	 * @model
	 * @generated
	 */
	int getTariff();

	/**
	 * Sets the value of the '{@link Accounting.ReservationParams9181#getTariff <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff</em>' attribute.
	 * @see #getTariff()
	 * @generated
	 */
	void setTariff(int value);

} // ReservationParams9181
