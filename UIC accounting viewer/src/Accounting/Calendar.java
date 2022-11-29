/**
 */
package Accounting;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Calendar#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.Calendar#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.Calendar#getFromDate <em>From Date</em>}</li>
 *   <li>{@link Accounting.Calendar#getUntilDate <em>Until Date</em>}</li>
 *   <li>{@link Accounting.Calendar#getUtcOffset <em>Utc Offset</em>}</li>
 *   <li>{@link Accounting.Calendar#getDates <em>Dates</em>}</li>
 *   <li>{@link Accounting.Calendar#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Accounting.Calendar#getFromDateTime <em>From Date Time</em>}</li>
 *   <li>{@link Accounting.Calendar#getUntilDateTime <em>Until Date Time</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Accounting.AccountingPackage#getCalendar_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getCalendar_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see Accounting.AccountingPackage#getCalendar_FromDate()
	 * @model dataType="Accounting.DateAsDate"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Until Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Date</em>' attribute.
	 * @see #setUntilDate(Date)
	 * @see Accounting.AccountingPackage#getCalendar_UntilDate()
	 * @model dataType="Accounting.DateAsDate"
	 * @generated
	 */
	Date getUntilDate();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getUntilDate <em>Until Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Date</em>' attribute.
	 * @see #getUntilDate()
	 * @generated
	 */
	void setUntilDate(Date value);

	/**
	 * Returns the value of the '<em><b>Utc Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Offset</em>' attribute.
	 * @see #setUtcOffset(int)
	 * @see Accounting.AccountingPackage#getCalendar_UtcOffset()
	 * @model
	 * @generated
	 */
	int getUtcOffset();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getUtcOffset <em>Utc Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Offset</em>' attribute.
	 * @see #getUtcOffset()
	 * @generated
	 */
	void setUtcOffset(int value);

	/**
	 * Returns the value of the '<em><b>Dates</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dates</em>' attribute list.
	 * @see Accounting.AccountingPackage#getCalendar_Dates()
	 * @model dataType="Accounting.DateAsDate"
	 * @generated
	 */
	EList<Date> getDates();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getCalendar_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>From Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date Time</em>' attribute.
	 * @see #setFromDateTime(Date)
	 * @see Accounting.AccountingPackage#getCalendar_FromDateTime()
	 * @model dataType="Accounting.DateAsDateTime"
	 * @generated
	 */
	Date getFromDateTime();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getFromDateTime <em>From Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date Time</em>' attribute.
	 * @see #getFromDateTime()
	 * @generated
	 */
	void setFromDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Until Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Date Time</em>' attribute.
	 * @see #setUntilDateTime(Date)
	 * @see Accounting.AccountingPackage#getCalendar_UntilDateTime()
	 * @model dataType="Accounting.DateAsDateTime"
	 * @generated
	 */
	Date getUntilDateTime();

	/**
	 * Sets the value of the '{@link Accounting.Calendar#getUntilDateTime <em>Until Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Date Time</em>' attribute.
	 * @see #getUntilDateTime()
	 * @generated
	 */
	void setUntilDateTime(Date value);

} // Calendar
