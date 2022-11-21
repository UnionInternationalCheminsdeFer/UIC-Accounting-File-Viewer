
package accountingModelV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * number and identification of the subject of accounting 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfItems",
    "fareId",
    "legacyDescription",
    "salesChannel",
    "salesOfficeId",
    "train",
    "travelDate",
    "countryOfSale",
    "bilateralTariffIdentifier",
    "carriers",
    "retailer"
})
public class Subject {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("numberOfItems")
    private Integer numberOfItems;
    /**
     * if of the fare included in the accounting in case of OFFLINE sales in OSDM
     * 
     */
    @JsonProperty("fareId")
    @JsonPropertyDescription("if of the fare included in the accounting in case of OFFLINE sales in OSDM")
    private String fareId;
    @JsonProperty("legacyDescription")
    private LegacyDescription legacyDescription;
    @JsonProperty("salesChannel")
    private Subject.SalesChannel salesChannel;
    @JsonProperty("salesOfficeId")
    private String salesOfficeId;
    /**
     * train number in case the transaction involves one and only one train
     * 
     */
    @JsonProperty("train")
    @JsonPropertyDescription("train number in case the transaction involves one and only one train")
    private String train;
    /**
     * date of the first possible day of travel in the time zone where the travel starts.
     * 
     */
    @JsonProperty("travelDate")
    @JsonPropertyDescription("date of the first possible day of travel in the time zone where the travel starts.")
    private String travelDate;
    /**
     * Country of the point of sale (ISO Country Code 2A)
     * 
     */
    @JsonProperty("countryOfSale")
    @JsonPropertyDescription("Country of the point of sale (ISO Country Code 2A)")
    private String countryOfSale;
    /**
     * Identifier of a fare based on bilateral agreements. Both parties involved must agree on the content provided.
     * 
     */
    @JsonProperty("bilateralTariffIdentifier")
    @JsonPropertyDescription("Identifier of a fare based on bilateral agreements. Both parties involved must agree on the content provided.")
    private String bilateralTariffIdentifier;
    /**
     * RICS code(s) of the carriers responsible for transportation. 
     * 
     */
    @JsonProperty("carriers")
    @JsonPropertyDescription("RICS code(s) of the carriers responsible for transportation. ")
    private List<String> carriers = new ArrayList<String>();
    /**
     * RICS code of the retailing company. Commission rates might depend on the retailing company.
     * 
     */
    @JsonProperty("retailer")
    @JsonPropertyDescription("RICS code of the retailing company. Commission rates might depend on the retailing company.")
    private String retailer;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("numberOfItems")
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("numberOfItems")
    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    /**
     * if of the fare included in the accounting in case of OFFLINE sales in OSDM
     * 
     */
    @JsonProperty("fareId")
    public String getFareId() {
        return fareId;
    }

    /**
     * if of the fare included in the accounting in case of OFFLINE sales in OSDM
     * 
     */
    @JsonProperty("fareId")
    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    @JsonProperty("legacyDescription")
    public LegacyDescription getLegacyDescription() {
        return legacyDescription;
    }

    @JsonProperty("legacyDescription")
    public void setLegacyDescription(LegacyDescription legacyDescription) {
        this.legacyDescription = legacyDescription;
    }

    @JsonProperty("salesChannel")
    public Subject.SalesChannel getSalesChannel() {
        return salesChannel;
    }

    @JsonProperty("salesChannel")
    public void setSalesChannel(Subject.SalesChannel salesChannel) {
        this.salesChannel = salesChannel;
    }

    @JsonProperty("salesOfficeId")
    public String getSalesOfficeId() {
        return salesOfficeId;
    }

    @JsonProperty("salesOfficeId")
    public void setSalesOfficeId(String salesOfficeId) {
        this.salesOfficeId = salesOfficeId;
    }

    /**
     * train number in case the transaction involves one and only one train
     * 
     */
    @JsonProperty("train")
    public String getTrain() {
        return train;
    }

    /**
     * train number in case the transaction involves one and only one train
     * 
     */
    @JsonProperty("train")
    public void setTrain(String train) {
        this.train = train;
    }

    /**
     * date of the first possible day of travel in the time zone where the travel starts.
     * 
     */
    @JsonProperty("travelDate")
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * date of the first possible day of travel in the time zone where the travel starts.
     * 
     */
    @JsonProperty("travelDate")
    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    /**
     * Country of the point of sale (ISO Country Code 2A)
     * 
     */
    @JsonProperty("countryOfSale")
    public String getCountryOfSale() {
        return countryOfSale;
    }

    /**
     * Country of the point of sale (ISO Country Code 2A)
     * 
     */
    @JsonProperty("countryOfSale")
    public void setCountryOfSale(String countryOfSale) {
        this.countryOfSale = countryOfSale;
    }

    /**
     * Identifier of a fare based on bilateral agreements. Both parties involved must agree on the content provided.
     * 
     */
    @JsonProperty("bilateralTariffIdentifier")
    public String getBilateralTariffIdentifier() {
        return bilateralTariffIdentifier;
    }

    /**
     * Identifier of a fare based on bilateral agreements. Both parties involved must agree on the content provided.
     * 
     */
    @JsonProperty("bilateralTariffIdentifier")
    public void setBilateralTariffIdentifier(String bilateralTariffIdentifier) {
        this.bilateralTariffIdentifier = bilateralTariffIdentifier;
    }

    /**
     * RICS code(s) of the carriers responsible for transportation. 
     * 
     */
    @JsonProperty("carriers")
    public List<String> getCarriers() {
        return carriers;
    }

    /**
     * RICS code(s) of the carriers responsible for transportation. 
     * 
     */
    @JsonProperty("carriers")
    public void setCarriers(List<String> carriers) {
        this.carriers = carriers;
    }

    /**
     * RICS code of the retailing company. Commission rates might depend on the retailing company.
     * 
     */
    @JsonProperty("retailer")
    public String getRetailer() {
        return retailer;
    }

    /**
     * RICS code of the retailing company. Commission rates might depend on the retailing company.
     * 
     */
    @JsonProperty("retailer")
    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Subject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numberOfItems");
        sb.append('=');
        sb.append(((this.numberOfItems == null)?"<null>":this.numberOfItems));
        sb.append(',');
        sb.append("fareId");
        sb.append('=');
        sb.append(((this.fareId == null)?"<null>":this.fareId));
        sb.append(',');
        sb.append("legacyDescription");
        sb.append('=');
        sb.append(((this.legacyDescription == null)?"<null>":this.legacyDescription));
        sb.append(',');
        sb.append("salesChannel");
        sb.append('=');
        sb.append(((this.salesChannel == null)?"<null>":this.salesChannel));
        sb.append(',');
        sb.append("salesOfficeId");
        sb.append('=');
        sb.append(((this.salesOfficeId == null)?"<null>":this.salesOfficeId));
        sb.append(',');
        sb.append("train");
        sb.append('=');
        sb.append(((this.train == null)?"<null>":this.train));
        sb.append(',');
        sb.append("travelDate");
        sb.append('=');
        sb.append(((this.travelDate == null)?"<null>":this.travelDate));
        sb.append(',');
        sb.append("countryOfSale");
        sb.append('=');
        sb.append(((this.countryOfSale == null)?"<null>":this.countryOfSale));
        sb.append(',');
        sb.append("bilateralTariffIdentifier");
        sb.append('=');
        sb.append(((this.bilateralTariffIdentifier == null)?"<null>":this.bilateralTariffIdentifier));
        sb.append(',');
        sb.append("carriers");
        sb.append('=');
        sb.append(((this.carriers == null)?"<null>":this.carriers));
        sb.append(',');
        sb.append("retailer");
        sb.append('=');
        sb.append(((this.retailer == null)?"<null>":this.retailer));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.countryOfSale == null)? 0 :this.countryOfSale.hashCode()));
        result = ((result* 31)+((this.fareId == null)? 0 :this.fareId.hashCode()));
        result = ((result* 31)+((this.travelDate == null)? 0 :this.travelDate.hashCode()));
        result = ((result* 31)+((this.retailer == null)? 0 :this.retailer.hashCode()));
        result = ((result* 31)+((this.numberOfItems == null)? 0 :this.numberOfItems.hashCode()));
        result = ((result* 31)+((this.salesOfficeId == null)? 0 :this.salesOfficeId.hashCode()));
        result = ((result* 31)+((this.bilateralTariffIdentifier == null)? 0 :this.bilateralTariffIdentifier.hashCode()));
        result = ((result* 31)+((this.legacyDescription == null)? 0 :this.legacyDescription.hashCode()));
        result = ((result* 31)+((this.carriers == null)? 0 :this.carriers.hashCode()));
        result = ((result* 31)+((this.salesChannel == null)? 0 :this.salesChannel.hashCode()));
        result = ((result* 31)+((this.train == null)? 0 :this.train.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subject) == false) {
            return false;
        }
        Subject rhs = ((Subject) other);
        return ((((((((((((this.countryOfSale == rhs.countryOfSale)||((this.countryOfSale!= null)&&this.countryOfSale.equals(rhs.countryOfSale)))&&((this.fareId == rhs.fareId)||((this.fareId!= null)&&this.fareId.equals(rhs.fareId))))&&((this.travelDate == rhs.travelDate)||((this.travelDate!= null)&&this.travelDate.equals(rhs.travelDate))))&&((this.retailer == rhs.retailer)||((this.retailer!= null)&&this.retailer.equals(rhs.retailer))))&&((this.numberOfItems == rhs.numberOfItems)||((this.numberOfItems!= null)&&this.numberOfItems.equals(rhs.numberOfItems))))&&((this.salesOfficeId == rhs.salesOfficeId)||((this.salesOfficeId!= null)&&this.salesOfficeId.equals(rhs.salesOfficeId))))&&((this.bilateralTariffIdentifier == rhs.bilateralTariffIdentifier)||((this.bilateralTariffIdentifier!= null)&&this.bilateralTariffIdentifier.equals(rhs.bilateralTariffIdentifier))))&&((this.legacyDescription == rhs.legacyDescription)||((this.legacyDescription!= null)&&this.legacyDescription.equals(rhs.legacyDescription))))&&((this.carriers == rhs.carriers)||((this.carriers!= null)&&this.carriers.equals(rhs.carriers))))&&((this.salesChannel == rhs.salesChannel)||((this.salesChannel!= null)&&this.salesChannel.equals(rhs.salesChannel))))&&((this.train == rhs.train)||((this.train!= null)&&this.train.equals(rhs.train))));
    }

    public enum SalesChannel {

        AGENCY("AGENCY"),
        AGENCY_WEB("AGENCY_WEB"),
        MOBILE("MOBILE"),
        RAIL_OFFICE("RAIL_OFFICE"),
        VENDING_MACHINE("VENDING_MACHINE"),
        WEB("WEB"),
        WEB_MOBILE("WEB_MOBILE"),
        ON_BOARD("ON_BOARD");
        private final String value;
        private final static Map<String, Subject.SalesChannel> CONSTANTS = new HashMap<String, Subject.SalesChannel>();

        static {
            for (Subject.SalesChannel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SalesChannel(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Subject.SalesChannel fromValue(String value) {
            Subject.SalesChannel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
