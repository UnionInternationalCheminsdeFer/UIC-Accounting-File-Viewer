
package accountingModelV1;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "deliveryDetails",
    "accountingRecords"
})
public class AccountingDataDelivery {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deliveryDetails")
    private AccountingDeliveryDetails deliveryDetails;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountingRecords")
    private List<AccountingRecord> accountingRecords = new ArrayList<AccountingRecord>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deliveryDetails")
    public AccountingDeliveryDetails getDeliveryDetails() {
        return deliveryDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deliveryDetails")
    public void setDeliveryDetails(AccountingDeliveryDetails deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountingRecords")
    public List<AccountingRecord> getAccountingRecords() {
        return accountingRecords;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("accountingRecords")
    public void setAccountingRecords(List<AccountingRecord> accountingRecords) {
        this.accountingRecords = accountingRecords;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingDataDelivery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deliveryDetails");
        sb.append('=');
        sb.append(((this.deliveryDetails == null)?"<null>":this.deliveryDetails));
        sb.append(',');
        sb.append("accountingRecords");
        sb.append('=');
        sb.append(((this.accountingRecords == null)?"<null>":this.accountingRecords));
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
        result = ((result* 31)+((this.deliveryDetails == null)? 0 :this.deliveryDetails.hashCode()));
        result = ((result* 31)+((this.accountingRecords == null)? 0 :this.accountingRecords.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingDataDelivery) == false) {
            return false;
        }
        AccountingDataDelivery rhs = ((AccountingDataDelivery) other);
        return (((this.deliveryDetails == rhs.deliveryDetails)||((this.deliveryDetails!= null)&&this.deliveryDetails.equals(rhs.deliveryDetails)))&&((this.accountingRecords == rhs.accountingRecords)||((this.accountingRecords!= null)&&this.accountingRecords.equals(rhs.accountingRecords))));
    }

}
