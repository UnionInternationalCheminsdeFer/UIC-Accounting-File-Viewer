/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Lists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.CodeLists#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link Accounting.CodeLists#getStations <em>Stations</em>}</li>
 *   <li>{@link Accounting.CodeLists#getCountries <em>Countries</em>}</li>
 *   <li>{@link Accounting.CodeLists#getLanguages <em>Languages</em>}</li>
 *   <li>{@link Accounting.CodeLists#getCurrencies <em>Currencies</em>}</li>
 *   <li>{@link Accounting.CodeLists#getServiceBrands <em>Service Brands</em>}</li>
 *   <li>{@link Accounting.CodeLists#getNutsCodes <em>Nuts Codes</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCodeLists()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CARRIERS_MUST SERVICE_BRANDS_MUST STATIONS_MUST COUNTRIES_MUST CURRENCIES_MUST LANGUAGES_MUST'"
 * @generated
 */
public interface CodeLists extends EObject {
	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' containment reference.
	 * @see #setCarriers(Carriers)
	 * @see Accounting.AccountingPackage#getCodeLists_Carriers()
	 * @model containment="true"
	 * @generated
	 */
	Carriers getCarriers();

	/**
	 * Sets the value of the '{@link Accounting.CodeLists#getCarriers <em>Carriers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carriers</em>' containment reference.
	 * @see #getCarriers()
	 * @generated
	 */
	void setCarriers(Carriers value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference.
	 * @see #setStations(Stations)
	 * @see Accounting.AccountingPackage#getCodeLists_Stations()
	 * @model containment="true"
	 * @generated
	 */
	Stations getStations();

	/**
	 * Sets the value of the '{@link Accounting.CodeLists#getStations <em>Stations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stations</em>' containment reference.
	 * @see #getStations()
	 * @generated
	 */
	void setStations(Stations value);

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference.
	 * @see #setCountries(Countries)
	 * @see Accounting.AccountingPackage#getCodeLists_Countries()
	 * @model containment="true"
	 * @generated
	 */
	Countries getCountries();

	/**
	 * Sets the value of the '{@link Accounting.CodeLists#getCountries <em>Countries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Countries</em>' containment reference.
	 * @see #getCountries()
	 * @generated
	 */
	void setCountries(Countries value);

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference.
	 * @see #setLanguages(Languages)
	 * @see Accounting.AccountingPackage#getCodeLists_Languages()
	 * @model containment="true"
	 * @generated
	 */
	Languages getLanguages();

	/**
	 * Sets the value of the '{@link Accounting.CodeLists#getLanguages <em>Languages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Languages</em>' containment reference.
	 * @see #getLanguages()
	 * @generated
	 */
	void setLanguages(Languages value);

	/**
	 * Returns the value of the '<em><b>Currencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currencies</em>' containment reference.
	 * @see #setCurrencies(Currencies)
	 * @see Accounting.AccountingPackage#getCodeLists_Currencies()
	 * @model containment="true"
	 * @generated
	 */
	Currencies getCurrencies();

	/**
	 * Sets the value of the '{@link Accounting.CodeLists#getCurrencies <em>Currencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currencies</em>' containment reference.
	 * @see #getCurrencies()
	 * @generated
	 */
	void setCurrencies(Currencies value);

	/**
	 * Returns the value of the '<em><b>Service Brands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Brands</em>' containment reference.
	 * @see #setServiceBrands(ServiceBrands)
	 * @see Accounting.AccountingPackage#getCodeLists_ServiceBrands()
	 * @model containment="true"
	 * @generated
	 */
	ServiceBrands getServiceBrands();

	/**
	 * Sets the value of the '{@link Accounting.CodeLists#getServiceBrands <em>Service Brands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Brands</em>' containment reference.
	 * @see #getServiceBrands()
	 * @generated
	 */
	void setServiceBrands(ServiceBrands value);

	/**
	 * Returns the value of the '<em><b>Nuts Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuts Codes</em>' containment reference.
	 * @see #setNutsCodes(NUTSCodes)
	 * @see Accounting.AccountingPackage#getCodeLists_NutsCodes()
	 * @model containment="true"
	 * @generated
	 */
	NUTSCodes getNutsCodes();

	/**
	 * Sets the value of the '{@link Accounting.CodeLists#getNutsCodes <em>Nuts Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nuts Codes</em>' containment reference.
	 * @see #getNutsCodes()
	 * @generated
	 */
	void setNutsCodes(NUTSCodes value);

} // CodeLists
