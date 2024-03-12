
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
    "afterSaleFee",
    "commission",
    "settlementValueIndicator",
    "amount",
    "scale",
    "currency",
    "commissionRate",
    "commissionRateScale"
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
     * indicates that the value is a after sale fee (refund, exchange,...)
     * 
     */
    @JsonProperty("afterSaleFee")
    @JsonPropertyDescription("indicates that the value is a after sale fee (refund, exchange,...)")
    private Boolean afterSaleFee;
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
    @JsonProperty("settlementValueIndicator")
    private AccountedAmount.SettlementValueIndicator settlementValueIndicator;
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
    @JsonProperty("commissionRate")
    @JsonPropertyDescription("percentage used for the calculation of the amount (e.g. in case of comissions)")
    private Integer commissionRate;
    /**
     * scale (position of the decimal point) of the rate provided, default 2
     * 
     */
    @JsonProperty("commissionRateScale")
    @JsonPropertyDescription("scale (position of the decimal point) of the rate provided, default 2")
    private Integer commissionRateScale = 2;

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
     * indicates that the value is a after sale fee (refund, exchange,...)
     * 
     */
    @JsonProperty("afterSaleFee")
    public Boolean getAfterSaleFee() {
        return afterSaleFee;
    }

    /**
     * indicates that the value is a after sale fee (refund, exchange,...)
     * 
     */
    @JsonProperty("afterSaleFee")
    public void setAfterSaleFee(Boolean afterSaleFee) {
        this.afterSaleFee = afterSaleFee;
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
    @JsonProperty("settlementValueIndicator")
    public AccountedAmount.SettlementValueIndicator getSettlementValueIndicator() {
        return settlementValueIndicator;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("settlementValueIndicator")
    public void setSettlementValueIndicator(AccountedAmount.SettlementValueIndicator settlementValueIndicator) {
        this.settlementValueIndicator = settlementValueIndicator;
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
    @JsonProperty("commissionRate")
    public Integer getCommissionRate() {
        return commissionRate;
    }

    /**
     * percentage used for the calculation of the amount (e.g. in case of comissions)
     * 
     */
    @JsonProperty("commissionRate")
    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * scale (position of the decimal point) of the rate provided, default 2
     * 
     */
    @JsonProperty("commissionRateScale")
    public Integer getCommissionRateScale() {
        return commissionRateScale;
    }

    /**
     * scale (position of the decimal point) of the rate provided, default 2
     * 
     */
    @JsonProperty("commissionRateScale")
    public void setCommissionRateScale(Integer commissionRateScale) {
        this.commissionRateScale = commissionRateScale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountedAmount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grossAmount");
        sb.append('=');
        sb.append(((this.grossAmount == null)?"<null>":this.grossAmount));
        sb.append(',');
        sb.append("afterSaleFee");
        sb.append('=');
        sb.append(((this.afterSaleFee == null)?"<null>":this.afterSaleFee));
        sb.append(',');
        sb.append("commission");
        sb.append('=');
        sb.append(((this.commission == null)?"<null>":this.commission));
        sb.append(',');
        sb.append("settlementValueIndicator");
        sb.append('=');
        sb.append(((this.settlementValueIndicator == null)?"<null>":this.settlementValueIndicator));
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
        sb.append("commissionRate");
        sb.append('=');
        sb.append(((this.commissionRate == null)?"<null>":this.commissionRate));
        sb.append(',');
        sb.append("commissionRateScale");
        sb.append('=');
        sb.append(((this.commissionRateScale == null)?"<null>":this.commissionRateScale));
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
        result = ((result* 31)+((this.commissionRateScale == null)? 0 :this.commissionRateScale.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.commissionRate == null)? 0 :this.commissionRate.hashCode()));
        result = ((result* 31)+((this.settlementValueIndicator == null)? 0 :this.settlementValueIndicator.hashCode()));
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.commission == null)? 0 :this.commission.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.grossAmount == null)? 0 :this.grossAmount.hashCode()));
        result = ((result* 31)+((this.afterSaleFee == null)? 0 :this.afterSaleFee.hashCode()));
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
        return ((((((((((this.commissionRateScale == rhs.commissionRateScale)||((this.commissionRateScale!= null)&&this.commissionRateScale.equals(rhs.commissionRateScale)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.commissionRate == rhs.commissionRate)||((this.commissionRate!= null)&&this.commissionRate.equals(rhs.commissionRate))))&&((this.settlementValueIndicator == rhs.settlementValueIndicator)||((this.settlementValueIndicator!= null)&&this.settlementValueIndicator.equals(rhs.settlementValueIndicator))))&&((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale))))&&((this.commission == rhs.commission)||((this.commission!= null)&&this.commission.equals(rhs.commission))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.grossAmount == rhs.grossAmount)||((this.grossAmount!= null)&&this.grossAmount.equals(rhs.grossAmount))))&&((this.afterSaleFee == rhs.afterSaleFee)||((this.afterSaleFee!= null)&&this.afterSaleFee.equals(rhs.afterSaleFee))));
    }

    public enum SettlementValueIndicator {

        DEBIT("DEBIT"),
        CREDIT("CREDIT");
        private final String value;
        private final static Map<String, AccountedAmount.SettlementValueIndicator> CONSTANTS = new HashMap<String, AccountedAmount.SettlementValueIndicator>();

        static {
            for (AccountedAmount.SettlementValueIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SettlementValueIndicator(String value) {
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
        public static AccountedAmount.SettlementValueIndicator fromValue(String value) {
            AccountedAmount.SettlementValueIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
