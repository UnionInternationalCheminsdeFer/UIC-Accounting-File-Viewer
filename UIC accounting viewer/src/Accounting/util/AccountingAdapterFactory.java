/**
 */
package Accounting.util;

import Accounting.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Accounting.AccountingPackage
 * @generated
 */
public class AccountingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccountingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AccountingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingSwitch<Adapter> modelSwitch =
		new AccountingSwitch<Adapter>() {
			@Override
			public Adapter caseAccountingViewerData(AccountingViewerData object) {
				return createAccountingViewerDataAdapter();
			}
			@Override
			public Adapter caseAccountingFile(AccountingFile object) {
				return createAccountingFileAdapter();
			}
			@Override
			public Adapter caseAccountingRecords(AccountingRecords object) {
				return createAccountingRecordsAdapter();
			}
			@Override
			public Adapter caseAccountingDelivery(AccountingDelivery object) {
				return createAccountingDeliveryAdapter();
			}
			@Override
			public Adapter caseAccountingRecord(AccountingRecord object) {
				return createAccountingRecordAdapter();
			}
			@Override
			public Adapter caseAccountedAmounts(AccountedAmounts object) {
				return createAccountedAmountsAdapter();
			}
			@Override
			public Adapter caseAccountingSubject(AccountingSubject object) {
				return createAccountingSubjectAdapter();
			}
			@Override
			public Adapter caseLegacyDescription(LegacyDescription object) {
				return createLegacyDescriptionAdapter();
			}
			@Override
			public Adapter caseTransaction(Transaction object) {
				return createTransactionAdapter();
			}
			@Override
			public Adapter caseAccountedAmount(AccountedAmount object) {
				return createAccountedAmountAdapter();
			}
			@Override
			public Adapter caseCodeLists(CodeLists object) {
				return createCodeListsAdapter();
			}
			@Override
			public Adapter caseWorkflowHistory(WorkflowHistory object) {
				return createWorkflowHistoryAdapter();
			}
			@Override
			public Adapter caseWorkflowStep(WorkflowStep object) {
				return createWorkflowStepAdapter();
			}
			@Override
			public Adapter caseNUTSCodes(NUTSCodes object) {
				return createNUTSCodesAdapter();
			}
			@Override
			public Adapter caseNutsCode(NutsCode object) {
				return createNutsCodeAdapter();
			}
			@Override
			public Adapter caseServiceBrands(ServiceBrands object) {
				return createServiceBrandsAdapter();
			}
			@Override
			public Adapter caseServiceBrand(ServiceBrand object) {
				return createServiceBrandAdapter();
			}
			@Override
			public Adapter caseCountries(Countries object) {
				return createCountriesAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter caseLanguages(Languages object) {
				return createLanguagesAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseCurrencies(Currencies object) {
				return createCurrenciesAdapter();
			}
			@Override
			public Adapter caseCurrency(Currency object) {
				return createCurrencyAdapter();
			}
			@Override
			public Adapter caseStations(Stations object) {
				return createStationsAdapter();
			}
			@Override
			public Adapter caseStation(Station object) {
				return createStationAdapter();
			}
			@Override
			public Adapter caseCarrier(Carrier object) {
				return createCarrierAdapter();
			}
			@Override
			public Adapter caseCarriers(Carriers object) {
				return createCarriersAdapter();
			}
			@Override
			public Adapter caseGeneralTariffModel(GeneralTariffModel object) {
				return createGeneralTariffModelAdapter();
			}
			@Override
			public Adapter caseDelivery(Delivery object) {
				return createDeliveryAdapter();
			}
			@Override
			public Adapter caseStationSet(StationSet object) {
				return createStationSetAdapter();
			}
			@Override
			public Adapter caseAfterSalesRules(AfterSalesRules object) {
				return createAfterSalesRulesAdapter();
			}
			@Override
			public Adapter caseAfterSalesRule(AfterSalesRule object) {
				return createAfterSalesRuleAdapter();
			}
			@Override
			public Adapter caseAfterSalesCondition(AfterSalesCondition object) {
				return createAfterSalesConditionAdapter();
			}
			@Override
			public Adapter caseApplicationTime(ApplicationTime object) {
				return createApplicationTimeAdapter();
			}
			@Override
			public Adapter caseFareStructure(FareStructure object) {
				return createFareStructureAdapter();
			}
			@Override
			public Adapter caseConnectionPoints(ConnectionPoints object) {
				return createConnectionPointsAdapter();
			}
			@Override
			public Adapter caseConnectionPoint(ConnectionPoint object) {
				return createConnectionPointAdapter();
			}
			@Override
			public Adapter caseFareResourceLocations(FareResourceLocations object) {
				return createFareResourceLocationsAdapter();
			}
			@Override
			public Adapter caseTrainResourceLocations(TrainResourceLocations object) {
				return createTrainResourceLocationsAdapter();
			}
			@Override
			public Adapter caseStationResourceLocations(StationResourceLocations object) {
				return createStationResourceLocationsAdapter();
			}
			@Override
			public Adapter caseCarrierResourceLocations(CarrierResourceLocations object) {
				return createCarrierResourceLocationsAdapter();
			}
			@Override
			public Adapter caseTrainResourceLocation(TrainResourceLocation object) {
				return createTrainResourceLocationAdapter();
			}
			@Override
			public Adapter caseStationResourceLocation(StationResourceLocation object) {
				return createStationResourceLocationAdapter();
			}
			@Override
			public Adapter caseCarrierResourceLocation(CarrierResourceLocation object) {
				return createCarrierResourceLocationAdapter();
			}
			@Override
			public Adapter caseOnlineResource(OnlineResource object) {
				return createOnlineResourceAdapter();
			}
			@Override
			public Adapter caseFulfillmentConstraints(FulfillmentConstraints object) {
				return createFulfillmentConstraintsAdapter();
			}
			@Override
			public Adapter caseFulfillmentConstraint(FulfillmentConstraint object) {
				return createFulfillmentConstraintAdapter();
			}
			@Override
			public Adapter caseRequiredBarcodes(RequiredBarcodes object) {
				return createRequiredBarcodesAdapter();
			}
			@Override
			public Adapter caseAcceptedBarcodes(AcceptedBarcodes object) {
				return createAcceptedBarcodesAdapter();
			}
			@Override
			public Adapter caseSupportedOnlineServices(SupportedOnlineServices object) {
				return createSupportedOnlineServicesAdapter();
			}
			@Override
			public Adapter caseStationNames(StationNames object) {
				return createStationNamesAdapter();
			}
			@Override
			public Adapter caseFareElements(FareElements object) {
				return createFareElementsAdapter();
			}
			@Override
			public Adapter caseFareElement(FareElement object) {
				return createFareElementAdapter();
			}
			@Override
			public Adapter caseTotalPassengerCombinationConstraints(TotalPassengerCombinationConstraints object) {
				return createTotalPassengerCombinationConstraintsAdapter();
			}
			@Override
			public Adapter caseTotalPassengerCombinationConstraint(TotalPassengerCombinationConstraint object) {
				return createTotalPassengerCombinationConstraintAdapter();
			}
			@Override
			public Adapter caseFareConstraintBundles(FareConstraintBundles object) {
				return createFareConstraintBundlesAdapter();
			}
			@Override
			public Adapter caseFareConstraintBundle(FareConstraintBundle object) {
				return createFareConstraintBundleAdapter();
			}
			@Override
			public Adapter caseFareStationSetDefinitions(FareStationSetDefinitions object) {
				return createFareStationSetDefinitionsAdapter();
			}
			@Override
			public Adapter caseFareStationSetDefinition(FareStationSetDefinition object) {
				return createFareStationSetDefinitionAdapter();
			}
			@Override
			public Adapter caseLegacyAccountingIdentifier(LegacyAccountingIdentifier object) {
				return createLegacyAccountingIdentifierAdapter();
			}
			@Override
			public Adapter casePersonalDataConstraints(PersonalDataConstraints object) {
				return createPersonalDataConstraintsAdapter();
			}
			@Override
			public Adapter casePersonalDataConstraint(PersonalDataConstraint object) {
				return createPersonalDataConstraintAdapter();
			}
			@Override
			public Adapter caseRequiredPersonalData(RequiredPersonalData object) {
				return createRequiredPersonalDataAdapter();
			}
			@Override
			public Adapter caseAllowedPersonalDataChanges(AllowedPersonalDataChanges object) {
				return createAllowedPersonalDataChangesAdapter();
			}
			@Override
			public Adapter casePassengerConstraints(PassengerConstraints object) {
				return createPassengerConstraintsAdapter();
			}
			@Override
			public Adapter casePassengerConstraint(PassengerConstraint object) {
				return createPassengerConstraintAdapter();
			}
			@Override
			public Adapter casePassengerCombinationConstraint(PassengerCombinationConstraint object) {
				return createPassengerCombinationConstraintAdapter();
			}
			@Override
			public Adapter caseIncludedFreePassengerLimit(IncludedFreePassengerLimit object) {
				return createIncludedFreePassengerLimitAdapter();
			}
			@Override
			public Adapter caseCombinationConstraints(CombinationConstraints object) {
				return createCombinationConstraintsAdapter();
			}
			@Override
			public Adapter caseCombinationConstraint(CombinationConstraint object) {
				return createCombinationConstraintAdapter();
			}
			@Override
			public Adapter caseTravelValidityConstraints(TravelValidityConstraints object) {
				return createTravelValidityConstraintsAdapter();
			}
			@Override
			public Adapter caseTravelValidityConstraint(TravelValidityConstraint object) {
				return createTravelValidityConstraintAdapter();
			}
			@Override
			public Adapter caseTrainValidity(TrainValidity object) {
				return createTrainValidityAdapter();
			}
			@Override
			public Adapter caseSalesAvailabilityConstraints(SalesAvailabilityConstraints object) {
				return createSalesAvailabilityConstraintsAdapter();
			}
			@Override
			public Adapter caseSalesAvailabilityConstraint(SalesAvailabilityConstraint object) {
				return createSalesAvailabilityConstraintAdapter();
			}
			@Override
			public Adapter caseSalesRestriction(SalesRestriction object) {
				return createSalesRestrictionAdapter();
			}
			@Override
			public Adapter caseEndOfSale(EndOfSale object) {
				return createEndOfSaleAdapter();
			}
			@Override
			public Adapter caseStartOfSale(StartOfSale object) {
				return createStartOfSaleAdapter();
			}
			@Override
			public Adapter caseCarrierConstraints(CarrierConstraints object) {
				return createCarrierConstraintsAdapter();
			}
			@Override
			public Adapter caseCarrierConstraint(CarrierConstraint object) {
				return createCarrierConstraintAdapter();
			}
			@Override
			public Adapter caseServiceConstraints(ServiceConstraints object) {
				return createServiceConstraintsAdapter();
			}
			@Override
			public Adapter caseServiceConstraint(ServiceConstraint object) {
				return createServiceConstraintAdapter();
			}
			@Override
			public Adapter caseRegionalConstraints(RegionalConstraints object) {
				return createRegionalConstraintsAdapter();
			}
			@Override
			public Adapter caseRegionalConstraint(RegionalConstraint object) {
				return createRegionalConstraintAdapter();
			}
			@Override
			public Adapter caseRegionalValidity(RegionalValidity object) {
				return createRegionalValidityAdapter();
			}
			@Override
			public Adapter caseServiceLevelDefinitions(ServiceLevelDefinitions object) {
				return createServiceLevelDefinitionsAdapter();
			}
			@Override
			public Adapter caseTexts(Texts object) {
				return createTextsAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseTranslation(Translation object) {
				return createTranslationAdapter();
			}
			@Override
			public Adapter casePrices(Prices object) {
				return createPricesAdapter();
			}
			@Override
			public Adapter casePrice(Price object) {
				return createPriceAdapter();
			}
			@Override
			public Adapter caseVATDetail(VATDetail object) {
				return createVATDetailAdapter();
			}
			@Override
			public Adapter caseCurrencyPrice(CurrencyPrice object) {
				return createCurrencyPriceAdapter();
			}
			@Override
			public Adapter caseServiceClassDefinitions(ServiceClassDefinitions object) {
				return createServiceClassDefinitionsAdapter();
			}
			@Override
			public Adapter caseCalendars(Calendars object) {
				return createCalendarsAdapter();
			}
			@Override
			public Adapter caseCalendar(Calendar object) {
				return createCalendarAdapter();
			}
			@Override
			public Adapter caseReservationParameters(ReservationParameters object) {
				return createReservationParametersAdapter();
			}
			@Override
			public Adapter caseReservationParameter(ReservationParameter object) {
				return createReservationParameterAdapter();
			}
			@Override
			public Adapter caseReservationParams9181(ReservationParams9181 object) {
				return createReservationParams9181Adapter();
			}
			@Override
			public Adapter caseReservationOptions(ReservationOptions object) {
				return createReservationOptionsAdapter();
			}
			@Override
			public Adapter caseReservationPreferenceGroup(ReservationPreferenceGroup object) {
				return createReservationPreferenceGroupAdapter();
			}
			@Override
			public Adapter caseServiceClass(ServiceClass object) {
				return createServiceClassAdapter();
			}
			@Override
			public Adapter caseServiceLevel(ServiceLevel object) {
				return createServiceLevelAdapter();
			}
			@Override
			public Adapter caseTimeRange(TimeRange object) {
				return createTimeRangeAdapter();
			}
			@Override
			public Adapter caseExcludedTimeRange(ExcludedTimeRange object) {
				return createExcludedTimeRangeAdapter();
			}
			@Override
			public Adapter caseValidityRange(ValidityRange object) {
				return createValidityRangeAdapter();
			}
			@Override
			public Adapter caseRelativeTime(RelativeTime object) {
				return createRelativeTimeAdapter();
			}
			@Override
			public Adapter caseReturnValidityConstraint(ReturnValidityConstraint object) {
				return createReturnValidityConstraintAdapter();
			}
			@Override
			public Adapter caseTripAllocationConstraint(TripAllocationConstraint object) {
				return createTripAllocationConstraintAdapter();
			}
			@Override
			public Adapter caseTripInterruptionConstraint(TripInterruptionConstraint object) {
				return createTripInterruptionConstraintAdapter();
			}
			@Override
			public Adapter caseViaStation(ViaStation object) {
				return createViaStationAdapter();
			}
			@Override
			public Adapter caseAlternativeRoute(AlternativeRoute object) {
				return createAlternativeRouteAdapter();
			}
			@Override
			public Adapter caseRoute(Route object) {
				return createRouteAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter casePolygone(Polygone object) {
				return createPolygoneAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseZoneDefinitions(ZoneDefinitions object) {
				return createZoneDefinitionsAdapter();
			}
			@Override
			public Adapter caseZoneDefinition(ZoneDefinition object) {
				return createZoneDefinitionAdapter();
			}
			@Override
			public Adapter caseCrossBorderCondition(CrossBorderCondition object) {
				return createCrossBorderConditionAdapter();
			}
			@Override
			public Adapter caseFareCombinationModel(FareCombinationModel object) {
				return createFareCombinationModelAdapter();
			}
			@Override
			public Adapter caseReductionConstraints(ReductionConstraints object) {
				return createReductionConstraintsAdapter();
			}
			@Override
			public Adapter caseReductionConstraint(ReductionConstraint object) {
				return createReductionConstraintAdapter();
			}
			@Override
			public Adapter caseReductionCards(ReductionCards object) {
				return createReductionCardsAdapter();
			}
			@Override
			public Adapter caseReductionCard(ReductionCard object) {
				return createReductionCardAdapter();
			}
			@Override
			public Adapter caseRequiredReductionCard(RequiredReductionCard object) {
				return createRequiredReductionCardAdapter();
			}
			@Override
			public Adapter caseLuggageConstraints(LuggageConstraints object) {
				return createLuggageConstraintsAdapter();
			}
			@Override
			public Adapter caseLuggageConstraint(LuggageConstraint object) {
				return createLuggageConstraintAdapter();
			}
			@Override
			public Adapter caseLuggageItemsRestriction(LuggageItemsRestriction object) {
				return createLuggageItemsRestrictionAdapter();
			}
			@Override
			public Adapter caseLuggageDimension(LuggageDimension object) {
				return createLuggageDimensionAdapter();
			}
			@Override
			public Adapter caseAddCarrierRules(AddCarrierRules object) {
				return createAddCarrierRulesAdapter();
			}
			@Override
			public Adapter caseAddCarrierRule(AddCarrierRule object) {
				return createAddCarrierRuleAdapter();
			}
			@Override
			public Adapter caseOnBorderStations(OnBorderStations object) {
				return createOnBorderStationsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountingViewerData <em>Viewer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountingViewerData
	 * @generated
	 */
	public Adapter createAccountingViewerDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountingFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountingFile
	 * @generated
	 */
	public Adapter createAccountingFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountingRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountingRecords
	 * @generated
	 */
	public Adapter createAccountingRecordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountingDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountingDelivery
	 * @generated
	 */
	public Adapter createAccountingDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountingRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountingRecord
	 * @generated
	 */
	public Adapter createAccountingRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountedAmounts <em>Accounted Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountedAmounts
	 * @generated
	 */
	public Adapter createAccountedAmountsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountingSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountingSubject
	 * @generated
	 */
	public Adapter createAccountingSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.LegacyDescription <em>Legacy Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.LegacyDescription
	 * @generated
	 */
	public Adapter createLegacyDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AccountedAmount <em>Accounted Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AccountedAmount
	 * @generated
	 */
	public Adapter createAccountedAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CodeLists
	 * @generated
	 */
	public Adapter createCodeListsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.WorkflowHistory <em>Workflow History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.WorkflowHistory
	 * @generated
	 */
	public Adapter createWorkflowHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.WorkflowStep <em>Workflow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.WorkflowStep
	 * @generated
	 */
	public Adapter createWorkflowStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.NUTSCodes <em>NUTS Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.NUTSCodes
	 * @generated
	 */
	public Adapter createNUTSCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.NutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.NutsCode
	 * @generated
	 */
	public Adapter createNutsCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceBrands
	 * @generated
	 */
	public Adapter createServiceBrandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceBrand
	 * @generated
	 */
	public Adapter createServiceBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Countries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Countries
	 * @generated
	 */
	public Adapter createCountriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Languages
	 * @generated
	 */
	public Adapter createLanguagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Currencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Currencies
	 * @generated
	 */
	public Adapter createCurrenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Currency
	 * @generated
	 */
	public Adapter createCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Stations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Stations
	 * @generated
	 */
	public Adapter createStationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Station
	 * @generated
	 */
	public Adapter createStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Carrier
	 * @generated
	 */
	public Adapter createCarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Carriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Carriers
	 * @generated
	 */
	public Adapter createCarriersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.StationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.StationSet
	 * @generated
	 */
	public Adapter createStationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.GeneralTariffModel <em>General Tariff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.GeneralTariffModel
	 * @generated
	 */
	public Adapter createGeneralTariffModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Delivery
	 * @generated
	 */
	public Adapter createDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AfterSalesRules
	 * @generated
	 */
	public Adapter createAfterSalesRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AfterSalesRule
	 * @generated
	 */
	public Adapter createAfterSalesRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AfterSalesCondition <em>After Sales Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AfterSalesCondition
	 * @generated
	 */
	public Adapter createAfterSalesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ApplicationTime
	 * @generated
	 */
	public Adapter createApplicationTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareStructure
	 * @generated
	 */
	public Adapter createFareStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ConnectionPoints
	 * @generated
	 */
	public Adapter createConnectionPointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ConnectionPoint
	 * @generated
	 */
	public Adapter createConnectionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareResourceLocations
	 * @generated
	 */
	public Adapter createFareResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TrainResourceLocations
	 * @generated
	 */
	public Adapter createTrainResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.StationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.StationResourceLocations
	 * @generated
	 */
	public Adapter createStationResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CarrierResourceLocations
	 * @generated
	 */
	public Adapter createCarrierResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TrainResourceLocation <em>Train Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TrainResourceLocation
	 * @generated
	 */
	public Adapter createTrainResourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.StationResourceLocation <em>Station Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.StationResourceLocation
	 * @generated
	 */
	public Adapter createStationResourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CarrierResourceLocation <em>Carrier Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CarrierResourceLocation
	 * @generated
	 */
	public Adapter createCarrierResourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.OnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.OnlineResource
	 * @generated
	 */
	public Adapter createOnlineResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FulfillmentConstraints
	 * @generated
	 */
	public Adapter createFulfillmentConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FulfillmentConstraint
	 * @generated
	 */
	public Adapter createFulfillmentConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.RequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.RequiredBarcodes
	 * @generated
	 */
	public Adapter createRequiredBarcodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AcceptedBarcodes
	 * @generated
	 */
	public Adapter createAcceptedBarcodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.SupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.SupportedOnlineServices
	 * @generated
	 */
	public Adapter createSupportedOnlineServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.StationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.StationNames
	 * @generated
	 */
	public Adapter createStationNamesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareElements
	 * @generated
	 */
	public Adapter createFareElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareElement <em>Fare Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareElement
	 * @generated
	 */
	public Adapter createFareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TotalPassengerCombinationConstraints <em>Total Passenger Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TotalPassengerCombinationConstraints
	 * @generated
	 */
	public Adapter createTotalPassengerCombinationConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TotalPassengerCombinationConstraint <em>Total Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TotalPassengerCombinationConstraint
	 * @generated
	 */
	public Adapter createTotalPassengerCombinationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareConstraintBundles <em>Fare Constraint Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareConstraintBundles
	 * @generated
	 */
	public Adapter createFareConstraintBundlesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareConstraintBundle <em>Fare Constraint Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareConstraintBundle
	 * @generated
	 */
	public Adapter createFareConstraintBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareStationSetDefinitions
	 * @generated
	 */
	public Adapter createFareStationSetDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareStationSetDefinition <em>Fare Station Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareStationSetDefinition
	 * @generated
	 */
	public Adapter createFareStationSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.LegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.LegacyAccountingIdentifier
	 * @generated
	 */
	public Adapter createLegacyAccountingIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.PersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.PersonalDataConstraints
	 * @generated
	 */
	public Adapter createPersonalDataConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.PersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.PersonalDataConstraint
	 * @generated
	 */
	public Adapter createPersonalDataConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.RequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.RequiredPersonalData
	 * @generated
	 */
	public Adapter createRequiredPersonalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AllowedPersonalDataChanges <em>Allowed Personal Data Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AllowedPersonalDataChanges
	 * @generated
	 */
	public Adapter createAllowedPersonalDataChangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.PassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.PassengerConstraints
	 * @generated
	 */
	public Adapter createPassengerConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.PassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.PassengerConstraint
	 * @generated
	 */
	public Adapter createPassengerConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.PassengerCombinationConstraint <em>Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.PassengerCombinationConstraint
	 * @generated
	 */
	public Adapter createPassengerCombinationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.IncludedFreePassengerLimit <em>Included Free Passenger Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.IncludedFreePassengerLimit
	 * @generated
	 */
	public Adapter createIncludedFreePassengerLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CombinationConstraints
	 * @generated
	 */
	public Adapter createCombinationConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CombinationConstraint
	 * @generated
	 */
	public Adapter createCombinationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TravelValidityConstraints
	 * @generated
	 */
	public Adapter createTravelValidityConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TravelValidityConstraint <em>Travel Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TravelValidityConstraint
	 * @generated
	 */
	public Adapter createTravelValidityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TrainValidity <em>Train Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TrainValidity
	 * @generated
	 */
	public Adapter createTrainValidityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.SalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.SalesAvailabilityConstraints
	 * @generated
	 */
	public Adapter createSalesAvailabilityConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.SalesAvailabilityConstraint <em>Sales Availability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.SalesAvailabilityConstraint
	 * @generated
	 */
	public Adapter createSalesAvailabilityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.SalesRestriction <em>Sales Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.SalesRestriction
	 * @generated
	 */
	public Adapter createSalesRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.EndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.EndOfSale
	 * @generated
	 */
	public Adapter createEndOfSaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.StartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.StartOfSale
	 * @generated
	 */
	public Adapter createStartOfSaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CarrierConstraints
	 * @generated
	 */
	public Adapter createCarrierConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CarrierConstraint
	 * @generated
	 */
	public Adapter createCarrierConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceConstraints
	 * @generated
	 */
	public Adapter createServiceConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceConstraint
	 * @generated
	 */
	public Adapter createServiceConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.RegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.RegionalConstraints
	 * @generated
	 */
	public Adapter createRegionalConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.RegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.RegionalConstraint
	 * @generated
	 */
	public Adapter createRegionalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.RegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.RegionalValidity
	 * @generated
	 */
	public Adapter createRegionalValidityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceLevelDefinitions
	 * @generated
	 */
	public Adapter createServiceLevelDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Texts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Texts
	 * @generated
	 */
	public Adapter createTextsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Translation
	 * @generated
	 */
	public Adapter createTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Prices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Prices
	 * @generated
	 */
	public Adapter createPricesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Price
	 * @generated
	 */
	public Adapter createPriceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.VATDetail <em>VAT Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.VATDetail
	 * @generated
	 */
	public Adapter createVATDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CurrencyPrice <em>Currency Price</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CurrencyPrice
	 * @generated
	 */
	public Adapter createCurrencyPriceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceClassDefinitions
	 * @generated
	 */
	public Adapter createServiceClassDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Calendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Calendars
	 * @generated
	 */
	public Adapter createCalendarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReservationParameters
	 * @generated
	 */
	public Adapter createReservationParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReservationParameter
	 * @generated
	 */
	public Adapter createReservationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReservationParams9181 <em>Reservation Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReservationParams9181
	 * @generated
	 */
	public Adapter createReservationParams9181Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReservationOptions <em>Reservation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReservationOptions
	 * @generated
	 */
	public Adapter createReservationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReservationPreferenceGroup <em>Reservation Preference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReservationPreferenceGroup
	 * @generated
	 */
	public Adapter createReservationPreferenceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceClass
	 * @generated
	 */
	public Adapter createServiceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ServiceLevel
	 * @generated
	 */
	public Adapter createServiceLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TimeRange
	 * @generated
	 */
	public Adapter createTimeRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ExcludedTimeRange
	 * @generated
	 */
	public Adapter createExcludedTimeRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ValidityRange <em>Validity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ValidityRange
	 * @generated
	 */
	public Adapter createValidityRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.RelativeTime <em>Relative Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.RelativeTime
	 * @generated
	 */
	public Adapter createRelativeTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReturnValidityConstraint <em>Return Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReturnValidityConstraint
	 * @generated
	 */
	public Adapter createReturnValidityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TripAllocationConstraint <em>Trip Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TripAllocationConstraint
	 * @generated
	 */
	public Adapter createTripAllocationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.TripInterruptionConstraint <em>Trip Interruption Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.TripInterruptionConstraint
	 * @generated
	 */
	public Adapter createTripInterruptionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ViaStation
	 * @generated
	 */
	public Adapter createViaStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AlternativeRoute <em>Alternative Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AlternativeRoute
	 * @generated
	 */
	public Adapter createAlternativeRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Polygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Polygone
	 * @generated
	 */
	public Adapter createPolygoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ZoneDefinitions <em>Zone Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ZoneDefinitions
	 * @generated
	 */
	public Adapter createZoneDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ZoneDefinition <em>Zone Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ZoneDefinition
	 * @generated
	 */
	public Adapter createZoneDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.CrossBorderCondition <em>Cross Border Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.CrossBorderCondition
	 * @generated
	 */
	public Adapter createCrossBorderConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.FareCombinationModel <em>Fare Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.FareCombinationModel
	 * @generated
	 */
	public Adapter createFareCombinationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReductionConstraints
	 * @generated
	 */
	public Adapter createReductionConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReductionConstraint
	 * @generated
	 */
	public Adapter createReductionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReductionCards
	 * @generated
	 */
	public Adapter createReductionCardsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.ReductionCard <em>Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.ReductionCard
	 * @generated
	 */
	public Adapter createReductionCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.RequiredReductionCard <em>Required Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.RequiredReductionCard
	 * @generated
	 */
	public Adapter createRequiredReductionCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.LuggageConstraints <em>Luggage Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.LuggageConstraints
	 * @generated
	 */
	public Adapter createLuggageConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.LuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.LuggageConstraint
	 * @generated
	 */
	public Adapter createLuggageConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.LuggageItemsRestriction <em>Luggage Items Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.LuggageItemsRestriction
	 * @generated
	 */
	public Adapter createLuggageItemsRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.LuggageDimension <em>Luggage Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.LuggageDimension
	 * @generated
	 */
	public Adapter createLuggageDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AddCarrierRules <em>Add Carrier Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AddCarrierRules
	 * @generated
	 */
	public Adapter createAddCarrierRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.AddCarrierRule <em>Add Carrier Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.AddCarrierRule
	 * @generated
	 */
	public Adapter createAddCarrierRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Accounting.OnBorderStations <em>On Border Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Accounting.OnBorderStations
	 * @generated
	 */
	public Adapter createOnBorderStationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AccountingAdapterFactory
