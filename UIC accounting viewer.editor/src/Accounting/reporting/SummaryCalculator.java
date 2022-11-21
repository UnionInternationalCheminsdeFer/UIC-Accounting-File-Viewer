package Accounting.reporting;

import Accounting.AccountingRecord;
import Accounting.Currency;
import Accounting.utils.AccountingUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import Accounting.AccountedAmount;
import Accounting.AccountingDelivery;

public class SummaryCalculator {
	
	private AccountingDelivery accountingDelivery = null;
	
	private ArrayList<SummaryCounter> counters = new ArrayList<SummaryCounter>();
	
	
	public SummaryCalculator (AccountingDelivery accountingDelivery){
		this.accountingDelivery = accountingDelivery;
		
		Currency eur = AccountingUtils.getCurrency("EUR");
		
		addNewResultEntry(eur, "DEBIT", "BOOKING", "GROSS","");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "GROSS","COMISSION");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "FEE","");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "FEE","COMISSION");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "ERROR","");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "ERROR","COMISSION");	
		
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "GROSS","");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "GROSS","COMISSION");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "FEE","");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "FEE","COMISSION");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "ERROR","");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "ERROR","COMISSION");		
				
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "GROSS","");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "GROSS","COMISSION");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "FEE","");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "FEE","COMISSION");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "ERROR","");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "ERROR","COMISSION");	
		
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "GROSS","");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "GROSS","COMISSION");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "FEE","");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "FEE","COMISSION");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "ERROR","");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "ERROR","COMISSION");			
		
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "GROSS","");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "GROSS","COMISSION");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "FEE","");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "FEE","COMISSION");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "ERROR","");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "ERROR","COMISSION");	
		
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "GROSS","");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "GROSS","COMISSION");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "FEE","");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "FEE","COMISSION");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "ERROR","");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "ERROR","COMISSION");	
		
		addNewResultEntry(eur, "CREDIT", "BOOKING", "GROSS","");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "GROSS","COMISSION");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "FEE","");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "FEE","COMISSION");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "ERROR","");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "ERROR","COMISSION");	
		
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "GROSS","");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "GROSS","COMISSION");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "FEE","");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "FEE","COMISSION");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "ERROR","");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "ERROR","COMISSION");		
		
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "GROSS","");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "GROSS","COMISSION");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "FEE","");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "FEE","COMISSION");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "ERROR","");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "ERROR","COMISSION");	
		
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "GROSS","");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "GROSS","COMISSION");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "FEE","");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "FEE","COMISSION");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "ERROR","");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "ERROR","COMISSION");			
		
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "GROSS","");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "GROSS","COMISSION");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "FEE","");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "FEE","COMISSION");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "ERROR","");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "ERROR","COMISSION");	
		
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "GROSS","");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "GROSS","COMISSION");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "FEE","");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "FEE","COMISSION");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "ERROR","");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "ERROR","COMISSION");			
		
	};
	
	
	
	public void addAccountingRecord(AccountingRecord accountingRecord) {
		
		if (accountingRecord.getAccountedAmounts() == null) return;
		
		for (AccountedAmount amount: accountingRecord.getAccountedAmounts().getAccountedAmounts()) {
			
			String valueType = "ERROR";
			if (amount.isFee() && !amount.isGrossAmount()) {
				valueType = "FEE";
			} else if (amount.isGrossAmount() && !amount.isFee()) {
				valueType = "GROSS";
			}
			String comission = "";
			if (amount.isCommission()) {
				comission = "COMISSION";
			}
			
			updateCounter(amount.getCurrency(), accountingRecord.getAccountingType().getLiteral(), accountingRecord.getTransaction().getTransactionType().getLiteral(), valueType, comission, amount.getAmount());	
			
		}
		
		
		
		
	};
	
	public String getSummary() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Accounting Summary").append('\n');
		sb.append(" Invoicing Party: ").append(accountingDelivery.getInvoicingParty().getCode()).append("-").append(accountingDelivery.getInvoicingParty().getName());
		sb.append(" Invoice Recipient: ").append(accountingDelivery.getInvoiceRecipient().getCode()).append("-").append(accountingDelivery.getInvoiceRecipient().getName()).append('\n');
		sb.append(" Accounting delivery id: ").append(accountingDelivery.getId()).append('\n');
		sb.append(" Statement period: ").append(accountingDelivery.getStartStatementPeriod().toGMTString()).append(" - ").append(accountingDelivery.getEndStatementPeriod().toGMTString()).append('\n');		
		sb.append('\n');
		
		for (SummaryCounter c : counters) {
			if (c.getNumberOfRecords() > 0) {
				sb.append("  ").append(c.toString()).append('\n');
			}
		}
		return sb.toString();
	}
	




	private void addNewResultEntry(Currency currency, String accountingType, String transactionType, String valueType, String comission) {
		
		SummaryCounter c = new SummaryCounter(currency, accountingType, transactionType, valueType, comission);
		
		counters.add(c);
		
	}

	private void updateCounter(Currency currency, String accountingType, String transactionType, String valueType, String comission, BigDecimal decimal) {
		
		SummaryCounter counter = findCounter(currency,accountingType,transactionType,valueType,comission);
		
		if (counter == null) {
			addNewResultEntry(currency,accountingType,transactionType,valueType,comission);
			counter = findCounter(currency,accountingType,transactionType,valueType,comission);
		}
		
		if (counter != null) {
			counter.updateCounter(currency, accountingType, transactionType, valueType, comission, decimal);
		}
	}



	private SummaryCounter findCounter(Currency currency, String accountingType, String transactionType, String valueType,String comission) {
		
		for (SummaryCounter c : counters) {
			if (c.isCounterFor(currency, accountingType, transactionType, valueType, comission)) {
				return c;
			}
		}
		return null;
	}
}
