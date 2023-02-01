/**
 */
package Accounting.util;

import Accounting.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Accounting.AccountingPackage
 * @generated
 */
public class AccountingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccountingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingSwitch() {
		if (modelPackage == null) {
			modelPackage = AccountingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA: {
				AccountingViewerData accountingViewerData = (AccountingViewerData)theEObject;
				T result = caseAccountingViewerData(accountingViewerData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTING_FILE: {
				AccountingFile accountingFile = (AccountingFile)theEObject;
				T result = caseAccountingFile(accountingFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTING_RECORDS: {
				AccountingRecords accountingRecords = (AccountingRecords)theEObject;
				T result = caseAccountingRecords(accountingRecords);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTING_DELIVERY: {
				AccountingDelivery accountingDelivery = (AccountingDelivery)theEObject;
				T result = caseAccountingDelivery(accountingDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTING_RECORD: {
				AccountingRecord accountingRecord = (AccountingRecord)theEObject;
				T result = caseAccountingRecord(accountingRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTED_AMOUNTS: {
				AccountedAmounts accountedAmounts = (AccountedAmounts)theEObject;
				T result = caseAccountedAmounts(accountedAmounts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTING_SUBJECT: {
				AccountingSubject accountingSubject = (AccountingSubject)theEObject;
				T result = caseAccountingSubject(accountingSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LEGACY_DESCRIPTION: {
				LegacyDescription legacyDescription = (LegacyDescription)theEObject;
				T result = caseLegacyDescription(legacyDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRANSACTION: {
				Transaction transaction = (Transaction)theEObject;
				T result = caseTransaction(transaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTED_AMOUNT: {
				AccountedAmount accountedAmount = (AccountedAmount)theEObject;
				T result = caseAccountedAmount(accountedAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CODE_LISTS: {
				CodeLists codeLists = (CodeLists)theEObject;
				T result = caseCodeLists(codeLists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.WORKFLOW_HISTORY: {
				WorkflowHistory workflowHistory = (WorkflowHistory)theEObject;
				T result = caseWorkflowHistory(workflowHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.WORKFLOW_STEP: {
				WorkflowStep workflowStep = (WorkflowStep)theEObject;
				T result = caseWorkflowStep(workflowStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.NUTS_CODES: {
				NUTSCodes nutsCodes = (NUTSCodes)theEObject;
				T result = caseNUTSCodes(nutsCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.NUTS_CODE: {
				NutsCode nutsCode = (NutsCode)theEObject;
				T result = caseNutsCode(nutsCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_BRANDS: {
				ServiceBrands serviceBrands = (ServiceBrands)theEObject;
				T result = caseServiceBrands(serviceBrands);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_BRAND: {
				ServiceBrand serviceBrand = (ServiceBrand)theEObject;
				T result = caseServiceBrand(serviceBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.COUNTRIES: {
				Countries countries = (Countries)theEObject;
				T result = caseCountries(countries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.COUNTRY: {
				Country country = (Country)theEObject;
				T result = caseCountry(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LANGUAGES: {
				Languages languages = (Languages)theEObject;
				T result = caseLanguages(languages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CURRENCIES: {
				Currencies currencies = (Currencies)theEObject;
				T result = caseCurrencies(currencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CURRENCY: {
				Currency currency = (Currency)theEObject;
				T result = caseCurrency(currency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.STATIONS: {
				Stations stations = (Stations)theEObject;
				T result = caseStations(stations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.STATION: {
				Station station = (Station)theEObject;
				T result = caseStation(station);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CARRIER: {
				Carrier carrier = (Carrier)theEObject;
				T result = caseCarrier(carrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CARRIERS: {
				Carriers carriers = (Carriers)theEObject;
				T result = caseCarriers(carriers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.GENERAL_TARIFF_MODEL: {
				GeneralTariffModel generalTariffModel = (GeneralTariffModel)theEObject;
				T result = caseGeneralTariffModel(generalTariffModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.DELIVERY: {
				Delivery delivery = (Delivery)theEObject;
				T result = caseDelivery(delivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.STATION_SET: {
				StationSet stationSet = (StationSet)theEObject;
				T result = caseStationSet(stationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.AFTER_SALES_RULES: {
				AfterSalesRules afterSalesRules = (AfterSalesRules)theEObject;
				T result = caseAfterSalesRules(afterSalesRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.AFTER_SALES_RULE: {
				AfterSalesRule afterSalesRule = (AfterSalesRule)theEObject;
				T result = caseAfterSalesRule(afterSalesRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.AFTER_SALES_CONDITION: {
				AfterSalesCondition afterSalesCondition = (AfterSalesCondition)theEObject;
				T result = caseAfterSalesCondition(afterSalesCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.APPLICATION_TIME: {
				ApplicationTime applicationTime = (ApplicationTime)theEObject;
				T result = caseApplicationTime(applicationTime);
				if (result == null) result = caseRelativeTime(applicationTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_STRUCTURE: {
				FareStructure fareStructure = (FareStructure)theEObject;
				T result = caseFareStructure(fareStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CONNECTION_POINTS: {
				ConnectionPoints connectionPoints = (ConnectionPoints)theEObject;
				T result = caseConnectionPoints(connectionPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CONNECTION_POINT: {
				ConnectionPoint connectionPoint = (ConnectionPoint)theEObject;
				T result = caseConnectionPoint(connectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_RESOURCE_LOCATIONS: {
				FareResourceLocations fareResourceLocations = (FareResourceLocations)theEObject;
				T result = caseFareResourceLocations(fareResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRAIN_RESOURCE_LOCATIONS: {
				TrainResourceLocations trainResourceLocations = (TrainResourceLocations)theEObject;
				T result = caseTrainResourceLocations(trainResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.STATION_RESOURCE_LOCATIONS: {
				StationResourceLocations stationResourceLocations = (StationResourceLocations)theEObject;
				T result = caseStationResourceLocations(stationResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CARRIER_RESOURCE_LOCATIONS: {
				CarrierResourceLocations carrierResourceLocations = (CarrierResourceLocations)theEObject;
				T result = caseCarrierResourceLocations(carrierResourceLocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRAIN_RESOURCE_LOCATION: {
				TrainResourceLocation trainResourceLocation = (TrainResourceLocation)theEObject;
				T result = caseTrainResourceLocation(trainResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.STATION_RESOURCE_LOCATION: {
				StationResourceLocation stationResourceLocation = (StationResourceLocation)theEObject;
				T result = caseStationResourceLocation(stationResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CARRIER_RESOURCE_LOCATION: {
				CarrierResourceLocation carrierResourceLocation = (CarrierResourceLocation)theEObject;
				T result = caseCarrierResourceLocation(carrierResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ONLINE_RESOURCE: {
				OnlineResource onlineResource = (OnlineResource)theEObject;
				T result = caseOnlineResource(onlineResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FULFILLMENT_CONSTRAINTS: {
				FulfillmentConstraints fulfillmentConstraints = (FulfillmentConstraints)theEObject;
				T result = caseFulfillmentConstraints(fulfillmentConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FULFILLMENT_CONSTRAINT: {
				FulfillmentConstraint fulfillmentConstraint = (FulfillmentConstraint)theEObject;
				T result = caseFulfillmentConstraint(fulfillmentConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REQUIRED_BARCODES: {
				RequiredBarcodes requiredBarcodes = (RequiredBarcodes)theEObject;
				T result = caseRequiredBarcodes(requiredBarcodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCEPTED_BARCODES: {
				AcceptedBarcodes acceptedBarcodes = (AcceptedBarcodes)theEObject;
				T result = caseAcceptedBarcodes(acceptedBarcodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SUPPORTED_ONLINE_SERVICES: {
				SupportedOnlineServices supportedOnlineServices = (SupportedOnlineServices)theEObject;
				T result = caseSupportedOnlineServices(supportedOnlineServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.STATION_NAMES: {
				StationNames stationNames = (StationNames)theEObject;
				T result = caseStationNames(stationNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_ELEMENTS: {
				FareElements fareElements = (FareElements)theEObject;
				T result = caseFareElements(fareElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_ELEMENT: {
				FareElement fareElement = (FareElement)theEObject;
				T result = caseFareElement(fareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS: {
				TotalPassengerCombinationConstraints totalPassengerCombinationConstraints = (TotalPassengerCombinationConstraints)theEObject;
				T result = caseTotalPassengerCombinationConstraints(totalPassengerCombinationConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT: {
				TotalPassengerCombinationConstraint totalPassengerCombinationConstraint = (TotalPassengerCombinationConstraint)theEObject;
				T result = caseTotalPassengerCombinationConstraint(totalPassengerCombinationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_CONSTRAINT_BUNDLES: {
				FareConstraintBundles fareConstraintBundles = (FareConstraintBundles)theEObject;
				T result = caseFareConstraintBundles(fareConstraintBundles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE: {
				FareConstraintBundle fareConstraintBundle = (FareConstraintBundle)theEObject;
				T result = caseFareConstraintBundle(fareConstraintBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_STATION_SET_DEFINITIONS: {
				FareStationSetDefinitions fareStationSetDefinitions = (FareStationSetDefinitions)theEObject;
				T result = caseFareStationSetDefinitions(fareStationSetDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_STATION_SET_DEFINITION: {
				FareStationSetDefinition fareStationSetDefinition = (FareStationSetDefinition)theEObject;
				T result = caseFareStationSetDefinition(fareStationSetDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LEGACY_ACCOUNTING_IDENTIFIER: {
				LegacyAccountingIdentifier legacyAccountingIdentifier = (LegacyAccountingIdentifier)theEObject;
				T result = caseLegacyAccountingIdentifier(legacyAccountingIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PERSONAL_DATA_CONSTRAINTS: {
				PersonalDataConstraints personalDataConstraints = (PersonalDataConstraints)theEObject;
				T result = casePersonalDataConstraints(personalDataConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PERSONAL_DATA_CONSTRAINT: {
				PersonalDataConstraint personalDataConstraint = (PersonalDataConstraint)theEObject;
				T result = casePersonalDataConstraint(personalDataConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REQUIRED_PERSONAL_DATA: {
				RequiredPersonalData requiredPersonalData = (RequiredPersonalData)theEObject;
				T result = caseRequiredPersonalData(requiredPersonalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ALLOWED_PERSONAL_DATA_CHANGES: {
				AllowedPersonalDataChanges allowedPersonalDataChanges = (AllowedPersonalDataChanges)theEObject;
				T result = caseAllowedPersonalDataChanges(allowedPersonalDataChanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PASSENGER_CONSTRAINTS: {
				PassengerConstraints passengerConstraints = (PassengerConstraints)theEObject;
				T result = casePassengerConstraints(passengerConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PASSENGER_CONSTRAINT: {
				PassengerConstraint passengerConstraint = (PassengerConstraint)theEObject;
				T result = casePassengerConstraint(passengerConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PASSENGER_COMBINATION_CONSTRAINT: {
				PassengerCombinationConstraint passengerCombinationConstraint = (PassengerCombinationConstraint)theEObject;
				T result = casePassengerCombinationConstraint(passengerCombinationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.INCLUDED_FREE_PASSENGER_LIMIT: {
				IncludedFreePassengerLimit includedFreePassengerLimit = (IncludedFreePassengerLimit)theEObject;
				T result = caseIncludedFreePassengerLimit(includedFreePassengerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.COMBINATION_CONSTRAINTS: {
				CombinationConstraints combinationConstraints = (CombinationConstraints)theEObject;
				T result = caseCombinationConstraints(combinationConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.COMBINATION_CONSTRAINT: {
				CombinationConstraint combinationConstraint = (CombinationConstraint)theEObject;
				T result = caseCombinationConstraint(combinationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINTS: {
				TravelValidityConstraints travelValidityConstraints = (TravelValidityConstraints)theEObject;
				T result = caseTravelValidityConstraints(travelValidityConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT: {
				TravelValidityConstraint travelValidityConstraint = (TravelValidityConstraint)theEObject;
				T result = caseTravelValidityConstraint(travelValidityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRAIN_VALIDITY: {
				TrainValidity trainValidity = (TrainValidity)theEObject;
				T result = caseTrainValidity(trainValidity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SALES_AVAILABILITY_CONSTRAINTS: {
				SalesAvailabilityConstraints salesAvailabilityConstraints = (SalesAvailabilityConstraints)theEObject;
				T result = caseSalesAvailabilityConstraints(salesAvailabilityConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SALES_AVAILABILITY_CONSTRAINT: {
				SalesAvailabilityConstraint salesAvailabilityConstraint = (SalesAvailabilityConstraint)theEObject;
				T result = caseSalesAvailabilityConstraint(salesAvailabilityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SALES_RESTRICTION: {
				SalesRestriction salesRestriction = (SalesRestriction)theEObject;
				T result = caseSalesRestriction(salesRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.END_OF_SALE: {
				EndOfSale endOfSale = (EndOfSale)theEObject;
				T result = caseEndOfSale(endOfSale);
				if (result == null) result = caseRelativeTime(endOfSale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.START_OF_SALE: {
				StartOfSale startOfSale = (StartOfSale)theEObject;
				T result = caseStartOfSale(startOfSale);
				if (result == null) result = caseRelativeTime(startOfSale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CARRIER_CONSTRAINTS: {
				CarrierConstraints carrierConstraints = (CarrierConstraints)theEObject;
				T result = caseCarrierConstraints(carrierConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CARRIER_CONSTRAINT: {
				CarrierConstraint carrierConstraint = (CarrierConstraint)theEObject;
				T result = caseCarrierConstraint(carrierConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_CONSTRAINTS: {
				ServiceConstraints serviceConstraints = (ServiceConstraints)theEObject;
				T result = caseServiceConstraints(serviceConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_CONSTRAINT: {
				ServiceConstraint serviceConstraint = (ServiceConstraint)theEObject;
				T result = caseServiceConstraint(serviceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REGIONAL_CONSTRAINTS: {
				RegionalConstraints regionalConstraints = (RegionalConstraints)theEObject;
				T result = caseRegionalConstraints(regionalConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REGIONAL_CONSTRAINT: {
				RegionalConstraint regionalConstraint = (RegionalConstraint)theEObject;
				T result = caseRegionalConstraint(regionalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REGIONAL_VALIDITY: {
				RegionalValidity regionalValidity = (RegionalValidity)theEObject;
				T result = caseRegionalValidity(regionalValidity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_LEVEL_DEFINITIONS: {
				ServiceLevelDefinitions serviceLevelDefinitions = (ServiceLevelDefinitions)theEObject;
				T result = caseServiceLevelDefinitions(serviceLevelDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TEXTS: {
				Texts texts = (Texts)theEObject;
				T result = caseTexts(texts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRANSLATION: {
				Translation translation = (Translation)theEObject;
				T result = caseTranslation(translation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PRICES: {
				Prices prices = (Prices)theEObject;
				T result = casePrices(prices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PRICE: {
				Price price = (Price)theEObject;
				T result = casePrice(price);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.VAT_DETAIL: {
				VATDetail vatDetail = (VATDetail)theEObject;
				T result = caseVATDetail(vatDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CURRENCY_PRICE: {
				CurrencyPrice currencyPrice = (CurrencyPrice)theEObject;
				T result = caseCurrencyPrice(currencyPrice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_CLASS_DEFINITIONS: {
				ServiceClassDefinitions serviceClassDefinitions = (ServiceClassDefinitions)theEObject;
				T result = caseServiceClassDefinitions(serviceClassDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CALENDARS: {
				Calendars calendars = (Calendars)theEObject;
				T result = caseCalendars(calendars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CALENDAR: {
				Calendar calendar = (Calendar)theEObject;
				T result = caseCalendar(calendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.RESERVATION_PARAMETERS: {
				ReservationParameters reservationParameters = (ReservationParameters)theEObject;
				T result = caseReservationParameters(reservationParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.RESERVATION_PARAMETER: {
				ReservationParameter reservationParameter = (ReservationParameter)theEObject;
				T result = caseReservationParameter(reservationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.RESERVATION_PARAMS9181: {
				ReservationParams9181 reservationParams9181 = (ReservationParams9181)theEObject;
				T result = caseReservationParams9181(reservationParams9181);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.RESERVATION_OPTIONS: {
				ReservationOptions reservationOptions = (ReservationOptions)theEObject;
				T result = caseReservationOptions(reservationOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.RESERVATION_PREFERENCE_GROUP: {
				ReservationPreferenceGroup reservationPreferenceGroup = (ReservationPreferenceGroup)theEObject;
				T result = caseReservationPreferenceGroup(reservationPreferenceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_CLASS: {
				ServiceClass serviceClass = (ServiceClass)theEObject;
				T result = caseServiceClass(serviceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.SERVICE_LEVEL: {
				ServiceLevel serviceLevel = (ServiceLevel)theEObject;
				T result = caseServiceLevel(serviceLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TIME_RANGE: {
				TimeRange timeRange = (TimeRange)theEObject;
				T result = caseTimeRange(timeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.EXCLUDED_TIME_RANGE: {
				ExcludedTimeRange excludedTimeRange = (ExcludedTimeRange)theEObject;
				T result = caseExcludedTimeRange(excludedTimeRange);
				if (result == null) result = caseTimeRange(excludedTimeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.VALIDITY_RANGE: {
				ValidityRange validityRange = (ValidityRange)theEObject;
				T result = caseValidityRange(validityRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.RELATIVE_TIME: {
				RelativeTime relativeTime = (RelativeTime)theEObject;
				T result = caseRelativeTime(relativeTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.RETURN_VALIDITY_CONSTRAINT: {
				ReturnValidityConstraint returnValidityConstraint = (ReturnValidityConstraint)theEObject;
				T result = caseReturnValidityConstraint(returnValidityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRIP_ALLOCATION_CONSTRAINT: {
				TripAllocationConstraint tripAllocationConstraint = (TripAllocationConstraint)theEObject;
				T result = caseTripAllocationConstraint(tripAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.TRIP_INTERRUPTION_CONSTRAINT: {
				TripInterruptionConstraint tripInterruptionConstraint = (TripInterruptionConstraint)theEObject;
				T result = caseTripInterruptionConstraint(tripInterruptionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.VIA_STATION: {
				ViaStation viaStation = (ViaStation)theEObject;
				T result = caseViaStation(viaStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ALTERNATIVE_ROUTE: {
				AlternativeRoute alternativeRoute = (AlternativeRoute)theEObject;
				T result = caseAlternativeRoute(alternativeRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ROUTE: {
				Route route = (Route)theEObject;
				T result = caseRoute(route);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ZONE: {
				Zone zone = (Zone)theEObject;
				T result = caseZone(zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.POLYGONE: {
				Polygone polygone = (Polygone)theEObject;
				T result = casePolygone(polygone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ZONE_DEFINITIONS: {
				ZoneDefinitions zoneDefinitions = (ZoneDefinitions)theEObject;
				T result = caseZoneDefinitions(zoneDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ZONE_DEFINITION: {
				ZoneDefinition zoneDefinition = (ZoneDefinition)theEObject;
				T result = caseZoneDefinition(zoneDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.CROSS_BORDER_CONDITION: {
				CrossBorderCondition crossBorderCondition = (CrossBorderCondition)theEObject;
				T result = caseCrossBorderCondition(crossBorderCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.FARE_COMBINATION_MODEL: {
				FareCombinationModel fareCombinationModel = (FareCombinationModel)theEObject;
				T result = caseFareCombinationModel(fareCombinationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REDUCTION_CONSTRAINTS: {
				ReductionConstraints reductionConstraints = (ReductionConstraints)theEObject;
				T result = caseReductionConstraints(reductionConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REDUCTION_CONSTRAINT: {
				ReductionConstraint reductionConstraint = (ReductionConstraint)theEObject;
				T result = caseReductionConstraint(reductionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REDUCTION_CARDS: {
				ReductionCards reductionCards = (ReductionCards)theEObject;
				T result = caseReductionCards(reductionCards);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REDUCTION_CARD: {
				ReductionCard reductionCard = (ReductionCard)theEObject;
				T result = caseReductionCard(reductionCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REQUIRED_REDUCTION_CARD: {
				RequiredReductionCard requiredReductionCard = (RequiredReductionCard)theEObject;
				T result = caseRequiredReductionCard(requiredReductionCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LUGGAGE_CONSTRAINTS: {
				LuggageConstraints luggageConstraints = (LuggageConstraints)theEObject;
				T result = caseLuggageConstraints(luggageConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LUGGAGE_CONSTRAINT: {
				LuggageConstraint luggageConstraint = (LuggageConstraint)theEObject;
				T result = caseLuggageConstraint(luggageConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LUGGAGE_ITEMS_RESTRICTION: {
				LuggageItemsRestriction luggageItemsRestriction = (LuggageItemsRestriction)theEObject;
				T result = caseLuggageItemsRestriction(luggageItemsRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.LUGGAGE_DIMENSION: {
				LuggageDimension luggageDimension = (LuggageDimension)theEObject;
				T result = caseLuggageDimension(luggageDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ADD_CARRIER_RULES: {
				AddCarrierRules addCarrierRules = (AddCarrierRules)theEObject;
				T result = caseAddCarrierRules(addCarrierRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ADD_CARRIER_RULE: {
				AddCarrierRule addCarrierRule = (AddCarrierRule)theEObject;
				T result = caseAddCarrierRule(addCarrierRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ON_BORDER_STATIONS: {
				OnBorderStations onBorderStations = (OnBorderStations)theEObject;
				T result = caseOnBorderStations(onBorderStations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewer Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewer Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountingViewerData(AccountingViewerData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountingFile(AccountingFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Records</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Records</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountingRecords(AccountingRecords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountingDelivery(AccountingDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountingRecord(AccountingRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accounted Amounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accounted Amounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountedAmounts(AccountedAmounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountingSubject(AccountingSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyDescription(LegacyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accounted Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accounted Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountedAmount(AccountedAmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Lists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLists(CodeLists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowHistory(WorkflowHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowStep(WorkflowStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NUTS Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NUTS Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUTSCodes(NUTSCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nuts Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nuts Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutsCode(NutsCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Brands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Brands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBrands(ServiceBrands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBrand(ServiceBrand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Countries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountries(Countries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Languages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Languages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguages(Languages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencies(Currencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrency(Currency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStations(Stations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStation(Station object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrier(Carrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carriers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carriers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarriers(Carriers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationSet(StationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Tariff Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralTariffModel(GeneralTariffModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelivery(Delivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesRules(AfterSalesRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesRule(AfterSalesRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesCondition(AfterSalesCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationTime(ApplicationTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareStructure(FareStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPoints(ConnectionPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPoint(ConnectionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareResourceLocations(FareResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainResourceLocations(TrainResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationResourceLocations(StationResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Resource Locations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Resource Locations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierResourceLocations(CarrierResourceLocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainResourceLocation(TrainResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationResourceLocation(StationResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierResourceLocation(CarrierResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineResource(OnlineResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfillment Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfillment Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFulfillmentConstraints(FulfillmentConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfillment Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFulfillmentConstraint(FulfillmentConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Barcodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Barcodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredBarcodes(RequiredBarcodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accepted Barcodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accepted Barcodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptedBarcodes(AcceptedBarcodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Online Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Online Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedOnlineServices(SupportedOnlineServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationNames(StationNames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareElements(FareElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareElement(FareElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Passenger Combination Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Passenger Combination Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalPassengerCombinationConstraints(TotalPassengerCombinationConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Passenger Combination Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalPassengerCombinationConstraint(TotalPassengerCombinationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Constraint Bundles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Constraint Bundles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareConstraintBundles(FareConstraintBundles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Constraint Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareConstraintBundle(FareConstraintBundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Station Set Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Station Set Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareStationSetDefinitions(FareStationSetDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Station Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareStationSetDefinition(FareStationSetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Accounting Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Accounting Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyAccountingIdentifier(LegacyAccountingIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Data Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Data Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalDataConstraints(PersonalDataConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Data Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalDataConstraint(PersonalDataConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Personal Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPersonalData(RequiredPersonalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Personal Data Changes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedPersonalDataChanges(AllowedPersonalDataChanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerConstraints(PassengerConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerConstraint(PassengerConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Combination Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerCombinationConstraint(PassengerCombinationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Free Passenger Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedFreePassengerLimit(IncludedFreePassengerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationConstraints(CombinationConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationConstraint(CombinationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Validity Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Validity Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelValidityConstraints(TravelValidityConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Validity Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelValidityConstraint(TravelValidityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Validity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Validity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainValidity(TrainValidity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Availability Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Availability Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesAvailabilityConstraints(SalesAvailabilityConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Availability Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesAvailabilityConstraint(SalesAvailabilityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesRestriction(SalesRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Of Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndOfSale(EndOfSale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Of Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartOfSale(StartOfSale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierConstraints(CarrierConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierConstraint(CarrierConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConstraints(ServiceConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConstraint(ServiceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalConstraints(RegionalConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalConstraint(RegionalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Validity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Validity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalValidity(RegionalValidity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelDefinitions(ServiceLevelDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexts(Texts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslation(Translation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrices(Prices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrice(Price object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAT Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVATDetail(VATDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyPrice(CurrencyPrice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Class Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Class Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceClassDefinitions(ServiceClassDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendars(Calendars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParameters(ReservationParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParameter(ReservationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Params9181</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Params9181</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParams9181(ReservationParams9181 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationOptions(ReservationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Preference Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationPreferenceGroup(ReservationPreferenceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceClass(ServiceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevel(ServiceLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRange(TimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excluded Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excluded Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludedTimeRange(ExcludedTimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validity Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidityRange(ValidityRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTime(RelativeTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Validity Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnValidityConstraint(ReturnValidityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Allocation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripAllocationConstraint(TripAllocationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Interruption Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Interruption Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripInterruptionConstraint(TripInterruptionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Via Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViaStation(ViaStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeRoute(AlternativeRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygone(Polygone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneDefinitions(ZoneDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneDefinition(ZoneDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Border Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Border Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossBorderCondition(CrossBorderCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Combination Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareCombinationModel(FareCombinationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionConstraints(ReductionConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionConstraint(ReductionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Cards</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Cards</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionCards(ReductionCards object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionCard(ReductionCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Reduction Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredReductionCard(RequiredReductionCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Luggage Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Luggage Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuggageConstraints(LuggageConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Luggage Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Luggage Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuggageConstraint(LuggageConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Luggage Items Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Luggage Items Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuggageItemsRestriction(LuggageItemsRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Luggage Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Luggage Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuggageDimension(LuggageDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Carrier Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Carrier Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddCarrierRules(AddCarrierRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Carrier Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Carrier Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddCarrierRule(AddCarrierRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Border Stations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Border Stations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnBorderStations(OnBorderStations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AccountingSwitch
