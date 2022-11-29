/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carriers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Carriers#getCarriers <em>Carriers</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCarriers()
 * @model
 * @generated
 */
public interface Carriers extends EObject {
	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getCarriers_Carriers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carrier> getCarriers();

} // Carriers
