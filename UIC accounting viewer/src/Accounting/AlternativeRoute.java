/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AlternativeRoute#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAlternativeRoute()
 * @model
 * @generated
 */
public interface AlternativeRoute extends EObject {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ViaStation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getAlternativeRoute_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViaStation> getStations();

} // AlternativeRoute
