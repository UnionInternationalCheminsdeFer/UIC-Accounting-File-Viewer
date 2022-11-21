/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ServiceConstraints#getServiceConstraints <em>Service Constraints</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getServiceConstraints()
 * @model
 * @generated
 */
public interface ServiceConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ServiceConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraints</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getServiceConstraints_ServiceConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceConstraint> getServiceConstraints();

} // ServiceConstraints
