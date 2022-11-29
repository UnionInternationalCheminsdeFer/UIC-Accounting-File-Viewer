/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.CurrencyPrice#getCurrency <em>Currency</em>}</li>
 *   <li>{@link Accounting.CurrencyPrice#getAmount <em>Amount</em>}</li>
 *   <li>{@link Accounting.CurrencyPrice#getVATdetails <em>VA Tdetails</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCurrencyPrice()
 * @model
 * @generated
 */
public interface CurrencyPrice extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' reference.
	 * @see #setCurrency(Currency)
	 * @see Accounting.AccountingPackage#getCurrencyPrice_Currency()
	 * @model
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link Accounting.CurrencyPrice#getCurrency <em>Currency</em>}' reference.
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
	 * @see #setAmount(float)
	 * @see Accounting.AccountingPackage#getCurrencyPrice_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link Accounting.CurrencyPrice#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>VA Tdetails</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.VATDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA Tdetails</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getCurrencyPrice_VATdetails()
	 * @model containment="true"
	 * @generated
	 */
	EList<VATDetail> getVATdetails();

} // CurrencyPrice
