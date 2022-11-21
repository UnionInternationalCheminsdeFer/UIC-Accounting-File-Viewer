/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.CarrierConstraints#getCarrierConstraints <em>Carrier Constraints</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCarrierConstraints()
 * @model
 * @generated
 */
public interface CarrierConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.CarrierConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraints</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getCarrierConstraints_CarrierConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierConstraint> getCarrierConstraints();

} // CarrierConstraints
