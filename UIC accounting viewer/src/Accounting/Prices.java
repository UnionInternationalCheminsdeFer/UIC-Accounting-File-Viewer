/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Prices#getPrices <em>Prices</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getPrices()
 * @model
 * @generated
 */
public interface Prices extends EObject {
	/**
	 * Returns the value of the '<em><b>Prices</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Price}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prices</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getPrices_Prices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Price> getPrices();

} // Prices
