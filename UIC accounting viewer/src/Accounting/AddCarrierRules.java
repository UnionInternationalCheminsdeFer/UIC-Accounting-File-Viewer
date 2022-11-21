/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Carrier Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AddCarrierRules#getAddCarrierRule <em>Add Carrier Rule</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAddCarrierRules()
 * @model
 * @generated
 */
public interface AddCarrierRules extends EObject {
	/**
	 * Returns the value of the '<em><b>Add Carrier Rule</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.AddCarrierRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Carrier Rule</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getAddCarrierRules_AddCarrierRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddCarrierRule> getAddCarrierRule();

} // AddCarrierRules
