
package accountingModelV1;

import java.util.Date;
import java.util.HashMap;
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
    "fulfillmentId",
    "exchangedBookedOfferId",
    "communicationId"
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
     * OSDM fulfillment id associated with this accounting transaction
     * 
     */
    @JsonProperty("fulfillmentId")
    @JsonPropertyDescription("OSDM fulfillment id associated with this accounting transaction")
    private String fulfillmentId;
    /**
     * reference of the original booked offer that was exchanged in case of an exchange transaction
     * 
     */
    @JsonProperty("exchangedBookedOfferId")
    @JsonPropertyDescription("reference of the original booked offer that was exchanged in case of an exchange transaction")
    private String exchangedBookedOfferId;
    /**
     * identification of the communication that caused the transaction e.g. the dialog number in the booking transaction according to IRS 90918-1. The comminiicatioId is mandatory in case of one step bookings where the bookingId might not be known by both partners in case of errors as might be the case with IRS 90918-1.
     * 
     */
    @JsonProperty("communicationId")
    @JsonPropertyDescription("identification of the communication that caused the transaction e.g. the dialog number in the booking transaction according to IRS 90918-1. The comminiicatioId is mandatory in case of one step bookings where the bookingId might not be known by both partners in case of errors as might be the case with IRS 90918-1.")
    private String communicationId;

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
     * OSDM fulfillment id associated with this accounting transaction
     * 
     */
    @JsonProperty("fulfillmentId")
    public String getFulfillmentId() {
        return fulfillmentId;
    }

    /**
     * OSDM fulfillment id associated with this accounting transaction
     * 
     */
    @JsonProperty("fulfillmentId")
    public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
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

    /**
     * identification of the communication that caused the transaction e.g. the dialog number in the booking transaction according to IRS 90918-1. The comminiicatioId is mandatory in case of one step bookings where the bookingId might not be known by both partners in case of errors as might be the case with IRS 90918-1.
     * 
     */
    @JsonProperty("communicationId")
    public String getCommunicationId() {
        return communicationId;
    }

    /**
     * identification of the communication that caused the transaction e.g. the dialog number in the booking transaction according to IRS 90918-1. The comminiicatioId is mandatory in case of one step bookings where the bookingId might not be known by both partners in case of errors as might be the case with IRS 90918-1.
     * 
     */
    @JsonProperty("communicationId")
    public void setCommunicationId(String communicationId) {
        this.communicationId = communicationId;
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
        sb.append("fulfillmentId");
        sb.append('=');
        sb.append(((this.fulfillmentId == null)?"<null>":this.fulfillmentId));
        sb.append(',');
        sb.append("exchangedBookedOfferId");
        sb.append('=');
        sb.append(((this.exchangedBookedOfferId == null)?"<null>":this.exchangedBookedOfferId));
        sb.append(',');
        sb.append("communicationId");
        sb.append('=');
        sb.append(((this.communicationId == null)?"<null>":this.communicationId));
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
        result = ((result* 31)+((this.fulfillmentId == null)? 0 :this.fulfillmentId.hashCode()));
        result = ((result* 31)+((this.contract == null)? 0 :this.contract.hashCode()));
        result = ((result* 31)+((this.communicationId == null)? 0 :this.communicationId.hashCode()));
        result = ((result* 31)+((this.bookedOfferId == null)? 0 :this.bookedOfferId.hashCode()));
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
        return (((((((((this.fulfillmentId == rhs.fulfillmentId)||((this.fulfillmentId!= null)&&this.fulfillmentId.equals(rhs.fulfillmentId)))&&((this.contract == rhs.contract)||((this.contract!= null)&&this.contract.equals(rhs.contract))))&&((this.communicationId == rhs.communicationId)||((this.communicationId!= null)&&this.communicationId.equals(rhs.communicationId))))&&((this.bookedOfferId == rhs.bookedOfferId)||((this.bookedOfferId!= null)&&this.bookedOfferId.equals(rhs.bookedOfferId))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.exchangedBookedOfferId == rhs.exchangedBookedOfferId)||((this.exchangedBookedOfferId!= null)&&this.exchangedBookedOfferId.equals(rhs.exchangedBookedOfferId))))&&((this.ticketId == rhs.ticketId)||((this.ticketId!= null)&&this.ticketId.equals(rhs.ticketId))));
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
