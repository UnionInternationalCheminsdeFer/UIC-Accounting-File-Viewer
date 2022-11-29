/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Currencies#getCurrencies <em>Currencies</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCurrencies()
 * @model
 * @generated
 */
public interface Currencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Currencies</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currencies</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getCurrencies_Currencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Currency> getCurrencies();

} // Currencies
