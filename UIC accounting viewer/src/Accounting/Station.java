/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Station#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.Station#getCountry <em>Country</em>}</li>
 *   <li>{@link Accounting.Station#getCode <em>Code</em>}</li>
 *   <li>{@link Accounting.Station#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Accounting.Station#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Accounting.Station#getTimetableName <em>Timetable Name</em>}</li>
 *   <li>{@link Accounting.Station#isBorderStation <em>Border Station</em>}</li>
 *   <li>{@link Accounting.Station#getNameCaseUTF8 <em>Name Case UTF8</em>}</li>
 *   <li>{@link Accounting.Station#getNameCaseASCII <em>Name Case ASCII</em>}</li>
 *   <li>{@link Accounting.Station#getShortNameCaseASCII <em>Short Name Case ASCII</em>}</li>
 *   <li>{@link Accounting.Station#getShortNameCaseUTF8 <em>Short Name Case UTF8</em>}</li>
 *   <li>{@link Accounting.Station#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}</li>
 *   <li>{@link Accounting.Station#getStationCode <em>Station Code</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Accounting.AccountingPackage#getStation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Accounting.Station#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see Accounting.AccountingPackage#getStation_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link Accounting.Station#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Accounting.AccountingPackage#getStation_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Accounting.Station#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see Accounting.AccountingPackage#getStation_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link Accounting.Station#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see Accounting.AccountingPackage#getStation_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link Accounting.Station#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Timetable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable Name</em>' attribute.
	 * @see #setTimetableName(String)
	 * @see Accounting.AccountingPackage#getStation_TimetableName()
	 * @model
	 * @generated
	 */
	String getTimetableName();

	/**
	 * Sets the value of the '{@link Accounting.Station#getTimetableName <em>Timetable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable Name</em>' attribute.
	 * @see #getTimetableName()
	 * @generated
	 */
	void setTimetableName(String value);

	/**
	 * Returns the value of the '<em><b>Border Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Station</em>' attribute.
	 * @see #setBorderStation(boolean)
	 * @see Accounting.AccountingPackage#getStation_BorderStation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isBorderStation();

	/**
	 * Sets the value of the '{@link Accounting.Station#isBorderStation <em>Border Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Station</em>' attribute.
	 * @see #isBorderStation()
	 * @generated
	 */
	void setBorderStation(boolean value);

	/**
	 * Returns the value of the '<em><b>Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Case UTF8</em>' attribute.
	 * @see #setNameCaseUTF8(String)
	 * @see Accounting.AccountingPackage#getStation_NameCaseUTF8()
	 * @model
	 * @generated
	 */
	String getNameCaseUTF8();

	/**
	 * Sets the value of the '{@link Accounting.Station#getNameCaseUTF8 <em>Name Case UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Case UTF8</em>' attribute.
	 * @see #getNameCaseUTF8()
	 * @generated
	 */
	void setNameCaseUTF8(String value);

	/**
	 * Returns the value of the '<em><b>Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Case ASCII</em>' attribute.
	 * @see #setNameCaseASCII(String)
	 * @see Accounting.AccountingPackage#getStation_NameCaseASCII()
	 * @model
	 * @generated
	 */
	String getNameCaseASCII();

	/**
	 * Sets the value of the '{@link Accounting.Station#getNameCaseASCII <em>Name Case ASCII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Case ASCII</em>' attribute.
	 * @see #getNameCaseASCII()
	 * @generated
	 */
	void setNameCaseASCII(String value);

	/**
	 * Returns the value of the '<em><b>Short Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name Case ASCII</em>' attribute.
	 * @see #setShortNameCaseASCII(String)
	 * @see Accounting.AccountingPackage#getStation_ShortNameCaseASCII()
	 * @model
	 * @generated
	 */
	String getShortNameCaseASCII();

	/**
	 * Sets the value of the '{@link Accounting.Station#getShortNameCaseASCII <em>Short Name Case ASCII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name Case ASCII</em>' attribute.
	 * @see #getShortNameCaseASCII()
	 * @generated
	 */
	void setShortNameCaseASCII(String value);

	/**
	 * Returns the value of the '<em><b>Short Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name Case UTF8</em>' attribute.
	 * @see #setShortNameCaseUTF8(String)
	 * @see Accounting.AccountingPackage#getStation_ShortNameCaseUTF8()
	 * @model
	 * @generated
	 */
	String getShortNameCaseUTF8();

	/**
	 * Sets the value of the '{@link Accounting.Station#getShortNameCaseUTF8 <em>Short Name Case UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name Case UTF8</em>' attribute.
	 * @see #getShortNameCaseUTF8()
	 * @generated
	 */
	void setShortNameCaseUTF8(String value);

	/**
	 * Returns the value of the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Border Point Code</em>' attribute.
	 * @see #setLegacyBorderPointCode(int)
	 * @see Accounting.AccountingPackage#getStation_LegacyBorderPointCode()
	 * @model
	 * @generated
	 */
	int getLegacyBorderPointCode();

	/**
	 * Sets the value of the '{@link Accounting.Station#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Border Point Code</em>' attribute.
	 * @see #getLegacyBorderPointCode()
	 * @generated
	 */
	void setLegacyBorderPointCode(int value);

	/**
	 * Returns the value of the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Code</em>' attribute.
	 * @see #setStationCode(long)
	 * @see Accounting.AccountingPackage#getStation_StationCode()
	 * @model
	 * @generated
	 */
	long getStationCode();

	/**
	 * Sets the value of the '{@link Accounting.Station#getStationCode <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Code</em>' attribute.
	 * @see #getStationCode()
	 * @generated
	 */
	void setStationCode(long value);

} // Station
