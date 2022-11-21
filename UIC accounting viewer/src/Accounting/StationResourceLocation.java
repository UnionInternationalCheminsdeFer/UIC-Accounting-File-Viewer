/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Resource Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.StationResourceLocation#getOnlineResources <em>Online Resources</em>}</li>
 *   <li>{@link Accounting.StationResourceLocation#getStations <em>Stations</em>}</li>
 *   <li>{@link Accounting.StationResourceLocation#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getStationResourceLocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_ONLINE_RESOURCE AT_LEAST_ONE_STATION_OR_CONNECTION_POINT'"
 * @generated
 */
public interface StationResourceLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Online Resources</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.OnlineResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Resources</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getStationResourceLocation_OnlineResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnlineResource> getOnlineResources();

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see Accounting.AccountingPackage#getStationResourceLocation_Stations()
	 * @model
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' reference list.
	 * The list contents are of type {@link Accounting.ConnectionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' reference list.
	 * @see Accounting.AccountingPackage#getStationResourceLocation_ConnectionPoints()
	 * @model
	 * @generated
	 */
	EList<ConnectionPoint> getConnectionPoints();

} // StationResourceLocation
