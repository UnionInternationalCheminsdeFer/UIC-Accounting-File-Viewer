/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.Transaction;
import Accounting.TransactionType;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.TransactionImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link Accounting.impl.TransactionImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link Accounting.impl.TransactionImpl#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link Accounting.impl.TransactionImpl#getTicketId <em>Ticket Id</em>}</li>
 *   <li>{@link Accounting.impl.TransactionImpl#getFulfillmentId <em>Fulfillment Id</em>}</li>
 *   <li>{@link Accounting.impl.TransactionImpl#getExchangebookingId <em>Exchangebooking Id</em>}</li>
 *   <li>{@link Accounting.impl.TransactionImpl#getCommunicationId <em>Communication Id</em>}</li>
 *   <li>{@link Accounting.impl.TransactionImpl#getTransactionTime <em>Transaction Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction {
	/**
	 * The default value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionType TRANSACTION_TYPE_EDEFAULT = TransactionType.BOOKING;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected TransactionType transactionType = TRANSACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContract() <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected String contract = CONTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected String bookingId = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTicketId() <em>Ticket Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketId()
	 * @generated
	 * @ordered
	 */
	protected static final String TICKET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTicketId() <em>Ticket Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketId()
	 * @generated
	 * @ordered
	 */
	protected String ticketId = TICKET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFulfillmentId() <em>Fulfillment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String FULFILLMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFulfillmentId() <em>Fulfillment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentId()
	 * @generated
	 * @ordered
	 */
	protected String fulfillmentId = FULFILLMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangebookingId() <em>Exchangebooking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangebookingId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGEBOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangebookingId() <em>Exchangebooking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangebookingId()
	 * @generated
	 * @ordered
	 */
	protected String exchangebookingId = EXCHANGEBOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationId() <em>Communication Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationId() <em>Communication Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationId()
	 * @generated
	 * @ordered
	 */
	protected String communicationId = COMMUNICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionTime() <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionTime() <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTime()
	 * @generated
	 * @ordered
	 */
	protected Date transactionTime = TRANSACTION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionType newTransactionType) {
		TransactionType oldTransactionType = transactionType;
		transactionType = newTransactionType == null ? TRANSACTION_TYPE_EDEFAULT : newTransactionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__TRANSACTION_TYPE, oldTransactionType, transactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(String newContract) {
		String oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__CONTRACT, oldContract, contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingId() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingId(String newBookingId) {
		String oldBookingId = bookingId;
		bookingId = newBookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__BOOKING_ID, oldBookingId, bookingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTicketId() {
		return ticketId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTicketId(String newTicketId) {
		String oldTicketId = ticketId;
		ticketId = newTicketId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__TICKET_ID, oldTicketId, ticketId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFulfillmentId() {
		return fulfillmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillmentId(String newFulfillmentId) {
		String oldFulfillmentId = fulfillmentId;
		fulfillmentId = newFulfillmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__FULFILLMENT_ID, oldFulfillmentId, fulfillmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangebookingId() {
		return exchangebookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangebookingId(String newExchangebookingId) {
		String oldExchangebookingId = exchangebookingId;
		exchangebookingId = newExchangebookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__EXCHANGEBOOKING_ID, oldExchangebookingId, exchangebookingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunicationId() {
		return communicationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationId(String newCommunicationId) {
		String oldCommunicationId = communicationId;
		communicationId = newCommunicationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__COMMUNICATION_ID, oldCommunicationId, communicationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTransactionTime() {
		return transactionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionTime(Date newTransactionTime) {
		Date oldTransactionTime = transactionTime;
		transactionTime = newTransactionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.TRANSACTION__TRANSACTION_TIME, oldTransactionTime, transactionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.TRANSACTION__TRANSACTION_TYPE:
				return getTransactionType();
			case AccountingPackage.TRANSACTION__CONTRACT:
				return getContract();
			case AccountingPackage.TRANSACTION__BOOKING_ID:
				return getBookingId();
			case AccountingPackage.TRANSACTION__TICKET_ID:
				return getTicketId();
			case AccountingPackage.TRANSACTION__FULFILLMENT_ID:
				return getFulfillmentId();
			case AccountingPackage.TRANSACTION__EXCHANGEBOOKING_ID:
				return getExchangebookingId();
			case AccountingPackage.TRANSACTION__COMMUNICATION_ID:
				return getCommunicationId();
			case AccountingPackage.TRANSACTION__TRANSACTION_TIME:
				return getTransactionTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.TRANSACTION__TRANSACTION_TYPE:
				setTransactionType((TransactionType)newValue);
				return;
			case AccountingPackage.TRANSACTION__CONTRACT:
				setContract((String)newValue);
				return;
			case AccountingPackage.TRANSACTION__BOOKING_ID:
				setBookingId((String)newValue);
				return;
			case AccountingPackage.TRANSACTION__TICKET_ID:
				setTicketId((String)newValue);
				return;
			case AccountingPackage.TRANSACTION__FULFILLMENT_ID:
				setFulfillmentId((String)newValue);
				return;
			case AccountingPackage.TRANSACTION__EXCHANGEBOOKING_ID:
				setExchangebookingId((String)newValue);
				return;
			case AccountingPackage.TRANSACTION__COMMUNICATION_ID:
				setCommunicationId((String)newValue);
				return;
			case AccountingPackage.TRANSACTION__TRANSACTION_TIME:
				setTransactionTime((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccountingPackage.TRANSACTION__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__CONTRACT:
				setContract(CONTRACT_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__BOOKING_ID:
				setBookingId(BOOKING_ID_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__TICKET_ID:
				setTicketId(TICKET_ID_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__FULFILLMENT_ID:
				setFulfillmentId(FULFILLMENT_ID_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__EXCHANGEBOOKING_ID:
				setExchangebookingId(EXCHANGEBOOKING_ID_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__COMMUNICATION_ID:
				setCommunicationId(COMMUNICATION_ID_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__TRANSACTION_TIME:
				setTransactionTime(TRANSACTION_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccountingPackage.TRANSACTION__TRANSACTION_TYPE:
				return transactionType != TRANSACTION_TYPE_EDEFAULT;
			case AccountingPackage.TRANSACTION__CONTRACT:
				return CONTRACT_EDEFAULT == null ? contract != null : !CONTRACT_EDEFAULT.equals(contract);
			case AccountingPackage.TRANSACTION__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? bookingId != null : !BOOKING_ID_EDEFAULT.equals(bookingId);
			case AccountingPackage.TRANSACTION__TICKET_ID:
				return TICKET_ID_EDEFAULT == null ? ticketId != null : !TICKET_ID_EDEFAULT.equals(ticketId);
			case AccountingPackage.TRANSACTION__FULFILLMENT_ID:
				return FULFILLMENT_ID_EDEFAULT == null ? fulfillmentId != null : !FULFILLMENT_ID_EDEFAULT.equals(fulfillmentId);
			case AccountingPackage.TRANSACTION__EXCHANGEBOOKING_ID:
				return EXCHANGEBOOKING_ID_EDEFAULT == null ? exchangebookingId != null : !EXCHANGEBOOKING_ID_EDEFAULT.equals(exchangebookingId);
			case AccountingPackage.TRANSACTION__COMMUNICATION_ID:
				return COMMUNICATION_ID_EDEFAULT == null ? communicationId != null : !COMMUNICATION_ID_EDEFAULT.equals(communicationId);
			case AccountingPackage.TRANSACTION__TRANSACTION_TIME:
				return TRANSACTION_TIME_EDEFAULT == null ? transactionTime != null : !TRANSACTION_TIME_EDEFAULT.equals(transactionTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (transactionType: ");
		result.append(transactionType);
		result.append(", contract: ");
		result.append(contract);
		result.append(", bookingId: ");
		result.append(bookingId);
		result.append(", ticketId: ");
		result.append(ticketId);
		result.append(", fulfillmentId: ");
		result.append(fulfillmentId);
		result.append(", exchangebookingId: ");
		result.append(exchangebookingId);
		result.append(", communicationId: ");
		result.append(communicationId);
		result.append(", transactionTime: ");
		result.append(transactionTime);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
