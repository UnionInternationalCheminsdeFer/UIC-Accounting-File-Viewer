/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillment Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FulfillmentConstraints#getFulfillmentConstraints <em>Fulfillment Constraints</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFulfillmentConstraints()
 * @model
 * @generated
 */
public interface FulfillmentConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Fulfillment Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.FulfillmentConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Constraints</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getFulfillmentConstraints_FulfillmentConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<FulfillmentConstraint> getFulfillmentConstraints();

} // FulfillmentConstraints
