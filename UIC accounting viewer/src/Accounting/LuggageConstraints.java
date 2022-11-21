/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luggage Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.LuggageConstraints#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getLuggageConstraints()
 * @model
 * @generated
 */
public interface LuggageConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.LuggageConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getLuggageConstraints_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<LuggageConstraint> getConstraints();

} // LuggageConstraints
