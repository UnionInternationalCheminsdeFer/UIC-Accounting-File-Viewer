/**
 */
package Accounting.impl;

import Accounting.AccountingFile;
import Accounting.AccountingPackage;
import Accounting.AccountingViewerData;
import Accounting.CodeLists;
import Accounting.GeneralTariffModel;
import Accounting.WorkflowHistory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewer Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.AccountingViewerDataImpl#getCodeLists <em>Code Lists</em>}</li>
 *   <li>{@link Accounting.impl.AccountingViewerDataImpl#getAccountingFile <em>Accounting File</em>}</li>
 *   <li>{@link Accounting.impl.AccountingViewerDataImpl#getFareModells <em>Fare Modells</em>}</li>
 *   <li>{@link Accounting.impl.AccountingViewerDataImpl#getWorkflowHistory <em>Workflow History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingViewerDataImpl extends MinimalEObjectImpl.Container implements AccountingViewerData {
	/**
	 * The cached value of the '{@link #getCodeLists() <em>Code Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeLists()
	 * @generated
	 * @ordered
	 */
	protected CodeLists codeLists;

	/**
	 * The cached value of the '{@link #getAccountingFile() <em>Accounting File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingFile()
	 * @generated
	 * @ordered
	 */
	protected AccountingFile accountingFile;

	/**
	 * The cached value of the '{@link #getFareModells() <em>Fare Modells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFareModells()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralTariffModel> fareModells;

	/**
	 * The cached value of the '{@link #getWorkflowHistory() <em>Workflow History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowHistory()
	 * @generated
	 * @ordered
	 */
	protected WorkflowHistory workflowHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingViewerDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNTING_VIEWER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLists getCodeLists() {
		return codeLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeLists(CodeLists newCodeLists, NotificationChain msgs) {
		CodeLists oldCodeLists = codeLists;
		codeLists = newCodeLists;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS, oldCodeLists, newCodeLists);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeLists(CodeLists newCodeLists) {
		if (newCodeLists != codeLists) {
			NotificationChain msgs = null;
			if (codeLists != null)
				msgs = ((InternalEObject)codeLists).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS, null, msgs);
			if (newCodeLists != null)
				msgs = ((InternalEObject)newCodeLists).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS, null, msgs);
			msgs = basicSetCodeLists(newCodeLists, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS, newCodeLists, newCodeLists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralTariffModel> getFareModells() {
		if (fareModells == null) {
			fareModells = new EObjectContainmentEList<GeneralTariffModel>(GeneralTariffModel.class, this, AccountingPackage.ACCOUNTING_VIEWER_DATA__FARE_MODELLS);
		}
		return fareModells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowHistory getWorkflowHistory() {
		return workflowHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflowHistory(WorkflowHistory newWorkflowHistory, NotificationChain msgs) {
		WorkflowHistory oldWorkflowHistory = workflowHistory;
		workflowHistory = newWorkflowHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY, oldWorkflowHistory, newWorkflowHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflowHistory(WorkflowHistory newWorkflowHistory) {
		if (newWorkflowHistory != workflowHistory) {
			NotificationChain msgs = null;
			if (workflowHistory != null)
				msgs = ((InternalEObject)workflowHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY, null, msgs);
			if (newWorkflowHistory != null)
				msgs = ((InternalEObject)newWorkflowHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY, null, msgs);
			msgs = basicSetWorkflowHistory(newWorkflowHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY, newWorkflowHistory, newWorkflowHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFile getAccountingFile() {
		return accountingFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountingFile(AccountingFile newAccountingFile, NotificationChain msgs) {
		AccountingFile oldAccountingFile = accountingFile;
		accountingFile = newAccountingFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE, oldAccountingFile, newAccountingFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountingFile(AccountingFile newAccountingFile) {
		if (newAccountingFile != accountingFile) {
			NotificationChain msgs = null;
			if (accountingFile != null)
				msgs = ((InternalEObject)accountingFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE, null, msgs);
			if (newAccountingFile != null)
				msgs = ((InternalEObject)newAccountingFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE, null, msgs);
			msgs = basicSetAccountingFile(newAccountingFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE, newAccountingFile, newAccountingFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS:
				return basicSetCodeLists(null, msgs);
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE:
				return basicSetAccountingFile(null, msgs);
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__FARE_MODELLS:
				return ((InternalEList<?>)getFareModells()).basicRemove(otherEnd, msgs);
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY:
				return basicSetWorkflowHistory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS:
				return getCodeLists();
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE:
				return getAccountingFile();
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__FARE_MODELLS:
				return getFareModells();
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY:
				return getWorkflowHistory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS:
				setCodeLists((CodeLists)newValue);
				return;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE:
				setAccountingFile((AccountingFile)newValue);
				return;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__FARE_MODELLS:
				getFareModells().clear();
				getFareModells().addAll((Collection<? extends GeneralTariffModel>)newValue);
				return;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY:
				setWorkflowHistory((WorkflowHistory)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS:
				setCodeLists((CodeLists)null);
				return;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE:
				setAccountingFile((AccountingFile)null);
				return;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__FARE_MODELLS:
				getFareModells().clear();
				return;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY:
				setWorkflowHistory((WorkflowHistory)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__CODE_LISTS:
				return codeLists != null;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE:
				return accountingFile != null;
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__FARE_MODELLS:
				return fareModells != null && !fareModells.isEmpty();
			case AccountingPackage.ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY:
				return workflowHistory != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountingViewerDataImpl
