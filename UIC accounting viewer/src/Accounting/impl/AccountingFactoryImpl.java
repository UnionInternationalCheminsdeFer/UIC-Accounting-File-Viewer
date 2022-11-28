/**
 */
package Accounting.impl;

import Accounting.*;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingFactoryImpl extends EFactoryImpl implements AccountingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountingFactory init() {
		try {
			AccountingFactory theAccountingFactory = (AccountingFactory)EPackage.Registry.INSTANCE.getEFactory(AccountingPackage.eNS_URI);
			if (theAccountingFactory != null) {
				return theAccountingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccountingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA: return createAccountingViewerData();
			case AccountingPackage.ACCOUNTING_FILE: return createAccountingFile();
			case AccountingPackage.ACCOUNTING_RECORDS: return createAccountingRecords();
			case AccountingPackage.ACCOUNTING_DELIVERY: return createAccountingDelivery();
			case AccountingPackage.ACCOUNTING_RECORD: return createAccountingRecord();
			case AccountingPackage.ACCOUNTED_AMOUNTS: return createAccountedAmounts();
			case AccountingPackage.ACCOUNTING_SUBJECT: return createAccountingSubject();
			case AccountingPackage.LEGACY_DESCRIPTION: return createLegacyDescription();
			case AccountingPackage.TRANSACTION: return createTransaction();
			case AccountingPackage.ACCOUNTED_AMOUNT: return createAccountedAmount();
			case AccountingPackage.CODE_LISTS: return createCodeLists();
			case AccountingPackage.WORKFLOW_HISTORY: return createWorkflowHistory();
			case AccountingPackage.WORKFLOW_STEP: return createWorkflowStep();
			case AccountingPackage.NUTS_CODES: return createNUTSCodes();
			case AccountingPackage.NUTS_CODE: return createNutsCode();
			case AccountingPackage.SERVICE_BRANDS: return createServiceBrands();
			case AccountingPackage.SERVICE_BRAND: return createServiceBrand();
			case AccountingPackage.COUNTRIES: return createCountries();
			case AccountingPackage.COUNTRY: return createCountry();
			case AccountingPackage.LANGUAGES: return createLanguages();
			case AccountingPackage.LANGUAGE: return createLanguage();
			case AccountingPackage.CURRENCIES: return createCurrencies();
			case AccountingPackage.CURRENCY: return createCurrency();
			case AccountingPackage.STATIONS: return createStations();
			case AccountingPackage.STATION: return createStation();
			case AccountingPackage.STATION_RELATION: return createStationRelation();
			case AccountingPackage.CARRIER: return createCarrier();
			case AccountingPackage.CARRIERS: return createCarriers();
			case AccountingPackage.STATION_SET: return createStationSet();
			case AccountingPackage.GENERAL_TARIFF_MODEL: return createGeneralTariffModel();
			case AccountingPackage.DELIVERY: return createDelivery();
			case AccountingPackage.AFTER_SALES_RULES: return createAfterSalesRules();
			case AccountingPackage.AFTER_SALES_RULE: return createAfterSalesRule();
			case AccountingPackage.AFTER_SALES_CONDITION: return createAfterSalesCondition();
			case AccountingPackage.APPLICATION_TIME: return createApplicationTime();
			case AccountingPackage.FARE_STRUCTURE: return createFareStructure();
			case AccountingPackage.CONNECTION_POINTS: return createConnectionPoints();
			case AccountingPackage.CONNECTION_POINT: return createConnectionPoint();
			case AccountingPackage.FARE_RESOURCE_LOCATIONS: return createFareResourceLocations();
			case AccountingPackage.TRAIN_RESOURCE_LOCATIONS: return createTrainResourceLocations();
			case AccountingPackage.STATION_RESOURCE_LOCATIONS: return createStationResourceLocations();
			case AccountingPackage.CARRIER_RESOURCE_LOCATIONS: return createCarrierResourceLocations();
			case AccountingPackage.TRAIN_RESOURCE_LOCATION: return createTrainResourceLocation();
			case AccountingPackage.STATION_RESOURCE_LOCATION: return createStationResourceLocation();
			case AccountingPackage.CARRIER_RESOURCE_LOCATION: return createCarrierResourceLocation();
			case AccountingPackage.ONLINE_RESOURCE: return createOnlineResource();
			case AccountingPackage.FULFILLMENT_CONSTRAINTS: return createFulfillmentConstraints();
			case AccountingPackage.FULFILLMENT_CONSTRAINT: return createFulfillmentConstraint();
			case AccountingPackage.REQUIRED_BARCODES: return createRequiredBarcodes();
			case AccountingPackage.ACCEPTED_BARCODES: return createAcceptedBarcodes();
			case AccountingPackage.SUPPORTED_ONLINE_SERVICES: return createSupportedOnlineServices();
			case AccountingPackage.STATION_NAMES: return createStationNames();
			case AccountingPackage.FARE_ELEMENTS: return createFareElements();
			case AccountingPackage.FARE_ELEMENT: return createFareElement();
			case AccountingPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS: return createTotalPassengerCombinationConstraints();
			case AccountingPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT: return createTotalPassengerCombinationConstraint();
			case AccountingPackage.FARE_CONSTRAINT_BUNDLES: return createFareConstraintBundles();
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE: return createFareConstraintBundle();
			case AccountingPackage.FARE_STATION_SET_DEFINITIONS: return createFareStationSetDefinitions();
			case AccountingPackage.FARE_STATION_SET_DEFINITION: return createFareStationSetDefinition();
			case AccountingPackage.LEGACY_ACCOUNTING_IDENTIFIER: return createLegacyAccountingIdentifier();
			case AccountingPackage.PERSONAL_DATA_CONSTRAINTS: return createPersonalDataConstraints();
			case AccountingPackage.PERSONAL_DATA_CONSTRAINT: return createPersonalDataConstraint();
			case AccountingPackage.REQUIRED_PERSONAL_DATA: return createRequiredPersonalData();
			case AccountingPackage.ALLOWED_PERSONAL_DATA_CHANGES: return createAllowedPersonalDataChanges();
			case AccountingPackage.PASSENGER_CONSTRAINTS: return createPassengerConstraints();
			case AccountingPackage.PASSENGER_CONSTRAINT: return createPassengerConstraint();
			case AccountingPackage.PASSENGER_COMBINATION_CONSTRAINT: return createPassengerCombinationConstraint();
			case AccountingPackage.INCLUDED_FREE_PASSENGER_LIMIT: return createIncludedFreePassengerLimit();
			case AccountingPackage.COMBINATION_CONSTRAINTS: return createCombinationConstraints();
			case AccountingPackage.COMBINATION_CONSTRAINT: return createCombinationConstraint();
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINTS: return createTravelValidityConstraints();
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT: return createTravelValidityConstraint();
			case AccountingPackage.TRAIN_VALIDITY: return createTrainValidity();
			case AccountingPackage.SALES_AVAILABILITY_CONSTRAINTS: return createSalesAvailabilityConstraints();
			case AccountingPackage.SALES_AVAILABILITY_CONSTRAINT: return createSalesAvailabilityConstraint();
			case AccountingPackage.SALES_RESTRICTION: return createSalesRestriction();
			case AccountingPackage.END_OF_SALE: return createEndOfSale();
			case AccountingPackage.START_OF_SALE: return createStartOfSale();
			case AccountingPackage.CARRIER_CONSTRAINTS: return createCarrierConstraints();
			case AccountingPackage.CARRIER_CONSTRAINT: return createCarrierConstraint();
			case AccountingPackage.SERVICE_CONSTRAINTS: return createServiceConstraints();
			case AccountingPackage.SERVICE_CONSTRAINT: return createServiceConstraint();
			case AccountingPackage.REGIONAL_CONSTRAINTS: return createRegionalConstraints();
			case AccountingPackage.REGIONAL_CONSTRAINT: return createRegionalConstraint();
			case AccountingPackage.REGIONAL_VALIDITY: return createRegionalValidity();
			case AccountingPackage.SERVICE_LEVEL_DEFINITIONS: return createServiceLevelDefinitions();
			case AccountingPackage.TEXTS: return createTexts();
			case AccountingPackage.TEXT: return createText();
			case AccountingPackage.TRANSLATION: return createTranslation();
			case AccountingPackage.PRICES: return createPrices();
			case AccountingPackage.PRICE: return createPrice();
			case AccountingPackage.VAT_DETAIL: return createVATDetail();
			case AccountingPackage.CURRENCY_PRICE: return createCurrencyPrice();
			case AccountingPackage.SERVICE_CLASS_DEFINITIONS: return createServiceClassDefinitions();
			case AccountingPackage.CALENDARS: return createCalendars();
			case AccountingPackage.CALENDAR: return createCalendar();
			case AccountingPackage.RESERVATION_PARAMETERS: return createReservationParameters();
			case AccountingPackage.RESERVATION_PARAMETER: return createReservationParameter();
			case AccountingPackage.RESERVATION_PARAMS9181: return createReservationParams9181();
			case AccountingPackage.RESERVATION_OPTIONS: return createReservationOptions();
			case AccountingPackage.RESERVATION_PREFERENCE_GROUP: return createReservationPreferenceGroup();
			case AccountingPackage.SERVICE_CLASS: return createServiceClass();
			case AccountingPackage.SERVICE_LEVEL: return createServiceLevel();
			case AccountingPackage.TIME_RANGE: return createTimeRange();
			case AccountingPackage.EXCLUDED_TIME_RANGE: return createExcludedTimeRange();
			case AccountingPackage.VALIDITY_RANGE: return createValidityRange();
			case AccountingPackage.RELATIVE_TIME: return createRelativeTime();
			case AccountingPackage.RETURN_VALIDITY_CONSTRAINT: return createReturnValidityConstraint();
			case AccountingPackage.TRIP_ALLOCATION_CONSTRAINT: return createTripAllocationConstraint();
			case AccountingPackage.TRIP_INTERRUPTION_CONSTRAINT: return createTripInterruptionConstraint();
			case AccountingPackage.VIA_STATION: return createViaStation();
			case AccountingPackage.ALTERNATIVE_ROUTE: return createAlternativeRoute();
			case AccountingPackage.ROUTE: return createRoute();
			case AccountingPackage.ZONE: return createZone();
			case AccountingPackage.LINE: return createLine();
			case AccountingPackage.POLYGONE: return createPolygone();
			case AccountingPackage.EDGE: return createEdge();
			case AccountingPackage.ZONE_DEFINITIONS: return createZoneDefinitions();
			case AccountingPackage.ZONE_DEFINITION: return createZoneDefinition();
			case AccountingPackage.CROSS_BORDER_CONDITION: return createCrossBorderCondition();
			case AccountingPackage.FARE_COMBINATION_MODEL: return createFareCombinationModel();
			case AccountingPackage.REDUCTION_CONSTRAINTS: return createReductionConstraints();
			case AccountingPackage.REDUCTION_CONSTRAINT: return createReductionConstraint();
			case AccountingPackage.REDUCTION_CARDS: return createReductionCards();
			case AccountingPackage.REDUCTION_CARD: return createReductionCard();
			case AccountingPackage.REQUIRED_REDUCTION_CARD: return createRequiredReductionCard();
			case AccountingPackage.LUGGAGE_CONSTRAINTS: return createLuggageConstraints();
			case AccountingPackage.LUGGAGE_CONSTRAINT: return createLuggageConstraint();
			case AccountingPackage.LUGGAGE_ITEMS_RESTRICTION: return createLuggageItemsRestriction();
			case AccountingPackage.LUGGAGE_DIMENSION: return createLuggageDimension();
			case AccountingPackage.ADD_CARRIER_RULES: return createAddCarrierRules();
			case AccountingPackage.ADD_CARRIER_RULE: return createAddCarrierRule();
			case AccountingPackage.ON_BORDER_STATIONS: return createOnBorderStations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AccountingPackage.PAYMENT_TYPE:
				return createPaymentTypeFromString(eDataType, initialValue);
			case AccountingPackage.SALES_CHANNEL:
				return createSalesChannelFromString(eDataType, initialValue);
			case AccountingPackage.TRANSACTION_TYPE:
				return createTransactionTypeFromString(eDataType, initialValue);
			case AccountingPackage.ACCOUNTING_TYPE:
				return createAccountingTypeFromString(eDataType, initialValue);
			case AccountingPackage.SETTLEMENT_VALUE_INDICATOR:
				return createSettlementValueIndicatorFromString(eDataType, initialValue);
			case AccountingPackage.SALES_TYPE:
				return createSalesTypeFromString(eDataType, initialValue);
			case AccountingPackage.TRANSACTION_STANDARD:
				return createTransactionStandardFromString(eDataType, initialValue);
			case AccountingPackage.BOARDING_OR_ARRIVAL:
				return createBoardingOrArrivalFromString(eDataType, initialValue);
			case AccountingPackage.LUGGAGE_RULE:
				return createLuggageRuleFromString(eDataType, initialValue);
			case AccountingPackage.DIMENSION:
				return createDimensionFromString(eDataType, initialValue);
			case AccountingPackage.ADD_CARRIER_SCOPE:
				return createAddCarrierScopeFromString(eDataType, initialValue);
			case AccountingPackage.TRANSPORT_MODE:
				return createTransportModeFromString(eDataType, initialValue);
			case AccountingPackage.STATION_RELATION_TYPE:
				return createStationRelationTypeFromString(eDataType, initialValue);
			case AccountingPackage.STATION_FARE_DETAIL_TYPE:
				return createStationFareDetailTypeFromString(eDataType, initialValue);
			case AccountingPackage.REGULATORY_CONDITION:
				return createRegulatoryConditionFromString(eDataType, initialValue);
			case AccountingPackage.AFTER_SALES_TRANSACTION_TYPE:
				return createAfterSalesTransactionTypeFromString(eDataType, initialValue);
			case AccountingPackage.BARCODE_TYPES:
				return createBarcodeTypesFromString(eDataType, initialValue);
			case AccountingPackage.BASE_PRICE_CLASS_TYPE:
				return createBasePriceClassTypeFromString(eDataType, initialValue);
			case AccountingPackage.CLASSIC_CLASS_TYPE:
				return createClassicClassTypeFromString(eDataType, initialValue);
			case AccountingPackage.CLASS_ID:
				return createClassIdFromString(eDataType, initialValue);
			case AccountingPackage.CHARACTER_SET:
				return createCharacterSetFromString(eDataType, initialValue);
			case AccountingPackage.CLUSTERS:
				return createClustersFromString(eDataType, initialValue);
			case AccountingPackage.COMBINATION_MODEL:
				return createCombinationModelFromString(eDataType, initialValue);
			case AccountingPackage.CONTROL_DATA_EXCHANGE_TYPES:
				return createControlDataExchangeTypesFromString(eDataType, initialValue);
			case AccountingPackage.DATA_SOURCE:
				return createDataSourceFromString(eDataType, initialValue);
			case AccountingPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case AccountingPackage.FARE_TYPE:
				return createFareTypeFromString(eDataType, initialValue);
			case AccountingPackage.FULFILLMENT_TYPE:
				return createFulfillmentTypeFromString(eDataType, initialValue);
			case AccountingPackage.GEO_SYSTEM:
				return createGeoSystemFromString(eDataType, initialValue);
			case AccountingPackage.GEO_UNIT:
				return createGeoUnitFromString(eDataType, initialValue);
			case AccountingPackage.GRAPHICAL_RESERVATION_TYPE:
				return createGraphicalReservationTypeFromString(eDataType, initialValue);
			case AccountingPackage.GENERIC_REDUCTION_CARDS:
				return createGenericReductionCardsFromString(eDataType, initialValue);
			case AccountingPackage.HEMISPHERE_EW:
				return createHemisphereEWFromString(eDataType, initialValue);
			case AccountingPackage.HEMISPHERE_NS:
				return createHemisphereNSFromString(eDataType, initialValue);
			case AccountingPackage.INTERFACE_TYPE:
				return createInterfaceTypeFromString(eDataType, initialValue);
			case AccountingPackage.LEGACY_CALCULATION_TYPE:
				return createLegacyCalculationTypeFromString(eDataType, initialValue);
			case AccountingPackage.LEGACY_PASSENGER_TYPE:
				return createLegacyPassengerTypeFromString(eDataType, initialValue);
			case AccountingPackage.LEGACY_SERIES_TYPE:
				return createLegacySeriesTypeFromString(eDataType, initialValue);
			case AccountingPackage.LEGACY_CONVERSION_TYPE:
				return createLegacyConversionTypeFromString(eDataType, initialValue);
			case AccountingPackage.OFFER_REQUEST_TYPE:
				return createOfferRequestTypeFromString(eDataType, initialValue);
			case AccountingPackage.ONLINE_SERVICE_TYPE:
				return createOnlineServiceTypeFromString(eDataType, initialValue);
			case AccountingPackage.PERSONAL_DATA_ITEMS_TYPE:
				return createPersonalDataItemsTypeFromString(eDataType, initialValue);
			case AccountingPackage.PERSONAL_DATA_TRANSFER_TYPE:
				return createPersonalDataTransferTypeFromString(eDataType, initialValue);
			case AccountingPackage.PERSONAL_DATA_CHANGE_REASON:
				return createPersonalDataChangeReasonFromString(eDataType, initialValue);
			case AccountingPackage.RESERVATION_TRAVEL_CLASS:
				return createReservationTravelClassFromString(eDataType, initialValue);
			case AccountingPackage.RESERVATION_SERVICE_LEVEL:
				return createReservationServiceLevelFromString(eDataType, initialValue);
			case AccountingPackage.RESERVATION_SERVICE:
				return createReservationServiceFromString(eDataType, initialValue);
			case AccountingPackage.RESERVATION_BERTH_TYPE:
				return createReservationBerthTypeFromString(eDataType, initialValue);
			case AccountingPackage.ROUNDING_TYPE:
				return createRoundingTypeFromString(eDataType, initialValue);
			case AccountingPackage.SCHEMA_VERSION:
				return createSchemaVersionFromString(eDataType, initialValue);
			case AccountingPackage.SERVICE_MODE:
				return createServiceModeFromString(eDataType, initialValue);
			case AccountingPackage.TIME_ZONE:
				return createTimeZoneFromString(eDataType, initialValue);
			case AccountingPackage.TAX_SCOPE:
				return createTaxScopeFromString(eDataType, initialValue);
			case AccountingPackage.TIME_REFERENCE_TYPE:
				return createTimeReferenceTypeFromString(eDataType, initialValue);
			case AccountingPackage.TIME_RANGE_SCOPE:
				return createTimeRangeScopeFromString(eDataType, initialValue);
			case AccountingPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case AccountingPackage.TRAVELER_TYPE:
				return createTravelerTypeFromString(eDataType, initialValue);
			case AccountingPackage.TRIP_ALLOCATION_PROCESS:
				return createTripAllocationProcessFromString(eDataType, initialValue);
			case AccountingPackage.TRIP_ALLOCATION_UNIT:
				return createTripAllocationUnitFromString(eDataType, initialValue);
			case AccountingPackage.TRIP_INTERRUPTION_PROCESS:
				return createTripInterruptionProcessFromString(eDataType, initialValue);
			case AccountingPackage.TRAVEL_VALIDITY_TYPE:
				return createTravelValidityTypeFromString(eDataType, initialValue);
			case AccountingPackage.WEEK_DAY:
				return createWeekDayFromString(eDataType, initialValue);
			case AccountingPackage.DATE_AS_DATE:
				return createDateAsDateFromString(eDataType, initialValue);
			case AccountingPackage.DATE_AS_DATE_TIME:
				return createDateAsDateTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AccountingPackage.PAYMENT_TYPE:
				return convertPaymentTypeToString(eDataType, instanceValue);
			case AccountingPackage.SALES_CHANNEL:
				return convertSalesChannelToString(eDataType, instanceValue);
			case AccountingPackage.TRANSACTION_TYPE:
				return convertTransactionTypeToString(eDataType, instanceValue);
			case AccountingPackage.ACCOUNTING_TYPE:
				return convertAccountingTypeToString(eDataType, instanceValue);
			case AccountingPackage.SETTLEMENT_VALUE_INDICATOR:
				return convertSettlementValueIndicatorToString(eDataType, instanceValue);
			case AccountingPackage.SALES_TYPE:
				return convertSalesTypeToString(eDataType, instanceValue);
			case AccountingPackage.TRANSACTION_STANDARD:
				return convertTransactionStandardToString(eDataType, instanceValue);
			case AccountingPackage.BOARDING_OR_ARRIVAL:
				return convertBoardingOrArrivalToString(eDataType, instanceValue);
			case AccountingPackage.LUGGAGE_RULE:
				return convertLuggageRuleToString(eDataType, instanceValue);
			case AccountingPackage.DIMENSION:
				return convertDimensionToString(eDataType, instanceValue);
			case AccountingPackage.ADD_CARRIER_SCOPE:
				return convertAddCarrierScopeToString(eDataType, instanceValue);
			case AccountingPackage.TRANSPORT_MODE:
				return convertTransportModeToString(eDataType, instanceValue);
			case AccountingPackage.STATION_RELATION_TYPE:
				return convertStationRelationTypeToString(eDataType, instanceValue);
			case AccountingPackage.STATION_FARE_DETAIL_TYPE:
				return convertStationFareDetailTypeToString(eDataType, instanceValue);
			case AccountingPackage.REGULATORY_CONDITION:
				return convertRegulatoryConditionToString(eDataType, instanceValue);
			case AccountingPackage.AFTER_SALES_TRANSACTION_TYPE:
				return convertAfterSalesTransactionTypeToString(eDataType, instanceValue);
			case AccountingPackage.BARCODE_TYPES:
				return convertBarcodeTypesToString(eDataType, instanceValue);
			case AccountingPackage.BASE_PRICE_CLASS_TYPE:
				return convertBasePriceClassTypeToString(eDataType, instanceValue);
			case AccountingPackage.CLASSIC_CLASS_TYPE:
				return convertClassicClassTypeToString(eDataType, instanceValue);
			case AccountingPackage.CLASS_ID:
				return convertClassIdToString(eDataType, instanceValue);
			case AccountingPackage.CHARACTER_SET:
				return convertCharacterSetToString(eDataType, instanceValue);
			case AccountingPackage.CLUSTERS:
				return convertClustersToString(eDataType, instanceValue);
			case AccountingPackage.COMBINATION_MODEL:
				return convertCombinationModelToString(eDataType, instanceValue);
			case AccountingPackage.CONTROL_DATA_EXCHANGE_TYPES:
				return convertControlDataExchangeTypesToString(eDataType, instanceValue);
			case AccountingPackage.DATA_SOURCE:
				return convertDataSourceToString(eDataType, instanceValue);
			case AccountingPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case AccountingPackage.FARE_TYPE:
				return convertFareTypeToString(eDataType, instanceValue);
			case AccountingPackage.FULFILLMENT_TYPE:
				return convertFulfillmentTypeToString(eDataType, instanceValue);
			case AccountingPackage.GEO_SYSTEM:
				return convertGeoSystemToString(eDataType, instanceValue);
			case AccountingPackage.GEO_UNIT:
				return convertGeoUnitToString(eDataType, instanceValue);
			case AccountingPackage.GRAPHICAL_RESERVATION_TYPE:
				return convertGraphicalReservationTypeToString(eDataType, instanceValue);
			case AccountingPackage.GENERIC_REDUCTION_CARDS:
				return convertGenericReductionCardsToString(eDataType, instanceValue);
			case AccountingPackage.HEMISPHERE_EW:
				return convertHemisphereEWToString(eDataType, instanceValue);
			case AccountingPackage.HEMISPHERE_NS:
				return convertHemisphereNSToString(eDataType, instanceValue);
			case AccountingPackage.INTERFACE_TYPE:
				return convertInterfaceTypeToString(eDataType, instanceValue);
			case AccountingPackage.LEGACY_CALCULATION_TYPE:
				return convertLegacyCalculationTypeToString(eDataType, instanceValue);
			case AccountingPackage.LEGACY_PASSENGER_TYPE:
				return convertLegacyPassengerTypeToString(eDataType, instanceValue);
			case AccountingPackage.LEGACY_SERIES_TYPE:
				return convertLegacySeriesTypeToString(eDataType, instanceValue);
			case AccountingPackage.LEGACY_CONVERSION_TYPE:
				return convertLegacyConversionTypeToString(eDataType, instanceValue);
			case AccountingPackage.OFFER_REQUEST_TYPE:
				return convertOfferRequestTypeToString(eDataType, instanceValue);
			case AccountingPackage.ONLINE_SERVICE_TYPE:
				return convertOnlineServiceTypeToString(eDataType, instanceValue);
			case AccountingPackage.PERSONAL_DATA_ITEMS_TYPE:
				return convertPersonalDataItemsTypeToString(eDataType, instanceValue);
			case AccountingPackage.PERSONAL_DATA_TRANSFER_TYPE:
				return convertPersonalDataTransferTypeToString(eDataType, instanceValue);
			case AccountingPackage.PERSONAL_DATA_CHANGE_REASON:
				return convertPersonalDataChangeReasonToString(eDataType, instanceValue);
			case AccountingPackage.RESERVATION_TRAVEL_CLASS:
				return convertReservationTravelClassToString(eDataType, instanceValue);
			case AccountingPackage.RESERVATION_SERVICE_LEVEL:
				return convertReservationServiceLevelToString(eDataType, instanceValue);
			case AccountingPackage.RESERVATION_SERVICE:
				return convertReservationServiceToString(eDataType, instanceValue);
			case AccountingPackage.RESERVATION_BERTH_TYPE:
				return convertReservationBerthTypeToString(eDataType, instanceValue);
			case AccountingPackage.ROUNDING_TYPE:
				return convertRoundingTypeToString(eDataType, instanceValue);
			case AccountingPackage.SCHEMA_VERSION:
				return convertSchemaVersionToString(eDataType, instanceValue);
			case AccountingPackage.SERVICE_MODE:
				return convertServiceModeToString(eDataType, instanceValue);
			case AccountingPackage.TIME_ZONE:
				return convertTimeZoneToString(eDataType, instanceValue);
			case AccountingPackage.TAX_SCOPE:
				return convertTaxScopeToString(eDataType, instanceValue);
			case AccountingPackage.TIME_REFERENCE_TYPE:
				return convertTimeReferenceTypeToString(eDataType, instanceValue);
			case AccountingPackage.TIME_RANGE_SCOPE:
				return convertTimeRangeScopeToString(eDataType, instanceValue);
			case AccountingPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case AccountingPackage.TRAVELER_TYPE:
				return convertTravelerTypeToString(eDataType, instanceValue);
			case AccountingPackage.TRIP_ALLOCATION_PROCESS:
				return convertTripAllocationProcessToString(eDataType, instanceValue);
			case AccountingPackage.TRIP_ALLOCATION_UNIT:
				return convertTripAllocationUnitToString(eDataType, instanceValue);
			case AccountingPackage.TRIP_INTERRUPTION_PROCESS:
				return convertTripInterruptionProcessToString(eDataType, instanceValue);
			case AccountingPackage.TRAVEL_VALIDITY_TYPE:
				return convertTravelValidityTypeToString(eDataType, instanceValue);
			case AccountingPackage.WEEK_DAY:
				return convertWeekDayToString(eDataType, instanceValue);
			case AccountingPackage.DATE_AS_DATE:
				return convertDateAsDateToString(eDataType, instanceValue);
			case AccountingPackage.DATE_AS_DATE_TIME:
				return convertDateAsDateTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingViewerData createAccountingViewerData() {
		AccountingViewerDataImpl accountingViewerData = new AccountingViewerDataImpl();
		return accountingViewerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFile createAccountingFile() {
		AccountingFileImpl accountingFile = new AccountingFileImpl();
		return accountingFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingRecords createAccountingRecords() {
		AccountingRecordsImpl accountingRecords = new AccountingRecordsImpl();
		return accountingRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingDelivery createAccountingDelivery() {
		AccountingDeliveryImpl accountingDelivery = new AccountingDeliveryImpl();
		return accountingDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingRecord createAccountingRecord() {
		AccountingRecordImpl accountingRecord = new AccountingRecordImpl();
		return accountingRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountedAmounts createAccountedAmounts() {
		AccountedAmountsImpl accountedAmounts = new AccountedAmountsImpl();
		return accountedAmounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingSubject createAccountingSubject() {
		AccountingSubjectImpl accountingSubject = new AccountingSubjectImpl();
		return accountingSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyDescription createLegacyDescription() {
		LegacyDescriptionImpl legacyDescription = new LegacyDescriptionImpl();
		return legacyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountedAmount createAccountedAmount() {
		AccountedAmountImpl accountedAmount = new AccountedAmountImpl();
		return accountedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLists createCodeLists() {
		CodeListsImpl codeLists = new CodeListsImpl();
		return codeLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowHistory createWorkflowHistory() {
		WorkflowHistoryImpl workflowHistory = new WorkflowHistoryImpl();
		return workflowHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowStep createWorkflowStep() {
		WorkflowStepImpl workflowStep = new WorkflowStepImpl();
		return workflowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUTSCodes createNUTSCodes() {
		NUTSCodesImpl nutsCodes = new NUTSCodesImpl();
		return nutsCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutsCode createNutsCode() {
		NutsCodeImpl nutsCode = new NutsCodeImpl();
		return nutsCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrands createServiceBrands() {
		ServiceBrandsImpl serviceBrands = new ServiceBrandsImpl();
		return serviceBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBrand createServiceBrand() {
		ServiceBrandImpl serviceBrand = new ServiceBrandImpl();
		return serviceBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Countries createCountries() {
		CountriesImpl countries = new CountriesImpl();
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages createLanguages() {
		LanguagesImpl languages = new LanguagesImpl();
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currencies createCurrencies() {
		CurrenciesImpl currencies = new CurrenciesImpl();
		return currencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrency() {
		CurrencyImpl currency = new CurrencyImpl();
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stations createStations() {
		StationsImpl stations = new StationsImpl();
		return stations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station createStation() {
		StationImpl station = new StationImpl();
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationRelation createStationRelation() {
		StationRelationImpl stationRelation = new StationRelationImpl();
		return stationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier createCarrier() {
		CarrierImpl carrier = new CarrierImpl();
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carriers createCarriers() {
		CarriersImpl carriers = new CarriersImpl();
		return carriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationSet createStationSet() {
		StationSetImpl stationSet = new StationSetImpl();
		return stationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralTariffModel createGeneralTariffModel() {
		GeneralTariffModelImpl generalTariffModel = new GeneralTariffModelImpl();
		return generalTariffModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delivery createDelivery() {
		DeliveryImpl delivery = new DeliveryImpl();
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesRules createAfterSalesRules() {
		AfterSalesRulesImpl afterSalesRules = new AfterSalesRulesImpl();
		return afterSalesRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesRule createAfterSalesRule() {
		AfterSalesRuleImpl afterSalesRule = new AfterSalesRuleImpl();
		return afterSalesRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesCondition createAfterSalesCondition() {
		AfterSalesConditionImpl afterSalesCondition = new AfterSalesConditionImpl();
		return afterSalesCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTime createApplicationTime() {
		ApplicationTimeImpl applicationTime = new ApplicationTimeImpl();
		return applicationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStructure createFareStructure() {
		FareStructureImpl fareStructure = new FareStructureImpl();
		return fareStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoints createConnectionPoints() {
		ConnectionPointsImpl connectionPoints = new ConnectionPointsImpl();
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint createConnectionPoint() {
		ConnectionPointImpl connectionPoint = new ConnectionPointImpl();
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareResourceLocations createFareResourceLocations() {
		FareResourceLocationsImpl fareResourceLocations = new FareResourceLocationsImpl();
		return fareResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainResourceLocations createTrainResourceLocations() {
		TrainResourceLocationsImpl trainResourceLocations = new TrainResourceLocationsImpl();
		return trainResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationResourceLocations createStationResourceLocations() {
		StationResourceLocationsImpl stationResourceLocations = new StationResourceLocationsImpl();
		return stationResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierResourceLocations createCarrierResourceLocations() {
		CarrierResourceLocationsImpl carrierResourceLocations = new CarrierResourceLocationsImpl();
		return carrierResourceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainResourceLocation createTrainResourceLocation() {
		TrainResourceLocationImpl trainResourceLocation = new TrainResourceLocationImpl();
		return trainResourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationResourceLocation createStationResourceLocation() {
		StationResourceLocationImpl stationResourceLocation = new StationResourceLocationImpl();
		return stationResourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierResourceLocation createCarrierResourceLocation() {
		CarrierResourceLocationImpl carrierResourceLocation = new CarrierResourceLocationImpl();
		return carrierResourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineResource createOnlineResource() {
		OnlineResourceImpl onlineResource = new OnlineResourceImpl();
		return onlineResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraints createFulfillmentConstraints() {
		FulfillmentConstraintsImpl fulfillmentConstraints = new FulfillmentConstraintsImpl();
		return fulfillmentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentConstraint createFulfillmentConstraint() {
		FulfillmentConstraintImpl fulfillmentConstraint = new FulfillmentConstraintImpl();
		return fulfillmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBarcodes createRequiredBarcodes() {
		RequiredBarcodesImpl requiredBarcodes = new RequiredBarcodesImpl();
		return requiredBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedBarcodes createAcceptedBarcodes() {
		AcceptedBarcodesImpl acceptedBarcodes = new AcceptedBarcodesImpl();
		return acceptedBarcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedOnlineServices createSupportedOnlineServices() {
		SupportedOnlineServicesImpl supportedOnlineServices = new SupportedOnlineServicesImpl();
		return supportedOnlineServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationNames createStationNames() {
		StationNamesImpl stationNames = new StationNamesImpl();
		return stationNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareElements createFareElements() {
		FareElementsImpl fareElements = new FareElementsImpl();
		return fareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareElement createFareElement() {
		FareElementImpl fareElement = new FareElementImpl();
		return fareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalPassengerCombinationConstraints createTotalPassengerCombinationConstraints() {
		TotalPassengerCombinationConstraintsImpl totalPassengerCombinationConstraints = new TotalPassengerCombinationConstraintsImpl();
		return totalPassengerCombinationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalPassengerCombinationConstraint createTotalPassengerCombinationConstraint() {
		TotalPassengerCombinationConstraintImpl totalPassengerCombinationConstraint = new TotalPassengerCombinationConstraintImpl();
		return totalPassengerCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareConstraintBundles createFareConstraintBundles() {
		FareConstraintBundlesImpl fareConstraintBundles = new FareConstraintBundlesImpl();
		return fareConstraintBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareConstraintBundle createFareConstraintBundle() {
		FareConstraintBundleImpl fareConstraintBundle = new FareConstraintBundleImpl();
		return fareConstraintBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStationSetDefinitions createFareStationSetDefinitions() {
		FareStationSetDefinitionsImpl fareStationSetDefinitions = new FareStationSetDefinitionsImpl();
		return fareStationSetDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareStationSetDefinition createFareStationSetDefinition() {
		FareStationSetDefinitionImpl fareStationSetDefinition = new FareStationSetDefinitionImpl();
		return fareStationSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyAccountingIdentifier createLegacyAccountingIdentifier() {
		LegacyAccountingIdentifierImpl legacyAccountingIdentifier = new LegacyAccountingIdentifierImpl();
		return legacyAccountingIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraints createPersonalDataConstraints() {
		PersonalDataConstraintsImpl personalDataConstraints = new PersonalDataConstraintsImpl();
		return personalDataConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraint createPersonalDataConstraint() {
		PersonalDataConstraintImpl personalDataConstraint = new PersonalDataConstraintImpl();
		return personalDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPersonalData createRequiredPersonalData() {
		RequiredPersonalDataImpl requiredPersonalData = new RequiredPersonalDataImpl();
		return requiredPersonalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedPersonalDataChanges createAllowedPersonalDataChanges() {
		AllowedPersonalDataChangesImpl allowedPersonalDataChanges = new AllowedPersonalDataChangesImpl();
		return allowedPersonalDataChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraints createPassengerConstraints() {
		PassengerConstraintsImpl passengerConstraints = new PassengerConstraintsImpl();
		return passengerConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraint createPassengerConstraint() {
		PassengerConstraintImpl passengerConstraint = new PassengerConstraintImpl();
		return passengerConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerCombinationConstraint createPassengerCombinationConstraint() {
		PassengerCombinationConstraintImpl passengerCombinationConstraint = new PassengerCombinationConstraintImpl();
		return passengerCombinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedFreePassengerLimit createIncludedFreePassengerLimit() {
		IncludedFreePassengerLimitImpl includedFreePassengerLimit = new IncludedFreePassengerLimitImpl();
		return includedFreePassengerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraints createCombinationConstraints() {
		CombinationConstraintsImpl combinationConstraints = new CombinationConstraintsImpl();
		return combinationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationConstraint createCombinationConstraint() {
		CombinationConstraintImpl combinationConstraint = new CombinationConstraintImpl();
		return combinationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraints createTravelValidityConstraints() {
		TravelValidityConstraintsImpl travelValidityConstraints = new TravelValidityConstraintsImpl();
		return travelValidityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraint createTravelValidityConstraint() {
		TravelValidityConstraintImpl travelValidityConstraint = new TravelValidityConstraintImpl();
		return travelValidityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainValidity createTrainValidity() {
		TrainValidityImpl trainValidity = new TrainValidityImpl();
		return trainValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraints createSalesAvailabilityConstraints() {
		SalesAvailabilityConstraintsImpl salesAvailabilityConstraints = new SalesAvailabilityConstraintsImpl();
		return salesAvailabilityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesAvailabilityConstraint createSalesAvailabilityConstraint() {
		SalesAvailabilityConstraintImpl salesAvailabilityConstraint = new SalesAvailabilityConstraintImpl();
		return salesAvailabilityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesRestriction createSalesRestriction() {
		SalesRestrictionImpl salesRestriction = new SalesRestrictionImpl();
		return salesRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfSale createEndOfSale() {
		EndOfSaleImpl endOfSale = new EndOfSaleImpl();
		return endOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfSale createStartOfSale() {
		StartOfSaleImpl startOfSale = new StartOfSaleImpl();
		return startOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraints createCarrierConstraints() {
		CarrierConstraintsImpl carrierConstraints = new CarrierConstraintsImpl();
		return carrierConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint createCarrierConstraint() {
		CarrierConstraintImpl carrierConstraint = new CarrierConstraintImpl();
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraints createServiceConstraints() {
		ServiceConstraintsImpl serviceConstraints = new ServiceConstraintsImpl();
		return serviceConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint createServiceConstraint() {
		ServiceConstraintImpl serviceConstraint = new ServiceConstraintImpl();
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraints createRegionalConstraints() {
		RegionalConstraintsImpl regionalConstraints = new RegionalConstraintsImpl();
		return regionalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraint createRegionalConstraint() {
		RegionalConstraintImpl regionalConstraint = new RegionalConstraintImpl();
		return regionalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalValidity createRegionalValidity() {
		RegionalValidityImpl regionalValidity = new RegionalValidityImpl();
		return regionalValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelDefinitions createServiceLevelDefinitions() {
		ServiceLevelDefinitionsImpl serviceLevelDefinitions = new ServiceLevelDefinitionsImpl();
		return serviceLevelDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texts createTexts() {
		TextsImpl texts = new TextsImpl();
		return texts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prices createPrices() {
		PricesImpl prices = new PricesImpl();
		return prices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price createPrice() {
		PriceImpl price = new PriceImpl();
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VATDetail createVATDetail() {
		VATDetailImpl vatDetail = new VATDetailImpl();
		return vatDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyPrice createCurrencyPrice() {
		CurrencyPriceImpl currencyPrice = new CurrencyPriceImpl();
		return currencyPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClassDefinitions createServiceClassDefinitions() {
		ServiceClassDefinitionsImpl serviceClassDefinitions = new ServiceClassDefinitionsImpl();
		return serviceClassDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendars createCalendars() {
		CalendarsImpl calendars = new CalendarsImpl();
		return calendars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameters createReservationParameters() {
		ReservationParametersImpl reservationParameters = new ReservationParametersImpl();
		return reservationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameter createReservationParameter() {
		ReservationParameterImpl reservationParameter = new ReservationParameterImpl();
		return reservationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParams9181 createReservationParams9181() {
		ReservationParams9181Impl reservationParams9181 = new ReservationParams9181Impl();
		return reservationParams9181;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationOptions createReservationOptions() {
		ReservationOptionsImpl reservationOptions = new ReservationOptionsImpl();
		return reservationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationPreferenceGroup createReservationPreferenceGroup() {
		ReservationPreferenceGroupImpl reservationPreferenceGroup = new ReservationPreferenceGroupImpl();
		return reservationPreferenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass createServiceClass() {
		ServiceClassImpl serviceClass = new ServiceClassImpl();
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevel createServiceLevel() {
		ServiceLevelImpl serviceLevel = new ServiceLevelImpl();
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRange createTimeRange() {
		TimeRangeImpl timeRange = new TimeRangeImpl();
		return timeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludedTimeRange createExcludedTimeRange() {
		ExcludedTimeRangeImpl excludedTimeRange = new ExcludedTimeRangeImpl();
		return excludedTimeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityRange createValidityRange() {
		ValidityRangeImpl validityRange = new ValidityRangeImpl();
		return validityRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTime createRelativeTime() {
		RelativeTimeImpl relativeTime = new RelativeTimeImpl();
		return relativeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValidityConstraint createReturnValidityConstraint() {
		ReturnValidityConstraintImpl returnValidityConstraint = new ReturnValidityConstraintImpl();
		return returnValidityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripAllocationConstraint createTripAllocationConstraint() {
		TripAllocationConstraintImpl tripAllocationConstraint = new TripAllocationConstraintImpl();
		return tripAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripInterruptionConstraint createTripInterruptionConstraint() {
		TripInterruptionConstraintImpl tripInterruptionConstraint = new TripInterruptionConstraintImpl();
		return tripInterruptionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViaStation createViaStation() {
		ViaStationImpl viaStation = new ViaStationImpl();
		return viaStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeRoute createAlternativeRoute() {
		AlternativeRouteImpl alternativeRoute = new AlternativeRouteImpl();
		return alternativeRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygone createPolygone() {
		PolygoneImpl polygone = new PolygoneImpl();
		return polygone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneDefinitions createZoneDefinitions() {
		ZoneDefinitionsImpl zoneDefinitions = new ZoneDefinitionsImpl();
		return zoneDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneDefinition createZoneDefinition() {
		ZoneDefinitionImpl zoneDefinition = new ZoneDefinitionImpl();
		return zoneDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossBorderCondition createCrossBorderCondition() {
		CrossBorderConditionImpl crossBorderCondition = new CrossBorderConditionImpl();
		return crossBorderCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareCombinationModel createFareCombinationModel() {
		FareCombinationModelImpl fareCombinationModel = new FareCombinationModelImpl();
		return fareCombinationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraints createReductionConstraints() {
		ReductionConstraintsImpl reductionConstraints = new ReductionConstraintsImpl();
		return reductionConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionConstraint createReductionConstraint() {
		ReductionConstraintImpl reductionConstraint = new ReductionConstraintImpl();
		return reductionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCards createReductionCards() {
		ReductionCardsImpl reductionCards = new ReductionCardsImpl();
		return reductionCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCard createReductionCard() {
		ReductionCardImpl reductionCard = new ReductionCardImpl();
		return reductionCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredReductionCard createRequiredReductionCard() {
		RequiredReductionCardImpl requiredReductionCard = new RequiredReductionCardImpl();
		return requiredReductionCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageConstraints createLuggageConstraints() {
		LuggageConstraintsImpl luggageConstraints = new LuggageConstraintsImpl();
		return luggageConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageConstraint createLuggageConstraint() {
		LuggageConstraintImpl luggageConstraint = new LuggageConstraintImpl();
		return luggageConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageItemsRestriction createLuggageItemsRestriction() {
		LuggageItemsRestrictionImpl luggageItemsRestriction = new LuggageItemsRestrictionImpl();
		return luggageItemsRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageDimension createLuggageDimension() {
		LuggageDimensionImpl luggageDimension = new LuggageDimensionImpl();
		return luggageDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCarrierRules createAddCarrierRules() {
		AddCarrierRulesImpl addCarrierRules = new AddCarrierRulesImpl();
		return addCarrierRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCarrierRule createAddCarrierRule() {
		AddCarrierRuleImpl addCarrierRule = new AddCarrierRuleImpl();
		return addCarrierRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnBorderStations createOnBorderStations() {
		OnBorderStationsImpl onBorderStations = new OnBorderStationsImpl();
		return onBorderStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType createPaymentTypeFromString(EDataType eDataType, String initialValue) {
		PaymentType result = PaymentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesChannel createSalesChannelFromString(EDataType eDataType, String initialValue) {
		SalesChannel result = SalesChannel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSalesChannelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionType createTransactionTypeFromString(EDataType eDataType, String initialValue) {
		TransactionType result = TransactionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingType createAccountingTypeFromString(EDataType eDataType, String initialValue) {
		AccountingType result = AccountingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettlementValueIndicator createSettlementValueIndicatorFromString(EDataType eDataType, String initialValue) {
		SettlementValueIndicator result = SettlementValueIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSettlementValueIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesType createSalesTypeFromString(EDataType eDataType, String initialValue) {
		SalesType result = SalesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSalesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionStandard createTransactionStandardFromString(EDataType eDataType, String initialValue) {
		TransactionStandard result = TransactionStandard.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionStandardToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardingOrArrival createBoardingOrArrivalFromString(EDataType eDataType, String initialValue) {
		BoardingOrArrival result = BoardingOrArrival.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoardingOrArrivalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageRule createLuggageRuleFromString(EDataType eDataType, String initialValue) {
		LuggageRule result = LuggageRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLuggageRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimensionFromString(EDataType eDataType, String initialValue) {
		Dimension result = Dimension.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCarrierScope createAddCarrierScopeFromString(EDataType eDataType, String initialValue) {
		AddCarrierScope result = AddCarrierScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddCarrierScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMode createTransportModeFromString(EDataType eDataType, String initialValue) {
		TransportMode result = TransportMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationRelationType createStationRelationTypeFromString(EDataType eDataType, String initialValue) {
		StationRelationType result = StationRelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStationRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationFareDetailType createStationFareDetailTypeFromString(EDataType eDataType, String initialValue) {
		StationFareDetailType result = StationFareDetailType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStationFareDetailTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatoryCondition createRegulatoryConditionFromString(EDataType eDataType, String initialValue) {
		RegulatoryCondition result = RegulatoryCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegulatoryConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterSalesTransactionType createAfterSalesTransactionTypeFromString(EDataType eDataType, String initialValue) {
		AfterSalesTransactionType result = AfterSalesTransactionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAfterSalesTransactionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarcodeTypes createBarcodeTypesFromString(EDataType eDataType, String initialValue) {
		BarcodeTypes result = BarcodeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBarcodeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePriceClassType createBasePriceClassTypeFromString(EDataType eDataType, String initialValue) {
		BasePriceClassType result = BasePriceClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasePriceClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicClassType createClassicClassTypeFromString(EDataType eDataType, String initialValue) {
		ClassicClassType result = ClassicClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassicClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassId createClassIdFromString(EDataType eDataType, String initialValue) {
		ClassId result = ClassId.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassIdToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSet createCharacterSetFromString(EDataType eDataType, String initialValue) {
		CharacterSet result = CharacterSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clusters createClustersFromString(EDataType eDataType, String initialValue) {
		Clusters result = Clusters.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClustersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationModel createCombinationModelFromString(EDataType eDataType, String initialValue) {
		CombinationModel result = CombinationModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCombinationModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlDataExchangeTypes createControlDataExchangeTypesFromString(EDataType eDataType, String initialValue) {
		ControlDataExchangeTypes result = ControlDataExchangeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlDataExchangeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSourceFromString(EDataType eDataType, String initialValue) {
		DataSource result = DataSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareType createFareTypeFromString(EDataType eDataType, String initialValue) {
		FareType result = FareType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFareTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentType createFulfillmentTypeFromString(EDataType eDataType, String initialValue) {
		FulfillmentType result = FulfillmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFulfillmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoSystem createGeoSystemFromString(EDataType eDataType, String initialValue) {
		GeoSystem result = GeoSystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoSystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoUnit createGeoUnitFromString(EDataType eDataType, String initialValue) {
		GeoUnit result = GeoUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalReservationType createGraphicalReservationTypeFromString(EDataType eDataType, String initialValue) {
		GraphicalReservationType result = GraphicalReservationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphicalReservationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericReductionCards createGenericReductionCardsFromString(EDataType eDataType, String initialValue) {
		GenericReductionCards result = GenericReductionCards.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericReductionCardsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HemisphereEW createHemisphereEWFromString(EDataType eDataType, String initialValue) {
		HemisphereEW result = HemisphereEW.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHemisphereEWToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HemisphereNS createHemisphereNSFromString(EDataType eDataType, String initialValue) {
		HemisphereNS result = HemisphereNS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHemisphereNSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceType result = InterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyCalculationType createLegacyCalculationTypeFromString(EDataType eDataType, String initialValue) {
		LegacyCalculationType result = LegacyCalculationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegacyCalculationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyPassengerType createLegacyPassengerTypeFromString(EDataType eDataType, String initialValue) {
		LegacyPassengerType result = LegacyPassengerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegacyPassengerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacySeriesType createLegacySeriesTypeFromString(EDataType eDataType, String initialValue) {
		LegacySeriesType result = LegacySeriesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegacySeriesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyConversionType createLegacyConversionTypeFromString(EDataType eDataType, String initialValue) {
		LegacyConversionType result = LegacyConversionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegacyConversionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferRequestType createOfferRequestTypeFromString(EDataType eDataType, String initialValue) {
		OfferRequestType result = OfferRequestType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOfferRequestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineServiceType createOnlineServiceTypeFromString(EDataType eDataType, String initialValue) {
		OnlineServiceType result = OnlineServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnlineServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataItemsType createPersonalDataItemsTypeFromString(EDataType eDataType, String initialValue) {
		PersonalDataItemsType result = PersonalDataItemsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonalDataItemsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataTransferType createPersonalDataTransferTypeFromString(EDataType eDataType, String initialValue) {
		PersonalDataTransferType result = PersonalDataTransferType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonalDataTransferTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataChangeReason createPersonalDataChangeReasonFromString(EDataType eDataType, String initialValue) {
		PersonalDataChangeReason result = PersonalDataChangeReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonalDataChangeReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationTravelClass createReservationTravelClassFromString(EDataType eDataType, String initialValue) {
		ReservationTravelClass result = ReservationTravelClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationTravelClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationServiceLevel createReservationServiceLevelFromString(EDataType eDataType, String initialValue) {
		ReservationServiceLevel result = ReservationServiceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationServiceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationService createReservationServiceFromString(EDataType eDataType, String initialValue) {
		ReservationService result = ReservationService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationBerthType createReservationBerthTypeFromString(EDataType eDataType, String initialValue) {
		ReservationBerthType result = ReservationBerthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservationBerthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundingType createRoundingTypeFromString(EDataType eDataType, String initialValue) {
		RoundingType result = RoundingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoundingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion createSchemaVersionFromString(EDataType eDataType, String initialValue) {
		SchemaVersion result = SchemaVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMode createServiceModeFromString(EDataType eDataType, String initialValue) {
		ServiceMode result = ServiceMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeZone createTimeZoneFromString(EDataType eDataType, String initialValue) {
		TimeZone result = TimeZone.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeZoneToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxScope createTaxScopeFromString(EDataType eDataType, String initialValue) {
		TaxScope result = TaxScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeReferenceType createTimeReferenceTypeFromString(EDataType eDataType, String initialValue) {
		TimeReferenceType result = TimeReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRangeScope createTimeRangeScopeFromString(EDataType eDataType, String initialValue) {
		TimeRangeScope result = TimeRangeScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeRangeScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelerType createTravelerTypeFromString(EDataType eDataType, String initialValue) {
		TravelerType result = TravelerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTravelerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripAllocationProcess createTripAllocationProcessFromString(EDataType eDataType, String initialValue) {
		TripAllocationProcess result = TripAllocationProcess.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTripAllocationProcessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripAllocationUnit createTripAllocationUnitFromString(EDataType eDataType, String initialValue) {
		TripAllocationUnit result = TripAllocationUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTripAllocationUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripInterruptionProcess createTripInterruptionProcessFromString(EDataType eDataType, String initialValue) {
		TripInterruptionProcess result = TripInterruptionProcess.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTripInterruptionProcessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityType createTravelValidityTypeFromString(EDataType eDataType, String initialValue) {
		TravelValidityType result = TravelValidityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTravelValidityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDay createWeekDayFromString(EDataType eDataType, String initialValue) {
		WeekDay result = WeekDay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekDayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateAsDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateAsDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateAsDateTimeFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateAsDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingPackage getAccountingPackage() {
		return (AccountingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccountingPackage getPackage() {
		return AccountingPackage.eINSTANCE;
	}

} //AccountingFactoryImpl
