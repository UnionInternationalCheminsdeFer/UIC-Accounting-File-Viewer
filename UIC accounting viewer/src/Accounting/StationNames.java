/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.StationNames#getStationName <em>Station Name</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getStationNames()
 * @model
 * @generated
 */
public interface StationNames extends EObject {
	/**
	 * Returns the value of the '<em><b>Station Name</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Name</em>' reference list.
	 * @see Accounting.AccountingPackage#getStationNames_StationName()
	 * @model
	 * @generated
	 */
	EList<Station> getStationName();

} // StationNames
