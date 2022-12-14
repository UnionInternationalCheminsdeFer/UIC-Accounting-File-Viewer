/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.CharacterSet;
import Accounting.Country;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.CountryImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Accounting.impl.CountryImpl#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.impl.CountryImpl#getISOcode <em>IS Ocode</em>}</li>
 *   <li>{@link Accounting.impl.CountryImpl#getDefaultCharacterSet <em>Default Character Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends MinimalEObjectImpl.Container implements Country {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getISOcode() <em>IS Ocode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISOcode()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_OCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getISOcode() <em>IS Ocode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISOcode()
	 * @generated
	 * @ordered
	 */
	protected String isOcode = IS_OCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCharacterSet() <em>Default Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected static final CharacterSet DEFAULT_CHARACTER_SET_EDEFAULT = CharacterSet.COUNTRY_DEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultCharacterSet() <em>Default Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCharacterSet()
	 * @generated
	 * @ordered
	 */
	protected CharacterSet defaultCharacterSet = DEFAULT_CHARACTER_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.COUNTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.COUNTRY__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.COUNTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getISOcode() {
		return isOcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISOcode(String newISOcode) {
		String oldISOcode = isOcode;
		isOcode = newISOcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.COUNTRY__IS_OCODE, oldISOcode, isOcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSet getDefaultCharacterSet() {
		return defaultCharacterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCharacterSet(CharacterSet newDefaultCharacterSet) {
		CharacterSet oldDefaultCharacterSet = defaultCharacterSet;
		defaultCharacterSet = newDefaultCharacterSet == null ? DEFAULT_CHARACTER_SET_EDEFAULT : newDefaultCharacterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.COUNTRY__DEFAULT_CHARACTER_SET, oldDefaultCharacterSet, defaultCharacterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.COUNTRY__CODE:
				return getCode();
			case AccountingPackage.COUNTRY__NAME:
				return getName();
			case AccountingPackage.COUNTRY__IS_OCODE:
				return getISOcode();
			case AccountingPackage.COUNTRY__DEFAULT_CHARACTER_SET:
				return getDefaultCharacterSet();
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
			case AccountingPackage.COUNTRY__CODE:
				setCode((Integer)newValue);
				return;
			case AccountingPackage.COUNTRY__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.COUNTRY__IS_OCODE:
				setISOcode((String)newValue);
				return;
			case AccountingPackage.COUNTRY__DEFAULT_CHARACTER_SET:
				setDefaultCharacterSet((CharacterSet)newValue);
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
			case AccountingPackage.COUNTRY__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case AccountingPackage.COUNTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AccountingPackage.COUNTRY__IS_OCODE:
				setISOcode(IS_OCODE_EDEFAULT);
				return;
			case AccountingPackage.COUNTRY__DEFAULT_CHARACTER_SET:
				setDefaultCharacterSet(DEFAULT_CHARACTER_SET_EDEFAULT);
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
			case AccountingPackage.COUNTRY__CODE:
				return code != CODE_EDEFAULT;
			case AccountingPackage.COUNTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccountingPackage.COUNTRY__IS_OCODE:
				return IS_OCODE_EDEFAULT == null ? isOcode != null : !IS_OCODE_EDEFAULT.equals(isOcode);
			case AccountingPackage.COUNTRY__DEFAULT_CHARACTER_SET:
				return defaultCharacterSet != DEFAULT_CHARACTER_SET_EDEFAULT;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", ISOcode: ");
		result.append(isOcode);
		result.append(", defaultCharacterSet: ");
		result.append(defaultCharacterSet);
		result.append(')');
		return result.toString();
	}

} //CountryImpl
