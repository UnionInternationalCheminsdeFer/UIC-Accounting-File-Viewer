package Accounting.reporting;

import Accounting.AccountingRecord;
import Accounting.Currency;
import Accounting.utils.AccountingUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

import Accounting.AccountedAmount;
import Accounting.AccountingDelivery;

public class SummaryCalculator {
	
	private AccountingDelivery accountingDelivery = null;
	
	private ArrayList<SummaryCounter> counters = new ArrayList<SummaryCounter>();
	
	private SimpleDateFormat sdf = new SimpleDateFormat();
	
	
	public SummaryCalculator (AccountingDelivery accountingDelivery){
		
		sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
		sdf.applyPattern("dd MMM yyyy HH:mm:ss z");
		
		this.accountingDelivery = accountingDelivery;
		
		Currency eur = AccountingUtils.getCurrency("EUR");
		
		addNewResultEntry(eur, "DEBIT", "BOOKING", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "ERROR","COMISSION","DEBIT");	
		
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "ERROR","COMISSION","DEBIT");		
				
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "ERROR","COMISSION","DEBIT");	
		
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "ERROR","COMISSION","DEBIT");			
		
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "ERROR","COMISSION","DEBIT");	
		
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "ERROR","COMISSION","DEBIT");	
		
		addNewResultEntry(eur, "DEBIT", "BOOKING", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "BOOKING", "ERROR","COMISSION","DEBIT");	
		
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "CANCELLATION", "ERROR","COMISSION","DEBIT");		
		
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_BOOKING", "ERROR","COMISSION","DEBIT");	
		
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "EXCHANGE_CANCELATION", "ERROR","COMISSION","DEBIT");			
		
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "COMPENSATION", "ERROR","COMISSION","DEBIT");	
		
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "GROSS","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "GROSS","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "FEE","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "FEE","COMISSION","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "ERROR","","DEBIT");
		addNewResultEntry(eur, "DEBIT", "MANUAL_REFUND", "ERROR","COMISSION","DEBIT");			
		
		
		addNewResultEntry(eur, "CREDIT", "BOOKING", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "ERROR","COMISSION","CREDIT");	
		
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "ERROR","COMISSION","CREDIT");		
				
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "ERROR","COMISSION","CREDIT");	
		
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "ERROR","COMISSION","CREDIT");			
		
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "ERROR","COMISSION","CREDIT");	
		
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "ERROR","COMISSION","CREDIT");	
		
		addNewResultEntry(eur, "CREDIT", "BOOKING", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "BOOKING", "ERROR","COMISSION","CREDIT");	
		
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "CANCELLATION", "ERROR","COMISSION","CREDIT");		
		
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_BOOKING", "ERROR","COMISSION","CREDIT");	
		
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "EXCHANGE_CANCELATION", "ERROR","COMISSION","CREDIT");			
		
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "COMPENSATION", "ERROR","COMISSION","CREDIT");	
		
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "GROSS","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "GROSS","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "FEE","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "FEE","COMISSION","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "ERROR","","CREDIT");
		addNewResultEntry(eur, "CREDIT", "MANUAL_REFUND", "ERROR","COMISSION","CREDIT");		
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
			
			updateCounter(amount.getCurrency(), accountingRecord.getAccountingType().getLiteral(), accountingRecord.getTransaction().getTransactionType().getLiteral(), valueType, comission, amount.getSettlementValueIndicator().getLiteral(), amount.getAmount());	
			
		}
		
		
		
		
	};
	
	public String getSummary() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Accounting Summary").append('\n');
		sb.append(" Invoicing Party: ").append(accountingDelivery.getInvoicingParty().getCode());
		sb.append("-").append(accountingDelivery.getInvoicingParty().getName());
		sb.append(" Invoice Recipient: ").append(accountingDelivery.getInvoiceRecipient().getCode());
		sb.append("-").append(accountingDelivery.getInvoiceRecipient().getName()).append('\n');
		sb.append(" Accounting delivery id: ").append(accountingDelivery.getId()).append('\n');
		sb.append(" Statement period: ").append(sdf.format(accountingDelivery.getStartStatementPeriod()));
		sb.append(" - ").append(sdf.format(accountingDelivery.getEndStatementPeriod())).append('\n');		
		sb.append('\n');
		
		for (SummaryCounter c : counters) {
			if (c.getNumberOfRecords() > 0) {
				sb.append("  ").append(c.toString()).append('\n');
			}
		}
		return sb.toString();
	}
	


	private void addNewResultEntry(Currency currency, String accountingType, String transactionType, String valueType,  String comission , String settlementIndicator) {
		
		SummaryCounter c = new SummaryCounter(currency, accountingType, transactionType, valueType, comission, settlementIndicator);
		
		counters.add(c);
		
	}

	private void updateCounter(Currency currency, String accountingType, String transactionType, String valueType, String comission, String settlementIndicator, BigDecimal decimal) {
		
		SummaryCounter counter = findCounter(currency,accountingType,transactionType,valueType,comission,settlementIndicator);
		
		if (counter == null) {
			addNewResultEntry(currency,accountingType,transactionType,valueType,comission,settlementIndicator);
			counter = findCounter(currency,accountingType,transactionType,valueType,comission, settlementIndicator);
		}
		
		if (counter != null) {
			counter.updateCounter(currency, accountingType, transactionType, valueType, comission,settlementIndicator, decimal);
		}
	}



	private SummaryCounter findCounter(Currency currency, String accountingType, String transactionType, String valueType,String comission, String settlementIndicator) {
		
		for (SummaryCounter c : counters) {
			if (c.isCounterFor(currency, accountingType, transactionType, valueType, comission, settlementIndicator)) {
				return c;
			}
		}
		return null;
	}
}
