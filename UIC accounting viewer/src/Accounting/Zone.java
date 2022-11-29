/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Zone#getBinaryZoneId <em>Binary Zone Id</em>}</li>
 *   <li>{@link Accounting.Zone#getZoneId <em>Zone Id</em>}</li>
 *   <li>{@link Accounting.Zone#getCity <em>City</em>}</li>
 *   <li>{@link Accounting.Zone#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Accounting.Zone#getEntryStation <em>Entry Station</em>}</li>
 *   <li>{@link Accounting.Zone#getTerminalStation <em>Terminal Station</em>}</li>
 *   <li>{@link Accounting.Zone#getNutsCode <em>Nuts Code</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends EObject {
	/**
	 * Returns the value of the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Zone Id</em>' attribute.
	 * @see #setBinaryZoneId(byte[])
	 * @see Accounting.AccountingPackage#getZone_BinaryZoneId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getBinaryZoneId();

	/**
	 * Sets the value of the '{@link Accounting.Zone#getBinaryZoneId <em>Binary Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Zone Id</em>' attribute.
	 * @see #getBinaryZoneId()
	 * @generated
	 */
	void setBinaryZoneId(byte[] value);

	/**
	 * Returns the value of the '<em><b>Zone Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Id</em>' attribute list.
	 * @see Accounting.AccountingPackage#getZone_ZoneId()
	 * @model
	 * @generated
	 */
	EList<String> getZoneId();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(int)
	 * @see Accounting.AccountingPackage#getZone_City()
	 * @model
	 * @generated
	 */
	int getCity();

	/**
	 * Sets the value of the '{@link Accounting.Zone#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(int value);

	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Accounting.AccountingPackage#getZone_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Accounting.Zone#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Station</em>' reference.
	 * @see #setEntryStation(Station)
	 * @see Accounting.AccountingPackage#getZone_EntryStation()
	 * @model
	 * @generated
	 */
	Station getEntryStation();

	/**
	 * Sets the value of the '{@link Accounting.Zone#getEntryStation <em>Entry Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Station</em>' reference.
	 * @see #getEntryStation()
	 * @generated
	 */
	void setEntryStation(Station value);

	/**
	 * Returns the value of the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Station</em>' reference.
	 * @see #setTerminalStation(Station)
	 * @see Accounting.AccountingPackage#getZone_TerminalStation()
	 * @model
	 * @generated
	 */
	Station getTerminalStation();

	/**
	 * Sets the value of the '{@link Accounting.Zone#getTerminalStation <em>Terminal Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Station</em>' reference.
	 * @see #getTerminalStation()
	 * @generated
	 */
	void setTerminalStation(Station value);

	/**
	 * Returns the value of the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuts Code</em>' reference.
	 * @see #setNutsCode(NutsCode)
	 * @see Accounting.AccountingPackage#getZone_NutsCode()
	 * @model
	 * @generated
	 */
	NutsCode getNutsCode();

	/**
	 * Sets the value of the '{@link Accounting.Zone#getNutsCode <em>Nuts Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nuts Code</em>' reference.
	 * @see #getNutsCode()
	 * @generated
	 */
	void setNutsCode(NutsCode value);

} // Zone
