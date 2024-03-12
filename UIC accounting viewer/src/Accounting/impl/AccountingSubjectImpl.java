/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.AccountingSubject;
import Accounting.Carrier;
import Accounting.Country;
import Accounting.LegacyDescription;
import Accounting.SalesChannel;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getFareId <em>Fare Id</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getNumberOfItems <em>Number Of Items</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getSalesOfficeId <em>Sales Office Id</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getSalesChannel <em>Sales Channel</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getTrain <em>Train</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getTravelDate <em>Travel Date</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getCountryOfSale <em>Country Of Sale</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getRetailer <em>Retailer</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getBilateralTariffIdentifier <em>Bilateral Tariff Identifier</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getLegacyDescription <em>Legacy Description</em>}</li>
 *   <li>{@link Accounting.impl.AccountingSubjectImpl#getInternationalJourney <em>International Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingSubjectImpl extends MinimalEObjectImpl.Container implements AccountingSubject {
	/**
	 * The default value of the '{@link #getFareId() <em>Fare Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareId()
	 * @generated
	 * @ordered
	 */
	protected static final String FARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFareId() <em>Fare Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareId()
	 * @generated
	 * @ordered
	 */
	protected String fareId = FARE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected int numberOfItems = NUMBER_OF_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalesOfficeId() <em>Sales Office Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOfficeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_OFFICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesOfficeId() <em>Sales Office Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOfficeId()
	 * @generated
	 * @ordered
	 */
	protected String salesOfficeId = SALES_OFFICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalesChannel() <em>Sales Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesChannel()
	 * @generated
	 * @ordered
	 */
	protected static final SalesChannel SALES_CHANNEL_EDEFAULT = SalesChannel.AGENCY;

	/**
	 * The cached value of the '{@link #getSalesChannel() <em>Sales Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesChannel()
	 * @generated
	 * @ordered
	 */
	protected SalesChannel salesChannel = SALES_CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrain() <em>Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrain() <em>Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrain()
	 * @generated
	 * @ordered
	 */
	protected String train = TRAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelDate() <em>Travel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRAVEL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTravelDate() <em>Travel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelDate()
	 * @generated
	 * @ordered
	 */
	protected Date travelDate = TRAVEL_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountryOfSale() <em>Country Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfSale()
	 * @generated
	 * @ordered
	 */
	protected Country countryOfSale;

	/**
	 * The cached value of the '{@link #getCarriers() <em>Carriers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> carriers;

	/**
	 * The cached value of the '{@link #getRetailer() <em>Retailer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetailer()
	 * @generated
	 * @ordered
	 */
	protected Carrier retailer;

	/**
	 * The default value of the '{@link #getBilateralTariffIdentifier() <em>Bilateral Tariff Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilateralTariffIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String BILATERAL_TARIFF_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBilateralTariffIdentifier() <em>Bilateral Tariff Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilateralTariffIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String bilateralTariffIdentifier = BILATERAL_TARIFF_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLegacyDescription() <em>Legacy Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyDescription()
	 * @generated
	 * @ordered
	 */
	protected LegacyDescription legacyDescription;

	/**
	 * The default value of the '{@link #getInternationalJourney() <em>International Journey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalJourney()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INTERNATIONAL_JOURNEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternationalJourney() <em>International Journey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalJourney()
	 * @generated
	 * @ordered
	 */
	protected Boolean internationalJourney = INTERNATIONAL_JOURNEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTING_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFareId() {
		return fareId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFareId(String newFareId) {
		String oldFareId = fareId;
		fareId = newFareId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__FARE_ID, oldFareId, fareId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfItems(int newNumberOfItems) {
		int oldNumberOfItems = numberOfItems;
		numberOfItems = newNumberOfItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS, oldNumberOfItems, numberOfItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalesOfficeId() {
		return salesOfficeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesOfficeId(String newSalesOfficeId) {
		String oldSalesOfficeId = salesOfficeId;
		salesOfficeId = newSalesOfficeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__SALES_OFFICE_ID, oldSalesOfficeId, salesOfficeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesChannel getSalesChannel() {
		return salesChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesChannel(SalesChannel newSalesChannel) {
		SalesChannel oldSalesChannel = salesChannel;
		salesChannel = newSalesChannel == null ? SALES_CHANNEL_EDEFAULT : newSalesChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__SALES_CHANNEL, oldSalesChannel, salesChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrain() {
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrain(String newTrain) {
		String oldTrain = train;
		train = newTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__TRAIN, oldTrain, train));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTravelDate() {
		return travelDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelDate(Date newTravelDate) {
		Date oldTravelDate = travelDate;
		travelDate = newTravelDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__TRAVEL_DATE, oldTravelDate, travelDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountryOfSale() {
		if (countryOfSale != null && countryOfSale.eIsProxy()) {
			InternalEObject oldCountryOfSale = (InternalEObject)countryOfSale;
			countryOfSale = (Country)eResolveProxy(oldCountryOfSale);
			if (countryOfSale != oldCountryOfSale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.ACCOUNTING_SUBJECT__COUNTRY_OF_SALE, oldCountryOfSale, countryOfSale));
			}
		}
		return countryOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountryOfSale() {
		return countryOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryOfSale(Country newCountryOfSale) {
		Country oldCountryOfSale = countryOfSale;
		countryOfSale = newCountryOfSale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__COUNTRY_OF_SALE, oldCountryOfSale, countryOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carrier> getCarriers() {
		if (carriers == null) {
			carriers = new EObjectResolvingEList<Carrier>(Carrier.class, this, AccountingPackage.ACCOUNTING_SUBJECT__CARRIERS);
		}
		return carriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier getRetailer() {
		if (retailer != null && retailer.eIsProxy()) {
			InternalEObject oldRetailer = (InternalEObject)retailer;
			retailer = (Carrier)eResolveProxy(oldRetailer);
			if (retailer != oldRetailer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.ACCOUNTING_SUBJECT__RETAILER, oldRetailer, retailer));
			}
		}
		return retailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetRetailer() {
		return retailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetailer(Carrier newRetailer) {
		Carrier oldRetailer = retailer;
		retailer = newRetailer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__RETAILER, oldRetailer, retailer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBilateralTariffIdentifier() {
		return bilateralTariffIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBilateralTariffIdentifier(String newBilateralTariffIdentifier) {
		String oldBilateralTariffIdentifier = bilateralTariffIdentifier;
		bilateralTariffIdentifier = newBilateralTariffIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER, oldBilateralTariffIdentifier, bilateralTariffIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyDescription getLegacyDescription() {
		return legacyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyDescription(LegacyDescription newLegacyDescription, NotificationChain msgs) {
		LegacyDescription oldLegacyDescription = legacyDescription;
		legacyDescription = newLegacyDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION, oldLegacyDescription, newLegacyDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyDescription(LegacyDescription newLegacyDescription) {
		if (newLegacyDescription != legacyDescription) {
			NotificationChain msgs = null;
			if (legacyDescription != null)
				msgs = ((InternalEObject)legacyDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION, null, msgs);
			if (newLegacyDescription != null)
				msgs = ((InternalEObject)newLegacyDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION, null, msgs);
			msgs = basicSetLegacyDescription(newLegacyDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION, newLegacyDescription, newLegacyDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInternationalJourney() {
		return internationalJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternationalJourney(Boolean newInternationalJourney) {
		Boolean oldInternationalJourney = internationalJourney;
		internationalJourney = newInternationalJourney;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_SUBJECT__INTERNATIONAL_JOURNEY, oldInternationalJourney, internationalJourney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION:
				return basicSetLegacyDescription(null, msgs);
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
			case AccountingPackage.ACCOUNTING_SUBJECT__FARE_ID:
				return getFareId();
			case AccountingPackage.ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS:
				return getNumberOfItems();
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_OFFICE_ID:
				return getSalesOfficeId();
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_CHANNEL:
				return getSalesChannel();
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAIN:
				return getTrain();
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAVEL_DATE:
				return getTravelDate();
			case AccountingPackage.ACCOUNTING_SUBJECT__COUNTRY_OF_SALE:
				if (resolve) return getCountryOfSale();
				return basicGetCountryOfSale();
			case AccountingPackage.ACCOUNTING_SUBJECT__CARRIERS:
				return getCarriers();
			case AccountingPackage.ACCOUNTING_SUBJECT__RETAILER:
				if (resolve) return getRetailer();
				return basicGetRetailer();
			case AccountingPackage.ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER:
				return getBilateralTariffIdentifier();
			case AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION:
				return getLegacyDescription();
			case AccountingPackage.ACCOUNTING_SUBJECT__INTERNATIONAL_JOURNEY:
				return getInternationalJourney();
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
			case AccountingPackage.ACCOUNTING_SUBJECT__FARE_ID:
				setFareId((String)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS:
				setNumberOfItems((Integer)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_OFFICE_ID:
				setSalesOfficeId((String)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_CHANNEL:
				setSalesChannel((SalesChannel)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAIN:
				setTrain((String)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAVEL_DATE:
				setTravelDate((Date)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__COUNTRY_OF_SALE:
				setCountryOfSale((Country)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__CARRIERS:
				getCarriers().clear();
				getCarriers().addAll((Collection<? extends Carrier>)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__RETAILER:
				setRetailer((Carrier)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER:
				setBilateralTariffIdentifier((String)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION:
				setLegacyDescription((LegacyDescription)newValue);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__INTERNATIONAL_JOURNEY:
				setInternationalJourney((Boolean)newValue);
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
			case AccountingPackage.ACCOUNTING_SUBJECT__FARE_ID:
				setFareId(FARE_ID_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS:
				setNumberOfItems(NUMBER_OF_ITEMS_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_OFFICE_ID:
				setSalesOfficeId(SALES_OFFICE_ID_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_CHANNEL:
				setSalesChannel(SALES_CHANNEL_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAIN:
				setTrain(TRAIN_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAVEL_DATE:
				setTravelDate(TRAVEL_DATE_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__COUNTRY_OF_SALE:
				setCountryOfSale((Country)null);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__CARRIERS:
				getCarriers().clear();
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__RETAILER:
				setRetailer((Carrier)null);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER:
				setBilateralTariffIdentifier(BILATERAL_TARIFF_IDENTIFIER_EDEFAULT);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION:
				setLegacyDescription((LegacyDescription)null);
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__INTERNATIONAL_JOURNEY:
				setInternationalJourney(INTERNATIONAL_JOURNEY_EDEFAULT);
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
			case AccountingPackage.ACCOUNTING_SUBJECT__FARE_ID:
				return FARE_ID_EDEFAULT == null ? fareId != null : !FARE_ID_EDEFAULT.equals(fareId);
			case AccountingPackage.ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS:
				return numberOfItems != NUMBER_OF_ITEMS_EDEFAULT;
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_OFFICE_ID:
				return SALES_OFFICE_ID_EDEFAULT == null ? salesOfficeId != null : !SALES_OFFICE_ID_EDEFAULT.equals(salesOfficeId);
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_CHANNEL:
				return salesChannel != SALES_CHANNEL_EDEFAULT;
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAIN:
				return TRAIN_EDEFAULT == null ? train != null : !TRAIN_EDEFAULT.equals(train);
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAVEL_DATE:
				return TRAVEL_DATE_EDEFAULT == null ? travelDate != null : !TRAVEL_DATE_EDEFAULT.equals(travelDate);
			case AccountingPackage.ACCOUNTING_SUBJECT__COUNTRY_OF_SALE:
				return countryOfSale != null;
			case AccountingPackage.ACCOUNTING_SUBJECT__CARRIERS:
				return carriers != null && !carriers.isEmpty();
			case AccountingPackage.ACCOUNTING_SUBJECT__RETAILER:
				return retailer != null;
			case AccountingPackage.ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER:
				return BILATERAL_TARIFF_IDENTIFIER_EDEFAULT == null ? bilateralTariffIdentifier != null : !BILATERAL_TARIFF_IDENTIFIER_EDEFAULT.equals(bilateralTariffIdentifier);
			case AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION:
				return legacyDescription != null;
			case AccountingPackage.ACCOUNTING_SUBJECT__INTERNATIONAL_JOURNEY:
				return INTERNATIONAL_JOURNEY_EDEFAULT == null ? internationalJourney != null : !INTERNATIONAL_JOURNEY_EDEFAULT.equals(internationalJourney);
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
		result.append(" (fareId: ");
		result.append(fareId);
		result.append(", numberOfItems: ");
		result.append(numberOfItems);
		result.append(", salesOfficeId: ");
		result.append(salesOfficeId);
		result.append(", salesChannel: ");
		result.append(salesChannel);
		result.append(", train: ");
		result.append(train);
		result.append(", travelDate: ");
		result.append(travelDate);
		result.append(", bilateralTariffIdentifier: ");
		result.append(bilateralTariffIdentifier);
		result.append(", internationalJourney: ");
		result.append(internationalJourney);
		result.append(')');
		return result.toString();
	}

} //AccountingSubjectImpl
