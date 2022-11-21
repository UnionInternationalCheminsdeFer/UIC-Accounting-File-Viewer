/**
 */
package Accounting.impl;

import Accounting.AccountingDelivery;
import Accounting.AccountingFile;
import Accounting.AccountingPackage;
import Accounting.AccountingRecords;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountingFileImpl#getAccountingDelivery <em>Accounting Delivery</em>}</li>
 *   <li>{@link Accounting.impl.AccountingFileImpl#getAccountingRecords <em>Accounting Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingFileImpl extends MinimalEObjectImpl.Container implements AccountingFile {
	/**
	 * The cached value of the '{@link #getAccountingDelivery() <em>Accounting Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingDelivery()
	 * @generated
	 * @ordered
	 */
	protected AccountingDelivery accountingDelivery;

	/**
	 * The cached value of the '{@link #getAccountingRecords() <em>Accounting Records</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingRecords()
	 * @generated
	 * @ordered
	 */
	protected AccountingRecords accountingRecords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTING_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingDelivery getAccountingDelivery() {
		return accountingDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountingDelivery(AccountingDelivery newAccountingDelivery, NotificationChain msgs) {
		AccountingDelivery oldAccountingDelivery = accountingDelivery;
		accountingDelivery = newAccountingDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY, oldAccountingDelivery, newAccountingDelivery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountingDelivery(AccountingDelivery newAccountingDelivery) {
		if (newAccountingDelivery != accountingDelivery) {
			NotificationChain msgs = null;
			if (accountingDelivery != null)
				msgs = ((InternalEObject)accountingDelivery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY, null, msgs);
			if (newAccountingDelivery != null)
				msgs = ((InternalEObject)newAccountingDelivery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY, null, msgs);
			msgs = basicSetAccountingDelivery(newAccountingDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY, newAccountingDelivery, newAccountingDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingRecords getAccountingRecords() {
		return accountingRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountingRecords(AccountingRecords newAccountingRecords, NotificationChain msgs) {
		AccountingRecords oldAccountingRecords = accountingRecords;
		accountingRecords = newAccountingRecords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS, oldAccountingRecords, newAccountingRecords);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountingRecords(AccountingRecords newAccountingRecords) {
		if (newAccountingRecords != accountingRecords) {
			NotificationChain msgs = null;
			if (accountingRecords != null)
				msgs = ((InternalEObject)accountingRecords).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS, null, msgs);
			if (newAccountingRecords != null)
				msgs = ((InternalEObject)newAccountingRecords).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS, null, msgs);
			msgs = basicSetAccountingRecords(newAccountingRecords, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS, newAccountingRecords, newAccountingRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY:
				return basicSetAccountingDelivery(null, msgs);
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS:
				return basicSetAccountingRecords(null, msgs);
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
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY:
				return getAccountingDelivery();
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS:
				return getAccountingRecords();
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
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY:
				setAccountingDelivery((AccountingDelivery)newValue);
				return;
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS:
				setAccountingRecords((AccountingRecords)newValue);
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
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY:
				setAccountingDelivery((AccountingDelivery)null);
				return;
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS:
				setAccountingRecords((AccountingRecords)null);
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
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_DELIVERY:
				return accountingDelivery != null;
			case AccountingPackage.ACCOUNTING_FILE__ACCOUNTING_RECORDS:
				return accountingRecords != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountingFileImpl
