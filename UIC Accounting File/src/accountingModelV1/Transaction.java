package accountingModelV1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "type",
    "contract",
    "bookedOfferId",
    "bookedOfferPartIds",
    "accountingReferenceIds",
    "ticketIds",
    "fulfillmentIds",
    "exchangedBookedOfferId"
})
public class Transaction {

    /**
     * UTC date time of the timestamp when the transaction was made
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZZZ", timezone = "UTC")
    @JsonProperty("timestamp")
    @JsonPropertyDescription("UTC date time of the timestamp when the transaction was made")
    private Date timestamp;
    /**
     * type of the sales transaction accounted
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("type of the sales transaction accounted")
    private Transaction.TransactionType type;
    /**
     * id of the sales contact used for this transaction defining the commission
     * (Required)
     * 
     */
    @JsonProperty("contract")
    @JsonPropertyDescription("id of the sales contact used for this transaction defining the commission")
    private String contract;
    /**
     * booked offer id of the provider in case of an online booking
     * 
     */
    @JsonProperty("bookedOfferId")
    @JsonPropertyDescription("booked offer id of the provider in case of an online booking")
    private String bookedOfferId;
    /**
     * booked offer part ids of the provider in case of an online booking
     * 
     */
    @JsonProperty("bookedOfferPartIds")
    @JsonPropertyDescription("booked offer part ids of the provider in case of an online booking")
    private List<String> bookedOfferPartIds = new ArrayList<String>();
    /**
     * accounting ids that were provided in the bookingPart accountingRef in an online booking
     * 
     */
    @JsonProperty("accountingReferenceIds")
    @JsonPropertyDescription("accounting ids that were provided in the bookingPart accountingRef in an online booking")
    private List<String> accountingReferenceIds = new ArrayList<String>();
    /**
     * ids of the tickets in case the provider is responsible for the ticket creation used in barcodes according to 90918-9
     * 
     */
    @JsonProperty("ticketIds")
    @JsonPropertyDescription("ids of the tickets in case the provider is responsible for the ticket creation used in barcodes according to 90918-9")
    private List<String> ticketIds = new ArrayList<String>();
    /**
     * OSDM fulfillment idsassociated with this accounting transaction
     * 
     */
    @JsonProperty("fulfillmentIds")
    @JsonPropertyDescription("OSDM fulfillment idsassociated with this accounting transaction")
    private List<String> fulfillmentIds = new ArrayList<String>();
    /**
     * reference of the original booked offer that was exchanged in case of an exchange transaction
     * 
     */
    @JsonProperty("exchangedBookedOfferId")
    @JsonPropertyDescription("reference of the original booked offer that was exchanged in case of an exchange transaction")
    private String exchangedBookedOfferId;

    /**
     * UTC date time of the timestamp when the transaction was made
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * UTC date time of the timestamp when the transaction was made
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * type of the sales transaction accounted
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Transaction.TransactionType getType() {
        return type;
    }

    /**
     * type of the sales transaction accounted
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Transaction.TransactionType type) {
        this.type = type;
    }

    /**
     * id of the sales contact used for this transaction defining the commission
     * (Required)
     * 
     */
    @JsonProperty("contract")
    public String getContract() {
        return contract;
    }

    /**
     * id of the sales contact used for this transaction defining the commission
     * (Required)
     * 
     */
    @JsonProperty("contract")
    public void setContract(String contract) {
        this.contract = contract;
    }

    /**
     * booked offer id of the provider in case of an online booking
     * 
     */
    @JsonProperty("bookedOfferId")
    public String getBookedOfferId() {
        return bookedOfferId;
    }

    /**
     * booked offer id of the provider in case of an online booking
     * 
     */
    @JsonProperty("bookedOfferId")
    public void setBookedOfferId(String bookedOfferId) {
        this.bookedOfferId = bookedOfferId;
    }

    /**
     * booked offer part ids of the provider in case of an online booking
     * 
     */
    @JsonProperty("bookedOfferPartIds")
    public List<String> getBookedOfferPartIds() {
        return bookedOfferPartIds;
    }

    /**
     * booked offer part ids of the provider in case of an online booking
     * 
     */
    @JsonProperty("bookedOfferPartIds")
    public void setBookedOfferPartIds(List<String> bookedOfferPartIds) {
        this.bookedOfferPartIds = bookedOfferPartIds;
    }

    /**
     * accounting ids that were provided in the bookingPart accountingRef in an online booking
     * 
     */
    @JsonProperty("accountingReferenceIds")
    public List<String> getAccountingReferenceIds() {
        return accountingReferenceIds;
    }

    /**
     * accounting ids that were provided in the bookingPart accountingRef in an online booking
     * 
     */
    @JsonProperty("accountingReferenceIds")
    public void setAccountingReferenceIds(List<String> accountingReferenceIds) {
        this.accountingReferenceIds = accountingReferenceIds;
    }

    /**
     * ids of the tickets in case the provider is responsible for the ticket creation used in barcodes according to 90918-9
     * 
     */
    @JsonProperty("ticketIds")
    public List<String> getTicketIds() {
        return ticketIds;
    }

    /**
     * ids of the tickets in case the provider is responsible for the ticket creation used in barcodes according to 90918-9
     * 
     */
    @JsonProperty("ticketIds")
    public void setTicketIds(List<String> ticketIds) {
        this.ticketIds = ticketIds;
    }

    /**
     * OSDM fulfillment idsassociated with this accounting transaction
     * 
     */
    @JsonProperty("fulfillmentIds")
    public List<String> getFulfillmentIds() {
        return fulfillmentIds;
    }

    /**
     * OSDM fulfillment idsassociated with this accounting transaction
     * 
     */
    @JsonProperty("fulfillmentIds")
    public void setFulfillmentIds(List<String> fulfillmentIds) {
        this.fulfillmentIds = fulfillmentIds;
    }

    /**
     * reference of the original booked offer that was exchanged in case of an exchange transaction
     * 
     */
    @JsonProperty("exchangedBookedOfferId")
    public String getExchangedBookedOfferId() {
        return exchangedBookedOfferId;
    }

    /**
     * reference of the original booked offer that was exchanged in case of an exchange transaction
     * 
     */
    @JsonProperty("exchangedBookedOfferId")
    public void setExchangedBookedOfferId(String exchangedBookedOfferId) {
        this.exchangedBookedOfferId = exchangedBookedOfferId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Transaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("contract");
        sb.append('=');
        sb.append(((this.contract == null)?"<null>":this.contract));
        sb.append(',');
        sb.append("bookedOfferId");
        sb.append('=');
        sb.append(((this.bookedOfferId == null)?"<null>":this.bookedOfferId));
        sb.append(',');
        sb.append("bookedOfferPartIds");
        sb.append('=');
        sb.append(((this.bookedOfferPartIds == null)?"<null>":this.bookedOfferPartIds));
        sb.append(',');
        sb.append("accountingReferenceIds");
        sb.append('=');
        sb.append(((this.accountingReferenceIds == null)?"<null>":this.accountingReferenceIds));
        sb.append(',');
        sb.append("ticketIds");
        sb.append('=');
        sb.append(((this.ticketIds == null)?"<null>":this.ticketIds));
        sb.append(',');
        sb.append("fulfillmentIds");
        sb.append('=');
        sb.append(((this.fulfillmentIds == null)?"<null>":this.fulfillmentIds));
        sb.append(',');
        sb.append("exchangedBookedOfferId");
        sb.append('=');
        sb.append(((this.exchangedBookedOfferId == null)?"<null>":this.exchangedBookedOfferId));
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
        result = ((result* 31)+((this.bookedOfferPartIds == null)? 0 :this.bookedOfferPartIds.hashCode()));
        result = ((result* 31)+((this.accountingReferenceIds == null)? 0 :this.accountingReferenceIds.hashCode()));
        result = ((result* 31)+((this.contract == null)? 0 :this.contract.hashCode()));
        result = ((result* 31)+((this.bookedOfferId == null)? 0 :this.bookedOfferId.hashCode()));
        result = ((result* 31)+((this.fulfillmentIds == null)? 0 :this.fulfillmentIds.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.exchangedBookedOfferId == null)? 0 :this.exchangedBookedOfferId.hashCode()));
        result = ((result* 31)+((this.ticketIds == null)? 0 :this.ticketIds.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return ((((((((((this.bookedOfferPartIds == rhs.bookedOfferPartIds)||((this.bookedOfferPartIds!= null)&&this.bookedOfferPartIds.equals(rhs.bookedOfferPartIds)))&&((this.accountingReferenceIds == rhs.accountingReferenceIds)||((this.accountingReferenceIds!= null)&&this.accountingReferenceIds.equals(rhs.accountingReferenceIds))))&&((this.contract == rhs.contract)||((this.contract!= null)&&this.contract.equals(rhs.contract))))&&((this.bookedOfferId == rhs.bookedOfferId)||((this.bookedOfferId!= null)&&this.bookedOfferId.equals(rhs.bookedOfferId))))&&((this.fulfillmentIds == rhs.fulfillmentIds)||((this.fulfillmentIds!= null)&&this.fulfillmentIds.equals(rhs.fulfillmentIds))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.exchangedBookedOfferId == rhs.exchangedBookedOfferId)||((this.exchangedBookedOfferId!= null)&&this.exchangedBookedOfferId.equals(rhs.exchangedBookedOfferId))))&&((this.ticketIds == rhs.ticketIds)||((this.ticketIds!= null)&&this.ticketIds.equals(rhs.ticketIds))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

    public enum TransactionType {

        BOOKING("BOOKING"),
        CANCELATION("CANCELATION"),
        EXCHANGE_CANCELLATION("EXCHANGE_CANCELLATION"),
        EXCHANGE_BOOKING("EXCHANGE_BOOKING"),
        COMPENSATION("COMPENSATION"),
        MANUAL_REFUND("MANUAL_REFUND");
        private final String value;
        private final static Map<String, Transaction.TransactionType> CONSTANTS = new HashMap<String, Transaction.TransactionType>();

        static {
            for (Transaction.TransactionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TransactionType(String value) {
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
        public static Transaction.TransactionType fromValue(String value) {
            Transaction.TransactionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
