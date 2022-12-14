/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Station Set Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FareStationSetDefinition#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Accounting.FareStationSetDefinition#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Accounting.FareStationSetDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link Accounting.FareStationSetDefinition#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Accounting.FareStationSetDefinition#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.FareStationSetDefinition#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.FareStationSetDefinition#getNameUtf8 <em>Name Utf8</em>}</li>
 *   <li>{@link Accounting.FareStationSetDefinition#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFareStationSetDefinition()
 * @model
 * @generated
 */
public interface FareStationSetDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.FareStationSetDefinition#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Accounting.FareStationSetDefinition#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Accounting.FareStationSetDefinition#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Code</em>' attribute.
	 * @see #setLegacyCode(int)
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_LegacyCode()
	 * @model
	 * @generated
	 */
	int getLegacyCode();

	/**
	 * Sets the value of the '{@link Accounting.FareStationSetDefinition#getLegacyCode <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Code</em>' attribute.
	 * @see #getLegacyCode()
	 * @generated
	 */
	void setLegacyCode(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.FareStationSetDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Accounting.FareStationSetDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Utf8</em>' attribute.
	 * @see #setNameUtf8(String)
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_NameUtf8()
	 * @model
	 * @generated
	 */
	String getNameUtf8();

	/**
	 * Sets the value of the '{@link Accounting.FareStationSetDefinition#getNameUtf8 <em>Name Utf8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Utf8</em>' attribute.
	 * @see #getNameUtf8()
	 * @generated
	 */
	void setNameUtf8(String value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see Accounting.AccountingPackage#getFareStationSetDefinition_Stations()
	 * @model
	 * @generated
	 */
	EList<Station> getStations();

} // FareStationSetDefinition
