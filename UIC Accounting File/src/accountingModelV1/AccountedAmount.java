
package accountingModelV1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * single value to be accounted
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grossAmount",
    "refundFee",
    "commission",
    "accountingType",
    "amount",
    "scale",
    "currency",
    "rate",
    "rateScale"
})
public class AccountedAmount {

    /**
     * indicates that the amount is the travel price. Note: one of grossAmount, refundFee and commission must be set to true
     * (Required)
     * 
     */
    @JsonProperty("grossAmount")
    @JsonPropertyDescription("indicates that the amount is the travel price. Note: one of grossAmount, refundFee and commission must be set to true")
    private Boolean grossAmount;
    /**
     * indicates that the value is a refund fee
     * (Required)
     * 
     */
    @JsonProperty("refundFee")
    @JsonPropertyDescription("indicates that the value is a refund fee")
    private Boolean refundFee;
    /**
     * indicates that the value is a commission
     * (Required)
     * 
     */
    @JsonProperty("commission")
    @JsonPropertyDescription("indicates that the value is a commission")
    private Boolean commission;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountingType")
    private AccountedAmount.AccountType accountingType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    private Integer amount;
    /**
     * Position of the decimal point default 2
     * 
     */
    @JsonProperty("scale")
    @JsonPropertyDescription("Position of the decimal point default 2")
    private Integer scale = 2;
    /**
     * default EUR
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("default EUR")
    private String currency = "EUR";
    /**
     * percentage used for the calculation of the amount (e.g. in case of comissions)
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("percentage used for the calculation of the amount (e.g. in case of comissions)")
    private Integer rate;
    /**
     * scale (position of the decimal point) of the rate provided, default 2
     * 
     */
    @JsonProperty("rateScale")
    @JsonPropertyDescription("scale (position of the decimal point) of the rate provided, default 2")
    private Integer rateScale = 2;

    /**
     * indicates that the amount is the travel price. Note: one of grossAmount, refundFee and commission must be set to true
     * (Required)
     * 
     */
    @JsonProperty("grossAmount")
    public Boolean getGrossAmount() {
        return grossAmount;
    }

    /**
     * indicates that the amount is the travel price. Note: one of grossAmount, refundFee and commission must be set to true
     * (Required)
     * 
     */
    @JsonProperty("grossAmount")
    public void setGrossAmount(Boolean grossAmount) {
        this.grossAmount = grossAmount;
    }

    /**
     * indicates that the value is a refund fee
     * (Required)
     * 
     */
    @JsonProperty("refundFee")
    public Boolean getRefundFee() {
        return refundFee;
    }

    /**
     * indicates that the value is a refund fee
     * (Required)
     * 
     */
    @JsonProperty("refundFee")
    public void setRefundFee(Boolean refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * indicates that the value is a commission
     * (Required)
     * 
     */
    @JsonProperty("commission")
    public Boolean getCommission() {
        return commission;
    }

    /**
     * indicates that the value is a commission
     * (Required)
     * 
     */
    @JsonProperty("commission")
    public void setCommission(Boolean commission) {
        this.commission = commission;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountingType")
    public AccountedAmount.AccountType getAccountingType() {
        return accountingType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountingType")
    public void setAccountingType(AccountedAmount.AccountType accountingType) {
        this.accountingType = accountingType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Position of the decimal point default 2
     * 
     */
    @JsonProperty("scale")
    public Integer getScale() {
        return scale;
    }

    /**
     * Position of the decimal point default 2
     * 
     */
    @JsonProperty("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * default EUR
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * default EUR
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * percentage used for the calculation of the amount (e.g. in case of comissions)
     * 
     */
    @JsonProperty("rate")
    public Integer getRate() {
        return rate;
    }

    /**
     * percentage used for the calculation of the amount (e.g. in case of comissions)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * scale (position of the decimal point) of the rate provided, default 2
     * 
     */
    @JsonProperty("rateScale")
    public Integer getRateScale() {
        return rateScale;
    }

    /**
     * scale (position of the decimal point) of the rate provided, default 2
     * 
     */
    @JsonProperty("rateScale")
    public void setRateScale(Integer rateScale) {
        this.rateScale = rateScale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountedAmount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grossAmount");
        sb.append('=');
        sb.append(((this.grossAmount == null)?"<null>":this.grossAmount));
        sb.append(',');
        sb.append("refundFee");
        sb.append('=');
        sb.append(((this.refundFee == null)?"<null>":this.refundFee));
        sb.append(',');
        sb.append("commission");
        sb.append('=');
        sb.append(((this.commission == null)?"<null>":this.commission));
        sb.append(',');
        sb.append("accountingType");
        sb.append('=');
        sb.append(((this.accountingType == null)?"<null>":this.accountingType));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("rateScale");
        sb.append('=');
        sb.append(((this.rateScale == null)?"<null>":this.rateScale));
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
        result = ((result* 31)+((this.refundFee == null)? 0 :this.refundFee.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.accountingType == null)? 0 :this.accountingType.hashCode()));
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.commission == null)? 0 :this.commission.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.grossAmount == null)? 0 :this.grossAmount.hashCode()));
        result = ((result* 31)+((this.rateScale == null)? 0 :this.rateScale.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountedAmount) == false) {
            return false;
        }
        AccountedAmount rhs = ((AccountedAmount) other);
        return ((((((((((this.refundFee == rhs.refundFee)||((this.refundFee!= null)&&this.refundFee.equals(rhs.refundFee)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.accountingType == rhs.accountingType)||((this.accountingType!= null)&&this.accountingType.equals(rhs.accountingType))))&&((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale))))&&((this.commission == rhs.commission)||((this.commission!= null)&&this.commission.equals(rhs.commission))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.grossAmount == rhs.grossAmount)||((this.grossAmount!= null)&&this.grossAmount.equals(rhs.grossAmount))))&&((this.rateScale == rhs.rateScale)||((this.rateScale!= null)&&this.rateScale.equals(rhs.rateScale))));
    }

    public enum AccountType {

        DEBIT("DEBIT"),
        CREDIT("CREDIT");
        private final String value;
        private final static Map<String, AccountedAmount.AccountType> CONSTANTS = new HashMap<String, AccountedAmount.AccountType>();

        static {
            for (AccountedAmount.AccountType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AccountType(String value) {
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
        public static AccountedAmount.AccountType fromValue(String value) {
            AccountedAmount.AccountType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
