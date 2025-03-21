package Accounting.actions;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

import Accounting.AccountingDelivery;
import Accounting.AccountingFile;
import Accounting.AccountingSubject;
import Accounting.AccountingViewerData;
import Accounting.Carrier;
import accountingModelV1.AccountedAmount;
import accountingModelV1.AccountedAmount.SettlementValueIndicator;
import accountingModelV1.AccountingDataDelivery;
import accountingModelV1.AccountingDeliveryDetails;
import accountingModelV1.AccountingDeliveryDetails.PaymentType;
import accountingModelV1.AccountingRecord;
import accountingModelV1.AccountingRecord.SalesType;
import accountingModelV1.LegacyDescription;
import accountingModelV1.LegacyDescription.ClassCode;
import accountingModelV1.Subject;
import accountingModelV1.Subject.SalesChannel;
import accountingModelV1.Transaction;
import accountingModelV1.Transaction.TransactionType;


public class AccountingJsonExporter {
		
	/*
	 *  y   = year   (yy or yyyy)
	 *	M   = month  (MM)
	 *	d   = day in month (dd)
	 *	h   = hour (0-12)  (hh)
	 *	H   = hour (0-23)  (HH)
	 *	m   = minute in hour (mm)
	 *	s   = seconds (ss)
	 *	S   = milliseconds (SSS)
	 *	z   = time zone  text        (e.g. Pacific Standard Time...)
	 *	Z   = time zone, time offset (e.g. -0800)
	 *
	 *
	 * "2012-04-21T18:25:43-05:00"             ISO 8601
	 * 
	 * 	private DateFormat jsondf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); //$NON-NLS-1$
	 */
	

	
	
	public AccountingJsonExporter () {	}

	public AccountingJsonExporter (AccountingViewerData accounting) {
		
	}
	
	public AccountingDataDelivery convertToJson(AccountingFile accountingFile, IProgressMonitor monitor) {

		
		if (accountingFile == null || accountingFile.getAccountingDelivery() == null || accountingFile.getAccountingRecords() == null) return null;
		
		
	
		AccountingDataDelivery export = new AccountingDataDelivery();

		monitor.subTask("Prepare Accounting Records for Export");

		export.setDeliveryDetails(convert(accountingFile.getAccountingDelivery()));
		monitor.worked(1);
					
		
		for (Accounting.AccountingRecord mObj : accountingFile.getAccountingRecords().getAccountingRecords()) {
			
			AccountingRecord jObj = convert(mObj);
			if (jObj != null) {
				export.getAccountingRecords().add(jObj);
			}
			
			monitor.worked(1);
		}
		
		return export;
	}

	private AccountingRecord convert(Accounting.AccountingRecord mObj) {
		
		AccountingRecord jObj = new AccountingRecord();
		
		jObj.setSubject(convert(mObj.getSubject()));
		
		jObj.setTransaction(convert(mObj.getTransaction()));
		
		for (Accounting.AccountedAmount am : mObj.getAccountedAmounts().getAccountedAmounts()) {
			jObj.getAccountedAmounts().add(convert(am));
		}
		
		if (mObj.getAccountingType() != null) {
			jObj.setAccountingType(AccountingRecord.AccountingType.fromValue(mObj.getAccountingType().getLiteral()));
		}
		
		jObj.setId(UUID.fromString(mObj.getId()));
		
		if (mObj.getSalesType() != null) {
			jObj.setSalesType(SalesType.fromValue(mObj.getSalesType().getLiteral()));
		}
		
		return jObj;
	}

	private AccountedAmount convert(Accounting.AccountedAmount mObj) {
		
		AccountedAmount jObj = new AccountedAmount();
		
		jObj.setCurrency(mObj.getCurrency().getIsoCode());
		
		if (mObj.getAmount() != null) {
			jObj.setAmount(convertToAmount(mObj.getAmount()));
			jObj.setScale(convertToScale(mObj.getAmount()));
		}
		
		if (mObj.getRate() != null) {
			jObj.setCommissionRate(convertToAmount(mObj.getRate()));
			jObj.setCommissionRateScale(convertToScale(mObj.getRate()));
		}
		
		if (mObj.getSettlementValueIndicator() != null) {
			jObj.setSettlementValueIndicator(SettlementValueIndicator.fromValue(mObj.getSettlementValueIndicator().getLiteral()));
		}
		
		
		jObj.setCommission(mObj.isCommission());
		
		jObj.setGrossAmount(mObj.isGrossAmount());
		
		jObj.setAfterSaleFee(mObj.isFee());	
		
		
		// TODO Auto-generated method stub
		return jObj;
	}

	private Integer convertToScale(BigDecimal amount) {
		String plain = amount.toPlainString();
		int commaPosition = plain.indexOf(".");
		// TODO Auto-generated method stub
		return plain.length() - commaPosition - 1;
	}

	private Integer convertToAmount(BigDecimal amount) {
		String plain = amount.toPlainString();
		plain = plain.replace(".", "");	
		return Integer.parseInt(plain);
	}

	private Subject convert(AccountingSubject mObj) {
		
		Subject jObj = new Subject();
		
		jObj.setBilateralTariffIdentifier(mObj.getBilateralTariffIdentifier());

		jObj.setCarriers(convertCarriers(mObj.getCarriers()));
		
		jObj.setCountryOfSale(mObj.getCountryOfSale().getISOcode());
		
		jObj.setFareId(mObj.getFareId());
		
		if (mObj.getLegacyDescription() != null) {
			jObj.setLegacyDescription(convert(mObj.getLegacyDescription()));
		}
		
		jObj.setNumberOfItems(mObj.getNumberOfItems());
		
		if (mObj.getRetailer() != null) {
			jObj.setRetailer(mObj.getRetailer().getCode());
		}
		
		if (mObj.getSalesChannel() != null){
			jObj.setSalesChannel(SalesChannel.fromValue(mObj.getSalesChannel().getLiteral()));
		}
		
		jObj.setSalesOfficeId(mObj.getSalesOfficeId());
		
		jObj.setTrain(mObj.getTrain());
		
		if (mObj.getTravelDate() != null) {
			jObj.setTravelDate(formatDate(mObj.getTravelDate()));
		}
		
		if (mObj.getInternationalJourney() != null) {
			jObj.setInternationalJourney(mObj.getInternationalJourney());
		}
		
		if (mObj.getTripOrigin() != null) {
			jObj.setTripOrigin(mObj.getTripOrigin());
		}

		if (mObj.getTripDestination() != null) {
			jObj.setTripDestination(mObj.getTripDestination());
		}
		
		return jObj;
	}
	
    public static Date parseDate (String source){
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    	
    	try {
			return formatter.parse(source);
		} catch (ParseException e) {
			try {
				return formatter.parse("2001-01-01");
			} catch (ParseException e1) {
				return null;
			}
		}
    	
    }
    
    public static String formatDate (Date source){
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    	
		return formatter.format(source);	
    	
    }

	private LegacyDescription convert(Accounting.LegacyDescription mObj) {
		
		if (mObj == null) return null;
		
		LegacyDescription jObj = new LegacyDescription();

		if (mObj.getClassCode() != null) {
			jObj.setClassCode(ClassCode.fromValue(mObj.getClassCode().getLiteral()));
		}
		
		if (mObj.getPassengerType() != null) {
			jObj.setPassengerType(mObj.getPassengerType().getLiteral());
		}
		
		jObj.setSeries(mObj.getSeries());

		jObj.setTariff(mObj.getTariff());
		
		jObj.setDialogNumber(mObj.getDialogNumber());

		return jObj;
	}

	private List<String> convertCarriers(EList<Carrier> eList) {
		
		List<String> jL = new ArrayList<String>();
		
		for (Carrier c : eList) {
			jL.add(c.getCode());
		}
		return jL;
	}

	private Transaction convert(Accounting.Transaction mObj) {
		
		if (mObj == null) return null;
		
		Transaction jObj = new Transaction();
		
		jObj.setBookedOfferId(mObj.getBookingId());
		
		jObj.setContract(mObj.getContract());
		
		jObj.setExchangedBookedOfferId(mObj.getExchangebookingId());
		
		if (mObj.getFulfillmentIds() != null && !mObj.getFulfillmentIds().isEmpty()) {
		    jObj.setFulfillmentIds(new ArrayList<String>());
			for (String id : mObj.getFulfillmentIds()) {
				jObj.getFulfillmentIds().add(id);
			}
		}
		
		if (mObj.getBookingPartIds() != null && !mObj.getBookingPartIds().isEmpty()) {
			jObj.setBookedOfferPartIds(mObj.getBookingPartIds());
		}
		
		if (mObj.getAccountingReferenceIds() != null && !mObj.getAccountingReferenceIds().isEmpty()) {
			jObj.setAccountingReferenceIds(mObj.getAccountingReferenceIds());
		}

		if (mObj.getTicketIds() != null && !mObj.getTicketIds().isEmpty()) {
			jObj.setTicketIds(mObj.getTicketIds());
		}
		
		if (mObj.getTransactionTime() != null) {
			jObj.setTimestamp(mObj.getTransactionTime());
		}
		
		if (mObj.getTransactionType() != null) {
			jObj.setType(convertTransactionType(mObj.getTransactionType()));
		}
		return jObj;
	}

	private TransactionType convertTransactionType(Accounting.TransactionType transactionType) {
		if (transactionType.equals(Accounting.TransactionType.BOOKING)) {
			return TransactionType.BOOKING;
		} else if (transactionType.equals(Accounting.TransactionType.CANCELLATION)) {
			return TransactionType.CANCELLATION;
		} else if (transactionType.equals(Accounting.TransactionType.COMPENSATION)) {
			return TransactionType.COMPENSATION;
		} else if (transactionType.equals(Accounting.TransactionType.EXCHANGE_BOOKING)) {
			return TransactionType.EXCHANGE_BOOKING;
		} else if (transactionType.equals(Accounting.TransactionType.EXCHANGE_CANCELATION)) {
			return TransactionType.EXCHANGE_CANCELLATION;
		} else if (transactionType.equals(Accounting.TransactionType.MANUAL_REFUND)) {
			return TransactionType.MANUAL_REFUND;
		} else if (transactionType.equals(Accounting.TransactionType.PREBOOKING_TIME_EXTENSION)) {
			return TransactionType.PREBOOKING_TIME_EXTENSION;
		}
		return null;
	}

	private AccountingDeliveryDetails convert(AccountingDelivery mObj) {
		
		AccountingDeliveryDetails jObj = new AccountingDeliveryDetails();
		
		jObj.setCreationDate(mObj.getCreationDate());
		
		jObj.setId(UUID.fromString(mObj.getId()));
		
		if (mObj.getEndStatementPeriod() != null) {
			jObj.setEndStatementPeriod(mObj.getEndStatementPeriod());
		}
		
		jObj.setInvoiceRecipient(mObj.getInvoiceRecipient().getCode());
		jObj.setInvoicingParty(mObj.getInvoicingParty().getCode());
		
		if (mObj.getPaymentType() != null) {
			jObj.setPaymentType(PaymentType.fromValue(mObj.getPaymentType().getLiteral()));
		}
		
		if (mObj.getStartStatementPeriod() != null) {
			jObj.setStartStatementPeriod(mObj.getStartStatementPeriod());
		}
		return jObj;
	}





}
