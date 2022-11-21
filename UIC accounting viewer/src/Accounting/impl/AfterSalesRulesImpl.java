/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.AfterSalesRule;
import Accounting.AfterSalesRules;

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
 * An implementation of the model object '<em><b>After Sales Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AfterSalesRulesImpl#getAfterSalesRules <em>After Sales Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AfterSalesRulesImpl extends MinimalEObjectImpl.Container implements AfterSalesRules {
	/**
	 * The cached value of the '{@link #getAfterSalesRules() <em>After Sales Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterSalesRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AfterSalesRule> afterSalesRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AfterSalesRulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.AFTER_SALES_RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AfterSalesRule> getAfterSalesRules() {
		if (afterSalesRules == null) {
			afterSalesRules = new EObjectContainmentEList<AfterSalesRule>(AfterSalesRule.class, this, AccountingPackage.AFTER_SALES_RULES__AFTER_SALES_RULES);
		}
		return afterSalesRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.AFTER_SALES_RULES__AFTER_SALES_RULES:
				return ((InternalEList<?>)getAfterSalesRules()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.AFTER_SALES_RULES__AFTER_SALES_RULES:
				return getAfterSalesRules();
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
			case AccountingPackage.AFTER_SALES_RULES__AFTER_SALES_RULES:
				getAfterSalesRules().clear();
				getAfterSalesRules().addAll((Collection<? extends AfterSalesRule>)newValue);
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
			case AccountingPackage.AFTER_SALES_RULES__AFTER_SALES_RULES:
				getAfterSalesRules().clear();
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
			case AccountingPackage.AFTER_SALES_RULES__AFTER_SALES_RULES:
				return afterSalesRules != null && !afterSalesRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AfterSalesRulesImpl
