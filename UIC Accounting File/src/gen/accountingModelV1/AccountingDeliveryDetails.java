
package accountingModelV1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "creationDate",
    "invoicingParty",
    "invoiceRecipient",
    "startStatementPeriod",
    "endStatementPeriod",
    "paymentType"
})
public class AccountingDeliveryDetails {

    /**
     * unique id of the accounting data delivery
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("unique id of the accounting data delivery")
    private UUID id;
    /**
     * UTC date time when the accounting data delivery was created
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZZZ", timezone = "UTC")
    @JsonProperty("creationDate")
    @JsonPropertyDescription("UTC date time when the accounting data delivery was created")
    private Date creationDate;
    /**
     * RICS company code
     * (Required)
     * 
     */
    @JsonProperty("invoicingParty")
    @JsonPropertyDescription("RICS company code")
    private String invoicingParty;
    /**
     * RICS company code
     * (Required)
     * 
     */
    @JsonProperty("invoiceRecipient")
    @JsonPropertyDescription("RICS company code")
    private String invoiceRecipient;
    /**
     * start of the sales period contained in the accounting (UTC)
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZZZ", timezone = "UTC")
    @JsonProperty("startStatementPeriod")
    @JsonPropertyDescription("start of the sales period contained in the accounting (UTC)")
    private Date startStatementPeriod;
    /**
     * end of the sales period contained within this accounting (UTC)
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZZZ", timezone = "UTC")
    @JsonProperty("endStatementPeriod")
    @JsonPropertyDescription("end of the sales period contained within this accounting (UTC)")
    private Date endStatementPeriod;
    /**
     * BCC Clearing (multilateral clearing) 
     * current account (eg EWT)
     * Bank transfer without BCC or current account clearing
     * (Required)
     * 
     */
    @JsonProperty("paymentType")
    @JsonPropertyDescription("BCC Clearing (multilateral clearing) \r\ncurrent account (eg EWT)\r\nBank transfer without BCC or current account clearing")
    private AccountingDeliveryDetails.PaymentType paymentType;

    /**
     * unique id of the accounting data delivery
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * unique id of the accounting data delivery
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * UTC date time when the accounting data delivery was created
     * (Required)
     * 
     */
    @JsonProperty("creationDate")
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * UTC date time when the accounting data delivery was created
     * (Required)
     * 
     */
    @JsonProperty("creationDate")
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * RICS company code
     * (Required)
     * 
     */
    @JsonProperty("invoicingParty")
    public String getInvoicingParty() {
        return invoicingParty;
    }

    /**
     * RICS company code
     * (Required)
     * 
     */
    @JsonProperty("invoicingParty")
    public void setInvoicingParty(String invoicingParty) {
        this.invoicingParty = invoicingParty;
    }

    /**
     * RICS company code
     * (Required)
     * 
     */
    @JsonProperty("invoiceRecipient")
    public String getInvoiceRecipient() {
        return invoiceRecipient;
    }

    /**
     * RICS company code
     * (Required)
     * 
     */
    @JsonProperty("invoiceRecipient")
    public void setInvoiceRecipient(String invoiceRecipient) {
        this.invoiceRecipient = invoiceRecipient;
    }

    /**
     * start of the sales period contained in the accounting (UTC)
     * (Required)
     * 
     */
    @JsonProperty("startStatementPeriod")
    public Date getStartStatementPeriod() {
        return startStatementPeriod;
    }

    /**
     * start of the sales period contained in the accounting (UTC)
     * (Required)
     * 
     */
    @JsonProperty("startStatementPeriod")
    public void setStartStatementPeriod(Date startStatementPeriod) {
        this.startStatementPeriod = startStatementPeriod;
    }

    /**
     * end of the sales period contained within this accounting (UTC)
     * (Required)
     * 
     */
    @JsonProperty("endStatementPeriod")
    public Date getEndStatementPeriod() {
        return endStatementPeriod;
    }

    /**
     * end of the sales period contained within this accounting (UTC)
     * (Required)
     * 
     */
    @JsonProperty("endStatementPeriod")
    public void setEndStatementPeriod(Date endStatementPeriod) {
        this.endStatementPeriod = endStatementPeriod;
    }

    /**
     * BCC Clearing (multilateral clearing) 
     * current account (eg EWT)
     * Bank transfer without BCC or current account clearing
     * (Required)
     * 
     */
    @JsonProperty("paymentType")
    public AccountingDeliveryDetails.PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * BCC Clearing (multilateral clearing) 
     * current account (eg EWT)
     * Bank transfer without BCC or current account clearing
     * (Required)
     * 
     */
    @JsonProperty("paymentType")
    public void setPaymentType(AccountingDeliveryDetails.PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingDeliveryDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("creationDate");
        sb.append('=');
        sb.append(((this.creationDate == null)?"<null>":this.creationDate));
        sb.append(',');
        sb.append("invoicingParty");
        sb.append('=');
        sb.append(((this.invoicingParty == null)?"<null>":this.invoicingParty));
        sb.append(',');
        sb.append("invoiceRecipient");
        sb.append('=');
        sb.append(((this.invoiceRecipient == null)?"<null>":this.invoiceRecipient));
        sb.append(',');
        sb.append("startStatementPeriod");
        sb.append('=');
        sb.append(((this.startStatementPeriod == null)?"<null>":this.startStatementPeriod));
        sb.append(',');
        sb.append("endStatementPeriod");
        sb.append('=');
        sb.append(((this.endStatementPeriod == null)?"<null>":this.endStatementPeriod));
        sb.append(',');
        sb.append("paymentType");
        sb.append('=');
        sb.append(((this.paymentType == null)?"<null>":this.paymentType));
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
        result = ((result* 31)+((this.startStatementPeriod == null)? 0 :this.startStatementPeriod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.invoicingParty == null)? 0 :this.invoicingParty.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        result = ((result* 31)+((this.endStatementPeriod == null)? 0 :this.endStatementPeriod.hashCode()));
        result = ((result* 31)+((this.invoiceRecipient == null)? 0 :this.invoiceRecipient.hashCode()));
        result = ((result* 31)+((this.paymentType == null)? 0 :this.paymentType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingDeliveryDetails) == false) {
            return false;
        }
        AccountingDeliveryDetails rhs = ((AccountingDeliveryDetails) other);
        return ((((((((this.startStatementPeriod == rhs.startStatementPeriod)||((this.startStatementPeriod!= null)&&this.startStatementPeriod.equals(rhs.startStatementPeriod)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.invoicingParty == rhs.invoicingParty)||((this.invoicingParty!= null)&&this.invoicingParty.equals(rhs.invoicingParty))))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))))&&((this.endStatementPeriod == rhs.endStatementPeriod)||((this.endStatementPeriod!= null)&&this.endStatementPeriod.equals(rhs.endStatementPeriod))))&&((this.invoiceRecipient == rhs.invoiceRecipient)||((this.invoiceRecipient!= null)&&this.invoiceRecipient.equals(rhs.invoiceRecipient))))&&((this.paymentType == rhs.paymentType)||((this.paymentType!= null)&&this.paymentType.equals(rhs.paymentType))));
    }

    public enum PaymentType {

        BCC_CLEARING("BCC_CLEARING"),
        CURRENT_ACCOUNT("CURRENT_ACCOUNT"),
        BANK_TRANSFER("BANK_TRANSFER"),
        CURRENT_ACCOUNT_CLEARING("CURRENT_ACCOUNT_CLEARING");
        private final String value;
        private final static Map<String, AccountingDeliveryDetails.PaymentType> CONSTANTS = new HashMap<String, AccountingDeliveryDetails.PaymentType>();

        static {
            for (AccountingDeliveryDetails.PaymentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private PaymentType(String value) {
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
        public static AccountingDeliveryDetails.PaymentType fromValue(String value) {
            AccountingDeliveryDetails.PaymentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
