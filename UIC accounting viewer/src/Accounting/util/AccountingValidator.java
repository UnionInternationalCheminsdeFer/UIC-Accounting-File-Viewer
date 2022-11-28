/**
 */
package Accounting.util;

import Accounting.*;

import java.util.Date;
import java.util.Map;

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
			case AccountingPackage.STATION_RELATION:
				return validateStationRelation((StationRelation)value, diagnostics, context);
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
		return validate_EveryDefaultConstraint(accountingFile, diagnostics, context);
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
		return validate_EveryDefaultConstraint(accountingDelivery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountingRecord(AccountingRecord accountingRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountingRecord, diagnostics, context);
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
		return validate_EveryDefaultConstraint(accountingSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyDescription(LegacyDescription legacyDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legacyDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountedAmount(AccountedAmount accountedAmount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountedAmount, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCodeLists_SERVICE_BRANDS_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_STATIONS_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_COUNTRIES_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_CURRENCIES_MUST(codeLists, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodeLists_LANGUAGES_MUST(codeLists, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIERS_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLists_CARRIERS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARRIERS_MUST", getObjectLabel(codeLists, context) },
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
	 * @generated
	 */
	public boolean validateCodeLists_SERVICE_BRANDS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SERVICE_BRANDS_MUST", getObjectLabel(codeLists, context) },
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the STATIONS_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLists_STATIONS_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "STATIONS_MUST", getObjectLabel(codeLists, context) },
						 new Object[] { codeLists },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COUNTRIES_MUST constraint of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeLists_COUNTRIES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "COUNTRIES_MUST", getObjectLabel(codeLists, context) },
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
	 * @generated
	 */
	public boolean validateCodeLists_CURRENCIES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CURRENCIES_MUST", getObjectLabel(codeLists, context) },
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
	 * @generated
	 */
	public boolean validateCodeLists_LANGUAGES_MUST(CodeLists codeLists, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LANGUAGES_MUST", getObjectLabel(codeLists, context) },
						 new Object[] { codeLists },
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
		if (!validate_NoCircularContainment(serviceBrands, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceBrands, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceBrands_AT_LEAST_ONE(serviceBrands, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Service Brands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBrands_AT_LEAST_ONE(ServiceBrands serviceBrands, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(serviceBrands, context) },
						 new Object[] { serviceBrands },
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
	public boolean validateServiceBrand(ServiceBrand serviceBrand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceBrand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountries(Countries countries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(countries, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(countries, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountries_AT_LEAST_ONE(countries, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Countries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountries_AT_LEAST_ONE(Countries countries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(countries, context) },
						 new Object[] { countries },
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
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(country, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguages(Languages languages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(languages, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(languages, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguages_AT_LEAST_ONE(languages, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Languages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguages_AT_LEAST_ONE(Languages languages, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(languages, context) },
						 new Object[] { languages },
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
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(language, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencies(Currencies currencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(currencies, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(currencies, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencies_AT_LEAST_ONE(currencies, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Currencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencies_AT_LEAST_ONE(Currencies currencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(currencies, context) },
						 new Object[] { currencies },
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
	public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStations(Stations stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stations, diagnostics, context);
		if (result || diagnostics != null) result &= validateStations_AT_LEAST_ONE(stations, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Stations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStations_AT_LEAST_ONE(Stations stations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(stations, context) },
						 new Object[] { stations },
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
	public boolean validateStation(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(station, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_NAME_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_NAME_CASE_UTF8_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_NAME_CASE_ASCII_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_SHORT_NAME_CASE_ASCII_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_SHORT_NAME_CASE_UTF8_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_TT_NAME_FORMAT(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_LATITUDE_VALUE_RANGE(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_LONGITUDE_VALUE_RANGE(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_COUNTRY_MUST(station, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_NAME_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_FORMAT", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_CASE_UTF8_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_NAME_CASE_UTF8_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_CASE_UTF8_FORMAT", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_CASE_ASCII_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_NAME_CASE_ASCII_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_CASE_ASCII_FORMAT", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SHORT_NAME_CASE_ASCII_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_SHORT_NAME_CASE_ASCII_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SHORT_NAME_CASE_ASCII_FORMAT", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SHORT_NAME_CASE_UTF8_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_SHORT_NAME_CASE_UTF8_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SHORT_NAME_CASE_UTF8_FORMAT", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TT_NAME_FORMAT constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_TT_NAME_FORMAT(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TT_NAME_FORMAT", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LATITUDE_VALUE_RANGE constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_LATITUDE_VALUE_RANGE(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LATITUDE_VALUE_RANGE", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LONGITUDE_VALUE_RANGE constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_LONGITUDE_VALUE_RANGE(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LONGITUDE_VALUE_RANGE", getObjectLabel(station, context) },
						 new Object[] { station },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COUNTRY_MUST constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_COUNTRY_MUST(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "COUNTRY_MUST", getObjectLabel(station, context) },
						 new Object[] { station },
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
	public boolean validateStationRelation(StationRelation stationRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stationRelation, diagnostics, context);
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
		if (!validate_NoCircularContainment(carriers, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(carriers, diagnostics, context);
		if (result || diagnostics != null) result &= validateCarriers_AT_LEAST_ONE(carriers, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Carriers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarriers_AT_LEAST_ONE(Carriers carriers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(carriers, context) },
						 new Object[] { carriers },
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
	public boolean validateStationSet(StationSet stationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stationSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateStationSet_AT_LEAST_ONE(stationSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Station Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationSet_AT_LEAST_ONE(StationSet stationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(stationSet, context) },
						 new Object[] { stationSet },
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
	public boolean validateGeneralTariffModel(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalTariffModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralTariffModel_DELIVERY_MUST(generalTariffModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralTariffModel_FARE_MUST(generalTariffModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DELIVERY_MUST constraint of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralTariffModel_DELIVERY_MUST(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DELIVERY_MUST", getObjectLabel(generalTariffModel, context) },
						 new Object[] { generalTariffModel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FARE_MUST constraint of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralTariffModel_FARE_MUST(GeneralTariffModel generalTariffModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FARE_MUST", getObjectLabel(generalTariffModel, context) },
						 new Object[] { generalTariffModel },
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
	public boolean validateDelivery(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delivery, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_CARRIER_MUST(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_DELIVERY_ID_CHARACTERS(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_VERSION_MUST(delivery, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelivery_ACCEPTED_VERSIONS_MUST(delivery, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery_CARRIER_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARRIER_MUST", getObjectLabel(delivery, context) },
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DELIVERY_ID_CHARACTERS constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery_DELIVERY_ID_CHARACTERS(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DELIVERY_ID_CHARACTERS", getObjectLabel(delivery, context) },
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the VERSION_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery_VERSION_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "VERSION_MUST", getObjectLabel(delivery, context) },
						 new Object[] { delivery },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ACCEPTED_VERSIONS_MUST constraint of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery_ACCEPTED_VERSIONS_MUST(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ACCEPTED_VERSIONS_MUST", getObjectLabel(delivery, context) },
						 new Object[] { delivery },
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
	public boolean validateAfterSalesRules(AfterSalesRules afterSalesRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(afterSalesRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRule(AfterSalesRule afterSalesRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(afterSalesRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(afterSalesRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateAfterSalesRule_AT_LEAST_ONE(afterSalesRule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>After Sales Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesRule_AT_LEAST_ONE(AfterSalesRule afterSalesRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(afterSalesRule, context) },
						 new Object[] { afterSalesRule },
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
	public boolean validateAfterSalesCondition(AfterSalesCondition afterSalesCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(afterSalesCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(afterSalesCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateAfterSalesCondition_FEE_MUST(afterSalesCondition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FEE_MUST constraint of '<em>After Sales Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAfterSalesCondition_FEE_MUST(AfterSalesCondition afterSalesCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FEE_MUST", getObjectLabel(afterSalesCondition, context) },
						 new Object[] { afterSalesCondition },
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
	public boolean validateApplicationTime(ApplicationTime applicationTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(applicationTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(applicationTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(applicationTime, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(connectionPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_NAME_FORMAT(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_LEGACY_BORDER_POINT_MISSING(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_STATION_SET_AT_LEAST_ONE(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_NAME_UTF8_FORMAT(connectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPoint_NOT_REFERENCED(connectionPoint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint_NAME_FORMAT(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_FORMAT", getObjectLabel(connectionPoint, context) },
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_BORDER_POINT_MISSING constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint_LEGACY_BORDER_POINT_MISSING(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LEGACY_BORDER_POINT_MISSING", getObjectLabel(connectionPoint, context) },
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the STATION_SET_AT_LEAST_ONE constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint_STATION_SET_AT_LEAST_ONE(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "STATION_SET_AT_LEAST_ONE", getObjectLabel(connectionPoint, context) },
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_UTF8_FORMAT constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint_NAME_UTF8_FORMAT(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_UTF8_FORMAT", getObjectLabel(connectionPoint, context) },
						 new Object[] { connectionPoint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPoint_NOT_REFERENCED(ConnectionPoint connectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(connectionPoint, context) },
						 new Object[] { connectionPoint },
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
		if (!validate_NoCircularContainment(trainResourceLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrainResourceLocation_CARRIER_MUST(trainResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrainResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(trainResourceLocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocation_CARRIER_MUST(TrainResourceLocation trainResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARRIER_MUST", getObjectLabel(trainResourceLocation, context) },
						 new Object[] { trainResourceLocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AT_LEAST_ONE_ONLINE_RESOURCE constraint of '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(TrainResourceLocation trainResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_ONLINE_RESOURCE", getObjectLabel(trainResourceLocation, context) },
						 new Object[] { trainResourceLocation },
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
	public boolean validateStationResourceLocation(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stationResourceLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStationResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(stationResourceLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStationResourceLocation_AT_LEAST_ONE_STATION_OR_CONNECTION_POINT(stationResourceLocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_ONLINE_RESOURCE constraint of '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocation_AT_LEAST_ONE_ONLINE_RESOURCE(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_ONLINE_RESOURCE", getObjectLabel(stationResourceLocation, context) },
						 new Object[] { stationResourceLocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AT_LEAST_ONE_STATION_OR_CONNECTION_POINT constraint of '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStationResourceLocation_AT_LEAST_ONE_STATION_OR_CONNECTION_POINT(StationResourceLocation stationResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_STATION_OR_CONNECTION_POINT", getObjectLabel(stationResourceLocation, context) },
						 new Object[] { stationResourceLocation },
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
	public boolean validateCarrierResourceLocation(CarrierResourceLocation carrierResourceLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carrierResourceLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResource(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(onlineResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnlineResource_REQUEST_TYPE_MUST(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnlineResource_INTERFACE_TYPE_MUST(onlineResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateOnlineResource_SYSTEM_MUST(onlineResource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the REQUEST_TYPE_MUST constraint of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResource_REQUEST_TYPE_MUST(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "REQUEST_TYPE_MUST", getObjectLabel(onlineResource, context) },
						 new Object[] { onlineResource },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the INTERFACE_TYPE_MUST constraint of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResource_INTERFACE_TYPE_MUST(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "INTERFACE_TYPE_MUST", getObjectLabel(onlineResource, context) },
						 new Object[] { onlineResource },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SYSTEM_MUST constraint of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlineResource_SYSTEM_MUST(OnlineResource onlineResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SYSTEM_MUST", getObjectLabel(onlineResource, context) },
						 new Object[] { onlineResource },
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
	public boolean validateFulfillmentConstraints(FulfillmentConstraints fulfillmentConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fulfillmentConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraint(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fulfillmentConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentConstraint_AT_LEAST_ONE_ACCEPTED_TYPE(fulfillmentConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentConstraint_NOT_REFERENCED(fulfillmentConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_ACCEPTED_TYPE constraint of '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraint_AT_LEAST_ONE_ACCEPTED_TYPE(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_ACCEPTED_TYPE", getObjectLabel(fulfillmentConstraint, context) },
						 new Object[] { fulfillmentConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentConstraint_NOT_REFERENCED(FulfillmentConstraint fulfillmentConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(fulfillmentConstraint, context) },
						 new Object[] { fulfillmentConstraint },
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
		if (!validate_NoCircularContainment(fareElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_TYPE_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_PRICE_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_TEXT_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_SERVICE_CLASS_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_PASSENGER_CONSTRAINT_MUST(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_LEGACY_ACCOUNTING_MISSING(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_CONVERSION_MISSING(fareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareElement_BUNDLE_MUST(fareElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TYPE_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_TYPE_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TYPE_MUST", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PRICE_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_PRICE_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "PRICE_MUST", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TEXT_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_TEXT_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TEXT_MUST", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SERVICE_CLASS_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_SERVICE_CLASS_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SERVICE_CLASS_MUST", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PASSENGER_CONSTRAINT_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_PASSENGER_CONSTRAINT_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "PASSENGER_CONSTRAINT_MUST", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_ACCOUNTING_MISSING constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_LEGACY_ACCOUNTING_MISSING(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LEGACY_ACCOUNTING_MISSING", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CONVERSION_MISSING constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_CONVERSION_MISSING(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CONVERSION_MISSING", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the BUNDLE_MUST constraint of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareElement_BUNDLE_MUST(FareElement fareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "BUNDLE_MUST", getObjectLabel(fareElement, context) },
						 new Object[] { fareElement },
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
	public boolean validateTotalPassengerCombinationConstraints(TotalPassengerCombinationConstraints totalPassengerCombinationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(totalPassengerCombinationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalPassengerCombinationConstraint(TotalPassengerCombinationConstraint totalPassengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(totalPassengerCombinationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTotalPassengerCombinationConstraint_MIN_MAX_MUST(totalPassengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTotalPassengerCombinationConstraint_NOT_REFERENCED(totalPassengerCombinationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MIN_MAX_MUST constraint of '<em>Total Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalPassengerCombinationConstraint_MIN_MAX_MUST(TotalPassengerCombinationConstraint totalPassengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MIN_MAX_MUST", getObjectLabel(totalPassengerCombinationConstraint, context) },
						 new Object[] { totalPassengerCombinationConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Total Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalPassengerCombinationConstraint_NOT_REFERENCED(TotalPassengerCombinationConstraint totalPassengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(totalPassengerCombinationConstraint, context) },
						 new Object[] { totalPassengerCombinationConstraint },
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
	public boolean validateFareConstraintBundles(FareConstraintBundles fareConstraintBundles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareConstraintBundles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareConstraintBundle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_SALES_AVAILABILITY_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_TRAVEL_VALIDITY_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_FULFILLMENT_CONSTRAINT_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_COMBINATION_CONSTRAINT_MUST(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_TOTAL_PASSENGER_CONSTRAINT_WARNING(fareConstraintBundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareConstraintBundle_NOT_REFERENCED(fareConstraintBundle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SALES_AVAILABILITY_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle_SALES_AVAILABILITY_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SALES_AVAILABILITY_MUST", getObjectLabel(fareConstraintBundle, context) },
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVEL_VALIDITY_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle_TRAVEL_VALIDITY_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TRAVEL_VALIDITY_MUST", getObjectLabel(fareConstraintBundle, context) },
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FULFILLMENT_CONSTRAINT_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle_FULFILLMENT_CONSTRAINT_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FULFILLMENT_CONSTRAINT_MUST", getObjectLabel(fareConstraintBundle, context) },
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COMBINATION_CONSTRAINT_MUST constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle_COMBINATION_CONSTRAINT_MUST(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "COMBINATION_CONSTRAINT_MUST", getObjectLabel(fareConstraintBundle, context) },
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TOTAL_PASSENGER_CONSTRAINT_WARNING constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle_TOTAL_PASSENGER_CONSTRAINT_WARNING(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TOTAL_PASSENGER_CONSTRAINT_WARNING", getObjectLabel(fareConstraintBundle, context) },
						 new Object[] { fareConstraintBundle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Fare Constraint Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareConstraintBundle_NOT_REFERENCED(FareConstraintBundle fareConstraintBundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(fareConstraintBundle, context) },
						 new Object[] { fareConstraintBundle },
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
	public boolean validateFareStationSetDefinitions(FareStationSetDefinitions fareStationSetDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fareStationSetDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareStationSetDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_AT_LEAST_ONE_STATION(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_LEGACY_CODE_MISSING(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_CARRIER_MUST(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_CODE_MUST(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_NAME_FORMAT(fareStationSetDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareStationSetDefinition_NAME_UTF8_FORMAT(fareStationSetDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_STATION constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition_AT_LEAST_ONE_STATION(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_STATION", getObjectLabel(fareStationSetDefinition, context) },
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_CODE_MISSING constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition_LEGACY_CODE_MISSING(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LEGACY_CODE_MISSING", getObjectLabel(fareStationSetDefinition, context) },
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition_CARRIER_MUST(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARRIER_MUST", getObjectLabel(fareStationSetDefinition, context) },
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CODE_MUST constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition_CODE_MUST(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CODE_MUST", getObjectLabel(fareStationSetDefinition, context) },
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition_NAME_FORMAT(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_FORMAT", getObjectLabel(fareStationSetDefinition, context) },
						 new Object[] { fareStationSetDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_UTF8_FORMAT constraint of '<em>Fare Station Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareStationSetDefinition_NAME_UTF8_FORMAT(FareStationSetDefinition fareStationSetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_UTF8_FORMAT", getObjectLabel(fareStationSetDefinition, context) },
						 new Object[] { fareStationSetDefinition },
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
	public boolean validateLegacyAccountingIdentifier(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legacyAccountingIdentifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyAccountingIdentifier_SERIES_ID_MUST(legacyAccountingIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateLegacyAccountingIdentifier_TARIFF_ID_MUST(legacyAccountingIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SERIES_ID_MUST constraint of '<em>Legacy Accounting Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyAccountingIdentifier_SERIES_ID_MUST(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SERIES_ID_MUST", getObjectLabel(legacyAccountingIdentifier, context) },
						 new Object[] { legacyAccountingIdentifier },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TARIFF_ID_MUST constraint of '<em>Legacy Accounting Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegacyAccountingIdentifier_TARIFF_ID_MUST(LegacyAccountingIdentifier legacyAccountingIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TARIFF_ID_MUST", getObjectLabel(legacyAccountingIdentifier, context) },
						 new Object[] { legacyAccountingIdentifier },
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
	public boolean validatePersonalDataConstraints(PersonalDataConstraints personalDataConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personalDataConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraint(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(personalDataConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonalDataConstraint_AT_LEAST_ONE_REQUIRED_ITEM(personalDataConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersonalDataConstraint_NOT_REFERENCED(personalDataConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_REQUIRED_ITEM constraint of '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraint_AT_LEAST_ONE_REQUIRED_ITEM(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_REQUIRED_ITEM", getObjectLabel(personalDataConstraint, context) },
						 new Object[] { personalDataConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonalDataConstraint_NOT_REFERENCED(PersonalDataConstraint personalDataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(personalDataConstraint, context) },
						 new Object[] { personalDataConstraint },
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
	public boolean validateRequiredPersonalData(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredPersonalData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredPersonalData_AT_LEAST_ONE_ITEM(requiredPersonalData, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredPersonalData_ADD_LEAST_ONE_TRANSFER(requiredPersonalData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_ITEM constraint of '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredPersonalData_AT_LEAST_ONE_ITEM(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_ITEM", getObjectLabel(requiredPersonalData, context) },
						 new Object[] { requiredPersonalData },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ADD_LEAST_ONE_TRANSFER constraint of '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredPersonalData_ADD_LEAST_ONE_TRANSFER(RequiredPersonalData requiredPersonalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ADD_LEAST_ONE_TRANSFER", getObjectLabel(requiredPersonalData, context) },
						 new Object[] { requiredPersonalData },
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
	public boolean validateAllowedPersonalDataChanges(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allowedPersonalDataChanges, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_SHORT(allowedPersonalDataChanges, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_LONG(allowedPersonalDataChanges, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TIME_LIMIT_TOO_SHORT constraint of '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_SHORT(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TIME_LIMIT_TOO_SHORT", getObjectLabel(allowedPersonalDataChanges, context) },
						 new Object[] { allowedPersonalDataChanges },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TIME_LIMIT_TOO_LONG constraint of '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowedPersonalDataChanges_TIME_LIMIT_TOO_LONG(AllowedPersonalDataChanges allowedPersonalDataChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TIME_LIMIT_TOO_LONG", getObjectLabel(allowedPersonalDataChanges, context) },
						 new Object[] { allowedPersonalDataChanges },
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
	public boolean validatePassengerConstraints(PassengerConstraints passengerConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraint(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(passengerConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerConstraint_TRAVELLER_TYPE_MUST(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerConstraint_NAME_MUST(passengerConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerConstraint_NOT_REFERENCED(passengerConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TRAVELLER_TYPE_MUST constraint of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraint_TRAVELLER_TYPE_MUST(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TRAVELLER_TYPE_MUST", getObjectLabel(passengerConstraint, context) },
						 new Object[] { passengerConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NAME_MUST constraint of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraint_NAME_MUST(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_MUST", getObjectLabel(passengerConstraint, context) },
						 new Object[] { passengerConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerConstraint_NOT_REFERENCED(PassengerConstraint passengerConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(passengerConstraint, context) },
						 new Object[] { passengerConstraint },
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
	public boolean validatePassengerCombinationConstraint(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(passengerCombinationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerCombinationConstraint_NUMBER_AT_LEAST_ONE(passengerCombinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassengerCombinationConstraint_TRAVELLER_TYPE_MUST(passengerCombinationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NUMBER_AT_LEAST_ONE constraint of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerCombinationConstraint_NUMBER_AT_LEAST_ONE(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NUMBER_AT_LEAST_ONE", getObjectLabel(passengerCombinationConstraint, context) },
						 new Object[] { passengerCombinationConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVELLER_TYPE_MUST constraint of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerCombinationConstraint_TRAVELLER_TYPE_MUST(PassengerCombinationConstraint passengerCombinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TRAVELLER_TYPE_MUST", getObjectLabel(passengerCombinationConstraint, context) },
						 new Object[] { passengerCombinationConstraint },
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
	public boolean validateIncludedFreePassengerLimit(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(includedFreePassengerLimit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedFreePassengerLimit_NUMBER_AT_LEAST_ONE(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedFreePassengerLimit_TRAVELLER_TYPE_MUST(includedFreePassengerLimit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncludedFreePassengerLimit_SIMPLE_PASSENGER_CONSTRAINT_ONLY(includedFreePassengerLimit, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NUMBER_AT_LEAST_ONE constraint of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedFreePassengerLimit_NUMBER_AT_LEAST_ONE(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NUMBER_AT_LEAST_ONE", getObjectLabel(includedFreePassengerLimit, context) },
						 new Object[] { includedFreePassengerLimit },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVELLER_TYPE_MUST constraint of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedFreePassengerLimit_TRAVELLER_TYPE_MUST(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TRAVELLER_TYPE_MUST", getObjectLabel(includedFreePassengerLimit, context) },
						 new Object[] { includedFreePassengerLimit },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SIMPLE_PASSENGER_CONSTRAINT_ONLY constraint of '<em>Included Free Passenger Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludedFreePassengerLimit_SIMPLE_PASSENGER_CONSTRAINT_ONLY(IncludedFreePassengerLimit includedFreePassengerLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SIMPLE_PASSENGER_CONSTRAINT_ONLY", getObjectLabel(includedFreePassengerLimit, context) },
						 new Object[] { includedFreePassengerLimit },
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
	public boolean validateCombinationConstraints(CombinationConstraints combinationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combinationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraint(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(combinationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinationConstraint_AT_LEAST_ONE(combinationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinationConstraint_NOT_REFERENCED(combinationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraint_AT_LEAST_ONE(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(combinationConstraint, context) },
						 new Object[] { combinationConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationConstraint_NOT_REFERENCED(CombinationConstraint combinationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(combinationConstraint, context) },
						 new Object[] { combinationConstraint },
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
	public boolean validateTravelValidityConstraints(TravelValidityConstraints travelValidityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(travelValidityConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(travelValidityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_TRAVEL_DAYS_NOT_NULL(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_WARNING_TRAVEL_DAYS_TOO_LONG(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_NOT_REFERENCED(travelValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelValidityConstraint_TRAVEL_VALIDITY_TYPE_CONSTRAINT(travelValidityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TRAVEL_DAYS_NOT_NULL constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint_TRAVEL_DAYS_NOT_NULL(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TRAVEL_DAYS_NOT_NULL", getObjectLabel(travelValidityConstraint, context) },
						 new Object[] { travelValidityConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WARNING_TRAVEL_DAYS_TOO_LONG constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint_WARNING_TRAVEL_DAYS_TOO_LONG(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WARNING_TRAVEL_DAYS_TOO_LONG", getObjectLabel(travelValidityConstraint, context) },
						 new Object[] { travelValidityConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint_NOT_REFERENCED(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(travelValidityConstraint, context) },
						 new Object[] { travelValidityConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TRAVEL_VALIDITY_TYPE_CONSTRAINT constraint of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelValidityConstraint_TRAVEL_VALIDITY_TYPE_CONSTRAINT(TravelValidityConstraint travelValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TRAVEL_VALIDITY_TYPE_CONSTRAINT", getObjectLabel(travelValidityConstraint, context) },
						 new Object[] { travelValidityConstraint },
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
	public boolean validateTrainValidity(TrainValidity trainValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trainValidity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trainValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrainValidity_TRAIN_VALIDITY_REQUIRED_CONTENT(trainValidity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TRAIN_VALIDITY_REQUIRED_CONTENT constraint of '<em>Train Validity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainValidity_TRAIN_VALIDITY_REQUIRED_CONTENT(TrainValidity trainValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TRAIN_VALIDITY_REQUIRED_CONTENT", getObjectLabel(trainValidity, context) },
						 new Object[] { trainValidity },
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
	public boolean validateSalesAvailabilityConstraints(SalesAvailabilityConstraints salesAvailabilityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(salesAvailabilityConstraints, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salesAvailabilityConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesAvailabilityConstraints_AT_LEAST_ONE(salesAvailabilityConstraints, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Sales Availability Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraints_AT_LEAST_ONE(SalesAvailabilityConstraints salesAvailabilityConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(salesAvailabilityConstraints, context) },
						 new Object[] { salesAvailabilityConstraints },
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
	public boolean validateSalesAvailabilityConstraint(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(salesAvailabilityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesAvailabilityConstraint_AT_LEAST_ONE(salesAvailabilityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesAvailabilityConstraint_NOT_REFERENCED(salesAvailabilityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraint_AT_LEAST_ONE(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(salesAvailabilityConstraint, context) },
						 new Object[] { salesAvailabilityConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesAvailabilityConstraint_NOT_REFERENCED(SalesAvailabilityConstraint salesAvailabilityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(salesAvailabilityConstraint, context) },
						 new Object[] { salesAvailabilityConstraint },
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
	public boolean validateSalesRestriction(SalesRestriction salesRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(salesRestriction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salesRestriction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSalesRestriction_START_END_DATE_ORDER(salesRestriction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the START_END_DATE_ORDER constraint of '<em>Sales Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesRestriction_START_END_DATE_ORDER(SalesRestriction salesRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "START_END_DATE_ORDER", getObjectLabel(salesRestriction, context) },
						 new Object[] { salesRestriction },
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
	public boolean validateEndOfSale(EndOfSale endOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endOfSale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(endOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(endOfSale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartOfSale(StartOfSale startOfSale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startOfSale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(startOfSale, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(startOfSale, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(carrierConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(carrierConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCarrierConstraint_INCLUDE_OR_EXCLUDE(carrierConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the INCLUDE_OR_EXCLUDE constraint of '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarrierConstraint_INCLUDE_OR_EXCLUDE(CarrierConstraint carrierConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "INCLUDE_OR_EXCLUDE", getObjectLabel(carrierConstraint, context) },
						 new Object[] { carrierConstraint },
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
	public boolean validateServiceConstraints(ServiceConstraints serviceConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraint(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConstraint_INCLUDE_OR_EXCLUDE(serviceConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConstraint_LEGACY_CODE_RANGE(serviceConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the INCLUDE_OR_EXCLUDE constraint of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraint_INCLUDE_OR_EXCLUDE(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "INCLUDE_OR_EXCLUDE", getObjectLabel(serviceConstraint, context) },
						 new Object[] { serviceConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the LEGACY_CODE_RANGE constraint of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConstraint_LEGACY_CODE_RANGE(ServiceConstraint serviceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LEGACY_CODE_RANGE", getObjectLabel(serviceConstraint, context) },
						 new Object[] { serviceConstraint },
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
	public boolean validateRegionalConstraints(RegionalConstraints regionalConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionalConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionalConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_AT_LEAST_ONE_REGIONAL_VALIDITY(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_WARNING_DISTANCE_TOO_SHORT(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_WARNING_DISTANCE_TOO_LONG(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_NOT_REFERENCED(regionalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalConstraint_NO_CLASS_SEPARATED_CONVERTABLE_FARES(regionalConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_REGIONAL_VALIDITY constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint_AT_LEAST_ONE_REGIONAL_VALIDITY(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_REGIONAL_VALIDITY", getObjectLabel(regionalConstraint, context) },
						 new Object[] { regionalConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WARNING_DISTANCE_TOO_SHORT constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint_WARNING_DISTANCE_TOO_SHORT(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WARNING_DISTANCE_TOO_SHORT", getObjectLabel(regionalConstraint, context) },
						 new Object[] { regionalConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WARNING_DISTANCE_TOO_LONG constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint_WARNING_DISTANCE_TOO_LONG(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WARNING_DISTANCE_TOO_LONG", getObjectLabel(regionalConstraint, context) },
						 new Object[] { regionalConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint_NOT_REFERENCED(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(regionalConstraint, context) },
						 new Object[] { regionalConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NO_CLASS_SEPARATED_CONVERTABLE_FARES constraint of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalConstraint_NO_CLASS_SEPARATED_CONVERTABLE_FARES(RegionalConstraint regionalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NO_CLASS_SEPARATED_CONVERTABLE_FARES", getObjectLabel(regionalConstraint, context) },
						 new Object[] { regionalConstraint },
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
	public boolean validateRegionalValidity(RegionalValidity regionalValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionalValidity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionalValidity, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalValidity_AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON(regionalValidity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON constraint of '<em>Regional Validity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalValidity_AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON(RegionalValidity regionalValidity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON", getObjectLabel(regionalValidity, context) },
						 new Object[] { regionalValidity },
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
		if (!validate_NoCircularContainment(text, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT_SHORT(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT_UTF8(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_FORMAT_TEXT_SHORT_UTF8(text, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FORMAT_TEXT constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_FORMAT_TEXT(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT", getObjectLabel(text, context) },
						 new Object[] { text },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_FORMAT_TEXT_SHORT(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(text, context) },
						 new Object[] { text },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_UTF8 constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_FORMAT_TEXT_UTF8(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT_UTF8", getObjectLabel(text, context) },
						 new Object[] { text },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT_UTF8 constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_FORMAT_TEXT_SHORT_UTF8(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT_SHORT_UTF8", getObjectLabel(text, context) },
						 new Object[] { text },
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
	public boolean validateTranslation(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(translation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_LANGUAGE_MUST(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT_SHORT(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT_UTF8(translation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTranslation_FORMAT_TEXT_SHORT_UTF8(translation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LANGUAGE_MUST constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation_LANGUAGE_MUST(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LANGUAGE_MUST", getObjectLabel(translation, context) },
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation_FORMAT_TEXT(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT", getObjectLabel(translation, context) },
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation_FORMAT_TEXT_SHORT(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT_SHORT", getObjectLabel(translation, context) },
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_UTF8 constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation_FORMAT_TEXT_UTF8(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT_UTF8", getObjectLabel(translation, context) },
						 new Object[] { translation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FORMAT_TEXT_SHORT_UTF8 constraint of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation_FORMAT_TEXT_SHORT_UTF8(Translation translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FORMAT_TEXT_SHORT_UTF8", getObjectLabel(translation, context) },
						 new Object[] { translation },
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
	public boolean validatePrices(Prices prices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrice(Price price, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(price, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(price, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(price, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrice_AT_LEAST_ONE_PRICE(price, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_PRICE constraint of '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrice_AT_LEAST_ONE_PRICE(Price price, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_PRICE", getObjectLabel(price, context) },
						 new Object[] { price },
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
	public boolean validateVATDetail(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vatDetail, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validateVATDetail_VALID_AMOUNT(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validateVATDetail_COUNTRY_MUST(vatDetail, diagnostics, context);
		if (result || diagnostics != null) result &= validateVATDetail_PERCENTAGE_VALUES(vatDetail, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VALID_AMOUNT constraint of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVATDetail_VALID_AMOUNT(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "VALID_AMOUNT", getObjectLabel(vatDetail, context) },
						 new Object[] { vatDetail },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the COUNTRY_MUST constraint of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVATDetail_COUNTRY_MUST(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "COUNTRY_MUST", getObjectLabel(vatDetail, context) },
						 new Object[] { vatDetail },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PERCENTAGE_VALUES constraint of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVATDetail_PERCENTAGE_VALUES(VATDetail vatDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "PERCENTAGE_VALUES", getObjectLabel(vatDetail, context) },
						 new Object[] { vatDetail },
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
	public boolean validateCurrencyPrice(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(currencyPrice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyPrice_VAT_PLAUSIBILITY_CHECK(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyPrice_CURRENCY_MUST(currencyPrice, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyPrice_AMOUNT_MUST(currencyPrice, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VAT_PLAUSIBILITY_CHECK constraint of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyPrice_VAT_PLAUSIBILITY_CHECK(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "VAT_PLAUSIBILITY_CHECK", getObjectLabel(currencyPrice, context) },
						 new Object[] { currencyPrice },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CURRENCY_MUST constraint of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyPrice_CURRENCY_MUST(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CURRENCY_MUST", getObjectLabel(currencyPrice, context) },
						 new Object[] { currencyPrice },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AMOUNT_MUST constraint of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyPrice_AMOUNT_MUST(CurrencyPrice currencyPrice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AMOUNT_MUST", getObjectLabel(currencyPrice, context) },
						 new Object[] { currencyPrice },
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
	public boolean validateServiceClassDefinitions(ServiceClassDefinitions serviceClassDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceClassDefinitions, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceClassDefinitions, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceClassDefinitions_AT_LEAST_ONE(serviceClassDefinitions, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Service Class Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClassDefinitions_AT_LEAST_ONE(ServiceClassDefinitions serviceClassDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(serviceClassDefinitions, context) },
						 new Object[] { serviceClassDefinitions },
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
	public boolean validateCalendars(Calendars calendars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(calendars, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(calendars, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendars_AT_LEAST_ONE(calendars, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Calendars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendars_AT_LEAST_ONE(Calendars calendars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(calendars, context) },
						 new Object[] { calendars },
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
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(calendar, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendar_START_END_DATE_ORDER(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendar_DATES_WITHIN_RANGE(calendar, diagnostics, context);
		if (result || diagnostics != null) result &= validateCalendar_NOT_REFERENCED(calendar, diagnostics, context);
		return result;
	}

	/**
	 * Validates the START_END_DATE_ORDER constraint of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar_START_END_DATE_ORDER(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "START_END_DATE_ORDER", getObjectLabel(calendar, context) },
						 new Object[] { calendar },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DATES_WITHIN_RANGE constraint of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar_DATES_WITHIN_RANGE(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DATES_WITHIN_RANGE", getObjectLabel(calendar, context) },
						 new Object[] { calendar },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar_NOT_REFERENCED(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(calendar, context) },
						 new Object[] { calendar },
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
		if (!validate_NoCircularContainment(reservationPreferenceGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservationPreferenceGroup_AT_LEAST_ONE_PREFERENCE(reservationPreferenceGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateReservationPreferenceGroup_GROUP_FORMAT(reservationPreferenceGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_PREFERENCE constraint of '<em>Reservation Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationPreferenceGroup_AT_LEAST_ONE_PREFERENCE(ReservationPreferenceGroup reservationPreferenceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_PREFERENCE", getObjectLabel(reservationPreferenceGroup, context) },
						 new Object[] { reservationPreferenceGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the GROUP_FORMAT constraint of '<em>Reservation Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationPreferenceGroup_GROUP_FORMAT(ReservationPreferenceGroup reservationPreferenceGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "GROUP_FORMAT", getObjectLabel(reservationPreferenceGroup, context) },
						 new Object[] { reservationPreferenceGroup },
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
	public boolean validateServiceClass(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceClass_TEXT_MUST(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceClass_CLASSIC_CLASS_MUST(serviceClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TEXT_MUST constraint of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClass_TEXT_MUST(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TEXT_MUST", getObjectLabel(serviceClass, context) },
						 new Object[] { serviceClass },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CLASSIC_CLASS_MUST constraint of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClass_CLASSIC_CLASS_MUST(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CLASSIC_CLASS_MUST", getObjectLabel(serviceClass, context) },
						 new Object[] { serviceClass },
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
	public boolean validateServiceLevel(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceLevel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceLevel_TEXT_MUST(serviceLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceLevel_ID_FORMAT(serviceLevel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TEXT_MUST constraint of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevel_TEXT_MUST(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TEXT_MUST", getObjectLabel(serviceLevel, context) },
						 new Object[] { serviceLevel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ID_FORMAT constraint of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceLevel_ID_FORMAT(ServiceLevel serviceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ID_FORMAT", getObjectLabel(serviceLevel, context) },
						 new Object[] { serviceLevel },
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
	public boolean validateTimeRange(TimeRange timeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeRange_FROM_TO_ORDER(timeRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FROM_TO_ORDER constraint of '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRange_FROM_TO_ORDER(TimeRange timeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FROM_TO_ORDER", getObjectLabel(timeRange, context) },
						 new Object[] { timeRange },
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
	public boolean validateExcludedTimeRange(ExcludedTimeRange excludedTimeRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(excludedTimeRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(excludedTimeRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeRange_FROM_TO_ORDER(excludedTimeRange, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidityRange(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(validityRange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateValidityRange_WARNING_TOO_LONG(validityRange, diagnostics, context);
		if (result || diagnostics != null) result &= validateValidityRange_WARNING_TOO_SHORT(validityRange, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WARNING_TOO_LONG constraint of '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidityRange_WARNING_TOO_LONG(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WARNING_TOO_LONG", getObjectLabel(validityRange, context) },
						 new Object[] { validityRange },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WARNING_TOO_SHORT constraint of '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidityRange_WARNING_TOO_SHORT(ValidityRange validityRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WARNING_TOO_SHORT", getObjectLabel(validityRange, context) },
						 new Object[] { validityRange },
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
	public boolean validateRelativeTime(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relativeTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_LONG(relativeTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeTime_WARNING_TOO_SHORT(relativeTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WARNING_TOO_LONG constraint of '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeTime_WARNING_TOO_LONG(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WARNING_TOO_LONG", getObjectLabel(relativeTime, context) },
						 new Object[] { relativeTime },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the WARNING_TOO_SHORT constraint of '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeTime_WARNING_TOO_SHORT(RelativeTime relativeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "WARNING_TOO_SHORT", getObjectLabel(relativeTime, context) },
						 new Object[] { relativeTime },
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
	public boolean validateReturnValidityConstraint(ReturnValidityConstraint returnValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(returnValidityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(returnValidityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateReturnValidityConstraint_EARLIEST_LAST_RETURN_ORDER(returnValidityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EARLIEST_LAST_RETURN_ORDER constraint of '<em>Return Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValidityConstraint_EARLIEST_LAST_RETURN_ORDER(ReturnValidityConstraint returnValidityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "EARLIEST_LAST_RETURN_ORDER", getObjectLabel(returnValidityConstraint, context) },
						 new Object[] { returnValidityConstraint },
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
	public boolean validateTripAllocationConstraint(TripAllocationConstraint tripAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tripAllocationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tripAllocationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTripAllocationConstraint_DURATION_FORMAT(tripAllocationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DURATION_FORMAT constraint of '<em>Trip Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripAllocationConstraint_DURATION_FORMAT(TripAllocationConstraint tripAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DURATION_FORMAT", getObjectLabel(tripAllocationConstraint, context) },
						 new Object[] { tripAllocationConstraint },
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
	public boolean validateTripInterruptionConstraint(TripInterruptionConstraint tripInterruptionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tripInterruptionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tripInterruptionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTripInterruptionConstraint_DURATION_FORMAT(tripInterruptionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DURATION_FORMAT constraint of '<em>Trip Interruption Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTripInterruptionConstraint_DURATION_FORMAT(TripInterruptionConstraint tripInterruptionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DURATION_FORMAT", getObjectLabel(tripInterruptionConstraint, context) },
						 new Object[] { tripInterruptionConstraint },
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
	public boolean validateViaStation(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viaStation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViaStation_AT_LEAST_ONE_OBJECT_SET(viaStation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViaStation_IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO(viaStation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_OBJECT_SET constraint of '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViaStation_AT_LEAST_ONE_OBJECT_SET(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_OBJECT_SET", getObjectLabel(viaStation, context) },
						 new Object[] { viaStation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO constraint of '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViaStation_IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO(ViaStation viaStation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "IF_ALTERNATIVE_ROUTES_AT_LEAST_TWO", getObjectLabel(viaStation, context) },
						 new Object[] { viaStation },
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
	public boolean validateAlternativeRoute(AlternativeRoute alternativeRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alternativeRoute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alternativeRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlternativeRoute_AT_LEAST_ONE_VIA(alternativeRoute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_VIA constraint of '<em>Alternative Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternativeRoute_AT_LEAST_ONE_VIA(AlternativeRoute alternativeRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_VIA", getObjectLabel(alternativeRoute, context) },
						 new Object[] { alternativeRoute },
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
	public boolean validateRoute(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(route, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(route, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(route, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoute_AT_LEAST_ONE_VIA(route, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE_VIA constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute_AT_LEAST_ONE_VIA(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_VIA", getObjectLabel(route, context) },
						 new Object[] { route },
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
	public boolean validateZone(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zone, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validateZone_CARRIER_MUST(zone, diagnostics, context);
		if (result || diagnostics != null) result &= validateZone_ONE_OF_ZONE_ID_NUTS_CITY(zone, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZone_CARRIER_MUST(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARRIER_MUST", getObjectLabel(zone, context) },
						 new Object[] { zone },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ONE_OF_ZONE_ID_NUTS_CITY constraint of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZone_ONE_OF_ZONE_ID_NUTS_CITY(Zone zone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ONE_OF_ZONE_ID_NUTS_CITY", getObjectLabel(zone, context) },
						 new Object[] { zone },
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
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(line, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(line, diagnostics, context);
		if (result || diagnostics != null) result &= validateLine_CARRIER_MUST(line, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST constraint of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine_CARRIER_MUST(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARRIER_MUST", getObjectLabel(line, context) },
						 new Object[] { line },
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
	public boolean validatePolygone(Polygone polygone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(polygone, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(polygone, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolygone_AT_LEAST_THREE_EDGES(polygone, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_THREE_EDGES constraint of '<em>Polygone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygone_AT_LEAST_THREE_EDGES(Polygone polygone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_THREE_EDGES", getObjectLabel(polygone, context) },
						 new Object[] { polygone },
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
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(edge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(edge, diagnostics, context);
		if (result || diagnostics != null) result &= validateEdge_COORDINATE_LIMITS(edge, diagnostics, context);
		return result;
	}

	/**
	 * Validates the COORDINATE_LIMITS constraint of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge_COORDINATE_LIMITS(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "COORDINATE_LIMITS", getObjectLabel(edge, context) },
						 new Object[] { edge },
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
	public boolean validateZoneDefinitions(ZoneDefinitions zoneDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zoneDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinition(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zoneDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateZoneDefinition_CARRIER_MUST_BE_SET(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateZoneDefinition_AT_LEAST_ONE_OF_SET_NUTS_POLYGON(zoneDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateZoneDefinition_IF_STATION_SET_AT_LEAST_TWO_STATIONS(zoneDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CARRIER_MUST_BE_SET constraint of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinition_CARRIER_MUST_BE_SET(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARRIER_MUST_BE_SET", getObjectLabel(zoneDefinition, context) },
						 new Object[] { zoneDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AT_LEAST_ONE_OF_SET_NUTS_POLYGON constraint of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinition_AT_LEAST_ONE_OF_SET_NUTS_POLYGON(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE_OF_SET_NUTS_POLYGON", getObjectLabel(zoneDefinition, context) },
						 new Object[] { zoneDefinition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IF_STATION_SET_AT_LEAST_TWO_STATIONS constraint of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneDefinition_IF_STATION_SET_AT_LEAST_TWO_STATIONS(ZoneDefinition zoneDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "IF_STATION_SET_AT_LEAST_TWO_STATIONS", getObjectLabel(zoneDefinition, context) },
						 new Object[] { zoneDefinition },
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
	public boolean validateCrossBorderCondition(CrossBorderCondition crossBorderCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crossBorderCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(crossBorderCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCrossBorderCondition_FROM_TO_COUNTRY_MUST(crossBorderCondition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FROM_TO_COUNTRY_MUST constraint of '<em>Cross Border Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossBorderCondition_FROM_TO_COUNTRY_MUST(CrossBorderCondition crossBorderCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FROM_TO_COUNTRY_MUST", getObjectLabel(crossBorderCondition, context) },
						 new Object[] { crossBorderCondition },
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
	public boolean validateFareCombinationModel(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fareCombinationModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareCombinationModel_MODEL_MUST(fareCombinationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateFareCombinationModel_REFERENCE_CLUSTER_MUST(fareCombinationModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MODEL_MUST constraint of '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareCombinationModel_MODEL_MUST(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MODEL_MUST", getObjectLabel(fareCombinationModel, context) },
						 new Object[] { fareCombinationModel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the REFERENCE_CLUSTER_MUST constraint of '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFareCombinationModel_REFERENCE_CLUSTER_MUST(FareCombinationModel fareCombinationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "REFERENCE_CLUSTER_MUST", getObjectLabel(fareCombinationModel, context) },
						 new Object[] { fareCombinationModel },
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
	public boolean validateReductionConstraints(ReductionConstraints reductionConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraint(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reductionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionConstraint_AT_LEAST_ONE(reductionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionConstraint_NOT_REFERENCED(reductionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AT_LEAST_ONE constraint of '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraint_AT_LEAST_ONE(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AT_LEAST_ONE", getObjectLabel(reductionConstraint, context) },
						 new Object[] { reductionConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionConstraint_NOT_REFERENCED(ReductionConstraint reductionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(reductionConstraint, context) },
						 new Object[] { reductionConstraint },
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
	public boolean validateReductionCards(ReductionCards reductionCards, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reductionCards, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCard(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reductionCard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionCard_ISUER_MUST_FOR_NON_GENERIC(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionCard_NOT_REFERENCED(reductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateReductionCard_CARD_ID_FORMAT(reductionCard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ISUER_MUST_FOR_NON_GENERIC constraint of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCard_ISUER_MUST_FOR_NON_GENERIC(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ISUER_MUST_FOR_NON_GENERIC", getObjectLabel(reductionCard, context) },
						 new Object[] { reductionCard },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NOT_REFERENCED constraint of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCard_NOT_REFERENCED(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NOT_REFERENCED", getObjectLabel(reductionCard, context) },
						 new Object[] { reductionCard },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CARD_ID_FORMAT constraint of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReductionCard_CARD_ID_FORMAT(ReductionCard reductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARD_ID_FORMAT", getObjectLabel(reductionCard, context) },
						 new Object[] { reductionCard },
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
	public boolean validateRequiredReductionCard(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredReductionCard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredReductionCard_NAME_FORMAT(requiredReductionCard, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredReductionCard_CARD_MUST(requiredReductionCard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NAME_FORMAT constraint of '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredReductionCard_NAME_FORMAT(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NAME_FORMAT", getObjectLabel(requiredReductionCard, context) },
						 new Object[] { requiredReductionCard },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the CARD_MUST constraint of '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredReductionCard_CARD_MUST(RequiredReductionCard requiredReductionCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CARD_MUST", getObjectLabel(requiredReductionCard, context) },
						 new Object[] { requiredReductionCard },
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

} //AccountingValidator
