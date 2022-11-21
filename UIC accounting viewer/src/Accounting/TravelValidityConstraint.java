/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel Validity Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.TravelValidityConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getValidDays <em>Valid Days</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getTravelDays <em>Travel Days</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getRange <em>Range</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getReturnConstraint <em>Return Constraint</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getExcludedTimeRange <em>Excluded Time Range</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getTrainValidity <em>Train Validity</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getValidityType <em>Validity Type</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getTripInterruptionConstraint <em>Trip Interruption Constraint</em>}</li>
 *   <li>{@link Accounting.TravelValidityConstraint#getTripAllocationConstraint <em>Trip Allocation Constraint</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getTravelValidityConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TRAVEL_DAYS_NOT_NULL WARNING_TRAVEL_DAYS_TOO_LONG NOT_REFERENCED TRAVEL_VALIDITY_TYPE_CONSTRAINT'"
 * @generated
 */
public interface TravelValidityConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Valid Days</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Days</em>' reference.
	 * @see #setValidDays(Calendar)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_ValidDays()
	 * @model
	 * @generated
	 */
	Calendar getValidDays();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getValidDays <em>Valid Days</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Days</em>' reference.
	 * @see #getValidDays()
	 * @generated
	 */
	void setValidDays(Calendar value);

	/**
	 * Returns the value of the '<em><b>Travel Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Days</em>' attribute.
	 * @see #setTravelDays(int)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_TravelDays()
	 * @model
	 * @generated
	 */
	int getTravelDays();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getTravelDays <em>Travel Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Days</em>' attribute.
	 * @see #getTravelDays()
	 * @generated
	 */
	void setTravelDays(int value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(ValidityRange)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_Range()
	 * @model containment="true"
	 * @generated
	 */
	ValidityRange getRange();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(ValidityRange value);

	/**
	 * Returns the value of the '<em><b>Return Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Constraint</em>' containment reference.
	 * @see #setReturnConstraint(ReturnValidityConstraint)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_ReturnConstraint()
	 * @model containment="true"
	 * @generated
	 */
	ReturnValidityConstraint getReturnConstraint();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getReturnConstraint <em>Return Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Constraint</em>' containment reference.
	 * @see #getReturnConstraint()
	 * @generated
	 */
	void setReturnConstraint(ReturnValidityConstraint value);

	/**
	 * Returns the value of the '<em><b>Excluded Time Range</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ExcludedTimeRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Time Range</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_ExcludedTimeRange()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExcludedTimeRange> getExcludedTimeRange();

	/**
	 * Returns the value of the '<em><b>Train Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Validity</em>' containment reference.
	 * @see #setTrainValidity(TrainValidity)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_TrainValidity()
	 * @model containment="true"
	 * @generated
	 */
	TrainValidity getTrainValidity();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getTrainValidity <em>Train Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Validity</em>' containment reference.
	 * @see #getTrainValidity()
	 * @generated
	 */
	void setTrainValidity(TrainValidity value);

	/**
	 * Returns the value of the '<em><b>Validity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TravelValidityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Type</em>' attribute.
	 * @see Accounting.TravelValidityType
	 * @see #setValidityType(TravelValidityType)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_ValidityType()
	 * @model
	 * @generated
	 */
	TravelValidityType getValidityType();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getValidityType <em>Validity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Type</em>' attribute.
	 * @see Accounting.TravelValidityType
	 * @see #getValidityType()
	 * @generated
	 */
	void setValidityType(TravelValidityType value);

	/**
	 * Returns the value of the '<em><b>Trip Interruption Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Interruption Constraint</em>' containment reference.
	 * @see #setTripInterruptionConstraint(TripInterruptionConstraint)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_TripInterruptionConstraint()
	 * @model containment="true"
	 * @generated
	 */
	TripInterruptionConstraint getTripInterruptionConstraint();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getTripInterruptionConstraint <em>Trip Interruption Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Interruption Constraint</em>' containment reference.
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	void setTripInterruptionConstraint(TripInterruptionConstraint value);

	/**
	 * Returns the value of the '<em><b>Trip Allocation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Allocation Constraint</em>' containment reference.
	 * @see #setTripAllocationConstraint(TripAllocationConstraint)
	 * @see Accounting.AccountingPackage#getTravelValidityConstraint_TripAllocationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	TripAllocationConstraint getTripAllocationConstraint();

	/**
	 * Sets the value of the '{@link Accounting.TravelValidityConstraint#getTripAllocationConstraint <em>Trip Allocation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Allocation Constraint</em>' containment reference.
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	void setTripAllocationConstraint(TripAllocationConstraint value);

} // TravelValidityConstraint
