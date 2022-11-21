/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewer Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AccountingViewerData#getCodeLists <em>Code Lists</em>}</li>
 *   <li>{@link Accounting.AccountingViewerData#getFareModells <em>Fare Modells</em>}</li>
 *   <li>{@link Accounting.AccountingViewerData#getWorkflowHistory <em>Workflow History</em>}</li>
 *   <li>{@link Accounting.AccountingViewerData#getAccountingFile <em>Accounting File</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAccountingViewerData()
 * @model
 * @generated
 */
public interface AccountingViewerData extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Lists</em>' containment reference.
	 * @see #setCodeLists(CodeLists)
	 * @see Accounting.AccountingPackage#getAccountingViewerData_CodeLists()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeLists getCodeLists();

	/**
	 * Sets the value of the '{@link Accounting.AccountingViewerData#getCodeLists <em>Code Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Lists</em>' containment reference.
	 * @see #getCodeLists()
	 * @generated
	 */
	void setCodeLists(CodeLists value);

	/**
	 * Returns the value of the '<em><b>Fare Modells</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.GeneralTariffModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Modells</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getAccountingViewerData_FareModells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GeneralTariffModel> getFareModells();

	/**
	 * Returns the value of the '<em><b>Workflow History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow History</em>' containment reference.
	 * @see #setWorkflowHistory(WorkflowHistory)
	 * @see Accounting.AccountingPackage#getAccountingViewerData_WorkflowHistory()
	 * @model containment="true"
	 * @generated
	 */
	WorkflowHistory getWorkflowHistory();

	/**
	 * Sets the value of the '{@link Accounting.AccountingViewerData#getWorkflowHistory <em>Workflow History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow History</em>' containment reference.
	 * @see #getWorkflowHistory()
	 * @generated
	 */
	void setWorkflowHistory(WorkflowHistory value);

	/**
	 * Returns the value of the '<em><b>Accounting File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting File</em>' containment reference.
	 * @see #setAccountingFile(AccountingFile)
	 * @see Accounting.AccountingPackage#getAccountingViewerData_AccountingFile()
	 * @model containment="true"
	 * @generated
	 */
	AccountingFile getAccountingFile();

	/**
	 * Sets the value of the '{@link Accounting.AccountingViewerData#getAccountingFile <em>Accounting File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting File</em>' containment reference.
	 * @see #getAccountingFile()
	 * @generated
	 */
	void setAccountingFile(AccountingFile value);

} // AccountingViewerData
