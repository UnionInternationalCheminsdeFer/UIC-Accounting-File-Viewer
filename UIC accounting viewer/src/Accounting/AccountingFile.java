/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountingFile#getAccountingDelivery <em>Accounting Delivery</em>}</li>
 *   <li>{@link Accounting.AccountingFile#getAccountingRecords <em>Accounting Records</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountingFile()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MUST_INCLUDE_DELIVERY MUST_INCLUDE_ACCOUNTING_RECORD'"
 * @generated
 */
public interface AccountingFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounting Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Delivery</em>' containment reference.
	 * @see #setAccountingDelivery(AccountingDelivery)
	 * @see Accounting.AccountingPackage#getAccountingFile_AccountingDelivery()
	 * @model containment="true"
	 * @generated
	 */
	AccountingDelivery getAccountingDelivery();

	/**
	 * Sets the value of the '{@link Accounting.AccountingFile#getAccountingDelivery <em>Accounting Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Delivery</em>' containment reference.
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	void setAccountingDelivery(AccountingDelivery value);

	/**
	 * Returns the value of the '<em><b>Accounting Records</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Records</em>' containment reference.
	 * @see #setAccountingRecords(AccountingRecords)
	 * @see Accounting.AccountingPackage#getAccountingFile_AccountingRecords()
	 * @model containment="true"
	 * @generated
	 */
	AccountingRecords getAccountingRecords();

	/**
	 * Sets the value of the '{@link Accounting.AccountingFile#getAccountingRecords <em>Accounting Records</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Records</em>' containment reference.
	 * @see #getAccountingRecords()
	 * @generated
	 */
	void setAccountingRecords(AccountingRecords value);

} // AccountingFile
