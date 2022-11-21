
package accountingModelV1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UIC accounting data exchange
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uicAccountingDelivery",
    "additionalProperties"
})
public class AccountingDataSchema {

    @JsonProperty("uicAccountingDelivery")
    private AccountingDataDelivery uicAccountingDelivery;
    @JsonProperty("additionalProperties")
    private Object additionalProperties;

    @JsonProperty("uicAccountingDelivery")
    public AccountingDataDelivery getUicAccountingDelivery() {
        return uicAccountingDelivery;
    }

    @JsonProperty("uicAccountingDelivery")
    public void setUicAccountingDelivery(AccountingDataDelivery uicAccountingDelivery) {
        this.uicAccountingDelivery = uicAccountingDelivery;
    }

    @JsonProperty("additionalProperties")
    public Object getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingDataSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uicAccountingDelivery");
        sb.append('=');
        sb.append(((this.uicAccountingDelivery == null)?"<null>":this.uicAccountingDelivery));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.uicAccountingDelivery == null)? 0 :this.uicAccountingDelivery.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingDataSchema) == false) {
            return false;
        }
        AccountingDataSchema rhs = ((AccountingDataSchema) other);
        return (((this.uicAccountingDelivery == rhs.uicAccountingDelivery)||((this.uicAccountingDelivery!= null)&&this.uicAccountingDelivery.equals(rhs.uicAccountingDelivery)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
