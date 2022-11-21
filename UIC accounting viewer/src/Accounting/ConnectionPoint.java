/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ConnectionPoint#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.ConnectionPoint#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.ConnectionPoint#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}</li>
 *   <li>{@link Accounting.ConnectionPoint#getDescription <em>Description</em>}</li>
 *   <li>{@link Accounting.ConnectionPoint#getConnectedStationSets <em>Connected Station Sets</em>}</li>
 *   <li>{@link Accounting.ConnectionPoint#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Accounting.ConnectionPoint#getNameUtf8 <em>Name Utf8</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getConnectionPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NAME_FORMAT LEGACY_BORDER_POINT_MISSING STATION_SET_AT_LEAST_ONE NAME_UTF8_FORMAT NOT_REFERENCED'"
 * @generated
 */
public interface ConnectionPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getConnectionPoint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.ConnectionPoint#getId <em>Id</em>}' attribute.
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
	 * @see Accounting.AccountingPackage#getConnectionPoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Accounting.ConnectionPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Border Point Code</em>' attribute.
	 * @see #setLegacyBorderPointCode(int)
	 * @see Accounting.AccountingPackage#getConnectionPoint_LegacyBorderPointCode()
	 * @model
	 * @generated
	 */
	int getLegacyBorderPointCode();

	/**
	 * Sets the value of the '{@link Accounting.ConnectionPoint#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Border Point Code</em>' attribute.
	 * @see #getLegacyBorderPointCode()
	 * @generated
	 */
	void setLegacyBorderPointCode(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Accounting.AccountingPackage#getConnectionPoint_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Accounting.ConnectionPoint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Connected Station Sets</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.StationSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Station Sets</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getConnectionPoint_ConnectedStationSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<StationSet> getConnectedStationSets();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getConnectionPoint_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.ConnectionPoint#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Utf8</em>' attribute.
	 * @see #setNameUtf8(String)
	 * @see Accounting.AccountingPackage#getConnectionPoint_NameUtf8()
	 * @model
	 * @generated
	 */
	String getNameUtf8();

	/**
	 * Sets the value of the '{@link Accounting.ConnectionPoint#getNameUtf8 <em>Name Utf8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Utf8</em>' attribute.
	 * @see #getNameUtf8()
	 * @generated
	 */
	void setNameUtf8(String value);

} // ConnectionPoint
