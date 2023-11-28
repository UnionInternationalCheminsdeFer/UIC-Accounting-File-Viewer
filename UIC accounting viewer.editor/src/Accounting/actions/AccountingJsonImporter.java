package Accounting.actions;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.SimpleTimeZone;

import org.eclipse.emf.edit.domain.EditingDomain;

import Accounting.AccountedAmounts;
import Accounting.AccountingDelivery;
import Accounting.AccountingFactory;
import Accounting.AccountingFile;
import Accounting.AccountingRecords;
import Accounting.AccountingSubject;
import Accounting.AccountingType;
import Accounting.AccountingViewerData;
import Accounting.Carrier;
import Accounting.ClassicClassType;
import Accounting.Country;
import Accounting.Currency;
import Accounting.Language;
import Accounting.LegacyDescription;
import Accounting.NutsCode;
import Accounting.PaymentType;
import Accounting.SalesChannel;
import Accounting.SalesType;
import Accounting.ServiceBrand;
import Accounting.SettlementValueIndicator;
import Accounting.Transaction;
import Accounting.TransactionStandard;
import Accounting.TransactionType;
import Accounting.TravelerType;
import Accounting.presentation.AccountingEditor;
import Accounting.utils.AccountingUtils;
import accountingModelV1.AccountedAmount;
import accountingModelV1.AccountingDataDelivery;
import accountingModelV1.AccountingDeliveryDetails;
import accountingModelV1.AccountingRecord;
import accountingModelV1.Subject;



public class AccountingJsonImporter {
	

	private AccountingEditor editor = null;
	

	private HashMap<String,Carrier> carriers = null;
	private HashMap<String,Language> languages = null;
	private HashMap<Integer,Country> countries = null;
	private HashMap<String,Country> countriesISO = null;	
	private HashMap<String,Currency> currencies = null;	
	private HashMap<Integer,ServiceBrand> serviceBrands = null;
	private HashMap<String,NutsCode> nutsCodes = null;
	
	
	/*
	 *   y   = year   (yy or yyyy)
	 *	M   = month  (MM)
	 *	d   = day in month (dd)
	 *	h   = hour (0-12)  (hh)
	 *	H   = hour (0-23)  (HH)
	 *	m   = minute in hour (mm)
	 *	s   = seconds (ss)
	 *	S   = milliseconds (SSS)
	 *	z   = time zone  text        (e.g. Pacific Standard Time...)
	 *	Z   = time zone, time offset (e.g. -0800)
	 */
	final DateFormat fmtZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); //$NON-NLS-1$
	final DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); //$NON-NLS-1$
	final DateFormat pmdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a z"); //$NON-NLS-1$
	AccountingViewerData accounting = null;
	
	AccountingFile accountingFile = null;

	
	public AccountingJsonImporter(AccountingViewerData accounting, EditingDomain domain, AccountingEditor editor) {
		this.accounting = accounting;
		this.editor = editor;
		carriers = new HashMap<String,Carrier>();
		countriesISO = new HashMap<String,Country>();
		countries = new HashMap<Integer,Country>();
		languages = new HashMap<String,Language>();
		currencies = new HashMap<String,Currency>();	
		serviceBrands = new HashMap<Integer,ServiceBrand>();
		nutsCodes = new HashMap<String,NutsCode>();	
		
		for (Carrier carrier : accounting.getCodeLists().getCarriers().getCarriers()) {
			carriers.put(carrier.getCode() , carrier);
		}
		if (accounting.getCodeLists().getLanguages() != null) {
			for (Language language : accounting.getCodeLists().getLanguages().getLanguages()) {
				languages.put(language.getCode() ,language);
			}
		}
		for (Country country : accounting.getCodeLists().getCountries().getCountries()) {
			countries.put(Integer.valueOf(country.getCode()),country);
			countriesISO.put(country.getISOcode(), country);
		}
		if (accounting.getCodeLists().getCurrencies() != null) {
			for (Currency currency : accounting.getCodeLists().getCurrencies().getCurrencies()) {
				currencies.put(currency.getIsoCode(),currency);
			}
		}
		if ( accounting.getCodeLists().getServiceBrands() != null) {
			if (accounting.getCodeLists().getServiceBrands() != null) {
				for (ServiceBrand s : accounting.getCodeLists().getServiceBrands().getServiceBrands()) {
					serviceBrands.put(Integer.valueOf(s.getCode()),s);
				}
			}
		}
		
		if ( accounting.getCodeLists().getNutsCodes() != null) {
			if (accounting.getCodeLists().getNutsCodes() != null) {
				for (NutsCode s : accounting.getCodeLists().getNutsCodes().getNutsCodes()) {
					nutsCodes.put(s.getCode(),s);
				}
			}
		}
	}

	public AccountingFile  convertFromJson(AccountingDataDelivery jObj) {
		
		if (jObj == null) return null;
		
		AccountingFile mObj = AccountingFactory.eINSTANCE.createAccountingFile();
		
		mObj.setAccountingDelivery(convert(jObj.getDeliveryDetails()));
		
		try {
			mObj.setAccountingRecords(convert(jObj.getAccountingRecords()));
		} catch (ParseException e) {
			AccountingUtils.writeConsoleError("Error in accounting record " + '\n'
		            + e.getMessage() + '\n'
					+ e.getStackTrace(), editor);
		}
	
		return mObj;
	}
	


	

	private AccountingRecords convert(List<AccountingRecord> jObjL) throws ParseException {
		
		AccountingRecords mObjL = AccountingFactory.eINSTANCE.createAccountingRecords();
		
		
		for (AccountingRecord jObj: jObjL) {
			
			Accounting.AccountingRecord mObj = AccountingFactory.eINSTANCE.createAccountingRecord();
			
			if (jObj.getAccountingType() != null) {
				mObj.setAccountingType(AccountingType.get(jObj.getAccountingType().value()));
			}
			
			mObj.setAccountedAmounts(convertAmounts(jObj.getAccountedAmounts()));
			if (jObj.getId() != null) {
			  mObj.setId(jObj.getId().toString());
			}
			 
			if (jObj.getSalesType() != null) {
				mObj.setSalesType(SalesType.get(jObj.getSalesType().value()));
			}
			
			mObj.setSubject(convert(jObj.getSubject()));
			
			mObj.setTransaction(convert(jObj.getTransaction()));
			
			if (jObj.getTransactionStandard() != null) {
				mObj.setTransactionStandard(TransactionStandard.get(jObj.getTransactionStandard().value()));
			}
			
			mObjL.getAccountingRecords().add(mObj);
			
		}
		
		return mObjL;
	}





	private Transaction convert(accountingModelV1.Transaction jObj) {
		
		if (jObj == null) return null;
		
		Transaction mObj = AccountingFactory.eINSTANCE.createTransaction();
		
		mObj.setBookingId(jObj.getBookedOfferId());
		mObj.setContract(jObj.getContract());
		mObj.setExchangebookingId(jObj.getExchangedBookedOfferId());
		
		if (jObj.getFulfillmentIds() != null && !jObj.getFulfillmentIds().isEmpty()) {
			mObj.getFulfillmentIds().addAll(jObj.getFulfillmentIds());
		}
		
		if (jObj.getBookedOfferPartIds() != null && !jObj.getBookedOfferPartIds().isEmpty()) {
			mObj.getBookingPartIds().addAll(jObj.getBookedOfferPartIds());
		}
		
		if (jObj.getAccountingReferenceIds() != null && !jObj.getAccountingReferenceIds().isEmpty()) {
			mObj.getAccountingReferenceIds().addAll(jObj.getAccountingReferenceIds());
		}
		
		if (jObj.getTicketIds() != null && !jObj.getTicketIds().isEmpty()) {
			mObj.getTicketIds().addAll(jObj.getTicketIds());
		}

		mObj.setTransactionTime(jObj.getTime());
		
		if (jObj.getType() != null) {
			mObj.setTransactionType(TransactionType.get(jObj.getType().value()));
		}
		return mObj;
	}


	private AccountingSubject convert(Subject jObj) throws ParseException {
		
		if (jObj == null) return null;
		
		AccountingSubject mObj = AccountingFactory.eINSTANCE.createAccountingSubject();
		
		mObj.setBilateralTariffIdentifier(jObj.getBilateralTariffIdentifier());
		
		mObj.setCountryOfSale(getCountry(jObj.getCountryOfSale()));
		
		mObj.setFareId(jObj.getFareId());
		
		mObj.setLegacyDescription(convert(jObj.getLegacyDescription()));
		
		mObj.setNumberOfItems(jObj.getNumberOfItems());

		mObj.setRetailer(getCarrier(jObj.getRetailer()));
		
		if (jObj.getSalesChannel() != null) {
			mObj.setSalesChannel(SalesChannel.get(jObj.getSalesChannel().value()));
		}
		
		mObj.setSalesOfficeId(jObj.getSalesOfficeId());
		
		mObj.setTrain(jObj.getTrain());
		
		if (jObj.getTravelDate() != null) {
			mObj.setTravelDate(convertDate(jObj.getTravelDate()));
		}
		if (jObj.getCarriers() != null && !jObj.getCarriers().isEmpty()) {
			mObj.getCarriers().addAll(convertCarriers(jObj.getCarriers()));
		}
		
		return mObj;
	}


	private Date convertDate(String travelDate) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
		sdf.applyPattern("yyyy-MM-dd");
		return sdf.parse(travelDate);
	}

	private Collection<Carrier> convertCarriers(List<String> jObjL) {
		
		Collection<Carrier> mObjL= new ArrayList<Carrier>();
		
		if (jObjL != null) {
			for (String s : jObjL) {
				Carrier c = getCarrier(s);
				if (c != null) {
					mObjL.add(c);
				}
			}
		}

		return mObjL;
	}


	private LegacyDescription convert(accountingModelV1.LegacyDescription jObj) {
		
		if (jObj == null) return null;
		
		LegacyDescription mObj = AccountingFactory.eINSTANCE.createLegacyDescription();
		
		if (jObj.getClassCode() != null) {
			mObj.setClassCode(ClassicClassType.get(jObj.getClassCode().value()));
		}
		
		mObj.setPassengerType(TravelerType.get(jObj.getPassengerType()));
		
		mObj.setSeries(jObj.getSeries());
		
		mObj.setTariff(jObj.getTariff());
		
		mObj.setDialogNumber(jObj.getDialogNumber());
		
		return mObj;
	}


	private AccountedAmounts convertAmounts(List<AccountedAmount> jObjL) {
		
		AccountedAmounts mObjL = AccountingFactory.eINSTANCE.createAccountedAmounts();
		
		for (accountingModelV1.AccountedAmount jObj: jObjL) {
			
			Accounting.AccountedAmount mObj = AccountingFactory.eINSTANCE.createAccountedAmount();
					
			if (jObj.getSettlementValueIndicator() != null) {
				mObj.setSettlementValueIndicator(SettlementValueIndicator.get(jObj.getSettlementValueIndicator().value()));
			}
			
			mObj.setCommission(jObj.getCommission());
			
			mObj.setFee(jObj.getRefundFee());
			
			mObj.setCurrency(getCurrency(jObj.getCurrency()));
			
			mObj.setGrossAmount(jObj.getGrossAmount());

			mObj.setCommission(jObj.getCommission());
			
			mObj.setAmount(convertToDecimal(jObj.getAmount(),jObj.getScale()));
			
			mObj.setRate(convertToDecimal(jObj.getRate(),jObj.getRateScale()));
			
			mObjL.getAccountedAmounts().add(mObj);
			
		}
		
		return mObjL;
	}


	private BigDecimal convertToDecimal(Integer value, Integer scale) {
		
		if (scale == null) {
			scale = 2;
		}
		if (value == null) {
			return null;
		}
		
		String is = value.toString();
		
		while (scale >= is.length()) {
			is = 0 + is;
		}
		
		String dec1 = is.substring(0, is.length() - scale);
		String dec2 = is.substring(is.length() - scale);
		String dec = dec1+"." + dec2;
		
		BigDecimal a = new BigDecimal(dec);
				
		return a;
	}


	private AccountingDelivery convert(AccountingDeliveryDetails jObj) {
		
		if (jObj == null) return null;
		
		AccountingDelivery mObj = AccountingFactory.eINSTANCE.createAccountingDelivery();
		
		mObj.setCreationDate(jObj.getCreationDate());
		mObj.setId(jObj.getId().toString());
		mObj.setStartStatementPeriod(jObj.getStartStatementPeriod());
		mObj.setEndStatementPeriod(jObj.getEndStatementPeriod());
		
		if (jObj.getPaymentType() != null) {
			mObj.setPaymentType(PaymentType.get(jObj.getPaymentType().value()));
		}
		
		mObj.setInvoiceRecipient(getCarrier(jObj.getInvoiceRecipient()));
		mObj.setInvoicingParty(getCarrier(jObj.getInvoicingParty()));
		
		return mObj;
	}


	private Carrier getCarrier (String code) {
		
		if (code == null || code.length() == 0) return null;

		Carrier c = carriers.get(code);
		if (c == null) {
			AccountingUtils.writeConsoleError("Carrier not found: " + code, editor);
		}			
		
		return c;
	}
	


	private Country getCountry (String code) {
		
		if (code == null || code.length() == 0) return null;
		
		Country c =  countriesISO.get(code);
		
		if (c == null) {
			AccountingUtils.writeConsoleError("Country not found: " + code, editor);
		}				

		return c;
	}
	
	private Currency getCurrency (String code) {
		
		if (code == null || code.length() == 0) return null;
		
		Currency c =  currencies.get(code);

		if (c == null) {
			AccountingUtils.writeConsoleError("Currency not found: " + code, editor);
		}				
		
		return c;
	}




}
