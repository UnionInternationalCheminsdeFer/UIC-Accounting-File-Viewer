/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.RegionalConstraints#getRegionalConstraints <em>Regional Constraints</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getRegionalConstraints()
 * @model
 * @generated
 */
public interface RegionalConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Regional Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.RegionalConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Constraints</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getRegionalConstraints_RegionalConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegionalConstraint> getRegionalConstraints();

} // RegionalConstraints
