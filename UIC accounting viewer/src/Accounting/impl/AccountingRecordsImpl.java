/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.AccountingRecord;
import Accounting.AccountingRecords;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Records</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountingRecordsImpl#getAccountingRecords <em>Accounting Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingRecordsImpl extends MinimalEObjectImpl.Container implements AccountingRecords {
	/**
	 * The cached value of the '{@link #getAccountingRecords() <em>Accounting Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountingRecord> accountingRecords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingRecordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTING_RECORDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccountingRecord> getAccountingRecords() {
		if (accountingRecords == null) {
			accountingRecords = new EObjectContainmentEList<AccountingRecord>(AccountingRecord.class, this, AccountingPackage.ACCOUNTING_RECORDS__ACCOUNTING_RECORDS);
		}
		return accountingRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_RECORDS__ACCOUNTING_RECORDS:
				return ((InternalEList<?>)getAccountingRecords()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.ACCOUNTING_RECORDS__ACCOUNTING_RECORDS:
				return getAccountingRecords();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_RECORDS__ACCOUNTING_RECORDS:
				getAccountingRecords().clear();
				getAccountingRecords().addAll((Collection<? extends AccountingRecord>)newValue);
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
			case AccountingPackage.ACCOUNTING_RECORDS__ACCOUNTING_RECORDS:
				getAccountingRecords().clear();
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
			case AccountingPackage.ACCOUNTING_RECORDS__ACCOUNTING_RECORDS:
				return accountingRecords != null && !accountingRecords.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountingRecordsImpl
