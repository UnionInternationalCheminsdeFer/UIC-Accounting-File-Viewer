/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Total Passenger Combination Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.TotalPassengerCombinationConstraints#getTotalPassengerCombinationConstraint <em>Total Passenger Combination Constraint</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getTotalPassengerCombinationConstraints()
 * @model
 * @generated
 */
public interface TotalPassengerCombinationConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Passenger Combination Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.TotalPassengerCombinationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Passenger Combination Constraint</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getTotalPassengerCombinationConstraints_TotalPassengerCombinationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<TotalPassengerCombinationConstraint> getTotalPassengerCombinationConstraint();

} // TotalPassengerCombinationConstraints
