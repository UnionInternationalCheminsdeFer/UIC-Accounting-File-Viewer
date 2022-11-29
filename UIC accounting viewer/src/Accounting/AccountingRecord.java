/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountingRecord#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.AccountingRecord#getSalesType <em>Sales Type</em>}</li>
 *   <li>{@link Accounting.AccountingRecord#getAccountingType <em>Accounting Type</em>}</li>
 *   <li>{@link Accounting.AccountingRecord#getTransactionStandard <em>Transaction Standard</em>}</li>
 *   <li>{@link Accounting.AccountingRecord#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link Accounting.AccountingRecord#getSubject <em>Subject</em>}</li>
 *   <li>{@link Accounting.AccountingRecord#getAccountedAmounts <em>Accounted Amounts</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountingRecord()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ID_MUST MUST_TRANSACTION MUST_SUBJECT MUST_ACCOUNTED_AMOUNTS'"
 * @generated
 */
public interface AccountingRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getAccountingRecord_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.AccountingRecord#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.SalesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Type</em>' attribute.
	 * @see Accounting.SalesType
	 * @see #setSalesType(SalesType)
	 * @see Accounting.AccountingPackage#getAccountingRecord_SalesType()
	 * @model required="true"
	 * @generated
	 */
	SalesType getSalesType();

	/**
	 * Sets the value of the '{@link Accounting.AccountingRecord#getSalesType <em>Sales Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Type</em>' attribute.
	 * @see Accounting.SalesType
	 * @see #getSalesType()
	 * @generated
	 */
	void setSalesType(SalesType value);

	/**
	 * Returns the value of the '<em><b>Accounting Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.AccountingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Type</em>' attribute.
	 * @see Accounting.AccountingType
	 * @see #setAccountingType(AccountingType)
	 * @see Accounting.AccountingPackage#getAccountingRecord_AccountingType()
	 * @model required="true"
	 * @generated
	 */
	AccountingType getAccountingType();

	/**
	 * Sets the value of the '{@link Accounting.AccountingRecord#getAccountingType <em>Accounting Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Type</em>' attribute.
	 * @see Accounting.AccountingType
	 * @see #getAccountingType()
	 * @generated
	 */
	void setAccountingType(AccountingType value);

	/**
	 * Returns the value of the '<em><b>Transaction Standard</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TransactionStandard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Standard</em>' attribute.
	 * @see Accounting.TransactionStandard
	 * @see #setTransactionStandard(TransactionStandard)
	 * @see Accounting.AccountingPackage#getAccountingRecord_TransactionStandard()
	 * @model
	 * @generated
	 */
	TransactionStandard getTransactionStandard();

	/**
	 * Sets the value of the '{@link Accounting.AccountingRecord#getTransactionStandard <em>Transaction Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Standard</em>' attribute.
	 * @see Accounting.TransactionStandard
	 * @see #getTransactionStandard()
	 * @generated
	 */
	void setTransactionStandard(TransactionStandard value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference.
	 * @see #setTransaction(Transaction)
	 * @see Accounting.AccountingPackage#getAccountingRecord_Transaction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link Accounting.AccountingRecord#getTransaction <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' containment reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(AccountingSubject)
	 * @see Accounting.AccountingPackage#getAccountingRecord_Subject()
	 * @model containment="true"
	 * @generated
	 */
	AccountingSubject getSubject();

	/**
	 * Sets the value of the '{@link Accounting.AccountingRecord#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(AccountingSubject value);

	/**
	 * Returns the value of the '<em><b>Accounted Amounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounted Amounts</em>' containment reference.
	 * @see #setAccountedAmounts(AccountedAmounts)
	 * @see Accounting.AccountingPackage#getAccountingRecord_AccountedAmounts()
	 * @model containment="true"
	 * @generated
	 */
	AccountedAmounts getAccountedAmounts();

	/**
	 * Sets the value of the '{@link Accounting.AccountingRecord#getAccountedAmounts <em>Accounted Amounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounted Amounts</em>' containment reference.
	 * @see #getAccountedAmounts()
	 * @generated
	 */
	void setAccountedAmounts(AccountedAmounts value);

} // AccountingRecord
