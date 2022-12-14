/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.ServiceBrand;
import Accounting.TransportMode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Brand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.ServiceBrandImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Accounting.impl.ServiceBrandImpl#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.impl.ServiceBrandImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link Accounting.impl.ServiceBrandImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Accounting.impl.ServiceBrandImpl#getTransportMode <em>Transport Mode</em>}</li>
 *   <li>{@link Accounting.impl.ServiceBrandImpl#getLocalLanguageName <em>Local Language Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceBrandImpl extends MinimalEObjectImpl.Container implements ServiceBrand {
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
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransportMode() <em>Transport Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransportMode TRANSPORT_MODE_EDEFAULT = TransportMode.TRAIN;

	/**
	 * The cached value of the '{@link #getTransportMode() <em>Transport Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMode()
	 * @generated
	 * @ordered
	 */
	protected TransportMode transportMode = TRANSPORT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalLanguageName() <em>Local Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalLanguageName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_LANGUAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalLanguageName() <em>Local Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalLanguageName()
	 * @generated
	 * @ordered
	 */
	protected String localLanguageName = LOCAL_LANGUAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBrandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.SERVICE_BRAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SERVICE_BRAND__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SERVICE_BRAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviation(String newAbbreviation) {
		String oldAbbreviation = abbreviation;
		abbreviation = newAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SERVICE_BRAND__ABBREVIATION, oldAbbreviation, abbreviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SERVICE_BRAND__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMode getTransportMode() {
		return transportMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportMode(TransportMode newTransportMode) {
		TransportMode oldTransportMode = transportMode;
		transportMode = newTransportMode == null ? TRANSPORT_MODE_EDEFAULT : newTransportMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SERVICE_BRAND__TRANSPORT_MODE, oldTransportMode, transportMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalLanguageName() {
		return localLanguageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalLanguageName(String newLocalLanguageName) {
		String oldLocalLanguageName = localLanguageName;
		localLanguageName = newLocalLanguageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SERVICE_BRAND__LOCAL_LANGUAGE_NAME, oldLocalLanguageName, localLanguageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.SERVICE_BRAND__CODE:
				return getCode();
			case AccountingPackage.SERVICE_BRAND__NAME:
				return getName();
			case AccountingPackage.SERVICE_BRAND__ABBREVIATION:
				return getAbbreviation();
			case AccountingPackage.SERVICE_BRAND__DESCRIPTION:
				return getDescription();
			case AccountingPackage.SERVICE_BRAND__TRANSPORT_MODE:
				return getTransportMode();
			case AccountingPackage.SERVICE_BRAND__LOCAL_LANGUAGE_NAME:
				return getLocalLanguageName();
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
			case AccountingPackage.SERVICE_BRAND__CODE:
				setCode((Integer)newValue);
				return;
			case AccountingPackage.SERVICE_BRAND__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.SERVICE_BRAND__ABBREVIATION:
				setAbbreviation((String)newValue);
				return;
			case AccountingPackage.SERVICE_BRAND__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AccountingPackage.SERVICE_BRAND__TRANSPORT_MODE:
				setTransportMode((TransportMode)newValue);
				return;
			case AccountingPackage.SERVICE_BRAND__LOCAL_LANGUAGE_NAME:
				setLocalLanguageName((String)newValue);
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
			case AccountingPackage.SERVICE_BRAND__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case AccountingPackage.SERVICE_BRAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AccountingPackage.SERVICE_BRAND__ABBREVIATION:
				setAbbreviation(ABBREVIATION_EDEFAULT);
				return;
			case AccountingPackage.SERVICE_BRAND__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AccountingPackage.SERVICE_BRAND__TRANSPORT_MODE:
				setTransportMode(TRANSPORT_MODE_EDEFAULT);
				return;
			case AccountingPackage.SERVICE_BRAND__LOCAL_LANGUAGE_NAME:
				setLocalLanguageName(LOCAL_LANGUAGE_NAME_EDEFAULT);
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
			case AccountingPackage.SERVICE_BRAND__CODE:
				return code != CODE_EDEFAULT;
			case AccountingPackage.SERVICE_BRAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccountingPackage.SERVICE_BRAND__ABBREVIATION:
				return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
			case AccountingPackage.SERVICE_BRAND__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AccountingPackage.SERVICE_BRAND__TRANSPORT_MODE:
				return transportMode != TRANSPORT_MODE_EDEFAULT;
			case AccountingPackage.SERVICE_BRAND__LOCAL_LANGUAGE_NAME:
				return LOCAL_LANGUAGE_NAME_EDEFAULT == null ? localLanguageName != null : !LOCAL_LANGUAGE_NAME_EDEFAULT.equals(localLanguageName);
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
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(", description: ");
		result.append(description);
		result.append(", transportMode: ");
		result.append(transportMode);
		result.append(", localLanguageName: ");
		result.append(localLanguageName);
		result.append(')');
		return result.toString();
	}

} //ServiceBrandImpl
