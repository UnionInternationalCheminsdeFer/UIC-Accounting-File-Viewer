/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FareElement#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.FareElement#getType <em>Type</em>}</li>
 *   <li>{@link Accounting.FareElement#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.FareElement#getFareConstraintBundle <em>Fare Constraint Bundle</em>}</li>
 *   <li>{@link Accounting.FareElement#getText <em>Text</em>}</li>
 *   <li>{@link Accounting.FareElement#getPrice <em>Price</em>}</li>
 *   <li>{@link Accounting.FareElement#getRegionalConstraint <em>Regional Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getServiceConstraint <em>Service Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link Accounting.FareElement#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link Accounting.FareElement#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Accounting.FareElement#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Accounting.FareElement#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getFareDetailDescription <em>Fare Detail Description</em>}</li>
 *   <li>{@link Accounting.FareElement#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Accounting.FareElement#getReductionConstraint <em>Reduction Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getPassengerConstraint <em>Passenger Constraint</em>}</li>
 *   <li>{@link Accounting.FareElement#getRegulatoryConditions <em>Regulatory Conditions</em>}</li>
 *   <li>{@link Accounting.FareElement#getAfterSalesRule <em>After Sales Rule</em>}</li>
 *   <li>{@link Accounting.FareElement#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Accounting.FareElement#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}</li>
 *   <li>{@link Accounting.FareElement#getLegacyConversion <em>Legacy Conversion</em>}</li>
 *   <li>{@link Accounting.FareElement#isIndividualContracts <em>Individual Contracts</em>}</li>
 *   <li>{@link Accounting.FareElement#getInvolvedTcos <em>Involved Tcos</em>}</li>
 *   <li>{@link Accounting.FareElement#getLuggageConstraint <em>Luggage Constraint</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFareElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TYPE_MUST PRICE_MUST TEXT_MUST SERVICE_CLASS_MUST PASSENGER_CONSTRAINT_MUST LEGACY_ACCOUNTING_MISSING CONVERSION_MISSING BUNDLE_MUST'"
 * @generated
 */
public interface FareElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getFareElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.FareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Accounting.FareType
	 * @see #setType(FareType)
	 * @see Accounting.AccountingPackage#getFareElement_Type()
	 * @model
	 * @generated
	 */
	FareType getType();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Accounting.FareType
	 * @see #getType()
	 * @generated
	 */
	void setType(FareType value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Accounting.AccountingPackage#getFareElement_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fare Constraint Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Constraint Bundle</em>' reference.
	 * @see #setFareConstraintBundle(FareConstraintBundle)
	 * @see Accounting.AccountingPackage#getFareElement_FareConstraintBundle()
	 * @model
	 * @generated
	 */
	FareConstraintBundle getFareConstraintBundle();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getFareConstraintBundle <em>Fare Constraint Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Constraint Bundle</em>' reference.
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	void setFareConstraintBundle(FareConstraintBundle value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see Accounting.AccountingPackage#getFareElement_Text()
	 * @model
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' reference.
	 * @see #setPrice(Price)
	 * @see Accounting.AccountingPackage#getFareElement_Price()
	 * @model
	 * @generated
	 */
	Price getPrice();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getPrice <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Price value);

	/**
	 * Returns the value of the '<em><b>Regional Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Constraint</em>' reference.
	 * @see #setRegionalConstraint(RegionalConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_RegionalConstraint()
	 * @model
	 * @generated
	 */
	RegionalConstraint getRegionalConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getRegionalConstraint <em>Regional Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regional Constraint</em>' reference.
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	void setRegionalConstraint(RegionalConstraint value);

	/**
	 * Returns the value of the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraint</em>' reference.
	 * @see #setServiceConstraint(ServiceConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_ServiceConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getServiceConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getServiceConstraint <em>Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Constraint</em>' reference.
	 * @see #getServiceConstraint()
	 * @generated
	 */
	void setServiceConstraint(ServiceConstraint value);

	/**
	 * Returns the value of the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraint</em>' reference.
	 * @see #setCarrierConstraint(CarrierConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraint</em>' reference.
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	void setCarrierConstraint(CarrierConstraint value);

	/**
	 * Returns the value of the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class</em>' reference.
	 * @see #setServiceClass(ServiceClass)
	 * @see Accounting.AccountingPackage#getFareElement_ServiceClass()
	 * @model
	 * @generated
	 */
	ServiceClass getServiceClass();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getServiceClass <em>Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class</em>' reference.
	 * @see #getServiceClass()
	 * @generated
	 */
	void setServiceClass(ServiceClass value);

	/**
	 * Returns the value of the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level</em>' reference.
	 * @see #setServiceLevel(ServiceLevel)
	 * @see Accounting.AccountingPackage#getFareElement_ServiceLevel()
	 * @model
	 * @generated
	 */
	ServiceLevel getServiceLevel();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getServiceLevel <em>Service Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level</em>' reference.
	 * @see #getServiceLevel()
	 * @generated
	 */
	void setServiceLevel(ServiceLevel value);

	/**
	 * Returns the value of the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Availability</em>' reference.
	 * @see #setSalesAvailability(SalesAvailabilityConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_SalesAvailability()
	 * @model
	 * @generated
	 */
	SalesAvailabilityConstraint getSalesAvailability();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getSalesAvailability <em>Sales Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Availability</em>' reference.
	 * @see #getSalesAvailability()
	 * @generated
	 */
	void setSalesAvailability(SalesAvailabilityConstraint value);

	/**
	 * Returns the value of the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Validity</em>' reference.
	 * @see #setTravelValidity(TravelValidityConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_TravelValidity()
	 * @model
	 * @generated
	 */
	TravelValidityConstraint getTravelValidity();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getTravelValidity <em>Travel Validity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Validity</em>' reference.
	 * @see #getTravelValidity()
	 * @generated
	 */
	void setTravelValidity(TravelValidityConstraint value);

	/**
	 * Returns the value of the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Constraint</em>' reference.
	 * @see #setCombinationConstraint(CombinationConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_CombinationConstraint()
	 * @model
	 * @generated
	 */
	CombinationConstraint getCombinationConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getCombinationConstraint <em>Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination Constraint</em>' reference.
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	void setCombinationConstraint(CombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Detail Description</em>' reference.
	 * @see #setFareDetailDescription(Text)
	 * @see Accounting.AccountingPackage#getFareElement_FareDetailDescription()
	 * @model
	 * @generated
	 */
	Text getFareDetailDescription();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getFareDetailDescription <em>Fare Detail Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fare Detail Description</em>' reference.
	 * @see #getFareDetailDescription()
	 * @generated
	 */
	void setFareDetailDescription(Text value);

	/**
	 * Returns the value of the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #setPersonalDataConstraint(PersonalDataConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_PersonalDataConstraint()
	 * @model
	 * @generated
	 */
	PersonalDataConstraint getPersonalDataConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getPersonalDataConstraint <em>Personal Data Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	void setPersonalDataConstraint(PersonalDataConstraint value);

	/**
	 * Returns the value of the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Parameter</em>' reference.
	 * @see #setReservationParameter(ReservationParameter)
	 * @see Accounting.AccountingPackage#getFareElement_ReservationParameter()
	 * @model
	 * @generated
	 */
	ReservationParameter getReservationParameter();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getReservationParameter <em>Reservation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Parameter</em>' reference.
	 * @see #getReservationParameter()
	 * @generated
	 */
	void setReservationParameter(ReservationParameter value);

	/**
	 * Returns the value of the '<em><b>Reduction Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Constraint</em>' reference.
	 * @see #setReductionConstraint(ReductionConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_ReductionConstraint()
	 * @model
	 * @generated
	 */
	ReductionConstraint getReductionConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getReductionConstraint <em>Reduction Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction Constraint</em>' reference.
	 * @see #getReductionConstraint()
	 * @generated
	 */
	void setReductionConstraint(ReductionConstraint value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #setFulfillmentConstraint(FulfillmentConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_FulfillmentConstraint()
	 * @model
	 * @generated
	 */
	FulfillmentConstraint getFulfillmentConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getFulfillmentConstraint <em>Fulfillment Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	void setFulfillmentConstraint(FulfillmentConstraint value);

	/**
	 * Returns the value of the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Constraint</em>' reference.
	 * @see #setPassengerConstraint(PassengerConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_PassengerConstraint()
	 * @model
	 * @generated
	 */
	PassengerConstraint getPassengerConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getPassengerConstraint <em>Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Constraint</em>' reference.
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	void setPassengerConstraint(PassengerConstraint value);

	/**
	 * Returns the value of the '<em><b>Regulatory Conditions</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.RegulatoryCondition}.
	 * The literals are from the enumeration {@link Accounting.RegulatoryCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory Conditions</em>' attribute list.
	 * @see Accounting.RegulatoryCondition
	 * @see Accounting.AccountingPackage#getFareElement_RegulatoryConditions()
	 * @model
	 * @generated
	 */
	EList<RegulatoryCondition> getRegulatoryConditions();

	/**
	 * Returns the value of the '<em><b>After Sales Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Sales Rule</em>' reference.
	 * @see #setAfterSalesRule(AfterSalesRule)
	 * @see Accounting.AccountingPackage#getFareElement_AfterSalesRule()
	 * @model
	 * @generated
	 */
	AfterSalesRule getAfterSalesRule();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getAfterSalesRule <em>After Sales Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Sales Rule</em>' reference.
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	void setAfterSalesRule(AfterSalesRule value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getFareElement_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Accounting Identifier</em>' containment reference.
	 * @see #setLegacyAccountingIdentifier(LegacyAccountingIdentifier)
	 * @see Accounting.AccountingPackage#getFareElement_LegacyAccountingIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	LegacyAccountingIdentifier getLegacyAccountingIdentifier();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Accounting Identifier</em>' containment reference.
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	void setLegacyAccountingIdentifier(LegacyAccountingIdentifier value);

	/**
	 * Returns the value of the '<em><b>Legacy Conversion</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.LegacyConversionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Conversion</em>' attribute.
	 * @see Accounting.LegacyConversionType
	 * @see #setLegacyConversion(LegacyConversionType)
	 * @see Accounting.AccountingPackage#getFareElement_LegacyConversion()
	 * @model
	 * @generated
	 */
	LegacyConversionType getLegacyConversion();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getLegacyConversion <em>Legacy Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Conversion</em>' attribute.
	 * @see Accounting.LegacyConversionType
	 * @see #getLegacyConversion()
	 * @generated
	 */
	void setLegacyConversion(LegacyConversionType value);

	/**
	 * Returns the value of the '<em><b>Individual Contracts</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Contracts</em>' attribute.
	 * @see #setIndividualContracts(boolean)
	 * @see Accounting.AccountingPackage#getFareElement_IndividualContracts()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndividualContracts();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#isIndividualContracts <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Contracts</em>' attribute.
	 * @see #isIndividualContracts()
	 * @generated
	 */
	void setIndividualContracts(boolean value);

	/**
	 * Returns the value of the '<em><b>Involved Tcos</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Tcos</em>' reference list.
	 * @see Accounting.AccountingPackage#getFareElement_InvolvedTcos()
	 * @model
	 * @generated
	 */
	EList<Carrier> getInvolvedTcos();

	/**
	 * Returns the value of the '<em><b>Luggage Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Constraint</em>' reference.
	 * @see #setLuggageConstraint(LuggageConstraint)
	 * @see Accounting.AccountingPackage#getFareElement_LuggageConstraint()
	 * @model
	 * @generated
	 */
	LuggageConstraint getLuggageConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareElement#getLuggageConstraint <em>Luggage Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Constraint</em>' reference.
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	void setLuggageConstraint(LuggageConstraint value);

} // FareElement
