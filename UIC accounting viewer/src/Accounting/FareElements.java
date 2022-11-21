/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FareElements#getFareElements <em>Fare Elements</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFareElements()
 * @model
 * @generated
 */
public interface FareElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.FareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Elements</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getFareElements_FareElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FareElement> getFareElements();

} // FareElements
