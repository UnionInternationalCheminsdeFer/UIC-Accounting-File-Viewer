
package accountingModelV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "accountingType",
    "salesType",
    "transaction",
    "subject",
    "accountedAmounts",
    "transactionStandard"
})
public class AccountingRecord {

    /**
     * accounting identifier (id of the accounting record) 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("accounting identifier (id of the accounting record) ")
    private UUID id;
    /**
     * type of the accounting record
     * (Required)
     * 
     */
    @JsonProperty("accountingType")
    @JsonPropertyDescription("type of the accounting record")
    private AccountingRecord.AccountingType accountingType;
    /**
     * ONLINE: the transaction was an online booking bewteen the involved accounting parties OFFLINE: the sale was made based on fare data exchanged offline betewwn the accounting parties.
     * (Required)
     * 
     */
    @JsonProperty("salesType")
    @JsonPropertyDescription("ONLINE: the transaction was an online booking bewteen the involved accounting parties OFFLINE: the sale was made based on fare data exchanged offline betewwn the accounting parties.")
    private AccountingRecord.SalesType salesType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction")
    private Transaction transaction;
    /**
     * number and identification of the subject of accounting 
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("number and identification of the subject of accounting ")
    private Subject subject;
    /**
     * list of values to be accounted within this transaction
     * (Required)
     * 
     */
    @JsonProperty("accountedAmounts")
    @JsonPropertyDescription("list of values to be accounted within this transaction")
    private List<AccountedAmount> accountedAmounts = new ArrayList<AccountedAmount>();
    /**
     * indication of a sale that is not following UIC sales standards, Default is UIC
     * 
     */
    @JsonProperty("transactionStandard")
    @JsonPropertyDescription("indication of a sale that is not following UIC sales standards, Default is UIC")
    private AccountingRecord.TransactionStandard transactionStandard = AccountingRecord.TransactionStandard.fromValue("UIC");

    /**
     * accounting identifier (id of the accounting record) 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * accounting identifier (id of the accounting record) 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * type of the accounting record
     * (Required)
     * 
     */
    @JsonProperty("accountingType")
    public AccountingRecord.AccountingType getAccountingType() {
        return accountingType;
    }

    /**
     * type of the accounting record
     * (Required)
     * 
     */
    @JsonProperty("accountingType")
    public void setAccountingType(AccountingRecord.AccountingType accountingType) {
        this.accountingType = accountingType;
    }

    /**
     * ONLINE: the transaction was an online booking bewteen the involved accounting parties OFFLINE: the sale was made based on fare data exchanged offline betewwn the accounting parties.
     * (Required)
     * 
     */
    @JsonProperty("salesType")
    public AccountingRecord.SalesType getSalesType() {
        return salesType;
    }

    /**
     * ONLINE: the transaction was an online booking bewteen the involved accounting parties OFFLINE: the sale was made based on fare data exchanged offline betewwn the accounting parties.
     * (Required)
     * 
     */
    @JsonProperty("salesType")
    public void setSalesType(AccountingRecord.SalesType salesType) {
        this.salesType = salesType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction")
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction")
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    /**
     * number and identification of the subject of accounting 
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    /**
     * number and identification of the subject of accounting 
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * list of values to be accounted within this transaction
     * (Required)
     * 
     */
    @JsonProperty("accountedAmounts")
    public List<AccountedAmount> getAccountedAmounts() {
        return accountedAmounts;
    }

    /**
     * list of values to be accounted within this transaction
     * (Required)
     * 
     */
    @JsonProperty("accountedAmounts")
    public void setAccountedAmounts(List<AccountedAmount> accountedAmounts) {
        this.accountedAmounts = accountedAmounts;
    }

    /**
     * indication of a sale that is not following UIC sales standards, Default is UIC
     * 
     */
    @JsonProperty("transactionStandard")
    public AccountingRecord.TransactionStandard getTransactionStandard() {
        return transactionStandard;
    }

    /**
     * indication of a sale that is not following UIC sales standards, Default is UIC
     * 
     */
    @JsonProperty("transactionStandard")
    public void setTransactionStandard(AccountingRecord.TransactionStandard transactionStandard) {
        this.transactionStandard = transactionStandard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("accountingType");
        sb.append('=');
        sb.append(((this.accountingType == null)?"<null>":this.accountingType));
        sb.append(',');
        sb.append("salesType");
        sb.append('=');
        sb.append(((this.salesType == null)?"<null>":this.salesType));
        sb.append(',');
        sb.append("transaction");
        sb.append('=');
        sb.append(((this.transaction == null)?"<null>":this.transaction));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("accountedAmounts");
        sb.append('=');
        sb.append(((this.accountedAmounts == null)?"<null>":this.accountedAmounts));
        sb.append(',');
        sb.append("transactionStandard");
        sb.append('=');
        sb.append(((this.transactionStandard == null)?"<null>":this.transactionStandard));
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
        result = ((result* 31)+((this.salesType == null)? 0 :this.salesType.hashCode()));
        result = ((result* 31)+((this.accountedAmounts == null)? 0 :this.accountedAmounts.hashCode()));
        result = ((result* 31)+((this.transactionStandard == null)? 0 :this.transactionStandard.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.accountingType == null)? 0 :this.accountingType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.transaction == null)? 0 :this.transaction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingRecord) == false) {
            return false;
        }
        AccountingRecord rhs = ((AccountingRecord) other);
        return ((((((((this.salesType == rhs.salesType)||((this.salesType!= null)&&this.salesType.equals(rhs.salesType)))&&((this.accountedAmounts == rhs.accountedAmounts)||((this.accountedAmounts!= null)&&this.accountedAmounts.equals(rhs.accountedAmounts))))&&((this.transactionStandard == rhs.transactionStandard)||((this.transactionStandard!= null)&&this.transactionStandard.equals(rhs.transactionStandard))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.accountingType == rhs.accountingType)||((this.accountingType!= null)&&this.accountingType.equals(rhs.accountingType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.transaction == rhs.transaction)||((this.transaction!= null)&&this.transaction.equals(rhs.transaction))));
    }

    public enum AccountingType {

        SHARES("SHARES"),
        SERVICE("SERVICE");
        private final String value;
        private final static Map<String, AccountingRecord.AccountingType> CONSTANTS = new HashMap<String, AccountingRecord.AccountingType>();

        static {
            for (AccountingRecord.AccountingType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AccountingType(String value) {
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
        public static AccountingRecord.AccountingType fromValue(String value) {
            AccountingRecord.AccountingType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SalesType {

        ONLINE("ONLINE"),
        OFFLINE("OFFLINE");
        private final String value;
        private final static Map<String, AccountingRecord.SalesType> CONSTANTS = new HashMap<String, AccountingRecord.SalesType>();

        static {
            for (AccountingRecord.SalesType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SalesType(String value) {
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
        public static AccountingRecord.SalesType fromValue(String value) {
            AccountingRecord.SalesType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TransactionStandard {

        UIC("UIC"),
        BILATERAL("BILATERAL");
        private final String value;
        private final static Map<String, AccountingRecord.TransactionStandard> CONSTANTS = new HashMap<String, AccountingRecord.TransactionStandard>();

        static {
            for (AccountingRecord.TransactionStandard c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TransactionStandard(String value) {
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
        public static AccountingRecord.TransactionStandard fromValue(String value) {
            AccountingRecord.TransactionStandard constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
