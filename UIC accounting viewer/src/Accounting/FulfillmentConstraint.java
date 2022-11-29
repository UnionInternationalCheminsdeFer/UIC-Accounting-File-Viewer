/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillment Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FulfillmentConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#getAcceptedFulfilmentTypes <em>Accepted Fulfilment Types</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#getRequiredControlDataExchange <em>Required Control Data Exchange</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#isSeparateFulFillmentRequired <em>Separate Ful Fillment Required</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#getRequiredBarcodes <em>Required Barcodes</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#getAcceptedBarcodeTypes <em>Accepted Barcode Types</em>}</li>
 *   <li>{@link Accounting.FulfillmentConstraint#getRequiredBarcodeTypes <em>Required Barcode Types</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFulfillmentConstraint()
 * @model
 * @generated
 */
public interface FulfillmentConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.FulfillmentConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Accepted Fulfilment Types</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.FulfillmentType}.
	 * The literals are from the enumeration {@link Accounting.FulfillmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Fulfilment Types</em>' attribute list.
	 * @see Accounting.FulfillmentType
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_AcceptedFulfilmentTypes()
	 * @model
	 * @generated
	 */
	EList<FulfillmentType> getAcceptedFulfilmentTypes();

	/**
	 * Returns the value of the '<em><b>Required Control Data Exchange</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.ControlDataExchangeTypes}.
	 * The literals are from the enumeration {@link Accounting.ControlDataExchangeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Control Data Exchange</em>' attribute list.
	 * @see Accounting.ControlDataExchangeTypes
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_RequiredControlDataExchange()
	 * @model
	 * @generated
	 */
	EList<ControlDataExchangeTypes> getRequiredControlDataExchange();

	/**
	 * Returns the value of the '<em><b>Individual Ticketing Permitted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Ticketing Permitted</em>' attribute.
	 * @see #setIndividualTicketingPermitted(boolean)
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_IndividualTicketingPermitted()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndividualTicketingPermitted();

	/**
	 * Sets the value of the '{@link Accounting.FulfillmentConstraint#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Ticketing Permitted</em>' attribute.
	 * @see #isIndividualTicketingPermitted()
	 * @generated
	 */
	void setIndividualTicketingPermitted(boolean value);

	/**
	 * Returns the value of the '<em><b>Separate Ful Fillment Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separate Ful Fillment Required</em>' attribute.
	 * @see #setSeparateFulFillmentRequired(boolean)
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_SeparateFulFillmentRequired()
	 * @model
	 * @generated
	 */
	boolean isSeparateFulFillmentRequired();

	/**
	 * Sets the value of the '{@link Accounting.FulfillmentConstraint#isSeparateFulFillmentRequired <em>Separate Ful Fillment Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separate Ful Fillment Required</em>' attribute.
	 * @see #isSeparateFulFillmentRequired()
	 * @generated
	 */
	void setSeparateFulFillmentRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Accepted Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Barcodes</em>' containment reference.
	 * @see #setAcceptedBarcodes(AcceptedBarcodes)
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_AcceptedBarcodes()
	 * @model containment="true"
	 * @generated
	 */
	AcceptedBarcodes getAcceptedBarcodes();

	/**
	 * Sets the value of the '{@link Accounting.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Barcodes</em>' containment reference.
	 * @see #getAcceptedBarcodes()
	 * @generated
	 */
	void setAcceptedBarcodes(AcceptedBarcodes value);

	/**
	 * Returns the value of the '<em><b>Required Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Barcodes</em>' containment reference.
	 * @see #setRequiredBarcodes(RequiredBarcodes)
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_RequiredBarcodes()
	 * @model containment="true"
	 * @generated
	 */
	RequiredBarcodes getRequiredBarcodes();

	/**
	 * Sets the value of the '{@link Accounting.FulfillmentConstraint#getRequiredBarcodes <em>Required Barcodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Barcodes</em>' containment reference.
	 * @see #getRequiredBarcodes()
	 * @generated
	 */
	void setRequiredBarcodes(RequiredBarcodes value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Accounting.FulfillmentConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Accepted Barcode Types</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.BarcodeTypes}.
	 * The literals are from the enumeration {@link Accounting.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Barcode Types</em>' attribute list.
	 * @see Accounting.BarcodeTypes
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_AcceptedBarcodeTypes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getAcceptedBarcodeTypes();

	/**
	 * Returns the value of the '<em><b>Required Barcode Types</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.BarcodeTypes}.
	 * The literals are from the enumeration {@link Accounting.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Barcode Types</em>' attribute list.
	 * @see Accounting.BarcodeTypes
	 * @see Accounting.AccountingPackage#getFulfillmentConstraint_RequiredBarcodeTypes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getRequiredBarcodeTypes();

} // FulfillmentConstraint
