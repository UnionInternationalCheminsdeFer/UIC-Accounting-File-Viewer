/**
 */
package Accounting.util;

import Accounting.*;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Accounting.AccountingPackage
 * @generated
 */
public class AccountingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AccountingValidator INSTANCE = new AccountingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Accounting";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AccountingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA:
				return validateAccountingViewerData((AccountingViewerData)value, diagnostics, context);
			case AccountingPackage.ACCOUNTING_FILE:
				return validateAccountingFile((AccountingFile)value, diagnostics, context);
			case AccountingPackage.ACCOUNTING_RECORDS:
				return validateAccountingRecords((AccountingRecords)value, diagnostics, context);
			case AccountingPackage.ACCOUNTING_DELIVERY:
				return validateAccountingDelivery((AccountingDelivery)value, diagnostics, context);
			case AccountingPackage.ACCOUNTING_RECORD:
				return validateAccountingRecord((AccountingRecord)value, diagnostics, context);
			case AccountingPackage.ACCOUNTED_AMOUNTS:
				return validateAccountedAmounts((AccountedAmounts)value, diagnostics, context);
			case AccountingPackage.ACCOUNTING_SUBJECT:
				return validateAccountingSubject((AccountingSubject)value, diagnostics, context);
			case AccountingPackage.LEGACY_DESCRIPTION:
				return validateLegacyDescription((LegacyDescription)value, diagnostics, context);
			case AccountingPackage.TRANSACTION:
				return validateTransaction((Transaction)value, diagnostics, context);
			case AccountingPackage.ACCOUNTED_AMOUNT:
				return validateAccountedAmount((AccountedAmount)value, diagnostics, context);
			case AccountingPackage.CODE_LISTS:
				return validateCodeLists((CodeLists)value, diagnostics, context);
			case AccountingPackage.WORKFLOW_HISTORY:
				return validateWorkflowHistory((WorkflowHistory)value, diagnostics, context);
			case AccountingPackage.WORKFLOW_STEP:
				return validateWorkflowStep((WorkflowStep)value, diagnostics, context);
			case AccountingPackage.NUTS_CODES:
				return validateNUTSCodes((NUTSCodes)value, diagnostics, context);
			case AccountingPackage.NUTS_CODE:
				return validateNutsCode((NutsCode)value, diagnostics, context);
			case AccountingPackage.SERVICE_BRANDS:
				return validateServiceBrands((ServiceBrands)value, diagnostics, context);
			case AccountingPackage.SERVICE_BRAND:
				return validateServiceBrand((ServiceBrand)value, diagnostics, context);
			case AccountingPackage.COUNTRIES:
				return validateCountries((Countries)value, diagnostics, context);
			case AccountingPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case AccountingPackage.LANGUAGES:
				return validateLanguages((Languages)value, diagnostics, context);
			case AccountingPackage.LANGUAGE:
				return validateLanguage((Language)value, diagnostics, context);
			case AccountingPackage.CURRENCIES:
				return validateCurrencies((Currencies)value, diagnostics, context);
			case AccountingPackage.CURRENCY:
				return validateCurrency((Currency)value, diagnostics, context);
			case AccountingPackage.STATIONS:
				return validateStations((Stations)value, diagnostics, context);
			case AccountingPackage.STATION:
				return validateStation((Station)value, diagnostics, context);
			case AccountingPackage.CARRIER:
				return validateCarrier((Carrier)value, diagnostics, context);
			case AccountingPackage.CARRIERS:
				return validateCarriers((Carriers)value, diagnostics, context);
			case AccountingPackage.STATION_SET:
				return validateStationSet((StationSet)value, diagnostics, context);
			case AccountingPackage.GENERAL_TARIFF_MODEL:
				return validateGeneralTariffModel((GeneralTariffModel)value, diagnostics, context);
			case AccountingPackage.DELIVERY:
				return validateDelivery((Delivery)value, diagnostics, context);
			case AccountingPackage.AFTER_SALES_RULES:
				return validateAfterSalesRules((AfterSalesRules)value, diagnostics, context);
			case AccountingPackage.AFTER_SALES_RULE:
				return validateAfterSalesRule((AfterSalesRule)value, diagnostics, context);
			case AccountingPackage.AFTER_SALES_CONDITION:
				return validateAfterSalesCondition((AfterSalesCondition)value, diagnostics, context);
			case AccountingPackage.APPLICATION_TIME:
				return validateApplicationTime((ApplicationTime)value, diagnostics, context);
			case AccountingPackage.FARE_STRUCTURE:
				return validateFareStructure((FareStructure)value, diagnostics, context);
			case AccountingPackage.CONNECTION_POINTS:
				return validateConnectionPoints((ConnectionPoints)value, diagnostics, context);
			case AccountingPackage.CONNECTION_POINT:
				return validateConnectionPoint((ConnectionPoint)value, diagnostics, context);
			case AccountingPackage.FARE_RESOURCE_LOCATIONS:
				return validateFareResourceLocations((FareResourceLocations)value, diagnostics, context);
			case AccountingPackage.TRAIN_RESOURCE_LOCATIONS:
				return validateTrainResourceLocations((TrainResourceLocations)value, diagnostics, context);
			case AccountingPackage.STATION_RESOURCE_LOCATIONS:
				return validateStationResourceLocations((StationResourceLocations)value, diagnostics, context);
			case AccountingPackage.CARRIER_RESOURCE_LOCATIONS:
				return validateCarrierResourceLocations((CarrierResourceLocations)value, diagnostics, context);
			case AccountingPackage.TRAIN_RESOURCE_LOCATION:
				return validateTrainResourceLocation((TrainResourceLocation)value, diagnostics, context);
			case AccountingPackage.STATION_RESOURCE_LOCATION:
				return validateStationResourceLocation((StationResourceLocation)value, diagnostics, context);
			case AccountingPackage.CARRIER_RESOURCE_LOCATION:
				return validateCarrierResourceLocation((CarrierResourceLocation)value, diagnostics, context);
			case AccountingPackage.ONLINE_RESOURCE:
				return validateOnlineResource((OnlineResource)value, diagnostics, context);
			case AccountingPackage.FULFILLMENT_CONSTRAINTS:
				return validateFulfillmentConstraints((FulfillmentConstraints)value, diagnostics, context);
			case AccountingPackage.FULFILLMENT_CONSTRAINT:
				return validateFulfillmentConstraint((FulfillmentConstraint)value, diagnostics, context);
			case AccountingPackage.REQUIRED_BARCODES:
				return validateRequiredBarcodes((RequiredBarcodes)value, diagnostics, context);
			case AccountingPackage.ACCEPTED_BARCODES:
				return validateAcceptedBarcodes((AcceptedBarcodes)value, diagnostics, context);
			case AccountingPackage.SUPPORTED_ONLINE_SERVICES:
				return validateSupportedOnlineServices((SupportedOnlineServices)value, diagnostics, context);
			case AccountingPackage.STATION_NAMES:
				return validateStationNames((StationNames)value, diagnostics, context);
			case AccountingPackage.FARE_ELEMENTS:
				return validateFareElements((FareElements)value, diagnostics, context);
			case AccountingPackage.FARE_ELEMENT:
				return validateFareElement((FareElement)value, diagnostics, context);
			case AccountingPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINTS:
				return validateTotalPassengerCombinationConstraints((TotalPassengerCombinationConstraints)value, diagnostics, context);
			case AccountingPackage.TOTAL_PASSENGER_COMBINATION_CONSTRAINT:
				return validateTotalPassengerCombinationConstraint((TotalPassengerCombinationConstraint)value, diagnostics, context);
			case AccountingPackage.FARE_CONSTRAINT_BUNDLES:
				return validateFareConstraintBundles((FareConstraintBundles)value, diagnostics, context);
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE:
				return validateFareConstraintBundle((FareConstraintBundle)value, diagnostics, context);
			case AccountingPackage.FARE_STATION_SET_DEFINITIONS:
				return validateFareStationSetDefinitions((FareStationSetDefinitions)value, diagnostics, context);
			case AccountingPackage.FARE_STATION_SET_DEFINITION:
				return validateFareStationSetDefinition((FareStationSetDefinition)value, diagnostics, context);
			case AccountingPackage.LEGACY_ACCOUNTING_IDENTIFIER:
				return validateLegacyAccountingIdentifier((LegacyAccountingIdentifier)value, diagnostics, context);
			case AccountingPackage.PERSONAL_DATA_CONSTRAINTS:
				return validatePersonalDataConstraints((PersonalDataConstraints)value, diagnostics, context);
			case AccountingPackage.PERSONAL_DATA_CONSTRAINT:
				return validatePersonalDataConstraint((PersonalDataConstraint)value, diagnostics, context);
			case AccountingPackage.REQUIRED_PERSONAL_DATA:
				return validateRequiredPersonalData((RequiredPersonalData)value, diagnostics, context);
			case AccountingPackage.ALLOWED_PERSONAL_DATA_CHANGES:
				return validateAllowedPersonalDataChanges((AllowedPersonalDataChanges)value, diagnostics, context);
			case AccountingPackage.PASSENGER_CONSTRAINTS:
				return validatePassengerConstraints((PassengerConstraints)value, diagnostics, context);
			case AccountingPackage.PASSENGER_CONSTRAINT:
				return validatePassengerConstraint((PassengerConstraint)value, diagnostics, context);
			case AccountingPackage.PASSENGER_COMBINATION_CONSTRAINT:
				return validatePassengerCombinationConstraint((PassengerCombinationConstraint)value, diagnostics, context);
			case AccountingPackage.INCLUDED_FREE_PASSENGER_LIMIT:
				return validateIncludedFreePassengerLimit((IncludedFreePassengerLimit)value, diagnostics, context);
			case AccountingPackage.COMBINATION_CONSTRAINTS:
				return validateCombinationConstraints((CombinationConstraints)value, diagnostics, context);
			case AccountingPackage.COMBINATION_CONSTRAINT:
				return validateCombinationConstraint((CombinationConstraint)value, diagnostics, context);
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINTS:
				return validateTravelValidityConstraints((TravelValidityConstraints)value, diagnostics, context);
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT:
				return validateTravelValidityConstraint((TravelValidityConstraint)value, diagnostics, context);
			case AccountingPackage.TRAIN_VALIDITY:
				return validateTrainValidity((TrainValidity)value, diagnostics, context);
			case AccountingPackage.SALES_AVAILABILITY_CONSTRAINTS:
				return validateSalesAvailabilityConstraints((SalesAvailabilityConstraints)value, diagnostics, context);
			case AccountingPackage.SALES_AVAILABILITY_CONSTRAINT:
				return validateSalesAvailabilityConstraint((SalesAvailabilityConstraint)value, diagnostics, context);
			case AccountingPackage.SALES_RESTRICTION:
				return validateSalesRestriction((SalesRestriction)value, diagnostics, context);
			case AccountingPackage.END_OF_SALE:
				return validateEndOfSale((EndOfSale)value, diagnostics, context);
			case AccountingPackage.START_OF_SALE:
				return validateStartOfSale((StartOfSale)value, diagnostics, context);
			case AccountingPackage.CARRIER_CONSTRAINTS:
				return validateCarrierConstraints((CarrierConstraints)value, diagnostics, context);
			case AccountingPackage.CARRIER_CONSTRAINT:
				return validateCarrierConstraint((CarrierConstraint)value, diagnostics, context);
			case AccountingPackage.SERVICE_CONSTRAINTS:
				return validateServiceConstraints((ServiceConstraints)value, diagnostics, context);
			case AccountingPackage.SERVICE_CONSTRAINT:
				return validateServiceConstraint((ServiceConstraint)value, diagnostics, context);
			case AccountingPackage.REGIONAL_CONSTRAINTS:
				return validateRegionalConstraints((RegionalConstraints)value, diagnostics, context);
			case AccountingPackage.REGIONAL_CONSTRAINT:
				return validateRegionalConstraint((RegionalConstraint)value, diagnostics, context);
			case AccountingPackage.REGIONAL_VALIDITY:
				return validateRegionalValidity((RegionalValidity)value, diagnostics, context);
			case AccountingPackage.SERVICE_LEVEL_DEFINITIONS:
				return validateServiceLevelDefinitions((ServiceLevelDefinitions)value, diagnostics, context);
			case AccountingPackage.TEXTS:
				return validateTexts((Texts)value, diagnostics, context);
			case AccountingPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case AccountingPackage.TRANSLATION:
				return validateTranslation((Translation)value, diagnostics, context);
			case AccountingPackage.PRICES:
				return validatePrices((Prices)value, diagnostics, context);
			case AccountingPackage.PRICE:
				return validatePrice((Price)value, diagnostics, context);
			case AccountingPackage.VAT_DETAIL:
				return validateVATDetail((VATDetail)value, diagnostics, context);
			case AccountingPackage.CURRENCY_PRICE:
				return validateCurrencyPrice((CurrencyPrice)value, diagnostics, context);
			case AccountingPackage.SERVICE_CLASS_DEFINITIONS:
				return validateServiceClassDefinitions((ServiceClassDefinitions)value, diagnostics, context);
			case AccountingPackage.CALENDARS:
				return validateCalendars((Calendars)value, diagnostics, context);
			case AccountingPackage.CALENDAR:
				return validateCalendar((Calendar)value, diagnostics, context);
			case AccountingPackage.RESERVATION_PARAMETERS:
				return validateReservationParameters((ReservationParameters)value, diagnostics, context);
			case AccountingPackage.RESERVATION_PARAMETER:
				return validateReservationParameter((ReservationParameter)value, diagnostics, context);
			case AccountingPackage.RESERVATION_PARAMS9181:
				return validateReservationParams9181((ReservationParams9181)value, diagnostics, context);
			case AccountingPackage.RESERVATION_OPTIONS:
				return validateReservationOptions((ReservationOptions)value, diagnostics, context);
			case AccountingPackage.RESERVATION_PREFERENCE_GROUP:
				return validateReservationPreferenceGroup((ReservationPreferenceGroup)value, diagnostics, context);
			case AccountingPackage.SERVICE_CLASS:
				return validateServiceClass((ServiceClass)value, diagnostics, context);
			case AccountingPackage.SERVICE_LEVEL:
				return validateServiceLevel((ServiceLevel)value, diagnostics, context);
			case AccountingPackage.TIME_RANGE:
				return validateTimeRange((TimeRange)value, diagnostics, context);
			case AccountingPackage.EXCLUDED_TIME_RANGE:
				return validateExcludedTimeRange((ExcludedTimeRange)value, diagnostics, context);
			case AccountingPackage.VALIDITY_RANGE:
				return validateValidityRange((ValidityRange)value, diagnostics, context);
			case AccountingPackage.RELATIVE_TIME:
				return validateRelativeTime((RelativeTime)value, diagnostics, context);
			case AccountingPackage.RETURN_VALIDITY_CONSTRAINT:
				return validateReturnValidityConstraint((ReturnValidityConstraint)value, diagnostics, context);
			case AccountingPackage.TRIP_ALLOCATION_CONSTRAINT:
				return validateTripAllocationConstraint((TripAllocationConstraint)value, diagnostics, context);
			case AccountingPackage.TRIP_INTERRUPTION_CONSTRAINT:
				return validateTripInterruptionConstraint((TripInterruptionConstraint)value, diagnostics, context);
			case AccountingPackage.VIA_STATION:
				return validateViaStation((ViaStation)value, diagnostics, context);
			case AccountingPackage.ALTERNATIVE_ROUTE:
				return validateAlternativeRoute((AlternativeRoute)value, diagnostics, context);
			case AccountingPackage.ROUTE:
				return validateRoute((Route)value, diagnostics, context);
			case AccountingPackage.ZONE:
				return validateZone((Zone)value, diagnostics, context);
			case AccountingPackage.LINE:
				return validateLine((Line)value, diagnostics, context);
			case AccountingPackage.POLYGONE:
				return validatePolygone((Polygone)value, diagnostics, context);
			case AccountingPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case AccountingPackage.ZONE_DEFINITIONS:
				return validateZoneDefinitions((ZoneDefinitions)value, diagnostics, context);
			case AccountingPackage.ZONE_DEFINITION:
				return validateZoneDefinition((ZoneDefinition)value, diagnostics, context);
			case AccountingPackage.CROSS_BORDER_CONDITION:
				return validateCrossBorderCondition((CrossBorderCondition)value, diagnostics, context);
			case AccountingPackage.FARE_COMBINATION_MODEL:
				return validateFareCombinationModel((FareCombinationModel)value, diagnostics, context);
			case AccountingPackage.REDUCTION_CONSTRAINTS:
				return validateReductionConstraints((ReductionConstraints)value, diagnostics, context);
			case AccountingPackage.REDUCTION_CONSTRAINT:
				return validateReductionConstraint((ReductionConstraint)value, diagnostics, context);
			case AccountingPackage.REDUCTION_CARDS:
				return validateReductionCards((ReductionCards)value, diagnostics, context);
			case AccountingPackage.REDUCTION_CARD:
				return validateReductionCard((ReductionCard)value, diagnostics, context);
			case AccountingPackage.REQUIRED_REDUCTION_CARD:
				return validateRequiredReductionCard((RequiredReductionCard)value, diagnostics, context);
			case AccountingPackage.LUGGAGE_CONSTRAINTS:
				return validateLuggageConstraints((LuggageConstraints)value, diagnostics, context);
			case AccountingPackage.LUGGAGE_CONSTRAINT:
				return validateLuggageConstraint((LuggageConstraint)value, diagnostics, context);
			case AccountingPackage.LUGGAGE_ITEMS_RESTRICTION:
				return validateLuggageItemsRestriction((LuggageItemsRestriction)value, diagnostics, context);
			case AccountingPackage.LUGGAGE_DIMENSION:
				return validateLuggageDimension((LuggageDimension)value, diagnostics, context);
			case AccountingPackage.ADD_CARRIER_RULES:
				return validateAddCarrierRules((AddCarrierRules)value, diagnostics, context);
			case AccountingPackage.ADD_CARRIER_RULE:
				return validateAddCarrierRule((AddCarrierRule)value, diagnostics, context);
			case AccountingPackage.ON_BORDER_STATIONS:
				return validateOnBorderStations((OnBorderStations)value, diagnostics, context);
			case AccountingPackage.PAYMENT_TYPE:
				return validatePaymentType((PaymentType)value, diagnostics, context);
			case AccountingPackage.SALES_CHANNEL:
				return validateSalesChannel((SalesChannel)value, diagnostics, context);
			case AccountingPackage.TRANSACTION_TYPE:
				return validateTransactionType((TransactionType)value, diagnostics, context);
			case AccountingPackage.ACCOUNTING_TYPE:
				return validateAccountingType((AccountingType)value, diagnostics, context);
			case AccountingPackage.SETTLEMENT_VALUE_INDICATOR:
				return validateSettlementValueIndicator((SettlementValueIndicator)value, diagnostics, context);
			case AccountingPackage.SALES_TYPE:
				return validateSalesType((SalesType)value, diagnostics, context);
			case AccountingPackage.TRANSACTION_STANDARD:
				return validateTransactionStandard((TransactionStandard)value, diagnostics, context);
			case AccountingPackage.BOARDING_OR_ARRIVAL:
				return validateBoardingOrArrival((BoardingOrArrival)value, diagnostics, context);
			case AccountingPackage.LUGGAGE_RULE:
				return validateLuggageRule((LuggageRule)value, diagnostics, context);
			case AccountingPackage.DIMENSION:
				return validateDimension((Dimension)value, diagnostics, context);
			case AccountingPackage.ADD_CARRIER_SCOPE:
				return validateAddCarrierScope((AddCarrierScope)value, diagnostics, context);
			case AccountingPackage.TRANSPORT_MODE:
				return validateTransportMode((TransportMode)value, diagnostics, context);
			case AccountingPackage.STATION_RELATION_TYPE:
				return validateStationRelationType((StationRelationType)value, diagnostics, context);
			case AccountingPackage.STATION_FARE_DETAIL_TYPE:
				return validateStationFareDetailType((StationFareDetailType)value, diagnostics, context);
			case AccountingPackage.REGULATORY_CONDITION:
				return validateRegulatoryCondition((RegulatoryCondition)value, diagnostics, context);
			case AccountingPackage.AFTER_SALES_TRANSACTION_TYPE:
				return validateAfterSalesTransactionType((AfterSalesTransactionType)value, diagnostics, context);
			case AccountingPackage.BARCODE_TYPES:
				return validateBarcodeTypes((BarcodeTypes)value, diagnostics, context);
			case AccountingPackage.BASE_PRICE_CLASS_TYPE:
				return validateBasePriceClassType((BasePriceClassType)value, diagnostics, context);
			case AccountingPackage.CLASSIC_CLASS_TYPE:
				return validateClassicClassType((ClassicClassType)value, diagnostics, context);
			case AccountingPackage.CLASS_ID:
				return validateClassId((ClassId)value, diagnostics, context);
			case AccountingPackage.CHARACTER_SET:
				return validateCharacterSet((CharacterSet)value, diagnostics, context);
			case AccountingPackage.CLUSTERS:
				return validateClusters((Clusters)value, diagnostics, context);
			case AccountingPackage.COMBINATION_MODEL:
				return validateCombinationModel((CombinationModel)value, diagnostics, context);
			case AccountingPackage.CONTROL_DATA_EXCHANGE_TYPES:
				return validateControlDataExchangeTypes((ControlDataExchangeTypes)value, diagnostics, context);
			case AccountingPackage.DATA_SOURCE:
				return validateDataSource((DataSource)value, diagnostics, context);
			case AccountingPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case AccountingPackage.FARE_TYPE:
				return validateFareType((FareType)value, diagnostics, context);
			case AccountingPackage.FULFILLMENT_TYPE:
				return validateFulfillmentType((FulfillmentType)value, diagnostics, context);
			case AccountingPackage.GEO_SYSTEM:
				return validateGeoSystem((GeoSystem)value, diagnostics, context);
			case AccountingPackage.GEO_UNIT:
				return validateGeoUnit((GeoUnit)value, diagnostics, context);
			case AccountingPackage.GRAPHICAL_RESERVATION_TYPE:
				return validateGraphicalReservationType((GraphicalReservationType)value, diagnostics, context);
			case AccountingPackage.GENERIC_REDUCTION_CARDS:
				return validateGenericReductionCards((GenericReductionCards)value, diagnostics, context);
			case AccountingPackage.HEMISPHERE_EW:
				return validateHemisphereEW((HemisphereEW)value, diagnostics, context);
			case AccountingPackage.HEMISPHERE_NS:
				return validateHemisphereNS((HemisphereNS)value, diagnostics, context);
			case AccountingPackage.INTERFACE_TYPE:
				return validateInterfaceType((InterfaceType)value, diagnostics, context);
			case AccountingPackage.LEGACY_CALCULATION_TYPE:
				return validateLegacyCalculationType((LegacyCalculationType)value, diagnostics, context);
			case AccountingPackage.LEGACY_PASSENGER_TYPE:
				return validateLegacyPassengerType((LegacyPassengerType)value, diagnostics, context);
			case AccountingPackage.LEGACY_SERIES_TYPE:
				return validateLegacySeriesType((LegacySeriesType)value, diagnostics, context);
			case AccountingPackage.LEGACY_CONVERSION_TYPE:
				return validateLegacyConversionType((LegacyConversionType)value, diagnostics, context);
			case AccountingPackage.OFFER_REQUEST_TYPE:
				return validateOfferRequestType((OfferRequestType)value, diagnostics, context);
			case AccountingPackage.ONLINE_SERVICE_TYPE:
				return validateOnlineServiceType((OnlineServiceType)value, diagnostics, context);
			case AccountingPackage.PERSONAL_DATA_ITEMS_TYPE:
				return validatePersonalDataItemsType((PersonalDataItemsType)value, diagnostics, context);
			case AccountingPackage.PERSONAL_DATA_TRANSFER_TYPE:
				return validatePersonalDataTransferType((PersonalDataTransferType)value, diagnostics, context);
			case AccountingPackage.PERSONAL_DATA_CHANGE_REASON:
				return validatePersonalDataChangeReason((PersonalDataChangeReason)value, diagnostics, context);
			case AccountingPackage.RESERVATION_TRAVEL_CLASS:
				return validateReservationTravelClass((ReservationTravelClass)value, diagnostics, context);
			case AccountingPackage.RESERVATION_SERVICE_LEVEL:
				return validateReservationServiceLevel((ReservationServiceLevel)value, diagnostics, context);
			case AccountingPackage.RESERVATION_SERVICE:
				return validateReservationService((ReservationService)value, diagnostics, context);
			case AccountingPackage.RESERVATION_BERTH_TYPE:
				return validateReservationBerthType((ReservationBerthType)value, diagnostics, context);
			case AccountingPackage.ROUNDING_TYPE:
				return validateRoundingType((RoundingType)value, diagnostics, context);
			case AccountingPackage.SCHEMA_VERSION:
				return validateSchemaVersion((SchemaVersion)value, diagnostics, context);
			case AccountingPackage.SERVICE_MODE:
				return validateServiceMode((ServiceMode)value, diagnostics, context);
			case AccountingPackage.TIME_ZONE:
				return validateTimeZone((TimeZone)value, diagnostics, context);
			case AccountingPackage.TAX_SCOPE:
				return validateTaxScope((TaxScope)value, diagnostics, context);
			case AccountingPackage.TIME_REFERENCE_TYPE:
				return validateTimeReferenceType((TimeReferenceType)value, diagnostics, context);
			case AccountingPackage.TIME_RANGE_SCOPE:
				return validateTimeRangeScope((TimeRangeScope)value, diagnostics, context);
			case AccountingPackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case AccountingPackage.TRAVELER_TYPE:
				return validateTravelerType((TravelerType)value, diagnostics, context);
			case AccountingPackage.TRIP_ALLOCATION_PROCESS:
				return validateTripAllocationProcess((TripAllocationProcess)value, diagnostics, context);
			case AccountingPackage.TRIP_ALLOCATION_UNIT:
				return validateTripAllocationUnit((TripAllocationUnit)value, diagnostics, context);
			case AccountingPackage.TRIP_INTERRUPTION_PROCESS:
				return validateTripInterruptionProcess((TripInterruptionProcess)value, diagnostics, context);
			case AccountingPackage.TRAVEL_VALIDITY_TYPE:
				return validateTravelValidityType((TravelValidityType)value, diagnostics, context);
			case AccountingPackage.WEEK_DAY:
				return validateWeekDay((WeekDay)value, diagnostics, context);
			case AccountingPackage.DATE_AS_DATE:
				return validateDateAsDate((Date)value, diagnostics, context);
			case AccountingPackage.DATE_AS_DATE_TIME:
				return validateDateAsDateTime((Date)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingViewerData(AccountingViewerData accountingViewerData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountingViewerData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingFile(AccountingFile accountingFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accountingFile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingFile_MUST_INCLUDE_DELIVERY(accountingFile, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingFile_MUST_INCLUDE_ACCOUNTING_RECORD(accountingFile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MUST_INCLUDE_DELIVERY constraint of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingFile_MUST_INCLUDE_DELIVERY(AccountingFile accountingFile, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountingFile.getAccountingDelivery() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Accounting Delivery Details are missing",
						 new Object[] { "MUST_INCLUDE_DELIVERY", getObjectLabel(accountingFile, context) }, //$NON-NLS-1$
						 new Object[] { accountingFile },
						 context));
			}
			return false;
		}

		return true;
	}

	/**
	 * Validates the MUST_INCLUDE_ACCOUNTING_RECORD constraint of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingFile_MUST_INCLUDE_ACCOUNTING_RECORD(AccountingFile accountingFile, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountingFile.getAccountingDelivery() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Accounting Records are missing",
						 new Object[] { "MUST_INCLUDE_ACCOUNTING_RECORD", getObjectLabel(accountingFile, context) }, //$NON-NLS-1$
						 new Object[] { accountingFile },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingRecords(AccountingRecords accountingRecords, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountingRecords, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingDelivery(AccountingDelivery accountingDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accountingDelivery, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingDelivery_MUST_INCLUDE_PARTIES(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingDelivery_MUST_INCLUDE_TIME(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingDelivery_END_BEFORE_START(accountingDelivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingDelivery_ID_MUST(accountingDelivery, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MUST_INCLUDE_PARTIES constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingDelivery_MUST_INCLUDE_PARTIES(AccountingDelivery accountingDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		boolean result = true;
		
		if (accountingDelivery.getInvoiceRecipient() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Accounting Recipient is missing",
						 new Object[] { "MUST_INCLUDE_PARTIES", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		};

		if (accountingDelivery.getInvoicingParty() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Invoicing Party is missing",
						 new Object[] { "MUST_INCLUDE_PARTIES", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		};
		
		return result;
	}

	/**
	 * Validates the MUST_INCLUDE_TIME constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingDelivery_MUST_INCLUDE_TIME(AccountingDelivery accountingDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean result = true;
		
		if (accountingDelivery.getCreationDate() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Creation date of the accounting is missing",
						 new Object[] { "MUST_INCLUDE_TIME", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		}

		if (accountingDelivery.getEndStatementPeriod() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "End of Statement Period is missing",
						 new Object[] { "MUST_INCLUDE_TIME", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		}
		
		if (accountingDelivery.getStartStatementPeriod() != null && accountingDelivery.getEndStatementPeriod() != null
			&& accountingDelivery.getEndStatementPeriod().before(accountingDelivery.getStartStatementPeriod())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "End of the statement period is before begin of the statement period",
						 new Object[] { "MUST_INCLUDE_TIME", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		}
		
		return result;
	}

	/**
	 * Validates the END_BEFORE_START constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingDelivery_END_BEFORE_START(AccountingDelivery accountingDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean result = true;
		
		if (accountingDelivery.getStartStatementPeriod() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Begin of Statement Period is missing",
						 new Object[] { "END_BEFORE_START", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		}

		if (accountingDelivery.getEndStatementPeriod() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "End of Statement Period is missing",
						 new Object[] { "END_BEFORE_START", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		}
		
		if (accountingDelivery.getStartStatementPeriod() != null && accountingDelivery.getEndStatementPeriod() != null
			&& accountingDelivery.getEndStatementPeriod().before(accountingDelivery.getStartStatementPeriod())) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "End of the statement period is before begin of the statement period",
						 new Object[] { "END_BEFORE_START", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
						 new Object[] { accountingDelivery },
						 context));
			}
			result = false;
		}
		
		return result;
	}

	/**
	 * Validates the ID_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingDelivery_ID_MUST(AccountingDelivery accountingDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (accountingDelivery.getId() == null
				&& accountingDelivery.getEndStatementPeriod().before(accountingDelivery.getStartStatementPeriod())) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Id of the accounting is missing",
							 new Object[] { "ID_MUST", getObjectLabel(accountingDelivery, context) }, //$NON-NLS-1$
							 new Object[] { accountingDelivery },
							 context));
				}
				return false;
		}
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingRecord(AccountingRecord accountingRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accountingRecord, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingRecord_ID_MUST(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingRecord_MUST_TRANSACTION(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingRecord_MUST_SUBJECT(accountingRecord, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingRecord_MUST_ACCOUNTED_AMOUNTS(accountingRecord, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ID_MUST constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingRecord_ID_MUST(AccountingRecord accountingRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountingRecord.getId() == null || accountingRecord.getId().length() == 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Id missing in accounting record: " + getObjectLabel(accountingRecord, context) ,
						 new Object[] { "ID_MUST", getObjectLabel(accountingRecord, context) }, //$NON-NLS-1$
						 new Object[] { accountingRecord },
						 context));
			}
			return false;
	}
	return true;
	}

	/**
	 * Validates the MUST_TRANSACTION constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingRecord_MUST_TRANSACTION(AccountingRecord accountingRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountingRecord.getTransaction() == null) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Transaction missing in accounting record: " + getObjectLabel(accountingRecord, context) ,
							 new Object[] { "MUST_TRANSACTION", getObjectLabel(accountingRecord, context) }, //$NON-NLS-1$
							 new Object[] { accountingRecord },
							 context));
				}
				return false;
		}
		return true;
	}

	/**
	 * Validates the MUST_SUBJECT constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingRecord_MUST_SUBJECT(AccountingRecord accountingRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountingRecord.getSubject() == null) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Subject missing in accounting record: " + getObjectLabel(accountingRecord, context) ,
							 new Object[] { "MUST_TRANSACTION", getObjectLabel(accountingRecord, context) }, //$NON-NLS-1$
							 new Object[] { accountingRecord },
							 context));
				}
				return false;
		}
		return true;
	}

	/**
	 * Validates the MUST_ACCOUNTED_AMOUNTS constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingRecord_MUST_ACCOUNTED_AMOUNTS(AccountingRecord accountingRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountingRecord.getAccountedAmounts() == null || accountingRecord.getAccountedAmounts() == null || accountingRecord.getAccountedAmounts().getAccountedAmounts().isEmpty()) {
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Amounts missing in accounting record: " + getObjectLabel(accountingRecord, context) ,
							 new Object[] { "MUST_ACCOUNTED_AMOUNTS", getObjectLabel(accountingRecord, context) }, //$NON-NLS-1$
							 new Object[] { accountingRecord },
							 context));
				}
				return false;
		}
		return true;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountedAmounts(AccountedAmounts accountedAmounts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountedAmounts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingSubject(AccountingSubject accountingSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accountingSubject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accountingSubject, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountingSubject_MUST_NUMBER(accountingSubject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MUST_NUMBER constraint of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountingSubject_MUST_NUMBER(AccountingSubject accountingSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountingSubject.getNumberOfItems() <= 0) {
			
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Number of Items missing in: " + getObjectLabel(accountingSubject, context) ,
							 new Object[] { "MUST_ACCOUNTED_AMOUNTS", getObjectLabel(accountingSubject, context) }, //$NON-NLS-1$
							 new Object[] { accountingSubject },
							 context));
				}
				return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyDescription(LegacyDescription legacyDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyDescription_NOT_EMPTY(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyDescription_SERIES_RANGE(legacyDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyDescription_TARIFF_RANGE(legacyDescription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NOT_EMPTY constraint of '<em>Legacy Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyDescription_NOT_EMPTY(LegacyDescription legacyDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyDescription.getClassCode() == null &&
			legacyDescription.getPassengerType()== null &&
			legacyDescription.getSeries() == 0 &&
			legacyDescription.getTariff() == 0) {
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Legacy description is empty in: " + getObjectLabel(legacyDescription, context) ,
						 new Object[] { "NOT_EMPTY", getObjectLabel(legacyDescription, context) }, //$NON-NLS-1$
						 new Object[] { legacyDescription },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SERIES_RANGE constraint of '<em>Legacy Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyDescription_SERIES_RANGE(LegacyDescription legacyDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyDescription.getSeries() > 99999 || legacyDescription.getSeries() < 0) {
				
				if (diagnostics != null) {
					diagnostics.add
						(createSimpleDiagnostic
							(Diagnostic.WARNING,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "Wrong series number " + Integer.toString(legacyDescription.getSeries()) + " " + getObjectLabel(legacyDescription, context) ,
							 new Object[] { "SERIES_RANGE", getObjectLabel(legacyDescription, context) }, //$NON-NLS-1$
							 new Object[] { legacyDescription },
							 context));
				}
				return false;
			}
			return true;
	}

	/**
	 * Validates the TARIFF_RANGE constraint of '<em>Legacy Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegacyDescription_TARIFF_RANGE(LegacyDescription legacyDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (legacyDescription.getTariff() > 99999 || legacyDescription.getTariff() < 0) {
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Wrong tariff " + Integer.toString(legacyDescription.getTariff()) + " " + getObjectLabel(legacyDescription, context) ,
						 new Object[] { "TARIFF_RANGE", getObjectLabel(legacyDescription, context) }, //$NON-NLS-1$
						 new Object[] { legacyDescription },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transaction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransaction_BOOKING_OR_TICKET(transaction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BOOKING_OR_TICKET constraint of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTransaction_BOOKING_OR_TICKET(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if ( (transaction.getBookingId() == null || transaction.getBookingId().trim().length() == 0 ) &&
			 (transaction.getTicketId() == null  || transaction.getTicketId().trim().length() == 0  ) ) {
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Neigther Booking Id nor Tioacket Id included in " + getObjectLabel(transaction, context) ,
						 new Object[] { "BOOKING_OR_TICKET", getObjectLabel(transaction, context) }, //$NON-NLS-1$
						 new Object[] { transaction },
						 context));
			}
			return false;
		}
		return true;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountedAmount(AccountedAmount accountedAmount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accountedAmount, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountedAmount_AMOUNT_NOT_0(accountedAmount, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountedAmount_ONE_OF_GROSS_AND_FEE(accountedAmount, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AMOUNT_NOT_0 constraint of '<em>Accounted Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountedAmount_AMOUNT_NOT_0(AccountedAmount accountedAmount, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (accountedAmount.getAmount().compareTo(new BigDecimal(0)) != 1 ){
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Accounted amount is <= 0 in " + getObjectLabel(accountedAmount, context) ,
						 new Object[] { "BOOKING_OR_TICKET", getObjectLabel(accountedAmount, context) }, //$NON-NLS-1$
						 new Object[] { accountedAmount },
						 context));
			}
			return false;
		}
		return true;
	
	}

	/**
	 * Validates the ONE_OF_GROSS_AND_FEE constraint of '<em>Accounted Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAccountedAmount_ONE_OF_GROSS_AND_FEE(AccountedAmount accountedAmount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		boolean result = true;
		
		if (accountedAmount.isFee() && accountedAmount.isGrossAmount()){
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Accounted amount is ticket price and fee in " + getObjectLabel(accountedAmount, context) ,
						 new Object[] { "ONE_OF_GROSS_AND_FEE", getObjectLabel(accountedAmount, context) }, //$NON-NLS-1$
						 new Object[] { accountedAmount },
						 context));
			}
			result = false;
		}
		
		if (!accountedAmount.isFee() && !accountedAmount.isGrossAmount()){
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Accounted amount is neither ticket price nor fee in " + getObjectLabel(accountedAmount, context) ,
						 new Object[] { "ONE_OF_GROSS_AND_FEE", getObjectLabel(accountedAmount, context) }, //$NON-NLS-1$
						 new Object[] { accountedAmount },
						 context));
			}
			result = false;
		}
		
		return result;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLists(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(codeLists, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_CARRIERS_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_COUNTRIES_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_CURRENCIES_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_LANGUAGES_MUST(codeLists, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIERS_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_CARRIERS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {


		if (codeLists.getCarriers() == null || codeLists.getCarriers().getCarriers() == null || codeLists.getCarriers().getCarriers().isEmpty()){
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Carrier reference data are missing in: " + getObjectLabel(codeLists, context) ,
						 new Object[] { "CARRIERS_MUST", getObjectLabel(codeLists, context) }, //$NON-NLS-1$
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	
	}

	/**
	 * Validates the SERVICE_BRANDS_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_SERVICE_BRANDS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * Validates the COUNTRIES_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_COUNTRIES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (codeLists.getCountries() == null || codeLists.getCountries().getCountries() == null || codeLists.getCountries().getCountries().isEmpty()){
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Country reference data are missing in: " + getObjectLabel(codeLists, context) ,
						 new Object[] { "CURRENCIES_MUST", getObjectLabel(codeLists, context) }, //$NON-NLS-1$
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}


	/**
	 * Validates the CURRENCIES_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_CURRENCIES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
		if (codeLists.getCurrencies() == null || codeLists.getCurrencies().getCurrencies() == null || codeLists.getCurrencies().getCurrencies().isEmpty()){
			
			if (diagnostics != null) {
				diagnostics.add
					(createSimpleDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "Currency reference data are missing in: " + getObjectLabel(codeLists, context) ,
						 new Object[] { "CURRENCIES_MUST", getObjectLabel(codeLists, context) }, //$NON-NLS-1$
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}


	/**
	 * Validates the LANGUAGES_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCodeLists_LANGUAGES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowHistory(WorkflowHistory workflowHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowStep(WorkflowStep workflowStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUTSCodes(NUTSCodes nutsCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutsCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutsCode(NutsCode nutsCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutsCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBrands(ServiceBrands serviceBrands, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceBrands, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Service Brands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateServiceBrands_AT_LEAST_ONE(ServiceBrands serviceBrands, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBrand(ServiceBrand serviceBrand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceBrand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountries(Countries countries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countries, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCountries_AT_LEAST_ONE(Countries countries, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(country, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguages(Languages languages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languages, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Languages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLanguages_AT_LEAST_ONE(Languages languages, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(language, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencies(Currencies currencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currencies, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Currencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCurrencies_AT_LEAST_ONE(Currencies currencies, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStations(Stations stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stations, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Stations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStations_AT_LEAST_ONE(Stations stations, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(station, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrier(Carrier carrier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarriers(Carriers carriers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carriers, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Carriers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCarriers_AT_LEAST_ONE(Carriers carriers, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationSet(StationSet stationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationSet, diagnostics, context);
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Station Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStationSet_AT_LEAST_ONE(StationSet stationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralTariffModel(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalTariffModel, diagnostics, context);
	}

	/**
	 * Validates the DELIVERY_MUST constraint of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGeneralTariffModel_DELIVERY_MUST(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * Validates the FARE_MUST constraint of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGeneralTariffModel_FARE_MUST(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delivery, diagnostics, context);
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_CARRIER_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * Validates the DELIVERY_ID_CHARACTERS constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_DELIVERY_ID_CHARACTERS(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * Validates the VERSION_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_VERSION_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * Validates the ACCEPTED_VERSIONS_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelivery_ACCEPTED_VERSIONS_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRules(AfterSalesRules afterSalesRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRule(AfterSalesRule afterSalesRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesCondition(AfterSalesCondition afterSalesCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationTime(ApplicationTime applicationTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStructure(FareStructure fareStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoints(ConnectionPoints connectionPoints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPoints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareResourceLocations(FareResourceLocations fareResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocations(TrainResourceLocations trainResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trainResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocations(StationResourceLocations stationResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierResourceLocations(CarrierResourceLocations carrierResourceLocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierResourceLocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocation(TrainResourceLocation trainResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trainResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocation(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierResourceLocation(CarrierResourceLocation carrierResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResource(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onlineResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraints(FulfillmentConstraints fulfillmentConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fulfillmentConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraint(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fulfillmentConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredBarcodes(RequiredBarcodes requiredBarcodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredBarcodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptedBarcodes(AcceptedBarcodes acceptedBarcodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptedBarcodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedOnlineServices(SupportedOnlineServices supportedOnlineServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedOnlineServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationNames(StationNames stationNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationNames, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElements(FareElements fareElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalPassengerCombinationConstraints(TotalPassengerCombinationConstraints totalPassengerCombinationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(totalPassengerCombinationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalPassengerCombinationConstraint(TotalPassengerCombinationConstraint totalPassengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(totalPassengerCombinationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundles(FareConstraintBundles fareConstraintBundles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareConstraintBundles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareConstraintBundle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinitions(FareStationSetDefinitions fareStationSetDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStationSetDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStationSetDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyAccountingIdentifier(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyAccountingIdentifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraints(PersonalDataConstraints personalDataConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personalDataConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraint(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personalDataConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredPersonalData(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredPersonalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowedPersonalDataChanges(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allowedPersonalDataChanges, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraints(PassengerConstraints passengerConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraint(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerCombinationConstraint(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerCombinationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedFreePassengerLimit(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includedFreePassengerLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraints(CombinationConstraints combinationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combinationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraint(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combinationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraints(TravelValidityConstraints travelValidityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travelValidityConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travelValidityConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainValidity(TrainValidity trainValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trainValidity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraints(SalesAvailabilityConstraints salesAvailabilityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salesAvailabilityConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraint(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salesAvailabilityConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesRestriction(SalesRestriction salesRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salesRestriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndOfSale(EndOfSale endOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endOfSale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartOfSale(StartOfSale startOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startOfSale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierConstraints(CarrierConstraints carrierConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierConstraint(CarrierConstraint carrierConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraints(ServiceConstraints serviceConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraint(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraints(RegionalConstraints regionalConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalValidity(RegionalValidity regionalValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalValidity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevelDefinitions(ServiceLevelDefinitions serviceLevelDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceLevelDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexts(Texts texts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrices(Prices prices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrice(Price price, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(price, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVATDetail(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vatDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyPrice(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currencyPrice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClassDefinitions(ServiceClassDefinitions serviceClassDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceClassDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendars(Calendars calendars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendars, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParameters(ReservationParameters reservationParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParameter(ReservationParameter reservationParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationParams9181(ReservationParams9181 reservationParams9181, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationParams9181, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationOptions(ReservationOptions reservationOptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationOptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationPreferenceGroup(ReservationPreferenceGroup reservationPreferenceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationPreferenceGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClass(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevel(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRange(TimeRange timeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExcludedTimeRange(ExcludedTimeRange excludedTimeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(excludedTimeRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidityRange(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validityRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeTime(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValidityConstraint(ReturnValidityConstraint returnValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnValidityConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripAllocationConstraint(TripAllocationConstraint tripAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tripAllocationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripInterruptionConstraint(TripInterruptionConstraint tripInterruptionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tripInterruptionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViaStation(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viaStation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternativeRoute(AlternativeRoute alternativeRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternativeRoute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(route, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZone(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(line, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygone(Polygone polygone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinitions(ZoneDefinitions zoneDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zoneDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinition(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zoneDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossBorderCondition(CrossBorderCondition crossBorderCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossBorderCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareCombinationModel(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareCombinationModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraints(ReductionConstraints reductionConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraint(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCards(ReductionCards reductionCards, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionCards, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCard(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionCard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredReductionCard(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredReductionCard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageConstraints(LuggageConstraints luggageConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luggageConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageConstraint(LuggageConstraint luggageConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luggageConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageItemsRestriction(LuggageItemsRestriction luggageItemsRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luggageItemsRestriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageDimension(LuggageDimension luggageDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luggageDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCarrierRules(AddCarrierRules addCarrierRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addCarrierRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCarrierRule(AddCarrierRule addCarrierRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addCarrierRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnBorderStations(OnBorderStations onBorderStations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onBorderStations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentType(PaymentType paymentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesChannel(SalesChannel salesChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionType(TransactionType transactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingType(AccountingType accountingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettlementValueIndicator(SettlementValueIndicator settlementValueIndicator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesType(SalesType salesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionStandard(TransactionStandard transactionStandard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoardingOrArrival(BoardingOrArrival boardingOrArrival, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageRule(LuggageRule luggageRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimension(Dimension dimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCarrierScope(AddCarrierScope addCarrierScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportMode(TransportMode transportMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationRelationType(StationRelationType stationRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationFareDetailType(StationFareDetailType stationFareDetailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegulatoryCondition(RegulatoryCondition regulatoryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesTransactionType(AfterSalesTransactionType afterSalesTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBarcodeTypes(BarcodeTypes barcodeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasePriceClassType(BasePriceClassType basePriceClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassicClassType(ClassicClassType classicClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassId(ClassId classId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterSet(CharacterSet characterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusters(Clusters clusters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationModel(CombinationModel combinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlDataExchangeTypes(ControlDataExchangeTypes controlDataExchangeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSource(DataSource dataSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareType(FareType fareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentType(FulfillmentType fulfillmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoSystem(GeoSystem geoSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoUnit(GeoUnit geoUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicalReservationType(GraphicalReservationType graphicalReservationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericReductionCards(GenericReductionCards genericReductionCards, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHemisphereEW(HemisphereEW hemisphereEW, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHemisphereNS(HemisphereNS hemisphereNS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType(InterfaceType interfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyCalculationType(LegacyCalculationType legacyCalculationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyPassengerType(LegacyPassengerType legacyPassengerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacySeriesType(LegacySeriesType legacySeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyConversionType(LegacyConversionType legacyConversionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfferRequestType(OfferRequestType offerRequestType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineServiceType(OnlineServiceType onlineServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataItemsType(PersonalDataItemsType personalDataItemsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataTransferType(PersonalDataTransferType personalDataTransferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataChangeReason(PersonalDataChangeReason personalDataChangeReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationTravelClass(ReservationTravelClass reservationTravelClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationServiceLevel(ReservationServiceLevel reservationServiceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationService(ReservationService reservationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationBerthType(ReservationBerthType reservationBerthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoundingType(RoundingType roundingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaVersion(SchemaVersion schemaVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMode(ServiceMode serviceMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeZone(TimeZone timeZone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxScope(TaxScope taxScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeReferenceType(TimeReferenceType timeReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRangeScope(TimeRangeScope timeRangeScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelerType(TravelerType travelerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripAllocationProcess(TripAllocationProcess tripAllocationProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripAllocationUnit(TripAllocationUnit tripAllocationUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripInterruptionProcess(TripInterruptionProcess tripInterruptionProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityType(TravelValidityType travelValidityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekDay(WeekDay weekDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAsDate(Date dateAsDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAsDateTime(Date dateAsDateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasicDiagnostic createSimpleDiagnostic
    (int severity, String source, int code, String message, Object[] messageSubstitutions, Object[] data, Map<Object, Object> context)
	{
        return new BasicDiagnostic(severity, source, code, message, data);
	}
	

	
} //AccountingValidator

