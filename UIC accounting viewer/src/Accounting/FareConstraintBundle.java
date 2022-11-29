/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Constraint Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FareConstraintBundle#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getDefaultFareType <em>Default Fare Type</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getTotalPassengerConstraint <em>Total Passenger Constraint</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getDefaultRegulatoryConditions <em>Default Regulatory Conditions</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getConvertedBundles <em>Converted Bundles</em>}</li>
 *   <li>{@link Accounting.FareConstraintBundle#getLuggageConstraint <em>Luggage Constraint</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFareConstraintBundle()
 * @model
 * @generated
 */
public interface FareConstraintBundle extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Default Fare Type</b></em>' attribute.
	 * The default value is <code>"NRT"</code>.
	 * The literals are from the enumeration {@link Accounting.FareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Fare Type</em>' attribute.
	 * @see Accounting.FareType
	 * @see #setDefaultFareType(FareType)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_DefaultFareType()
	 * @model default="NRT" unique="false"
	 * @generated
	 */
	FareType getDefaultFareType();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getDefaultFareType <em>Default Fare Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Fare Type</em>' attribute.
	 * @see Accounting.FareType
	 * @see #getDefaultFareType()
	 * @generated
	 */
	void setDefaultFareType(FareType value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraint</em>' reference.
	 * @see #setCarrierConstraint(CarrierConstraint)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraint</em>' reference.
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	void setCarrierConstraint(CarrierConstraint value);

	/**
	 * Returns the value of the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Availability</em>' reference.
	 * @see #setSalesAvailability(SalesAvailabilityConstraint)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_SalesAvailability()
	 * @model
	 * @generated
	 */
	SalesAvailabilityConstraint getSalesAvailability();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getSalesAvailability <em>Sales Availability</em>}' reference.
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
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_TravelValidity()
	 * @model
	 * @generated
	 */
	TravelValidityConstraint getTravelValidity();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getTravelValidity <em>Travel Validity</em>}' reference.
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
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_CombinationConstraint()
	 * @model
	 * @generated
	 */
	CombinationConstraint getCombinationConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getCombinationConstraint <em>Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination Constraint</em>' reference.
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	void setCombinationConstraint(CombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #setPersonalDataConstraint(PersonalDataConstraint)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_PersonalDataConstraint()
	 * @model
	 * @generated
	 */
	PersonalDataConstraint getPersonalDataConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getPersonalDataConstraint <em>Personal Data Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	void setPersonalDataConstraint(PersonalDataConstraint value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #setFulfillmentConstraint(FulfillmentConstraint)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_FulfillmentConstraint()
	 * @model
	 * @generated
	 */
	FulfillmentConstraint getFulfillmentConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getFulfillmentConstraint <em>Fulfillment Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	void setFulfillmentConstraint(FulfillmentConstraint value);

	/**
	 * Returns the value of the '<em><b>Total Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Passenger Constraint</em>' reference.
	 * @see #setTotalPassengerConstraint(TotalPassengerCombinationConstraint)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_TotalPassengerConstraint()
	 * @model
	 * @generated
	 */
	TotalPassengerCombinationConstraint getTotalPassengerConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getTotalPassengerConstraint <em>Total Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Passenger Constraint</em>' reference.
	 * @see #getTotalPassengerConstraint()
	 * @generated
	 */
	void setTotalPassengerConstraint(TotalPassengerCombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Default Regulatory Conditions</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.RegulatoryCondition}.
	 * The literals are from the enumeration {@link Accounting.RegulatoryCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Regulatory Conditions</em>' attribute list.
	 * @see Accounting.RegulatoryCondition
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_DefaultRegulatoryConditions()
	 * @model
	 * @generated
	 */
	EList<RegulatoryCondition> getDefaultRegulatoryConditions();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Converted Bundles</b></em>' reference list.
	 * The list contents are of type {@link Accounting.FareConstraintBundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converted Bundles</em>' reference list.
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_ConvertedBundles()
	 * @model
	 * @generated
	 */
	EList<FareConstraintBundle> getConvertedBundles();

	/**
	 * Returns the value of the '<em><b>Luggage Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Constraint</em>' reference.
	 * @see #setLuggageConstraint(LuggageConstraint)
	 * @see Accounting.AccountingPackage#getFareConstraintBundle_LuggageConstraint()
	 * @model
	 * @generated
	 */
	LuggageConstraint getLuggageConstraint();

	/**
	 * Sets the value of the '{@link Accounting.FareConstraintBundle#getLuggageConstraint <em>Luggage Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Constraint</em>' reference.
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	void setLuggageConstraint(LuggageConstraint value);

} // FareConstraintBundle
