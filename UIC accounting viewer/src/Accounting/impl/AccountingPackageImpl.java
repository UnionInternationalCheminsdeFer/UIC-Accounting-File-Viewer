/**
 */
package Accounting.impl;

import Accounting.AccountingFactory;
import Accounting.AccountingPackage;

import Accounting.util.AccountingValidator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingPackageImpl extends EPackageImpl implements AccountingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "Accounting.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingViewerDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingRecordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingDeliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountedAmountsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountedAmountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeListsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutsCodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutsCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBrandsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBrandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carriersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalTariffModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterSalesRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterSalesRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterSalesConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierResourceLocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainResourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationResourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierResourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredBarcodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptedBarcodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedOnlineServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationNamesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalPassengerCombinationConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalPassengerCombinationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareConstraintBundlesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareConstraintBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareStationSetDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareStationSetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyAccountingIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalDataConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalDataConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPersonalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowedPersonalDataChangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerCombinationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedFreePassengerLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelValidityConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelValidityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainValidityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesAvailabilityConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesAvailabilityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endOfSaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startOfSaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalValidityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vatDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyPriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceClassDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationParams9181EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationPreferenceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludedTimeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validityRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValidityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripAllocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripInterruptionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viaStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossBorderConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fareCombinationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionCardsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reductionCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredReductionCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luggageConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luggageConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luggageItemsRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luggageDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addCarrierRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addCarrierRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onBorderStationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum salesChannelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accountingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum settlementValueIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum salesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionStandardEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boardingOrArrivalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum luggageRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dimensionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addCarrierScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stationRelationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stationFareDetailTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regulatoryConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum afterSalesTransactionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum barcodeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basePriceClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classicClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classIdEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum characterSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clustersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum combinationModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlDataExchangeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fareTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fulfillmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geoSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geoUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum graphicalReservationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genericReductionCardsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hemisphereEWEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hemisphereNSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacyCalculationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacyPassengerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacySeriesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legacyConversionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum offerRequestTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum onlineServiceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personalDataItemsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personalDataTransferTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personalDataChangeReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationTravelClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationServiceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationBerthTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roundingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemaVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeZoneEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeRangeScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum travelerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tripAllocationProcessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tripAllocationUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tripInterruptionProcessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum travelValidityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekDayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateAsDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateAsDateTimeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Accounting.AccountingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccountingPackageImpl() {
		super(eNS_URI, AccountingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AccountingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static AccountingPackage init() {
		if (isInited) return (AccountingPackage)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccountingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccountingPackageImpl theAccountingPackage = registeredAccountingPackage instanceof AccountingPackageImpl ? (AccountingPackageImpl)registeredAccountingPackage : new AccountingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theAccountingPackage.loadPackage();

		// Fix loaded packages
		theAccountingPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAccountingPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AccountingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAccountingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccountingPackage.eNS_URI, theAccountingPackage);
		return theAccountingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountingViewerData() {
		if (accountingViewerDataEClass == null) {
			accountingViewerDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(2);
		}
		return accountingViewerDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingViewerData_CodeLists() {
        return (EReference)getAccountingViewerData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingViewerData_FareModells() {
        return (EReference)getAccountingViewerData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingViewerData_WorkflowHistory() {
        return (EReference)getAccountingViewerData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingViewerData_AccountingFile() {
        return (EReference)getAccountingViewerData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountingFile() {
		if (accountingFileEClass == null) {
			accountingFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(3);
		}
		return accountingFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingFile_AccountingDelivery() {
        return (EReference)getAccountingFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingFile_AccountingRecords() {
        return (EReference)getAccountingFile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountingRecords() {
		if (accountingRecordsEClass == null) {
			accountingRecordsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(4);
		}
		return accountingRecordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingRecords_AccountingRecords() {
        return (EReference)getAccountingRecords().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountingDelivery() {
		if (accountingDeliveryEClass == null) {
			accountingDeliveryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(5);
		}
		return accountingDeliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingDelivery_Id() {
        return (EAttribute)getAccountingDelivery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingDelivery_CreationDate() {
        return (EAttribute)getAccountingDelivery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingDelivery_InvoicingParty() {
        return (EReference)getAccountingDelivery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingDelivery_InvoiceRecipient() {
        return (EReference)getAccountingDelivery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingDelivery_StartStatementPeriod() {
        return (EAttribute)getAccountingDelivery().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingDelivery_EndStatementPeriod() {
        return (EAttribute)getAccountingDelivery().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingDelivery_PaymentType() {
        return (EAttribute)getAccountingDelivery().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountingRecord() {
		if (accountingRecordEClass == null) {
			accountingRecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(7);
		}
		return accountingRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingRecord_Id() {
        return (EAttribute)getAccountingRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingRecord_SalesType() {
        return (EAttribute)getAccountingRecord().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingRecord_AccountingType() {
        return (EAttribute)getAccountingRecord().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingRecord_TransactionStandard() {
        return (EAttribute)getAccountingRecord().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingRecord_Transaction() {
        return (EReference)getAccountingRecord().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingRecord_Subject() {
        return (EReference)getAccountingRecord().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingRecord_AccountedAmounts() {
        return (EReference)getAccountingRecord().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountedAmounts() {
		if (accountedAmountsEClass == null) {
			accountedAmountsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(8);
		}
		return accountedAmountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountedAmounts_AccountedAmounts() {
        return (EReference)getAccountedAmounts().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountingSubject() {
		if (accountingSubjectEClass == null) {
			accountingSubjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(9);
		}
		return accountingSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingSubject_FareId() {
        return (EAttribute)getAccountingSubject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingSubject_NumberOfItems() {
        return (EAttribute)getAccountingSubject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingSubject_SalesOfficeId() {
        return (EAttribute)getAccountingSubject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingSubject_SalesChannel() {
        return (EAttribute)getAccountingSubject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingSubject_Train() {
        return (EAttribute)getAccountingSubject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingSubject_TravelDate() {
        return (EAttribute)getAccountingSubject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingSubject_CountryOfSale() {
        return (EReference)getAccountingSubject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingSubject_Carriers() {
        return (EReference)getAccountingSubject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingSubject_Retailer() {
        return (EReference)getAccountingSubject().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountingSubject_BilateralTariffIdentifier() {
        return (EAttribute)getAccountingSubject().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountingSubject_LegacyDescription() {
        return (EReference)getAccountingSubject().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyDescription() {
		if (legacyDescriptionEClass == null) {
			legacyDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(10);
		}
		return legacyDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDescription_PassengerType() {
        return (EAttribute)getLegacyDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDescription_ClassCode() {
        return (EAttribute)getLegacyDescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDescription_Series() {
        return (EAttribute)getLegacyDescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyDescription_Tariff() {
        return (EAttribute)getLegacyDescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		if (transactionEClass == null) {
			transactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(12);
		}
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_TransactionType() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Contract() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_BookingId() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_TicketId() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_FulfillmentId() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_ExchangebookingId() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_CommunicationId() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_TransactionTime() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountedAmount() {
		if (accountedAmountEClass == null) {
			accountedAmountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(14);
		}
		return accountedAmountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountedAmount_SettlementValueIndicator() {
        return (EAttribute)getAccountedAmount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountedAmount_GrossAmount() {
        return (EAttribute)getAccountedAmount().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountedAmount_Fee() {
        return (EAttribute)getAccountedAmount().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountedAmount_Commission() {
        return (EAttribute)getAccountedAmount().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountedAmount_Currency() {
        return (EReference)getAccountedAmount().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountedAmount_Amount() {
        return (EAttribute)getAccountedAmount().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountedAmount_Rate() {
        return (EAttribute)getAccountedAmount().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeLists() {
		if (codeListsEClass == null) {
			codeListsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(19);
		}
		return codeListsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Carriers() {
        return (EReference)getCodeLists().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Stations() {
        return (EReference)getCodeLists().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Countries() {
        return (EReference)getCodeLists().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Languages() {
        return (EReference)getCodeLists().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_Currencies() {
        return (EReference)getCodeLists().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_ServiceBrands() {
        return (EReference)getCodeLists().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeLists_NutsCodes() {
        return (EReference)getCodeLists().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowHistory() {
		if (workflowHistoryEClass == null) {
			workflowHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(20);
		}
		return workflowHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowHistory_WorkflowSteps() {
        return (EReference)getWorkflowHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowStep() {
		if (workflowStepEClass == null) {
			workflowStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(21);
		}
		return workflowStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowStep_Time() {
        return (EAttribute)getWorkflowStep().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowStep_Description() {
        return (EAttribute)getWorkflowStep().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUTSCodes() {
		if (nutsCodesEClass == null) {
			nutsCodesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(22);
		}
		return nutsCodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUTSCodes_NutsCodes() {
        return (EReference)getNUTSCodes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutsCode() {
		if (nutsCodeEClass == null) {
			nutsCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(23);
		}
		return nutsCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutsCode_Name() {
        return (EAttribute)getNutsCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutsCode_Code() {
        return (EAttribute)getNutsCode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBrands() {
		if (serviceBrandsEClass == null) {
			serviceBrandsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(24);
		}
		return serviceBrandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBrands_ServiceBrands() {
        return (EReference)getServiceBrands().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceBrands__FindServiceBRand__int() {
        return getServiceBrands().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBrand() {
		if (serviceBrandEClass == null) {
			serviceBrandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(25);
		}
		return serviceBrandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Code() {
        return (EAttribute)getServiceBrand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Name() {
        return (EAttribute)getServiceBrand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Abbreviation() {
        return (EAttribute)getServiceBrand().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_Description() {
        return (EAttribute)getServiceBrand().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_TransportMode() {
        return (EAttribute)getServiceBrand().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBrand_LocalLanguageName() {
        return (EAttribute)getServiceBrand().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountries() {
		if (countriesEClass == null) {
			countriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(26);
		}
		return countriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountries_Countries() {
        return (EReference)getCountries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountries__FindCountry__int() {
        return getCountries().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		if (countryEClass == null) {
			countryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(27);
		}
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Code() {
        return (EAttribute)getCountry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Name() {
        return (EAttribute)getCountry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_ISOcode() {
        return (EAttribute)getCountry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_DefaultCharacterSet() {
        return (EAttribute)getCountry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguages() {
		if (languagesEClass == null) {
			languagesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(28);
		}
		return languagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLanguages_Languages() {
        return (EReference)getLanguages().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		if (languageEClass == null) {
			languageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(29);
		}
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Name() {
        return (EAttribute)getLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Code() {
        return (EAttribute)getLanguage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencies() {
		if (currenciesEClass == null) {
			currenciesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(30);
		}
		return currenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencies_Currencies() {
        return (EReference)getCurrencies().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrencies__FindCurrency__String() {
        return getCurrencies().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrency() {
		if (currencyEClass == null) {
			currencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(31);
		}
		return currencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_Name() {
        return (EAttribute)getCurrency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_IsoCode() {
        return (EAttribute)getCurrency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStations() {
		if (stationsEClass == null) {
			stationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(32);
		}
		return stationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStations_Stations() {
        return (EReference)getStations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStations__FindStation__int_int() {
        return getStations().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStations__FindStation__int_String() {
        return getStations().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		if (stationEClass == null) {
			stationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(33);
		}
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Name() {
        return (EAttribute)getStation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStation_Country() {
        return (EReference)getStation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Code() {
        return (EAttribute)getStation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Longitude() {
        return (EAttribute)getStation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Latitude() {
        return (EAttribute)getStation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_TimetableName() {
        return (EAttribute)getStation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_BorderStation() {
        return (EAttribute)getStation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_NameCaseUTF8() {
        return (EAttribute)getStation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_NameCaseASCII() {
        return (EAttribute)getStation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_ShortNameCaseASCII() {
        return (EAttribute)getStation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_ShortNameCaseUTF8() {
        return (EAttribute)getStation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_LegacyBorderPointCode() {
        return (EAttribute)getStation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStation_Relations() {
        return (EReference)getStation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_StationCode() {
        return (EAttribute)getStation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationRelation() {
		if (stationRelationEClass == null) {
			stationRelationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(34);
		}
		return stationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationRelation_RelationType() {
        return (EAttribute)getStationRelation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationRelation_Station() {
        return (EReference)getStationRelation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrier() {
		if (carrierEClass == null) {
			carrierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(35);
		}
		return carrierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrier_Code() {
        return (EAttribute)getCarrier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrier_Name() {
        return (EAttribute)getCarrier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrier_ShortName() {
        return (EAttribute)getCarrier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarriers() {
		if (carriersEClass == null) {
			carriersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(36);
		}
		return carriersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarriers_Carriers() {
        return (EReference)getCarriers().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarriers__FindCarrier__String() {
        return getCarriers().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationSet() {
		if (stationSetEClass == null) {
			stationSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(37);
		}
		return stationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationSet_Stations() {
        return (EReference)getStationSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralTariffModel() {
		if (generalTariffModelEClass == null) {
			generalTariffModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(38);
		}
		return generalTariffModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralTariffModel_Delivery() {
        return (EReference)getGeneralTariffModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralTariffModel_FareStructure() {
        return (EReference)getGeneralTariffModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelivery() {
		if (deliveryEClass == null) {
			deliveryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(39);
		}
		return deliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_Id() {
        return (EAttribute)getDelivery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_PreviousDeliveryId() {
        return (EAttribute)getDelivery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_ReplacedDeliveryId() {
        return (EAttribute)getDelivery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_Optional() {
        return (EAttribute)getDelivery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelivery_Provider() {
        return (EReference)getDelivery().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_SchemaVersion() {
        return (EAttribute)getDelivery().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_AcceptedSchemaVersion() {
        return (EAttribute)getDelivery().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_Usage() {
        return (EAttribute)getDelivery().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterSalesRules() {
		if (afterSalesRulesEClass == null) {
			afterSalesRulesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(40);
		}
		return afterSalesRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesRules_AfterSalesRules() {
        return (EReference)getAfterSalesRules().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterSalesRule() {
		if (afterSalesRuleEClass == null) {
			afterSalesRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(41);
		}
		return afterSalesRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesRule_Id() {
        return (EAttribute)getAfterSalesRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesRule_DataSource() {
        return (EAttribute)getAfterSalesRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesRule_Conditions() {
        return (EReference)getAfterSalesRule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterSalesCondition() {
		if (afterSalesConditionEClass == null) {
			afterSalesConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(42);
		}
		return afterSalesConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesCondition_TransactionType() {
        return (EAttribute)getAfterSalesCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesCondition_IndividualContracts() {
        return (EAttribute)getAfterSalesCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfterSalesCondition_CarrierFee() {
        return (EAttribute)getAfterSalesCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesCondition_Fee() {
        return (EReference)getAfterSalesCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterSalesCondition_ApplicationTime() {
        return (EReference)getAfterSalesCondition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationTime() {
		if (applicationTimeEClass == null) {
			applicationTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(43);
		}
		return applicationTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareStructure() {
		if (fareStructureEClass == null) {
			fareStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(44);
		}
		return fareStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceClassDefinitions() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceLevelDefinitions() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_StationNames() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareStationSetDefinitions() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Calendars() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Texts() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReductionCards() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareConstraintBundles() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareElements() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_CombinationConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_SalesAvailabilityConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_TravelValidityConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_RegionalConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ConnectionPoints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_CarrierConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ServiceConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_PassengerConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_TotalPassengerCombinationConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReductionConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_PersonalDataConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_AfterSalesRules() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_Prices() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FulfillmentConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ReservationParameters() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_SupportedOnlineServices() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_FareResourceLocations() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_ZoneDefinitions() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStructure_LuggageConstraints() {
        return (EReference)getFareStructure().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoints() {
		if (connectionPointsEClass == null) {
			connectionPointsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(45);
		}
		return connectionPointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoints_ConnectionPoints() {
        return (EReference)getConnectionPoints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectionPoints__FindSimpleConnectionPoint__Station() {
        return getConnectionPoints().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoint() {
		if (connectionPointEClass == null) {
			connectionPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(46);
		}
		return connectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Id() {
        return (EAttribute)getConnectionPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Name() {
        return (EAttribute)getConnectionPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_LegacyBorderPointCode() {
        return (EAttribute)getConnectionPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_Description() {
        return (EAttribute)getConnectionPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_ConnectedStationSets() {
        return (EReference)getConnectionPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_DataSource() {
        return (EAttribute)getConnectionPoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPoint_NameUtf8() {
        return (EAttribute)getConnectionPoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareResourceLocations() {
		if (fareResourceLocationsEClass == null) {
			fareResourceLocationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(47);
		}
		return fareResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocations_TrainResourceLocations() {
        return (EReference)getFareResourceLocations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocations_StationResourceLocations() {
        return (EReference)getFareResourceLocations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareResourceLocations_CarrierResourceLocations() {
        return (EReference)getFareResourceLocations().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainResourceLocations() {
		if (trainResourceLocationsEClass == null) {
			trainResourceLocationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(48);
		}
		return trainResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainResourceLocations_TrainResourceLocations() {
        return (EReference)getTrainResourceLocations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationResourceLocations() {
		if (stationResourceLocationsEClass == null) {
			stationResourceLocationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(49);
		}
		return stationResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocations_StationResourceLocations() {
        return (EReference)getStationResourceLocations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierResourceLocations() {
		if (carrierResourceLocationsEClass == null) {
			carrierResourceLocationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(50);
		}
		return carrierResourceLocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocations_CarrierResourceLocations() {
        return (EReference)getCarrierResourceLocations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainResourceLocation() {
		if (trainResourceLocationEClass == null) {
			trainResourceLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(51);
		}
		return trainResourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainResourceLocation_Carrier() {
        return (EReference)getTrainResourceLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainResourceLocation_OnlineResources() {
        return (EReference)getTrainResourceLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainResourceLocation_TrainId() {
        return (EAttribute)getTrainResourceLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationResourceLocation() {
		if (stationResourceLocationEClass == null) {
			stationResourceLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(52);
		}
		return stationResourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocation_OnlineResources() {
        return (EReference)getStationResourceLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocation_Stations() {
        return (EReference)getStationResourceLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationResourceLocation_ConnectionPoints() {
        return (EReference)getStationResourceLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierResourceLocation() {
		if (carrierResourceLocationEClass == null) {
			carrierResourceLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(53);
		}
		return carrierResourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocation_Carrier() {
        return (EReference)getCarrierResourceLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocation_ServiceBrand() {
        return (EReference)getCarrierResourceLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierResourceLocation_OnlineResources() {
        return (EReference)getCarrierResourceLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlineResource() {
		if (onlineResourceEClass == null) {
			onlineResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(54);
		}
		return onlineResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_OfferRequestType() {
        return (EAttribute)getOnlineResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_InterfaceType() {
        return (EAttribute)getOnlineResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_Version() {
        return (EAttribute)getOnlineResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineResource_System() {
        return (EAttribute)getOnlineResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillmentConstraints() {
		if (fulfillmentConstraintsEClass == null) {
			fulfillmentConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(55);
		}
		return fulfillmentConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillmentConstraints_FulfillmentConstraints() {
        return (EReference)getFulfillmentConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFulfillmentConstraint() {
		if (fulfillmentConstraintEClass == null) {
			fulfillmentConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(56);
		}
		return fulfillmentConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_Id() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_AcceptedFulfilmentTypes() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_RequiredControlDataExchange() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_IndividualTicketingPermitted() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_SeparateFulFillmentRequired() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillmentConstraint_AcceptedBarcodes() {
        return (EReference)getFulfillmentConstraint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFulfillmentConstraint_RequiredBarcodes() {
        return (EReference)getFulfillmentConstraint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_DataDescription() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_AcceptedBarcodeTypes() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFulfillmentConstraint_RequiredBarcodeTypes() {
        return (EAttribute)getFulfillmentConstraint().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredBarcodes() {
		if (requiredBarcodesEClass == null) {
			requiredBarcodesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(57);
		}
		return requiredBarcodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBarcodes_RequiredBarcodes() {
        return (EAttribute)getRequiredBarcodes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptedBarcodes() {
		if (acceptedBarcodesEClass == null) {
			acceptedBarcodesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(58);
		}
		return acceptedBarcodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptedBarcodes_AcceptedBarcodes() {
        return (EAttribute)getAcceptedBarcodes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedOnlineServices() {
		if (supportedOnlineServicesEClass == null) {
			supportedOnlineServicesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(59);
		}
		return supportedOnlineServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedOnlineServices_SupportedOnlineServices() {
        return (EAttribute)getSupportedOnlineServices().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationNames() {
		if (stationNamesEClass == null) {
			stationNamesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(60);
		}
		return stationNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationNames_StationName() {
        return (EReference)getStationNames().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareElements() {
		if (fareElementsEClass == null) {
			fareElementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(61);
		}
		return fareElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElements_FareElements() {
        return (EReference)getFareElements().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareElement() {
		if (fareElementEClass == null) {
			fareElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(62);
		}
		return fareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_Id() {
        return (EAttribute)getFareElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_Type() {
        return (EAttribute)getFareElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_DataDescription() {
        return (EAttribute)getFareElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_FareConstraintBundle() {
        return (EReference)getFareElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_Text() {
        return (EReference)getFareElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_Price() {
        return (EReference)getFareElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_RegionalConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ServiceConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_CarrierConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ServiceClass() {
        return (EReference)getFareElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ServiceLevel() {
        return (EReference)getFareElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_SalesAvailability() {
        return (EReference)getFareElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_TravelValidity() {
        return (EReference)getFareElement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_CombinationConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_FareDetailDescription() {
        return (EReference)getFareElement().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_PersonalDataConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ReservationParameter() {
        return (EReference)getFareElement().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_ReductionConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_FulfillmentConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_PassengerConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_RegulatoryConditions() {
        return (EAttribute)getFareElement().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_AfterSalesRule() {
        return (EReference)getFareElement().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_DataSource() {
        return (EAttribute)getFareElement().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_LegacyAccountingIdentifier() {
        return (EReference)getFareElement().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_LegacyConversion() {
        return (EAttribute)getFareElement().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareElement_IndividualContracts() {
        return (EAttribute)getFareElement().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_InvolvedTcos() {
        return (EReference)getFareElement().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareElement_LuggageConstraint() {
        return (EReference)getFareElement().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalPassengerCombinationConstraints() {
		if (totalPassengerCombinationConstraintsEClass == null) {
			totalPassengerCombinationConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(63);
		}
		return totalPassengerCombinationConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTotalPassengerCombinationConstraints_TotalPassengerCombinationConstraint() {
        return (EReference)getTotalPassengerCombinationConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalPassengerCombinationConstraint() {
		if (totalPassengerCombinationConstraintEClass == null) {
			totalPassengerCombinationConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(64);
		}
		return totalPassengerCombinationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalPassengerCombinationConstraint_Id() {
        return (EAttribute)getTotalPassengerCombinationConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalPassengerCombinationConstraint_DataDescription() {
        return (EAttribute)getTotalPassengerCombinationConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalPassengerCombinationConstraint_MaxTotalPassengerWeight() {
        return (EAttribute)getTotalPassengerCombinationConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTotalPassengerCombinationConstraint_MinTotalPassengerWeight() {
        return (EAttribute)getTotalPassengerCombinationConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareConstraintBundles() {
		if (fareConstraintBundlesEClass == null) {
			fareConstraintBundlesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(65);
		}
		return fareConstraintBundlesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundles_FareConstraintBundles() {
        return (EReference)getFareConstraintBundles().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareConstraintBundle() {
		if (fareConstraintBundleEClass == null) {
			fareConstraintBundleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(66);
		}
		return fareConstraintBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareConstraintBundle_Id() {
        return (EAttribute)getFareConstraintBundle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareConstraintBundle_DefaultFareType() {
        return (EAttribute)getFareConstraintBundle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareConstraintBundle_DataDescription() {
        return (EAttribute)getFareConstraintBundle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_CarrierConstraint() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_SalesAvailability() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_TravelValidity() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_CombinationConstraint() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_PersonalDataConstraint() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_FulfillmentConstraint() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_TotalPassengerConstraint() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareConstraintBundle_DefaultRegulatoryConditions() {
        return (EAttribute)getFareConstraintBundle().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareConstraintBundle_DataSource() {
        return (EAttribute)getFareConstraintBundle().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_ConvertedBundles() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareConstraintBundle_LuggageConstraint() {
        return (EReference)getFareConstraintBundle().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareStationSetDefinitions() {
		if (fareStationSetDefinitionsEClass == null) {
			fareStationSetDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(67);
		}
		return fareStationSetDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStationSetDefinitions_FareStationSetDefinitions() {
        return (EReference)getFareStationSetDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFareStationSetDefinitions__FindFareSet__Carrier_int() {
        return getFareStationSetDefinitions().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareStationSetDefinition() {
		if (fareStationSetDefinitionEClass == null) {
			fareStationSetDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(68);
		}
		return fareStationSetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_DataSource() {
        return (EAttribute)getFareStationSetDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStationSetDefinition_Carrier() {
        return (EReference)getFareStationSetDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_Code() {
        return (EAttribute)getFareStationSetDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_LegacyCode() {
        return (EAttribute)getFareStationSetDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_Id() {
        return (EAttribute)getFareStationSetDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_Name() {
        return (EAttribute)getFareStationSetDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareStationSetDefinition_NameUtf8() {
        return (EAttribute)getFareStationSetDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareStationSetDefinition_Stations() {
        return (EReference)getFareStationSetDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyAccountingIdentifier() {
		if (legacyAccountingIdentifierEClass == null) {
			legacyAccountingIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(69);
		}
		return legacyAccountingIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAccountingIdentifier_SeriesId() {
        return (EAttribute)getLegacyAccountingIdentifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAccountingIdentifier_TariffId() {
        return (EAttribute)getLegacyAccountingIdentifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyAccountingIdentifier_AddSeriesId() {
        return (EAttribute)getLegacyAccountingIdentifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalDataConstraints() {
		if (personalDataConstraintsEClass == null) {
			personalDataConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(70);
		}
		return personalDataConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalDataConstraints_PersonalDataConstraints() {
        return (EReference)getPersonalDataConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalDataConstraint() {
		if (personalDataConstraintEClass == null) {
			personalDataConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(71);
		}
		return personalDataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalDataConstraint_Id() {
        return (EAttribute)getPersonalDataConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalDataConstraint_RequiredPersonalData() {
        return (EReference)getPersonalDataConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalDataConstraint_AllowedChanges() {
        return (EReference)getPersonalDataConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPersonalData() {
		if (requiredPersonalDataEClass == null) {
			requiredPersonalDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(72);
		}
		return requiredPersonalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_TicketHolderOnly() {
        return (EAttribute)getRequiredPersonalData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_DataItem() {
        return (EAttribute)getRequiredPersonalData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_Transfer() {
        return (EAttribute)getRequiredPersonalData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPersonalData_FulfillmentType() {
        return (EAttribute)getRequiredPersonalData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredPersonalData_CrossBorder() {
        return (EReference)getRequiredPersonalData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllowedPersonalDataChanges() {
		if (allowedPersonalDataChangesEClass == null) {
			allowedPersonalDataChangesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(73);
		}
		return allowedPersonalDataChangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllowedPersonalDataChanges_TimeLimit() {
        return (EAttribute)getAllowedPersonalDataChanges().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllowedPersonalDataChanges_AcceptedReason() {
        return (EAttribute)getAllowedPersonalDataChanges().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerConstraints() {
		if (passengerConstraintsEClass == null) {
			passengerConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(74);
		}
		return passengerConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraints_PassengerConstraints() {
        return (EReference)getPassengerConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerConstraint() {
		if (passengerConstraintEClass == null) {
			passengerConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(75);
		}
		return passengerConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_Id() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_TravelerType() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraint_Text() {
        return (EReference)getPassengerConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_UpperAgeLimit() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_LowerAgeLimit() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_TravelAloneAgeLimit() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_ReservationAgeLimit() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_IsAncilliary() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_PassengerWeight() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_MaxTotalPassengerWeight() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_MinTotalPassengerWeight() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraint_IncludedFreePassengers() {
        return (EReference)getPassengerConstraint().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerConstraint_ExcludedPassengerCombinations() {
        return (EReference)getPassengerConstraint().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_DataDescription() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerConstraint_DataSource() {
        return (EAttribute)getPassengerConstraint().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerCombinationConstraint() {
		if (passengerCombinationConstraintEClass == null) {
			passengerCombinationConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(76);
		}
		return passengerCombinationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerCombinationConstraint_MaxNumber() {
        return (EAttribute)getPassengerCombinationConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerCombinationConstraint_MinNumber() {
        return (EAttribute)getPassengerCombinationConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerCombinationConstraint_PassengerType() {
        return (EAttribute)getPassengerCombinationConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerCombinationConstraint_PassengerConstraint() {
        return (EReference)getPassengerCombinationConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedFreePassengerLimit() {
		if (includedFreePassengerLimitEClass == null) {
			includedFreePassengerLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(77);
		}
		return includedFreePassengerLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFreePassengerLimit_Number() {
        return (EAttribute)getIncludedFreePassengerLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFreePassengerLimit_PassengerType() {
        return (EAttribute)getIncludedFreePassengerLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedFreePassengerLimit_PassengerConstraint() {
        return (EReference)getIncludedFreePassengerLimit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinationConstraints() {
		if (combinationConstraintsEClass == null) {
			combinationConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(78);
		}
		return combinationConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationConstraints_CombinationConstraints() {
        return (EReference)getCombinationConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinationConstraint() {
		if (combinationConstraintEClass == null) {
			combinationConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(79);
		}
		return combinationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinationConstraint_Id() {
        return (EAttribute)getCombinationConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinationConstraint_DataDescription() {
        return (EAttribute)getCombinationConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinationConstraint_CombinationModels() {
        return (EReference)getCombinationConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelValidityConstraints() {
		if (travelValidityConstraintsEClass == null) {
			travelValidityConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(80);
		}
		return travelValidityConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraints_TravelValidityConstraints() {
        return (EReference)getTravelValidityConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelValidityConstraint() {
		if (travelValidityConstraintEClass == null) {
			travelValidityConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(81);
		}
		return travelValidityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_Id() {
        return (EAttribute)getTravelValidityConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_DataDescription() {
        return (EAttribute)getTravelValidityConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_ValidDays() {
        return (EReference)getTravelValidityConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_TravelDays() {
        return (EAttribute)getTravelValidityConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_Range() {
        return (EReference)getTravelValidityConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_ReturnConstraint() {
        return (EReference)getTravelValidityConstraint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_ExcludedTimeRange() {
        return (EReference)getTravelValidityConstraint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_TrainValidity() {
        return (EReference)getTravelValidityConstraint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelValidityConstraint_ValidityType() {
        return (EAttribute)getTravelValidityConstraint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_TripInterruptionConstraint() {
        return (EReference)getTravelValidityConstraint().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelValidityConstraint_TripAllocationConstraint() {
        return (EReference)getTravelValidityConstraint().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainValidity() {
		if (trainValidityEClass == null) {
			trainValidityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(82);
		}
		return trainValidityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainValidity_CarrierConstraint() {
        return (EReference)getTrainValidity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainValidity_SerrviceConstraint() {
        return (EReference)getTrainValidity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainValidity_Scope() {
        return (EAttribute)getTrainValidity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesAvailabilityConstraints() {
		if (salesAvailabilityConstraintsEClass == null) {
			salesAvailabilityConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(84);
		}
		return salesAvailabilityConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesAvailabilityConstraints_SalesAvailabilityConstraints() {
        return (EReference)getSalesAvailabilityConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesAvailabilityConstraint() {
		if (salesAvailabilityConstraintEClass == null) {
			salesAvailabilityConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(85);
		}
		return salesAvailabilityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesAvailabilityConstraint_Id() {
        return (EAttribute)getSalesAvailabilityConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesAvailabilityConstraint_DataDescription() {
        return (EAttribute)getSalesAvailabilityConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesAvailabilityConstraint_Restrictions() {
        return (EReference)getSalesAvailabilityConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesAvailabilityConstraint_DataSource() {
        return (EAttribute)getSalesAvailabilityConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesRestriction() {
		if (salesRestrictionEClass == null) {
			salesRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(86);
		}
		return salesRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesRestriction_SalesDates() {
        return (EReference)getSalesRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesRestriction_StartOfSale() {
        return (EReference)getSalesRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesRestriction_EndOfSale() {
        return (EReference)getSalesRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndOfSale() {
		if (endOfSaleEClass == null) {
			endOfSaleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(87);
		}
		return endOfSaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartOfSale() {
		if (startOfSaleEClass == null) {
			startOfSaleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(88);
		}
		return startOfSaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierConstraints() {
		if (carrierConstraintsEClass == null) {
			carrierConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(89);
		}
		return carrierConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierConstraints_CarrierConstraints() {
        return (EReference)getCarrierConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierConstraint() {
		if (carrierConstraintEClass == null) {
			carrierConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(90);
		}
		return carrierConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrierConstraint_Id() {
        return (EAttribute)getCarrierConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierConstraint_IncludedCarriers() {
        return (EReference)getCarrierConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarrierConstraint_ExcludedCarriers() {
        return (EReference)getCarrierConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrierConstraint_DataDescription() {
        return (EAttribute)getCarrierConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarrierConstraint_DataSource() {
        return (EAttribute)getCarrierConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConstraints() {
		if (serviceConstraintsEClass == null) {
			serviceConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(91);
		}
		return serviceConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConstraints_ServiceConstraints() {
        return (EReference)getServiceConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConstraint() {
		if (serviceConstraintEClass == null) {
			serviceConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(92);
		}
		return serviceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConstraint_Id() {
        return (EAttribute)getServiceConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConstraint_IncludedServiceBrands() {
        return (EReference)getServiceConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConstraint_ExcludedServiceBrands() {
        return (EReference)getServiceConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConstraint_DataDescription() {
        return (EAttribute)getServiceConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConstraint_Legacy108Code() {
        return (EAttribute)getServiceConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConstraint_Description() {
        return (EReference)getServiceConstraint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionalConstraints() {
		if (regionalConstraintsEClass == null) {
			regionalConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(93);
		}
		return regionalConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraints_RegionalConstraints() {
        return (EReference)getRegionalConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionalConstraint() {
		if (regionalConstraintEClass == null) {
			regionalConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(94);
		}
		return regionalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_Id() {
        return (EAttribute)getRegionalConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_Distance() {
        return (EAttribute)getRegionalConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraint_EntryConnectionPoint() {
        return (EReference)getRegionalConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraint_ExitConnectionPoint() {
        return (EReference)getRegionalConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraint_RegionalValidity() {
        return (EReference)getRegionalConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_DataSource() {
        return (EAttribute)getRegionalConstraint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalConstraint_DataDescription() {
        return (EAttribute)getRegionalConstraint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalConstraint_LinkedFares() {
        return (EReference)getRegionalConstraint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionalValidity() {
		if (regionalValidityEClass == null) {
			regionalValidityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(95);
		}
		return regionalValidityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegionalValidity_SeqNb() {
        return (EAttribute)getRegionalValidity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_ViaStation() {
        return (EReference)getRegionalValidity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_Zone() {
        return (EReference)getRegionalValidity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_Line() {
        return (EReference)getRegionalValidity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_Polygone() {
        return (EReference)getRegionalValidity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_CarrierConstraint() {
        return (EReference)getRegionalValidity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionalValidity_ServiceConstraint() {
        return (EReference)getRegionalValidity().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelDefinitions() {
		if (serviceLevelDefinitionsEClass == null) {
			serviceLevelDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(96);
		}
		return serviceLevelDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelDefinitions_ServiceLevelDefinition() {
        return (EReference)getServiceLevelDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexts() {
		if (textsEClass == null) {
			textsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(97);
		}
		return textsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexts_Texts() {
        return (EReference)getTexts().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		if (textEClass == null) {
			textEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(98);
		}
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Id() {
        return (EAttribute)getText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_TextUTF8() {
        return (EAttribute)getText().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_TextICAO() {
        return (EAttribute)getText().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_ShortTextUTF8() {
        return (EAttribute)getText().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_ShortTextICAO() {
        return (EAttribute)getText().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Translations() {
        return (EReference)getText().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_StandardText() {
        return (EAttribute)getText().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_DataSource() {
        return (EAttribute)getText().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslation() {
		if (translationEClass == null) {
			translationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(99);
		}
		return translationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslation_Language() {
        return (EReference)getTranslation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_TextUTF8() {
        return (EAttribute)getTranslation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_TextICAO() {
        return (EAttribute)getTranslation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_ShortTextUTF8() {
        return (EAttribute)getTranslation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_ShortTextICAO() {
        return (EAttribute)getTranslation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrices() {
		if (pricesEClass == null) {
			pricesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(100);
		}
		return pricesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrices_Prices() {
        return (EReference)getPrices().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrice() {
		if (priceEClass == null) {
			priceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(101);
		}
		return priceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrice_Id() {
        return (EAttribute)getPrice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrice_Currencies() {
        return (EReference)getPrice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrice_DataSource() {
        return (EAttribute)getPrice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVATDetail() {
		if (vatDetailEClass == null) {
			vatDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(102);
		}
		return vatDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_Amount() {
        return (EAttribute)getVATDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_Percentage() {
        return (EAttribute)getVATDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVATDetail_Country() {
        return (EReference)getVATDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_TaxId() {
        return (EAttribute)getVATDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVATDetail_Scope() {
        return (EAttribute)getVATDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyPrice() {
		if (currencyPriceEClass == null) {
			currencyPriceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(103);
		}
		return currencyPriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyPrice_Currency() {
        return (EReference)getCurrencyPrice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyPrice_Amount() {
        return (EAttribute)getCurrencyPrice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyPrice_VATdetails() {
        return (EReference)getCurrencyPrice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceClassDefinitions() {
		if (serviceClassDefinitionsEClass == null) {
			serviceClassDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(104);
		}
		return serviceClassDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClassDefinitions_ServiceClassDefinitions() {
        return (EReference)getServiceClassDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendars() {
		if (calendarsEClass == null) {
			calendarsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(105);
		}
		return calendarsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendars_Calendars() {
        return (EReference)getCalendars().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendar() {
		if (calendarEClass == null) {
			calendarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(106);
		}
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_Name() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_Id() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_FromDate() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_UntilDate() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_UtcOffset() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_Dates() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_DataSource() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_FromDateTime() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendar_UntilDateTime() {
        return (EAttribute)getCalendar().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationParameters() {
		if (reservationParametersEClass == null) {
			reservationParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(107);
		}
		return reservationParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameters_ReservationParameters() {
        return (EReference)getReservationParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationParameter() {
		if (reservationParameterEClass == null) {
			reservationParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(108);
		}
		return reservationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParameter_MandatoryReservation() {
        return (EAttribute)getReservationParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParameter_Id() {
        return (EAttribute)getReservationParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameter_Params9181() {
        return (EReference)getReservationParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameter_Options() {
        return (EReference)getReservationParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationParameter_MandatoryReservationForBrands() {
        return (EReference)getReservationParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParameter_MandatoryReservationsForMode() {
        return (EAttribute)getReservationParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationParams9181() {
		if (reservationParams9181EClass == null) {
			reservationParams9181EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(109);
		}
		return reservationParams9181EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_TravelClass() {
        return (EAttribute)getReservationParams9181().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_ServiceLevel() {
        return (EAttribute)getReservationParams9181().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_Service() {
        return (EAttribute)getReservationParams9181().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_BerthType() {
        return (EAttribute)getReservationParams9181().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_CoachType() {
        return (EAttribute)getReservationParams9181().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_CompartmentType() {
        return (EAttribute)getReservationParams9181().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationParams9181_Tariff() {
        return (EAttribute)getReservationParams9181().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationOptions() {
		if (reservationOptionsEClass == null) {
			reservationOptionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(110);
		}
		return reservationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationOptions_Preferences() {
        return (EReference)getReservationOptions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationOptions_ServiceBrands() {
        return (EReference)getReservationOptions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationOptions_GraphicalReservation() {
        return (EAttribute)getReservationOptions().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationPreferenceGroup() {
		if (reservationPreferenceGroupEClass == null) {
			reservationPreferenceGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(111);
		}
		return reservationPreferenceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationPreferenceGroup_Preference() {
        return (EAttribute)getReservationPreferenceGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationPreferenceGroup_Group() {
        return (EAttribute)getReservationPreferenceGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceClass() {
		if (serviceClassEClass == null) {
			serviceClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(112);
		}
		return serviceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceClass_Id() {
        return (EAttribute)getServiceClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceClass_ClassicClass() {
        return (EAttribute)getServiceClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClass_Text() {
        return (EReference)getServiceClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevel() {
		if (serviceLevelEClass == null) {
			serviceLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(113);
		}
		return serviceLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevel_Id() {
        return (EAttribute)getServiceLevel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevel_Text() {
        return (EReference)getServiceLevel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevel_CombiningServiceClasses() {
        return (EReference)getServiceLevel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevel_ReservationParameter() {
        return (EReference)getServiceLevel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevel_IncludesClassName() {
        return (EAttribute)getServiceLevel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRange() {
		if (timeRangeEClass == null) {
			timeRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(114);
		}
		return timeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRange_Scope() {
        return (EAttribute)getTimeRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRange_From() {
        return (EAttribute)getTimeRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRange_Until() {
        return (EAttribute)getTimeRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludedTimeRange() {
		if (excludedTimeRangeEClass == null) {
			excludedTimeRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(115);
		}
		return excludedTimeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidityRange() {
		if (validityRangeEClass == null) {
			validityRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(116);
		}
		return validityRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRange_Unit() {
        return (EAttribute)getValidityRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRange_Value() {
        return (EAttribute)getValidityRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRange_HoursAfterMidnight() {
        return (EAttribute)getValidityRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeTime() {
		if (relativeTimeEClass == null) {
			relativeTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(117);
		}
		return relativeTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTime_Unit() {
        return (EAttribute)getRelativeTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTime_Reference() {
        return (EAttribute)getRelativeTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTime_Value() {
        return (EAttribute)getRelativeTime().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnValidityConstraint() {
		if (returnValidityConstraintEClass == null) {
			returnValidityConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(118);
		}
		return returnValidityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValidityConstraint_ExcludedWeekdays() {
        return (EAttribute)getReturnValidityConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValidityConstraint_LatestReturn() {
        return (EAttribute)getReturnValidityConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValidityConstraint_EarliestReturn() {
        return (EAttribute)getReturnValidityConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripAllocationConstraint() {
		if (tripAllocationConstraintEClass == null) {
			tripAllocationConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(119);
		}
		return tripAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripAllocationConstraint_AllocationUnit() {
        return (EAttribute)getTripAllocationConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripAllocationConstraint_MaxUnits() {
        return (EAttribute)getTripAllocationConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripAllocationConstraint_DurationUnit() {
        return (EAttribute)getTripAllocationConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripAllocationConstraint_RequiredProcesses() {
        return (EAttribute)getTripAllocationConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripInterruptionConstraint() {
		if (tripInterruptionConstraintEClass == null) {
			tripInterruptionConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(120);
		}
		return tripInterruptionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripInterruptionConstraint_MaxInterruptions() {
        return (EAttribute)getTripInterruptionConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripInterruptionConstraint_MaxDuration() {
        return (EAttribute)getTripInterruptionConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripInterruptionConstraint_TotalMaxDuration() {
        return (EAttribute)getTripInterruptionConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripInterruptionConstraint_RequiredProcesses() {
        return (EAttribute)getTripInterruptionConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViaStation() {
		if (viaStationEClass == null) {
			viaStationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(121);
		}
		return viaStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_Station() {
        return (EReference)getViaStation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_CarrierConstraint() {
        return (EReference)getViaStation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_Carrier() {
        return (EReference)getViaStation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_Route() {
        return (EReference)getViaStation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_AlternativeRoutes() {
        return (EReference)getViaStation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViaStation_DataDescription() {
        return (EAttribute)getViaStation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_FareStationSet() {
        return (EReference)getViaStation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViaStation_ServiceConstraint() {
        return (EReference)getViaStation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViaStation__GetDescription() {
        return getViaStation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeRoute() {
		if (alternativeRouteEClass == null) {
			alternativeRouteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(122);
		}
		return alternativeRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeRoute_Stations() {
        return (EReference)getAlternativeRoute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		if (routeEClass == null) {
			routeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(123);
		}
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_Stations() {
        return (EReference)getRoute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		if (zoneEClass == null) {
			zoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(124);
		}
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_BinaryZoneId() {
        return (EAttribute)getZone().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_ZoneId() {
        return (EAttribute)getZone().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZone_City() {
        return (EAttribute)getZone().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Carrier() {
        return (EReference)getZone().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_EntryStation() {
        return (EReference)getZone().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_TerminalStation() {
        return (EReference)getZone().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_NutsCode() {
        return (EReference)getZone().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		if (lineEClass == null) {
			lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(125);
		}
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_BinaryZoneId() {
        return (EAttribute)getLine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_LineId() {
        return (EAttribute)getLine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Carrier() {
        return (EReference)getLine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_EntryStation() {
        return (EReference)getLine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_TerminalStation() {
        return (EReference)getLine().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_NutsCode() {
        return (EReference)getLine().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_City() {
        return (EAttribute)getLine().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygone() {
		if (polygoneEClass == null) {
			polygoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(126);
		}
		return polygoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygone_Edge() {
        return (EReference)getPolygone().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		if (edgeEClass == null) {
			edgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(127);
		}
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_System() {
        return (EAttribute)getEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Accuracy() {
        return (EAttribute)getEdge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Longitude() {
        return (EAttribute)getEdge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Latitude() {
        return (EAttribute)getEdge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneDefinitions() {
		if (zoneDefinitionsEClass == null) {
			zoneDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(128);
		}
		return zoneDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinitions_ZoneDefinition() {
        return (EReference)getZoneDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneDefinition() {
		if (zoneDefinitionEClass == null) {
			zoneDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(129);
		}
		return zoneDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_Provider() {
        return (EReference)getZoneDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_ZoneId() {
        return (EAttribute)getZoneDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_Name() {
        return (EAttribute)getZoneDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_Polygone() {
        return (EReference)getZoneDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneDefinition_NameUtf8() {
        return (EAttribute)getZoneDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_StationSet() {
        return (EReference)getZoneDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneDefinition_NutsCodes() {
        return (EReference)getZoneDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossBorderCondition() {
		if (crossBorderConditionEClass == null) {
			crossBorderConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(130);
		}
		return crossBorderConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossBorderCondition_FromCountry() {
        return (EReference)getCrossBorderCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossBorderCondition_ToCountry() {
        return (EReference)getCrossBorderCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossBorderCondition_AffectedServiceBrands() {
        return (EReference)getCrossBorderCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFareCombinationModel() {
		if (fareCombinationModelEClass == null) {
			fareCombinationModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(131);
		}
		return fareCombinationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_Model() {
        return (EAttribute)getFareCombinationModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareCombinationModel_CombinableCarriers() {
        return (EReference)getFareCombinationModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_OnlyWhenCombined() {
        return (EAttribute)getFareCombinationModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareCombinationModel_AllowedAllocators() {
        return (EReference)getFareCombinationModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_ReferenceCluster() {
        return (EAttribute)getFareCombinationModel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFareCombinationModel_AllowedClusters() {
        return (EAttribute)getFareCombinationModel().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFareCombinationModel_AllowedCommonContracts() {
        return (EReference)getFareCombinationModel().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionConstraints() {
		if (reductionConstraintsEClass == null) {
			reductionConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(132);
		}
		return reductionConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionConstraints_ReductionConstraints() {
        return (EReference)getReductionConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionConstraint() {
		if (reductionConstraintEClass == null) {
			reductionConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(133);
		}
		return reductionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReductionConstraint_Id() {
        return (EAttribute)getReductionConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionConstraint_RequiredReductionCards() {
        return (EReference)getReductionConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionCards() {
		if (reductionCardsEClass == null) {
			reductionCardsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(134);
		}
		return reductionCardsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCards_ReductionCards() {
        return (EReference)getReductionCards().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReductionCard() {
		if (reductionCardEClass == null) {
			reductionCardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(135);
		}
		return reductionCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReductionCard_Id() {
        return (EAttribute)getReductionCard().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCard_CardIssuer() {
        return (EReference)getReductionCard().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCard_Name() {
        return (EReference)getReductionCard().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCard_ServiceClasses() {
        return (EReference)getReductionCard().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReductionCard_IdRequiredForBooking() {
        return (EAttribute)getReductionCard().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReductionCard_IncludedReductionCards() {
        return (EReference)getReductionCard().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReductionCard_UicCode() {
        return (EAttribute)getReductionCard().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredReductionCard() {
		if (requiredReductionCardEClass == null) {
			requiredReductionCardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(136);
		}
		return requiredReductionCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredReductionCard_CardClass() {
        return (EReference)getRequiredReductionCard().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredReductionCard_Card() {
        return (EReference)getRequiredReductionCard().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredReductionCard_Name() {
        return (EAttribute)getRequiredReductionCard().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggageConstraints() {
		if (luggageConstraintsEClass == null) {
			luggageConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(137);
		}
		return luggageConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuggageConstraints_Constraints() {
        return (EReference)getLuggageConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggageConstraint() {
		if (luggageConstraintEClass == null) {
			luggageConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(138);
		}
		return luggageConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageConstraint_Id() {
        return (EAttribute)getLuggageConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageConstraint_MaxHandLuggage() {
        return (EAttribute)getLuggageConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageConstraint_MaxLargeLuggage() {
        return (EAttribute)getLuggageConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuggageConstraint_RestrictedItems() {
        return (EReference)getLuggageConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageConstraint_Rules() {
        return (EAttribute)getLuggageConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageConstraint_DataDescription() {
        return (EAttribute)getLuggageConstraint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggageItemsRestriction() {
		if (luggageItemsRestrictionEClass == null) {
			luggageItemsRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(139);
		}
		return luggageItemsRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageItemsRestriction_NumberOfItems() {
        return (EAttribute)getLuggageItemsRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuggageItemsRestriction_Dimension() {
        return (EReference)getLuggageItemsRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggageDimension() {
		if (luggageDimensionEClass == null) {
			luggageDimensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(140);
		}
		return luggageDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageDimension_Value() {
        return (EAttribute)getLuggageDimension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageDimension_Dimension() {
        return (EAttribute)getLuggageDimension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddCarrierRules() {
		if (addCarrierRulesEClass == null) {
			addCarrierRulesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(143);
		}
		return addCarrierRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddCarrierRules_AddCarrierRule() {
        return (EReference)getAddCarrierRules().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddCarrierRule() {
		if (addCarrierRuleEClass == null) {
			addCarrierRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(144);
		}
		return addCarrierRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddCarrierRule_Carrier() {
        return (EReference)getAddCarrierRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddCarrierRule_Scope() {
        return (EAttribute)getAddCarrierRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddCarrierRule_Stations() {
        return (EReference)getAddCarrierRule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnBorderStations() {
		if (onBorderStationsEClass == null) {
			onBorderStationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(146);
		}
		return onBorderStationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnBorderStations_Stations() {
        return (EReference)getOnBorderStations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentType() {
		if (paymentTypeEEnum == null) {
			paymentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(6);
		}
		return paymentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSalesChannel() {
		if (salesChannelEEnum == null) {
			salesChannelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(11);
		}
		return salesChannelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionType() {
		if (transactionTypeEEnum == null) {
			transactionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(13);
		}
		return transactionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccountingType() {
		if (accountingTypeEEnum == null) {
			accountingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(15);
		}
		return accountingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSettlementValueIndicator() {
		if (settlementValueIndicatorEEnum == null) {
			settlementValueIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(16);
		}
		return settlementValueIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSalesType() {
		if (salesTypeEEnum == null) {
			salesTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(17);
		}
		return salesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionStandard() {
		if (transactionStandardEEnum == null) {
			transactionStandardEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(18);
		}
		return transactionStandardEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoardingOrArrival() {
		if (boardingOrArrivalEEnum == null) {
			boardingOrArrivalEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(83);
		}
		return boardingOrArrivalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLuggageRule() {
		if (luggageRuleEEnum == null) {
			luggageRuleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(141);
		}
		return luggageRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDimension() {
		if (dimensionEEnum == null) {
			dimensionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(142);
		}
		return dimensionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddCarrierScope() {
		if (addCarrierScopeEEnum == null) {
			addCarrierScopeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(145);
		}
		return addCarrierScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransportMode() {
		if (transportModeEEnum == null) {
			transportModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(147);
		}
		return transportModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStationRelationType() {
		if (stationRelationTypeEEnum == null) {
			stationRelationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(148);
		}
		return stationRelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStationFareDetailType() {
		if (stationFareDetailTypeEEnum == null) {
			stationFareDetailTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(149);
		}
		return stationFareDetailTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegulatoryCondition() {
		if (regulatoryConditionEEnum == null) {
			regulatoryConditionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(150);
		}
		return regulatoryConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAfterSalesTransactionType() {
		if (afterSalesTransactionTypeEEnum == null) {
			afterSalesTransactionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(151);
		}
		return afterSalesTransactionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBarcodeTypes() {
		if (barcodeTypesEEnum == null) {
			barcodeTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(152);
		}
		return barcodeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasePriceClassType() {
		if (basePriceClassTypeEEnum == null) {
			basePriceClassTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(153);
		}
		return basePriceClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassicClassType() {
		if (classicClassTypeEEnum == null) {
			classicClassTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(154);
		}
		return classicClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassId() {
		if (classIdEEnum == null) {
			classIdEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(155);
		}
		return classIdEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCharacterSet() {
		if (characterSetEEnum == null) {
			characterSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(156);
		}
		return characterSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusters() {
		if (clustersEEnum == null) {
			clustersEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(157);
		}
		return clustersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCombinationModel() {
		if (combinationModelEEnum == null) {
			combinationModelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(158);
		}
		return combinationModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlDataExchangeTypes() {
		if (controlDataExchangeTypesEEnum == null) {
			controlDataExchangeTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(159);
		}
		return controlDataExchangeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSource() {
		if (dataSourceEEnum == null) {
			dataSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(160);
		}
		return dataSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		if (dataTypeEEnum == null) {
			dataTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(161);
		}
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFareType() {
		if (fareTypeEEnum == null) {
			fareTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(162);
		}
		return fareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFulfillmentType() {
		if (fulfillmentTypeEEnum == null) {
			fulfillmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(163);
		}
		return fulfillmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeoSystem() {
		if (geoSystemEEnum == null) {
			geoSystemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(164);
		}
		return geoSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeoUnit() {
		if (geoUnitEEnum == null) {
			geoUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(165);
		}
		return geoUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGraphicalReservationType() {
		if (graphicalReservationTypeEEnum == null) {
			graphicalReservationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(166);
		}
		return graphicalReservationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericReductionCards() {
		if (genericReductionCardsEEnum == null) {
			genericReductionCardsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(167);
		}
		return genericReductionCardsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHemisphereEW() {
		if (hemisphereEWEEnum == null) {
			hemisphereEWEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(168);
		}
		return hemisphereEWEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHemisphereNS() {
		if (hemisphereNSEEnum == null) {
			hemisphereNSEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(169);
		}
		return hemisphereNSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceType() {
		if (interfaceTypeEEnum == null) {
			interfaceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(170);
		}
		return interfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacyCalculationType() {
		if (legacyCalculationTypeEEnum == null) {
			legacyCalculationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(171);
		}
		return legacyCalculationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacyPassengerType() {
		if (legacyPassengerTypeEEnum == null) {
			legacyPassengerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(172);
		}
		return legacyPassengerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacySeriesType() {
		if (legacySeriesTypeEEnum == null) {
			legacySeriesTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(173);
		}
		return legacySeriesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegacyConversionType() {
		if (legacyConversionTypeEEnum == null) {
			legacyConversionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(174);
		}
		return legacyConversionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOfferRequestType() {
		if (offerRequestTypeEEnum == null) {
			offerRequestTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(175);
		}
		return offerRequestTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOnlineServiceType() {
		if (onlineServiceTypeEEnum == null) {
			onlineServiceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(176);
		}
		return onlineServiceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonalDataItemsType() {
		if (personalDataItemsTypeEEnum == null) {
			personalDataItemsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(177);
		}
		return personalDataItemsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonalDataTransferType() {
		if (personalDataTransferTypeEEnum == null) {
			personalDataTransferTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(178);
		}
		return personalDataTransferTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonalDataChangeReason() {
		if (personalDataChangeReasonEEnum == null) {
			personalDataChangeReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(179);
		}
		return personalDataChangeReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationTravelClass() {
		if (reservationTravelClassEEnum == null) {
			reservationTravelClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(180);
		}
		return reservationTravelClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationServiceLevel() {
		if (reservationServiceLevelEEnum == null) {
			reservationServiceLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(181);
		}
		return reservationServiceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationService() {
		if (reservationServiceEEnum == null) {
			reservationServiceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(182);
		}
		return reservationServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationBerthType() {
		if (reservationBerthTypeEEnum == null) {
			reservationBerthTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(183);
		}
		return reservationBerthTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoundingType() {
		if (roundingTypeEEnum == null) {
			roundingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(184);
		}
		return roundingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemaVersion() {
		if (schemaVersionEEnum == null) {
			schemaVersionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(185);
		}
		return schemaVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceMode() {
		if (serviceModeEEnum == null) {
			serviceModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(186);
		}
		return serviceModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeZone() {
		if (timeZoneEEnum == null) {
			timeZoneEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(187);
		}
		return timeZoneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxScope() {
		if (taxScopeEEnum == null) {
			taxScopeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(188);
		}
		return taxScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeReferenceType() {
		if (timeReferenceTypeEEnum == null) {
			timeReferenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(189);
		}
		return timeReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeRangeScope() {
		if (timeRangeScopeEEnum == null) {
			timeRangeScopeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(190);
		}
		return timeRangeScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		if (timeUnitEEnum == null) {
			timeUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(191);
		}
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTravelerType() {
		if (travelerTypeEEnum == null) {
			travelerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(192);
		}
		return travelerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTripAllocationProcess() {
		if (tripAllocationProcessEEnum == null) {
			tripAllocationProcessEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(193);
		}
		return tripAllocationProcessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTripAllocationUnit() {
		if (tripAllocationUnitEEnum == null) {
			tripAllocationUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(194);
		}
		return tripAllocationUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTripInterruptionProcess() {
		if (tripInterruptionProcessEEnum == null) {
			tripInterruptionProcessEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(195);
		}
		return tripInterruptionProcessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTravelValidityType() {
		if (travelValidityTypeEEnum == null) {
			travelValidityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(196);
		}
		return travelValidityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeekDay() {
		if (weekDayEEnum == null) {
			weekDayEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(197);
		}
		return weekDayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateAsDate() {
		if (dateAsDateEDataType == null) {
			dateAsDateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(0);
		}
		return dateAsDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateAsDateTime() {
		if (dateAsDateTimeEDataType == null) {
			dateAsDateTimeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI).getEClassifiers().get(1);
		}
		return dateAsDateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFactory getAccountingFactory() {
		return (AccountingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("Accounting." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //AccountingPackageImpl
