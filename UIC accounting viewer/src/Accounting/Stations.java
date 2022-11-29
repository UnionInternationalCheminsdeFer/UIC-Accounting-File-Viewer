/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Stations#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getStations()
 * @model
 * @generated
 */
public interface Stations extends EObject {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getStations_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

} // Stations
