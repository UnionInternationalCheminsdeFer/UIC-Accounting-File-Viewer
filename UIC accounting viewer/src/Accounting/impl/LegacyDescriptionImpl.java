/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.ClassicClassType;
import Accounting.LegacyDescription;
import Accounting.TravelerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.LegacyDescriptionImpl#getPassengerType <em>Passenger Type</em>}</li>
 *   <li>{@link Accounting.impl.LegacyDescriptionImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link Accounting.impl.LegacyDescriptionImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link Accounting.impl.LegacyDescriptionImpl#getTariff <em>Tariff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyDescriptionImpl extends MinimalEObjectImpl.Container implements LegacyDescription {
	/**
	 * The default value of the '{@link #getPassengerType() <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerType()
	 * @generated
	 * @ordered
	 */
	protected static final TravelerType PASSENGER_TYPE_EDEFAULT = TravelerType.ADULT;

	/**
	 * The cached value of the '{@link #getPassengerType() <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerType()
	 * @generated
	 * @ordered
	 */
	protected TravelerType passengerType = PASSENGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final ClassicClassType CLASS_CODE_EDEFAULT = ClassicClassType.FIRST;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected ClassicClassType classCode = CLASS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeries() <em>Series</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected static final int SERIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected int series = SERIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTariff() <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariff()
	 * @generated
	 * @ordered
	 */
	protected static final int TARIFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTariff() <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariff()
	 * @generated
	 * @ordered
	 */
	protected int tariff = TARIFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.LEGACY_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelerType getPassengerType() {
		return passengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerType(TravelerType newPassengerType) {
		TravelerType oldPassengerType = passengerType;
		passengerType = newPassengerType == null ? PASSENGER_TYPE_EDEFAULT : newPassengerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.LEGACY_DESCRIPTION__PASSENGER_TYPE, oldPassengerType, passengerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicClassType getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(ClassicClassType newClassCode) {
		ClassicClassType oldClassCode = classCode;
		classCode = newClassCode == null ? CLASS_CODE_EDEFAULT : newClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.LEGACY_DESCRIPTION__CLASS_CODE, oldClassCode, classCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(int newSeries) {
		int oldSeries = series;
		series = newSeries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.LEGACY_DESCRIPTION__SERIES, oldSeries, series));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTariff() {
		return tariff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTariff(int newTariff) {
		int oldTariff = tariff;
		tariff = newTariff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.LEGACY_DESCRIPTION__TARIFF, oldTariff, tariff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.LEGACY_DESCRIPTION__PASSENGER_TYPE:
				return getPassengerType();
			case AccountingPackage.LEGACY_DESCRIPTION__CLASS_CODE:
				return getClassCode();
			case AccountingPackage.LEGACY_DESCRIPTION__SERIES:
				return getSeries();
			case AccountingPackage.LEGACY_DESCRIPTION__TARIFF:
				return getTariff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.LEGACY_DESCRIPTION__PASSENGER_TYPE:
				setPassengerType((TravelerType)newValue);
				return;
			case AccountingPackage.LEGACY_DESCRIPTION__CLASS_CODE:
				setClassCode((ClassicClassType)newValue);
				return;
			case AccountingPackage.LEGACY_DESCRIPTION__SERIES:
				setSeries((Integer)newValue);
				return;
			case AccountingPackage.LEGACY_DESCRIPTION__TARIFF:
				setTariff((Integer)newValue);
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
			case AccountingPackage.LEGACY_DESCRIPTION__PASSENGER_TYPE:
				setPassengerType(PASSENGER_TYPE_EDEFAULT);
				return;
			case AccountingPackage.LEGACY_DESCRIPTION__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
				return;
			case AccountingPackage.LEGACY_DESCRIPTION__SERIES:
				setSeries(SERIES_EDEFAULT);
				return;
			case AccountingPackage.LEGACY_DESCRIPTION__TARIFF:
				setTariff(TARIFF_EDEFAULT);
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
			case AccountingPackage.LEGACY_DESCRIPTION__PASSENGER_TYPE:
				return passengerType != PASSENGER_TYPE_EDEFAULT;
			case AccountingPackage.LEGACY_DESCRIPTION__CLASS_CODE:
				return classCode != CLASS_CODE_EDEFAULT;
			case AccountingPackage.LEGACY_DESCRIPTION__SERIES:
				return series != SERIES_EDEFAULT;
			case AccountingPackage.LEGACY_DESCRIPTION__TARIFF:
				return tariff != TARIFF_EDEFAULT;
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
		result.append(" (passengerType: ");
		result.append(passengerType);
		result.append(", classCode: ");
		result.append(classCode);
		result.append(", series: ");
		result.append(series);
		result.append(", tariff: ");
		result.append(tariff);
		result.append(')');
		return result.toString();
	}

} //LegacyDescriptionImpl
