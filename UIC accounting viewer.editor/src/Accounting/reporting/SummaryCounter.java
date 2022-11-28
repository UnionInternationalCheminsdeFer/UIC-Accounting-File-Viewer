package Accounting.reporting;

import java.math.BigDecimal;
import Accounting.Currency;

public class SummaryCounter {
	
	
	private Currency currency = null;
	private String accountingType = null;
	private String transactionType = null;
	private String valueType = null;
	private String comission = null; 
	private String settlementIndicator = null;
	
	private BigDecimal amount = new BigDecimal(0);
	private long numberOfRecords = 0;
	
	public SummaryCounter(Currency currency, String accountingType, String transactionType, String valueType, String comission, String settlementIndicator ) {
		
		this.accountingType = accountingType;
		this.comission = comission;
		this.transactionType = transactionType;
		this.currency = currency;
		this.valueType = valueType;
		this.settlementIndicator = settlementIndicator;
		
	}
	
	
	public boolean isCounterFor(Currency currency, String accountingType, String transactionType, String valueType, String comission, String settlementIndicator){
		
		if ( 	this.accountingType.equals(accountingType) &&
				this.comission.equals(comission) &&
				this.transactionType.equals(transactionType) &&
				this.currency.equals(currency) &&
				this.settlementIndicator.equals(settlementIndicator) &&
				this.valueType.equals(valueType) ){
				return true;
		}
		
		
		return false;
	};
	
	public void updateCounter(Currency currency, String accountingType, String transactionType, String valueType, String comission, String settlementIndicator, BigDecimal decimal) {
		
		if (!isCounterFor(currency,accountingType,transactionType,valueType,comission, settlementIndicator)) {
			return;
		}
			
		numberOfRecords++;
		amount = amount.add(decimal);
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Accounting type: ").append(accountingType);
		sb.append(" - ");		
		sb.append(" Transaction: ").append(transactionType);
		sb.append(" - ");		
		sb.append(" Amount type: ").append(valueType);
		sb.append(" - ");	
		if (comission != null && comission.length() > 0) {
			sb.append(" ").append(comission).append(" - ");
		}
		sb.append(" Settlement Indicator: ").append(settlementIndicator);
		sb.append(" Number of Records: ").append(Long.toString(numberOfRecords));
		sb.append(" - ");
		sb.append(amount.toString());
		sb.append(" ").append(currency.getIsoCode());

		
		return sb.toString();
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public long getNumberOfRecords() {
		return numberOfRecords;
	}
	
	

}
