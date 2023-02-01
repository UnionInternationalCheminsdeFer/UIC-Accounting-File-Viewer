
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
    "time",
    "type",
    "contract",
    "bookedOfferId",
    "ticketId",
    "fulfillmentIds",
    "exchangedBookedOfferId"
})
public class Transaction {

    /**
     * UTC date time of the timestamp when the transaction was made
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZZZ", timezone = "UTC")
    @JsonProperty("time")
    @JsonPropertyDescription("UTC date time of the timestamp when the transaction was made")
    private Date time;
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
     * id of the ticket in case the provider is responsible for the ticket creation used in barcodes according to 90918-9
     * 
     */
    @JsonProperty("ticketId")
    @JsonPropertyDescription("id of the ticket in case the provider is responsible for the ticket creation used in barcodes according to 90918-9")
    private String ticketId;
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
     * (Required)
     * 
     */
    @JsonProperty("time")
    public Date getTime() {
        return time;
    }

    /**
     * UTC date time of the timestamp when the transaction was made
     * (Required)
     * 
     */
    @JsonProperty("time")
    public void setTime(Date time) {
        this.time = time;
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
     * id of the ticket in case the provider is responsible for the ticket creation used in barcodes according to 90918-9
     * 
     */
    @JsonProperty("ticketId")
    public String getTicketId() {
        return ticketId;
    }

    /**
     * id of the ticket in case the provider is responsible for the ticket creation used in barcodes according to 90918-9
     * 
     */
    @JsonProperty("ticketId")
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
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
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
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
        sb.append("ticketId");
        sb.append('=');
        sb.append(((this.ticketId == null)?"<null>":this.ticketId));
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
        result = ((result* 31)+((this.contract == null)? 0 :this.contract.hashCode()));
        result = ((result* 31)+((this.bookedOfferId == null)? 0 :this.bookedOfferId.hashCode()));
        result = ((result* 31)+((this.fulfillmentIds == null)? 0 :this.fulfillmentIds.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.exchangedBookedOfferId == null)? 0 :this.exchangedBookedOfferId.hashCode()));
        result = ((result* 31)+((this.ticketId == null)? 0 :this.ticketId.hashCode()));
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
        return ((((((((this.contract == rhs.contract)||((this.contract!= null)&&this.contract.equals(rhs.contract)))&&((this.bookedOfferId == rhs.bookedOfferId)||((this.bookedOfferId!= null)&&this.bookedOfferId.equals(rhs.bookedOfferId))))&&((this.fulfillmentIds == rhs.fulfillmentIds)||((this.fulfillmentIds!= null)&&this.fulfillmentIds.equals(rhs.fulfillmentIds))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.exchangedBookedOfferId == rhs.exchangedBookedOfferId)||((this.exchangedBookedOfferId!= null)&&this.exchangedBookedOfferId.equals(rhs.exchangedBookedOfferId))))&&((this.ticketId == rhs.ticketId)||((this.ticketId!= null)&&this.ticketId.equals(rhs.ticketId))));
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
