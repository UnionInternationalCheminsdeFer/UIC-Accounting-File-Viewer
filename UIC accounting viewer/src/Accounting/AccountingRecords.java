/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Records</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountingRecords#getAccountingRecords <em>Accounting Records</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountingRecords()
 * @model
 * @generated
 */
public interface AccountingRecords extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounting Records</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.AccountingRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Records</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getAccountingRecords_AccountingRecords()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccountingRecord> getAccountingRecords();

} // AccountingRecords
