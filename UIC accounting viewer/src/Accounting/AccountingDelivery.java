/**
 */
package Accounting;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountingDelivery#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.AccountingDelivery#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link Accounting.AccountingDelivery#getInvoicingParty <em>Invoicing Party</em>}</li>
 *   <li>{@link Accounting.AccountingDelivery#getInvoiceRecipient <em>Invoice Recipient</em>}</li>
 *   <li>{@link Accounting.AccountingDelivery#getStartStatementPeriod <em>Start Statement Period</em>}</li>
 *   <li>{@link Accounting.AccountingDelivery#getEndStatementPeriod <em>End Statement Period</em>}</li>
 *   <li>{@link Accounting.AccountingDelivery#getPaymentType <em>Payment Type</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountingDelivery()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MUST_INCLUDE_PARTIES MUST_INCLUDE_TIME END_BEFORE_START ID_MUST'"
 * @generated
 */
public interface AccountingDelivery extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getAccountingDelivery_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.AccountingDelivery#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see Accounting.AccountingPackage#getAccountingDelivery_CreationDate()
	 * @model dataType="Accounting.DateAsDateTime" required="true"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link Accounting.AccountingDelivery#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Invoicing Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoicing Party</em>' reference.
	 * @see #setInvoicingParty(Carrier)
	 * @see Accounting.AccountingPackage#getAccountingDelivery_InvoicingParty()
	 * @model
	 * @generated
	 */
	Carrier getInvoicingParty();

	/**
	 * Sets the value of the '{@link Accounting.AccountingDelivery#getInvoicingParty <em>Invoicing Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoicing Party</em>' reference.
	 * @see #getInvoicingParty()
	 * @generated
	 */
	void setInvoicingParty(Carrier value);

	/**
	 * Returns the value of the '<em><b>Invoice Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Recipient</em>' reference.
	 * @see #setInvoiceRecipient(Carrier)
	 * @see Accounting.AccountingPackage#getAccountingDelivery_InvoiceRecipient()
	 * @model
	 * @generated
	 */
	Carrier getInvoiceRecipient();

	/**
	 * Sets the value of the '{@link Accounting.AccountingDelivery#getInvoiceRecipient <em>Invoice Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Recipient</em>' reference.
	 * @see #getInvoiceRecipient()
	 * @generated
	 */
	void setInvoiceRecipient(Carrier value);

	/**
	 * Returns the value of the '<em><b>Start Statement Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Statement Period</em>' attribute.
	 * @see #setStartStatementPeriod(Date)
	 * @see Accounting.AccountingPackage#getAccountingDelivery_StartStatementPeriod()
	 * @model dataType="Accounting.DateAsDateTime"
	 * @generated
	 */
	Date getStartStatementPeriod();

	/**
	 * Sets the value of the '{@link Accounting.AccountingDelivery#getStartStatementPeriod <em>Start Statement Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Statement Period</em>' attribute.
	 * @see #getStartStatementPeriod()
	 * @generated
	 */
	void setStartStatementPeriod(Date value);

	/**
	 * Returns the value of the '<em><b>End Statement Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Statement Period</em>' attribute.
	 * @see #setEndStatementPeriod(Date)
	 * @see Accounting.AccountingPackage#getAccountingDelivery_EndStatementPeriod()
	 * @model dataType="Accounting.DateAsDateTime"
	 * @generated
	 */
	Date getEndStatementPeriod();

	/**
	 * Sets the value of the '{@link Accounting.AccountingDelivery#getEndStatementPeriod <em>End Statement Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Statement Period</em>' attribute.
	 * @see #getEndStatementPeriod()
	 * @generated
	 */
	void setEndStatementPeriod(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.PaymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type</em>' attribute.
	 * @see Accounting.PaymentType
	 * @see #setPaymentType(PaymentType)
	 * @see Accounting.AccountingPackage#getAccountingDelivery_PaymentType()
	 * @model required="true"
	 * @generated
	 */
	PaymentType getPaymentType();

	/**
	 * Sets the value of the '{@link Accounting.AccountingDelivery#getPaymentType <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type</em>' attribute.
	 * @see Accounting.PaymentType
	 * @see #getPaymentType()
	 * @generated
	 */
	void setPaymentType(PaymentType value);

} // AccountingDelivery
