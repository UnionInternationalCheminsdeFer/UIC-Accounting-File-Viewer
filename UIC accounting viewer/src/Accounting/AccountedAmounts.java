/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounted Amounts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountedAmounts#getAccountedAmounts <em>Accounted Amounts</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountedAmounts()
 * @model
 * @generated
 */
public interface AccountedAmounts extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounted Amounts</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.AccountedAmount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounted Amounts</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getAccountedAmounts_AccountedAmounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccountedAmount> getAccountedAmounts();

} // AccountedAmounts
