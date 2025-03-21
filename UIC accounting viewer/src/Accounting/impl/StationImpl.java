/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.Country;
import Accounting.Station;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.StationImpl#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getTimetableName <em>Timetable Name</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#isBorderStation <em>Border Station</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getNameCaseUTF8 <em>Name Case UTF8</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getNameCaseASCII <em>Name Case ASCII</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getShortNameCaseASCII <em>Short Name Case ASCII</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getShortNameCaseUTF8 <em>Short Name Case UTF8</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}</li>
 *   <li>{@link Accounting.impl.StationImpl#getStationCode <em>Station Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationImpl extends MinimalEObjectImpl.Container implements Station {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected float longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected float latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimetableName() <em>Timetable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMETABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimetableName() <em>Timetable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableName()
	 * @generated
	 * @ordered
	 */
	protected String timetableName = TIMETABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBorderStation() <em>Border Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderStation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDER_STATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBorderStation() <em>Border Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderStation()
	 * @generated
	 * @ordered
	 */
	protected boolean borderStation = BORDER_STATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameCaseUTF8() <em>Name Case UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCaseUTF8()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CASE_UTF8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameCaseUTF8() <em>Name Case UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCaseUTF8()
	 * @generated
	 * @ordered
	 */
	protected String nameCaseUTF8 = NAME_CASE_UTF8_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameCaseASCII() <em>Name Case ASCII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCaseASCII()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CASE_ASCII_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameCaseASCII() <em>Name Case ASCII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCaseASCII()
	 * @generated
	 * @ordered
	 */
	protected String nameCaseASCII = NAME_CASE_ASCII_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortNameCaseASCII() <em>Short Name Case ASCII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNameCaseASCII()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_CASE_ASCII_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortNameCaseASCII() <em>Short Name Case ASCII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNameCaseASCII()
	 * @generated
	 * @ordered
	 */
	protected String shortNameCaseASCII = SHORT_NAME_CASE_ASCII_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortNameCaseUTF8() <em>Short Name Case UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNameCaseUTF8()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_CASE_UTF8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortNameCaseUTF8() <em>Short Name Case UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortNameCaseUTF8()
	 * @generated
	 * @ordered
	 */
	protected String shortNameCaseUTF8 = SHORT_NAME_CASE_UTF8_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegacyBorderPointCode() <em>Legacy Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGACY_BORDER_POINT_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegacyBorderPointCode() <em>Legacy Border Point Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyBorderPointCode()
	 * @generated
	 * @ordered
	 */
	protected int legacyBorderPointCode = LEGACY_BORDER_POINT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStationCode() <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationCode()
	 * @generated
	 * @ordered
	 */
	protected static final long STATION_CODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStationCode() <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationCode()
	 * @generated
	 * @ordered
	 */
	protected long stationCode = STATION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.STATION__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(float newLongitude) {
		float oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(float newLatitude) {
		float oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimetableName() {
		return timetableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimetableName(String newTimetableName) {
		String oldTimetableName = timetableName;
		timetableName = newTimetableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__TIMETABLE_NAME, oldTimetableName, timetableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorderStation() {
		return borderStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderStation(boolean newBorderStation) {
		boolean oldBorderStation = borderStation;
		borderStation = newBorderStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__BORDER_STATION, oldBorderStation, borderStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameCaseUTF8() {
		return nameCaseUTF8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameCaseUTF8(String newNameCaseUTF8) {
		String oldNameCaseUTF8 = nameCaseUTF8;
		nameCaseUTF8 = newNameCaseUTF8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__NAME_CASE_UTF8, oldNameCaseUTF8, nameCaseUTF8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameCaseASCII() {
		return nameCaseASCII;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameCaseASCII(String newNameCaseASCII) {
		String oldNameCaseASCII = nameCaseASCII;
		nameCaseASCII = newNameCaseASCII;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__NAME_CASE_ASCII, oldNameCaseASCII, nameCaseASCII));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortNameCaseASCII() {
		return shortNameCaseASCII;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortNameCaseASCII(String newShortNameCaseASCII) {
		String oldShortNameCaseASCII = shortNameCaseASCII;
		shortNameCaseASCII = newShortNameCaseASCII;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__SHORT_NAME_CASE_ASCII, oldShortNameCaseASCII, shortNameCaseASCII));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortNameCaseUTF8() {
		return shortNameCaseUTF8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortNameCaseUTF8(String newShortNameCaseUTF8) {
		String oldShortNameCaseUTF8 = shortNameCaseUTF8;
		shortNameCaseUTF8 = newShortNameCaseUTF8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__SHORT_NAME_CASE_UTF8, oldShortNameCaseUTF8, shortNameCaseUTF8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegacyBorderPointCode() {
		return legacyBorderPointCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyBorderPointCode(int newLegacyBorderPointCode) {
		int oldLegacyBorderPointCode = legacyBorderPointCode;
		legacyBorderPointCode = newLegacyBorderPointCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__LEGACY_BORDER_POINT_CODE, oldLegacyBorderPointCode, legacyBorderPointCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStationCode() {
		return stationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationCode(long newStationCode) {
		long oldStationCode = stationCode;
		stationCode = newStationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.STATION__STATION_CODE, oldStationCode, stationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.STATION__NAME:
				return getName();
			case AccountingPackage.STATION__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case AccountingPackage.STATION__CODE:
				return getCode();
			case AccountingPackage.STATION__LONGITUDE:
				return getLongitude();
			case AccountingPackage.STATION__LATITUDE:
				return getLatitude();
			case AccountingPackage.STATION__TIMETABLE_NAME:
				return getTimetableName();
			case AccountingPackage.STATION__BORDER_STATION:
				return isBorderStation();
			case AccountingPackage.STATION__NAME_CASE_UTF8:
				return getNameCaseUTF8();
			case AccountingPackage.STATION__NAME_CASE_ASCII:
				return getNameCaseASCII();
			case AccountingPackage.STATION__SHORT_NAME_CASE_ASCII:
				return getShortNameCaseASCII();
			case AccountingPackage.STATION__SHORT_NAME_CASE_UTF8:
				return getShortNameCaseUTF8();
			case AccountingPackage.STATION__LEGACY_BORDER_POINT_CODE:
				return getLegacyBorderPointCode();
			case AccountingPackage.STATION__STATION_CODE:
				return getStationCode();
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
			case AccountingPackage.STATION__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.STATION__COUNTRY:
				setCountry((Country)newValue);
				return;
			case AccountingPackage.STATION__CODE:
				setCode((String)newValue);
				return;
			case AccountingPackage.STATION__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case AccountingPackage.STATION__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case AccountingPackage.STATION__TIMETABLE_NAME:
				setTimetableName((String)newValue);
				return;
			case AccountingPackage.STATION__BORDER_STATION:
				setBorderStation((Boolean)newValue);
				return;
			case AccountingPackage.STATION__NAME_CASE_UTF8:
				setNameCaseUTF8((String)newValue);
				return;
			case AccountingPackage.STATION__NAME_CASE_ASCII:
				setNameCaseASCII((String)newValue);
				return;
			case AccountingPackage.STATION__SHORT_NAME_CASE_ASCII:
				setShortNameCaseASCII((String)newValue);
				return;
			case AccountingPackage.STATION__SHORT_NAME_CASE_UTF8:
				setShortNameCaseUTF8((String)newValue);
				return;
			case AccountingPackage.STATION__LEGACY_BORDER_POINT_CODE:
				setLegacyBorderPointCode((Integer)newValue);
				return;
			case AccountingPackage.STATION__STATION_CODE:
				setStationCode((Long)newValue);
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
			case AccountingPackage.STATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AccountingPackage.STATION__COUNTRY:
				setCountry((Country)null);
				return;
			case AccountingPackage.STATION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case AccountingPackage.STATION__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case AccountingPackage.STATION__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case AccountingPackage.STATION__TIMETABLE_NAME:
				setTimetableName(TIMETABLE_NAME_EDEFAULT);
				return;
			case AccountingPackage.STATION__BORDER_STATION:
				setBorderStation(BORDER_STATION_EDEFAULT);
				return;
			case AccountingPackage.STATION__NAME_CASE_UTF8:
				setNameCaseUTF8(NAME_CASE_UTF8_EDEFAULT);
				return;
			case AccountingPackage.STATION__NAME_CASE_ASCII:
				setNameCaseASCII(NAME_CASE_ASCII_EDEFAULT);
				return;
			case AccountingPackage.STATION__SHORT_NAME_CASE_ASCII:
				setShortNameCaseASCII(SHORT_NAME_CASE_ASCII_EDEFAULT);
				return;
			case AccountingPackage.STATION__SHORT_NAME_CASE_UTF8:
				setShortNameCaseUTF8(SHORT_NAME_CASE_UTF8_EDEFAULT);
				return;
			case AccountingPackage.STATION__LEGACY_BORDER_POINT_CODE:
				setLegacyBorderPointCode(LEGACY_BORDER_POINT_CODE_EDEFAULT);
				return;
			case AccountingPackage.STATION__STATION_CODE:
				setStationCode(STATION_CODE_EDEFAULT);
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
			case AccountingPackage.STATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccountingPackage.STATION__COUNTRY:
				return country != null;
			case AccountingPackage.STATION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case AccountingPackage.STATION__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case AccountingPackage.STATION__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case AccountingPackage.STATION__TIMETABLE_NAME:
				return TIMETABLE_NAME_EDEFAULT == null ? timetableName != null : !TIMETABLE_NAME_EDEFAULT.equals(timetableName);
			case AccountingPackage.STATION__BORDER_STATION:
				return borderStation != BORDER_STATION_EDEFAULT;
			case AccountingPackage.STATION__NAME_CASE_UTF8:
				return NAME_CASE_UTF8_EDEFAULT == null ? nameCaseUTF8 != null : !NAME_CASE_UTF8_EDEFAULT.equals(nameCaseUTF8);
			case AccountingPackage.STATION__NAME_CASE_ASCII:
				return NAME_CASE_ASCII_EDEFAULT == null ? nameCaseASCII != null : !NAME_CASE_ASCII_EDEFAULT.equals(nameCaseASCII);
			case AccountingPackage.STATION__SHORT_NAME_CASE_ASCII:
				return SHORT_NAME_CASE_ASCII_EDEFAULT == null ? shortNameCaseASCII != null : !SHORT_NAME_CASE_ASCII_EDEFAULT.equals(shortNameCaseASCII);
			case AccountingPackage.STATION__SHORT_NAME_CASE_UTF8:
				return SHORT_NAME_CASE_UTF8_EDEFAULT == null ? shortNameCaseUTF8 != null : !SHORT_NAME_CASE_UTF8_EDEFAULT.equals(shortNameCaseUTF8);
			case AccountingPackage.STATION__LEGACY_BORDER_POINT_CODE:
				return legacyBorderPointCode != LEGACY_BORDER_POINT_CODE_EDEFAULT;
			case AccountingPackage.STATION__STATION_CODE:
				return stationCode != STATION_CODE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", timetableName: ");
		result.append(timetableName);
		result.append(", borderStation: ");
		result.append(borderStation);
		result.append(", nameCaseUTF8: ");
		result.append(nameCaseUTF8);
		result.append(", nameCaseASCII: ");
		result.append(nameCaseASCII);
		result.append(", shortNameCaseASCII: ");
		result.append(shortNameCaseASCII);
		result.append(", shortNameCaseUTF8: ");
		result.append(shortNameCaseUTF8);
		result.append(", legacyBorderPointCode: ");
		result.append(legacyBorderPointCode);
		result.append(", stationCode: ");
		result.append(stationCode);
		result.append(')');
		return result.toString();
	}

} //StationImpl
