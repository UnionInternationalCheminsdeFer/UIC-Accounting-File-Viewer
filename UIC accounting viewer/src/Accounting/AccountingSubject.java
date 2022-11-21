/**
 */
package Accounting;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountingSubject#getFareId <em>Fare Id</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getNumberOfItems <em>Number Of Items</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getSalesOfficeId <em>Sales Office Id</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getSalesChannel <em>Sales Channel</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getTrain <em>Train</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getTravelDate <em>Travel Date</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getCountryOfSale <em>Country Of Sale</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getRetailer <em>Retailer</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getBilateralTariffIdentifier <em>Bilateral Tariff Identifier</em>}</li>
 *   <li>{@link Accounting.AccountingSubject#getLegacyDescription <em>Legacy Description</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountingSubject()
 * @model
 * @generated
 */
public interface AccountingSubject extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Id</em>' attribute.
	 * @see #setFareId(String)
	 * @see Accounting.AccountingPackage#getAccountingSubject_FareId()
	 * @model
	 * @generated
	 */
	String getFareId();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getFareId <em>Fare Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Id</em>' attribute.
	 * @see #getFareId()
	 * @generated
	 */
	void setFareId(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Items</em>' attribute.
	 * @see #setNumberOfItems(int)
	 * @see Accounting.AccountingPackage#getAccountingSubject_NumberOfItems()
	 * @model
	 * @generated
	 */
	int getNumberOfItems();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getNumberOfItems <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Items</em>' attribute.
	 * @see #getNumberOfItems()
	 * @generated
	 */
	void setNumberOfItems(int value);

	/**
	 * Returns the value of the '<em><b>Sales Office Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Office Id</em>' attribute.
	 * @see #setSalesOfficeId(String)
	 * @see Accounting.AccountingPackage#getAccountingSubject_SalesOfficeId()
	 * @model
	 * @generated
	 */
	String getSalesOfficeId();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getSalesOfficeId <em>Sales Office Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Office Id</em>' attribute.
	 * @see #getSalesOfficeId()
	 * @generated
	 */
	void setSalesOfficeId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Channel</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.SalesChannel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel</em>' attribute.
	 * @see Accounting.SalesChannel
	 * @see #setSalesChannel(SalesChannel)
	 * @see Accounting.AccountingPackage#getAccountingSubject_SalesChannel()
	 * @model
	 * @generated
	 */
	SalesChannel getSalesChannel();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getSalesChannel <em>Sales Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel</em>' attribute.
	 * @see Accounting.SalesChannel
	 * @see #getSalesChannel()
	 * @generated
	 */
	void setSalesChannel(SalesChannel value);

	/**
	 * Returns the value of the '<em><b>Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' attribute.
	 * @see #setTrain(String)
	 * @see Accounting.AccountingPackage#getAccountingSubject_Train()
	 * @model
	 * @generated
	 */
	String getTrain();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getTrain <em>Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' attribute.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(String value);

	/**
	 * Returns the value of the '<em><b>Travel Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Date</em>' attribute.
	 * @see #setTravelDate(Date)
	 * @see Accounting.AccountingPackage#getAccountingSubject_TravelDate()
	 * @model dataType="Accounting.DateAsDate"
	 * @generated
	 */
	Date getTravelDate();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getTravelDate <em>Travel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Date</em>' attribute.
	 * @see #getTravelDate()
	 * @generated
	 */
	void setTravelDate(Date value);

	/**
	 * Returns the value of the '<em><b>Country Of Sale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Of Sale</em>' reference.
	 * @see #setCountryOfSale(Country)
	 * @see Accounting.AccountingPackage#getAccountingSubject_CountryOfSale()
	 * @model
	 * @generated
	 */
	Country getCountryOfSale();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getCountryOfSale <em>Country Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Of Sale</em>' reference.
	 * @see #getCountryOfSale()
	 * @generated
	 */
	void setCountryOfSale(Country value);

	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' reference list.
	 * @see Accounting.AccountingPackage#getAccountingSubject_Carriers()
	 * @model
	 * @generated
	 */
	EList<Carrier> getCarriers();

	/**
	 * Returns the value of the '<em><b>Retailer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retailer</em>' reference.
	 * @see #setRetailer(Carrier)
	 * @see Accounting.AccountingPackage#getAccountingSubject_Retailer()
	 * @model
	 * @generated
	 */
	Carrier getRetailer();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getRetailer <em>Retailer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retailer</em>' reference.
	 * @see #getRetailer()
	 * @generated
	 */
	void setRetailer(Carrier value);

	/**
	 * Returns the value of the '<em><b>Bilateral Tariff Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bilateral Tariff Identifier</em>' attribute.
	 * @see #setBilateralTariffIdentifier(String)
	 * @see Accounting.AccountingPackage#getAccountingSubject_BilateralTariffIdentifier()
	 * @model
	 * @generated
	 */
	String getBilateralTariffIdentifier();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getBilateralTariffIdentifier <em>Bilateral Tariff Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bilateral Tariff Identifier</em>' attribute.
	 * @see #getBilateralTariffIdentifier()
	 * @generated
	 */
	void setBilateralTariffIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Legacy Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Description</em>' containment reference.
	 * @see #setLegacyDescription(LegacyDescription)
	 * @see Accounting.AccountingPackage#getAccountingSubject_LegacyDescription()
	 * @model containment="true"
	 * @generated
	 */
	LegacyDescription getLegacyDescription();

	/**
	 * Sets the value of the '{@link Accounting.AccountingSubject#getLegacyDescription <em>Legacy Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Description</em>' containment reference.
	 * @see #getLegacyDescription()
	 * @generated
	 */
	void setLegacyDescription(LegacyDescription value);

} // AccountingSubject
