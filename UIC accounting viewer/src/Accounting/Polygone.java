/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Polygone#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getPolygone()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_THREE_EDGES'"
 * @generated
 */
public interface Polygone extends EObject {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getPolygone_Edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdge();

} // Polygone
