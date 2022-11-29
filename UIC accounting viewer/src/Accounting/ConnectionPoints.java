/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ConnectionPoints#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getConnectionPoints()
 * @model
 * @generated
 */
public interface ConnectionPoints extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ConnectionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getConnectionPoints_ConnectionPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPoint> getConnectionPoints();

} // ConnectionPoints
