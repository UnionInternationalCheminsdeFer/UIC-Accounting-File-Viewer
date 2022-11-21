/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.ConnectionPoint;
import Accounting.OnlineResource;
import Accounting.Station;
import Accounting.StationResourceLocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station Resource Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.StationResourceLocationImpl#getOnlineResources <em>Online Resources</em>}</li>
 *   <li>{@link Accounting.impl.StationResourceLocationImpl#getStations <em>Stations</em>}</li>
 *   <li>{@link Accounting.impl.StationResourceLocationImpl#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationResourceLocationImpl extends MinimalEObjectImpl.Container implements StationResourceLocation {
	/**
	 * The cached value of the '{@link #getOnlineResources() <em>Online Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineResources()
	 * @generated
	 * @ordered
	 */
	protected EList<OnlineResource> onlineResources;

	/**
	 * The cached value of the '{@link #getStations() <em>Stations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStations()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> stations;

	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPoint> connectionPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationResourceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.STATION_RESOURCE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnlineResource> getOnlineResources() {
		if (onlineResources == null) {
			onlineResources = new EObjectContainmentEList<OnlineResource>(OnlineResource.class, this, AccountingPackage.STATION_RESOURCE_LOCATION__ONLINE_RESOURCES);
		}
		return onlineResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getStations() {
		if (stations == null) {
			stations = new EObjectResolvingEList<Station>(Station.class, this, AccountingPackage.STATION_RESOURCE_LOCATION__STATIONS);
		}
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPoint> getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectResolvingEList<ConnectionPoint>(ConnectionPoint.class, this, AccountingPackage.STATION_RESOURCE_LOCATION__CONNECTION_POINTS);
		}
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.STATION_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return ((InternalEList<?>)getOnlineResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.STATION_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return getOnlineResources();
			case AccountingPackage.STATION_RESOURCE_LOCATION__STATIONS:
				return getStations();
			case AccountingPackage.STATION_RESOURCE_LOCATION__CONNECTION_POINTS:
				return getConnectionPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.STATION_RESOURCE_LOCATION__ONLINE_RESOURCES:
				getOnlineResources().clear();
				getOnlineResources().addAll((Collection<? extends OnlineResource>)newValue);
				return;
			case AccountingPackage.STATION_RESOURCE_LOCATION__STATIONS:
				getStations().clear();
				getStations().addAll((Collection<? extends Station>)newValue);
				return;
			case AccountingPackage.STATION_RESOURCE_LOCATION__CONNECTION_POINTS:
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection<? extends ConnectionPoint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccountingPackage.STATION_RESOURCE_LOCATION__ONLINE_RESOURCES:
				getOnlineResources().clear();
				return;
			case AccountingPackage.STATION_RESOURCE_LOCATION__STATIONS:
				getStations().clear();
				return;
			case AccountingPackage.STATION_RESOURCE_LOCATION__CONNECTION_POINTS:
				getConnectionPoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccountingPackage.STATION_RESOURCE_LOCATION__ONLINE_RESOURCES:
				return onlineResources != null && !onlineResources.isEmpty();
			case AccountingPackage.STATION_RESOURCE_LOCATION__STATIONS:
				return stations != null && !stations.isEmpty();
			case AccountingPackage.STATION_RESOURCE_LOCATION__CONNECTION_POINTS:
				return connectionPoints != null && !connectionPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StationResourceLocationImpl
