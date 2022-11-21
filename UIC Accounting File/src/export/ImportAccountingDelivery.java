package export;

import java.io.File;
import java.io.IOException;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;

import accountingModelV1.AccountingDataDelivery;

public class ImportAccountingDelivery {
	
	
	public static AccountingDataDelivery importAccountingFile(File file) throws Exception, IOException {
	
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, false);

		StdDateFormat df = new StdDateFormat();
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		mapper.setDateFormat(df);
		
		AccountingDataDelivery accounting = null;

		//JSON file to Java object
		accounting  = mapper.readValue(file, AccountingDataDelivery.class);
		
		return accounting;
		
	}

}
