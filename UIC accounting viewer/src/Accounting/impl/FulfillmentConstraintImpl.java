/**
 */
package Accounting.impl;

import Accounting.AcceptedBarcodes;
import Accounting.AccountingPackage;
import Accounting.BarcodeTypes;
import Accounting.ControlDataExchangeTypes;
import Accounting.FulfillmentConstraint;
import Accounting.FulfillmentType;
import Accounting.RequiredBarcodes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getAcceptedFulfilmentTypes <em>Accepted Fulfilment Types</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getRequiredControlDataExchange <em>Required Control Data Exchange</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#isSeparateFulFillmentRequired <em>Separate Ful Fillment Required</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getAcceptedBarcodes <em>Accepted Barcodes</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getRequiredBarcodes <em>Required Barcodes</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getAcceptedBarcodeTypes <em>Accepted Barcode Types</em>}</li>
 *   <li>{@link Accounting.impl.FulfillmentConstraintImpl#getRequiredBarcodeTypes <em>Required Barcode Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FulfillmentConstraintImpl extends MinimalEObjectImpl.Container implements FulfillmentConstraint {
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
	 * The cached value of the '{@link #getAcceptedFulfilmentTypes() <em>Accepted Fulfilment Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedFulfilmentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<FulfillmentType> acceptedFulfilmentTypes;

	/**
	 * The cached value of the '{@link #getRequiredControlDataExchange() <em>Required Control Data Exchange</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlDataExchange()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlDataExchangeTypes> requiredControlDataExchange;

	/**
	 * The default value of the '{@link #isIndividualTicketingPermitted() <em>Individual Ticketing Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualTicketingPermitted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndividualTicketingPermitted() <em>Individual Ticketing Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividualTicketingPermitted()
	 * @generated
	 * @ordered
	 */
	protected boolean individualTicketingPermitted = INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSeparateFulFillmentRequired() <em>Separate Ful Fillment Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeparateFulFillmentRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEPARATE_FUL_FILLMENT_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeparateFulFillmentRequired() <em>Separate Ful Fillment Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeparateFulFillmentRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean separateFulFillmentRequired = SEPARATE_FUL_FILLMENT_REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptedBarcodes() <em>Accepted Barcodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedBarcodes()
	 * @generated
	 * @ordered
	 */
	protected AcceptedBarcodes acceptedBarcodes;

	/**
	 * The cached value of the '{@link #getRequiredBarcodes() <em>Required Barcodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBarcodes()
	 * @generated
	 * @ordered
	 */
	protected RequiredBarcodes requiredBarcodes;

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
	 * The cached value of the '{@link #getAcceptedBarcodeTypes() <em>Accepted Barcode Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedBarcodeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BarcodeTypes> acceptedBarcodeTypes;

	/**
	 * The cached value of the '{@link #getRequiredBarcodeTypes() <em>Required Barcode Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBarcodeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BarcodeTypes> requiredBarcodeTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.FULFILLMENT_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FulfillmentType> getAcceptedFulfilmentTypes() {
		if (acceptedFulfilmentTypes == null) {
			acceptedFulfilmentTypes = new EDataTypeUniqueEList<FulfillmentType>(FulfillmentType.class, this, AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES);
		}
		return acceptedFulfilmentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlDataExchangeTypes> getRequiredControlDataExchange() {
		if (requiredControlDataExchange == null) {
			requiredControlDataExchange = new EDataTypeUniqueEList<ControlDataExchangeTypes>(ControlDataExchangeTypes.class, this, AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE);
		}
		return requiredControlDataExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndividualTicketingPermitted() {
		return individualTicketingPermitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualTicketingPermitted(boolean newIndividualTicketingPermitted) {
		boolean oldIndividualTicketingPermitted = individualTicketingPermitted;
		individualTicketingPermitted = newIndividualTicketingPermitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED, oldIndividualTicketingPermitted, individualTicketingPermitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeparateFulFillmentRequired() {
		return separateFulFillmentRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparateFulFillmentRequired(boolean newSeparateFulFillmentRequired) {
		boolean oldSeparateFulFillmentRequired = separateFulFillmentRequired;
		separateFulFillmentRequired = newSeparateFulFillmentRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED, oldSeparateFulFillmentRequired, separateFulFillmentRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedBarcodes getAcceptedBarcodes() {
		return acceptedBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptedBarcodes(AcceptedBarcodes newAcceptedBarcodes, NotificationChain msgs) {
		AcceptedBarcodes oldAcceptedBarcodes = acceptedBarcodes;
		acceptedBarcodes = newAcceptedBarcodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, oldAcceptedBarcodes, newAcceptedBarcodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptedBarcodes(AcceptedBarcodes newAcceptedBarcodes) {
		if (newAcceptedBarcodes != acceptedBarcodes) {
			NotificationChain msgs = null;
			if (acceptedBarcodes != null)
				msgs = ((InternalEObject)acceptedBarcodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, null, msgs);
			if (newAcceptedBarcodes != null)
				msgs = ((InternalEObject)newAcceptedBarcodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, null, msgs);
			msgs = basicSetAcceptedBarcodes(newAcceptedBarcodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES, newAcceptedBarcodes, newAcceptedBarcodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBarcodes getRequiredBarcodes() {
		return requiredBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBarcodes(RequiredBarcodes newRequiredBarcodes, NotificationChain msgs) {
		RequiredBarcodes oldRequiredBarcodes = requiredBarcodes;
		requiredBarcodes = newRequiredBarcodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES, oldRequiredBarcodes, newRequiredBarcodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBarcodes(RequiredBarcodes newRequiredBarcodes) {
		if (newRequiredBarcodes != requiredBarcodes) {
			NotificationChain msgs = null;
			if (requiredBarcodes != null)
				msgs = ((InternalEObject)requiredBarcodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES, null, msgs);
			if (newRequiredBarcodes != null)
				msgs = ((InternalEObject)newRequiredBarcodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES, null, msgs);
			msgs = basicSetRequiredBarcodes(newRequiredBarcodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES, newRequiredBarcodes, newRequiredBarcodes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION, oldDataDescription, dataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BarcodeTypes> getAcceptedBarcodeTypes() {
		if (acceptedBarcodeTypes == null) {
			acceptedBarcodeTypes = new EDataTypeUniqueEList<BarcodeTypes>(BarcodeTypes.class, this, AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES);
		}
		return acceptedBarcodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BarcodeTypes> getRequiredBarcodeTypes() {
		if (requiredBarcodeTypes == null) {
			requiredBarcodeTypes = new EDataTypeUniqueEList<BarcodeTypes>(BarcodeTypes.class, this, AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES);
		}
		return requiredBarcodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				return basicSetAcceptedBarcodes(null, msgs);
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				return basicSetRequiredBarcodes(null, msgs);
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
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ID:
				return getId();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				return getAcceptedFulfilmentTypes();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				return getRequiredControlDataExchange();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				return isIndividualTicketingPermitted();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED:
				return isSeparateFulFillmentRequired();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				return getAcceptedBarcodes();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				return getRequiredBarcodes();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION:
				return getDataDescription();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES:
				return getAcceptedBarcodeTypes();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES:
				return getRequiredBarcodeTypes();
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
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ID:
				setId((String)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				getAcceptedFulfilmentTypes().clear();
				getAcceptedFulfilmentTypes().addAll((Collection<? extends FulfillmentType>)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				getRequiredControlDataExchange().clear();
				getRequiredControlDataExchange().addAll((Collection<? extends ControlDataExchangeTypes>)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				setIndividualTicketingPermitted((Boolean)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED:
				setSeparateFulFillmentRequired((Boolean)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				setAcceptedBarcodes((AcceptedBarcodes)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				setRequiredBarcodes((RequiredBarcodes)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription((String)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES:
				getAcceptedBarcodeTypes().clear();
				getAcceptedBarcodeTypes().addAll((Collection<? extends BarcodeTypes>)newValue);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES:
				getRequiredBarcodeTypes().clear();
				getRequiredBarcodeTypes().addAll((Collection<? extends BarcodeTypes>)newValue);
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
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ID:
				setId(ID_EDEFAULT);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				getAcceptedFulfilmentTypes().clear();
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				getRequiredControlDataExchange().clear();
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				setIndividualTicketingPermitted(INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED:
				setSeparateFulFillmentRequired(SEPARATE_FUL_FILLMENT_REQUIRED_EDEFAULT);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				setAcceptedBarcodes((AcceptedBarcodes)null);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				setRequiredBarcodes((RequiredBarcodes)null);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION:
				setDataDescription(DATA_DESCRIPTION_EDEFAULT);
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES:
				getAcceptedBarcodeTypes().clear();
				return;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES:
				getRequiredBarcodeTypes().clear();
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
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES:
				return acceptedFulfilmentTypes != null && !acceptedFulfilmentTypes.isEmpty();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE:
				return requiredControlDataExchange != null && !requiredControlDataExchange.isEmpty();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED:
				return individualTicketingPermitted != INDIVIDUAL_TICKETING_PERMITTED_EDEFAULT;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED:
				return separateFulFillmentRequired != SEPARATE_FUL_FILLMENT_REQUIRED_EDEFAULT;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES:
				return acceptedBarcodes != null;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES:
				return requiredBarcodes != null;
			case AccountingPackage.FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION:
				return DATA_DESCRIPTION_EDEFAULT == null ? dataDescription != null : !DATA_DESCRIPTION_EDEFAULT.equals(dataDescription);
			case AccountingPackage.FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES:
				return acceptedBarcodeTypes != null && !acceptedBarcodeTypes.isEmpty();
			case AccountingPackage.FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES:
				return requiredBarcodeTypes != null && !requiredBarcodeTypes.isEmpty();
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
		result.append(", acceptedFulfilmentTypes: ");
		result.append(acceptedFulfilmentTypes);
		result.append(", requiredControlDataExchange: ");
		result.append(requiredControlDataExchange);
		result.append(", individualTicketingPermitted: ");
		result.append(individualTicketingPermitted);
		result.append(", separateFulFillmentRequired: ");
		result.append(separateFulFillmentRequired);
		result.append(", dataDescription: ");
		result.append(dataDescription);
		result.append(", acceptedBarcodeTypes: ");
		result.append(acceptedBarcodeTypes);
		result.append(", requiredBarcodeTypes: ");
		result.append(requiredBarcodeTypes);
		result.append(')');
		return result.toString();
	}

} //FulfillmentConstraintImpl
