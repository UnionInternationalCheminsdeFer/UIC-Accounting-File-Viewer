/**
 */
package Accounting.impl;

import Accounting.AccountedAmount;
import Accounting.AccountingPackage;
import Accounting.Currency;

import Accounting.SettlementValueIndicator;
import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accounted Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountedAmountImpl#getSettlementValueIndicator <em>Settlement Value Indicator</em>}</li>
 *   <li>{@link Accounting.impl.AccountedAmountImpl#isGrossAmount <em>Gross Amount</em>}</li>
 *   <li>{@link Accounting.impl.AccountedAmountImpl#isFee <em>Fee</em>}</li>
 *   <li>{@link Accounting.impl.AccountedAmountImpl#isCommission <em>Commission</em>}</li>
 *   <li>{@link Accounting.impl.AccountedAmountImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link Accounting.impl.AccountedAmountImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link Accounting.impl.AccountedAmountImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountedAmountImpl extends MinimalEObjectImpl.Container implements AccountedAmount {
	/**
	 * The default value of the '{@link #getSettlementValueIndicator() <em>Settlement Value Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementValueIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final SettlementValueIndicator SETTLEMENT_VALUE_INDICATOR_EDEFAULT = SettlementValueIndicator.CREDIT;

	/**
	 * The cached value of the '{@link #getSettlementValueIndicator() <em>Settlement Value Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementValueIndicator()
	 * @generated
	 * @ordered
	 */
	protected SettlementValueIndicator settlementValueIndicator = SETTLEMENT_VALUE_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrossAmount() <em>Gross Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrossAmount()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROSS_AMOUNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrossAmount() <em>Gross Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrossAmount()
	 * @generated
	 * @ordered
	 */
	protected boolean grossAmount = GROSS_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFee() <em>Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFee() <em>Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFee()
	 * @generated
	 * @ordered
	 */
	protected boolean fee = FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCommission() <em>Commission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommission()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMISSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommission() <em>Commission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommission()
	 * @generated
	 * @ordered
	 */
	protected boolean commission = COMMISSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rate = RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountedAmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTED_AMOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettlementValueIndicator getSettlementValueIndicator() {
		return settlementValueIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementValueIndicator(SettlementValueIndicator newSettlementValueIndicator) {
		SettlementValueIndicator oldSettlementValueIndicator = settlementValueIndicator;
		settlementValueIndicator = newSettlementValueIndicator == null ? SETTLEMENT_VALUE_INDICATOR_EDEFAULT : newSettlementValueIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTED_AMOUNT__SETTLEMENT_VALUE_INDICATOR, oldSettlementValueIndicator, settlementValueIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrossAmount() {
		return grossAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrossAmount(boolean newGrossAmount) {
		boolean oldGrossAmount = grossAmount;
		grossAmount = newGrossAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTED_AMOUNT__GROSS_AMOUNT, oldGrossAmount, grossAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFee(boolean newFee) {
		boolean oldFee = fee;
		fee = newFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTED_AMOUNT__FEE, oldFee, fee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommission() {
		return commission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommission(boolean newCommission) {
		boolean oldCommission = commission;
		commission = newCommission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTED_AMOUNT__COMMISSION, oldCommission, commission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency getCurrency() {
		if (currency != null && currency.eIsProxy()) {
			InternalEObject oldCurrency = (InternalEObject)currency;
			currency = (Currency)eResolveProxy(oldCurrency);
			if (currency != oldCurrency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.ACCOUNTED_AMOUNT__CURRENCY, oldCurrency, currency));
			}
		}
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency basicGetCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTED_AMOUNT__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(BigDecimal newAmount) {
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTED_AMOUNT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(BigDecimal newRate) {
		BigDecimal oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTED_AMOUNT__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTED_AMOUNT__SETTLEMENT_VALUE_INDICATOR:
				return getSettlementValueIndicator();
			case AccountingPackage.ACCOUNTED_AMOUNT__GROSS_AMOUNT:
				return isGrossAmount();
			case AccountingPackage.ACCOUNTED_AMOUNT__FEE:
				return isFee();
			case AccountingPackage.ACCOUNTED_AMOUNT__COMMISSION:
				return isCommission();
			case AccountingPackage.ACCOUNTED_AMOUNT__CURRENCY:
				if (resolve) return getCurrency();
				return basicGetCurrency();
			case AccountingPackage.ACCOUNTED_AMOUNT__AMOUNT:
				return getAmount();
			case AccountingPackage.ACCOUNTED_AMOUNT__RATE:
				return getRate();
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
			case AccountingPackage.ACCOUNTED_AMOUNT__SETTLEMENT_VALUE_INDICATOR:
				setSettlementValueIndicator((SettlementValueIndicator)newValue);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__GROSS_AMOUNT:
				setGrossAmount((Boolean)newValue);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__FEE:
				setFee((Boolean)newValue);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__COMMISSION:
				setCommission((Boolean)newValue);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__CURRENCY:
				setCurrency((Currency)newValue);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__RATE:
				setRate((BigDecimal)newValue);
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
			case AccountingPackage.ACCOUNTED_AMOUNT__SETTLEMENT_VALUE_INDICATOR:
				setSettlementValueIndicator(SETTLEMENT_VALUE_INDICATOR_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__GROSS_AMOUNT:
				setGrossAmount(GROSS_AMOUNT_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__FEE:
				setFee(FEE_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__COMMISSION:
				setCommission(COMMISSION_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__CURRENCY:
				setCurrency((Currency)null);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTED_AMOUNT__RATE:
				setRate(RATE_EDEFAULT);
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
			case AccountingPackage.ACCOUNTED_AMOUNT__SETTLEMENT_VALUE_INDICATOR:
				return settlementValueIndicator != SETTLEMENT_VALUE_INDICATOR_EDEFAULT;
			case AccountingPackage.ACCOUNTED_AMOUNT__GROSS_AMOUNT:
				return grossAmount != GROSS_AMOUNT_EDEFAULT;
			case AccountingPackage.ACCOUNTED_AMOUNT__FEE:
				return fee != FEE_EDEFAULT;
			case AccountingPackage.ACCOUNTED_AMOUNT__COMMISSION:
				return commission != COMMISSION_EDEFAULT;
			case AccountingPackage.ACCOUNTED_AMOUNT__CURRENCY:
				return currency != null;
			case AccountingPackage.ACCOUNTED_AMOUNT__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case AccountingPackage.ACCOUNTED_AMOUNT__RATE:
				return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
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
		result.append(" (settlementValueIndicator: ");
		result.append(settlementValueIndicator);
		result.append(", grossAmount: ");
		result.append(grossAmount);
		result.append(", fee: ");
		result.append(fee);
		result.append(", commission: ");
		result.append(commission);
		result.append(", amount: ");
		result.append(amount);
		result.append(", rate: ");
		result.append(rate);
		result.append(')');
		return result.toString();
	}

} //AccountedAmountImpl
