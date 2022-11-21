/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Sales Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AfterSalesRules#getAfterSalesRules <em>After Sales Rules</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAfterSalesRules()
 * @model
 * @generated
 */
public interface AfterSalesRules extends EObject {
	/**
	 * Returns the value of the '<em><b>After Sales Rules</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.AfterSalesRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Rules</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getAfterSalesRules_AfterSalesRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AfterSalesRule> getAfterSalesRules();

} // AfterSalesRules
