/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.StationResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getStationResourceLocations()
 * @model
 * @generated
 */
public interface StationResourceLocations extends EObject {
	/**
	 * Returns the value of the '<em><b>Station Resource Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.StationResourceLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Resource Locations</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getStationResourceLocations_StationResourceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<StationResourceLocation> getStationResourceLocations();

} // StationResourceLocations
