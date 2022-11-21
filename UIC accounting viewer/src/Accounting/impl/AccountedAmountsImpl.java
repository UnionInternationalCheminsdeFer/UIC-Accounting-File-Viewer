/**
 */
package Accounting.impl;

import Accounting.AccountedAmount;
import Accounting.AccountedAmounts;
import Accounting.AccountingPackage;

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
 * An implementation of the model object '<em><b>Accounted Amounts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountedAmountsImpl#getAccountedAmounts <em>Accounted Amounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountedAmountsImpl extends MinimalEObjectImpl.Container implements AccountedAmounts {
	/**
	 * The cached value of the '{@link #getAccountedAmounts() <em>Accounted Amounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountedAmounts()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountedAmount> accountedAmounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountedAmountsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTED_AMOUNTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccountedAmount> getAccountedAmounts() {
		if (accountedAmounts == null) {
			accountedAmounts = new EObjectContainmentEList<AccountedAmount>(AccountedAmount.class, this, AccountingPackage.ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS);
		}
		return accountedAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS:
				return ((InternalEList<?>)getAccountedAmounts()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS:
				return getAccountedAmounts();
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
			case AccountingPackage.ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS:
				getAccountedAmounts().clear();
				getAccountedAmounts().addAll((Collection<? extends AccountedAmount>)newValue);
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
			case AccountingPackage.ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS:
				getAccountedAmounts().clear();
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
			case AccountingPackage.ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS:
				return accountedAmounts != null && !accountedAmounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountedAmountsImpl
