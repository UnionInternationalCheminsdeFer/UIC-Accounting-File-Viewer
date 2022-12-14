/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Constraint Bundles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FareConstraintBundles#getFareConstraintBundles <em>Fare Constraint Bundles</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFareConstraintBundles()
 * @model
 * @generated
 */
public interface FareConstraintBundles extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Constraint Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.FareConstraintBundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Constraint Bundles</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getFareConstraintBundles_FareConstraintBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<FareConstraintBundle> getFareConstraintBundles();

} // FareConstraintBundles
