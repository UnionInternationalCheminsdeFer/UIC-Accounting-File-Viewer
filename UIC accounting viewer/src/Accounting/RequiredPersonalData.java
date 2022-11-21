/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Personal Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.RequiredPersonalData#isTicketHolderOnly <em>Ticket Holder Only</em>}</li>
 *   <li>{@link Accounting.RequiredPersonalData#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link Accounting.RequiredPersonalData#getTransfer <em>Transfer</em>}</li>
 *   <li>{@link Accounting.RequiredPersonalData#getFulfillmentType <em>Fulfillment Type</em>}</li>
 *   <li>{@link Accounting.RequiredPersonalData#getCrossBorder <em>Cross Border</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getRequiredPersonalData()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_ITEM ADD_LEAST_ONE_TRANSFER'"
 * @generated
 */
public interface RequiredPersonalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Ticket Holder Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket Holder Only</em>' attribute.
	 * @see #setTicketHolderOnly(boolean)
	 * @see Accounting.AccountingPackage#getRequiredPersonalData_TicketHolderOnly()
	 * @model default="true"
	 * @generated
	 */
	boolean isTicketHolderOnly();

	/**
	 * Sets the value of the '{@link Accounting.RequiredPersonalData#isTicketHolderOnly <em>Ticket Holder Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket Holder Only</em>' attribute.
	 * @see #isTicketHolderOnly()
	 * @generated
	 */
	void setTicketHolderOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Item</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.PersonalDataItemsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Item</em>' attribute.
	 * @see Accounting.PersonalDataItemsType
	 * @see #setDataItem(PersonalDataItemsType)
	 * @see Accounting.AccountingPackage#getRequiredPersonalData_DataItem()
	 * @model
	 * @generated
	 */
	PersonalDataItemsType getDataItem();

	/**
	 * Sets the value of the '{@link Accounting.RequiredPersonalData#getDataItem <em>Data Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Item</em>' attribute.
	 * @see Accounting.PersonalDataItemsType
	 * @see #getDataItem()
	 * @generated
	 */
	void setDataItem(PersonalDataItemsType value);

	/**
	 * Returns the value of the '<em><b>Transfer</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.PersonalDataTransferType}.
	 * The literals are from the enumeration {@link Accounting.PersonalDataTransferType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer</em>' attribute list.
	 * @see Accounting.PersonalDataTransferType
	 * @see Accounting.AccountingPackage#getRequiredPersonalData_Transfer()
	 * @model
	 * @generated
	 */
	EList<PersonalDataTransferType> getTransfer();

	/**
	 * Returns the value of the '<em><b>Fulfillment Type</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.FulfillmentType}.
	 * The literals are from the enumeration {@link Accounting.FulfillmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Type</em>' attribute list.
	 * @see Accounting.FulfillmentType
	 * @see Accounting.AccountingPackage#getRequiredPersonalData_FulfillmentType()
	 * @model
	 * @generated
	 */
	EList<FulfillmentType> getFulfillmentType();

	/**
	 * Returns the value of the '<em><b>Cross Border</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.CrossBorderCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Border</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getRequiredPersonalData_CrossBorder()
	 * @model containment="true"
	 * @generated
	 */
	EList<CrossBorderCondition> getCrossBorder();

} // RequiredPersonalData
