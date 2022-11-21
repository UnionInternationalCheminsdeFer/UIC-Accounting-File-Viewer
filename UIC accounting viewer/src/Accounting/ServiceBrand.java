/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Brand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ServiceBrand#getCode <em>Code</em>}</li>
 *   <li>{@link Accounting.ServiceBrand#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.ServiceBrand#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link Accounting.ServiceBrand#getDescription <em>Description</em>}</li>
 *   <li>{@link Accounting.ServiceBrand#getTransportMode <em>Transport Mode</em>}</li>
 *   <li>{@link Accounting.ServiceBrand#getLocalLanguageName <em>Local Language Name</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getServiceBrand()
 * @model
 * @generated
 */
public interface ServiceBrand extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see Accounting.AccountingPackage#getServiceBrand_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link Accounting.ServiceBrand#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Accounting.AccountingPackage#getServiceBrand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Accounting.ServiceBrand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see Accounting.AccountingPackage#getServiceBrand_Abbreviation()
	 * @model
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link Accounting.ServiceBrand#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Accounting.AccountingPackage#getServiceBrand_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Accounting.ServiceBrand#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Transport Mode</b></em>' attribute.
	 * The default value is <code>"train"</code>.
	 * The literals are from the enumeration {@link Accounting.TransportMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Mode</em>' attribute.
	 * @see Accounting.TransportMode
	 * @see #setTransportMode(TransportMode)
	 * @see Accounting.AccountingPackage#getServiceBrand_TransportMode()
	 * @model default="train"
	 * @generated
	 */
	TransportMode getTransportMode();

	/**
	 * Sets the value of the '{@link Accounting.ServiceBrand#getTransportMode <em>Transport Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Mode</em>' attribute.
	 * @see Accounting.TransportMode
	 * @see #getTransportMode()
	 * @generated
	 */
	void setTransportMode(TransportMode value);

	/**
	 * Returns the value of the '<em><b>Local Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Language Name</em>' attribute.
	 * @see #setLocalLanguageName(String)
	 * @see Accounting.AccountingPackage#getServiceBrand_LocalLanguageName()
	 * @model
	 * @generated
	 */
	String getLocalLanguageName();

	/**
	 * Sets the value of the '{@link Accounting.ServiceBrand#getLocalLanguageName <em>Local Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Language Name</em>' attribute.
	 * @see #getLocalLanguageName()
	 * @generated
	 */
	void setLocalLanguageName(String value);

} // ServiceBrand
