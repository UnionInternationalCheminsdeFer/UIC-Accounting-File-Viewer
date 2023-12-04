/**
 */
package Accounting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Accounting.AccountingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore conversionDelegates='http:///org/eclipse/emf/ecore/util/DateConversionDelegate'"
 * @generated
 */
public interface AccountingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Accounting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Accounting%20data%20converter/model/acc.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ACC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountingPackage eINSTANCE = Accounting.impl.AccountingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountingViewerDataImpl <em>Viewer Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountingViewerDataImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountingViewerData()
	 * @generated
	 */
	int ACCOUNTING_VIEWER_DATA = 0;

	/**
	 * The feature id for the '<em><b>Code Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_VIEWER_DATA__CODE_LISTS = 0;

	/**
	 * The feature id for the '<em><b>Accounting File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE = 1;

	/**
	 * The feature id for the '<em><b>Fare Modells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_VIEWER_DATA__FARE_MODELLS = 2;

	/**
	 * The feature id for the '<em><b>Workflow History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY = 3;

	/**
	 * The number of structural features of the '<em>Viewer Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_VIEWER_DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Viewer Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_VIEWER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountingFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountingFileImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountingFile()
	 * @generated
	 */
	int ACCOUNTING_FILE = 1;

	/**
	 * The feature id for the '<em><b>Accounting Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_FILE__ACCOUNTING_DELIVERY = 0;

	/**
	 * The feature id for the '<em><b>Accounting Records</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_FILE__ACCOUNTING_RECORDS = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountingRecordsImpl <em>Records</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountingRecordsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountingRecords()
	 * @generated
	 */
	int ACCOUNTING_RECORDS = 2;

	/**
	 * The feature id for the '<em><b>Accounting Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORDS__ACCOUNTING_RECORDS = 0;

	/**
	 * The number of structural features of the '<em>Records</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Records</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountingDeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountingDeliveryImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountingDelivery()
	 * @generated
	 */
	int ACCOUNTING_DELIVERY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY__ID = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY__CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Invoicing Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY__INVOICING_PARTY = 2;

	/**
	 * The feature id for the '<em><b>Invoice Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY__INVOICE_RECIPIENT = 3;

	/**
	 * The feature id for the '<em><b>Start Statement Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD = 4;

	/**
	 * The feature id for the '<em><b>End Statement Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY__PAYMENT_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_DELIVERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountingRecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountingRecordImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountingRecord()
	 * @generated
	 */
	int ACCOUNTING_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD__ID = 0;

	/**
	 * The feature id for the '<em><b>Sales Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD__SALES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Accounting Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD__ACCOUNTING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Transaction Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD__TRANSACTION_STANDARD = 3;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD__TRANSACTION = 4;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD__SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Accounted Amounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS = 6;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountedAmountsImpl <em>Accounted Amounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountedAmountsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountedAmounts()
	 * @generated
	 */
	int ACCOUNTED_AMOUNTS = 5;

	/**
	 * The feature id for the '<em><b>Accounted Amounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS = 0;

	/**
	 * The number of structural features of the '<em>Accounted Amounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accounted Amounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountingSubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountingSubjectImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountingSubject()
	 * @generated
	 */
	int ACCOUNTING_SUBJECT = 6;

	/**
	 * The feature id for the '<em><b>Fare Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__FARE_ID = 0;

	/**
	 * The feature id for the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Sales Office Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__SALES_OFFICE_ID = 2;

	/**
	 * The feature id for the '<em><b>Sales Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__SALES_CHANNEL = 3;

	/**
	 * The feature id for the '<em><b>Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__TRAIN = 4;

	/**
	 * The feature id for the '<em><b>Travel Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__TRAVEL_DATE = 5;

	/**
	 * The feature id for the '<em><b>Country Of Sale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__COUNTRY_OF_SALE = 6;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__CARRIERS = 7;

	/**
	 * The feature id for the '<em><b>Retailer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__RETAILER = 8;

	/**
	 * The feature id for the '<em><b>Bilateral Tariff Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Legacy Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION = 10;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LegacyDescriptionImpl <em>Legacy Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LegacyDescriptionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLegacyDescription()
	 * @generated
	 */
	int LEGACY_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION__PASSENGER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION__CLASS_CODE = 1;

	/**
	 * The feature id for the '<em><b>Series</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION__SERIES = 2;

	/**
	 * The feature id for the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION__TARIFF = 3;

	/**
	 * The feature id for the '<em><b>Dialog Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION__DIALOG_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>Legacy Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Legacy Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TransactionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 8;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CONTRACT = 1;

	/**
	 * The feature id for the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__BOOKING_ID = 2;

	/**
	 * The feature id for the '<em><b>Booking Part Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__BOOKING_PART_IDS = 3;

	/**
	 * The feature id for the '<em><b>Accounting Reference Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ACCOUNTING_REFERENCE_IDS = 4;

	/**
	 * The feature id for the '<em><b>Ticket Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TICKET_IDS = 5;

	/**
	 * The feature id for the '<em><b>Ticket Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TICKET_ID = 6;

	/**
	 * The feature id for the '<em><b>Fulfillment Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__FULFILLMENT_IDS = 7;

	/**
	 * The feature id for the '<em><b>Exchangebooking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__EXCHANGEBOOKING_ID = 8;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTION_TIME = 9;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AccountedAmountImpl <em>Accounted Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AccountedAmountImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAccountedAmount()
	 * @generated
	 */
	int ACCOUNTED_AMOUNT = 9;

	/**
	 * The feature id for the '<em><b>Settlement Value Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT__SETTLEMENT_VALUE_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Gross Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT__GROSS_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT__FEE = 2;

	/**
	 * The feature id for the '<em><b>Commission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT__COMMISSION = 3;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT__CURRENCY = 4;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT__AMOUNT = 5;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT__RATE = 6;

	/**
	 * The number of structural features of the '<em>Accounted Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Accounted Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTED_AMOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CodeListsImpl <em>Code Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CodeListsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCodeLists()
	 * @generated
	 */
	int CODE_LISTS = 10;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CARRIERS = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__COUNTRIES = 2;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__LANGUAGES = 3;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CURRENCIES = 4;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__SERVICE_BRANDS = 5;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__NUTS_CODES = 6;

	/**
	 * The number of structural features of the '<em>Code Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Code Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.WorkflowHistoryImpl <em>Workflow History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.WorkflowHistoryImpl
	 * @see Accounting.impl.AccountingPackageImpl#getWorkflowHistory()
	 * @generated
	 */
	int WORKFLOW_HISTORY = 11;

	/**
	 * The feature id for the '<em><b>Workflow Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_HISTORY__WORKFLOW_STEPS = 0;

	/**
	 * The number of structural features of the '<em>Workflow History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_HISTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workflow History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.WorkflowStepImpl <em>Workflow Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.WorkflowStepImpl
	 * @see Accounting.impl.AccountingPackageImpl#getWorkflowStep()
	 * @generated
	 */
	int WORKFLOW_STEP = 12;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP__TIME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Workflow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Workflow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.NUTSCodesImpl <em>NUTS Codes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.NUTSCodesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getNUTSCodes()
	 * @generated
	 */
	int NUTS_CODES = 13;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES__NUTS_CODES = 0;

	/**
	 * The number of structural features of the '<em>NUTS Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>NUTS Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.NutsCodeImpl <em>Nuts Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.NutsCodeImpl
	 * @see Accounting.impl.AccountingPackageImpl#getNutsCode()
	 * @generated
	 */
	int NUTS_CODE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Nuts Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nuts Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceBrandsImpl <em>Service Brands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceBrandsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceBrands()
	 * @generated
	 */
	int SERVICE_BRANDS = 15;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS__SERVICE_BRANDS = 0;

	/**
	 * The number of structural features of the '<em>Service Brands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Brands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceBrandImpl <em>Service Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceBrandImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceBrand()
	 * @generated
	 */
	int SERVICE_BRAND = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__NAME = 1;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__ABBREVIATION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Transport Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__TRANSPORT_MODE = 4;

	/**
	 * The feature id for the '<em><b>Local Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__LOCAL_LANGUAGE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CountriesImpl <em>Countries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CountriesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCountries()
	 * @generated
	 */
	int COUNTRIES = 17;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__COUNTRIES = 0;

	/**
	 * The number of structural features of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CountryImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 18;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>IS Ocode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__IS_OCODE = 2;

	/**
	 * The feature id for the '<em><b>Default Character Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__DEFAULT_CHARACTER_SET = 3;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LanguagesImpl <em>Languages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LanguagesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 19;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES__LANGUAGES = 0;

	/**
	 * The number of structural features of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LanguageImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CurrenciesImpl <em>Currencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CurrenciesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCurrencies()
	 * @generated
	 */
	int CURRENCIES = 21;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES__CURRENCIES = 0;

	/**
	 * The number of structural features of the '<em>Currencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Currencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CurrencyImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__ISO_CODE = 1;

	/**
	 * The number of structural features of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.StationsImpl <em>Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.StationsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getStations()
	 * @generated
	 */
	int STATIONS = 23;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.StationImpl
	 * @see Accounting.impl.AccountingPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LONGITUDE = 3;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LATITUDE = 4;

	/**
	 * The feature id for the '<em><b>Timetable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__TIMETABLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Border Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__BORDER_STATION = 6;

	/**
	 * The feature id for the '<em><b>Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME_CASE_UTF8 = 7;

	/**
	 * The feature id for the '<em><b>Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME_CASE_ASCII = 8;

	/**
	 * The feature id for the '<em><b>Short Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__SHORT_NAME_CASE_ASCII = 9;

	/**
	 * The feature id for the '<em><b>Short Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__SHORT_NAME_CASE_UTF8 = 10;

	/**
	 * The feature id for the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LEGACY_BORDER_POINT_CODE = 11;

	/**
	 * The feature id for the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__STATION_CODE = 12;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CarrierImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 25;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__SHORT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CarriersImpl <em>Carriers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CarriersImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCarriers()
	 * @generated
	 */
	int CARRIERS = 26;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS__CARRIERS = 0;

	/**
	 * The number of structural features of the '<em>Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.StationSetImpl <em>Station Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.StationSetImpl
	 * @see Accounting.impl.AccountingPackageImpl#getStationSet()
	 * @generated
	 */
	int STATION_SET = 29;

	/**
	 * The meta object id for the '{@link Accounting.impl.GeneralTariffModelImpl <em>General Tariff Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.GeneralTariffModelImpl
	 * @see Accounting.impl.AccountingPackageImpl#getGeneralTariffModel()
	 * @generated
	 */
	int GENERAL_TARIFF_MODEL = 27;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL__DELIVERY = 0;

	/**
	 * The feature id for the '<em><b>Fare Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL__FARE_STRUCTURE = 1;

	/**
	 * The number of structural features of the '<em>General Tariff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>General Tariff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.DeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.DeliveryImpl
	 * @see Accounting.impl.AccountingPackageImpl#getDelivery()
	 * @generated
	 */
	int DELIVERY = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ID = 0;

	/**
	 * The feature id for the '<em><b>Previous Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__PREVIOUS_DELIVERY_ID = 1;

	/**
	 * The feature id for the '<em><b>Replaced Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__REPLACED_DELIVERY_ID = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__OPTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__SCHEMA_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Accepted Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ACCEPTED_SCHEMA_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__USAGE = 7;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Station Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AfterSalesRulesImpl <em>After Sales Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AfterSalesRulesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesRules()
	 * @generated
	 */
	int AFTER_SALES_RULES = 30;

	/**
	 * The feature id for the '<em><b>After Sales Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES__AFTER_SALES_RULES = 0;

	/**
	 * The number of structural features of the '<em>After Sales Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>After Sales Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AfterSalesRuleImpl <em>After Sales Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AfterSalesRuleImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesRule()
	 * @generated
	 */
	int AFTER_SALES_RULE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>After Sales Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>After Sales Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AfterSalesConditionImpl <em>After Sales Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AfterSalesConditionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesCondition()
	 * @generated
	 */
	int AFTER_SALES_CONDITION = 32;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__TRANSACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Individual Contracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS = 1;

	/**
	 * The feature id for the '<em><b>Carrier Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__CARRIER_FEE = 2;

	/**
	 * The feature id for the '<em><b>Fee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__FEE = 3;

	/**
	 * The feature id for the '<em><b>Application Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__APPLICATION_TIME = 4;

	/**
	 * The number of structural features of the '<em>After Sales Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>After Sales Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RelativeTimeImpl <em>Relative Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RelativeTimeImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRelativeTime()
	 * @generated
	 */
	int RELATIVE_TIME = 106;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Relative Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relative Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ApplicationTimeImpl <em>Application Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ApplicationTimeImpl
	 * @see Accounting.impl.AccountingPackageImpl#getApplicationTime()
	 * @generated
	 */
	int APPLICATION_TIME = 33;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>Application Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareStructureImpl <em>Fare Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareStructureImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareStructure()
	 * @generated
	 */
	int FARE_STRUCTURE = 34;

	/**
	 * The feature id for the '<em><b>Service Class Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Service Level Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Station Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__STATION_NAMES = 2;

	/**
	 * The feature id for the '<em><b>Fare Station Set Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CALENDARS = 4;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TEXTS = 5;

	/**
	 * The feature id for the '<em><b>Reduction Cards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CARDS = 6;

	/**
	 * The feature id for the '<em><b>Fare Constraint Bundles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES = 7;

	/**
	 * The feature id for the '<em><b>Fare Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_ELEMENTS = 8;

	/**
	 * The feature id for the '<em><b>Combination Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__COMBINATION_CONSTRAINTS = 9;

	/**
	 * The feature id for the '<em><b>Sales Availability Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = 10;

	/**
	 * The feature id for the '<em><b>Travel Validity Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = 11;

	/**
	 * The feature id for the '<em><b>Regional Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REGIONAL_CONSTRAINTS = 12;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CONNECTION_POINTS = 13;

	/**
	 * The feature id for the '<em><b>Carrier Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CARRIER_CONSTRAINTS = 14;

	/**
	 * The feature id for the '<em><b>Service Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CONSTRAINTS = 15;

	/**
	 * The feature id for the '<em><b>Passenger Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PASSENGER_CONSTRAINTS = 16;

	/**
	 * The feature id for the '<em><b>Total Passenger Combination Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = 17;

	/**
	 * The feature id for the '<em><b>Reduction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CONSTRAINTS = 18;

	/**
	 * The feature id for the '<em><b>Personal Data Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = 19;

	/**
	 * The feature id for the '<em><b>After Sales Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__AFTER_SALES_RULES = 20;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PRICES = 21;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS = 22;

	/**
	 * The feature id for the '<em><b>Reservation Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__RESERVATION_PARAMETERS = 23;

	/**
	 * The feature id for the '<em><b>Supported Online Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = 24;

	/**
	 * The feature id for the '<em><b>Fare Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = 25;

	/**
	 * The feature id for the '<em><b>Zone Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__ZONE_DEFINITIONS = 26;

	/**
	 * The feature id for the '<em><b>Luggage Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__LUGGAGE_CONSTRAINTS = 27;

	/**
	 * The number of structural features of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ConnectionPointsImpl <em>Connection Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ConnectionPointsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getConnectionPoints()
	 * @generated
	 */
	int CONNECTION_POINTS = 35;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS__CONNECTION_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Connection Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connection Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ConnectionPointImpl
	 * @see Accounting.impl.AccountingPackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__LEGACY_BORDER_POINT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Connected Station Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__CONNECTED_STATION_SETS = 4;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DATA_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME_UTF8 = 6;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareResourceLocationsImpl <em>Fare Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareResourceLocationsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareResourceLocations()
	 * @generated
	 */
	int FARE_RESOURCE_LOCATIONS = 37;

	/**
	 * The feature id for the '<em><b>Train Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Station Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Carrier Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = 2;

	/**
	 * The number of structural features of the '<em>Fare Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fare Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TrainResourceLocationsImpl <em>Train Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TrainResourceLocationsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTrainResourceLocations()
	 * @generated
	 */
	int TRAIN_RESOURCE_LOCATIONS = 38;

	/**
	 * The feature id for the '<em><b>Train Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Train Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Train Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.StationResourceLocationsImpl <em>Station Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.StationResourceLocationsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getStationResourceLocations()
	 * @generated
	 */
	int STATION_RESOURCE_LOCATIONS = 39;

	/**
	 * The feature id for the '<em><b>Station Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Station Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CarrierResourceLocationsImpl <em>Carrier Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CarrierResourceLocationsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCarrierResourceLocations()
	 * @generated
	 */
	int CARRIER_RESOURCE_LOCATIONS = 40;

	/**
	 * The feature id for the '<em><b>Carrier Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TrainResourceLocationImpl <em>Train Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TrainResourceLocationImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTrainResourceLocation()
	 * @generated
	 */
	int TRAIN_RESOURCE_LOCATION = 41;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Train Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__TRAIN_ID = 2;

	/**
	 * The number of structural features of the '<em>Train Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.StationResourceLocationImpl <em>Station Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.StationResourceLocationImpl
	 * @see Accounting.impl.AccountingPackageImpl#getStationResourceLocation()
	 * @generated
	 */
	int STATION_RESOURCE_LOCATION = 42;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__ONLINE_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__CONNECTION_POINTS = 2;

	/**
	 * The number of structural features of the '<em>Station Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Station Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CarrierResourceLocationImpl <em>Carrier Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CarrierResourceLocationImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCarrierResourceLocation()
	 * @generated
	 */
	int CARRIER_RESOURCE_LOCATION = 43;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Service Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__SERVICE_BRAND = 1;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Carrier Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.OnlineResourceImpl <em>Online Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.OnlineResourceImpl
	 * @see Accounting.impl.AccountingPackageImpl#getOnlineResource()
	 * @generated
	 */
	int ONLINE_RESOURCE = 44;

	/**
	 * The feature id for the '<em><b>Offer Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__OFFER_REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__INTERFACE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>Online Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Online Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FulfillmentConstraintsImpl <em>Fulfillment Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FulfillmentConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFulfillmentConstraints()
	 * @generated
	 */
	int FULFILLMENT_CONSTRAINTS = 45;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Fulfillment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fulfillment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FulfillmentConstraintImpl <em>Fulfillment Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FulfillmentConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFulfillmentConstraint()
	 * @generated
	 */
	int FULFILLMENT_CONSTRAINT = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Accepted Fulfilment Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Required Control Data Exchange</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE = 2;

	/**
	 * The feature id for the '<em><b>Individual Ticketing Permitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED = 3;

	/**
	 * The feature id for the '<em><b>Separate Ful Fillment Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Accepted Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = 5;

	/**
	 * The feature id for the '<em><b>Required Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES = 6;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Accepted Barcode Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES = 8;

	/**
	 * The feature id for the '<em><b>Required Barcode Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES = 9;

	/**
	 * The number of structural features of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RequiredBarcodesImpl <em>Required Barcodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RequiredBarcodesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRequiredBarcodes()
	 * @generated
	 */
	int REQUIRED_BARCODES = 47;

	/**
	 * The feature id for the '<em><b>Required Barcodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES__REQUIRED_BARCODES = 0;

	/**
	 * The number of structural features of the '<em>Required Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Required Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AcceptedBarcodesImpl <em>Accepted Barcodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AcceptedBarcodesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAcceptedBarcodes()
	 * @generated
	 */
	int ACCEPTED_BARCODES = 48;

	/**
	 * The feature id for the '<em><b>Accepted Barcodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES__ACCEPTED_BARCODES = 0;

	/**
	 * The number of structural features of the '<em>Accepted Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accepted Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.SupportedOnlineServicesImpl <em>Supported Online Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.SupportedOnlineServicesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getSupportedOnlineServices()
	 * @generated
	 */
	int SUPPORTED_ONLINE_SERVICES = 49;

	/**
	 * The feature id for the '<em><b>Supported Online Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Supported Online Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supported Online Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.StationNamesImpl <em>Station Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.StationNamesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getStationNames()
	 * @generated
	 */
	int STATION_NAMES = 50;

	/**
	 * The feature id for the '<em><b>Station Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES__STATION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Station Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareElementsImpl <em>Fare Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareElementsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareElements()
	 * @generated
	 */
	int FARE_ELEMENTS = 51;

	/**
	 * The feature id for the '<em><b>Fare Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS__FARE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Fare Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fare Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareElementImpl <em>Fare Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareElementImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareElement()
	 * @generated
	 */
	int FARE_ELEMENT = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__DATA_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Fare Constraint Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FARE_CONSTRAINT_BUNDLE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Regional Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REGIONAL_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__CARRIER_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SALES_AVAILABILITY = 11;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TRAVEL_VALIDITY = 12;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__COMBINATION_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FARE_DETAIL_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__RESERVATION_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Reduction Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REDUCTION_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FULFILLMENT_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PASSENGER_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Regulatory Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REGULATORY_CONDITIONS = 20;

	/**
	 * The feature id for the '<em><b>After Sales Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__AFTER_SALES_RULE = 21;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__DATA_SOURCE = 22;

	/**
	 * The feature id for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER = 23;

	/**
	 * The feature id for the '<em><b>Legacy Conversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__LEGACY_CONVERSION = 24;

	/**
	 * The feature id for the '<em><b>Individual Contracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__INDIVIDUAL_CONTRACTS = 25;

	/**
	 * The feature id for the '<em><b>Involved Tcos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__INVOLVED_TCOS = 26;

	/**
	 * The feature id for the '<em><b>Luggage Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__LUGGAGE_CONSTRAINT = 27;

	/**
	 * The number of structural features of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TotalPassengerCombinationConstraintsImpl <em>Total Passenger Combination Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TotalPassengerCombinationConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTotalPassengerCombinationConstraints()
	 * @generated
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = 53;

	/**
	 * The feature id for the '<em><b>Total Passenger Combination Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Total Passenger Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Total Passenger Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TotalPassengerCombinationConstraintImpl <em>Total Passenger Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TotalPassengerCombinationConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Max Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Min Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Total Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Total Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareConstraintBundlesImpl <em>Fare Constraint Bundles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareConstraintBundlesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareConstraintBundles()
	 * @generated
	 */
	int FARE_CONSTRAINT_BUNDLES = 55;

	/**
	 * The feature id for the '<em><b>Fare Constraint Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES = 0;

	/**
	 * The number of structural features of the '<em>Fare Constraint Bundles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fare Constraint Bundles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareConstraintBundleImpl <em>Fare Constraint Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareConstraintBundleImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareConstraintBundle()
	 * @generated
	 */
	int FARE_CONSTRAINT_BUNDLE = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Default Fare Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY = 4;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY = 5;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Total Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Default Regulatory Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS = 10;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DATA_SOURCE = 11;

	/**
	 * The feature id for the '<em><b>Converted Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES = 12;

	/**
	 * The feature id for the '<em><b>Luggage Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__LUGGAGE_CONSTRAINT = 13;

	/**
	 * The number of structural features of the '<em>Fare Constraint Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Fare Constraint Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareStationSetDefinitionsImpl <em>Fare Station Set Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareStationSetDefinitionsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareStationSetDefinitions()
	 * @generated
	 */
	int FARE_STATION_SET_DEFINITIONS = 57;

	/**
	 * The feature id for the '<em><b>Fare Station Set Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Fare Station Set Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Fare Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT = 0;

	/**
	 * The number of operations of the '<em>Fare Station Set Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareStationSetDefinitionImpl <em>Fare Station Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareStationSetDefinitionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareStationSetDefinition()
	 * @generated
	 */
	int FARE_STATION_SET_DEFINITION = 58;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__CARRIER = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__LEGACY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__NAME = 5;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__NAME_UTF8 = 6;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__STATIONS = 7;

	/**
	 * The number of structural features of the '<em>Fare Station Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Fare Station Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LegacyAccountingIdentifierImpl <em>Legacy Accounting Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LegacyAccountingIdentifierImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLegacyAccountingIdentifier()
	 * @generated
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER = 59;

	/**
	 * The feature id for the '<em><b>Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID = 0;

	/**
	 * The feature id for the '<em><b>Tariff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID = 1;

	/**
	 * The feature id for the '<em><b>Add Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID = 2;

	/**
	 * The number of structural features of the '<em>Legacy Accounting Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Accounting Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PersonalDataConstraintsImpl <em>Personal Data Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PersonalDataConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataConstraints()
	 * @generated
	 */
	int PERSONAL_DATA_CONSTRAINTS = 60;

	/**
	 * The feature id for the '<em><b>Personal Data Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Personal Data Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Personal Data Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PersonalDataConstraintImpl <em>Personal Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PersonalDataConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataConstraint()
	 * @generated
	 */
	int PERSONAL_DATA_CONSTRAINT = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Required Personal Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Allowed Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES = 2;

	/**
	 * The number of structural features of the '<em>Personal Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personal Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RequiredPersonalDataImpl <em>Required Personal Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RequiredPersonalDataImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRequiredPersonalData()
	 * @generated
	 */
	int REQUIRED_PERSONAL_DATA = 62;

	/**
	 * The feature id for the '<em><b>Ticket Holder Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY = 0;

	/**
	 * The feature id for the '<em><b>Data Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__DATA_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Transfer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__TRANSFER = 2;

	/**
	 * The feature id for the '<em><b>Fulfillment Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Cross Border</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__CROSS_BORDER = 4;

	/**
	 * The number of structural features of the '<em>Required Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Required Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AllowedPersonalDataChangesImpl <em>Allowed Personal Data Changes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AllowedPersonalDataChangesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAllowedPersonalDataChanges()
	 * @generated
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES = 63;

	/**
	 * The feature id for the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Accepted Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON = 1;

	/**
	 * The number of structural features of the '<em>Allowed Personal Data Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allowed Personal Data Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PassengerConstraintsImpl <em>Passenger Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PassengerConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPassengerConstraints()
	 * @generated
	 */
	int PASSENGER_CONSTRAINTS = 64;

	/**
	 * The feature id for the '<em><b>Passenger Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Passenger Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Passenger Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PassengerConstraintImpl <em>Passenger Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PassengerConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPassengerConstraint()
	 * @generated
	 */
	int PASSENGER_CONSTRAINT = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Traveler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TRAVELER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Upper Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>Lower Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>Travel Alone Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Reservation Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Is Ancilliary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__IS_ANCILLIARY = 7;

	/**
	 * The feature id for the '<em><b>Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__PASSENGER_WEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Max Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Min Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = 10;

	/**
	 * The feature id for the '<em><b>Included Free Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS = 11;

	/**
	 * The feature id for the '<em><b>Excluded Passenger Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS = 12;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__DATA_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__DATA_SOURCE = 14;

	/**
	 * The number of structural features of the '<em>Passenger Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Passenger Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PassengerCombinationConstraintImpl <em>Passenger Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PassengerCombinationConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPassengerCombinationConstraint()
	 * @generated
	 */
	int PASSENGER_COMBINATION_CONSTRAINT = 66;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Min Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.IncludedFreePassengerLimitImpl <em>Included Free Passenger Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.IncludedFreePassengerLimitImpl
	 * @see Accounting.impl.AccountingPackageImpl#getIncludedFreePassengerLimit()
	 * @generated
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT = 67;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Included Free Passenger Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Included Free Passenger Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CombinationConstraintsImpl <em>Combination Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CombinationConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCombinationConstraints()
	 * @generated
	 */
	int COMBINATION_CONSTRAINTS = 68;

	/**
	 * The feature id for the '<em><b>Combination Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CombinationConstraintImpl <em>Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CombinationConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCombinationConstraint()
	 * @generated
	 */
	int COMBINATION_CONSTRAINT = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Combination Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__COMBINATION_MODELS = 2;

	/**
	 * The number of structural features of the '<em>Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TravelValidityConstraintsImpl <em>Travel Validity Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TravelValidityConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTravelValidityConstraints()
	 * @generated
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS = 70;

	/**
	 * The feature id for the '<em><b>Travel Validity Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Travel Validity Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Travel Validity Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TravelValidityConstraintImpl <em>Travel Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TravelValidityConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTravelValidityConstraint()
	 * @generated
	 */
	int TRAVEL_VALIDITY_CONSTRAINT = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Valid Days</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS = 2;

	/**
	 * The feature id for the '<em><b>Travel Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS = 3;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RANGE = 4;

	/**
	 * The feature id for the '<em><b>Return Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Excluded Time Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = 6;

	/**
	 * The feature id for the '<em><b>Train Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY = 7;

	/**
	 * The feature id for the '<em><b>Validity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Trip Interruption Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Trip Allocation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT = 10;

	/**
	 * The number of structural features of the '<em>Travel Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Travel Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TrainValidityImpl <em>Train Validity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TrainValidityImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTrainValidity()
	 * @generated
	 */
	int TRAIN_VALIDITY = 72;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY__CARRIER_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Serrvice Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY__SERRVICE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY__SCOPE = 2;

	/**
	 * The number of structural features of the '<em>Train Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.SalesAvailabilityConstraintsImpl <em>Sales Availability Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.SalesAvailabilityConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getSalesAvailabilityConstraints()
	 * @generated
	 */
	int SALES_AVAILABILITY_CONSTRAINTS = 73;

	/**
	 * The feature id for the '<em><b>Sales Availability Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Sales Availability Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sales Availability Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.SalesAvailabilityConstraintImpl <em>Sales Availability Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.SalesAvailabilityConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getSalesAvailabilityConstraint()
	 * @generated
	 */
	int SALES_AVAILABILITY_CONSTRAINT = 74;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS = 2;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__DATA_SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Sales Availability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sales Availability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.SalesRestrictionImpl <em>Sales Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.SalesRestrictionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getSalesRestriction()
	 * @generated
	 */
	int SALES_RESTRICTION = 75;

	/**
	 * The feature id for the '<em><b>Sales Dates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__SALES_DATES = 0;

	/**
	 * The feature id for the '<em><b>Start Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__START_OF_SALE = 1;

	/**
	 * The feature id for the '<em><b>End Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__END_OF_SALE = 2;

	/**
	 * The number of structural features of the '<em>Sales Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sales Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.EndOfSaleImpl <em>End Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.EndOfSaleImpl
	 * @see Accounting.impl.AccountingPackageImpl#getEndOfSale()
	 * @generated
	 */
	int END_OF_SALE = 76;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>End Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.StartOfSaleImpl <em>Start Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.StartOfSaleImpl
	 * @see Accounting.impl.AccountingPackageImpl#getStartOfSale()
	 * @generated
	 */
	int START_OF_SALE = 77;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>Start Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CarrierConstraintsImpl <em>Carrier Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CarrierConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCarrierConstraints()
	 * @generated
	 */
	int CARRIER_CONSTRAINTS = 78;

	/**
	 * The feature id for the '<em><b>Carrier Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CarrierConstraintImpl <em>Carrier Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CarrierConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCarrierConstraint()
	 * @generated
	 */
	int CARRIER_CONSTRAINT = 79;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Included Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__INCLUDED_CARRIERS = 1;

	/**
	 * The feature id for the '<em><b>Excluded Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__EXCLUDED_CARRIERS = 2;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__DATA_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__DATA_SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceConstraintsImpl <em>Service Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceConstraints()
	 * @generated
	 */
	int SERVICE_CONSTRAINTS = 80;

	/**
	 * The feature id for the '<em><b>Service Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Service Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceConstraintImpl <em>Service Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceConstraint()
	 * @generated
	 */
	int SERVICE_CONSTRAINT = 81;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Included Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS = 1;

	/**
	 * The feature id for the '<em><b>Excluded Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS = 2;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__DATA_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Legacy108 Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__LEGACY108_CODE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Service Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RegionalConstraintsImpl <em>Regional Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RegionalConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRegionalConstraints()
	 * @generated
	 */
	int REGIONAL_CONSTRAINTS = 82;

	/**
	 * The feature id for the '<em><b>Regional Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Regional Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Regional Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RegionalConstraintImpl <em>Regional Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RegionalConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRegionalConstraint()
	 * @generated
	 */
	int REGIONAL_CONSTRAINT = 83;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Entry Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT = 2;

	/**
	 * The feature id for the '<em><b>Exit Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Regional Validity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__REGIONAL_VALIDITY = 4;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DATA_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DATA_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Linked Fares</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__LINKED_FARES = 7;

	/**
	 * The number of structural features of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RegionalValidityImpl <em>Regional Validity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RegionalValidityImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRegionalValidity()
	 * @generated
	 */
	int REGIONAL_VALIDITY = 84;

	/**
	 * The feature id for the '<em><b>Seq Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__SEQ_NB = 0;

	/**
	 * The feature id for the '<em><b>Via Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__VIA_STATION = 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__ZONE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__LINE = 3;

	/**
	 * The feature id for the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__POLYGONE = 4;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__CARRIER_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__SERVICE_CONSTRAINT = 6;

	/**
	 * The number of structural features of the '<em>Regional Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Regional Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceLevelDefinitionsImpl <em>Service Level Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceLevelDefinitionsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceLevelDefinitions()
	 * @generated
	 */
	int SERVICE_LEVEL_DEFINITIONS = 85;

	/**
	 * The feature id for the '<em><b>Service Level Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Service Level Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Level Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TextsImpl <em>Texts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TextsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTexts()
	 * @generated
	 */
	int TEXTS = 86;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS__TEXTS = 0;

	/**
	 * The number of structural features of the '<em>Texts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Texts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TextImpl
	 * @see Accounting.impl.AccountingPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 87;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = 0;

	/**
	 * The feature id for the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_UTF8 = 1;

	/**
	 * The feature id for the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_ICAO = 2;

	/**
	 * The feature id for the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SHORT_TEXT_UTF8 = 3;

	/**
	 * The feature id for the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SHORT_TEXT_ICAO = 4;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRANSLATIONS = 5;

	/**
	 * The feature id for the '<em><b>Standard Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STANDARD_TEXT = 6;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DATA_SOURCE = 7;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TranslationImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 88;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TEXT_UTF8 = 1;

	/**
	 * The feature id for the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TEXT_ICAO = 2;

	/**
	 * The feature id for the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SHORT_TEXT_UTF8 = 3;

	/**
	 * The feature id for the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SHORT_TEXT_ICAO = 4;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PricesImpl <em>Prices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PricesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPrices()
	 * @generated
	 */
	int PRICES = 89;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES__PRICES = 0;

	/**
	 * The number of structural features of the '<em>Prices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PriceImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 90;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__CURRENCIES = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__DATA_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.VATDetailImpl <em>VAT Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.VATDetailImpl
	 * @see Accounting.impl.AccountingPackageImpl#getVATDetail()
	 * @generated
	 */
	int VAT_DETAIL = 91;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__PERCENTAGE = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__TAX_ID = 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__SCOPE = 4;

	/**
	 * The number of structural features of the '<em>VAT Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>VAT Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CurrencyPriceImpl <em>Currency Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CurrencyPriceImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCurrencyPrice()
	 * @generated
	 */
	int CURRENCY_PRICE = 92;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__CURRENCY = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>VA Tdetails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__VA_TDETAILS = 2;

	/**
	 * The number of structural features of the '<em>Currency Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Currency Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceClassDefinitionsImpl <em>Service Class Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceClassDefinitionsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceClassDefinitions()
	 * @generated
	 */
	int SERVICE_CLASS_DEFINITIONS = 93;

	/**
	 * The feature id for the '<em><b>Service Class Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Service Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CalendarsImpl <em>Calendars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CalendarsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCalendars()
	 * @generated
	 */
	int CALENDARS = 94;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS__CALENDARS = 0;

	/**
	 * The number of structural features of the '<em>Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CalendarImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 95;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__ID = 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__FROM_DATE = 2;

	/**
	 * The feature id for the '<em><b>Until Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UNTIL_DATE = 3;

	/**
	 * The feature id for the '<em><b>Utc Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UTC_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATES = 5;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATA_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>From Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__FROM_DATE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Until Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UNTIL_DATE_TIME = 8;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReservationParametersImpl <em>Reservation Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReservationParametersImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReservationParameters()
	 * @generated
	 */
	int RESERVATION_PARAMETERS = 96;

	/**
	 * The feature id for the '<em><b>Reservation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS__RESERVATION_PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Reservation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reservation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReservationParameterImpl <em>Reservation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReservationParameterImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReservationParameter()
	 * @generated
	 */
	int RESERVATION_PARAMETER = 97;

	/**
	 * The feature id for the '<em><b>Mandatory Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__MANDATORY_RESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__ID = 1;

	/**
	 * The feature id for the '<em><b>Params9181</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__PARAMS9181 = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Mandatory Reservation For Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS = 4;

	/**
	 * The feature id for the '<em><b>Mandatory Reservations For Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE = 5;

	/**
	 * The number of structural features of the '<em>Reservation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reservation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReservationParams9181Impl <em>Reservation Params9181</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReservationParams9181Impl
	 * @see Accounting.impl.AccountingPackageImpl#getReservationParams9181()
	 * @generated
	 */
	int RESERVATION_PARAMS9181 = 98;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__TRAVEL_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__SERVICE_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Berth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__BERTH_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Coach Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__COACH_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Compartment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__COMPARTMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__TARIFF = 6;

	/**
	 * The number of structural features of the '<em>Reservation Params9181</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Reservation Params9181</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReservationOptionsImpl <em>Reservation Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReservationOptionsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReservationOptions()
	 * @generated
	 */
	int RESERVATION_OPTIONS = 99;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__PREFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__SERVICE_BRANDS = 1;

	/**
	 * The feature id for the '<em><b>Graphical Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__GRAPHICAL_RESERVATION = 2;

	/**
	 * The number of structural features of the '<em>Reservation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reservation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReservationPreferenceGroupImpl <em>Reservation Preference Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReservationPreferenceGroupImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReservationPreferenceGroup()
	 * @generated
	 */
	int RESERVATION_PREFERENCE_GROUP = 100;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP__PREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP__GROUP = 1;

	/**
	 * The number of structural features of the '<em>Reservation Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reservation Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceClassImpl <em>Service Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceClassImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceClass()
	 * @generated
	 */
	int SERVICE_CLASS = 101;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__ID = 0;

	/**
	 * The feature id for the '<em><b>Classic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__CLASSIC_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Service Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ServiceLevelImpl <em>Service Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ServiceLevelImpl
	 * @see Accounting.impl.AccountingPackageImpl#getServiceLevel()
	 * @generated
	 */
	int SERVICE_LEVEL = 102;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Combining Service Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__COMBINING_SERVICE_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__RESERVATION_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Includes Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__INCLUDES_CLASS_NAME = 4;

	/**
	 * The number of structural features of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TimeRangeImpl <em>Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TimeRangeImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTimeRange()
	 * @generated
	 */
	int TIME_RANGE = 103;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__FROM = 1;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__UNTIL = 2;

	/**
	 * The number of structural features of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ExcludedTimeRangeImpl <em>Excluded Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ExcludedTimeRangeImpl
	 * @see Accounting.impl.AccountingPackageImpl#getExcludedTimeRange()
	 * @generated
	 */
	int EXCLUDED_TIME_RANGE = 104;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__SCOPE = TIME_RANGE__SCOPE;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__FROM = TIME_RANGE__FROM;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__UNTIL = TIME_RANGE__UNTIL;

	/**
	 * The number of structural features of the '<em>Excluded Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE_FEATURE_COUNT = TIME_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excluded Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE_OPERATION_COUNT = TIME_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ValidityRangeImpl <em>Validity Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ValidityRangeImpl
	 * @see Accounting.impl.AccountingPackageImpl#getValidityRange()
	 * @generated
	 */
	int VALIDITY_RANGE = 105;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Hours After Midnight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT = 2;

	/**
	 * The number of structural features of the '<em>Validity Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validity Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReturnValidityConstraintImpl <em>Return Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReturnValidityConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReturnValidityConstraint()
	 * @generated
	 */
	int RETURN_VALIDITY_CONSTRAINT = 107;

	/**
	 * The feature id for the '<em><b>Excluded Weekdays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS = 0;

	/**
	 * The feature id for the '<em><b>Latest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN = 1;

	/**
	 * The feature id for the '<em><b>Earliest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN = 2;

	/**
	 * The number of structural features of the '<em>Return Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Return Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TripAllocationConstraintImpl <em>Trip Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TripAllocationConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTripAllocationConstraint()
	 * @generated
	 */
	int TRIP_ALLOCATION_CONSTRAINT = 108;

	/**
	 * The feature id for the '<em><b>Allocation Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Max Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS = 1;

	/**
	 * The feature id for the '<em><b>Duration Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Required Processes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES = 3;

	/**
	 * The number of structural features of the '<em>Trip Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trip Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.TripInterruptionConstraintImpl <em>Trip Interruption Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.TripInterruptionConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getTripInterruptionConstraint()
	 * @generated
	 */
	int TRIP_INTERRUPTION_CONSTRAINT = 109;

	/**
	 * The feature id for the '<em><b>Max Interruptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION = 1;

	/**
	 * The feature id for the '<em><b>Total Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Required Processes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES = 3;

	/**
	 * The number of structural features of the '<em>Trip Interruption Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trip Interruption Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ViaStationImpl <em>Via Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ViaStationImpl
	 * @see Accounting.impl.AccountingPackageImpl#getViaStation()
	 * @generated
	 */
	int VIA_STATION = 110;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__STATION = 0;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__CARRIER_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__CARRIER = 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Alternative Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ALTERNATIVE_ROUTES = 4;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__DATA_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Fare Station Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__FARE_STATION_SET = 6;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__SERVICE_CONSTRAINT = 7;

	/**
	 * The number of structural features of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION___GET_DESCRIPTION = 0;

	/**
	 * The number of operations of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Accounting.impl.AlternativeRouteImpl <em>Alternative Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AlternativeRouteImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAlternativeRoute()
	 * @generated
	 */
	int ALTERNATIVE_ROUTE = 111;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Alternative Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alternative Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RouteImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 112;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ZoneImpl
	 * @see Accounting.impl.AccountingPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 113;

	/**
	 * The feature id for the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__BINARY_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Zone Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ZONE_ID = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CITY = 2;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CARRIER = 3;

	/**
	 * The feature id for the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ENTRY_STATION = 4;

	/**
	 * The feature id for the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TERMINAL_STATION = 5;

	/**
	 * The feature id for the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NUTS_CODE = 6;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LineImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 114;

	/**
	 * The feature id for the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BINARY_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Line Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LINE_ID = 1;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CARRIER = 2;

	/**
	 * The feature id for the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ENTRY_STATION = 3;

	/**
	 * The feature id for the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TERMINAL_STATION = 4;

	/**
	 * The feature id for the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NUTS_CODE = 5;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CITY = 6;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.PolygoneImpl <em>Polygone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.PolygoneImpl
	 * @see Accounting.impl.AccountingPackageImpl#getPolygone()
	 * @generated
	 */
	int POLYGONE = 115;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE__EDGE = 0;

	/**
	 * The number of structural features of the '<em>Polygone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Polygone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.EdgeImpl
	 * @see Accounting.impl.AccountingPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 116;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACCURACY = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LATITUDE = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ZoneDefinitionsImpl <em>Zone Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ZoneDefinitionsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getZoneDefinitions()
	 * @generated
	 */
	int ZONE_DEFINITIONS = 117;

	/**
	 * The feature id for the '<em><b>Zone Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITIONS__ZONE_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Zone Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Zone Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ZoneDefinitionImpl <em>Zone Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ZoneDefinitionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getZoneDefinition()
	 * @generated
	 */
	int ZONE_DEFINITION = 118;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__ZONE_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__POLYGONE = 3;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__NAME_UTF8 = 4;

	/**
	 * The feature id for the '<em><b>Station Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__STATION_SET = 5;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__NUTS_CODES = 6;

	/**
	 * The number of structural features of the '<em>Zone Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Zone Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.CrossBorderConditionImpl <em>Cross Border Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.CrossBorderConditionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getCrossBorderCondition()
	 * @generated
	 */
	int CROSS_BORDER_CONDITION = 119;

	/**
	 * The feature id for the '<em><b>From Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__FROM_COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>To Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__TO_COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Affected Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS = 2;

	/**
	 * The number of structural features of the '<em>Cross Border Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cross Border Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.FareCombinationModelImpl <em>Fare Combination Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.FareCombinationModelImpl
	 * @see Accounting.impl.AccountingPackageImpl#getFareCombinationModel()
	 * @generated
	 */
	int FARE_COMBINATION_MODEL = 120;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Combinable Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS = 1;

	/**
	 * The feature id for the '<em><b>Only When Combined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED = 2;

	/**
	 * The feature id for the '<em><b>Allowed Allocators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS = 3;

	/**
	 * The feature id for the '<em><b>Reference Cluster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__REFERENCE_CLUSTER = 4;

	/**
	 * The feature id for the '<em><b>Allowed Clusters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS = 5;

	/**
	 * The feature id for the '<em><b>Allowed Common Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS = 6;

	/**
	 * The number of structural features of the '<em>Fare Combination Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Fare Combination Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReductionConstraintsImpl <em>Reduction Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReductionConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReductionConstraints()
	 * @generated
	 */
	int REDUCTION_CONSTRAINTS = 121;

	/**
	 * The feature id for the '<em><b>Reduction Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Reduction Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reduction Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReductionConstraintImpl <em>Reduction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReductionConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReductionConstraint()
	 * @generated
	 */
	int REDUCTION_CONSTRAINT = 122;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Required Reduction Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS = 1;

	/**
	 * The number of structural features of the '<em>Reduction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reduction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReductionCardsImpl <em>Reduction Cards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReductionCardsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReductionCards()
	 * @generated
	 */
	int REDUCTION_CARDS = 123;

	/**
	 * The feature id for the '<em><b>Reduction Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS__REDUCTION_CARDS = 0;

	/**
	 * The number of structural features of the '<em>Reduction Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reduction Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.ReductionCardImpl <em>Reduction Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.ReductionCardImpl
	 * @see Accounting.impl.AccountingPackageImpl#getReductionCard()
	 * @generated
	 */
	int REDUCTION_CARD = 124;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__ID = 0;

	/**
	 * The feature id for the '<em><b>Card Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__CARD_ISSUER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Service Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__SERVICE_CLASSES = 3;

	/**
	 * The feature id for the '<em><b>Id Required For Booking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING = 4;

	/**
	 * The feature id for the '<em><b>Included Reduction Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__INCLUDED_REDUCTION_CARDS = 5;

	/**
	 * The feature id for the '<em><b>Uic Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__UIC_CODE = 6;

	/**
	 * The number of structural features of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.RequiredReductionCardImpl <em>Required Reduction Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.RequiredReductionCardImpl
	 * @see Accounting.impl.AccountingPackageImpl#getRequiredReductionCard()
	 * @generated
	 */
	int REQUIRED_REDUCTION_CARD = 125;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__CARD_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__CARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Required Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Required Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LuggageConstraintsImpl <em>Luggage Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LuggageConstraintsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLuggageConstraints()
	 * @generated
	 */
	int LUGGAGE_CONSTRAINTS = 126;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINTS__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Luggage Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Luggage Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LuggageConstraintImpl <em>Luggage Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LuggageConstraintImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLuggageConstraint()
	 * @generated
	 */
	int LUGGAGE_CONSTRAINT = 127;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Max Hand Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE = 1;

	/**
	 * The feature id for the '<em><b>Max Large Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE = 2;

	/**
	 * The feature id for the '<em><b>Restricted Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__RULES = 4;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__DATA_DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Luggage Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Luggage Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LuggageItemsRestrictionImpl <em>Luggage Items Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LuggageItemsRestrictionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLuggageItemsRestriction()
	 * @generated
	 */
	int LUGGAGE_ITEMS_RESTRICTION = 128;

	/**
	 * The feature id for the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Luggage Items Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Luggage Items Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.LuggageDimensionImpl <em>Luggage Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.LuggageDimensionImpl
	 * @see Accounting.impl.AccountingPackageImpl#getLuggageDimension()
	 * @generated
	 */
	int LUGGAGE_DIMENSION = 129;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Luggage Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Luggage Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AddCarrierRulesImpl <em>Add Carrier Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AddCarrierRulesImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAddCarrierRules()
	 * @generated
	 */
	int ADD_CARRIER_RULES = 130;

	/**
	 * The feature id for the '<em><b>Add Carrier Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULES__ADD_CARRIER_RULE = 0;

	/**
	 * The number of structural features of the '<em>Add Carrier Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Add Carrier Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.AddCarrierRuleImpl <em>Add Carrier Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.AddCarrierRuleImpl
	 * @see Accounting.impl.AccountingPackageImpl#getAddCarrierRule()
	 * @generated
	 */
	int ADD_CARRIER_RULE = 131;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE__STATIONS = 2;

	/**
	 * The number of structural features of the '<em>Add Carrier Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Add Carrier Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.impl.OnBorderStationsImpl <em>On Border Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.impl.OnBorderStationsImpl
	 * @see Accounting.impl.AccountingPackageImpl#getOnBorderStations()
	 * @generated
	 */
	int ON_BORDER_STATIONS = 132;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BORDER_STATIONS__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>On Border Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BORDER_STATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>On Border Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BORDER_STATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Accounting.PaymentType <em>Payment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.PaymentType
	 * @see Accounting.impl.AccountingPackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 133;

	/**
	 * The meta object id for the '{@link Accounting.SalesChannel <em>Sales Channel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.SalesChannel
	 * @see Accounting.impl.AccountingPackageImpl#getSalesChannel()
	 * @generated
	 */
	int SALES_CHANNEL = 134;

	/**
	 * The meta object id for the '{@link Accounting.TransactionType <em>Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TransactionType
	 * @see Accounting.impl.AccountingPackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 135;

	/**
	 * The meta object id for the '{@link Accounting.AccountingType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.AccountingType
	 * @see Accounting.impl.AccountingPackageImpl#getAccountingType()
	 * @generated
	 */
	int ACCOUNTING_TYPE = 136;

	/**
	 * The meta object id for the '{@link Accounting.SettlementValueIndicator <em>Settlement Value Indicator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.SettlementValueIndicator
	 * @see Accounting.impl.AccountingPackageImpl#getSettlementValueIndicator()
	 * @generated
	 */
	int SETTLEMENT_VALUE_INDICATOR = 137;

	/**
	 * The meta object id for the '{@link Accounting.SalesType <em>Sales Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.SalesType
	 * @see Accounting.impl.AccountingPackageImpl#getSalesType()
	 * @generated
	 */
	int SALES_TYPE = 138;

	/**
	 * The meta object id for the '{@link Accounting.TransactionStandard <em>Transaction Standard</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TransactionStandard
	 * @see Accounting.impl.AccountingPackageImpl#getTransactionStandard()
	 * @generated
	 */
	int TRANSACTION_STANDARD = 139;

	/**
	 * The meta object id for the '{@link Accounting.BoardingOrArrival <em>Boarding Or Arrival</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.BoardingOrArrival
	 * @see Accounting.impl.AccountingPackageImpl#getBoardingOrArrival()
	 * @generated
	 */
	int BOARDING_OR_ARRIVAL = 140;

	/**
	 * The meta object id for the '{@link Accounting.LuggageRule <em>Luggage Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.LuggageRule
	 * @see Accounting.impl.AccountingPackageImpl#getLuggageRule()
	 * @generated
	 */
	int LUGGAGE_RULE = 141;

	/**
	 * The meta object id for the '{@link Accounting.Dimension <em>Dimension</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.Dimension
	 * @see Accounting.impl.AccountingPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 142;

	/**
	 * The meta object id for the '{@link Accounting.AddCarrierScope <em>Add Carrier Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.AddCarrierScope
	 * @see Accounting.impl.AccountingPackageImpl#getAddCarrierScope()
	 * @generated
	 */
	int ADD_CARRIER_SCOPE = 143;

	/**
	 * The meta object id for the '{@link Accounting.TransportMode <em>Transport Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TransportMode
	 * @see Accounting.impl.AccountingPackageImpl#getTransportMode()
	 * @generated
	 */
	int TRANSPORT_MODE = 144;

	/**
	 * The meta object id for the '{@link Accounting.StationRelationType <em>Station Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.StationRelationType
	 * @see Accounting.impl.AccountingPackageImpl#getStationRelationType()
	 * @generated
	 */
	int STATION_RELATION_TYPE = 145;

	/**
	 * The meta object id for the '{@link Accounting.StationFareDetailType <em>Station Fare Detail Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.StationFareDetailType
	 * @see Accounting.impl.AccountingPackageImpl#getStationFareDetailType()
	 * @generated
	 */
	int STATION_FARE_DETAIL_TYPE = 146;

	/**
	 * The meta object id for the '{@link Accounting.RegulatoryCondition <em>Regulatory Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.RegulatoryCondition
	 * @see Accounting.impl.AccountingPackageImpl#getRegulatoryCondition()
	 * @generated
	 */
	int REGULATORY_CONDITION = 147;

	/**
	 * The meta object id for the '{@link Accounting.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.AfterSalesTransactionType
	 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesTransactionType()
	 * @generated
	 */
	int AFTER_SALES_TRANSACTION_TYPE = 148;

	/**
	 * The meta object id for the '{@link Accounting.BarcodeTypes <em>Barcode Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.BarcodeTypes
	 * @see Accounting.impl.AccountingPackageImpl#getBarcodeTypes()
	 * @generated
	 */
	int BARCODE_TYPES = 149;

	/**
	 * The meta object id for the '{@link Accounting.BasePriceClassType <em>Base Price Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.BasePriceClassType
	 * @see Accounting.impl.AccountingPackageImpl#getBasePriceClassType()
	 * @generated
	 */
	int BASE_PRICE_CLASS_TYPE = 150;

	/**
	 * The meta object id for the '{@link Accounting.ClassicClassType <em>Classic Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ClassicClassType
	 * @see Accounting.impl.AccountingPackageImpl#getClassicClassType()
	 * @generated
	 */
	int CLASSIC_CLASS_TYPE = 151;

	/**
	 * The meta object id for the '{@link Accounting.ClassId <em>Class Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ClassId
	 * @see Accounting.impl.AccountingPackageImpl#getClassId()
	 * @generated
	 */
	int CLASS_ID = 152;

	/**
	 * The meta object id for the '{@link Accounting.CharacterSet <em>Character Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.CharacterSet
	 * @see Accounting.impl.AccountingPackageImpl#getCharacterSet()
	 * @generated
	 */
	int CHARACTER_SET = 153;

	/**
	 * The meta object id for the '{@link Accounting.Clusters <em>Clusters</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.Clusters
	 * @see Accounting.impl.AccountingPackageImpl#getClusters()
	 * @generated
	 */
	int CLUSTERS = 154;

	/**
	 * The meta object id for the '{@link Accounting.CombinationModel <em>Combination Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.CombinationModel
	 * @see Accounting.impl.AccountingPackageImpl#getCombinationModel()
	 * @generated
	 */
	int COMBINATION_MODEL = 155;

	/**
	 * The meta object id for the '{@link Accounting.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ControlDataExchangeTypes
	 * @see Accounting.impl.AccountingPackageImpl#getControlDataExchangeTypes()
	 * @generated
	 */
	int CONTROL_DATA_EXCHANGE_TYPES = 156;

	/**
	 * The meta object id for the '{@link Accounting.DataSource <em>Data Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.DataSource
	 * @see Accounting.impl.AccountingPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 157;

	/**
	 * The meta object id for the '{@link Accounting.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.DataType
	 * @see Accounting.impl.AccountingPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 158;

	/**
	 * The meta object id for the '{@link Accounting.FareType <em>Fare Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.FareType
	 * @see Accounting.impl.AccountingPackageImpl#getFareType()
	 * @generated
	 */
	int FARE_TYPE = 159;

	/**
	 * The meta object id for the '{@link Accounting.FulfillmentType <em>Fulfillment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.FulfillmentType
	 * @see Accounting.impl.AccountingPackageImpl#getFulfillmentType()
	 * @generated
	 */
	int FULFILLMENT_TYPE = 160;

	/**
	 * The meta object id for the '{@link Accounting.GeoSystem <em>Geo System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.GeoSystem
	 * @see Accounting.impl.AccountingPackageImpl#getGeoSystem()
	 * @generated
	 */
	int GEO_SYSTEM = 161;

	/**
	 * The meta object id for the '{@link Accounting.GeoUnit <em>Geo Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.GeoUnit
	 * @see Accounting.impl.AccountingPackageImpl#getGeoUnit()
	 * @generated
	 */
	int GEO_UNIT = 162;

	/**
	 * The meta object id for the '{@link Accounting.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.GraphicalReservationType
	 * @see Accounting.impl.AccountingPackageImpl#getGraphicalReservationType()
	 * @generated
	 */
	int GRAPHICAL_RESERVATION_TYPE = 163;

	/**
	 * The meta object id for the '{@link Accounting.GenericReductionCards <em>Generic Reduction Cards</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.GenericReductionCards
	 * @see Accounting.impl.AccountingPackageImpl#getGenericReductionCards()
	 * @generated
	 */
	int GENERIC_REDUCTION_CARDS = 164;

	/**
	 * The meta object id for the '{@link Accounting.HemisphereEW <em>Hemisphere EW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.HemisphereEW
	 * @see Accounting.impl.AccountingPackageImpl#getHemisphereEW()
	 * @generated
	 */
	int HEMISPHERE_EW = 165;

	/**
	 * The meta object id for the '{@link Accounting.HemisphereNS <em>Hemisphere NS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.HemisphereNS
	 * @see Accounting.impl.AccountingPackageImpl#getHemisphereNS()
	 * @generated
	 */
	int HEMISPHERE_NS = 166;

	/**
	 * The meta object id for the '{@link Accounting.InterfaceType <em>Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.InterfaceType
	 * @see Accounting.impl.AccountingPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 167;

	/**
	 * The meta object id for the '{@link Accounting.LegacyCalculationType <em>Legacy Calculation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.LegacyCalculationType
	 * @see Accounting.impl.AccountingPackageImpl#getLegacyCalculationType()
	 * @generated
	 */
	int LEGACY_CALCULATION_TYPE = 168;

	/**
	 * The meta object id for the '{@link Accounting.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.LegacyPassengerType
	 * @see Accounting.impl.AccountingPackageImpl#getLegacyPassengerType()
	 * @generated
	 */
	int LEGACY_PASSENGER_TYPE = 169;

	/**
	 * The meta object id for the '{@link Accounting.LegacySeriesType <em>Legacy Series Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.LegacySeriesType
	 * @see Accounting.impl.AccountingPackageImpl#getLegacySeriesType()
	 * @generated
	 */
	int LEGACY_SERIES_TYPE = 170;

	/**
	 * The meta object id for the '{@link Accounting.LegacyConversionType <em>Legacy Conversion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.LegacyConversionType
	 * @see Accounting.impl.AccountingPackageImpl#getLegacyConversionType()
	 * @generated
	 */
	int LEGACY_CONVERSION_TYPE = 171;

	/**
	 * The meta object id for the '{@link Accounting.OfferRequestType <em>Offer Request Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.OfferRequestType
	 * @see Accounting.impl.AccountingPackageImpl#getOfferRequestType()
	 * @generated
	 */
	int OFFER_REQUEST_TYPE = 172;

	/**
	 * The meta object id for the '{@link Accounting.OnlineServiceType <em>Online Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.OnlineServiceType
	 * @see Accounting.impl.AccountingPackageImpl#getOnlineServiceType()
	 * @generated
	 */
	int ONLINE_SERVICE_TYPE = 173;

	/**
	 * The meta object id for the '{@link Accounting.PersonalDataItemsType <em>Personal Data Items Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.PersonalDataItemsType
	 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataItemsType()
	 * @generated
	 */
	int PERSONAL_DATA_ITEMS_TYPE = 174;

	/**
	 * The meta object id for the '{@link Accounting.PersonalDataTransferType <em>Personal Data Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.PersonalDataTransferType
	 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataTransferType()
	 * @generated
	 */
	int PERSONAL_DATA_TRANSFER_TYPE = 175;

	/**
	 * The meta object id for the '{@link Accounting.PersonalDataChangeReason <em>Personal Data Change Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.PersonalDataChangeReason
	 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataChangeReason()
	 * @generated
	 */
	int PERSONAL_DATA_CHANGE_REASON = 176;

	/**
	 * The meta object id for the '{@link Accounting.ReservationTravelClass <em>Reservation Travel Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ReservationTravelClass
	 * @see Accounting.impl.AccountingPackageImpl#getReservationTravelClass()
	 * @generated
	 */
	int RESERVATION_TRAVEL_CLASS = 177;

	/**
	 * The meta object id for the '{@link Accounting.ReservationServiceLevel <em>Reservation Service Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ReservationServiceLevel
	 * @see Accounting.impl.AccountingPackageImpl#getReservationServiceLevel()
	 * @generated
	 */
	int RESERVATION_SERVICE_LEVEL = 178;

	/**
	 * The meta object id for the '{@link Accounting.ReservationService <em>Reservation Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ReservationService
	 * @see Accounting.impl.AccountingPackageImpl#getReservationService()
	 * @generated
	 */
	int RESERVATION_SERVICE = 179;

	/**
	 * The meta object id for the '{@link Accounting.ReservationBerthType <em>Reservation Berth Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ReservationBerthType
	 * @see Accounting.impl.AccountingPackageImpl#getReservationBerthType()
	 * @generated
	 */
	int RESERVATION_BERTH_TYPE = 180;

	/**
	 * The meta object id for the '{@link Accounting.RoundingType <em>Rounding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.RoundingType
	 * @see Accounting.impl.AccountingPackageImpl#getRoundingType()
	 * @generated
	 */
	int ROUNDING_TYPE = 181;

	/**
	 * The meta object id for the '{@link Accounting.SchemaVersion <em>Schema Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.SchemaVersion
	 * @see Accounting.impl.AccountingPackageImpl#getSchemaVersion()
	 * @generated
	 */
	int SCHEMA_VERSION = 182;

	/**
	 * The meta object id for the '{@link Accounting.ServiceMode <em>Service Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.ServiceMode
	 * @see Accounting.impl.AccountingPackageImpl#getServiceMode()
	 * @generated
	 */
	int SERVICE_MODE = 183;

	/**
	 * The meta object id for the '{@link Accounting.TimeZone <em>Time Zone</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TimeZone
	 * @see Accounting.impl.AccountingPackageImpl#getTimeZone()
	 * @generated
	 */
	int TIME_ZONE = 184;

	/**
	 * The meta object id for the '{@link Accounting.TaxScope <em>Tax Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TaxScope
	 * @see Accounting.impl.AccountingPackageImpl#getTaxScope()
	 * @generated
	 */
	int TAX_SCOPE = 185;

	/**
	 * The meta object id for the '{@link Accounting.TimeReferenceType <em>Time Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TimeReferenceType
	 * @see Accounting.impl.AccountingPackageImpl#getTimeReferenceType()
	 * @generated
	 */
	int TIME_REFERENCE_TYPE = 186;

	/**
	 * The meta object id for the '{@link Accounting.TimeRangeScope <em>Time Range Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TimeRangeScope
	 * @see Accounting.impl.AccountingPackageImpl#getTimeRangeScope()
	 * @generated
	 */
	int TIME_RANGE_SCOPE = 187;

	/**
	 * The meta object id for the '{@link Accounting.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TimeUnit
	 * @see Accounting.impl.AccountingPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 188;

	/**
	 * The meta object id for the '{@link Accounting.TravelerType <em>Traveler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TravelerType
	 * @see Accounting.impl.AccountingPackageImpl#getTravelerType()
	 * @generated
	 */
	int TRAVELER_TYPE = 189;

	/**
	 * The meta object id for the '{@link Accounting.TripAllocationProcess <em>Trip Allocation Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TripAllocationProcess
	 * @see Accounting.impl.AccountingPackageImpl#getTripAllocationProcess()
	 * @generated
	 */
	int TRIP_ALLOCATION_PROCESS = 190;

	/**
	 * The meta object id for the '{@link Accounting.TripAllocationUnit <em>Trip Allocation Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TripAllocationUnit
	 * @see Accounting.impl.AccountingPackageImpl#getTripAllocationUnit()
	 * @generated
	 */
	int TRIP_ALLOCATION_UNIT = 191;

	/**
	 * The meta object id for the '{@link Accounting.TripInterruptionProcess <em>Trip Interruption Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TripInterruptionProcess
	 * @see Accounting.impl.AccountingPackageImpl#getTripInterruptionProcess()
	 * @generated
	 */
	int TRIP_INTERRUPTION_PROCESS = 192;

	/**
	 * The meta object id for the '{@link Accounting.TravelValidityType <em>Travel Validity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.TravelValidityType
	 * @see Accounting.impl.AccountingPackageImpl#getTravelValidityType()
	 * @generated
	 */
	int TRAVEL_VALIDITY_TYPE = 193;

	/**
	 * The meta object id for the '{@link Accounting.WeekDay <em>Week Day</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Accounting.WeekDay
	 * @see Accounting.impl.AccountingPackageImpl#getWeekDay()
	 * @generated
	 */
	int WEEK_DAY = 194;

	/**
	 * The meta object id for the '<em>Date As Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see Accounting.impl.AccountingPackageImpl#getDateAsDate()
	 * @generated
	 */
	int DATE_AS_DATE = 195;

	/**
	 * The meta object id for the '<em>Date As Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see Accounting.impl.AccountingPackageImpl#getDateAsDateTime()
	 * @generated
	 */
	int DATE_AS_DATE_TIME = 196;


	/**
	 * Returns the meta object for class '{@link Accounting.AccountingViewerData <em>Viewer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewer Data</em>'.
	 * @see Accounting.AccountingViewerData
	 * @generated
	 */
	EClass getAccountingViewerData();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingViewerData#getCodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Lists</em>'.
	 * @see Accounting.AccountingViewerData#getCodeLists()
	 * @see #getAccountingViewerData()
	 * @generated
	 */
	EReference getAccountingViewerData_CodeLists();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.AccountingViewerData#getFareModells <em>Fare Modells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Modells</em>'.
	 * @see Accounting.AccountingViewerData#getFareModells()
	 * @see #getAccountingViewerData()
	 * @generated
	 */
	EReference getAccountingViewerData_FareModells();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingViewerData#getWorkflowHistory <em>Workflow History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow History</em>'.
	 * @see Accounting.AccountingViewerData#getWorkflowHistory()
	 * @see #getAccountingViewerData()
	 * @generated
	 */
	EReference getAccountingViewerData_WorkflowHistory();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingViewerData#getAccountingFile <em>Accounting File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accounting File</em>'.
	 * @see Accounting.AccountingViewerData#getAccountingFile()
	 * @see #getAccountingViewerData()
	 * @generated
	 */
	EReference getAccountingViewerData_AccountingFile();

	/**
	 * Returns the meta object for class '{@link Accounting.AccountingFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see Accounting.AccountingFile
	 * @generated
	 */
	EClass getAccountingFile();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingFile#getAccountingDelivery <em>Accounting Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accounting Delivery</em>'.
	 * @see Accounting.AccountingFile#getAccountingDelivery()
	 * @see #getAccountingFile()
	 * @generated
	 */
	EReference getAccountingFile_AccountingDelivery();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingFile#getAccountingRecords <em>Accounting Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accounting Records</em>'.
	 * @see Accounting.AccountingFile#getAccountingRecords()
	 * @see #getAccountingFile()
	 * @generated
	 */
	EReference getAccountingFile_AccountingRecords();

	/**
	 * Returns the meta object for class '{@link Accounting.AccountingRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Records</em>'.
	 * @see Accounting.AccountingRecords
	 * @generated
	 */
	EClass getAccountingRecords();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.AccountingRecords#getAccountingRecords <em>Accounting Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounting Records</em>'.
	 * @see Accounting.AccountingRecords#getAccountingRecords()
	 * @see #getAccountingRecords()
	 * @generated
	 */
	EReference getAccountingRecords_AccountingRecords();

	/**
	 * Returns the meta object for class '{@link Accounting.AccountingDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery</em>'.
	 * @see Accounting.AccountingDelivery
	 * @generated
	 */
	EClass getAccountingDelivery();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingDelivery#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.AccountingDelivery#getId()
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	EAttribute getAccountingDelivery_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingDelivery#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see Accounting.AccountingDelivery#getCreationDate()
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	EAttribute getAccountingDelivery_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link Accounting.AccountingDelivery#getInvoicingParty <em>Invoicing Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoicing Party</em>'.
	 * @see Accounting.AccountingDelivery#getInvoicingParty()
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	EReference getAccountingDelivery_InvoicingParty();

	/**
	 * Returns the meta object for the reference '{@link Accounting.AccountingDelivery#getInvoiceRecipient <em>Invoice Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Recipient</em>'.
	 * @see Accounting.AccountingDelivery#getInvoiceRecipient()
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	EReference getAccountingDelivery_InvoiceRecipient();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingDelivery#getStartStatementPeriod <em>Start Statement Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Statement Period</em>'.
	 * @see Accounting.AccountingDelivery#getStartStatementPeriod()
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	EAttribute getAccountingDelivery_StartStatementPeriod();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingDelivery#getEndStatementPeriod <em>End Statement Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Statement Period</em>'.
	 * @see Accounting.AccountingDelivery#getEndStatementPeriod()
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	EAttribute getAccountingDelivery_EndStatementPeriod();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingDelivery#getPaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Type</em>'.
	 * @see Accounting.AccountingDelivery#getPaymentType()
	 * @see #getAccountingDelivery()
	 * @generated
	 */
	EAttribute getAccountingDelivery_PaymentType();

	/**
	 * Returns the meta object for class '{@link Accounting.AccountingRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see Accounting.AccountingRecord
	 * @generated
	 */
	EClass getAccountingRecord();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingRecord#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.AccountingRecord#getId()
	 * @see #getAccountingRecord()
	 * @generated
	 */
	EAttribute getAccountingRecord_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingRecord#getSalesType <em>Sales Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Type</em>'.
	 * @see Accounting.AccountingRecord#getSalesType()
	 * @see #getAccountingRecord()
	 * @generated
	 */
	EAttribute getAccountingRecord_SalesType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingRecord#getAccountingType <em>Accounting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accounting Type</em>'.
	 * @see Accounting.AccountingRecord#getAccountingType()
	 * @see #getAccountingRecord()
	 * @generated
	 */
	EAttribute getAccountingRecord_AccountingType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingRecord#getTransactionStandard <em>Transaction Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Standard</em>'.
	 * @see Accounting.AccountingRecord#getTransactionStandard()
	 * @see #getAccountingRecord()
	 * @generated
	 */
	EAttribute getAccountingRecord_TransactionStandard();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingRecord#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see Accounting.AccountingRecord#getTransaction()
	 * @see #getAccountingRecord()
	 * @generated
	 */
	EReference getAccountingRecord_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingRecord#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see Accounting.AccountingRecord#getSubject()
	 * @see #getAccountingRecord()
	 * @generated
	 */
	EReference getAccountingRecord_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingRecord#getAccountedAmounts <em>Accounted Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accounted Amounts</em>'.
	 * @see Accounting.AccountingRecord#getAccountedAmounts()
	 * @see #getAccountingRecord()
	 * @generated
	 */
	EReference getAccountingRecord_AccountedAmounts();

	/**
	 * Returns the meta object for class '{@link Accounting.AccountedAmounts <em>Accounted Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounted Amounts</em>'.
	 * @see Accounting.AccountedAmounts
	 * @generated
	 */
	EClass getAccountedAmounts();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.AccountedAmounts#getAccountedAmounts <em>Accounted Amounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounted Amounts</em>'.
	 * @see Accounting.AccountedAmounts#getAccountedAmounts()
	 * @see #getAccountedAmounts()
	 * @generated
	 */
	EReference getAccountedAmounts_AccountedAmounts();

	/**
	 * Returns the meta object for class '{@link Accounting.AccountingSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see Accounting.AccountingSubject
	 * @generated
	 */
	EClass getAccountingSubject();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingSubject#getFareId <em>Fare Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Id</em>'.
	 * @see Accounting.AccountingSubject#getFareId()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EAttribute getAccountingSubject_FareId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingSubject#getNumberOfItems <em>Number Of Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Items</em>'.
	 * @see Accounting.AccountingSubject#getNumberOfItems()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EAttribute getAccountingSubject_NumberOfItems();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingSubject#getSalesOfficeId <em>Sales Office Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Office Id</em>'.
	 * @see Accounting.AccountingSubject#getSalesOfficeId()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EAttribute getAccountingSubject_SalesOfficeId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingSubject#getSalesChannel <em>Sales Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Channel</em>'.
	 * @see Accounting.AccountingSubject#getSalesChannel()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EAttribute getAccountingSubject_SalesChannel();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingSubject#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train</em>'.
	 * @see Accounting.AccountingSubject#getTrain()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EAttribute getAccountingSubject_Train();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingSubject#getTravelDate <em>Travel Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Date</em>'.
	 * @see Accounting.AccountingSubject#getTravelDate()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EAttribute getAccountingSubject_TravelDate();

	/**
	 * Returns the meta object for the reference '{@link Accounting.AccountingSubject#getCountryOfSale <em>Country Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country Of Sale</em>'.
	 * @see Accounting.AccountingSubject#getCountryOfSale()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EReference getAccountingSubject_CountryOfSale();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.AccountingSubject#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Carriers</em>'.
	 * @see Accounting.AccountingSubject#getCarriers()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EReference getAccountingSubject_Carriers();

	/**
	 * Returns the meta object for the reference '{@link Accounting.AccountingSubject#getRetailer <em>Retailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retailer</em>'.
	 * @see Accounting.AccountingSubject#getRetailer()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EReference getAccountingSubject_Retailer();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountingSubject#getBilateralTariffIdentifier <em>Bilateral Tariff Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bilateral Tariff Identifier</em>'.
	 * @see Accounting.AccountingSubject#getBilateralTariffIdentifier()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EAttribute getAccountingSubject_BilateralTariffIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AccountingSubject#getLegacyDescription <em>Legacy Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Description</em>'.
	 * @see Accounting.AccountingSubject#getLegacyDescription()
	 * @see #getAccountingSubject()
	 * @generated
	 */
	EReference getAccountingSubject_LegacyDescription();

	/**
	 * Returns the meta object for class '{@link Accounting.LegacyDescription <em>Legacy Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Description</em>'.
	 * @see Accounting.LegacyDescription
	 * @generated
	 */
	EClass getLegacyDescription();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyDescription#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Type</em>'.
	 * @see Accounting.LegacyDescription#getPassengerType()
	 * @see #getLegacyDescription()
	 * @generated
	 */
	EAttribute getLegacyDescription_PassengerType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyDescription#getClassCode <em>Class Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Code</em>'.
	 * @see Accounting.LegacyDescription#getClassCode()
	 * @see #getLegacyDescription()
	 * @generated
	 */
	EAttribute getLegacyDescription_ClassCode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyDescription#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series</em>'.
	 * @see Accounting.LegacyDescription#getSeries()
	 * @see #getLegacyDescription()
	 * @generated
	 */
	EAttribute getLegacyDescription_Series();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyDescription#getTariff <em>Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff</em>'.
	 * @see Accounting.LegacyDescription#getTariff()
	 * @see #getLegacyDescription()
	 * @generated
	 */
	EAttribute getLegacyDescription_Tariff();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyDescription#getDialogNumber <em>Dialog Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialog Number</em>'.
	 * @see Accounting.LegacyDescription#getDialogNumber()
	 * @see #getLegacyDescription()
	 * @generated
	 */
	EAttribute getLegacyDescription_DialogNumber();

	/**
	 * Returns the meta object for class '{@link Accounting.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see Accounting.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Transaction#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see Accounting.Transaction#getTransactionType()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Transaction#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract</em>'.
	 * @see Accounting.Transaction#getContract()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Contract();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Transaction#getBookingId <em>Booking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Id</em>'.
	 * @see Accounting.Transaction#getBookingId()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_BookingId();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.Transaction#getBookingPartIds <em>Booking Part Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Booking Part Ids</em>'.
	 * @see Accounting.Transaction#getBookingPartIds()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_BookingPartIds();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.Transaction#getAccountingReferenceIds <em>Accounting Reference Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accounting Reference Ids</em>'.
	 * @see Accounting.Transaction#getAccountingReferenceIds()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_AccountingReferenceIds();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.Transaction#getTicketIds <em>Ticket Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ticket Ids</em>'.
	 * @see Accounting.Transaction#getTicketIds()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TicketIds();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Transaction#getTicketId <em>Ticket Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket Id</em>'.
	 * @see Accounting.Transaction#getTicketId()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TicketId();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.Transaction#getFulfillmentIds <em>Fulfillment Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fulfillment Ids</em>'.
	 * @see Accounting.Transaction#getFulfillmentIds()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_FulfillmentIds();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Transaction#getExchangebookingId <em>Exchangebooking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchangebooking Id</em>'.
	 * @see Accounting.Transaction#getExchangebookingId()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_ExchangebookingId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Transaction#getTransactionTime <em>Transaction Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Time</em>'.
	 * @see Accounting.Transaction#getTransactionTime()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TransactionTime();

	/**
	 * Returns the meta object for class '{@link Accounting.AccountedAmount <em>Accounted Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounted Amount</em>'.
	 * @see Accounting.AccountedAmount
	 * @generated
	 */
	EClass getAccountedAmount();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountedAmount#getSettlementValueIndicator <em>Settlement Value Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Value Indicator</em>'.
	 * @see Accounting.AccountedAmount#getSettlementValueIndicator()
	 * @see #getAccountedAmount()
	 * @generated
	 */
	EAttribute getAccountedAmount_SettlementValueIndicator();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountedAmount#isGrossAmount <em>Gross Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Amount</em>'.
	 * @see Accounting.AccountedAmount#isGrossAmount()
	 * @see #getAccountedAmount()
	 * @generated
	 */
	EAttribute getAccountedAmount_GrossAmount();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountedAmount#isFee <em>Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fee</em>'.
	 * @see Accounting.AccountedAmount#isFee()
	 * @see #getAccountedAmount()
	 * @generated
	 */
	EAttribute getAccountedAmount_Fee();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountedAmount#isCommission <em>Commission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commission</em>'.
	 * @see Accounting.AccountedAmount#isCommission()
	 * @see #getAccountedAmount()
	 * @generated
	 */
	EAttribute getAccountedAmount_Commission();

	/**
	 * Returns the meta object for the reference '{@link Accounting.AccountedAmount#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency</em>'.
	 * @see Accounting.AccountedAmount#getCurrency()
	 * @see #getAccountedAmount()
	 * @generated
	 */
	EReference getAccountedAmount_Currency();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountedAmount#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Accounting.AccountedAmount#getAmount()
	 * @see #getAccountedAmount()
	 * @generated
	 */
	EAttribute getAccountedAmount_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AccountedAmount#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see Accounting.AccountedAmount#getRate()
	 * @see #getAccountedAmount()
	 * @generated
	 */
	EAttribute getAccountedAmount_Rate();

	/**
	 * Returns the meta object for class '{@link Accounting.CodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Lists</em>'.
	 * @see Accounting.CodeLists
	 * @generated
	 */
	EClass getCodeLists();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.CodeLists#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carriers</em>'.
	 * @see Accounting.CodeLists#getCarriers()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Carriers();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.CodeLists#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stations</em>'.
	 * @see Accounting.CodeLists#getStations()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Stations();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.CodeLists#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Countries</em>'.
	 * @see Accounting.CodeLists#getCountries()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Countries();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.CodeLists#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Languages</em>'.
	 * @see Accounting.CodeLists#getLanguages()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Languages();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.CodeLists#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currencies</em>'.
	 * @see Accounting.CodeLists#getCurrencies()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Currencies();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.CodeLists#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Brands</em>'.
	 * @see Accounting.CodeLists#getServiceBrands()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_ServiceBrands();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.CodeLists#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nuts Codes</em>'.
	 * @see Accounting.CodeLists#getNutsCodes()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Accounting.WorkflowHistory <em>Workflow History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow History</em>'.
	 * @see Accounting.WorkflowHistory
	 * @generated
	 */
	EClass getWorkflowHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.WorkflowHistory#getWorkflowSteps <em>Workflow Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow Steps</em>'.
	 * @see Accounting.WorkflowHistory#getWorkflowSteps()
	 * @see #getWorkflowHistory()
	 * @generated
	 */
	EReference getWorkflowHistory_WorkflowSteps();

	/**
	 * Returns the meta object for class '{@link Accounting.WorkflowStep <em>Workflow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Step</em>'.
	 * @see Accounting.WorkflowStep
	 * @generated
	 */
	EClass getWorkflowStep();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.WorkflowStep#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see Accounting.WorkflowStep#getTime()
	 * @see #getWorkflowStep()
	 * @generated
	 */
	EAttribute getWorkflowStep_Time();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.WorkflowStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Accounting.WorkflowStep#getDescription()
	 * @see #getWorkflowStep()
	 * @generated
	 */
	EAttribute getWorkflowStep_Description();

	/**
	 * Returns the meta object for class '{@link Accounting.NUTSCodes <em>NUTS Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NUTS Codes</em>'.
	 * @see Accounting.NUTSCodes
	 * @generated
	 */
	EClass getNUTSCodes();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.NUTSCodes#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuts Codes</em>'.
	 * @see Accounting.NUTSCodes#getNutsCodes()
	 * @see #getNUTSCodes()
	 * @generated
	 */
	EReference getNUTSCodes_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Accounting.NutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nuts Code</em>'.
	 * @see Accounting.NutsCode
	 * @generated
	 */
	EClass getNutsCode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.NutsCode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.NutsCode#getName()
	 * @see #getNutsCode()
	 * @generated
	 */
	EAttribute getNutsCode_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.NutsCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Accounting.NutsCode#getCode()
	 * @see #getNutsCode()
	 * @generated
	 */
	EAttribute getNutsCode_Code();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Brands</em>'.
	 * @see Accounting.ServiceBrands
	 * @generated
	 */
	EClass getServiceBrands();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ServiceBrands#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Brands</em>'.
	 * @see Accounting.ServiceBrands#getServiceBrands()
	 * @see #getServiceBrands()
	 * @generated
	 */
	EReference getServiceBrands_ServiceBrands();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Brand</em>'.
	 * @see Accounting.ServiceBrand
	 * @generated
	 */
	EClass getServiceBrand();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceBrand#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Accounting.ServiceBrand#getCode()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Code();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceBrand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.ServiceBrand#getName()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceBrand#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see Accounting.ServiceBrand#getAbbreviation()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceBrand#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Accounting.ServiceBrand#getDescription()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Description();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceBrand#getTransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Mode</em>'.
	 * @see Accounting.ServiceBrand#getTransportMode()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_TransportMode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceBrand#getLocalLanguageName <em>Local Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Language Name</em>'.
	 * @see Accounting.ServiceBrand#getLocalLanguageName()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_LocalLanguageName();

	/**
	 * Returns the meta object for class '{@link Accounting.Countries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Countries</em>'.
	 * @see Accounting.Countries
	 * @generated
	 */
	EClass getCountries();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Countries#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see Accounting.Countries#getCountries()
	 * @see #getCountries()
	 * @generated
	 */
	EReference getCountries_Countries();

	/**
	 * Returns the meta object for class '{@link Accounting.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see Accounting.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Country#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Accounting.Country#getCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Code();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Country#getISOcode <em>IS Ocode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IS Ocode</em>'.
	 * @see Accounting.Country#getISOcode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_ISOcode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Country#getDefaultCharacterSet <em>Default Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Character Set</em>'.
	 * @see Accounting.Country#getDefaultCharacterSet()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_DefaultCharacterSet();

	/**
	 * Returns the meta object for class '{@link Accounting.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Languages</em>'.
	 * @see Accounting.Languages
	 * @generated
	 */
	EClass getLanguages();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Languages#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see Accounting.Languages#getLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	EReference getLanguages_Languages();

	/**
	 * Returns the meta object for class '{@link Accounting.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see Accounting.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Language#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Accounting.Language#getCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Code();

	/**
	 * Returns the meta object for class '{@link Accounting.Currencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currencies</em>'.
	 * @see Accounting.Currencies
	 * @generated
	 */
	EClass getCurrencies();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Currencies#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currencies</em>'.
	 * @see Accounting.Currencies#getCurrencies()
	 * @see #getCurrencies()
	 * @generated
	 */
	EReference getCurrencies_Currencies();

	/**
	 * Returns the meta object for class '{@link Accounting.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency</em>'.
	 * @see Accounting.Currency
	 * @generated
	 */
	EClass getCurrency();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Currency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.Currency#getName()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Currency#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see Accounting.Currency#getIsoCode()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_IsoCode();

	/**
	 * Returns the meta object for class '{@link Accounting.Stations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stations</em>'.
	 * @see Accounting.Stations
	 * @generated
	 */
	EClass getStations();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Stations#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Accounting.Stations#getStations()
	 * @see #getStations()
	 * @generated
	 */
	EReference getStations_Stations();

	/**
	 * Returns the meta object for class '{@link Accounting.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see Accounting.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Station#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Accounting.Station#getCountry()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Country();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Accounting.Station#getCode()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Code();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see Accounting.Station#getLongitude()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see Accounting.Station#getLatitude()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getTimetableName <em>Timetable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable Name</em>'.
	 * @see Accounting.Station#getTimetableName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_TimetableName();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#isBorderStation <em>Border Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Station</em>'.
	 * @see Accounting.Station#isBorderStation()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_BorderStation();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getNameCaseUTF8 <em>Name Case UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Case UTF8</em>'.
	 * @see Accounting.Station#getNameCaseUTF8()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NameCaseUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getNameCaseASCII <em>Name Case ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Case ASCII</em>'.
	 * @see Accounting.Station#getNameCaseASCII()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NameCaseASCII();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getShortNameCaseASCII <em>Short Name Case ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name Case ASCII</em>'.
	 * @see Accounting.Station#getShortNameCaseASCII()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_ShortNameCaseASCII();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getShortNameCaseUTF8 <em>Short Name Case UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name Case UTF8</em>'.
	 * @see Accounting.Station#getShortNameCaseUTF8()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_ShortNameCaseUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Border Point Code</em>'.
	 * @see Accounting.Station#getLegacyBorderPointCode()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_LegacyBorderPointCode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Station#getStationCode <em>Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Code</em>'.
	 * @see Accounting.Station#getStationCode()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_StationCode();

	/**
	 * Returns the meta object for class '{@link Accounting.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier</em>'.
	 * @see Accounting.Carrier
	 * @generated
	 */
	EClass getCarrier();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Carrier#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Accounting.Carrier#getCode()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_Code();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Carrier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.Carrier#getName()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Carrier#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see Accounting.Carrier#getShortName()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_ShortName();

	/**
	 * Returns the meta object for class '{@link Accounting.Carriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carriers</em>'.
	 * @see Accounting.Carriers
	 * @generated
	 */
	EClass getCarriers();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Carriers#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carriers</em>'.
	 * @see Accounting.Carriers#getCarriers()
	 * @see #getCarriers()
	 * @generated
	 */
	EReference getCarriers_Carriers();

	/**
	 * Returns the meta object for class '{@link Accounting.StationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Set</em>'.
	 * @see Accounting.StationSet
	 * @generated
	 */
	EClass getStationSet();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.StationSet#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Accounting.StationSet#getStations()
	 * @see #getStationSet()
	 * @generated
	 */
	EReference getStationSet_Stations();

	/**
	 * Returns the meta object for class '{@link Accounting.GeneralTariffModel <em>General Tariff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Tariff Model</em>'.
	 * @see Accounting.GeneralTariffModel
	 * @generated
	 */
	EClass getGeneralTariffModel();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.GeneralTariffModel#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delivery</em>'.
	 * @see Accounting.GeneralTariffModel#getDelivery()
	 * @see #getGeneralTariffModel()
	 * @generated
	 */
	EReference getGeneralTariffModel_Delivery();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.GeneralTariffModel#getFareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Structure</em>'.
	 * @see Accounting.GeneralTariffModel#getFareStructure()
	 * @see #getGeneralTariffModel()
	 * @generated
	 */
	EReference getGeneralTariffModel_FareStructure();

	/**
	 * Returns the meta object for class '{@link Accounting.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery</em>'.
	 * @see Accounting.Delivery
	 * @generated
	 */
	EClass getDelivery();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Delivery#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.Delivery#getId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Delivery#getPreviousDeliveryId <em>Previous Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Delivery Id</em>'.
	 * @see Accounting.Delivery#getPreviousDeliveryId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_PreviousDeliveryId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replaced Delivery Id</em>'.
	 * @see Accounting.Delivery#getReplacedDeliveryId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_ReplacedDeliveryId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Delivery#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see Accounting.Delivery#isOptional()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Optional();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Delivery#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see Accounting.Delivery#getProvider()
	 * @see #getDelivery()
	 * @generated
	 */
	EReference getDelivery_Provider();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Delivery#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see Accounting.Delivery#getSchemaVersion()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Delivery#getAcceptedSchemaVersion <em>Accepted Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Schema Version</em>'.
	 * @see Accounting.Delivery#getAcceptedSchemaVersion()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_AcceptedSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Delivery#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see Accounting.Delivery#getUsage()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Usage();

	/**
	 * Returns the meta object for class '{@link Accounting.AfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Rules</em>'.
	 * @see Accounting.AfterSalesRules
	 * @generated
	 */
	EClass getAfterSalesRules();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.AfterSalesRules#getAfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Sales Rules</em>'.
	 * @see Accounting.AfterSalesRules#getAfterSalesRules()
	 * @see #getAfterSalesRules()
	 * @generated
	 */
	EReference getAfterSalesRules_AfterSalesRules();

	/**
	 * Returns the meta object for class '{@link Accounting.AfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Rule</em>'.
	 * @see Accounting.AfterSalesRule
	 * @generated
	 */
	EClass getAfterSalesRule();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AfterSalesRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.AfterSalesRule#getId()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EAttribute getAfterSalesRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AfterSalesRule#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.AfterSalesRule#getDataSource()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EAttribute getAfterSalesRule_DataSource();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.AfterSalesRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see Accounting.AfterSalesRule#getConditions()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EReference getAfterSalesRule_Conditions();

	/**
	 * Returns the meta object for class '{@link Accounting.AfterSalesCondition <em>After Sales Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Condition</em>'.
	 * @see Accounting.AfterSalesCondition
	 * @generated
	 */
	EClass getAfterSalesCondition();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AfterSalesCondition#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see Accounting.AfterSalesCondition#getTransactionType()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AfterSalesCondition#isIndividualContracts <em>Individual Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Contracts</em>'.
	 * @see Accounting.AfterSalesCondition#isIndividualContracts()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_IndividualContracts();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AfterSalesCondition#isCarrierFee <em>Carrier Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Fee</em>'.
	 * @see Accounting.AfterSalesCondition#isCarrierFee()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_CarrierFee();

	/**
	 * Returns the meta object for the reference '{@link Accounting.AfterSalesCondition#getFee <em>Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fee</em>'.
	 * @see Accounting.AfterSalesCondition#getFee()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EReference getAfterSalesCondition_Fee();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.AfterSalesCondition#getApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Time</em>'.
	 * @see Accounting.AfterSalesCondition#getApplicationTime()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EReference getAfterSalesCondition_ApplicationTime();

	/**
	 * Returns the meta object for class '{@link Accounting.ApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Time</em>'.
	 * @see Accounting.ApplicationTime
	 * @generated
	 */
	EClass getApplicationTime();

	/**
	 * Returns the meta object for class '{@link Accounting.FareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Structure</em>'.
	 * @see Accounting.FareStructure
	 * @generated
	 */
	EClass getFareStructure();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Class Definitions</em>'.
	 * @see Accounting.FareStructure#getServiceClassDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceClassDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Level Definitions</em>'.
	 * @see Accounting.FareStructure#getServiceLevelDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceLevelDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getStationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Names</em>'.
	 * @see Accounting.FareStructure#getStationNames()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_StationNames();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Station Set Definitions</em>'.
	 * @see Accounting.FareStructure#getFareStationSetDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareStationSetDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendars</em>'.
	 * @see Accounting.FareStructure#getCalendars()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Calendars();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texts</em>'.
	 * @see Accounting.FareStructure#getTexts()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Texts();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reduction Cards</em>'.
	 * @see Accounting.FareStructure#getReductionCards()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionCards();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getFareConstraintBundles <em>Fare Constraint Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Constraint Bundles</em>'.
	 * @see Accounting.FareStructure#getFareConstraintBundles()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareConstraintBundles();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getFareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Elements</em>'.
	 * @see Accounting.FareStructure#getFareElements()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareElements();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getCombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combination Constraints</em>'.
	 * @see Accounting.FareStructure#getCombinationConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CombinationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sales Availability Constraints</em>'.
	 * @see Accounting.FareStructure#getSalesAvailabilityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_SalesAvailabilityConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getTravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Travel Validity Constraints</em>'.
	 * @see Accounting.FareStructure#getTravelValidityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_TravelValidityConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getRegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regional Constraints</em>'.
	 * @see Accounting.FareStructure#getRegionalConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_RegionalConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Points</em>'.
	 * @see Accounting.FareStructure#getConnectionPoints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ConnectionPoints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getCarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Constraints</em>'.
	 * @see Accounting.FareStructure#getCarrierConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CarrierConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Constraints</em>'.
	 * @see Accounting.FareStructure#getServiceConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getPassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger Constraints</em>'.
	 * @see Accounting.FareStructure#getPassengerConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PassengerConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getTotalPassengerCombinationConstraints <em>Total Passenger Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Passenger Combination Constraints</em>'.
	 * @see Accounting.FareStructure#getTotalPassengerCombinationConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_TotalPassengerCombinationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reduction Constraints</em>'.
	 * @see Accounting.FareStructure#getReductionConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getPersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personal Data Constraints</em>'.
	 * @see Accounting.FareStructure#getPersonalDataConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PersonalDataConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getAfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After Sales Rules</em>'.
	 * @see Accounting.FareStructure#getAfterSalesRules()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_AfterSalesRules();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prices</em>'.
	 * @see Accounting.FareStructure#getPrices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Prices();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getFulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fulfillment Constraints</em>'.
	 * @see Accounting.FareStructure#getFulfillmentConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FulfillmentConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reservation Parameters</em>'.
	 * @see Accounting.FareStructure#getReservationParameters()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReservationParameters();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getSupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supported Online Services</em>'.
	 * @see Accounting.FareStructure#getSupportedOnlineServices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_SupportedOnlineServices();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getFareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Resource Locations</em>'.
	 * @see Accounting.FareStructure#getFareResourceLocations()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getZoneDefinitions <em>Zone Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zone Definitions</em>'.
	 * @see Accounting.FareStructure#getZoneDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ZoneDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareStructure#getLuggageConstraints <em>Luggage Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Luggage Constraints</em>'.
	 * @see Accounting.FareStructure#getLuggageConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_LuggageConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.ConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Points</em>'.
	 * @see Accounting.ConnectionPoints
	 * @generated
	 */
	EClass getConnectionPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ConnectionPoints#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see Accounting.ConnectionPoints#getConnectionPoints()
	 * @see #getConnectionPoints()
	 * @generated
	 */
	EReference getConnectionPoints_ConnectionPoints();

	/**
	 * Returns the meta object for class '{@link Accounting.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see Accounting.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ConnectionPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.ConnectionPoint#getId()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ConnectionPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.ConnectionPoint#getName()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ConnectionPoint#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Border Point Code</em>'.
	 * @see Accounting.ConnectionPoint#getLegacyBorderPointCode()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_LegacyBorderPointCode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ConnectionPoint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Accounting.ConnectionPoint#getDescription()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ConnectionPoint#getConnectedStationSets <em>Connected Station Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Station Sets</em>'.
	 * @see Accounting.ConnectionPoint#getConnectedStationSets()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_ConnectedStationSets();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ConnectionPoint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.ConnectionPoint#getDataSource()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ConnectionPoint#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Accounting.ConnectionPoint#getNameUtf8()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_NameUtf8();

	/**
	 * Returns the meta object for class '{@link Accounting.FareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Resource Locations</em>'.
	 * @see Accounting.FareResourceLocations
	 * @generated
	 */
	EClass getFareResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train Resource Locations</em>'.
	 * @see Accounting.FareResourceLocations#getTrainResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_TrainResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Resource Locations</em>'.
	 * @see Accounting.FareResourceLocations#getStationResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_StationResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Resource Locations</em>'.
	 * @see Accounting.FareResourceLocations#getCarrierResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_CarrierResourceLocations();

	/**
	 * Returns the meta object for class '{@link Accounting.TrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Resource Locations</em>'.
	 * @see Accounting.TrainResourceLocations
	 * @generated
	 */
	EClass getTrainResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.TrainResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Resource Locations</em>'.
	 * @see Accounting.TrainResourceLocations#getTrainResourceLocations()
	 * @see #getTrainResourceLocations()
	 * @generated
	 */
	EReference getTrainResourceLocations_TrainResourceLocations();

	/**
	 * Returns the meta object for class '{@link Accounting.StationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Resource Locations</em>'.
	 * @see Accounting.StationResourceLocations
	 * @generated
	 */
	EClass getStationResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.StationResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Resource Locations</em>'.
	 * @see Accounting.StationResourceLocations#getStationResourceLocations()
	 * @see #getStationResourceLocations()
	 * @generated
	 */
	EReference getStationResourceLocations_StationResourceLocations();

	/**
	 * Returns the meta object for class '{@link Accounting.CarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Resource Locations</em>'.
	 * @see Accounting.CarrierResourceLocations
	 * @generated
	 */
	EClass getCarrierResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.CarrierResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Resource Locations</em>'.
	 * @see Accounting.CarrierResourceLocations#getCarrierResourceLocations()
	 * @see #getCarrierResourceLocations()
	 * @generated
	 */
	EReference getCarrierResourceLocations_CarrierResourceLocations();

	/**
	 * Returns the meta object for class '{@link Accounting.TrainResourceLocation <em>Train Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Resource Location</em>'.
	 * @see Accounting.TrainResourceLocation
	 * @generated
	 */
	EClass getTrainResourceLocation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.TrainResourceLocation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Accounting.TrainResourceLocation#getCarrier()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EReference getTrainResourceLocation_Carrier();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.TrainResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Accounting.TrainResourceLocation#getOnlineResources()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EReference getTrainResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TrainResourceLocation#getTrainId <em>Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Id</em>'.
	 * @see Accounting.TrainResourceLocation#getTrainId()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EAttribute getTrainResourceLocation_TrainId();

	/**
	 * Returns the meta object for class '{@link Accounting.StationResourceLocation <em>Station Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Resource Location</em>'.
	 * @see Accounting.StationResourceLocation
	 * @generated
	 */
	EClass getStationResourceLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.StationResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Accounting.StationResourceLocation#getOnlineResources()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.StationResourceLocation#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Accounting.StationResourceLocation#getStations()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_Stations();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.StationResourceLocation#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection Points</em>'.
	 * @see Accounting.StationResourceLocation#getConnectionPoints()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_ConnectionPoints();

	/**
	 * Returns the meta object for class '{@link Accounting.CarrierResourceLocation <em>Carrier Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Resource Location</em>'.
	 * @see Accounting.CarrierResourceLocation
	 * @generated
	 */
	EClass getCarrierResourceLocation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.CarrierResourceLocation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Accounting.CarrierResourceLocation#getCarrier()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Accounting.CarrierResourceLocation#getServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Brand</em>'.
	 * @see Accounting.CarrierResourceLocation#getServiceBrand()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_ServiceBrand();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.CarrierResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Accounting.CarrierResourceLocation#getOnlineResources()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for class '{@link Accounting.OnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Resource</em>'.
	 * @see Accounting.OnlineResource
	 * @generated
	 */
	EClass getOnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.OnlineResource#getOfferRequestType <em>Offer Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer Request Type</em>'.
	 * @see Accounting.OnlineResource#getOfferRequestType()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_OfferRequestType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.OnlineResource#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see Accounting.OnlineResource#getInterfaceType()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.OnlineResource#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Accounting.OnlineResource#getVersion()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_Version();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.OnlineResource#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see Accounting.OnlineResource#getSystem()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_System();

	/**
	 * Returns the meta object for class '{@link Accounting.FulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Constraints</em>'.
	 * @see Accounting.FulfillmentConstraints
	 * @generated
	 */
	EClass getFulfillmentConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.FulfillmentConstraints#getFulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillment Constraints</em>'.
	 * @see Accounting.FulfillmentConstraints#getFulfillmentConstraints()
	 * @see #getFulfillmentConstraints()
	 * @generated
	 */
	EReference getFulfillmentConstraints_FulfillmentConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.FulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Constraint</em>'.
	 * @see Accounting.FulfillmentConstraint
	 * @generated
	 */
	EClass getFulfillmentConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FulfillmentConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.FulfillmentConstraint#getId()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_Id();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.FulfillmentConstraint#getAcceptedFulfilmentTypes <em>Accepted Fulfilment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Fulfilment Types</em>'.
	 * @see Accounting.FulfillmentConstraint#getAcceptedFulfilmentTypes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_AcceptedFulfilmentTypes();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.FulfillmentConstraint#getRequiredControlDataExchange <em>Required Control Data Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Control Data Exchange</em>'.
	 * @see Accounting.FulfillmentConstraint#getRequiredControlDataExchange()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_RequiredControlDataExchange();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FulfillmentConstraint#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Ticketing Permitted</em>'.
	 * @see Accounting.FulfillmentConstraint#isIndividualTicketingPermitted()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_IndividualTicketingPermitted();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FulfillmentConstraint#isSeparateFulFillmentRequired <em>Separate Ful Fillment Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separate Ful Fillment Required</em>'.
	 * @see Accounting.FulfillmentConstraint#isSeparateFulFillmentRequired()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_SeparateFulFillmentRequired();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accepted Barcodes</em>'.
	 * @see Accounting.FulfillmentConstraint#getAcceptedBarcodes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EReference getFulfillmentConstraint_AcceptedBarcodes();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FulfillmentConstraint#getRequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Barcodes</em>'.
	 * @see Accounting.FulfillmentConstraint#getRequiredBarcodes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EReference getFulfillmentConstraint_RequiredBarcodes();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FulfillmentConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.FulfillmentConstraint#getDataDescription()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.FulfillmentConstraint#getAcceptedBarcodeTypes <em>Accepted Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Barcode Types</em>'.
	 * @see Accounting.FulfillmentConstraint#getAcceptedBarcodeTypes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_AcceptedBarcodeTypes();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.FulfillmentConstraint#getRequiredBarcodeTypes <em>Required Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Barcode Types</em>'.
	 * @see Accounting.FulfillmentConstraint#getRequiredBarcodeTypes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_RequiredBarcodeTypes();

	/**
	 * Returns the meta object for class '{@link Accounting.RequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Barcodes</em>'.
	 * @see Accounting.RequiredBarcodes
	 * @generated
	 */
	EClass getRequiredBarcodes();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.RequiredBarcodes#getRequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Barcodes</em>'.
	 * @see Accounting.RequiredBarcodes#getRequiredBarcodes()
	 * @see #getRequiredBarcodes()
	 * @generated
	 */
	EAttribute getRequiredBarcodes_RequiredBarcodes();

	/**
	 * Returns the meta object for class '{@link Accounting.AcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accepted Barcodes</em>'.
	 * @see Accounting.AcceptedBarcodes
	 * @generated
	 */
	EClass getAcceptedBarcodes();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.AcceptedBarcodes#getAcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Barcodes</em>'.
	 * @see Accounting.AcceptedBarcodes#getAcceptedBarcodes()
	 * @see #getAcceptedBarcodes()
	 * @generated
	 */
	EAttribute getAcceptedBarcodes_AcceptedBarcodes();

	/**
	 * Returns the meta object for class '{@link Accounting.SupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Online Services</em>'.
	 * @see Accounting.SupportedOnlineServices
	 * @generated
	 */
	EClass getSupportedOnlineServices();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.SupportedOnlineServices#getSupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Online Services</em>'.
	 * @see Accounting.SupportedOnlineServices#getSupportedOnlineServices()
	 * @see #getSupportedOnlineServices()
	 * @generated
	 */
	EAttribute getSupportedOnlineServices_SupportedOnlineServices();

	/**
	 * Returns the meta object for class '{@link Accounting.StationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Names</em>'.
	 * @see Accounting.StationNames
	 * @generated
	 */
	EClass getStationNames();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.StationNames#getStationName <em>Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Station Name</em>'.
	 * @see Accounting.StationNames#getStationName()
	 * @see #getStationNames()
	 * @generated
	 */
	EReference getStationNames_StationName();

	/**
	 * Returns the meta object for class '{@link Accounting.FareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Elements</em>'.
	 * @see Accounting.FareElements
	 * @generated
	 */
	EClass getFareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.FareElements#getFareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Elements</em>'.
	 * @see Accounting.FareElements#getFareElements()
	 * @see #getFareElements()
	 * @generated
	 */
	EReference getFareElements_FareElements();

	/**
	 * Returns the meta object for class '{@link Accounting.FareElement <em>Fare Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Element</em>'.
	 * @see Accounting.FareElement
	 * @generated
	 */
	EClass getFareElement();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.FareElement#getId()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Accounting.FareElement#getType()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareElement#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.FareElement#getDataDescription()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getFareConstraintBundle <em>Fare Constraint Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Constraint Bundle</em>'.
	 * @see Accounting.FareElement#getFareConstraintBundle()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FareConstraintBundle();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Accounting.FareElement#getText()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_Text();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see Accounting.FareElement#getPrice()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_Price();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getRegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regional Constraint</em>'.
	 * @see Accounting.FareElement#getRegionalConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_RegionalConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Accounting.FareElement#getServiceConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Accounting.FareElement#getCarrierConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Class</em>'.
	 * @see Accounting.FareElement#getServiceClass()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceClass();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Level</em>'.
	 * @see Accounting.FareElement#getServiceLevel()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceLevel();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getSalesAvailability <em>Sales Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Availability</em>'.
	 * @see Accounting.FareElement#getSalesAvailability()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_SalesAvailability();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getTravelValidity <em>Travel Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Validity</em>'.
	 * @see Accounting.FareElement#getTravelValidity()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_TravelValidity();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getCombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combination Constraint</em>'.
	 * @see Accounting.FareElement#getCombinationConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_CombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getFareDetailDescription <em>Fare Detail Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Detail Description</em>'.
	 * @see Accounting.FareElement#getFareDetailDescription()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FareDetailDescription();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getPersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Data Constraint</em>'.
	 * @see Accounting.FareElement#getPersonalDataConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_PersonalDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Accounting.FareElement#getReservationParameter()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ReservationParameter();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reduction Constraint</em>'.
	 * @see Accounting.FareElement#getReductionConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ReductionConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfillment Constraint</em>'.
	 * @see Accounting.FareElement#getFulfillmentConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FulfillmentConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Accounting.FareElement#getPassengerConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_PassengerConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.FareElement#getRegulatoryConditions <em>Regulatory Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Regulatory Conditions</em>'.
	 * @see Accounting.FareElement#getRegulatoryConditions()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_RegulatoryConditions();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getAfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Sales Rule</em>'.
	 * @see Accounting.FareElement#getAfterSalesRule()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_AfterSalesRule();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareElement#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.FareElement#getDataSource()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_DataSource();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.FareElement#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Accounting Identifier</em>'.
	 * @see Accounting.FareElement#getLegacyAccountingIdentifier()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_LegacyAccountingIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareElement#getLegacyConversion <em>Legacy Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Conversion</em>'.
	 * @see Accounting.FareElement#getLegacyConversion()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_LegacyConversion();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareElement#isIndividualContracts <em>Individual Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Contracts</em>'.
	 * @see Accounting.FareElement#isIndividualContracts()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_IndividualContracts();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.FareElement#getInvolvedTcos <em>Involved Tcos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Tcos</em>'.
	 * @see Accounting.FareElement#getInvolvedTcos()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_InvolvedTcos();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareElement#getLuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Luggage Constraint</em>'.
	 * @see Accounting.FareElement#getLuggageConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_LuggageConstraint();

	/**
	 * Returns the meta object for class '{@link Accounting.TotalPassengerCombinationConstraints <em>Total Passenger Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Passenger Combination Constraints</em>'.
	 * @see Accounting.TotalPassengerCombinationConstraints
	 * @generated
	 */
	EClass getTotalPassengerCombinationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.TotalPassengerCombinationConstraints#getTotalPassengerCombinationConstraint <em>Total Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Total Passenger Combination Constraint</em>'.
	 * @see Accounting.TotalPassengerCombinationConstraints#getTotalPassengerCombinationConstraint()
	 * @see #getTotalPassengerCombinationConstraints()
	 * @generated
	 */
	EReference getTotalPassengerCombinationConstraints_TotalPassengerCombinationConstraint();

	/**
	 * Returns the meta object for class '{@link Accounting.TotalPassengerCombinationConstraint <em>Total Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Passenger Combination Constraint</em>'.
	 * @see Accounting.TotalPassengerCombinationConstraint
	 * @generated
	 */
	EClass getTotalPassengerCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TotalPassengerCombinationConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.TotalPassengerCombinationConstraint#getId()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TotalPassengerCombinationConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.TotalPassengerCombinationConstraint#getDataDescription()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TotalPassengerCombinationConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total Passenger Weight</em>'.
	 * @see Accounting.TotalPassengerCombinationConstraint#getMaxTotalPassengerWeight()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_MaxTotalPassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TotalPassengerCombinationConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Total Passenger Weight</em>'.
	 * @see Accounting.TotalPassengerCombinationConstraint#getMinTotalPassengerWeight()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_MinTotalPassengerWeight();

	/**
	 * Returns the meta object for class '{@link Accounting.FareConstraintBundles <em>Fare Constraint Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Constraint Bundles</em>'.
	 * @see Accounting.FareConstraintBundles
	 * @generated
	 */
	EClass getFareConstraintBundles();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.FareConstraintBundles#getFareConstraintBundles <em>Fare Constraint Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Constraint Bundles</em>'.
	 * @see Accounting.FareConstraintBundles#getFareConstraintBundles()
	 * @see #getFareConstraintBundles()
	 * @generated
	 */
	EReference getFareConstraintBundles_FareConstraintBundles();

	/**
	 * Returns the meta object for class '{@link Accounting.FareConstraintBundle <em>Fare Constraint Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Constraint Bundle</em>'.
	 * @see Accounting.FareConstraintBundle
	 * @generated
	 */
	EClass getFareConstraintBundle();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareConstraintBundle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.FareConstraintBundle#getId()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareConstraintBundle#getDefaultFareType <em>Default Fare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Fare Type</em>'.
	 * @see Accounting.FareConstraintBundle#getDefaultFareType()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DefaultFareType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareConstraintBundle#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.FareConstraintBundle#getDataDescription()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Accounting.FareConstraintBundle#getCarrierConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getSalesAvailability <em>Sales Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Availability</em>'.
	 * @see Accounting.FareConstraintBundle#getSalesAvailability()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_SalesAvailability();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getTravelValidity <em>Travel Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Validity</em>'.
	 * @see Accounting.FareConstraintBundle#getTravelValidity()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_TravelValidity();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getCombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combination Constraint</em>'.
	 * @see Accounting.FareConstraintBundle#getCombinationConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_CombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getPersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Data Constraint</em>'.
	 * @see Accounting.FareConstraintBundle#getPersonalDataConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_PersonalDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfillment Constraint</em>'.
	 * @see Accounting.FareConstraintBundle#getFulfillmentConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_FulfillmentConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getTotalPassengerConstraint <em>Total Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Total Passenger Constraint</em>'.
	 * @see Accounting.FareConstraintBundle#getTotalPassengerConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_TotalPassengerConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.FareConstraintBundle#getDefaultRegulatoryConditions <em>Default Regulatory Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Regulatory Conditions</em>'.
	 * @see Accounting.FareConstraintBundle#getDefaultRegulatoryConditions()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DefaultRegulatoryConditions();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareConstraintBundle#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.FareConstraintBundle#getDataSource()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DataSource();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.FareConstraintBundle#getConvertedBundles <em>Converted Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Converted Bundles</em>'.
	 * @see Accounting.FareConstraintBundle#getConvertedBundles()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_ConvertedBundles();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareConstraintBundle#getLuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Luggage Constraint</em>'.
	 * @see Accounting.FareConstraintBundle#getLuggageConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_LuggageConstraint();

	/**
	 * Returns the meta object for class '{@link Accounting.FareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Station Set Definitions</em>'.
	 * @see Accounting.FareStationSetDefinitions
	 * @generated
	 */
	EClass getFareStationSetDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.FareStationSetDefinitions#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Station Set Definitions</em>'.
	 * @see Accounting.FareStationSetDefinitions#getFareStationSetDefinitions()
	 * @see #getFareStationSetDefinitions()
	 * @generated
	 */
	EReference getFareStationSetDefinitions_FareStationSetDefinitions();

	/**
	 * Returns the meta object for the '{@link Accounting.FareStationSetDefinitions#findFareSet(Accounting.Carrier, int) <em>Find Fare Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Fare Set</em>' operation.
	 * @see Accounting.FareStationSetDefinitions#findFareSet(Accounting.Carrier, int)
	 * @generated
	 */
	EOperation getFareStationSetDefinitions__FindFareSet__Carrier_int();

	/**
	 * Returns the meta object for class '{@link Accounting.FareStationSetDefinition <em>Fare Station Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Station Set Definition</em>'.
	 * @see Accounting.FareStationSetDefinition
	 * @generated
	 */
	EClass getFareStationSetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareStationSetDefinition#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.FareStationSetDefinition#getDataSource()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_DataSource();

	/**
	 * Returns the meta object for the reference '{@link Accounting.FareStationSetDefinition#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Accounting.FareStationSetDefinition#getCarrier()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EReference getFareStationSetDefinition_Carrier();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareStationSetDefinition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Accounting.FareStationSetDefinition#getCode()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Code();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareStationSetDefinition#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Accounting.FareStationSetDefinition#getLegacyCode()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_LegacyCode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareStationSetDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.FareStationSetDefinition#getId()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareStationSetDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.FareStationSetDefinition#getName()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareStationSetDefinition#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Accounting.FareStationSetDefinition#getNameUtf8()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_NameUtf8();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.FareStationSetDefinition#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Accounting.FareStationSetDefinition#getStations()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EReference getFareStationSetDefinition_Stations();

	/**
	 * Returns the meta object for class '{@link Accounting.LegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Accounting Identifier</em>'.
	 * @see Accounting.LegacyAccountingIdentifier
	 * @generated
	 */
	EClass getLegacyAccountingIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyAccountingIdentifier#getSeriesId <em>Series Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Id</em>'.
	 * @see Accounting.LegacyAccountingIdentifier#getSeriesId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_SeriesId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyAccountingIdentifier#getTariffId <em>Tariff Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff Id</em>'.
	 * @see Accounting.LegacyAccountingIdentifier#getTariffId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_TariffId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LegacyAccountingIdentifier#getAddSeriesId <em>Add Series Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Series Id</em>'.
	 * @see Accounting.LegacyAccountingIdentifier#getAddSeriesId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_AddSeriesId();

	/**
	 * Returns the meta object for class '{@link Accounting.PersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data Constraints</em>'.
	 * @see Accounting.PersonalDataConstraints
	 * @generated
	 */
	EClass getPersonalDataConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.PersonalDataConstraints#getPersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personal Data Constraints</em>'.
	 * @see Accounting.PersonalDataConstraints#getPersonalDataConstraints()
	 * @see #getPersonalDataConstraints()
	 * @generated
	 */
	EReference getPersonalDataConstraints_PersonalDataConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.PersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data Constraint</em>'.
	 * @see Accounting.PersonalDataConstraint
	 * @generated
	 */
	EClass getPersonalDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PersonalDataConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.PersonalDataConstraint#getId()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EAttribute getPersonalDataConstraint_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.PersonalDataConstraint#getRequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Personal Data</em>'.
	 * @see Accounting.PersonalDataConstraint#getRequiredPersonalData()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EReference getPersonalDataConstraint_RequiredPersonalData();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.PersonalDataConstraint#getAllowedChanges <em>Allowed Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Changes</em>'.
	 * @see Accounting.PersonalDataConstraint#getAllowedChanges()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EReference getPersonalDataConstraint_AllowedChanges();

	/**
	 * Returns the meta object for class '{@link Accounting.RequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Personal Data</em>'.
	 * @see Accounting.RequiredPersonalData
	 * @generated
	 */
	EClass getRequiredPersonalData();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RequiredPersonalData#isTicketHolderOnly <em>Ticket Holder Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket Holder Only</em>'.
	 * @see Accounting.RequiredPersonalData#isTicketHolderOnly()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_TicketHolderOnly();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RequiredPersonalData#getDataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Item</em>'.
	 * @see Accounting.RequiredPersonalData#getDataItem()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_DataItem();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.RequiredPersonalData#getTransfer <em>Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transfer</em>'.
	 * @see Accounting.RequiredPersonalData#getTransfer()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_Transfer();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.RequiredPersonalData#getFulfillmentType <em>Fulfillment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fulfillment Type</em>'.
	 * @see Accounting.RequiredPersonalData#getFulfillmentType()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_FulfillmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.RequiredPersonalData#getCrossBorder <em>Cross Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross Border</em>'.
	 * @see Accounting.RequiredPersonalData#getCrossBorder()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EReference getRequiredPersonalData_CrossBorder();

	/**
	 * Returns the meta object for class '{@link Accounting.AllowedPersonalDataChanges <em>Allowed Personal Data Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Personal Data Changes</em>'.
	 * @see Accounting.AllowedPersonalDataChanges
	 * @generated
	 */
	EClass getAllowedPersonalDataChanges();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AllowedPersonalDataChanges#getTimeLimit <em>Time Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit</em>'.
	 * @see Accounting.AllowedPersonalDataChanges#getTimeLimit()
	 * @see #getAllowedPersonalDataChanges()
	 * @generated
	 */
	EAttribute getAllowedPersonalDataChanges_TimeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AllowedPersonalDataChanges#getAcceptedReason <em>Accepted Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Reason</em>'.
	 * @see Accounting.AllowedPersonalDataChanges#getAcceptedReason()
	 * @see #getAllowedPersonalDataChanges()
	 * @generated
	 */
	EAttribute getAllowedPersonalDataChanges_AcceptedReason();

	/**
	 * Returns the meta object for class '{@link Accounting.PassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Constraints</em>'.
	 * @see Accounting.PassengerConstraints
	 * @generated
	 */
	EClass getPassengerConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.PassengerConstraints#getPassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passenger Constraints</em>'.
	 * @see Accounting.PassengerConstraints#getPassengerConstraints()
	 * @see #getPassengerConstraints()
	 * @generated
	 */
	EReference getPassengerConstraints_PassengerConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.PassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Constraint</em>'.
	 * @see Accounting.PassengerConstraint
	 * @generated
	 */
	EClass getPassengerConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.PassengerConstraint#getId()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getTravelerType <em>Traveler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traveler Type</em>'.
	 * @see Accounting.PassengerConstraint#getTravelerType()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_TravelerType();

	/**
	 * Returns the meta object for the reference '{@link Accounting.PassengerConstraint#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Accounting.PassengerConstraint#getText()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_Text();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getUpperAgeLimit <em>Upper Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Age Limit</em>'.
	 * @see Accounting.PassengerConstraint#getUpperAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_UpperAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getLowerAgeLimit <em>Lower Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Age Limit</em>'.
	 * @see Accounting.PassengerConstraint#getLowerAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_LowerAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getTravelAloneAgeLimit <em>Travel Alone Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Alone Age Limit</em>'.
	 * @see Accounting.PassengerConstraint#getTravelAloneAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_TravelAloneAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getReservationAgeLimit <em>Reservation Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Age Limit</em>'.
	 * @see Accounting.PassengerConstraint#getReservationAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_ReservationAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#isIsAncilliary <em>Is Ancilliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ancilliary</em>'.
	 * @see Accounting.PassengerConstraint#isIsAncilliary()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_IsAncilliary();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getPassengerWeight <em>Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight</em>'.
	 * @see Accounting.PassengerConstraint#getPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_PassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total Passenger Weight</em>'.
	 * @see Accounting.PassengerConstraint#getMaxTotalPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_MaxTotalPassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Total Passenger Weight</em>'.
	 * @see Accounting.PassengerConstraint#getMinTotalPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_MinTotalPassengerWeight();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.PassengerConstraint#getIncludedFreePassengers <em>Included Free Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Free Passengers</em>'.
	 * @see Accounting.PassengerConstraint#getIncludedFreePassengers()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_IncludedFreePassengers();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.PassengerConstraint#getExcludedPassengerCombinations <em>Excluded Passenger Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excluded Passenger Combinations</em>'.
	 * @see Accounting.PassengerConstraint#getExcludedPassengerCombinations()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_ExcludedPassengerCombinations();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.PassengerConstraint#getDataDescription()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.PassengerConstraint#getDataSource()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_DataSource();

	/**
	 * Returns the meta object for class '{@link Accounting.PassengerCombinationConstraint <em>Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Combination Constraint</em>'.
	 * @see Accounting.PassengerCombinationConstraint
	 * @generated
	 */
	EClass getPassengerCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerCombinationConstraint#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see Accounting.PassengerCombinationConstraint#getMaxNumber()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_MaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerCombinationConstraint#getMinNumber <em>Min Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Number</em>'.
	 * @see Accounting.PassengerCombinationConstraint#getMinNumber()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_MinNumber();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Type</em>'.
	 * @see Accounting.PassengerCombinationConstraint#getPassengerType()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_PassengerType();

	/**
	 * Returns the meta object for the reference '{@link Accounting.PassengerCombinationConstraint#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Accounting.PassengerCombinationConstraint#getPassengerConstraint()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EReference getPassengerCombinationConstraint_PassengerConstraint();

	/**
	 * Returns the meta object for class '{@link Accounting.IncludedFreePassengerLimit <em>Included Free Passenger Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Free Passenger Limit</em>'.
	 * @see Accounting.IncludedFreePassengerLimit
	 * @generated
	 */
	EClass getIncludedFreePassengerLimit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.IncludedFreePassengerLimit#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Accounting.IncludedFreePassengerLimit#getNumber()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EAttribute getIncludedFreePassengerLimit_Number();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.IncludedFreePassengerLimit#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Type</em>'.
	 * @see Accounting.IncludedFreePassengerLimit#getPassengerType()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EAttribute getIncludedFreePassengerLimit_PassengerType();

	/**
	 * Returns the meta object for the reference '{@link Accounting.IncludedFreePassengerLimit#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Accounting.IncludedFreePassengerLimit#getPassengerConstraint()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EReference getIncludedFreePassengerLimit_PassengerConstraint();

	/**
	 * Returns the meta object for class '{@link Accounting.CombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Constraints</em>'.
	 * @see Accounting.CombinationConstraints
	 * @generated
	 */
	EClass getCombinationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.CombinationConstraints#getCombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination Constraints</em>'.
	 * @see Accounting.CombinationConstraints#getCombinationConstraints()
	 * @see #getCombinationConstraints()
	 * @generated
	 */
	EReference getCombinationConstraints_CombinationConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.CombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Constraint</em>'.
	 * @see Accounting.CombinationConstraint
	 * @generated
	 */
	EClass getCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.CombinationConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.CombinationConstraint#getId()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EAttribute getCombinationConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.CombinationConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.CombinationConstraint#getDataDescription()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EAttribute getCombinationConstraint_DataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.CombinationConstraint#getCombinationModels <em>Combination Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination Models</em>'.
	 * @see Accounting.CombinationConstraint#getCombinationModels()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EReference getCombinationConstraint_CombinationModels();

	/**
	 * Returns the meta object for class '{@link Accounting.TravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Validity Constraints</em>'.
	 * @see Accounting.TravelValidityConstraints
	 * @generated
	 */
	EClass getTravelValidityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.TravelValidityConstraints#getTravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travel Validity Constraints</em>'.
	 * @see Accounting.TravelValidityConstraints#getTravelValidityConstraints()
	 * @see #getTravelValidityConstraints()
	 * @generated
	 */
	EReference getTravelValidityConstraints_TravelValidityConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.TravelValidityConstraint <em>Travel Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Validity Constraint</em>'.
	 * @see Accounting.TravelValidityConstraint
	 * @generated
	 */
	EClass getTravelValidityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TravelValidityConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.TravelValidityConstraint#getId()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TravelValidityConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.TravelValidityConstraint#getDataDescription()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Accounting.TravelValidityConstraint#getValidDays <em>Valid Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Days</em>'.
	 * @see Accounting.TravelValidityConstraint#getValidDays()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ValidDays();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TravelValidityConstraint#getTravelDays <em>Travel Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Days</em>'.
	 * @see Accounting.TravelValidityConstraint#getTravelDays()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_TravelDays();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.TravelValidityConstraint#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Accounting.TravelValidityConstraint#getRange()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_Range();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.TravelValidityConstraint#getReturnConstraint <em>Return Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Constraint</em>'.
	 * @see Accounting.TravelValidityConstraint#getReturnConstraint()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ReturnConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.TravelValidityConstraint#getExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excluded Time Range</em>'.
	 * @see Accounting.TravelValidityConstraint#getExcludedTimeRange()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ExcludedTimeRange();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.TravelValidityConstraint#getTrainValidity <em>Train Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train Validity</em>'.
	 * @see Accounting.TravelValidityConstraint#getTrainValidity()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_TrainValidity();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TravelValidityConstraint#getValidityType <em>Validity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity Type</em>'.
	 * @see Accounting.TravelValidityConstraint#getValidityType()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_ValidityType();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.TravelValidityConstraint#getTripInterruptionConstraint <em>Trip Interruption Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Interruption Constraint</em>'.
	 * @see Accounting.TravelValidityConstraint#getTripInterruptionConstraint()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_TripInterruptionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.TravelValidityConstraint#getTripAllocationConstraint <em>Trip Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Allocation Constraint</em>'.
	 * @see Accounting.TravelValidityConstraint#getTripAllocationConstraint()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_TripAllocationConstraint();

	/**
	 * Returns the meta object for class '{@link Accounting.TrainValidity <em>Train Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Validity</em>'.
	 * @see Accounting.TrainValidity
	 * @generated
	 */
	EClass getTrainValidity();

	/**
	 * Returns the meta object for the reference '{@link Accounting.TrainValidity#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Accounting.TrainValidity#getCarrierConstraint()
	 * @see #getTrainValidity()
	 * @generated
	 */
	EReference getTrainValidity_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.TrainValidity#getSerrviceConstraint <em>Serrvice Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serrvice Constraint</em>'.
	 * @see Accounting.TrainValidity#getSerrviceConstraint()
	 * @see #getTrainValidity()
	 * @generated
	 */
	EReference getTrainValidity_SerrviceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TrainValidity#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Accounting.TrainValidity#getScope()
	 * @see #getTrainValidity()
	 * @generated
	 */
	EAttribute getTrainValidity_Scope();

	/**
	 * Returns the meta object for class '{@link Accounting.SalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Availability Constraints</em>'.
	 * @see Accounting.SalesAvailabilityConstraints
	 * @generated
	 */
	EClass getSalesAvailabilityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.SalesAvailabilityConstraints#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sales Availability Constraints</em>'.
	 * @see Accounting.SalesAvailabilityConstraints#getSalesAvailabilityConstraints()
	 * @see #getSalesAvailabilityConstraints()
	 * @generated
	 */
	EReference getSalesAvailabilityConstraints_SalesAvailabilityConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.SalesAvailabilityConstraint <em>Sales Availability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Availability Constraint</em>'.
	 * @see Accounting.SalesAvailabilityConstraint
	 * @generated
	 */
	EClass getSalesAvailabilityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.SalesAvailabilityConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.SalesAvailabilityConstraint#getId()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.SalesAvailabilityConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.SalesAvailabilityConstraint#getDataDescription()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_DataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.SalesAvailabilityConstraint#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see Accounting.SalesAvailabilityConstraint#getRestrictions()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EReference getSalesAvailabilityConstraint_Restrictions();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.SalesAvailabilityConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.SalesAvailabilityConstraint#getDataSource()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_DataSource();

	/**
	 * Returns the meta object for class '{@link Accounting.SalesRestriction <em>Sales Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Restriction</em>'.
	 * @see Accounting.SalesRestriction
	 * @generated
	 */
	EClass getSalesRestriction();

	/**
	 * Returns the meta object for the reference '{@link Accounting.SalesRestriction#getSalesDates <em>Sales Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Dates</em>'.
	 * @see Accounting.SalesRestriction#getSalesDates()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_SalesDates();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.SalesRestriction#getStartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Of Sale</em>'.
	 * @see Accounting.SalesRestriction#getStartOfSale()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_StartOfSale();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.SalesRestriction#getEndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Of Sale</em>'.
	 * @see Accounting.SalesRestriction#getEndOfSale()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_EndOfSale();

	/**
	 * Returns the meta object for class '{@link Accounting.EndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Of Sale</em>'.
	 * @see Accounting.EndOfSale
	 * @generated
	 */
	EClass getEndOfSale();

	/**
	 * Returns the meta object for class '{@link Accounting.StartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Of Sale</em>'.
	 * @see Accounting.StartOfSale
	 * @generated
	 */
	EClass getStartOfSale();

	/**
	 * Returns the meta object for class '{@link Accounting.CarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Constraints</em>'.
	 * @see Accounting.CarrierConstraints
	 * @generated
	 */
	EClass getCarrierConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.CarrierConstraints#getCarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Constraints</em>'.
	 * @see Accounting.CarrierConstraints#getCarrierConstraints()
	 * @see #getCarrierConstraints()
	 * @generated
	 */
	EReference getCarrierConstraints_CarrierConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.CarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Constraint</em>'.
	 * @see Accounting.CarrierConstraint
	 * @generated
	 */
	EClass getCarrierConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.CarrierConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.CarrierConstraint#getId()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_Id();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.CarrierConstraint#getIncludedCarriers <em>Included Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Carriers</em>'.
	 * @see Accounting.CarrierConstraint#getIncludedCarriers()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EReference getCarrierConstraint_IncludedCarriers();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.CarrierConstraint#getExcludedCarriers <em>Excluded Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Carriers</em>'.
	 * @see Accounting.CarrierConstraint#getExcludedCarriers()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EReference getCarrierConstraint_ExcludedCarriers();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.CarrierConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.CarrierConstraint#getDataDescription()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.CarrierConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.CarrierConstraint#getDataSource()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_DataSource();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Constraints</em>'.
	 * @see Accounting.ServiceConstraints
	 * @generated
	 */
	EClass getServiceConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ServiceConstraints#getServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Constraints</em>'.
	 * @see Accounting.ServiceConstraints#getServiceConstraints()
	 * @see #getServiceConstraints()
	 * @generated
	 */
	EReference getServiceConstraints_ServiceConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Constraint</em>'.
	 * @see Accounting.ServiceConstraint
	 * @generated
	 */
	EClass getServiceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.ServiceConstraint#getId()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EAttribute getServiceConstraint_Id();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ServiceConstraint#getIncludedServiceBrands <em>Included Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Service Brands</em>'.
	 * @see Accounting.ServiceConstraint#getIncludedServiceBrands()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_IncludedServiceBrands();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ServiceConstraint#getExcludedServiceBrands <em>Excluded Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Service Brands</em>'.
	 * @see Accounting.ServiceConstraint#getExcludedServiceBrands()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_ExcludedServiceBrands();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.ServiceConstraint#getDataDescription()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EAttribute getServiceConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceConstraint#getLegacy108Code <em>Legacy108 Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy108 Code</em>'.
	 * @see Accounting.ServiceConstraint#getLegacy108Code()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EAttribute getServiceConstraint_Legacy108Code();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ServiceConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see Accounting.ServiceConstraint#getDescription()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_Description();

	/**
	 * Returns the meta object for class '{@link Accounting.RegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Constraints</em>'.
	 * @see Accounting.RegionalConstraints
	 * @generated
	 */
	EClass getRegionalConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.RegionalConstraints#getRegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regional Constraints</em>'.
	 * @see Accounting.RegionalConstraints#getRegionalConstraints()
	 * @see #getRegionalConstraints()
	 * @generated
	 */
	EReference getRegionalConstraints_RegionalConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.RegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Constraint</em>'.
	 * @see Accounting.RegionalConstraint
	 * @generated
	 */
	EClass getRegionalConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RegionalConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.RegionalConstraint#getId()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RegionalConstraint#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see Accounting.RegionalConstraint#getDistance()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_Distance();

	/**
	 * Returns the meta object for the reference '{@link Accounting.RegionalConstraint#getEntryConnectionPoint <em>Entry Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Connection Point</em>'.
	 * @see Accounting.RegionalConstraint#getEntryConnectionPoint()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_EntryConnectionPoint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.RegionalConstraint#getExitConnectionPoint <em>Exit Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit Connection Point</em>'.
	 * @see Accounting.RegionalConstraint#getExitConnectionPoint()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_ExitConnectionPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.RegionalConstraint#getRegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regional Validity</em>'.
	 * @see Accounting.RegionalConstraint#getRegionalValidity()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_RegionalValidity();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RegionalConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.RegionalConstraint#getDataSource()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RegionalConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.RegionalConstraint#getDataDescription()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_DataDescription();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.RegionalConstraint#getLinkedFares <em>Linked Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Fares</em>'.
	 * @see Accounting.RegionalConstraint#getLinkedFares()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_LinkedFares();

	/**
	 * Returns the meta object for class '{@link Accounting.RegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Validity</em>'.
	 * @see Accounting.RegionalValidity
	 * @generated
	 */
	EClass getRegionalValidity();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RegionalValidity#getSeqNb <em>Seq Nb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Nb</em>'.
	 * @see Accounting.RegionalValidity#getSeqNb()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EAttribute getRegionalValidity_SeqNb();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.RegionalValidity#getViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via Station</em>'.
	 * @see Accounting.RegionalValidity#getViaStation()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_ViaStation();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.RegionalValidity#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zone</em>'.
	 * @see Accounting.RegionalValidity#getZone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Zone();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.RegionalValidity#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see Accounting.RegionalValidity#getLine()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Line();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.RegionalValidity#getPolygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygone</em>'.
	 * @see Accounting.RegionalValidity#getPolygone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Polygone();

	/**
	 * Returns the meta object for the reference '{@link Accounting.RegionalValidity#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Accounting.RegionalValidity#getCarrierConstraint()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.RegionalValidity#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Accounting.RegionalValidity#getServiceConstraint()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_ServiceConstraint();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Definitions</em>'.
	 * @see Accounting.ServiceLevelDefinitions
	 * @generated
	 */
	EClass getServiceLevelDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ServiceLevelDefinitions#getServiceLevelDefinition <em>Service Level Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Level Definition</em>'.
	 * @see Accounting.ServiceLevelDefinitions#getServiceLevelDefinition()
	 * @see #getServiceLevelDefinitions()
	 * @generated
	 */
	EReference getServiceLevelDefinitions_ServiceLevelDefinition();

	/**
	 * Returns the meta object for class '{@link Accounting.Texts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texts</em>'.
	 * @see Accounting.Texts
	 * @generated
	 */
	EClass getTexts();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Texts#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see Accounting.Texts#getTexts()
	 * @see #getTexts()
	 * @generated
	 */
	EReference getTexts_Texts();

	/**
	 * Returns the meta object for class '{@link Accounting.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see Accounting.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Text#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.Text#getId()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Text#getTextUTF8 <em>Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UTF8</em>'.
	 * @see Accounting.Text#getTextUTF8()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Text#getTextICAO <em>Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ICAO</em>'.
	 * @see Accounting.Text#getTextICAO()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextICAO();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Text#getShortTextUTF8 <em>Short Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text UTF8</em>'.
	 * @see Accounting.Text#getShortTextUTF8()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ShortTextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Text#getShortTextICAO <em>Short Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text ICAO</em>'.
	 * @see Accounting.Text#getShortTextICAO()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ShortTextICAO();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Text#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see Accounting.Text#getTranslations()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Translations();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Text#isStandardText <em>Standard Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Text</em>'.
	 * @see Accounting.Text#isStandardText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_StandardText();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Text#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.Text#getDataSource()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_DataSource();

	/**
	 * Returns the meta object for class '{@link Accounting.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see Accounting.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Translation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see Accounting.Translation#getLanguage()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Language();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Translation#getTextUTF8 <em>Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UTF8</em>'.
	 * @see Accounting.Translation#getTextUTF8()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_TextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Translation#getTextICAO <em>Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ICAO</em>'.
	 * @see Accounting.Translation#getTextICAO()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_TextICAO();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Translation#getShortTextUTF8 <em>Short Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text UTF8</em>'.
	 * @see Accounting.Translation#getShortTextUTF8()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_ShortTextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Translation#getShortTextICAO <em>Short Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text ICAO</em>'.
	 * @see Accounting.Translation#getShortTextICAO()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_ShortTextICAO();

	/**
	 * Returns the meta object for class '{@link Accounting.Prices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prices</em>'.
	 * @see Accounting.Prices
	 * @generated
	 */
	EClass getPrices();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Prices#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prices</em>'.
	 * @see Accounting.Prices#getPrices()
	 * @see #getPrices()
	 * @generated
	 */
	EReference getPrices_Prices();

	/**
	 * Returns the meta object for class '{@link Accounting.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price</em>'.
	 * @see Accounting.Price
	 * @generated
	 */
	EClass getPrice();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Price#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.Price#getId()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Price#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currencies</em>'.
	 * @see Accounting.Price#getCurrencies()
	 * @see #getPrice()
	 * @generated
	 */
	EReference getPrice_Currencies();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Price#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.Price#getDataSource()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_DataSource();

	/**
	 * Returns the meta object for class '{@link Accounting.VATDetail <em>VAT Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAT Detail</em>'.
	 * @see Accounting.VATDetail
	 * @generated
	 */
	EClass getVATDetail();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.VATDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Accounting.VATDetail#getAmount()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.VATDetail#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see Accounting.VATDetail#getPercentage()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Percentage();

	/**
	 * Returns the meta object for the reference '{@link Accounting.VATDetail#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Accounting.VATDetail#getCountry()
	 * @see #getVATDetail()
	 * @generated
	 */
	EReference getVATDetail_Country();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.VATDetail#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see Accounting.VATDetail#getTaxId()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_TaxId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.VATDetail#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Accounting.VATDetail#getScope()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Scope();

	/**
	 * Returns the meta object for class '{@link Accounting.CurrencyPrice <em>Currency Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Price</em>'.
	 * @see Accounting.CurrencyPrice
	 * @generated
	 */
	EClass getCurrencyPrice();

	/**
	 * Returns the meta object for the reference '{@link Accounting.CurrencyPrice#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency</em>'.
	 * @see Accounting.CurrencyPrice#getCurrency()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EReference getCurrencyPrice_Currency();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.CurrencyPrice#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Accounting.CurrencyPrice#getAmount()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EAttribute getCurrencyPrice_Amount();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.CurrencyPrice#getVATdetails <em>VA Tdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VA Tdetails</em>'.
	 * @see Accounting.CurrencyPrice#getVATdetails()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EReference getCurrencyPrice_VATdetails();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Class Definitions</em>'.
	 * @see Accounting.ServiceClassDefinitions
	 * @generated
	 */
	EClass getServiceClassDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ServiceClassDefinitions#getServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Class Definitions</em>'.
	 * @see Accounting.ServiceClassDefinitions#getServiceClassDefinitions()
	 * @see #getServiceClassDefinitions()
	 * @generated
	 */
	EReference getServiceClassDefinitions_ServiceClassDefinitions();

	/**
	 * Returns the meta object for class '{@link Accounting.Calendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendars</em>'.
	 * @see Accounting.Calendars
	 * @generated
	 */
	EClass getCalendars();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Calendars#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendars</em>'.
	 * @see Accounting.Calendars#getCalendars()
	 * @see #getCalendars()
	 * @generated
	 */
	EReference getCalendars_Calendars();

	/**
	 * Returns the meta object for class '{@link Accounting.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see Accounting.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.Calendar#getName()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Name();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.Calendar#getId()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see Accounting.Calendar#getFromDate()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getUntilDate <em>Until Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until Date</em>'.
	 * @see Accounting.Calendar#getUntilDate()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UntilDate();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getUtcOffset <em>Utc Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utc Offset</em>'.
	 * @see Accounting.Calendar#getUtcOffset()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UtcOffset();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.Calendar#getDates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dates</em>'.
	 * @see Accounting.Calendar#getDates()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Dates();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Accounting.Calendar#getDataSource()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getFromDateTime <em>From Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date Time</em>'.
	 * @see Accounting.Calendar#getFromDateTime()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_FromDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Calendar#getUntilDateTime <em>Until Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until Date Time</em>'.
	 * @see Accounting.Calendar#getUntilDateTime()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UntilDateTime();

	/**
	 * Returns the meta object for class '{@link Accounting.ReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Parameters</em>'.
	 * @see Accounting.ReservationParameters
	 * @generated
	 */
	EClass getReservationParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ReservationParameters#getReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reservation Parameters</em>'.
	 * @see Accounting.ReservationParameters#getReservationParameters()
	 * @see #getReservationParameters()
	 * @generated
	 */
	EReference getReservationParameters_ReservationParameters();

	/**
	 * Returns the meta object for class '{@link Accounting.ReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Parameter</em>'.
	 * @see Accounting.ReservationParameter
	 * @generated
	 */
	EClass getReservationParameter();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParameter#isMandatoryReservation <em>Mandatory Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory Reservation</em>'.
	 * @see Accounting.ReservationParameter#isMandatoryReservation()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_MandatoryReservation();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.ReservationParameter#getId()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_Id();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.ReservationParameter#getParams9181 <em>Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params9181</em>'.
	 * @see Accounting.ReservationParameter#getParams9181()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_Params9181();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.ReservationParameter#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see Accounting.ReservationParameter#getOptions()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_Options();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ReservationParameter#getMandatoryReservationForBrands <em>Mandatory Reservation For Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Reservation For Brands</em>'.
	 * @see Accounting.ReservationParameter#getMandatoryReservationForBrands()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_MandatoryReservationForBrands();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.ReservationParameter#getMandatoryReservationsForMode <em>Mandatory Reservations For Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mandatory Reservations For Mode</em>'.
	 * @see Accounting.ReservationParameter#getMandatoryReservationsForMode()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_MandatoryReservationsForMode();

	/**
	 * Returns the meta object for class '{@link Accounting.ReservationParams9181 <em>Reservation Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Params9181</em>'.
	 * @see Accounting.ReservationParams9181
	 * @generated
	 */
	EClass getReservationParams9181();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParams9181#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Class</em>'.
	 * @see Accounting.ReservationParams9181#getTravelClass()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_TravelClass();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParams9181#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Level</em>'.
	 * @see Accounting.ReservationParams9181#getServiceLevel()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_ServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParams9181#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Accounting.ReservationParams9181#getService()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_Service();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParams9181#getBerthType <em>Berth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Berth Type</em>'.
	 * @see Accounting.ReservationParams9181#getBerthType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_BerthType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParams9181#getCoachType <em>Coach Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Type</em>'.
	 * @see Accounting.ReservationParams9181#getCoachType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_CoachType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParams9181#getCompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Type</em>'.
	 * @see Accounting.ReservationParams9181#getCompartmentType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_CompartmentType();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationParams9181#getTariff <em>Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff</em>'.
	 * @see Accounting.ReservationParams9181#getTariff()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_Tariff();

	/**
	 * Returns the meta object for class '{@link Accounting.ReservationOptions <em>Reservation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Options</em>'.
	 * @see Accounting.ReservationOptions
	 * @generated
	 */
	EClass getReservationOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ReservationOptions#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferences</em>'.
	 * @see Accounting.ReservationOptions#getPreferences()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EReference getReservationOptions_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ReservationOptions#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Brands</em>'.
	 * @see Accounting.ReservationOptions#getServiceBrands()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EReference getReservationOptions_ServiceBrands();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationOptions#getGraphicalReservation <em>Graphical Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphical Reservation</em>'.
	 * @see Accounting.ReservationOptions#getGraphicalReservation()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EAttribute getReservationOptions_GraphicalReservation();

	/**
	 * Returns the meta object for class '{@link Accounting.ReservationPreferenceGroup <em>Reservation Preference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Preference Group</em>'.
	 * @see Accounting.ReservationPreferenceGroup
	 * @generated
	 */
	EClass getReservationPreferenceGroup();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.ReservationPreferenceGroup#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preference</em>'.
	 * @see Accounting.ReservationPreferenceGroup#getPreference()
	 * @see #getReservationPreferenceGroup()
	 * @generated
	 */
	EAttribute getReservationPreferenceGroup_Preference();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReservationPreferenceGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see Accounting.ReservationPreferenceGroup#getGroup()
	 * @see #getReservationPreferenceGroup()
	 * @generated
	 */
	EAttribute getReservationPreferenceGroup_Group();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Class</em>'.
	 * @see Accounting.ServiceClass
	 * @generated
	 */
	EClass getServiceClass();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.ServiceClass#getId()
	 * @see #getServiceClass()
	 * @generated
	 */
	EAttribute getServiceClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceClass#getClassicClass <em>Classic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classic Class</em>'.
	 * @see Accounting.ServiceClass#getClassicClass()
	 * @see #getServiceClass()
	 * @generated
	 */
	EAttribute getServiceClass_ClassicClass();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ServiceClass#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Accounting.ServiceClass#getText()
	 * @see #getServiceClass()
	 * @generated
	 */
	EReference getServiceClass_Text();

	/**
	 * Returns the meta object for class '{@link Accounting.ServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level</em>'.
	 * @see Accounting.ServiceLevel
	 * @generated
	 */
	EClass getServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceLevel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.ServiceLevel#getId()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_Id();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ServiceLevel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Accounting.ServiceLevel#getText()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_Text();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ServiceLevel#getCombiningServiceClasses <em>Combining Service Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combining Service Classes</em>'.
	 * @see Accounting.ServiceLevel#getCombiningServiceClasses()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_CombiningServiceClasses();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ServiceLevel#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Accounting.ServiceLevel#getReservationParameter()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_ReservationParameter();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ServiceLevel#isIncludesClassName <em>Includes Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Includes Class Name</em>'.
	 * @see Accounting.ServiceLevel#isIncludesClassName()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_IncludesClassName();

	/**
	 * Returns the meta object for class '{@link Accounting.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Range</em>'.
	 * @see Accounting.TimeRange
	 * @generated
	 */
	EClass getTimeRange();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TimeRange#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Accounting.TimeRange#getScope()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Scope();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TimeRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see Accounting.TimeRange#getFrom()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_From();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TimeRange#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until</em>'.
	 * @see Accounting.TimeRange#getUntil()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Until();

	/**
	 * Returns the meta object for class '{@link Accounting.ExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excluded Time Range</em>'.
	 * @see Accounting.ExcludedTimeRange
	 * @generated
	 */
	EClass getExcludedTimeRange();

	/**
	 * Returns the meta object for class '{@link Accounting.ValidityRange <em>Validity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validity Range</em>'.
	 * @see Accounting.ValidityRange
	 * @generated
	 */
	EClass getValidityRange();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ValidityRange#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Accounting.ValidityRange#getUnit()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ValidityRange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Accounting.ValidityRange#getValue()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_Value();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ValidityRange#getHoursAfterMidnight <em>Hours After Midnight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours After Midnight</em>'.
	 * @see Accounting.ValidityRange#getHoursAfterMidnight()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_HoursAfterMidnight();

	/**
	 * Returns the meta object for class '{@link Accounting.RelativeTime <em>Relative Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Time</em>'.
	 * @see Accounting.RelativeTime
	 * @generated
	 */
	EClass getRelativeTime();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RelativeTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Accounting.RelativeTime#getUnit()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RelativeTime#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see Accounting.RelativeTime#getReference()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Reference();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RelativeTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Accounting.RelativeTime#getValue()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Value();

	/**
	 * Returns the meta object for class '{@link Accounting.ReturnValidityConstraint <em>Return Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Validity Constraint</em>'.
	 * @see Accounting.ReturnValidityConstraint
	 * @generated
	 */
	EClass getReturnValidityConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.ReturnValidityConstraint#getExcludedWeekdays <em>Excluded Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excluded Weekdays</em>'.
	 * @see Accounting.ReturnValidityConstraint#getExcludedWeekdays()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_ExcludedWeekdays();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReturnValidityConstraint#getLatestReturn <em>Latest Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Return</em>'.
	 * @see Accounting.ReturnValidityConstraint#getLatestReturn()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_LatestReturn();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReturnValidityConstraint#getEarliestReturn <em>Earliest Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Return</em>'.
	 * @see Accounting.ReturnValidityConstraint#getEarliestReturn()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_EarliestReturn();

	/**
	 * Returns the meta object for class '{@link Accounting.TripAllocationConstraint <em>Trip Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Allocation Constraint</em>'.
	 * @see Accounting.TripAllocationConstraint
	 * @generated
	 */
	EClass getTripAllocationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TripAllocationConstraint#getAllocationUnit <em>Allocation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Unit</em>'.
	 * @see Accounting.TripAllocationConstraint#getAllocationUnit()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_AllocationUnit();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TripAllocationConstraint#getMaxUnits <em>Max Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Units</em>'.
	 * @see Accounting.TripAllocationConstraint#getMaxUnits()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_MaxUnits();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TripAllocationConstraint#getDurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Unit</em>'.
	 * @see Accounting.TripAllocationConstraint#getDurationUnit()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_DurationUnit();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.TripAllocationConstraint#getRequiredProcesses <em>Required Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Processes</em>'.
	 * @see Accounting.TripAllocationConstraint#getRequiredProcesses()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_RequiredProcesses();

	/**
	 * Returns the meta object for class '{@link Accounting.TripInterruptionConstraint <em>Trip Interruption Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Interruption Constraint</em>'.
	 * @see Accounting.TripInterruptionConstraint
	 * @generated
	 */
	EClass getTripInterruptionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TripInterruptionConstraint#getMaxInterruptions <em>Max Interruptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interruptions</em>'.
	 * @see Accounting.TripInterruptionConstraint#getMaxInterruptions()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_MaxInterruptions();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TripInterruptionConstraint#getMaxDuration <em>Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration</em>'.
	 * @see Accounting.TripInterruptionConstraint#getMaxDuration()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_MaxDuration();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.TripInterruptionConstraint#getTotalMaxDuration <em>Total Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Max Duration</em>'.
	 * @see Accounting.TripInterruptionConstraint#getTotalMaxDuration()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_TotalMaxDuration();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.TripInterruptionConstraint#getRequiredProcesses <em>Required Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Processes</em>'.
	 * @see Accounting.TripInterruptionConstraint#getRequiredProcesses()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_RequiredProcesses();

	/**
	 * Returns the meta object for class '{@link Accounting.ViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Via Station</em>'.
	 * @see Accounting.ViaStation
	 * @generated
	 */
	EClass getViaStation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ViaStation#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Accounting.ViaStation#getStation()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Station();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ViaStation#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Accounting.ViaStation#getCarrierConstraint()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ViaStation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Accounting.ViaStation#getCarrier()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Carrier();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.ViaStation#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see Accounting.ViaStation#getRoute()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ViaStation#getAlternativeRoutes <em>Alternative Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative Routes</em>'.
	 * @see Accounting.ViaStation#getAlternativeRoutes()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_AlternativeRoutes();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ViaStation#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.ViaStation#getDataDescription()
	 * @see #getViaStation()
	 * @generated
	 */
	EAttribute getViaStation_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ViaStation#getFareStationSet <em>Fare Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Station Set</em>'.
	 * @see Accounting.ViaStation#getFareStationSet()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_FareStationSet();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ViaStation#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Accounting.ViaStation#getServiceConstraint()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_ServiceConstraint();

	/**
	 * Returns the meta object for the '{@link Accounting.ViaStation#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see Accounting.ViaStation#getDescription()
	 * @generated
	 */
	EOperation getViaStation__GetDescription();

	/**
	 * Returns the meta object for class '{@link Accounting.AlternativeRoute <em>Alternative Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Route</em>'.
	 * @see Accounting.AlternativeRoute
	 * @generated
	 */
	EClass getAlternativeRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.AlternativeRoute#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Accounting.AlternativeRoute#getStations()
	 * @see #getAlternativeRoute()
	 * @generated
	 */
	EReference getAlternativeRoute_Stations();

	/**
	 * Returns the meta object for class '{@link Accounting.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see Accounting.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Route#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Accounting.Route#getStations()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Stations();

	/**
	 * Returns the meta object for class '{@link Accounting.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see Accounting.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Zone#getBinaryZoneId <em>Binary Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Zone Id</em>'.
	 * @see Accounting.Zone#getBinaryZoneId()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_BinaryZoneId();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.Zone#getZoneId <em>Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zone Id</em>'.
	 * @see Accounting.Zone#getZoneId()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_ZoneId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Zone#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Accounting.Zone#getCity()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_City();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Zone#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Accounting.Zone#getCarrier()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Zone#getEntryStation <em>Entry Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Station</em>'.
	 * @see Accounting.Zone#getEntryStation()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_EntryStation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Zone#getTerminalStation <em>Terminal Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Station</em>'.
	 * @see Accounting.Zone#getTerminalStation()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_TerminalStation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Zone#getNutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nuts Code</em>'.
	 * @see Accounting.Zone#getNutsCode()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_NutsCode();

	/**
	 * Returns the meta object for class '{@link Accounting.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see Accounting.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Line#getBinaryZoneId <em>Binary Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Zone Id</em>'.
	 * @see Accounting.Line#getBinaryZoneId()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_BinaryZoneId();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.Line#getLineId <em>Line Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line Id</em>'.
	 * @see Accounting.Line#getLineId()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_LineId();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Line#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Accounting.Line#getCarrier()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Line#getEntryStation <em>Entry Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Station</em>'.
	 * @see Accounting.Line#getEntryStation()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_EntryStation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Line#getTerminalStation <em>Terminal Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Station</em>'.
	 * @see Accounting.Line#getTerminalStation()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_TerminalStation();

	/**
	 * Returns the meta object for the reference '{@link Accounting.Line#getNutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nuts Code</em>'.
	 * @see Accounting.Line#getNutsCode()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_NutsCode();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Line#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Accounting.Line#getCity()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_City();

	/**
	 * Returns the meta object for class '{@link Accounting.Polygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygone</em>'.
	 * @see Accounting.Polygone
	 * @generated
	 */
	EClass getPolygone();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.Polygone#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see Accounting.Polygone#getEdge()
	 * @see #getPolygone()
	 * @generated
	 */
	EReference getPolygone_Edge();

	/**
	 * Returns the meta object for class '{@link Accounting.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see Accounting.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Edge#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see Accounting.Edge#getSystem()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_System();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Edge#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see Accounting.Edge#getAccuracy()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Edge#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see Accounting.Edge#getLongitude()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.Edge#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see Accounting.Edge#getLatitude()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Latitude();

	/**
	 * Returns the meta object for class '{@link Accounting.ZoneDefinitions <em>Zone Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Definitions</em>'.
	 * @see Accounting.ZoneDefinitions
	 * @generated
	 */
	EClass getZoneDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ZoneDefinitions#getZoneDefinition <em>Zone Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zone Definition</em>'.
	 * @see Accounting.ZoneDefinitions#getZoneDefinition()
	 * @see #getZoneDefinitions()
	 * @generated
	 */
	EReference getZoneDefinitions_ZoneDefinition();

	/**
	 * Returns the meta object for class '{@link Accounting.ZoneDefinition <em>Zone Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Definition</em>'.
	 * @see Accounting.ZoneDefinition
	 * @generated
	 */
	EClass getZoneDefinition();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ZoneDefinition#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see Accounting.ZoneDefinition#getProvider()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_Provider();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ZoneDefinition#getZoneId <em>Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Id</em>'.
	 * @see Accounting.ZoneDefinition#getZoneId()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_ZoneId();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ZoneDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.ZoneDefinition#getName()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.ZoneDefinition#getPolygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygone</em>'.
	 * @see Accounting.ZoneDefinition#getPolygone()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_Polygone();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ZoneDefinition#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Accounting.ZoneDefinition#getNameUtf8()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_NameUtf8();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.ZoneDefinition#getStationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Set</em>'.
	 * @see Accounting.ZoneDefinition#getStationSet()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_StationSet();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ZoneDefinition#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nuts Codes</em>'.
	 * @see Accounting.ZoneDefinition#getNutsCodes()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Accounting.CrossBorderCondition <em>Cross Border Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Border Condition</em>'.
	 * @see Accounting.CrossBorderCondition
	 * @generated
	 */
	EClass getCrossBorderCondition();

	/**
	 * Returns the meta object for the reference '{@link Accounting.CrossBorderCondition#getFromCountry <em>From Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Country</em>'.
	 * @see Accounting.CrossBorderCondition#getFromCountry()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_FromCountry();

	/**
	 * Returns the meta object for the reference '{@link Accounting.CrossBorderCondition#getToCountry <em>To Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Country</em>'.
	 * @see Accounting.CrossBorderCondition#getToCountry()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_ToCountry();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.CrossBorderCondition#getAffectedServiceBrands <em>Affected Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Service Brands</em>'.
	 * @see Accounting.CrossBorderCondition#getAffectedServiceBrands()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_AffectedServiceBrands();

	/**
	 * Returns the meta object for class '{@link Accounting.FareCombinationModel <em>Fare Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Combination Model</em>'.
	 * @see Accounting.FareCombinationModel
	 * @generated
	 */
	EClass getFareCombinationModel();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareCombinationModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see Accounting.FareCombinationModel#getModel()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_Model();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.FareCombinationModel#getCombinableCarriers <em>Combinable Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combinable Carriers</em>'.
	 * @see Accounting.FareCombinationModel#getCombinableCarriers()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_CombinableCarriers();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareCombinationModel#isOnlyWhenCombined <em>Only When Combined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only When Combined</em>'.
	 * @see Accounting.FareCombinationModel#isOnlyWhenCombined()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_OnlyWhenCombined();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.FareCombinationModel#getAllowedAllocators <em>Allowed Allocators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Allocators</em>'.
	 * @see Accounting.FareCombinationModel#getAllowedAllocators()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_AllowedAllocators();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.FareCombinationModel#getReferenceCluster <em>Reference Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Cluster</em>'.
	 * @see Accounting.FareCombinationModel#getReferenceCluster()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_ReferenceCluster();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.FareCombinationModel#getAllowedClusters <em>Allowed Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Clusters</em>'.
	 * @see Accounting.FareCombinationModel#getAllowedClusters()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_AllowedClusters();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.FareCombinationModel#getAllowedCommonContracts <em>Allowed Common Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Common Contracts</em>'.
	 * @see Accounting.FareCombinationModel#getAllowedCommonContracts()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_AllowedCommonContracts();

	/**
	 * Returns the meta object for class '{@link Accounting.ReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Constraints</em>'.
	 * @see Accounting.ReductionConstraints
	 * @generated
	 */
	EClass getReductionConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ReductionConstraints#getReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Constraints</em>'.
	 * @see Accounting.ReductionConstraints#getReductionConstraints()
	 * @see #getReductionConstraints()
	 * @generated
	 */
	EReference getReductionConstraints_ReductionConstraints();

	/**
	 * Returns the meta object for class '{@link Accounting.ReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Constraint</em>'.
	 * @see Accounting.ReductionConstraint
	 * @generated
	 */
	EClass getReductionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReductionConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.ReductionConstraint#getId()
	 * @see #getReductionConstraint()
	 * @generated
	 */
	EAttribute getReductionConstraint_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ReductionConstraint#getRequiredReductionCards <em>Required Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Reduction Cards</em>'.
	 * @see Accounting.ReductionConstraint#getRequiredReductionCards()
	 * @see #getReductionConstraint()
	 * @generated
	 */
	EReference getReductionConstraint_RequiredReductionCards();

	/**
	 * Returns the meta object for class '{@link Accounting.ReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Cards</em>'.
	 * @see Accounting.ReductionCards
	 * @generated
	 */
	EClass getReductionCards();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.ReductionCards#getReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Cards</em>'.
	 * @see Accounting.ReductionCards#getReductionCards()
	 * @see #getReductionCards()
	 * @generated
	 */
	EReference getReductionCards_ReductionCards();

	/**
	 * Returns the meta object for class '{@link Accounting.ReductionCard <em>Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Card</em>'.
	 * @see Accounting.ReductionCard
	 * @generated
	 */
	EClass getReductionCard();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReductionCard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.ReductionCard#getId()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_Id();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ReductionCard#getCardIssuer <em>Card Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Issuer</em>'.
	 * @see Accounting.ReductionCard#getCardIssuer()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_CardIssuer();

	/**
	 * Returns the meta object for the reference '{@link Accounting.ReductionCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see Accounting.ReductionCard#getName()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_Name();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ReductionCard#getServiceClasses <em>Service Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Classes</em>'.
	 * @see Accounting.ReductionCard#getServiceClasses()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_ServiceClasses();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReductionCard#isIdRequiredForBooking <em>Id Required For Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Required For Booking</em>'.
	 * @see Accounting.ReductionCard#isIdRequiredForBooking()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_IdRequiredForBooking();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.ReductionCard#getIncludedReductionCards <em>Included Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Reduction Cards</em>'.
	 * @see Accounting.ReductionCard#getIncludedReductionCards()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_IncludedReductionCards();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.ReductionCard#isUicCode <em>Uic Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uic Code</em>'.
	 * @see Accounting.ReductionCard#isUicCode()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_UicCode();

	/**
	 * Returns the meta object for class '{@link Accounting.RequiredReductionCard <em>Required Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Reduction Card</em>'.
	 * @see Accounting.RequiredReductionCard
	 * @generated
	 */
	EClass getRequiredReductionCard();

	/**
	 * Returns the meta object for the reference '{@link Accounting.RequiredReductionCard#getCardClass <em>Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Class</em>'.
	 * @see Accounting.RequiredReductionCard#getCardClass()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EReference getRequiredReductionCard_CardClass();

	/**
	 * Returns the meta object for the reference '{@link Accounting.RequiredReductionCard#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see Accounting.RequiredReductionCard#getCard()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EReference getRequiredReductionCard_Card();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.RequiredReductionCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Accounting.RequiredReductionCard#getName()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EAttribute getRequiredReductionCard_Name();

	/**
	 * Returns the meta object for class '{@link Accounting.LuggageConstraints <em>Luggage Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Constraints</em>'.
	 * @see Accounting.LuggageConstraints
	 * @generated
	 */
	EClass getLuggageConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.LuggageConstraints#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see Accounting.LuggageConstraints#getConstraints()
	 * @see #getLuggageConstraints()
	 * @generated
	 */
	EReference getLuggageConstraints_Constraints();

	/**
	 * Returns the meta object for class '{@link Accounting.LuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Constraint</em>'.
	 * @see Accounting.LuggageConstraint
	 * @generated
	 */
	EClass getLuggageConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LuggageConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Accounting.LuggageConstraint#getId()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LuggageConstraint#getMaxHandLuggage <em>Max Hand Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Hand Luggage</em>'.
	 * @see Accounting.LuggageConstraint#getMaxHandLuggage()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_MaxHandLuggage();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LuggageConstraint#getMaxLargeLuggage <em>Max Large Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Large Luggage</em>'.
	 * @see Accounting.LuggageConstraint#getMaxLargeLuggage()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_MaxLargeLuggage();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.LuggageConstraint#getRestrictedItems <em>Restricted Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restricted Items</em>'.
	 * @see Accounting.LuggageConstraint#getRestrictedItems()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EReference getLuggageConstraint_RestrictedItems();

	/**
	 * Returns the meta object for the attribute list '{@link Accounting.LuggageConstraint#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rules</em>'.
	 * @see Accounting.LuggageConstraint#getRules()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_Rules();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LuggageConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Accounting.LuggageConstraint#getDataDescription()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_DataDescription();

	/**
	 * Returns the meta object for class '{@link Accounting.LuggageItemsRestriction <em>Luggage Items Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Items Restriction</em>'.
	 * @see Accounting.LuggageItemsRestriction
	 * @generated
	 */
	EClass getLuggageItemsRestriction();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LuggageItemsRestriction#getNumberOfItems <em>Number Of Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Items</em>'.
	 * @see Accounting.LuggageItemsRestriction#getNumberOfItems()
	 * @see #getLuggageItemsRestriction()
	 * @generated
	 */
	EAttribute getLuggageItemsRestriction_NumberOfItems();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.LuggageItemsRestriction#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see Accounting.LuggageItemsRestriction#getDimension()
	 * @see #getLuggageItemsRestriction()
	 * @generated
	 */
	EReference getLuggageItemsRestriction_Dimension();

	/**
	 * Returns the meta object for class '{@link Accounting.LuggageDimension <em>Luggage Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Dimension</em>'.
	 * @see Accounting.LuggageDimension
	 * @generated
	 */
	EClass getLuggageDimension();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LuggageDimension#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Accounting.LuggageDimension#getValue()
	 * @see #getLuggageDimension()
	 * @generated
	 */
	EAttribute getLuggageDimension_Value();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.LuggageDimension#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see Accounting.LuggageDimension#getDimension()
	 * @see #getLuggageDimension()
	 * @generated
	 */
	EAttribute getLuggageDimension_Dimension();

	/**
	 * Returns the meta object for class '{@link Accounting.AddCarrierRules <em>Add Carrier Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Carrier Rules</em>'.
	 * @see Accounting.AddCarrierRules
	 * @generated
	 */
	EClass getAddCarrierRules();

	/**
	 * Returns the meta object for the containment reference list '{@link Accounting.AddCarrierRules#getAddCarrierRule <em>Add Carrier Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Carrier Rule</em>'.
	 * @see Accounting.AddCarrierRules#getAddCarrierRule()
	 * @see #getAddCarrierRules()
	 * @generated
	 */
	EReference getAddCarrierRules_AddCarrierRule();

	/**
	 * Returns the meta object for class '{@link Accounting.AddCarrierRule <em>Add Carrier Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Carrier Rule</em>'.
	 * @see Accounting.AddCarrierRule
	 * @generated
	 */
	EClass getAddCarrierRule();

	/**
	 * Returns the meta object for the reference '{@link Accounting.AddCarrierRule#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Accounting.AddCarrierRule#getCarrier()
	 * @see #getAddCarrierRule()
	 * @generated
	 */
	EReference getAddCarrierRule_Carrier();

	/**
	 * Returns the meta object for the attribute '{@link Accounting.AddCarrierRule#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Accounting.AddCarrierRule#getScope()
	 * @see #getAddCarrierRule()
	 * @generated
	 */
	EAttribute getAddCarrierRule_Scope();

	/**
	 * Returns the meta object for the reference list '{@link Accounting.AddCarrierRule#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Accounting.AddCarrierRule#getStations()
	 * @see #getAddCarrierRule()
	 * @generated
	 */
	EReference getAddCarrierRule_Stations();

	/**
	 * Returns the meta object for class '{@link Accounting.OnBorderStations <em>On Border Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Border Stations</em>'.
	 * @see Accounting.OnBorderStations
	 * @generated
	 */
	EClass getOnBorderStations();

	/**
	 * Returns the meta object for the containment reference '{@link Accounting.OnBorderStations#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stations</em>'.
	 * @see Accounting.OnBorderStations#getStations()
	 * @see #getOnBorderStations()
	 * @generated
	 */
	EReference getOnBorderStations_Stations();

	/**
	 * Returns the meta object for enum '{@link Accounting.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type</em>'.
	 * @see Accounting.PaymentType
	 * @generated
	 */
	EEnum getPaymentType();

	/**
	 * Returns the meta object for enum '{@link Accounting.SalesChannel <em>Sales Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sales Channel</em>'.
	 * @see Accounting.SalesChannel
	 * @generated
	 */
	EEnum getSalesChannel();

	/**
	 * Returns the meta object for enum '{@link Accounting.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Type</em>'.
	 * @see Accounting.TransactionType
	 * @generated
	 */
	EEnum getTransactionType();

	/**
	 * Returns the meta object for enum '{@link Accounting.AccountingType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see Accounting.AccountingType
	 * @generated
	 */
	EEnum getAccountingType();

	/**
	 * Returns the meta object for enum '{@link Accounting.SettlementValueIndicator <em>Settlement Value Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Settlement Value Indicator</em>'.
	 * @see Accounting.SettlementValueIndicator
	 * @generated
	 */
	EEnum getSettlementValueIndicator();

	/**
	 * Returns the meta object for enum '{@link Accounting.SalesType <em>Sales Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sales Type</em>'.
	 * @see Accounting.SalesType
	 * @generated
	 */
	EEnum getSalesType();

	/**
	 * Returns the meta object for enum '{@link Accounting.TransactionStandard <em>Transaction Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Standard</em>'.
	 * @see Accounting.TransactionStandard
	 * @generated
	 */
	EEnum getTransactionStandard();

	/**
	 * Returns the meta object for enum '{@link Accounting.BoardingOrArrival <em>Boarding Or Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boarding Or Arrival</em>'.
	 * @see Accounting.BoardingOrArrival
	 * @generated
	 */
	EEnum getBoardingOrArrival();

	/**
	 * Returns the meta object for enum '{@link Accounting.LuggageRule <em>Luggage Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Luggage Rule</em>'.
	 * @see Accounting.LuggageRule
	 * @generated
	 */
	EEnum getLuggageRule();

	/**
	 * Returns the meta object for enum '{@link Accounting.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension</em>'.
	 * @see Accounting.Dimension
	 * @generated
	 */
	EEnum getDimension();

	/**
	 * Returns the meta object for enum '{@link Accounting.AddCarrierScope <em>Add Carrier Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Add Carrier Scope</em>'.
	 * @see Accounting.AddCarrierScope
	 * @generated
	 */
	EEnum getAddCarrierScope();

	/**
	 * Returns the meta object for enum '{@link Accounting.TransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Mode</em>'.
	 * @see Accounting.TransportMode
	 * @generated
	 */
	EEnum getTransportMode();

	/**
	 * Returns the meta object for enum '{@link Accounting.StationRelationType <em>Station Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Station Relation Type</em>'.
	 * @see Accounting.StationRelationType
	 * @generated
	 */
	EEnum getStationRelationType();

	/**
	 * Returns the meta object for enum '{@link Accounting.StationFareDetailType <em>Station Fare Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Station Fare Detail Type</em>'.
	 * @see Accounting.StationFareDetailType
	 * @generated
	 */
	EEnum getStationFareDetailType();

	/**
	 * Returns the meta object for enum '{@link Accounting.RegulatoryCondition <em>Regulatory Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regulatory Condition</em>'.
	 * @see Accounting.RegulatoryCondition
	 * @generated
	 */
	EEnum getRegulatoryCondition();

	/**
	 * Returns the meta object for enum '{@link Accounting.AfterSalesTransactionType <em>After Sales Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>After Sales Transaction Type</em>'.
	 * @see Accounting.AfterSalesTransactionType
	 * @generated
	 */
	EEnum getAfterSalesTransactionType();

	/**
	 * Returns the meta object for enum '{@link Accounting.BarcodeTypes <em>Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Barcode Types</em>'.
	 * @see Accounting.BarcodeTypes
	 * @generated
	 */
	EEnum getBarcodeTypes();

	/**
	 * Returns the meta object for enum '{@link Accounting.BasePriceClassType <em>Base Price Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Price Class Type</em>'.
	 * @see Accounting.BasePriceClassType
	 * @generated
	 */
	EEnum getBasePriceClassType();

	/**
	 * Returns the meta object for enum '{@link Accounting.ClassicClassType <em>Classic Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classic Class Type</em>'.
	 * @see Accounting.ClassicClassType
	 * @generated
	 */
	EEnum getClassicClassType();

	/**
	 * Returns the meta object for enum '{@link Accounting.ClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Id</em>'.
	 * @see Accounting.ClassId
	 * @generated
	 */
	EEnum getClassId();

	/**
	 * Returns the meta object for enum '{@link Accounting.CharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Character Set</em>'.
	 * @see Accounting.CharacterSet
	 * @generated
	 */
	EEnum getCharacterSet();

	/**
	 * Returns the meta object for enum '{@link Accounting.Clusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clusters</em>'.
	 * @see Accounting.Clusters
	 * @generated
	 */
	EEnum getClusters();

	/**
	 * Returns the meta object for enum '{@link Accounting.CombinationModel <em>Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combination Model</em>'.
	 * @see Accounting.CombinationModel
	 * @generated
	 */
	EEnum getCombinationModel();

	/**
	 * Returns the meta object for enum '{@link Accounting.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Data Exchange Types</em>'.
	 * @see Accounting.ControlDataExchangeTypes
	 * @generated
	 */
	EEnum getControlDataExchangeTypes();

	/**
	 * Returns the meta object for enum '{@link Accounting.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Source</em>'.
	 * @see Accounting.DataSource
	 * @generated
	 */
	EEnum getDataSource();

	/**
	 * Returns the meta object for enum '{@link Accounting.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see Accounting.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link Accounting.FareType <em>Fare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fare Type</em>'.
	 * @see Accounting.FareType
	 * @generated
	 */
	EEnum getFareType();

	/**
	 * Returns the meta object for enum '{@link Accounting.FulfillmentType <em>Fulfillment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fulfillment Type</em>'.
	 * @see Accounting.FulfillmentType
	 * @generated
	 */
	EEnum getFulfillmentType();

	/**
	 * Returns the meta object for enum '{@link Accounting.GeoSystem <em>Geo System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo System</em>'.
	 * @see Accounting.GeoSystem
	 * @generated
	 */
	EEnum getGeoSystem();

	/**
	 * Returns the meta object for enum '{@link Accounting.GeoUnit <em>Geo Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo Unit</em>'.
	 * @see Accounting.GeoUnit
	 * @generated
	 */
	EEnum getGeoUnit();

	/**
	 * Returns the meta object for enum '{@link Accounting.GraphicalReservationType <em>Graphical Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Graphical Reservation Type</em>'.
	 * @see Accounting.GraphicalReservationType
	 * @generated
	 */
	EEnum getGraphicalReservationType();

	/**
	 * Returns the meta object for enum '{@link Accounting.GenericReductionCards <em>Generic Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generic Reduction Cards</em>'.
	 * @see Accounting.GenericReductionCards
	 * @generated
	 */
	EEnum getGenericReductionCards();

	/**
	 * Returns the meta object for enum '{@link Accounting.HemisphereEW <em>Hemisphere EW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hemisphere EW</em>'.
	 * @see Accounting.HemisphereEW
	 * @generated
	 */
	EEnum getHemisphereEW();

	/**
	 * Returns the meta object for enum '{@link Accounting.HemisphereNS <em>Hemisphere NS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hemisphere NS</em>'.
	 * @see Accounting.HemisphereNS
	 * @generated
	 */
	EEnum getHemisphereNS();

	/**
	 * Returns the meta object for enum '{@link Accounting.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Type</em>'.
	 * @see Accounting.InterfaceType
	 * @generated
	 */
	EEnum getInterfaceType();

	/**
	 * Returns the meta object for enum '{@link Accounting.LegacyCalculationType <em>Legacy Calculation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Calculation Type</em>'.
	 * @see Accounting.LegacyCalculationType
	 * @generated
	 */
	EEnum getLegacyCalculationType();

	/**
	 * Returns the meta object for enum '{@link Accounting.LegacyPassengerType <em>Legacy Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Passenger Type</em>'.
	 * @see Accounting.LegacyPassengerType
	 * @generated
	 */
	EEnum getLegacyPassengerType();

	/**
	 * Returns the meta object for enum '{@link Accounting.LegacySeriesType <em>Legacy Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Series Type</em>'.
	 * @see Accounting.LegacySeriesType
	 * @generated
	 */
	EEnum getLegacySeriesType();

	/**
	 * Returns the meta object for enum '{@link Accounting.LegacyConversionType <em>Legacy Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Conversion Type</em>'.
	 * @see Accounting.LegacyConversionType
	 * @generated
	 */
	EEnum getLegacyConversionType();

	/**
	 * Returns the meta object for enum '{@link Accounting.OfferRequestType <em>Offer Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Offer Request Type</em>'.
	 * @see Accounting.OfferRequestType
	 * @generated
	 */
	EEnum getOfferRequestType();

	/**
	 * Returns the meta object for enum '{@link Accounting.OnlineServiceType <em>Online Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Online Service Type</em>'.
	 * @see Accounting.OnlineServiceType
	 * @generated
	 */
	EEnum getOnlineServiceType();

	/**
	 * Returns the meta object for enum '{@link Accounting.PersonalDataItemsType <em>Personal Data Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Items Type</em>'.
	 * @see Accounting.PersonalDataItemsType
	 * @generated
	 */
	EEnum getPersonalDataItemsType();

	/**
	 * Returns the meta object for enum '{@link Accounting.PersonalDataTransferType <em>Personal Data Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Transfer Type</em>'.
	 * @see Accounting.PersonalDataTransferType
	 * @generated
	 */
	EEnum getPersonalDataTransferType();

	/**
	 * Returns the meta object for enum '{@link Accounting.PersonalDataChangeReason <em>Personal Data Change Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Change Reason</em>'.
	 * @see Accounting.PersonalDataChangeReason
	 * @generated
	 */
	EEnum getPersonalDataChangeReason();

	/**
	 * Returns the meta object for enum '{@link Accounting.ReservationTravelClass <em>Reservation Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Travel Class</em>'.
	 * @see Accounting.ReservationTravelClass
	 * @generated
	 */
	EEnum getReservationTravelClass();

	/**
	 * Returns the meta object for enum '{@link Accounting.ReservationServiceLevel <em>Reservation Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Service Level</em>'.
	 * @see Accounting.ReservationServiceLevel
	 * @generated
	 */
	EEnum getReservationServiceLevel();

	/**
	 * Returns the meta object for enum '{@link Accounting.ReservationService <em>Reservation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Service</em>'.
	 * @see Accounting.ReservationService
	 * @generated
	 */
	EEnum getReservationService();

	/**
	 * Returns the meta object for enum '{@link Accounting.ReservationBerthType <em>Reservation Berth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Berth Type</em>'.
	 * @see Accounting.ReservationBerthType
	 * @generated
	 */
	EEnum getReservationBerthType();

	/**
	 * Returns the meta object for enum '{@link Accounting.RoundingType <em>Rounding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rounding Type</em>'.
	 * @see Accounting.RoundingType
	 * @generated
	 */
	EEnum getRoundingType();

	/**
	 * Returns the meta object for enum '{@link Accounting.SchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Version</em>'.
	 * @see Accounting.SchemaVersion
	 * @generated
	 */
	EEnum getSchemaVersion();

	/**
	 * Returns the meta object for enum '{@link Accounting.ServiceMode <em>Service Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Mode</em>'.
	 * @see Accounting.ServiceMode
	 * @generated
	 */
	EEnum getServiceMode();

	/**
	 * Returns the meta object for enum '{@link Accounting.TimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Zone</em>'.
	 * @see Accounting.TimeZone
	 * @generated
	 */
	EEnum getTimeZone();

	/**
	 * Returns the meta object for enum '{@link Accounting.TaxScope <em>Tax Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Scope</em>'.
	 * @see Accounting.TaxScope
	 * @generated
	 */
	EEnum getTaxScope();

	/**
	 * Returns the meta object for enum '{@link Accounting.TimeReferenceType <em>Time Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Reference Type</em>'.
	 * @see Accounting.TimeReferenceType
	 * @generated
	 */
	EEnum getTimeReferenceType();

	/**
	 * Returns the meta object for enum '{@link Accounting.TimeRangeScope <em>Time Range Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Range Scope</em>'.
	 * @see Accounting.TimeRangeScope
	 * @generated
	 */
	EEnum getTimeRangeScope();

	/**
	 * Returns the meta object for enum '{@link Accounting.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see Accounting.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link Accounting.TravelerType <em>Traveler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Traveler Type</em>'.
	 * @see Accounting.TravelerType
	 * @generated
	 */
	EEnum getTravelerType();

	/**
	 * Returns the meta object for enum '{@link Accounting.TripAllocationProcess <em>Trip Allocation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trip Allocation Process</em>'.
	 * @see Accounting.TripAllocationProcess
	 * @generated
	 */
	EEnum getTripAllocationProcess();

	/**
	 * Returns the meta object for enum '{@link Accounting.TripAllocationUnit <em>Trip Allocation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trip Allocation Unit</em>'.
	 * @see Accounting.TripAllocationUnit
	 * @generated
	 */
	EEnum getTripAllocationUnit();

	/**
	 * Returns the meta object for enum '{@link Accounting.TripInterruptionProcess <em>Trip Interruption Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trip Interruption Process</em>'.
	 * @see Accounting.TripInterruptionProcess
	 * @generated
	 */
	EEnum getTripInterruptionProcess();

	/**
	 * Returns the meta object for enum '{@link Accounting.TravelValidityType <em>Travel Validity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Travel Validity Type</em>'.
	 * @see Accounting.TravelValidityType
	 * @generated
	 */
	EEnum getTravelValidityType();

	/**
	 * Returns the meta object for enum '{@link Accounting.WeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day</em>'.
	 * @see Accounting.WeekDay
	 * @generated
	 */
	EEnum getWeekDay();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date As Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date As Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http:///org/eclipse/emf/ecore/util/DateConversionDelegate format='//SimpleDateFormat/yyyy-MM-dd'"
	 * @generated
	 */
	EDataType getDateAsDate();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date As Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date As Date Time</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http:///org/eclipse/emf/ecore/util/DateConversionDelegate format='//SimpleDateFormat/yyyy-MM-dd\'T\'HH:mm:ss\'.\'SSSZ'"
	 * @generated
	 */
	EDataType getDateAsDateTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccountingFactory getAccountingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountingViewerDataImpl <em>Viewer Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountingViewerDataImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountingViewerData()
		 * @generated
		 */
		EClass ACCOUNTING_VIEWER_DATA = eINSTANCE.getAccountingViewerData();

		/**
		 * The meta object literal for the '<em><b>Code Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_VIEWER_DATA__CODE_LISTS = eINSTANCE.getAccountingViewerData_CodeLists();

		/**
		 * The meta object literal for the '<em><b>Fare Modells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_VIEWER_DATA__FARE_MODELLS = eINSTANCE.getAccountingViewerData_FareModells();

		/**
		 * The meta object literal for the '<em><b>Workflow History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_VIEWER_DATA__WORKFLOW_HISTORY = eINSTANCE.getAccountingViewerData_WorkflowHistory();

		/**
		 * The meta object literal for the '<em><b>Accounting File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE = eINSTANCE.getAccountingViewerData_AccountingFile();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountingFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountingFileImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountingFile()
		 * @generated
		 */
		EClass ACCOUNTING_FILE = eINSTANCE.getAccountingFile();

		/**
		 * The meta object literal for the '<em><b>Accounting Delivery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_FILE__ACCOUNTING_DELIVERY = eINSTANCE.getAccountingFile_AccountingDelivery();

		/**
		 * The meta object literal for the '<em><b>Accounting Records</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_FILE__ACCOUNTING_RECORDS = eINSTANCE.getAccountingFile_AccountingRecords();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountingRecordsImpl <em>Records</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountingRecordsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountingRecords()
		 * @generated
		 */
		EClass ACCOUNTING_RECORDS = eINSTANCE.getAccountingRecords();

		/**
		 * The meta object literal for the '<em><b>Accounting Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_RECORDS__ACCOUNTING_RECORDS = eINSTANCE.getAccountingRecords_AccountingRecords();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountingDeliveryImpl <em>Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountingDeliveryImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountingDelivery()
		 * @generated
		 */
		EClass ACCOUNTING_DELIVERY = eINSTANCE.getAccountingDelivery();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_DELIVERY__ID = eINSTANCE.getAccountingDelivery_Id();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_DELIVERY__CREATION_DATE = eINSTANCE.getAccountingDelivery_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Invoicing Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_DELIVERY__INVOICING_PARTY = eINSTANCE.getAccountingDelivery_InvoicingParty();

		/**
		 * The meta object literal for the '<em><b>Invoice Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_DELIVERY__INVOICE_RECIPIENT = eINSTANCE.getAccountingDelivery_InvoiceRecipient();

		/**
		 * The meta object literal for the '<em><b>Start Statement Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD = eINSTANCE.getAccountingDelivery_StartStatementPeriod();

		/**
		 * The meta object literal for the '<em><b>End Statement Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD = eINSTANCE.getAccountingDelivery_EndStatementPeriod();

		/**
		 * The meta object literal for the '<em><b>Payment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_DELIVERY__PAYMENT_TYPE = eINSTANCE.getAccountingDelivery_PaymentType();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountingRecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountingRecordImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountingRecord()
		 * @generated
		 */
		EClass ACCOUNTING_RECORD = eINSTANCE.getAccountingRecord();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_RECORD__ID = eINSTANCE.getAccountingRecord_Id();

		/**
		 * The meta object literal for the '<em><b>Sales Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_RECORD__SALES_TYPE = eINSTANCE.getAccountingRecord_SalesType();

		/**
		 * The meta object literal for the '<em><b>Accounting Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_RECORD__ACCOUNTING_TYPE = eINSTANCE.getAccountingRecord_AccountingType();

		/**
		 * The meta object literal for the '<em><b>Transaction Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_RECORD__TRANSACTION_STANDARD = eINSTANCE.getAccountingRecord_TransactionStandard();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_RECORD__TRANSACTION = eINSTANCE.getAccountingRecord_Transaction();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_RECORD__SUBJECT = eINSTANCE.getAccountingRecord_Subject();

		/**
		 * The meta object literal for the '<em><b>Accounted Amounts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_RECORD__ACCOUNTED_AMOUNTS = eINSTANCE.getAccountingRecord_AccountedAmounts();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountedAmountsImpl <em>Accounted Amounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountedAmountsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountedAmounts()
		 * @generated
		 */
		EClass ACCOUNTED_AMOUNTS = eINSTANCE.getAccountedAmounts();

		/**
		 * The meta object literal for the '<em><b>Accounted Amounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTED_AMOUNTS__ACCOUNTED_AMOUNTS = eINSTANCE.getAccountedAmounts_AccountedAmounts();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountingSubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountingSubjectImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountingSubject()
		 * @generated
		 */
		EClass ACCOUNTING_SUBJECT = eINSTANCE.getAccountingSubject();

		/**
		 * The meta object literal for the '<em><b>Fare Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_SUBJECT__FARE_ID = eINSTANCE.getAccountingSubject_FareId();

		/**
		 * The meta object literal for the '<em><b>Number Of Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS = eINSTANCE.getAccountingSubject_NumberOfItems();

		/**
		 * The meta object literal for the '<em><b>Sales Office Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_SUBJECT__SALES_OFFICE_ID = eINSTANCE.getAccountingSubject_SalesOfficeId();

		/**
		 * The meta object literal for the '<em><b>Sales Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_SUBJECT__SALES_CHANNEL = eINSTANCE.getAccountingSubject_SalesChannel();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_SUBJECT__TRAIN = eINSTANCE.getAccountingSubject_Train();

		/**
		 * The meta object literal for the '<em><b>Travel Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_SUBJECT__TRAVEL_DATE = eINSTANCE.getAccountingSubject_TravelDate();

		/**
		 * The meta object literal for the '<em><b>Country Of Sale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_SUBJECT__COUNTRY_OF_SALE = eINSTANCE.getAccountingSubject_CountryOfSale();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_SUBJECT__CARRIERS = eINSTANCE.getAccountingSubject_Carriers();

		/**
		 * The meta object literal for the '<em><b>Retailer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_SUBJECT__RETAILER = eINSTANCE.getAccountingSubject_Retailer();

		/**
		 * The meta object literal for the '<em><b>Bilateral Tariff Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER = eINSTANCE.getAccountingSubject_BilateralTariffIdentifier();

		/**
		 * The meta object literal for the '<em><b>Legacy Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION = eINSTANCE.getAccountingSubject_LegacyDescription();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LegacyDescriptionImpl <em>Legacy Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LegacyDescriptionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLegacyDescription()
		 * @generated
		 */
		EClass LEGACY_DESCRIPTION = eINSTANCE.getLegacyDescription();

		/**
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DESCRIPTION__PASSENGER_TYPE = eINSTANCE.getLegacyDescription_PassengerType();

		/**
		 * The meta object literal for the '<em><b>Class Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DESCRIPTION__CLASS_CODE = eINSTANCE.getLegacyDescription_ClassCode();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DESCRIPTION__SERIES = eINSTANCE.getLegacyDescription_Series();

		/**
		 * The meta object literal for the '<em><b>Tariff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DESCRIPTION__TARIFF = eINSTANCE.getLegacyDescription_Tariff();

		/**
		 * The meta object literal for the '<em><b>Dialog Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DESCRIPTION__DIALOG_NUMBER = eINSTANCE.getLegacyDescription_DialogNumber();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TransactionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TRANSACTION_TYPE = eINSTANCE.getTransaction_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__CONTRACT = eINSTANCE.getTransaction_Contract();

		/**
		 * The meta object literal for the '<em><b>Booking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__BOOKING_ID = eINSTANCE.getTransaction_BookingId();

		/**
		 * The meta object literal for the '<em><b>Booking Part Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__BOOKING_PART_IDS = eINSTANCE.getTransaction_BookingPartIds();

		/**
		 * The meta object literal for the '<em><b>Accounting Reference Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__ACCOUNTING_REFERENCE_IDS = eINSTANCE.getTransaction_AccountingReferenceIds();

		/**
		 * The meta object literal for the '<em><b>Ticket Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TICKET_IDS = eINSTANCE.getTransaction_TicketIds();

		/**
		 * The meta object literal for the '<em><b>Ticket Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TICKET_ID = eINSTANCE.getTransaction_TicketId();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__FULFILLMENT_IDS = eINSTANCE.getTransaction_FulfillmentIds();

		/**
		 * The meta object literal for the '<em><b>Exchangebooking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__EXCHANGEBOOKING_ID = eINSTANCE.getTransaction_ExchangebookingId();

		/**
		 * The meta object literal for the '<em><b>Transaction Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TRANSACTION_TIME = eINSTANCE.getTransaction_TransactionTime();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AccountedAmountImpl <em>Accounted Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AccountedAmountImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAccountedAmount()
		 * @generated
		 */
		EClass ACCOUNTED_AMOUNT = eINSTANCE.getAccountedAmount();

		/**
		 * The meta object literal for the '<em><b>Settlement Value Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTED_AMOUNT__SETTLEMENT_VALUE_INDICATOR = eINSTANCE.getAccountedAmount_SettlementValueIndicator();

		/**
		 * The meta object literal for the '<em><b>Gross Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTED_AMOUNT__GROSS_AMOUNT = eINSTANCE.getAccountedAmount_GrossAmount();

		/**
		 * The meta object literal for the '<em><b>Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTED_AMOUNT__FEE = eINSTANCE.getAccountedAmount_Fee();

		/**
		 * The meta object literal for the '<em><b>Commission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTED_AMOUNT__COMMISSION = eINSTANCE.getAccountedAmount_Commission();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTED_AMOUNT__CURRENCY = eINSTANCE.getAccountedAmount_Currency();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTED_AMOUNT__AMOUNT = eINSTANCE.getAccountedAmount_Amount();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTED_AMOUNT__RATE = eINSTANCE.getAccountedAmount_Rate();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CodeListsImpl <em>Code Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CodeListsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCodeLists()
		 * @generated
		 */
		EClass CODE_LISTS = eINSTANCE.getCodeLists();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CARRIERS = eINSTANCE.getCodeLists_Carriers();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__STATIONS = eINSTANCE.getCodeLists_Stations();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__COUNTRIES = eINSTANCE.getCodeLists_Countries();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__LANGUAGES = eINSTANCE.getCodeLists_Languages();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CURRENCIES = eINSTANCE.getCodeLists_Currencies();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__SERVICE_BRANDS = eINSTANCE.getCodeLists_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__NUTS_CODES = eINSTANCE.getCodeLists_NutsCodes();

		/**
		 * The meta object literal for the '{@link Accounting.impl.WorkflowHistoryImpl <em>Workflow History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.WorkflowHistoryImpl
		 * @see Accounting.impl.AccountingPackageImpl#getWorkflowHistory()
		 * @generated
		 */
		EClass WORKFLOW_HISTORY = eINSTANCE.getWorkflowHistory();

		/**
		 * The meta object literal for the '<em><b>Workflow Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_HISTORY__WORKFLOW_STEPS = eINSTANCE.getWorkflowHistory_WorkflowSteps();

		/**
		 * The meta object literal for the '{@link Accounting.impl.WorkflowStepImpl <em>Workflow Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.WorkflowStepImpl
		 * @see Accounting.impl.AccountingPackageImpl#getWorkflowStep()
		 * @generated
		 */
		EClass WORKFLOW_STEP = eINSTANCE.getWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_STEP__TIME = eINSTANCE.getWorkflowStep_Time();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_STEP__DESCRIPTION = eINSTANCE.getWorkflowStep_Description();

		/**
		 * The meta object literal for the '{@link Accounting.impl.NUTSCodesImpl <em>NUTS Codes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.NUTSCodesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getNUTSCodes()
		 * @generated
		 */
		EClass NUTS_CODES = eINSTANCE.getNUTSCodes();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTS_CODES__NUTS_CODES = eINSTANCE.getNUTSCodes_NutsCodes();

		/**
		 * The meta object literal for the '{@link Accounting.impl.NutsCodeImpl <em>Nuts Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.NutsCodeImpl
		 * @see Accounting.impl.AccountingPackageImpl#getNutsCode()
		 * @generated
		 */
		EClass NUTS_CODE = eINSTANCE.getNutsCode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTS_CODE__NAME = eINSTANCE.getNutsCode_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTS_CODE__CODE = eINSTANCE.getNutsCode_Code();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceBrandsImpl <em>Service Brands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceBrandsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceBrands()
		 * @generated
		 */
		EClass SERVICE_BRANDS = eINSTANCE.getServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BRANDS__SERVICE_BRANDS = eINSTANCE.getServiceBrands_ServiceBrands();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceBrandImpl <em>Service Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceBrandImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceBrand()
		 * @generated
		 */
		EClass SERVICE_BRAND = eINSTANCE.getServiceBrand();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__CODE = eINSTANCE.getServiceBrand_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__NAME = eINSTANCE.getServiceBrand_Name();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__ABBREVIATION = eINSTANCE.getServiceBrand_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__DESCRIPTION = eINSTANCE.getServiceBrand_Description();

		/**
		 * The meta object literal for the '<em><b>Transport Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__TRANSPORT_MODE = eINSTANCE.getServiceBrand_TransportMode();

		/**
		 * The meta object literal for the '<em><b>Local Language Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__LOCAL_LANGUAGE_NAME = eINSTANCE.getServiceBrand_LocalLanguageName();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CountriesImpl <em>Countries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CountriesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCountries()
		 * @generated
		 */
		EClass COUNTRIES = eINSTANCE.getCountries();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRIES__COUNTRIES = eINSTANCE.getCountries_Countries();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CountryImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__CODE = eINSTANCE.getCountry_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>IS Ocode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__IS_OCODE = eINSTANCE.getCountry_ISOcode();

		/**
		 * The meta object literal for the '<em><b>Default Character Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__DEFAULT_CHARACTER_SET = eINSTANCE.getCountry_DefaultCharacterSet();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LanguagesImpl <em>Languages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LanguagesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLanguages()
		 * @generated
		 */
		EClass LANGUAGES = eINSTANCE.getLanguages();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGES__LANGUAGES = eINSTANCE.getLanguages_Languages();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LanguageImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__CODE = eINSTANCE.getLanguage_Code();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CurrenciesImpl <em>Currencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CurrenciesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCurrencies()
		 * @generated
		 */
		EClass CURRENCIES = eINSTANCE.getCurrencies();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCIES__CURRENCIES = eINSTANCE.getCurrencies_Currencies();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CurrencyImpl <em>Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CurrencyImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCurrency()
		 * @generated
		 */
		EClass CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__NAME = eINSTANCE.getCurrency_Name();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__ISO_CODE = eINSTANCE.getCurrency_IsoCode();

		/**
		 * The meta object literal for the '{@link Accounting.impl.StationsImpl <em>Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.StationsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getStations()
		 * @generated
		 */
		EClass STATIONS = eINSTANCE.getStations();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIONS__STATIONS = eINSTANCE.getStations_Stations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.StationImpl
		 * @see Accounting.impl.AccountingPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__COUNTRY = eINSTANCE.getStation_Country();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__CODE = eINSTANCE.getStation_Code();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LONGITUDE = eINSTANCE.getStation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LATITUDE = eINSTANCE.getStation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Timetable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__TIMETABLE_NAME = eINSTANCE.getStation_TimetableName();

		/**
		 * The meta object literal for the '<em><b>Border Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__BORDER_STATION = eINSTANCE.getStation_BorderStation();

		/**
		 * The meta object literal for the '<em><b>Name Case UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME_CASE_UTF8 = eINSTANCE.getStation_NameCaseUTF8();

		/**
		 * The meta object literal for the '<em><b>Name Case ASCII</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME_CASE_ASCII = eINSTANCE.getStation_NameCaseASCII();

		/**
		 * The meta object literal for the '<em><b>Short Name Case ASCII</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__SHORT_NAME_CASE_ASCII = eINSTANCE.getStation_ShortNameCaseASCII();

		/**
		 * The meta object literal for the '<em><b>Short Name Case UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__SHORT_NAME_CASE_UTF8 = eINSTANCE.getStation_ShortNameCaseUTF8();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LEGACY_BORDER_POINT_CODE = eINSTANCE.getStation_LegacyBorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__STATION_CODE = eINSTANCE.getStation_StationCode();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CarrierImpl <em>Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CarrierImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCarrier()
		 * @generated
		 */
		EClass CARRIER = eINSTANCE.getCarrier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__CODE = eINSTANCE.getCarrier_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__NAME = eINSTANCE.getCarrier_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__SHORT_NAME = eINSTANCE.getCarrier_ShortName();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CarriersImpl <em>Carriers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CarriersImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCarriers()
		 * @generated
		 */
		EClass CARRIERS = eINSTANCE.getCarriers();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIERS__CARRIERS = eINSTANCE.getCarriers_Carriers();

		/**
		 * The meta object literal for the '{@link Accounting.impl.StationSetImpl <em>Station Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.StationSetImpl
		 * @see Accounting.impl.AccountingPackageImpl#getStationSet()
		 * @generated
		 */
		EClass STATION_SET = eINSTANCE.getStationSet();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_SET__STATIONS = eINSTANCE.getStationSet_Stations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.GeneralTariffModelImpl <em>General Tariff Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.GeneralTariffModelImpl
		 * @see Accounting.impl.AccountingPackageImpl#getGeneralTariffModel()
		 * @generated
		 */
		EClass GENERAL_TARIFF_MODEL = eINSTANCE.getGeneralTariffModel();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_TARIFF_MODEL__DELIVERY = eINSTANCE.getGeneralTariffModel_Delivery();

		/**
		 * The meta object literal for the '<em><b>Fare Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_TARIFF_MODEL__FARE_STRUCTURE = eINSTANCE.getGeneralTariffModel_FareStructure();

		/**
		 * The meta object literal for the '{@link Accounting.impl.DeliveryImpl <em>Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.DeliveryImpl
		 * @see Accounting.impl.AccountingPackageImpl#getDelivery()
		 * @generated
		 */
		EClass DELIVERY = eINSTANCE.getDelivery();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ID = eINSTANCE.getDelivery_Id();

		/**
		 * The meta object literal for the '<em><b>Previous Delivery Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__PREVIOUS_DELIVERY_ID = eINSTANCE.getDelivery_PreviousDeliveryId();

		/**
		 * The meta object literal for the '<em><b>Replaced Delivery Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__REPLACED_DELIVERY_ID = eINSTANCE.getDelivery_ReplacedDeliveryId();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__OPTIONAL = eINSTANCE.getDelivery_Optional();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY__PROVIDER = eINSTANCE.getDelivery_Provider();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__SCHEMA_VERSION = eINSTANCE.getDelivery_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Accepted Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ACCEPTED_SCHEMA_VERSION = eINSTANCE.getDelivery_AcceptedSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__USAGE = eINSTANCE.getDelivery_Usage();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AfterSalesRulesImpl <em>After Sales Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AfterSalesRulesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesRules()
		 * @generated
		 */
		EClass AFTER_SALES_RULES = eINSTANCE.getAfterSalesRules();

		/**
		 * The meta object literal for the '<em><b>After Sales Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_RULES__AFTER_SALES_RULES = eINSTANCE.getAfterSalesRules_AfterSalesRules();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AfterSalesRuleImpl <em>After Sales Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AfterSalesRuleImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesRule()
		 * @generated
		 */
		EClass AFTER_SALES_RULE = eINSTANCE.getAfterSalesRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_RULE__ID = eINSTANCE.getAfterSalesRule_Id();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_RULE__DATA_SOURCE = eINSTANCE.getAfterSalesRule_DataSource();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_RULE__CONDITIONS = eINSTANCE.getAfterSalesRule_Conditions();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AfterSalesConditionImpl <em>After Sales Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AfterSalesConditionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesCondition()
		 * @generated
		 */
		EClass AFTER_SALES_CONDITION = eINSTANCE.getAfterSalesCondition();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__TRANSACTION_TYPE = eINSTANCE.getAfterSalesCondition_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Individual Contracts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS = eINSTANCE.getAfterSalesCondition_IndividualContracts();

		/**
		 * The meta object literal for the '<em><b>Carrier Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__CARRIER_FEE = eINSTANCE.getAfterSalesCondition_CarrierFee();

		/**
		 * The meta object literal for the '<em><b>Fee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_CONDITION__FEE = eINSTANCE.getAfterSalesCondition_Fee();

		/**
		 * The meta object literal for the '<em><b>Application Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_CONDITION__APPLICATION_TIME = eINSTANCE.getAfterSalesCondition_ApplicationTime();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ApplicationTimeImpl <em>Application Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ApplicationTimeImpl
		 * @see Accounting.impl.AccountingPackageImpl#getApplicationTime()
		 * @generated
		 */
		EClass APPLICATION_TIME = eINSTANCE.getApplicationTime();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareStructureImpl <em>Fare Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareStructureImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareStructure()
		 * @generated
		 */
		EClass FARE_STRUCTURE = eINSTANCE.getFareStructure();

		/**
		 * The meta object literal for the '<em><b>Service Class Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = eINSTANCE.getFareStructure_ServiceClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Level Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = eINSTANCE.getFareStructure_ServiceLevelDefinitions();

		/**
		 * The meta object literal for the '<em><b>Station Names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__STATION_NAMES = eINSTANCE.getFareStructure_StationNames();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStructure_FareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CALENDARS = eINSTANCE.getFareStructure_Calendars();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TEXTS = eINSTANCE.getFareStructure_Texts();

		/**
		 * The meta object literal for the '<em><b>Reduction Cards</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CARDS = eINSTANCE.getFareStructure_ReductionCards();

		/**
		 * The meta object literal for the '<em><b>Fare Constraint Bundles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES = eINSTANCE.getFareStructure_FareConstraintBundles();

		/**
		 * The meta object literal for the '<em><b>Fare Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_ELEMENTS = eINSTANCE.getFareStructure_FareElements();

		/**
		 * The meta object literal for the '<em><b>Combination Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__COMBINATION_CONSTRAINTS = eINSTANCE.getFareStructure_CombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Sales Availability Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getFareStructure_SalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '<em><b>Travel Validity Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getFareStructure_TravelValidityConstraints();

		/**
		 * The meta object literal for the '<em><b>Regional Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REGIONAL_CONSTRAINTS = eINSTANCE.getFareStructure_RegionalConstraints();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CONNECTION_POINTS = eINSTANCE.getFareStructure_ConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CARRIER_CONSTRAINTS = eINSTANCE.getFareStructure_CarrierConstraints();

		/**
		 * The meta object literal for the '<em><b>Service Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CONSTRAINTS = eINSTANCE.getFareStructure_ServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PASSENGER_CONSTRAINTS = eINSTANCE.getFareStructure_PassengerConstraints();

		/**
		 * The meta object literal for the '<em><b>Total Passenger Combination Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = eINSTANCE.getFareStructure_TotalPassengerCombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CONSTRAINTS = eINSTANCE.getFareStructure_ReductionConstraints();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getFareStructure_PersonalDataConstraints();

		/**
		 * The meta object literal for the '<em><b>After Sales Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__AFTER_SALES_RULES = eINSTANCE.getFareStructure_AfterSalesRules();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PRICES = eINSTANCE.getFareStructure_Prices();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS = eINSTANCE.getFareStructure_FulfillmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__RESERVATION_PARAMETERS = eINSTANCE.getFareStructure_ReservationParameters();

		/**
		 * The meta object literal for the '<em><b>Supported Online Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = eINSTANCE.getFareStructure_SupportedOnlineServices();

		/**
		 * The meta object literal for the '<em><b>Fare Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = eINSTANCE.getFareStructure_FareResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Zone Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__ZONE_DEFINITIONS = eINSTANCE.getFareStructure_ZoneDefinitions();

		/**
		 * The meta object literal for the '<em><b>Luggage Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__LUGGAGE_CONSTRAINTS = eINSTANCE.getFareStructure_LuggageConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ConnectionPointsImpl <em>Connection Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ConnectionPointsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getConnectionPoints()
		 * @generated
		 */
		EClass CONNECTION_POINTS = eINSTANCE.getConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINTS__CONNECTION_POINTS = eINSTANCE.getConnectionPoints_ConnectionPoints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ConnectionPointImpl
		 * @see Accounting.impl.AccountingPackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__ID = eINSTANCE.getConnectionPoint_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__NAME = eINSTANCE.getConnectionPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__LEGACY_BORDER_POINT_CODE = eINSTANCE.getConnectionPoint_LegacyBorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__DESCRIPTION = eINSTANCE.getConnectionPoint_Description();

		/**
		 * The meta object literal for the '<em><b>Connected Station Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__CONNECTED_STATION_SETS = eINSTANCE.getConnectionPoint_ConnectedStationSets();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__DATA_SOURCE = eINSTANCE.getConnectionPoint_DataSource();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__NAME_UTF8 = eINSTANCE.getConnectionPoint_NameUtf8();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareResourceLocationsImpl <em>Fare Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareResourceLocationsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareResourceLocations()
		 * @generated
		 */
		EClass FARE_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Train Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_TrainResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Station Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_StationResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Carrier Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_CarrierResourceLocations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TrainResourceLocationsImpl <em>Train Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TrainResourceLocationsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTrainResourceLocations()
		 * @generated
		 */
		EClass TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getTrainResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Train Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getTrainResourceLocations_TrainResourceLocations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.StationResourceLocationsImpl <em>Station Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.StationResourceLocationsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getStationResourceLocations()
		 * @generated
		 */
		EClass STATION_RESOURCE_LOCATIONS = eINSTANCE.getStationResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Station Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = eINSTANCE.getStationResourceLocations_StationResourceLocations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CarrierResourceLocationsImpl <em>Carrier Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CarrierResourceLocationsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCarrierResourceLocations()
		 * @generated
		 */
		EClass CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getCarrierResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Carrier Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getCarrierResourceLocations_CarrierResourceLocations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TrainResourceLocationImpl <em>Train Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TrainResourceLocationImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTrainResourceLocation()
		 * @generated
		 */
		EClass TRAIN_RESOURCE_LOCATION = eINSTANCE.getTrainResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATION__CARRIER = eINSTANCE.getTrainResourceLocation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getTrainResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '<em><b>Train Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_RESOURCE_LOCATION__TRAIN_ID = eINSTANCE.getTrainResourceLocation_TrainId();

		/**
		 * The meta object literal for the '{@link Accounting.impl.StationResourceLocationImpl <em>Station Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.StationResourceLocationImpl
		 * @see Accounting.impl.AccountingPackageImpl#getStationResourceLocation()
		 * @generated
		 */
		EClass STATION_RESOURCE_LOCATION = eINSTANCE.getStationResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getStationResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__STATIONS = eINSTANCE.getStationResourceLocation_Stations();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__CONNECTION_POINTS = eINSTANCE.getStationResourceLocation_ConnectionPoints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CarrierResourceLocationImpl <em>Carrier Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CarrierResourceLocationImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCarrierResourceLocation()
		 * @generated
		 */
		EClass CARRIER_RESOURCE_LOCATION = eINSTANCE.getCarrierResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__CARRIER = eINSTANCE.getCarrierResourceLocation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Service Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__SERVICE_BRAND = eINSTANCE.getCarrierResourceLocation_ServiceBrand();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getCarrierResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '{@link Accounting.impl.OnlineResourceImpl <em>Online Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.OnlineResourceImpl
		 * @see Accounting.impl.AccountingPackageImpl#getOnlineResource()
		 * @generated
		 */
		EClass ONLINE_RESOURCE = eINSTANCE.getOnlineResource();

		/**
		 * The meta object literal for the '<em><b>Offer Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__OFFER_REQUEST_TYPE = eINSTANCE.getOnlineResource_OfferRequestType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__INTERFACE_TYPE = eINSTANCE.getOnlineResource_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__VERSION = eINSTANCE.getOnlineResource_Version();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__SYSTEM = eINSTANCE.getOnlineResource_System();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FulfillmentConstraintsImpl <em>Fulfillment Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FulfillmentConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFulfillmentConstraints()
		 * @generated
		 */
		EClass FULFILLMENT_CONSTRAINTS = eINSTANCE.getFulfillmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS = eINSTANCE.getFulfillmentConstraints_FulfillmentConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FulfillmentConstraintImpl <em>Fulfillment Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FulfillmentConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFulfillmentConstraint()
		 * @generated
		 */
		EClass FULFILLMENT_CONSTRAINT = eINSTANCE.getFulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ID = eINSTANCE.getFulfillmentConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Accepted Fulfilment Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES = eINSTANCE.getFulfillmentConstraint_AcceptedFulfilmentTypes();

		/**
		 * The meta object literal for the '<em><b>Required Control Data Exchange</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE = eINSTANCE.getFulfillmentConstraint_RequiredControlDataExchange();

		/**
		 * The meta object literal for the '<em><b>Individual Ticketing Permitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED = eINSTANCE.getFulfillmentConstraint_IndividualTicketingPermitted();

		/**
		 * The meta object literal for the '<em><b>Separate Ful Fillment Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED = eINSTANCE.getFulfillmentConstraint_SeparateFulFillmentRequired();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = eINSTANCE.getFulfillmentConstraint_AcceptedBarcodes();

		/**
		 * The meta object literal for the '<em><b>Required Barcodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES = eINSTANCE.getFulfillmentConstraint_RequiredBarcodes();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getFulfillmentConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcode Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES = eINSTANCE.getFulfillmentConstraint_AcceptedBarcodeTypes();

		/**
		 * The meta object literal for the '<em><b>Required Barcode Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES = eINSTANCE.getFulfillmentConstraint_RequiredBarcodeTypes();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RequiredBarcodesImpl <em>Required Barcodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RequiredBarcodesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRequiredBarcodes()
		 * @generated
		 */
		EClass REQUIRED_BARCODES = eINSTANCE.getRequiredBarcodes();

		/**
		 * The meta object literal for the '<em><b>Required Barcodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BARCODES__REQUIRED_BARCODES = eINSTANCE.getRequiredBarcodes_RequiredBarcodes();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AcceptedBarcodesImpl <em>Accepted Barcodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AcceptedBarcodesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAcceptedBarcodes()
		 * @generated
		 */
		EClass ACCEPTED_BARCODES = eINSTANCE.getAcceptedBarcodes();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTED_BARCODES__ACCEPTED_BARCODES = eINSTANCE.getAcceptedBarcodes_AcceptedBarcodes();

		/**
		 * The meta object literal for the '{@link Accounting.impl.SupportedOnlineServicesImpl <em>Supported Online Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.SupportedOnlineServicesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getSupportedOnlineServices()
		 * @generated
		 */
		EClass SUPPORTED_ONLINE_SERVICES = eINSTANCE.getSupportedOnlineServices();

		/**
		 * The meta object literal for the '<em><b>Supported Online Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES = eINSTANCE.getSupportedOnlineServices_SupportedOnlineServices();

		/**
		 * The meta object literal for the '{@link Accounting.impl.StationNamesImpl <em>Station Names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.StationNamesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getStationNames()
		 * @generated
		 */
		EClass STATION_NAMES = eINSTANCE.getStationNames();

		/**
		 * The meta object literal for the '<em><b>Station Name</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_NAMES__STATION_NAME = eINSTANCE.getStationNames_StationName();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareElementsImpl <em>Fare Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareElementsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareElements()
		 * @generated
		 */
		EClass FARE_ELEMENTS = eINSTANCE.getFareElements();

		/**
		 * The meta object literal for the '<em><b>Fare Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENTS__FARE_ELEMENTS = eINSTANCE.getFareElements_FareElements();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareElementImpl <em>Fare Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareElementImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareElement()
		 * @generated
		 */
		EClass FARE_ELEMENT = eINSTANCE.getFareElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__ID = eINSTANCE.getFareElement_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__TYPE = eINSTANCE.getFareElement_Type();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__DATA_DESCRIPTION = eINSTANCE.getFareElement_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Fare Constraint Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FARE_CONSTRAINT_BUNDLE = eINSTANCE.getFareElement_FareConstraintBundle();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__TEXT = eINSTANCE.getFareElement_Text();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PRICE = eINSTANCE.getFareElement_Price();

		/**
		 * The meta object literal for the '<em><b>Regional Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__REGIONAL_CONSTRAINT = eINSTANCE.getFareElement_RegionalConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_CONSTRAINT = eINSTANCE.getFareElement_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__CARRIER_CONSTRAINT = eINSTANCE.getFareElement_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_CLASS = eINSTANCE.getFareElement_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_LEVEL = eINSTANCE.getFareElement_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Sales Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SALES_AVAILABILITY = eINSTANCE.getFareElement_SalesAvailability();

		/**
		 * The meta object literal for the '<em><b>Travel Validity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__TRAVEL_VALIDITY = eINSTANCE.getFareElement_TravelValidity();

		/**
		 * The meta object literal for the '<em><b>Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__COMBINATION_CONSTRAINT = eINSTANCE.getFareElement_CombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Fare Detail Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FARE_DETAIL_DESCRIPTION = eINSTANCE.getFareElement_FareDetailDescription();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT = eINSTANCE.getFareElement_PersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__RESERVATION_PARAMETER = eINSTANCE.getFareElement_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__REDUCTION_CONSTRAINT = eINSTANCE.getFareElement_ReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FULFILLMENT_CONSTRAINT = eINSTANCE.getFareElement_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PASSENGER_CONSTRAINT = eINSTANCE.getFareElement_PassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Regulatory Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__REGULATORY_CONDITIONS = eINSTANCE.getFareElement_RegulatoryConditions();

		/**
		 * The meta object literal for the '<em><b>After Sales Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__AFTER_SALES_RULE = eINSTANCE.getFareElement_AfterSalesRule();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__DATA_SOURCE = eINSTANCE.getFareElement_DataSource();

		/**
		 * The meta object literal for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getFareElement_LegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '<em><b>Legacy Conversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__LEGACY_CONVERSION = eINSTANCE.getFareElement_LegacyConversion();

		/**
		 * The meta object literal for the '<em><b>Individual Contracts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__INDIVIDUAL_CONTRACTS = eINSTANCE.getFareElement_IndividualContracts();

		/**
		 * The meta object literal for the '<em><b>Involved Tcos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__INVOLVED_TCOS = eINSTANCE.getFareElement_InvolvedTcos();

		/**
		 * The meta object literal for the '<em><b>Luggage Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__LUGGAGE_CONSTRAINT = eINSTANCE.getFareElement_LuggageConstraint();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TotalPassengerCombinationConstraintsImpl <em>Total Passenger Combination Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TotalPassengerCombinationConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTotalPassengerCombinationConstraints()
		 * @generated
		 */
		EClass TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = eINSTANCE.getTotalPassengerCombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Total Passenger Combination Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT = eINSTANCE.getTotalPassengerCombinationConstraints_TotalPassengerCombinationConstraint();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TotalPassengerCombinationConstraintImpl <em>Total Passenger Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TotalPassengerCombinationConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTotalPassengerCombinationConstraint()
		 * @generated
		 */
		EClass TOTAL_PASSENGER_COMBINATION_CONSTRAINT = eINSTANCE.getTotalPassengerCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID = eINSTANCE.getTotalPassengerCombinationConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getTotalPassengerCombinationConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Max Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getTotalPassengerCombinationConstraint_MaxTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Min Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getTotalPassengerCombinationConstraint_MinTotalPassengerWeight();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareConstraintBundlesImpl <em>Fare Constraint Bundles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareConstraintBundlesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareConstraintBundles()
		 * @generated
		 */
		EClass FARE_CONSTRAINT_BUNDLES = eINSTANCE.getFareConstraintBundles();

		/**
		 * The meta object literal for the '<em><b>Fare Constraint Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES = eINSTANCE.getFareConstraintBundles_FareConstraintBundles();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareConstraintBundleImpl <em>Fare Constraint Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareConstraintBundleImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareConstraintBundle()
		 * @generated
		 */
		EClass FARE_CONSTRAINT_BUNDLE = eINSTANCE.getFareConstraintBundle();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__ID = eINSTANCE.getFareConstraintBundle_Id();

		/**
		 * The meta object literal for the '<em><b>Default Fare Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE = eINSTANCE.getFareConstraintBundle_DefaultFareType();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION = eINSTANCE.getFareConstraintBundle_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT = eINSTANCE.getFareConstraintBundle_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Sales Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY = eINSTANCE.getFareConstraintBundle_SalesAvailability();

		/**
		 * The meta object literal for the '<em><b>Travel Validity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY = eINSTANCE.getFareConstraintBundle_TravelValidity();

		/**
		 * The meta object literal for the '<em><b>Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT = eINSTANCE.getFareConstraintBundle_CombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT = eINSTANCE.getFareConstraintBundle_PersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT = eINSTANCE.getFareConstraintBundle_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Total Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT = eINSTANCE.getFareConstraintBundle_TotalPassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Default Regulatory Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS = eINSTANCE.getFareConstraintBundle_DefaultRegulatoryConditions();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DATA_SOURCE = eINSTANCE.getFareConstraintBundle_DataSource();

		/**
		 * The meta object literal for the '<em><b>Converted Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES = eINSTANCE.getFareConstraintBundle_ConvertedBundles();

		/**
		 * The meta object literal for the '<em><b>Luggage Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__LUGGAGE_CONSTRAINT = eINSTANCE.getFareConstraintBundle_LuggageConstraint();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareStationSetDefinitionsImpl <em>Fare Station Set Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareStationSetDefinitionsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareStationSetDefinitions()
		 * @generated
		 */
		EClass FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStationSetDefinitions_FareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Find Fare Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT = eINSTANCE.getFareStationSetDefinitions__FindFareSet__Carrier_int();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareStationSetDefinitionImpl <em>Fare Station Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareStationSetDefinitionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareStationSetDefinition()
		 * @generated
		 */
		EClass FARE_STATION_SET_DEFINITION = eINSTANCE.getFareStationSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__DATA_SOURCE = eINSTANCE.getFareStationSetDefinition_DataSource();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITION__CARRIER = eINSTANCE.getFareStationSetDefinition_Carrier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__CODE = eINSTANCE.getFareStationSetDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__LEGACY_CODE = eINSTANCE.getFareStationSetDefinition_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__ID = eINSTANCE.getFareStationSetDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__NAME = eINSTANCE.getFareStationSetDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__NAME_UTF8 = eINSTANCE.getFareStationSetDefinition_NameUtf8();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITION__STATIONS = eINSTANCE.getFareStationSetDefinition_Stations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LegacyAccountingIdentifierImpl <em>Legacy Accounting Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LegacyAccountingIdentifierImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLegacyAccountingIdentifier()
		 * @generated
		 */
		EClass LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getLegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '<em><b>Series Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID = eINSTANCE.getLegacyAccountingIdentifier_SeriesId();

		/**
		 * The meta object literal for the '<em><b>Tariff Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID = eINSTANCE.getLegacyAccountingIdentifier_TariffId();

		/**
		 * The meta object literal for the '<em><b>Add Series Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID = eINSTANCE.getLegacyAccountingIdentifier_AddSeriesId();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PersonalDataConstraintsImpl <em>Personal Data Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PersonalDataConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataConstraints()
		 * @generated
		 */
		EClass PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getPersonalDataConstraints();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getPersonalDataConstraints_PersonalDataConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PersonalDataConstraintImpl <em>Personal Data Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PersonalDataConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataConstraint()
		 * @generated
		 */
		EClass PERSONAL_DATA_CONSTRAINT = eINSTANCE.getPersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA_CONSTRAINT__ID = eINSTANCE.getPersonalDataConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Required Personal Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA = eINSTANCE.getPersonalDataConstraint_RequiredPersonalData();

		/**
		 * The meta object literal for the '<em><b>Allowed Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES = eINSTANCE.getPersonalDataConstraint_AllowedChanges();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RequiredPersonalDataImpl <em>Required Personal Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RequiredPersonalDataImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRequiredPersonalData()
		 * @generated
		 */
		EClass REQUIRED_PERSONAL_DATA = eINSTANCE.getRequiredPersonalData();

		/**
		 * The meta object literal for the '<em><b>Ticket Holder Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY = eINSTANCE.getRequiredPersonalData_TicketHolderOnly();

		/**
		 * The meta object literal for the '<em><b>Data Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__DATA_ITEM = eINSTANCE.getRequiredPersonalData_DataItem();

		/**
		 * The meta object literal for the '<em><b>Transfer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__TRANSFER = eINSTANCE.getRequiredPersonalData_Transfer();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE = eINSTANCE.getRequiredPersonalData_FulfillmentType();

		/**
		 * The meta object literal for the '<em><b>Cross Border</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_PERSONAL_DATA__CROSS_BORDER = eINSTANCE.getRequiredPersonalData_CrossBorder();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AllowedPersonalDataChangesImpl <em>Allowed Personal Data Changes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AllowedPersonalDataChangesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAllowedPersonalDataChanges()
		 * @generated
		 */
		EClass ALLOWED_PERSONAL_DATA_CHANGES = eINSTANCE.getAllowedPersonalDataChanges();

		/**
		 * The meta object literal for the '<em><b>Time Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT = eINSTANCE.getAllowedPersonalDataChanges_TimeLimit();

		/**
		 * The meta object literal for the '<em><b>Accepted Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON = eINSTANCE.getAllowedPersonalDataChanges_AcceptedReason();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PassengerConstraintsImpl <em>Passenger Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PassengerConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPassengerConstraints()
		 * @generated
		 */
		EClass PASSENGER_CONSTRAINTS = eINSTANCE.getPassengerConstraints();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS = eINSTANCE.getPassengerConstraints_PassengerConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PassengerConstraintImpl <em>Passenger Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PassengerConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPassengerConstraint()
		 * @generated
		 */
		EClass PASSENGER_CONSTRAINT = eINSTANCE.getPassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__ID = eINSTANCE.getPassengerConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Traveler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__TRAVELER_TYPE = eINSTANCE.getPassengerConstraint_TravelerType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__TEXT = eINSTANCE.getPassengerConstraint_Text();

		/**
		 * The meta object literal for the '<em><b>Upper Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT = eINSTANCE.getPassengerConstraint_UpperAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Lower Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT = eINSTANCE.getPassengerConstraint_LowerAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Travel Alone Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT = eINSTANCE.getPassengerConstraint_TravelAloneAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Reservation Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT = eINSTANCE.getPassengerConstraint_ReservationAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Is Ancilliary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__IS_ANCILLIARY = eINSTANCE.getPassengerConstraint_IsAncilliary();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_PassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Max Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_MaxTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Min Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_MinTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Included Free Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS = eINSTANCE.getPassengerConstraint_IncludedFreePassengers();

		/**
		 * The meta object literal for the '<em><b>Excluded Passenger Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS = eINSTANCE.getPassengerConstraint_ExcludedPassengerCombinations();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getPassengerConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__DATA_SOURCE = eINSTANCE.getPassengerConstraint_DataSource();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PassengerCombinationConstraintImpl <em>Passenger Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PassengerCombinationConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPassengerCombinationConstraint()
		 * @generated
		 */
		EClass PASSENGER_COMBINATION_CONSTRAINT = eINSTANCE.getPassengerCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER = eINSTANCE.getPassengerCombinationConstraint_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Min Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER = eINSTANCE.getPassengerCombinationConstraint_MinNumber();

		/**
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE = eINSTANCE.getPassengerCombinationConstraint_PassengerType();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT = eINSTANCE.getPassengerCombinationConstraint_PassengerConstraint();

		/**
		 * The meta object literal for the '{@link Accounting.impl.IncludedFreePassengerLimitImpl <em>Included Free Passenger Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.IncludedFreePassengerLimitImpl
		 * @see Accounting.impl.AccountingPackageImpl#getIncludedFreePassengerLimit()
		 * @generated
		 */
		EClass INCLUDED_FREE_PASSENGER_LIMIT = eINSTANCE.getIncludedFreePassengerLimit();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FREE_PASSENGER_LIMIT__NUMBER = eINSTANCE.getIncludedFreePassengerLimit_Number();

		/**
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE = eINSTANCE.getIncludedFreePassengerLimit_PassengerType();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_CONSTRAINT = eINSTANCE.getIncludedFreePassengerLimit_PassengerConstraint();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CombinationConstraintsImpl <em>Combination Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CombinationConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCombinationConstraints()
		 * @generated
		 */
		EClass COMBINATION_CONSTRAINTS = eINSTANCE.getCombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Combination Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS = eINSTANCE.getCombinationConstraints_CombinationConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CombinationConstraintImpl <em>Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CombinationConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCombinationConstraint()
		 * @generated
		 */
		EClass COMBINATION_CONSTRAINT = eINSTANCE.getCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATION_CONSTRAINT__ID = eINSTANCE.getCombinationConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATION_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getCombinationConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Combination Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_CONSTRAINT__COMBINATION_MODELS = eINSTANCE.getCombinationConstraint_CombinationModels();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TravelValidityConstraintsImpl <em>Travel Validity Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TravelValidityConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTravelValidityConstraints()
		 * @generated
		 */
		EClass TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getTravelValidityConstraints();

		/**
		 * The meta object literal for the '<em><b>Travel Validity Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getTravelValidityConstraints_TravelValidityConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TravelValidityConstraintImpl <em>Travel Validity Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TravelValidityConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTravelValidityConstraint()
		 * @generated
		 */
		EClass TRAVEL_VALIDITY_CONSTRAINT = eINSTANCE.getTravelValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__ID = eINSTANCE.getTravelValidityConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getTravelValidityConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Valid Days</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS = eINSTANCE.getTravelValidityConstraint_ValidDays();

		/**
		 * The meta object literal for the '<em><b>Travel Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS = eINSTANCE.getTravelValidityConstraint_TravelDays();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__RANGE = eINSTANCE.getTravelValidityConstraint_Range();

		/**
		 * The meta object literal for the '<em><b>Return Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT = eINSTANCE.getTravelValidityConstraint_ReturnConstraint();

		/**
		 * The meta object literal for the '<em><b>Excluded Time Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = eINSTANCE.getTravelValidityConstraint_ExcludedTimeRange();

		/**
		 * The meta object literal for the '<em><b>Train Validity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY = eINSTANCE.getTravelValidityConstraint_TrainValidity();

		/**
		 * The meta object literal for the '<em><b>Validity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE = eINSTANCE.getTravelValidityConstraint_ValidityType();

		/**
		 * The meta object literal for the '<em><b>Trip Interruption Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT = eINSTANCE.getTravelValidityConstraint_TripInterruptionConstraint();

		/**
		 * The meta object literal for the '<em><b>Trip Allocation Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT = eINSTANCE.getTravelValidityConstraint_TripAllocationConstraint();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TrainValidityImpl <em>Train Validity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TrainValidityImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTrainValidity()
		 * @generated
		 */
		EClass TRAIN_VALIDITY = eINSTANCE.getTrainValidity();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_VALIDITY__CARRIER_CONSTRAINT = eINSTANCE.getTrainValidity_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Serrvice Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_VALIDITY__SERRVICE_CONSTRAINT = eINSTANCE.getTrainValidity_SerrviceConstraint();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_VALIDITY__SCOPE = eINSTANCE.getTrainValidity_Scope();

		/**
		 * The meta object literal for the '{@link Accounting.impl.SalesAvailabilityConstraintsImpl <em>Sales Availability Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.SalesAvailabilityConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getSalesAvailabilityConstraints()
		 * @generated
		 */
		EClass SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getSalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '<em><b>Sales Availability Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getSalesAvailabilityConstraints_SalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.SalesAvailabilityConstraintImpl <em>Sales Availability Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.SalesAvailabilityConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getSalesAvailabilityConstraint()
		 * @generated
		 */
		EClass SALES_AVAILABILITY_CONSTRAINT = eINSTANCE.getSalesAvailabilityConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__ID = eINSTANCE.getSalesAvailabilityConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getSalesAvailabilityConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS = eINSTANCE.getSalesAvailabilityConstraint_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__DATA_SOURCE = eINSTANCE.getSalesAvailabilityConstraint_DataSource();

		/**
		 * The meta object literal for the '{@link Accounting.impl.SalesRestrictionImpl <em>Sales Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.SalesRestrictionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getSalesRestriction()
		 * @generated
		 */
		EClass SALES_RESTRICTION = eINSTANCE.getSalesRestriction();

		/**
		 * The meta object literal for the '<em><b>Sales Dates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__SALES_DATES = eINSTANCE.getSalesRestriction_SalesDates();

		/**
		 * The meta object literal for the '<em><b>Start Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__START_OF_SALE = eINSTANCE.getSalesRestriction_StartOfSale();

		/**
		 * The meta object literal for the '<em><b>End Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__END_OF_SALE = eINSTANCE.getSalesRestriction_EndOfSale();

		/**
		 * The meta object literal for the '{@link Accounting.impl.EndOfSaleImpl <em>End Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.EndOfSaleImpl
		 * @see Accounting.impl.AccountingPackageImpl#getEndOfSale()
		 * @generated
		 */
		EClass END_OF_SALE = eINSTANCE.getEndOfSale();

		/**
		 * The meta object literal for the '{@link Accounting.impl.StartOfSaleImpl <em>Start Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.StartOfSaleImpl
		 * @see Accounting.impl.AccountingPackageImpl#getStartOfSale()
		 * @generated
		 */
		EClass START_OF_SALE = eINSTANCE.getStartOfSale();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CarrierConstraintsImpl <em>Carrier Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CarrierConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCarrierConstraints()
		 * @generated
		 */
		EClass CARRIER_CONSTRAINTS = eINSTANCE.getCarrierConstraints();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS = eINSTANCE.getCarrierConstraints_CarrierConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CarrierConstraintImpl <em>Carrier Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CarrierConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCarrierConstraint()
		 * @generated
		 */
		EClass CARRIER_CONSTRAINT = eINSTANCE.getCarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__ID = eINSTANCE.getCarrierConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Included Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINT__INCLUDED_CARRIERS = eINSTANCE.getCarrierConstraint_IncludedCarriers();

		/**
		 * The meta object literal for the '<em><b>Excluded Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINT__EXCLUDED_CARRIERS = eINSTANCE.getCarrierConstraint_ExcludedCarriers();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getCarrierConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__DATA_SOURCE = eINSTANCE.getCarrierConstraint_DataSource();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceConstraintsImpl <em>Service Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceConstraints()
		 * @generated
		 */
		EClass SERVICE_CONSTRAINTS = eINSTANCE.getServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Service Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS = eINSTANCE.getServiceConstraints_ServiceConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceConstraintImpl <em>Service Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceConstraint()
		 * @generated
		 */
		EClass SERVICE_CONSTRAINT = eINSTANCE.getServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSTRAINT__ID = eINSTANCE.getServiceConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Included Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS = eINSTANCE.getServiceConstraint_IncludedServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Excluded Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS = eINSTANCE.getServiceConstraint_ExcludedServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getServiceConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Legacy108 Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSTRAINT__LEGACY108_CODE = eINSTANCE.getServiceConstraint_Legacy108Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__DESCRIPTION = eINSTANCE.getServiceConstraint_Description();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RegionalConstraintsImpl <em>Regional Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RegionalConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRegionalConstraints()
		 * @generated
		 */
		EClass REGIONAL_CONSTRAINTS = eINSTANCE.getRegionalConstraints();

		/**
		 * The meta object literal for the '<em><b>Regional Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS = eINSTANCE.getRegionalConstraints_RegionalConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RegionalConstraintImpl <em>Regional Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RegionalConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRegionalConstraint()
		 * @generated
		 */
		EClass REGIONAL_CONSTRAINT = eINSTANCE.getRegionalConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__ID = eINSTANCE.getRegionalConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DISTANCE = eINSTANCE.getRegionalConstraint_Distance();

		/**
		 * The meta object literal for the '<em><b>Entry Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT = eINSTANCE.getRegionalConstraint_EntryConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Exit Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT = eINSTANCE.getRegionalConstraint_ExitConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Regional Validity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__REGIONAL_VALIDITY = eINSTANCE.getRegionalConstraint_RegionalValidity();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DATA_SOURCE = eINSTANCE.getRegionalConstraint_DataSource();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getRegionalConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Linked Fares</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__LINKED_FARES = eINSTANCE.getRegionalConstraint_LinkedFares();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RegionalValidityImpl <em>Regional Validity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RegionalValidityImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRegionalValidity()
		 * @generated
		 */
		EClass REGIONAL_VALIDITY = eINSTANCE.getRegionalValidity();

		/**
		 * The meta object literal for the '<em><b>Seq Nb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_VALIDITY__SEQ_NB = eINSTANCE.getRegionalValidity_SeqNb();

		/**
		 * The meta object literal for the '<em><b>Via Station</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__VIA_STATION = eINSTANCE.getRegionalValidity_ViaStation();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__ZONE = eINSTANCE.getRegionalValidity_Zone();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__LINE = eINSTANCE.getRegionalValidity_Line();

		/**
		 * The meta object literal for the '<em><b>Polygone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__POLYGONE = eINSTANCE.getRegionalValidity_Polygone();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__CARRIER_CONSTRAINT = eINSTANCE.getRegionalValidity_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__SERVICE_CONSTRAINT = eINSTANCE.getRegionalValidity_ServiceConstraint();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceLevelDefinitionsImpl <em>Service Level Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceLevelDefinitionsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceLevelDefinitions()
		 * @generated
		 */
		EClass SERVICE_LEVEL_DEFINITIONS = eINSTANCE.getServiceLevelDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Level Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION = eINSTANCE.getServiceLevelDefinitions_ServiceLevelDefinition();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TextsImpl <em>Texts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TextsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTexts()
		 * @generated
		 */
		EClass TEXTS = eINSTANCE.getTexts();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTS__TEXTS = eINSTANCE.getTexts_Texts();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TextImpl
		 * @see Accounting.impl.AccountingPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ID = eINSTANCE.getText_Id();

		/**
		 * The meta object literal for the '<em><b>Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_UTF8 = eINSTANCE.getText_TextUTF8();

		/**
		 * The meta object literal for the '<em><b>Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_ICAO = eINSTANCE.getText_TextICAO();

		/**
		 * The meta object literal for the '<em><b>Short Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SHORT_TEXT_UTF8 = eINSTANCE.getText_ShortTextUTF8();

		/**
		 * The meta object literal for the '<em><b>Short Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SHORT_TEXT_ICAO = eINSTANCE.getText_ShortTextICAO();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__TRANSLATIONS = eINSTANCE.getText_Translations();

		/**
		 * The meta object literal for the '<em><b>Standard Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__STANDARD_TEXT = eINSTANCE.getText_StandardText();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__DATA_SOURCE = eINSTANCE.getText_DataSource();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TranslationImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__LANGUAGE = eINSTANCE.getTranslation_Language();

		/**
		 * The meta object literal for the '<em><b>Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TEXT_UTF8 = eINSTANCE.getTranslation_TextUTF8();

		/**
		 * The meta object literal for the '<em><b>Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TEXT_ICAO = eINSTANCE.getTranslation_TextICAO();

		/**
		 * The meta object literal for the '<em><b>Short Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__SHORT_TEXT_UTF8 = eINSTANCE.getTranslation_ShortTextUTF8();

		/**
		 * The meta object literal for the '<em><b>Short Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__SHORT_TEXT_ICAO = eINSTANCE.getTranslation_ShortTextICAO();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PricesImpl <em>Prices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PricesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPrices()
		 * @generated
		 */
		EClass PRICES = eINSTANCE.getPrices();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICES__PRICES = eINSTANCE.getPrices_Prices();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PriceImpl <em>Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PriceImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPrice()
		 * @generated
		 */
		EClass PRICE = eINSTANCE.getPrice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__ID = eINSTANCE.getPrice_Id();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICE__CURRENCIES = eINSTANCE.getPrice_Currencies();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__DATA_SOURCE = eINSTANCE.getPrice_DataSource();

		/**
		 * The meta object literal for the '{@link Accounting.impl.VATDetailImpl <em>VAT Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.VATDetailImpl
		 * @see Accounting.impl.AccountingPackageImpl#getVATDetail()
		 * @generated
		 */
		EClass VAT_DETAIL = eINSTANCE.getVATDetail();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__AMOUNT = eINSTANCE.getVATDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__PERCENTAGE = eINSTANCE.getVATDetail_Percentage();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAT_DETAIL__COUNTRY = eINSTANCE.getVATDetail_Country();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__TAX_ID = eINSTANCE.getVATDetail_TaxId();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__SCOPE = eINSTANCE.getVATDetail_Scope();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CurrencyPriceImpl <em>Currency Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CurrencyPriceImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCurrencyPrice()
		 * @generated
		 */
		EClass CURRENCY_PRICE = eINSTANCE.getCurrencyPrice();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_PRICE__CURRENCY = eINSTANCE.getCurrencyPrice_Currency();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_PRICE__AMOUNT = eINSTANCE.getCurrencyPrice_Amount();

		/**
		 * The meta object literal for the '<em><b>VA Tdetails</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_PRICE__VA_TDETAILS = eINSTANCE.getCurrencyPrice_VATdetails();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceClassDefinitionsImpl <em>Service Class Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceClassDefinitionsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceClassDefinitions()
		 * @generated
		 */
		EClass SERVICE_CLASS_DEFINITIONS = eINSTANCE.getServiceClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Class Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS = eINSTANCE.getServiceClassDefinitions_ServiceClassDefinitions();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CalendarsImpl <em>Calendars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CalendarsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCalendars()
		 * @generated
		 */
		EClass CALENDARS = eINSTANCE.getCalendars();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARS__CALENDARS = eINSTANCE.getCalendars_Calendars();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CalendarImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__NAME = eINSTANCE.getCalendar_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__ID = eINSTANCE.getCalendar_Id();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__FROM_DATE = eINSTANCE.getCalendar_FromDate();

		/**
		 * The meta object literal for the '<em><b>Until Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UNTIL_DATE = eINSTANCE.getCalendar_UntilDate();

		/**
		 * The meta object literal for the '<em><b>Utc Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UTC_OFFSET = eINSTANCE.getCalendar_UtcOffset();

		/**
		 * The meta object literal for the '<em><b>Dates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__DATES = eINSTANCE.getCalendar_Dates();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__DATA_SOURCE = eINSTANCE.getCalendar_DataSource();

		/**
		 * The meta object literal for the '<em><b>From Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__FROM_DATE_TIME = eINSTANCE.getCalendar_FromDateTime();

		/**
		 * The meta object literal for the '<em><b>Until Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UNTIL_DATE_TIME = eINSTANCE.getCalendar_UntilDateTime();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReservationParametersImpl <em>Reservation Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReservationParametersImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReservationParameters()
		 * @generated
		 */
		EClass RESERVATION_PARAMETERS = eINSTANCE.getReservationParameters();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETERS__RESERVATION_PARAMETERS = eINSTANCE.getReservationParameters_ReservationParameters();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReservationParameterImpl <em>Reservation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReservationParameterImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReservationParameter()
		 * @generated
		 */
		EClass RESERVATION_PARAMETER = eINSTANCE.getReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Mandatory Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__MANDATORY_RESERVATION = eINSTANCE.getReservationParameter_MandatoryReservation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__ID = eINSTANCE.getReservationParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Params9181</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__PARAMS9181 = eINSTANCE.getReservationParameter_Params9181();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__OPTIONS = eINSTANCE.getReservationParameter_Options();

		/**
		 * The meta object literal for the '<em><b>Mandatory Reservation For Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS = eINSTANCE.getReservationParameter_MandatoryReservationForBrands();

		/**
		 * The meta object literal for the '<em><b>Mandatory Reservations For Mode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE = eINSTANCE.getReservationParameter_MandatoryReservationsForMode();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReservationParams9181Impl <em>Reservation Params9181</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReservationParams9181Impl
		 * @see Accounting.impl.AccountingPackageImpl#getReservationParams9181()
		 * @generated
		 */
		EClass RESERVATION_PARAMS9181 = eINSTANCE.getReservationParams9181();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__TRAVEL_CLASS = eINSTANCE.getReservationParams9181_TravelClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__SERVICE_LEVEL = eINSTANCE.getReservationParams9181_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__SERVICE = eINSTANCE.getReservationParams9181_Service();

		/**
		 * The meta object literal for the '<em><b>Berth Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__BERTH_TYPE = eINSTANCE.getReservationParams9181_BerthType();

		/**
		 * The meta object literal for the '<em><b>Coach Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__COACH_TYPE = eINSTANCE.getReservationParams9181_CoachType();

		/**
		 * The meta object literal for the '<em><b>Compartment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__COMPARTMENT_TYPE = eINSTANCE.getReservationParams9181_CompartmentType();

		/**
		 * The meta object literal for the '<em><b>Tariff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__TARIFF = eINSTANCE.getReservationParams9181_Tariff();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReservationOptionsImpl <em>Reservation Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReservationOptionsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReservationOptions()
		 * @generated
		 */
		EClass RESERVATION_OPTIONS = eINSTANCE.getReservationOptions();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_OPTIONS__PREFERENCES = eINSTANCE.getReservationOptions_Preferences();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_OPTIONS__SERVICE_BRANDS = eINSTANCE.getReservationOptions_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Graphical Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_OPTIONS__GRAPHICAL_RESERVATION = eINSTANCE.getReservationOptions_GraphicalReservation();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReservationPreferenceGroupImpl <em>Reservation Preference Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReservationPreferenceGroupImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReservationPreferenceGroup()
		 * @generated
		 */
		EClass RESERVATION_PREFERENCE_GROUP = eINSTANCE.getReservationPreferenceGroup();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE_GROUP__PREFERENCE = eINSTANCE.getReservationPreferenceGroup_Preference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE_GROUP__GROUP = eINSTANCE.getReservationPreferenceGroup_Group();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceClassImpl <em>Service Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceClassImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceClass()
		 * @generated
		 */
		EClass SERVICE_CLASS = eINSTANCE.getServiceClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLASS__ID = eINSTANCE.getServiceClass_Id();

		/**
		 * The meta object literal for the '<em><b>Classic Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLASS__CLASSIC_CLASS = eINSTANCE.getServiceClass_ClassicClass();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLASS__TEXT = eINSTANCE.getServiceClass_Text();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ServiceLevelImpl <em>Service Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ServiceLevelImpl
		 * @see Accounting.impl.AccountingPackageImpl#getServiceLevel()
		 * @generated
		 */
		EClass SERVICE_LEVEL = eINSTANCE.getServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__ID = eINSTANCE.getServiceLevel_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__TEXT = eINSTANCE.getServiceLevel_Text();

		/**
		 * The meta object literal for the '<em><b>Combining Service Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__COMBINING_SERVICE_CLASSES = eINSTANCE.getServiceLevel_CombiningServiceClasses();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__RESERVATION_PARAMETER = eINSTANCE.getServiceLevel_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Includes Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__INCLUDES_CLASS_NAME = eINSTANCE.getServiceLevel_IncludesClassName();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TimeRangeImpl <em>Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TimeRangeImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTimeRange()
		 * @generated
		 */
		EClass TIME_RANGE = eINSTANCE.getTimeRange();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__SCOPE = eINSTANCE.getTimeRange_Scope();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__FROM = eINSTANCE.getTimeRange_From();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__UNTIL = eINSTANCE.getTimeRange_Until();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ExcludedTimeRangeImpl <em>Excluded Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ExcludedTimeRangeImpl
		 * @see Accounting.impl.AccountingPackageImpl#getExcludedTimeRange()
		 * @generated
		 */
		EClass EXCLUDED_TIME_RANGE = eINSTANCE.getExcludedTimeRange();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ValidityRangeImpl <em>Validity Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ValidityRangeImpl
		 * @see Accounting.impl.AccountingPackageImpl#getValidityRange()
		 * @generated
		 */
		EClass VALIDITY_RANGE = eINSTANCE.getValidityRange();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__UNIT = eINSTANCE.getValidityRange_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__VALUE = eINSTANCE.getValidityRange_Value();

		/**
		 * The meta object literal for the '<em><b>Hours After Midnight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT = eINSTANCE.getValidityRange_HoursAfterMidnight();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RelativeTimeImpl <em>Relative Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RelativeTimeImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRelativeTime()
		 * @generated
		 */
		EClass RELATIVE_TIME = eINSTANCE.getRelativeTime();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__UNIT = eINSTANCE.getRelativeTime_Unit();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__REFERENCE = eINSTANCE.getRelativeTime_Reference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__VALUE = eINSTANCE.getRelativeTime_Value();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReturnValidityConstraintImpl <em>Return Validity Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReturnValidityConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReturnValidityConstraint()
		 * @generated
		 */
		EClass RETURN_VALIDITY_CONSTRAINT = eINSTANCE.getReturnValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>Excluded Weekdays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS = eINSTANCE.getReturnValidityConstraint_ExcludedWeekdays();

		/**
		 * The meta object literal for the '<em><b>Latest Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN = eINSTANCE.getReturnValidityConstraint_LatestReturn();

		/**
		 * The meta object literal for the '<em><b>Earliest Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN = eINSTANCE.getReturnValidityConstraint_EarliestReturn();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TripAllocationConstraintImpl <em>Trip Allocation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TripAllocationConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTripAllocationConstraint()
		 * @generated
		 */
		EClass TRIP_ALLOCATION_CONSTRAINT = eINSTANCE.getTripAllocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Allocation Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT = eINSTANCE.getTripAllocationConstraint_AllocationUnit();

		/**
		 * The meta object literal for the '<em><b>Max Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS = eINSTANCE.getTripAllocationConstraint_MaxUnits();

		/**
		 * The meta object literal for the '<em><b>Duration Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT = eINSTANCE.getTripAllocationConstraint_DurationUnit();

		/**
		 * The meta object literal for the '<em><b>Required Processes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES = eINSTANCE.getTripAllocationConstraint_RequiredProcesses();

		/**
		 * The meta object literal for the '{@link Accounting.impl.TripInterruptionConstraintImpl <em>Trip Interruption Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.TripInterruptionConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getTripInterruptionConstraint()
		 * @generated
		 */
		EClass TRIP_INTERRUPTION_CONSTRAINT = eINSTANCE.getTripInterruptionConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Interruptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS = eINSTANCE.getTripInterruptionConstraint_MaxInterruptions();

		/**
		 * The meta object literal for the '<em><b>Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION = eINSTANCE.getTripInterruptionConstraint_MaxDuration();

		/**
		 * The meta object literal for the '<em><b>Total Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION = eINSTANCE.getTripInterruptionConstraint_TotalMaxDuration();

		/**
		 * The meta object literal for the '<em><b>Required Processes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES = eINSTANCE.getTripInterruptionConstraint_RequiredProcesses();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ViaStationImpl <em>Via Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ViaStationImpl
		 * @see Accounting.impl.AccountingPackageImpl#getViaStation()
		 * @generated
		 */
		EClass VIA_STATION = eINSTANCE.getViaStation();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__STATION = eINSTANCE.getViaStation_Station();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__CARRIER_CONSTRAINT = eINSTANCE.getViaStation_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__CARRIER = eINSTANCE.getViaStation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__ROUTE = eINSTANCE.getViaStation_Route();

		/**
		 * The meta object literal for the '<em><b>Alternative Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__ALTERNATIVE_ROUTES = eINSTANCE.getViaStation_AlternativeRoutes();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIA_STATION__DATA_DESCRIPTION = eINSTANCE.getViaStation_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__FARE_STATION_SET = eINSTANCE.getViaStation_FareStationSet();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__SERVICE_CONSTRAINT = eINSTANCE.getViaStation_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIA_STATION___GET_DESCRIPTION = eINSTANCE.getViaStation__GetDescription();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AlternativeRouteImpl <em>Alternative Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AlternativeRouteImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAlternativeRoute()
		 * @generated
		 */
		EClass ALTERNATIVE_ROUTE = eINSTANCE.getAlternativeRoute();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_ROUTE__STATIONS = eINSTANCE.getAlternativeRoute_Stations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RouteImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STATIONS = eINSTANCE.getRoute_Stations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ZoneImpl
		 * @see Accounting.impl.AccountingPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Binary Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__BINARY_ZONE_ID = eINSTANCE.getZone_BinaryZoneId();

		/**
		 * The meta object literal for the '<em><b>Zone Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__ZONE_ID = eINSTANCE.getZone_ZoneId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__CITY = eINSTANCE.getZone_City();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__CARRIER = eINSTANCE.getZone_Carrier();

		/**
		 * The meta object literal for the '<em><b>Entry Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__ENTRY_STATION = eINSTANCE.getZone_EntryStation();

		/**
		 * The meta object literal for the '<em><b>Terminal Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__TERMINAL_STATION = eINSTANCE.getZone_TerminalStation();

		/**
		 * The meta object literal for the '<em><b>Nuts Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__NUTS_CODE = eINSTANCE.getZone_NutsCode();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LineImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Binary Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__BINARY_ZONE_ID = eINSTANCE.getLine_BinaryZoneId();

		/**
		 * The meta object literal for the '<em><b>Line Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__LINE_ID = eINSTANCE.getLine_LineId();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CARRIER = eINSTANCE.getLine_Carrier();

		/**
		 * The meta object literal for the '<em><b>Entry Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__ENTRY_STATION = eINSTANCE.getLine_EntryStation();

		/**
		 * The meta object literal for the '<em><b>Terminal Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TERMINAL_STATION = eINSTANCE.getLine_TerminalStation();

		/**
		 * The meta object literal for the '<em><b>Nuts Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__NUTS_CODE = eINSTANCE.getLine_NutsCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__CITY = eINSTANCE.getLine_City();

		/**
		 * The meta object literal for the '{@link Accounting.impl.PolygoneImpl <em>Polygone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.PolygoneImpl
		 * @see Accounting.impl.AccountingPackageImpl#getPolygone()
		 * @generated
		 */
		EClass POLYGONE = eINSTANCE.getPolygone();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGONE__EDGE = eINSTANCE.getPolygone_Edge();

		/**
		 * The meta object literal for the '{@link Accounting.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.EdgeImpl
		 * @see Accounting.impl.AccountingPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__SYSTEM = eINSTANCE.getEdge_System();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ACCURACY = eINSTANCE.getEdge_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LONGITUDE = eINSTANCE.getEdge_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LATITUDE = eINSTANCE.getEdge_Latitude();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ZoneDefinitionsImpl <em>Zone Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ZoneDefinitionsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getZoneDefinitions()
		 * @generated
		 */
		EClass ZONE_DEFINITIONS = eINSTANCE.getZoneDefinitions();

		/**
		 * The meta object literal for the '<em><b>Zone Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITIONS__ZONE_DEFINITION = eINSTANCE.getZoneDefinitions_ZoneDefinition();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ZoneDefinitionImpl <em>Zone Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ZoneDefinitionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getZoneDefinition()
		 * @generated
		 */
		EClass ZONE_DEFINITION = eINSTANCE.getZoneDefinition();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__PROVIDER = eINSTANCE.getZoneDefinition_Provider();

		/**
		 * The meta object literal for the '<em><b>Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__ZONE_ID = eINSTANCE.getZoneDefinition_ZoneId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__NAME = eINSTANCE.getZoneDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Polygone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__POLYGONE = eINSTANCE.getZoneDefinition_Polygone();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__NAME_UTF8 = eINSTANCE.getZoneDefinition_NameUtf8();

		/**
		 * The meta object literal for the '<em><b>Station Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__STATION_SET = eINSTANCE.getZoneDefinition_StationSet();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__NUTS_CODES = eINSTANCE.getZoneDefinition_NutsCodes();

		/**
		 * The meta object literal for the '{@link Accounting.impl.CrossBorderConditionImpl <em>Cross Border Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.CrossBorderConditionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getCrossBorderCondition()
		 * @generated
		 */
		EClass CROSS_BORDER_CONDITION = eINSTANCE.getCrossBorderCondition();

		/**
		 * The meta object literal for the '<em><b>From Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__FROM_COUNTRY = eINSTANCE.getCrossBorderCondition_FromCountry();

		/**
		 * The meta object literal for the '<em><b>To Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__TO_COUNTRY = eINSTANCE.getCrossBorderCondition_ToCountry();

		/**
		 * The meta object literal for the '<em><b>Affected Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS = eINSTANCE.getCrossBorderCondition_AffectedServiceBrands();

		/**
		 * The meta object literal for the '{@link Accounting.impl.FareCombinationModelImpl <em>Fare Combination Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.FareCombinationModelImpl
		 * @see Accounting.impl.AccountingPackageImpl#getFareCombinationModel()
		 * @generated
		 */
		EClass FARE_COMBINATION_MODEL = eINSTANCE.getFareCombinationModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__MODEL = eINSTANCE.getFareCombinationModel_Model();

		/**
		 * The meta object literal for the '<em><b>Combinable Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS = eINSTANCE.getFareCombinationModel_CombinableCarriers();

		/**
		 * The meta object literal for the '<em><b>Only When Combined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED = eINSTANCE.getFareCombinationModel_OnlyWhenCombined();

		/**
		 * The meta object literal for the '<em><b>Allowed Allocators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS = eINSTANCE.getFareCombinationModel_AllowedAllocators();

		/**
		 * The meta object literal for the '<em><b>Reference Cluster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__REFERENCE_CLUSTER = eINSTANCE.getFareCombinationModel_ReferenceCluster();

		/**
		 * The meta object literal for the '<em><b>Allowed Clusters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS = eINSTANCE.getFareCombinationModel_AllowedClusters();

		/**
		 * The meta object literal for the '<em><b>Allowed Common Contracts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS = eINSTANCE.getFareCombinationModel_AllowedCommonContracts();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReductionConstraintsImpl <em>Reduction Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReductionConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReductionConstraints()
		 * @generated
		 */
		EClass REDUCTION_CONSTRAINTS = eINSTANCE.getReductionConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS = eINSTANCE.getReductionConstraints_ReductionConstraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReductionConstraintImpl <em>Reduction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReductionConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReductionConstraint()
		 * @generated
		 */
		EClass REDUCTION_CONSTRAINT = eINSTANCE.getReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CONSTRAINT__ID = eINSTANCE.getReductionConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Required Reduction Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS = eINSTANCE.getReductionConstraint_RequiredReductionCards();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReductionCardsImpl <em>Reduction Cards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReductionCardsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReductionCards()
		 * @generated
		 */
		EClass REDUCTION_CARDS = eINSTANCE.getReductionCards();

		/**
		 * The meta object literal for the '<em><b>Reduction Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARDS__REDUCTION_CARDS = eINSTANCE.getReductionCards_ReductionCards();

		/**
		 * The meta object literal for the '{@link Accounting.impl.ReductionCardImpl <em>Reduction Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.ReductionCardImpl
		 * @see Accounting.impl.AccountingPackageImpl#getReductionCard()
		 * @generated
		 */
		EClass REDUCTION_CARD = eINSTANCE.getReductionCard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__ID = eINSTANCE.getReductionCard_Id();

		/**
		 * The meta object literal for the '<em><b>Card Issuer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__CARD_ISSUER = eINSTANCE.getReductionCard_CardIssuer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__NAME = eINSTANCE.getReductionCard_Name();

		/**
		 * The meta object literal for the '<em><b>Service Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__SERVICE_CLASSES = eINSTANCE.getReductionCard_ServiceClasses();

		/**
		 * The meta object literal for the '<em><b>Id Required For Booking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING = eINSTANCE.getReductionCard_IdRequiredForBooking();

		/**
		 * The meta object literal for the '<em><b>Included Reduction Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__INCLUDED_REDUCTION_CARDS = eINSTANCE.getReductionCard_IncludedReductionCards();

		/**
		 * The meta object literal for the '<em><b>Uic Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__UIC_CODE = eINSTANCE.getReductionCard_UicCode();

		/**
		 * The meta object literal for the '{@link Accounting.impl.RequiredReductionCardImpl <em>Required Reduction Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.RequiredReductionCardImpl
		 * @see Accounting.impl.AccountingPackageImpl#getRequiredReductionCard()
		 * @generated
		 */
		EClass REQUIRED_REDUCTION_CARD = eINSTANCE.getRequiredReductionCard();

		/**
		 * The meta object literal for the '<em><b>Card Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_REDUCTION_CARD__CARD_CLASS = eINSTANCE.getRequiredReductionCard_CardClass();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_REDUCTION_CARD__CARD = eINSTANCE.getRequiredReductionCard_Card();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_REDUCTION_CARD__NAME = eINSTANCE.getRequiredReductionCard_Name();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LuggageConstraintsImpl <em>Luggage Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LuggageConstraintsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLuggageConstraints()
		 * @generated
		 */
		EClass LUGGAGE_CONSTRAINTS = eINSTANCE.getLuggageConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LUGGAGE_CONSTRAINTS__CONSTRAINTS = eINSTANCE.getLuggageConstraints_Constraints();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LuggageConstraintImpl <em>Luggage Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LuggageConstraintImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLuggageConstraint()
		 * @generated
		 */
		EClass LUGGAGE_CONSTRAINT = eINSTANCE.getLuggageConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__ID = eINSTANCE.getLuggageConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Max Hand Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE = eINSTANCE.getLuggageConstraint_MaxHandLuggage();

		/**
		 * The meta object literal for the '<em><b>Max Large Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE = eINSTANCE.getLuggageConstraint_MaxLargeLuggage();

		/**
		 * The meta object literal for the '<em><b>Restricted Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS = eINSTANCE.getLuggageConstraint_RestrictedItems();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__RULES = eINSTANCE.getLuggageConstraint_Rules();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getLuggageConstraint_DataDescription();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LuggageItemsRestrictionImpl <em>Luggage Items Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LuggageItemsRestrictionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLuggageItemsRestriction()
		 * @generated
		 */
		EClass LUGGAGE_ITEMS_RESTRICTION = eINSTANCE.getLuggageItemsRestriction();

		/**
		 * The meta object literal for the '<em><b>Number Of Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS = eINSTANCE.getLuggageItemsRestriction_NumberOfItems();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LUGGAGE_ITEMS_RESTRICTION__DIMENSION = eINSTANCE.getLuggageItemsRestriction_Dimension();

		/**
		 * The meta object literal for the '{@link Accounting.impl.LuggageDimensionImpl <em>Luggage Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.LuggageDimensionImpl
		 * @see Accounting.impl.AccountingPackageImpl#getLuggageDimension()
		 * @generated
		 */
		EClass LUGGAGE_DIMENSION = eINSTANCE.getLuggageDimension();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_DIMENSION__VALUE = eINSTANCE.getLuggageDimension_Value();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_DIMENSION__DIMENSION = eINSTANCE.getLuggageDimension_Dimension();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AddCarrierRulesImpl <em>Add Carrier Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AddCarrierRulesImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAddCarrierRules()
		 * @generated
		 */
		EClass ADD_CARRIER_RULES = eINSTANCE.getAddCarrierRules();

		/**
		 * The meta object literal for the '<em><b>Add Carrier Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CARRIER_RULES__ADD_CARRIER_RULE = eINSTANCE.getAddCarrierRules_AddCarrierRule();

		/**
		 * The meta object literal for the '{@link Accounting.impl.AddCarrierRuleImpl <em>Add Carrier Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.AddCarrierRuleImpl
		 * @see Accounting.impl.AccountingPackageImpl#getAddCarrierRule()
		 * @generated
		 */
		EClass ADD_CARRIER_RULE = eINSTANCE.getAddCarrierRule();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CARRIER_RULE__CARRIER = eINSTANCE.getAddCarrierRule_Carrier();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CARRIER_RULE__SCOPE = eINSTANCE.getAddCarrierRule_Scope();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CARRIER_RULE__STATIONS = eINSTANCE.getAddCarrierRule_Stations();

		/**
		 * The meta object literal for the '{@link Accounting.impl.OnBorderStationsImpl <em>On Border Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.impl.OnBorderStationsImpl
		 * @see Accounting.impl.AccountingPackageImpl#getOnBorderStations()
		 * @generated
		 */
		EClass ON_BORDER_STATIONS = eINSTANCE.getOnBorderStations();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_BORDER_STATIONS__STATIONS = eINSTANCE.getOnBorderStations_Stations();

		/**
		 * The meta object literal for the '{@link Accounting.PaymentType <em>Payment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.PaymentType
		 * @see Accounting.impl.AccountingPackageImpl#getPaymentType()
		 * @generated
		 */
		EEnum PAYMENT_TYPE = eINSTANCE.getPaymentType();

		/**
		 * The meta object literal for the '{@link Accounting.SalesChannel <em>Sales Channel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.SalesChannel
		 * @see Accounting.impl.AccountingPackageImpl#getSalesChannel()
		 * @generated
		 */
		EEnum SALES_CHANNEL = eINSTANCE.getSalesChannel();

		/**
		 * The meta object literal for the '{@link Accounting.TransactionType <em>Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TransactionType
		 * @see Accounting.impl.AccountingPackageImpl#getTransactionType()
		 * @generated
		 */
		EEnum TRANSACTION_TYPE = eINSTANCE.getTransactionType();

		/**
		 * The meta object literal for the '{@link Accounting.AccountingType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.AccountingType
		 * @see Accounting.impl.AccountingPackageImpl#getAccountingType()
		 * @generated
		 */
		EEnum ACCOUNTING_TYPE = eINSTANCE.getAccountingType();

		/**
		 * The meta object literal for the '{@link Accounting.SettlementValueIndicator <em>Settlement Value Indicator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.SettlementValueIndicator
		 * @see Accounting.impl.AccountingPackageImpl#getSettlementValueIndicator()
		 * @generated
		 */
		EEnum SETTLEMENT_VALUE_INDICATOR = eINSTANCE.getSettlementValueIndicator();

		/**
		 * The meta object literal for the '{@link Accounting.SalesType <em>Sales Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.SalesType
		 * @see Accounting.impl.AccountingPackageImpl#getSalesType()
		 * @generated
		 */
		EEnum SALES_TYPE = eINSTANCE.getSalesType();

		/**
		 * The meta object literal for the '{@link Accounting.TransactionStandard <em>Transaction Standard</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TransactionStandard
		 * @see Accounting.impl.AccountingPackageImpl#getTransactionStandard()
		 * @generated
		 */
		EEnum TRANSACTION_STANDARD = eINSTANCE.getTransactionStandard();

		/**
		 * The meta object literal for the '{@link Accounting.BoardingOrArrival <em>Boarding Or Arrival</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.BoardingOrArrival
		 * @see Accounting.impl.AccountingPackageImpl#getBoardingOrArrival()
		 * @generated
		 */
		EEnum BOARDING_OR_ARRIVAL = eINSTANCE.getBoardingOrArrival();

		/**
		 * The meta object literal for the '{@link Accounting.LuggageRule <em>Luggage Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.LuggageRule
		 * @see Accounting.impl.AccountingPackageImpl#getLuggageRule()
		 * @generated
		 */
		EEnum LUGGAGE_RULE = eINSTANCE.getLuggageRule();

		/**
		 * The meta object literal for the '{@link Accounting.Dimension <em>Dimension</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.Dimension
		 * @see Accounting.impl.AccountingPackageImpl#getDimension()
		 * @generated
		 */
		EEnum DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '{@link Accounting.AddCarrierScope <em>Add Carrier Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.AddCarrierScope
		 * @see Accounting.impl.AccountingPackageImpl#getAddCarrierScope()
		 * @generated
		 */
		EEnum ADD_CARRIER_SCOPE = eINSTANCE.getAddCarrierScope();

		/**
		 * The meta object literal for the '{@link Accounting.TransportMode <em>Transport Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TransportMode
		 * @see Accounting.impl.AccountingPackageImpl#getTransportMode()
		 * @generated
		 */
		EEnum TRANSPORT_MODE = eINSTANCE.getTransportMode();

		/**
		 * The meta object literal for the '{@link Accounting.StationRelationType <em>Station Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.StationRelationType
		 * @see Accounting.impl.AccountingPackageImpl#getStationRelationType()
		 * @generated
		 */
		EEnum STATION_RELATION_TYPE = eINSTANCE.getStationRelationType();

		/**
		 * The meta object literal for the '{@link Accounting.StationFareDetailType <em>Station Fare Detail Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.StationFareDetailType
		 * @see Accounting.impl.AccountingPackageImpl#getStationFareDetailType()
		 * @generated
		 */
		EEnum STATION_FARE_DETAIL_TYPE = eINSTANCE.getStationFareDetailType();

		/**
		 * The meta object literal for the '{@link Accounting.RegulatoryCondition <em>Regulatory Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.RegulatoryCondition
		 * @see Accounting.impl.AccountingPackageImpl#getRegulatoryCondition()
		 * @generated
		 */
		EEnum REGULATORY_CONDITION = eINSTANCE.getRegulatoryCondition();

		/**
		 * The meta object literal for the '{@link Accounting.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.AfterSalesTransactionType
		 * @see Accounting.impl.AccountingPackageImpl#getAfterSalesTransactionType()
		 * @generated
		 */
		EEnum AFTER_SALES_TRANSACTION_TYPE = eINSTANCE.getAfterSalesTransactionType();

		/**
		 * The meta object literal for the '{@link Accounting.BarcodeTypes <em>Barcode Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.BarcodeTypes
		 * @see Accounting.impl.AccountingPackageImpl#getBarcodeTypes()
		 * @generated
		 */
		EEnum BARCODE_TYPES = eINSTANCE.getBarcodeTypes();

		/**
		 * The meta object literal for the '{@link Accounting.BasePriceClassType <em>Base Price Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.BasePriceClassType
		 * @see Accounting.impl.AccountingPackageImpl#getBasePriceClassType()
		 * @generated
		 */
		EEnum BASE_PRICE_CLASS_TYPE = eINSTANCE.getBasePriceClassType();

		/**
		 * The meta object literal for the '{@link Accounting.ClassicClassType <em>Classic Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ClassicClassType
		 * @see Accounting.impl.AccountingPackageImpl#getClassicClassType()
		 * @generated
		 */
		EEnum CLASSIC_CLASS_TYPE = eINSTANCE.getClassicClassType();

		/**
		 * The meta object literal for the '{@link Accounting.ClassId <em>Class Id</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ClassId
		 * @see Accounting.impl.AccountingPackageImpl#getClassId()
		 * @generated
		 */
		EEnum CLASS_ID = eINSTANCE.getClassId();

		/**
		 * The meta object literal for the '{@link Accounting.CharacterSet <em>Character Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.CharacterSet
		 * @see Accounting.impl.AccountingPackageImpl#getCharacterSet()
		 * @generated
		 */
		EEnum CHARACTER_SET = eINSTANCE.getCharacterSet();

		/**
		 * The meta object literal for the '{@link Accounting.Clusters <em>Clusters</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.Clusters
		 * @see Accounting.impl.AccountingPackageImpl#getClusters()
		 * @generated
		 */
		EEnum CLUSTERS = eINSTANCE.getClusters();

		/**
		 * The meta object literal for the '{@link Accounting.CombinationModel <em>Combination Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.CombinationModel
		 * @see Accounting.impl.AccountingPackageImpl#getCombinationModel()
		 * @generated
		 */
		EEnum COMBINATION_MODEL = eINSTANCE.getCombinationModel();

		/**
		 * The meta object literal for the '{@link Accounting.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ControlDataExchangeTypes
		 * @see Accounting.impl.AccountingPackageImpl#getControlDataExchangeTypes()
		 * @generated
		 */
		EEnum CONTROL_DATA_EXCHANGE_TYPES = eINSTANCE.getControlDataExchangeTypes();

		/**
		 * The meta object literal for the '{@link Accounting.DataSource <em>Data Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.DataSource
		 * @see Accounting.impl.AccountingPackageImpl#getDataSource()
		 * @generated
		 */
		EEnum DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link Accounting.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.DataType
		 * @see Accounting.impl.AccountingPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link Accounting.FareType <em>Fare Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.FareType
		 * @see Accounting.impl.AccountingPackageImpl#getFareType()
		 * @generated
		 */
		EEnum FARE_TYPE = eINSTANCE.getFareType();

		/**
		 * The meta object literal for the '{@link Accounting.FulfillmentType <em>Fulfillment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.FulfillmentType
		 * @see Accounting.impl.AccountingPackageImpl#getFulfillmentType()
		 * @generated
		 */
		EEnum FULFILLMENT_TYPE = eINSTANCE.getFulfillmentType();

		/**
		 * The meta object literal for the '{@link Accounting.GeoSystem <em>Geo System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.GeoSystem
		 * @see Accounting.impl.AccountingPackageImpl#getGeoSystem()
		 * @generated
		 */
		EEnum GEO_SYSTEM = eINSTANCE.getGeoSystem();

		/**
		 * The meta object literal for the '{@link Accounting.GeoUnit <em>Geo Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.GeoUnit
		 * @see Accounting.impl.AccountingPackageImpl#getGeoUnit()
		 * @generated
		 */
		EEnum GEO_UNIT = eINSTANCE.getGeoUnit();

		/**
		 * The meta object literal for the '{@link Accounting.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.GraphicalReservationType
		 * @see Accounting.impl.AccountingPackageImpl#getGraphicalReservationType()
		 * @generated
		 */
		EEnum GRAPHICAL_RESERVATION_TYPE = eINSTANCE.getGraphicalReservationType();

		/**
		 * The meta object literal for the '{@link Accounting.GenericReductionCards <em>Generic Reduction Cards</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.GenericReductionCards
		 * @see Accounting.impl.AccountingPackageImpl#getGenericReductionCards()
		 * @generated
		 */
		EEnum GENERIC_REDUCTION_CARDS = eINSTANCE.getGenericReductionCards();

		/**
		 * The meta object literal for the '{@link Accounting.HemisphereEW <em>Hemisphere EW</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.HemisphereEW
		 * @see Accounting.impl.AccountingPackageImpl#getHemisphereEW()
		 * @generated
		 */
		EEnum HEMISPHERE_EW = eINSTANCE.getHemisphereEW();

		/**
		 * The meta object literal for the '{@link Accounting.HemisphereNS <em>Hemisphere NS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.HemisphereNS
		 * @see Accounting.impl.AccountingPackageImpl#getHemisphereNS()
		 * @generated
		 */
		EEnum HEMISPHERE_NS = eINSTANCE.getHemisphereNS();

		/**
		 * The meta object literal for the '{@link Accounting.InterfaceType <em>Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.InterfaceType
		 * @see Accounting.impl.AccountingPackageImpl#getInterfaceType()
		 * @generated
		 */
		EEnum INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '{@link Accounting.LegacyCalculationType <em>Legacy Calculation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.LegacyCalculationType
		 * @see Accounting.impl.AccountingPackageImpl#getLegacyCalculationType()
		 * @generated
		 */
		EEnum LEGACY_CALCULATION_TYPE = eINSTANCE.getLegacyCalculationType();

		/**
		 * The meta object literal for the '{@link Accounting.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.LegacyPassengerType
		 * @see Accounting.impl.AccountingPackageImpl#getLegacyPassengerType()
		 * @generated
		 */
		EEnum LEGACY_PASSENGER_TYPE = eINSTANCE.getLegacyPassengerType();

		/**
		 * The meta object literal for the '{@link Accounting.LegacySeriesType <em>Legacy Series Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.LegacySeriesType
		 * @see Accounting.impl.AccountingPackageImpl#getLegacySeriesType()
		 * @generated
		 */
		EEnum LEGACY_SERIES_TYPE = eINSTANCE.getLegacySeriesType();

		/**
		 * The meta object literal for the '{@link Accounting.LegacyConversionType <em>Legacy Conversion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.LegacyConversionType
		 * @see Accounting.impl.AccountingPackageImpl#getLegacyConversionType()
		 * @generated
		 */
		EEnum LEGACY_CONVERSION_TYPE = eINSTANCE.getLegacyConversionType();

		/**
		 * The meta object literal for the '{@link Accounting.OfferRequestType <em>Offer Request Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.OfferRequestType
		 * @see Accounting.impl.AccountingPackageImpl#getOfferRequestType()
		 * @generated
		 */
		EEnum OFFER_REQUEST_TYPE = eINSTANCE.getOfferRequestType();

		/**
		 * The meta object literal for the '{@link Accounting.OnlineServiceType <em>Online Service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.OnlineServiceType
		 * @see Accounting.impl.AccountingPackageImpl#getOnlineServiceType()
		 * @generated
		 */
		EEnum ONLINE_SERVICE_TYPE = eINSTANCE.getOnlineServiceType();

		/**
		 * The meta object literal for the '{@link Accounting.PersonalDataItemsType <em>Personal Data Items Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.PersonalDataItemsType
		 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataItemsType()
		 * @generated
		 */
		EEnum PERSONAL_DATA_ITEMS_TYPE = eINSTANCE.getPersonalDataItemsType();

		/**
		 * The meta object literal for the '{@link Accounting.PersonalDataTransferType <em>Personal Data Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.PersonalDataTransferType
		 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataTransferType()
		 * @generated
		 */
		EEnum PERSONAL_DATA_TRANSFER_TYPE = eINSTANCE.getPersonalDataTransferType();

		/**
		 * The meta object literal for the '{@link Accounting.PersonalDataChangeReason <em>Personal Data Change Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.PersonalDataChangeReason
		 * @see Accounting.impl.AccountingPackageImpl#getPersonalDataChangeReason()
		 * @generated
		 */
		EEnum PERSONAL_DATA_CHANGE_REASON = eINSTANCE.getPersonalDataChangeReason();

		/**
		 * The meta object literal for the '{@link Accounting.ReservationTravelClass <em>Reservation Travel Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ReservationTravelClass
		 * @see Accounting.impl.AccountingPackageImpl#getReservationTravelClass()
		 * @generated
		 */
		EEnum RESERVATION_TRAVEL_CLASS = eINSTANCE.getReservationTravelClass();

		/**
		 * The meta object literal for the '{@link Accounting.ReservationServiceLevel <em>Reservation Service Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ReservationServiceLevel
		 * @see Accounting.impl.AccountingPackageImpl#getReservationServiceLevel()
		 * @generated
		 */
		EEnum RESERVATION_SERVICE_LEVEL = eINSTANCE.getReservationServiceLevel();

		/**
		 * The meta object literal for the '{@link Accounting.ReservationService <em>Reservation Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ReservationService
		 * @see Accounting.impl.AccountingPackageImpl#getReservationService()
		 * @generated
		 */
		EEnum RESERVATION_SERVICE = eINSTANCE.getReservationService();

		/**
		 * The meta object literal for the '{@link Accounting.ReservationBerthType <em>Reservation Berth Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ReservationBerthType
		 * @see Accounting.impl.AccountingPackageImpl#getReservationBerthType()
		 * @generated
		 */
		EEnum RESERVATION_BERTH_TYPE = eINSTANCE.getReservationBerthType();

		/**
		 * The meta object literal for the '{@link Accounting.RoundingType <em>Rounding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.RoundingType
		 * @see Accounting.impl.AccountingPackageImpl#getRoundingType()
		 * @generated
		 */
		EEnum ROUNDING_TYPE = eINSTANCE.getRoundingType();

		/**
		 * The meta object literal for the '{@link Accounting.SchemaVersion <em>Schema Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.SchemaVersion
		 * @see Accounting.impl.AccountingPackageImpl#getSchemaVersion()
		 * @generated
		 */
		EEnum SCHEMA_VERSION = eINSTANCE.getSchemaVersion();

		/**
		 * The meta object literal for the '{@link Accounting.ServiceMode <em>Service Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.ServiceMode
		 * @see Accounting.impl.AccountingPackageImpl#getServiceMode()
		 * @generated
		 */
		EEnum SERVICE_MODE = eINSTANCE.getServiceMode();

		/**
		 * The meta object literal for the '{@link Accounting.TimeZone <em>Time Zone</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TimeZone
		 * @see Accounting.impl.AccountingPackageImpl#getTimeZone()
		 * @generated
		 */
		EEnum TIME_ZONE = eINSTANCE.getTimeZone();

		/**
		 * The meta object literal for the '{@link Accounting.TaxScope <em>Tax Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TaxScope
		 * @see Accounting.impl.AccountingPackageImpl#getTaxScope()
		 * @generated
		 */
		EEnum TAX_SCOPE = eINSTANCE.getTaxScope();

		/**
		 * The meta object literal for the '{@link Accounting.TimeReferenceType <em>Time Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TimeReferenceType
		 * @see Accounting.impl.AccountingPackageImpl#getTimeReferenceType()
		 * @generated
		 */
		EEnum TIME_REFERENCE_TYPE = eINSTANCE.getTimeReferenceType();

		/**
		 * The meta object literal for the '{@link Accounting.TimeRangeScope <em>Time Range Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TimeRangeScope
		 * @see Accounting.impl.AccountingPackageImpl#getTimeRangeScope()
		 * @generated
		 */
		EEnum TIME_RANGE_SCOPE = eINSTANCE.getTimeRangeScope();

		/**
		 * The meta object literal for the '{@link Accounting.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TimeUnit
		 * @see Accounting.impl.AccountingPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link Accounting.TravelerType <em>Traveler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TravelerType
		 * @see Accounting.impl.AccountingPackageImpl#getTravelerType()
		 * @generated
		 */
		EEnum TRAVELER_TYPE = eINSTANCE.getTravelerType();

		/**
		 * The meta object literal for the '{@link Accounting.TripAllocationProcess <em>Trip Allocation Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TripAllocationProcess
		 * @see Accounting.impl.AccountingPackageImpl#getTripAllocationProcess()
		 * @generated
		 */
		EEnum TRIP_ALLOCATION_PROCESS = eINSTANCE.getTripAllocationProcess();

		/**
		 * The meta object literal for the '{@link Accounting.TripAllocationUnit <em>Trip Allocation Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TripAllocationUnit
		 * @see Accounting.impl.AccountingPackageImpl#getTripAllocationUnit()
		 * @generated
		 */
		EEnum TRIP_ALLOCATION_UNIT = eINSTANCE.getTripAllocationUnit();

		/**
		 * The meta object literal for the '{@link Accounting.TripInterruptionProcess <em>Trip Interruption Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TripInterruptionProcess
		 * @see Accounting.impl.AccountingPackageImpl#getTripInterruptionProcess()
		 * @generated
		 */
		EEnum TRIP_INTERRUPTION_PROCESS = eINSTANCE.getTripInterruptionProcess();

		/**
		 * The meta object literal for the '{@link Accounting.TravelValidityType <em>Travel Validity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.TravelValidityType
		 * @see Accounting.impl.AccountingPackageImpl#getTravelValidityType()
		 * @generated
		 */
		EEnum TRAVEL_VALIDITY_TYPE = eINSTANCE.getTravelValidityType();

		/**
		 * The meta object literal for the '{@link Accounting.WeekDay <em>Week Day</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Accounting.WeekDay
		 * @see Accounting.impl.AccountingPackageImpl#getWeekDay()
		 * @generated
		 */
		EEnum WEEK_DAY = eINSTANCE.getWeekDay();

		/**
		 * The meta object literal for the '<em>Date As Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see Accounting.impl.AccountingPackageImpl#getDateAsDate()
		 * @generated
		 */
		EDataType DATE_AS_DATE = eINSTANCE.getDateAsDate();

		/**
		 * The meta object literal for the '<em>Date As Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see Accounting.impl.AccountingPackageImpl#getDateAsDateTime()
		 * @generated
		 */
		EDataType DATE_AS_DATE_TIME = eINSTANCE.getDateAsDateTime();

	}

} //AccountingPackage
