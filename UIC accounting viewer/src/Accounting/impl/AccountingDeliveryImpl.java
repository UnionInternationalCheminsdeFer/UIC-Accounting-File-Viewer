/**
 */
package Accounting.impl;

import Accounting.AccountingDelivery;
import Accounting.AccountingPackage;
import Accounting.Carrier;
import Accounting.PaymentType;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountingDeliveryImpl#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.impl.AccountingDeliveryImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link Accounting.impl.AccountingDeliveryImpl#getInvoicingParty <em>Invoicing Party</em>}</li>
 *   <li>{@link Accounting.impl.AccountingDeliveryImpl#getInvoiceRecipient <em>Invoice Recipient</em>}</li>
 *   <li>{@link Accounting.impl.AccountingDeliveryImpl#getStartStatementPeriod <em>Start Statement Period</em>}</li>
 *   <li>{@link Accounting.impl.AccountingDeliveryImpl#getEndStatementPeriod <em>End Statement Period</em>}</li>
 *   <li>{@link Accounting.impl.AccountingDeliveryImpl#getPaymentType <em>Payment Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingDeliveryImpl extends MinimalEObjectImpl.Container implements AccountingDelivery {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvoicingParty() <em>Invoicing Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoicingParty()
	 * @generated
	 * @ordered
	 */
	protected Carrier invoicingParty;

	/**
	 * The cached value of the '{@link #getInvoiceRecipient() <em>Invoice Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceRecipient()
	 * @generated
	 * @ordered
	 */
	protected Carrier invoiceRecipient;

	/**
	 * The default value of the '{@link #getStartStatementPeriod() <em>Start Statement Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStatementPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_STATEMENT_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartStatementPeriod() <em>Start Statement Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStatementPeriod()
	 * @generated
	 * @ordered
	 */
	protected Date startStatementPeriod = START_STATEMENT_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndStatementPeriod() <em>End Statement Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStatementPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_STATEMENT_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndStatementPeriod() <em>End Statement Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStatementPeriod()
	 * @generated
	 * @ordered
	 */
	protected Date endStatementPeriod = END_STATEMENT_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentType PAYMENT_TYPE_EDEFAULT = PaymentType.BCC_CLEARING;

	/**
	 * The cached value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected PaymentType paymentType = PAYMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingDeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTING_DELIVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_DELIVERY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_DELIVERY__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getInvoicingParty() {
		if (invoicingParty != null && invoicingParty.eIsProxy()) {
			InternalEObject oldInvoicingParty = (InternalEObject)invoicingParty;
			invoicingParty = (Carrier)eResolveProxy(oldInvoicingParty);
			if (invoicingParty != oldInvoicingParty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.ACCOUNTING_DELIVERY__INVOICING_PARTY, oldInvoicingParty, invoicingParty));
			}
		}
		return invoicingParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetInvoicingParty() {
		return invoicingParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoicingParty(Carrier newInvoicingParty) {
		Carrier oldInvoicingParty = invoicingParty;
		invoicingParty = newInvoicingParty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_DELIVERY__INVOICING_PARTY, oldInvoicingParty, invoicingParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getInvoiceRecipient() {
		if (invoiceRecipient != null && invoiceRecipient.eIsProxy()) {
			InternalEObject oldInvoiceRecipient = (InternalEObject)invoiceRecipient;
			invoiceRecipient = (Carrier)eResolveProxy(oldInvoiceRecipient);
			if (invoiceRecipient != oldInvoiceRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.ACCOUNTING_DELIVERY__INVOICE_RECIPIENT, oldInvoiceRecipient, invoiceRecipient));
			}
		}
		return invoiceRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetInvoiceRecipient() {
		return invoiceRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceRecipient(Carrier newInvoiceRecipient) {
		Carrier oldInvoiceRecipient = invoiceRecipient;
		invoiceRecipient = newInvoiceRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_DELIVERY__INVOICE_RECIPIENT, oldInvoiceRecipient, invoiceRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartStatementPeriod() {
		return startStatementPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartStatementPeriod(Date newStartStatementPeriod) {
		Date oldStartStatementPeriod = startStatementPeriod;
		startStatementPeriod = newStartStatementPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD, oldStartStatementPeriod, startStatementPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndStatementPeriod() {
		return endStatementPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndStatementPeriod(Date newEndStatementPeriod) {
		Date oldEndStatementPeriod = endStatementPeriod;
		endStatementPeriod = newEndStatementPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD, oldEndStatementPeriod, endStatementPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType getPaymentType() {
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentType(PaymentType newPaymentType) {
		PaymentType oldPaymentType = paymentType;
		paymentType = newPaymentType == null ? PAYMENT_TYPE_EDEFAULT : newPaymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_DELIVERY__PAYMENT_TYPE, oldPaymentType, paymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_DELIVERY__ID:
				return getId();
			case AccountingPackage.ACCOUNTING_DELIVERY__CREATION_DATE:
				return getCreationDate();
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICING_PARTY:
				if (resolve) return getInvoicingParty();
				return basicGetInvoicingParty();
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICE_RECIPIENT:
				if (resolve) return getInvoiceRecipient();
				return basicGetInvoiceRecipient();
			case AccountingPackage.ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD:
				return getStartStatementPeriod();
			case AccountingPackage.ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD:
				return getEndStatementPeriod();
			case AccountingPackage.ACCOUNTING_DELIVERY__PAYMENT_TYPE:
				return getPaymentType();
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
			case AccountingPackage.ACCOUNTING_DELIVERY__ID:
				setId((String)newValue);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICING_PARTY:
				setInvoicingParty((Carrier)newValue);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICE_RECIPIENT:
				setInvoiceRecipient((Carrier)newValue);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD:
				setStartStatementPeriod((Date)newValue);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD:
				setEndStatementPeriod((Date)newValue);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__PAYMENT_TYPE:
				setPaymentType((PaymentType)newValue);
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
			case AccountingPackage.ACCOUNTING_DELIVERY__ID:
				setId(ID_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICING_PARTY:
				setInvoicingParty((Carrier)null);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICE_RECIPIENT:
				setInvoiceRecipient((Carrier)null);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD:
				setStartStatementPeriod(START_STATEMENT_PERIOD_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD:
				setEndStatementPeriod(END_STATEMENT_PERIOD_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_DELIVERY__PAYMENT_TYPE:
				setPaymentType(PAYMENT_TYPE_EDEFAULT);
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
			case AccountingPackage.ACCOUNTING_DELIVERY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AccountingPackage.ACCOUNTING_DELIVERY__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICING_PARTY:
				return invoicingParty != null;
			case AccountingPackage.ACCOUNTING_DELIVERY__INVOICE_RECIPIENT:
				return invoiceRecipient != null;
			case AccountingPackage.ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD:
				return START_STATEMENT_PERIOD_EDEFAULT == null ? startStatementPeriod != null : !START_STATEMENT_PERIOD_EDEFAULT.equals(startStatementPeriod);
			case AccountingPackage.ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD:
				return END_STATEMENT_PERIOD_EDEFAULT == null ? endStatementPeriod != null : !END_STATEMENT_PERIOD_EDEFAULT.equals(endStatementPeriod);
			case AccountingPackage.ACCOUNTING_DELIVERY__PAYMENT_TYPE:
				return paymentType != PAYMENT_TYPE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", startStatementPeriod: ");
		result.append(startStatementPeriod);
		result.append(", endStatementPeriod: ");
		result.append(endStatementPeriod);
		result.append(", paymentType: ");
		result.append(paymentType);
		result.append(')');
		return result.toString();
	}

} //AccountingDeliveryImpl
