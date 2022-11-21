/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAT Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.VATDetail#getAmount <em>Amount</em>}</li>
 *   <li>{@link Accounting.VATDetail#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link Accounting.VATDetail#getCountry <em>Country</em>}</li>
 *   <li>{@link Accounting.VATDetail#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link Accounting.VATDetail#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getVATDetail()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VALID_AMOUNT COUNTRY_MUST PERCENTAGE_VALUES'"
 * @generated
 */
public interface VATDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see Accounting.AccountingPackage#getVATDetail_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link Accounting.VATDetail#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(float)
	 * @see Accounting.AccountingPackage#getVATDetail_Percentage()
	 * @model
	 * @generated
	 */
	float getPercentage();

	/**
	 * Sets the value of the '{@link Accounting.VATDetail#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(float value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see Accounting.AccountingPackage#getVATDetail_Country()
	 * @model required="true"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link Accounting.VATDetail#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Id</em>' attribute.
	 * @see #setTaxId(String)
	 * @see Accounting.AccountingPackage#getVATDetail_TaxId()
	 * @model
	 * @generated
	 */
	String getTaxId();

	/**
	 * Sets the value of the '{@link Accounting.VATDetail#getTaxId <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Id</em>' attribute.
	 * @see #getTaxId()
	 * @generated
	 */
	void setTaxId(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TaxScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see Accounting.TaxScope
	 * @see #setScope(TaxScope)
	 * @see Accounting.AccountingPackage#getVATDetail_Scope()
	 * @model
	 * @generated
	 */
	TaxScope getScope();

	/**
	 * Sets the value of the '{@link Accounting.VATDetail#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see Accounting.TaxScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(TaxScope value);

} // VATDetail
