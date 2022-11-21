/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Sales Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AfterSalesCondition#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link Accounting.AfterSalesCondition#isIndividualContracts <em>Individual Contracts</em>}</li>
 *   <li>{@link Accounting.AfterSalesCondition#isCarrierFee <em>Carrier Fee</em>}</li>
 *   <li>{@link Accounting.AfterSalesCondition#getFee <em>Fee</em>}</li>
 *   <li>{@link Accounting.AfterSalesCondition#getApplicationTime <em>Application Time</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAfterSalesCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FEE_MUST'"
 * @generated
 */
public interface AfterSalesCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.AfterSalesTransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see Accounting.AfterSalesTransactionType
	 * @see #setTransactionType(AfterSalesTransactionType)
	 * @see Accounting.AccountingPackage#getAfterSalesCondition_TransactionType()
	 * @model
	 * @generated
	 */
	AfterSalesTransactionType getTransactionType();

	/**
	 * Sets the value of the '{@link Accounting.AfterSalesCondition#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see Accounting.AfterSalesTransactionType
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(AfterSalesTransactionType value);

	/**
	 * Returns the value of the '<em><b>Individual Contracts</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Contracts</em>' attribute.
	 * @see #setIndividualContracts(boolean)
	 * @see Accounting.AccountingPackage#getAfterSalesCondition_IndividualContracts()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndividualContracts();

	/**
	 * Sets the value of the '{@link Accounting.AfterSalesCondition#isIndividualContracts <em>Individual Contracts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Contracts</em>' attribute.
	 * @see #isIndividualContracts()
	 * @generated
	 */
	void setIndividualContracts(boolean value);

	/**
	 * Returns the value of the '<em><b>Carrier Fee</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Fee</em>' attribute.
	 * @see #setCarrierFee(boolean)
	 * @see Accounting.AccountingPackage#getAfterSalesCondition_CarrierFee()
	 * @model default="false"
	 * @generated
	 */
	boolean isCarrierFee();

	/**
	 * Sets the value of the '{@link Accounting.AfterSalesCondition#isCarrierFee <em>Carrier Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Fee</em>' attribute.
	 * @see #isCarrierFee()
	 * @generated
	 */
	void setCarrierFee(boolean value);

	/**
	 * Returns the value of the '<em><b>Fee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fee</em>' reference.
	 * @see #setFee(Price)
	 * @see Accounting.AccountingPackage#getAfterSalesCondition_Fee()
	 * @model
	 * @generated
	 */
	Price getFee();

	/**
	 * Sets the value of the '{@link Accounting.AfterSalesCondition#getFee <em>Fee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fee</em>' reference.
	 * @see #getFee()
	 * @generated
	 */
	void setFee(Price value);

	/**
	 * Returns the value of the '<em><b>Application Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Time</em>' containment reference.
	 * @see #setApplicationTime(ApplicationTime)
	 * @see Accounting.AccountingPackage#getAfterSalesCondition_ApplicationTime()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationTime getApplicationTime();

	/**
	 * Sets the value of the '{@link Accounting.AfterSalesCondition#getApplicationTime <em>Application Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Time</em>' containment reference.
	 * @see #getApplicationTime()
	 * @generated
	 */
	void setApplicationTime(ApplicationTime value);

} // AfterSalesCondition
