/**
 */
package Accounting;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounted Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountedAmount#getAccountsType <em>Accounts Type</em>}</li>
 *   <li>{@link Accounting.AccountedAmount#isGrossAmount <em>Gross Amount</em>}</li>
 *   <li>{@link Accounting.AccountedAmount#isFee <em>Fee</em>}</li>
 *   <li>{@link Accounting.AccountedAmount#isCommission <em>Commission</em>}</li>
 *   <li>{@link Accounting.AccountedAmount#getCurrency <em>Currency</em>}</li>
 *   <li>{@link Accounting.AccountedAmount#getAmount <em>Amount</em>}</li>
 *   <li>{@link Accounting.AccountedAmount#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountedAmount()
 * @model
 * @generated
 */
public interface AccountedAmount extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounts Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.AccountsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts Type</em>' attribute.
	 * @see Accounting.AccountsType
	 * @see #setAccountsType(AccountsType)
	 * @see Accounting.AccountingPackage#getAccountedAmount_AccountsType()
	 * @model
	 * @generated
	 */
	AccountsType getAccountsType();

	/**
	 * Sets the value of the '{@link Accounting.AccountedAmount#getAccountsType <em>Accounts Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounts Type</em>' attribute.
	 * @see Accounting.AccountsType
	 * @see #getAccountsType()
	 * @generated
	 */
	void setAccountsType(AccountsType value);

	/**
	 * Returns the value of the '<em><b>Gross Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross Amount</em>' attribute.
	 * @see #setGrossAmount(boolean)
	 * @see Accounting.AccountingPackage#getAccountedAmount_GrossAmount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isGrossAmount();

	/**
	 * Sets the value of the '{@link Accounting.AccountedAmount#isGrossAmount <em>Gross Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Amount</em>' attribute.
	 * @see #isGrossAmount()
	 * @generated
	 */
	void setGrossAmount(boolean value);

	/**
	 * Returns the value of the '<em><b>Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fee</em>' attribute.
	 * @see #setFee(boolean)
	 * @see Accounting.AccountingPackage#getAccountedAmount_Fee()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isFee();

	/**
	 * Sets the value of the '{@link Accounting.AccountedAmount#isFee <em>Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fee</em>' attribute.
	 * @see #isFee()
	 * @generated
	 */
	void setFee(boolean value);

	/**
	 * Returns the value of the '<em><b>Commission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commission</em>' attribute.
	 * @see #setCommission(boolean)
	 * @see Accounting.AccountingPackage#getAccountedAmount_Commission()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCommission();

	/**
	 * Sets the value of the '{@link Accounting.AccountedAmount#isCommission <em>Commission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commission</em>' attribute.
	 * @see #isCommission()
	 * @generated
	 */
	void setCommission(boolean value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' reference.
	 * @see #setCurrency(Currency)
	 * @see Accounting.AccountingPackage#getAccountedAmount_Currency()
	 * @model
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link Accounting.AccountedAmount#getCurrency <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see Accounting.AccountingPackage#getAccountedAmount_Amount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link Accounting.AccountedAmount#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(BigDecimal)
	 * @see Accounting.AccountingPackage#getAccountedAmount_Rate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getRate();

	/**
	 * Sets the value of the '{@link Accounting.AccountedAmount#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(BigDecimal value);

} // AccountedAmount
