/**
 */
package Accounting;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Transaction#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link Accounting.Transaction#getContract <em>Contract</em>}</li>
 *   <li>{@link Accounting.Transaction#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link Accounting.Transaction#getBookingPartIds <em>Booking Part Ids</em>}</li>
 *   <li>{@link Accounting.Transaction#getAccountingReferenceIds <em>Accounting Reference Ids</em>}</li>
 *   <li>{@link Accounting.Transaction#getTicketIds <em>Ticket Ids</em>}</li>
 *   <li>{@link Accounting.Transaction#getTicketId <em>Ticket Id</em>}</li>
 *   <li>{@link Accounting.Transaction#getFulfillmentIds <em>Fulfillment Ids</em>}</li>
 *   <li>{@link Accounting.Transaction#getExchangebookingId <em>Exchangebooking Id</em>}</li>
 *   <li>{@link Accounting.Transaction#getTransactionTime <em>Transaction Time</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getTransaction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BOOKING_OR_TICKET'"
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see Accounting.TransactionType
	 * @see #setTransactionType(TransactionType)
	 * @see Accounting.AccountingPackage#getTransaction_TransactionType()
	 * @model
	 * @generated
	 */
	TransactionType getTransactionType();

	/**
	 * Sets the value of the '{@link Accounting.Transaction#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see Accounting.TransactionType
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionType value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' attribute.
	 * @see #setContract(String)
	 * @see Accounting.AccountingPackage#getTransaction_Contract()
	 * @model
	 * @generated
	 */
	String getContract();

	/**
	 * Sets the value of the '{@link Accounting.Transaction#getContract <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' attribute.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(String value);

	/**
	 * Returns the value of the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Id</em>' attribute.
	 * @see #setBookingId(String)
	 * @see Accounting.AccountingPackage#getTransaction_BookingId()
	 * @model
	 * @generated
	 */
	String getBookingId();

	/**
	 * Sets the value of the '{@link Accounting.Transaction#getBookingId <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Id</em>' attribute.
	 * @see #getBookingId()
	 * @generated
	 */
	void setBookingId(String value);

	/**
	 * Returns the value of the '<em><b>Booking Part Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Part Ids</em>' attribute list.
	 * @see Accounting.AccountingPackage#getTransaction_BookingPartIds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getBookingPartIds();

	/**
	 * Returns the value of the '<em><b>Accounting Reference Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Reference Ids</em>' attribute list.
	 * @see Accounting.AccountingPackage#getTransaction_AccountingReferenceIds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getAccountingReferenceIds();

	/**
	 * Returns the value of the '<em><b>Ticket Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket Ids</em>' attribute list.
	 * @see Accounting.AccountingPackage#getTransaction_TicketIds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getTicketIds();

	/**
	 * Returns the value of the '<em><b>Ticket Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket Id</em>' attribute.
	 * @see #setTicketId(String)
	 * @see Accounting.AccountingPackage#getTransaction_TicketId()
	 * @model
	 * @generated
	 */
	String getTicketId();

	/**
	 * Sets the value of the '{@link Accounting.Transaction#getTicketId <em>Ticket Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket Id</em>' attribute.
	 * @see #getTicketId()
	 * @generated
	 */
	void setTicketId(String value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Ids</em>' attribute list.
	 * @see Accounting.AccountingPackage#getTransaction_FulfillmentIds()
	 * @model
	 * @generated
	 */
	EList<String> getFulfillmentIds();

	/**
	 * Returns the value of the '<em><b>Exchangebooking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchangebooking Id</em>' attribute.
	 * @see #setExchangebookingId(String)
	 * @see Accounting.AccountingPackage#getTransaction_ExchangebookingId()
	 * @model
	 * @generated
	 */
	String getExchangebookingId();

	/**
	 * Sets the value of the '{@link Accounting.Transaction#getExchangebookingId <em>Exchangebooking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchangebooking Id</em>' attribute.
	 * @see #getExchangebookingId()
	 * @generated
	 */
	void setExchangebookingId(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Time</em>' attribute.
	 * @see #setTransactionTime(Date)
	 * @see Accounting.AccountingPackage#getTransaction_TransactionTime()
	 * @model dataType="Accounting.DateAsDateTime"
	 * @generated
	 */
	Date getTransactionTime();

	/**
	 * Sets the value of the '{@link Accounting.Transaction#getTransactionTime <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Time</em>' attribute.
	 * @see #getTransactionTime()
	 * @generated
	 */
	void setTransactionTime(Date value);

} // Transaction
