/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.Carrier;
import Accounting.CarrierConstraint;
import Accounting.DataSource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.CarrierConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.impl.CarrierConstraintImpl#getIncludedCarriers <em>Included Carriers</em>}</li>
 *   <li>{@link Accounting.impl.CarrierConstraintImpl#getExcludedCarriers <em>Excluded Carriers</em>}</li>
 *   <li>{@link Accounting.impl.CarrierConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.impl.CarrierConstraintImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierConstraintImpl extends MinimalEObjectImpl.Container implements CarrierConstraint {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludedCarriers() <em>Included Carriers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> includedCarriers;

	/**
	 * The cached value of the '{@link #getExcludedCarriers() <em>Excluded Carriers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> excludedCarriers;

	/**
	 * The default value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDescription() <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDescription()
	 * @generated
	 * @ordered
	 */
	protected String dataDescription = DATA_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final DataSource DATA_SOURCE_EDEFAULT = DataSource.MANUAL;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.CARRIER_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.CARRIER_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getIncludedCarriers() {
		if (includedCarriers == null) {
			includedCarriers = new EObjectResolvingEList<Carrier>(Carrier.class, this, AccountingPackage.CARRIER_CONSTRAINT__INCLUDED_CARRIERS);
		}
		return includedCarriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getExcludedCarriers() {
		if (excludedCarriers == null) {
			excludedCarriers = new EObjectResolvingEList<Carrier>(Carrier.class, this, AccountingPackage.CARRIER_CONSTRAINT__EXCLUDED_CARRIERS);
		}
		return excludedCarriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataDescription() {
		return dataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDescription(String newDataDescription) {
		String oldDataDescription = dataDescription;
		dataDescription = newDataDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.CARRIER_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource == null ? DATA_SOURCE_EDEFAULT : newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.CARRIER_CONSTRAINT__DATA_SOURCE, oldDataSource, dataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.CARRIER_CONSTRAINT__ID:
				return getId();
			case AccountingPackage.CARRIER_CONSTRAINT__INCLUDED_CARRIERS:
				return getIncludedCarriers();
			case AccountingPackage.CARRIER_CONSTRAINT__EXCLUDED_CARRIERS:
				return getExcludedCarriers();
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_SOURCE:
				return getDataSource();
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
			case AccountingPackage.CARRIER_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__INCLUDED_CARRIERS:
				getIncludedCarriers().clear();
				getIncludedCarriers().addAll((Collection<? extends Carrier>)newValue);
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__EXCLUDED_CARRIERS:
				getExcludedCarriers().clear();
				getExcludedCarriers().addAll((Collection<? extends Carrier>)newValue);
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_SOURCE:
				setDataSource((DataSource)newValue);
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
			case AccountingPackage.CARRIER_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__INCLUDED_CARRIERS:
				getIncludedCarriers().clear();
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__EXCLUDED_CARRIERS:
				getExcludedCarriers().clear();
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_SOURCE:
				setDataSource(DATA_SOURCE_EDEFAULT);
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
			case AccountingPackage.CARRIER_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AccountingPackage.CARRIER_CONSTRAINT__INCLUDED_CARRIERS:
				return includedCarriers != null && !includedCarriers.isEmpty();
			case AccountingPackage.CARRIER_CONSTRAINT__EXCLUDED_CARRIERS:
				return excludedCarriers != null && !excludedCarriers.isEmpty();
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case AccountingPackage.CARRIER_CONSTRAINT__DATA_SOURCE:
				return dataSource != DATA_SOURCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //CarrierConstraintImpl
