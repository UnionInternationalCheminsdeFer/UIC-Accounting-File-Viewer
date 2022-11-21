/**
 */
package Accounting.impl;

import Accounting.AccountedAmounts;
import Accounting.AccountingPackage;
import Accounting.AccountingRecord;
import Accounting.AccountingSubject;
import Accounting.AccountingType;
import Accounting.SalesType;
import Accounting.Transaction;
import Accounting.TransactionStandard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountingRecordImpl#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.impl.AccountingRecordImpl#getSalesType <em>Sales Type</em>}</li>
 *   <li>{@link Accounting.impl.AccountingRecordImpl#getAccountingType <em>Accounting Type</em>}</li>
 *   <li>{@link Accounting.impl.AccountingRecordImpl#getTransactionStandard <em>Transaction Standard</em>}</li>
 *   <li>{@link Accounting.impl.AccountingRecordImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link Accounting.impl.AccountingRecordImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link Accounting.impl.AccountingRecordImpl#getAccountedAmounts <em>Accounted Amounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingRecordImpl extends MinimalEObjectImpl.Container implements AccountingRecord {
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
	 * The default value of the '{@link #getSalesType() <em>Sales Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesType()
	 * @generated
	 * @ordered
	 */
	protected static final SalesType SALES_TYPE_EDEFAULT = SalesType.ONLINE;

	/**
	 * The cached value of the '{@link #getSalesType() <em>Sales Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesType()
	 * @generated
	 * @ordered
	 */
	protected SalesType salesType = SALES_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountingType() <em>Accounting Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingType()
	 * @generated
	 * @ordered
	 */
	protected static final AccountingType ACCOUNTING_TYPE_EDEFAULT = AccountingType.SHARES;

	/**
	 * The cached value of the '{@link #getAccountingType() <em>Accounting Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingType()
	 * @generated
	 * @ordered
	 */
	protected AccountingType accountingType = ACCOUNTING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionStandard() <em>Transaction Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionStandard()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionStandard TRANSACTION_STANDARD_EDEFAULT = TransactionStandard.UIC;

	/**
	 * The cached value of the '{@link #getTransactionStandard() <em>Transaction Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionStandard()
	 * @generated
	 * @ordered
	 */
	protected TransactionStandard transactionStandard = TRANSACTION_STANDARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected Transaction transaction;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected AccountingSubject subject;

	/**
	 * The cached value of the '{@link #getAccountedAmounts() <em>Accounted Amounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountedAmounts()
	 * @generated
	 * @ordered
	 */
	protected AccountedAmounts accountedAmounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTING_RECORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesType getSalesType() {
		return salesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesType(SalesType newSalesType) {
		SalesType oldSalesType = salesType;
		salesType = newSalesType == null ? SALES_TYPE_EDEFAULT : newSalesType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__SALES_TYPE, oldSalesType, salesType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingType getAccountingType() {
		return accountingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountingType(AccountingType newAccountingType) {
		AccountingType oldAccountingType = accountingType;
		accountingType = newAccountingType == null ? ACCOUNTING_TYPE_EDEFAULT : newAccountingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__ACCOUNTING_TYPE, oldAccountingType, accountingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionStandard getTransactionStandard() {
		return transactionStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionStandard(TransactionStandard newTransactionStandard) {
		TransactionStandard oldTransactionStandard = transactionStandard;
		transactionStandard = newTransactionStandard == null ? TRANSACTION_STANDARD_EDEFAULT : newTransactionStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__TRANSACTION_STANDARD, oldTransactionStandard, transactionStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(Transaction newTransaction, NotificationChain msgs) {
		Transaction oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__TRANSACTION, oldTransaction, newTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		if (newTransaction != transaction) {
			NotificationChain msgs = null;
			if (transaction != null)
				msgs = ((InternalEObject)transaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_RECORD__TRANSACTION, null, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject)newTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_RECORD__TRANSACTION, null, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__TRANSACTION, newTransaction, newTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingSubject getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(AccountingSubject newSubject, NotificationChain msgs) {
		AccountingSubject oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(AccountingSubject newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_RECORD__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_RECORD__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountedAmounts getAccountedAmounts() {
		return accountedAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountedAmounts(AccountedAmounts newAccountedAmounts, NotificationChain msgs) {
		AccountedAmounts oldAccountedAmounts = accountedAmounts;
		accountedAmounts = newAccountedAmounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS, oldAccountedAmounts, newAccountedAmounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountedAmounts(AccountedAmounts newAccountedAmounts) {
		if (newAccountedAmounts != accountedAmounts) {
			NotificationChain msgs = null;
			if (accountedAmounts != null)
				msgs = ((InternalEObject)accountedAmounts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS, null, msgs);
			if (newAccountedAmounts != null)
				msgs = ((InternalEObject)newAccountedAmounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS, null, msgs);
			msgs = basicSetAccountedAmounts(newAccountedAmounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS, newAccountedAmounts, newAccountedAmounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case AccountingPackage.ACCOUNTING_RECORD__SUBJECT:
				return basicSetSubject(null, msgs);
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS:
				return basicSetAccountedAmounts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_RECORD__ID:
				return getId();
			case AccountingPackage.ACCOUNTING_RECORD__SALES_TYPE:
				return getSalesType();
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTING_TYPE:
				return getAccountingType();
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION_STANDARD:
				return getTransactionStandard();
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION:
				return getTransaction();
			case AccountingPackage.ACCOUNTING_RECORD__SUBJECT:
				return getSubject();
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS:
				return getAccountedAmounts();
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
			case AccountingPackage.ACCOUNTING_RECORD__ID:
				setId((String)newValue);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__SALES_TYPE:
				setSalesType((SalesType)newValue);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTING_TYPE:
				setAccountingType((AccountingType)newValue);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION_STANDARD:
				setTransactionStandard((TransactionStandard)newValue);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION:
				setTransaction((Transaction)newValue);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__SUBJECT:
				setSubject((AccountingSubject)newValue);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS:
				setAccountedAmounts((AccountedAmounts)newValue);
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
			case AccountingPackage.ACCOUNTING_RECORD__ID:
				setId(ID_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__SALES_TYPE:
				setSalesType(SALES_TYPE_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTING_TYPE:
				setAccountingType(ACCOUNTING_TYPE_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION_STANDARD:
				setTransactionStandard(TRANSACTION_STANDARD_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION:
				setTransaction((Transaction)null);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__SUBJECT:
				setSubject((AccountingSubject)null);
				return;
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS:
				setAccountedAmounts((AccountedAmounts)null);
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
			case AccountingPackage.ACCOUNTING_RECORD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AccountingPackage.ACCOUNTING_RECORD__SALES_TYPE:
				return salesType != SALES_TYPE_EDEFAULT;
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTING_TYPE:
				return accountingType != ACCOUNTING_TYPE_EDEFAULT;
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION_STANDARD:
				return transactionStandard != TRANSACTION_STANDARD_EDEFAULT;
			case AccountingPackage.ACCOUNTING_RECORD__TRANSACTION:
				return transaction != null;
			case AccountingPackage.ACCOUNTING_RECORD__SUBJECT:
				return subject != null;
			case AccountingPackage.ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS:
				return accountedAmounts != null;
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
		result.append(", salesType: ");
		result.append(salesType);
		result.append(", accountingType: ");
		result.append(accountingType);
		result.append(", transactionStandard: ");
		result.append(transactionStandard);
		result.append(')');
		return result.toString();
	}

} //AccountingRecordImpl
