
package accountingModelV1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "series",
    "tariff",
    "classCode",
    "passengerType"
})
public class LegacyDescription {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("series")
    private Integer series;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariff")
    private Integer tariff;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("classCode")
    private LegacyDescription.ClassCode classCode;
    /**
     * YOUNG_CHILD Young child – defined by the carrier depending on the age 
     * CHILD Child – defined by the carreir depending on the age  
     * YOUTH Youth – defined by the carreir depending on the age  
     * ADULT Adult – defined by the carreir depending on the age 
     * SENIOR Senior – defined by the carreir depending on the age  
     * FAMILY_CHILD Child associated with a family travellimng together  
     * ACCOMP_PRM Accompanying Person for PRM  
     * PRM_CHILD Handicapped young child accompanied by one person where the usual child according to the age price would be zero and the accompanying person would also be free   
     * WHEELCHAIR Passenger with wheelchair    
     * PERSON Used in requests together with date of birth   
     * PRM Person with reduced mobility – to be used in case of accompanying person or dog, date of birth must be provided additionally   
     * DOG A dog  
     * PET A pet  
     * LUGGAGE Oversize luggage 
     * BICYCLE A bicycle 
     * ACCOMP_DOG An accompagning dog for a PRM 
     * CAR A car for carcarriage trains 
     * MOTOCYCLE A motocycle for car carriage trains 
     * TRAILER A trailer for car carriage trains
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    @JsonPropertyDescription("YOUNG_CHILD Young child \u2013 defined by the carrier depending on the age \r\nCHILD Child \u2013 defined by the carreir depending on the age  \r\nYOUTH Youth \u2013 defined by the carreir depending on the age  \r\nADULT Adult \u2013 defined by the carreir depending on the age \r\nSENIOR Senior \u2013 defined by the carreir depending on the age  \r\nFAMILY_CHILD Child associated with a family travellimng together  \r\nACCOMP_PRM Accompanying Person for PRM  \r\nPRM_CHILD Handicapped young child accompanied by one person where the usual child according to the age price would be zero and the accompanying person would also be free   \r\nWHEELCHAIR Passenger with wheelchair    \r\nPERSON Used in requests together with date of birth   \r\nPRM Person with reduced mobility \u2013 to be used in case of accompanying person or dog, date of birth must be provided additionally   \r\nDOG A dog  \r\nPET A pet  \r\nLUGGAGE Oversize luggage \r\nBICYCLE A bicycle \r\nACCOMP_DOG An accompagning dog for a PRM \r\nCAR A car for carcarriage trains \r\nMOTOCYCLE A motocycle for car carriage trains \r\nTRAILER A trailer for car carriage trains")
    private String passengerType;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("series")
    public Integer getSeries() {
        return series;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("series")
    public void setSeries(Integer series) {
        this.series = series;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariff")
    public Integer getTariff() {
        return tariff;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tariff")
    public void setTariff(Integer tariff) {
        this.tariff = tariff;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("classCode")
    public LegacyDescription.ClassCode getClassCode() {
        return classCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("classCode")
    public void setClassCode(LegacyDescription.ClassCode classCode) {
        this.classCode = classCode;
    }

    /**
     * YOUNG_CHILD Young child – defined by the carrier depending on the age 
     * CHILD Child – defined by the carreir depending on the age  
     * YOUTH Youth – defined by the carreir depending on the age  
     * ADULT Adult – defined by the carreir depending on the age 
     * SENIOR Senior – defined by the carreir depending on the age  
     * FAMILY_CHILD Child associated with a family travellimng together  
     * ACCOMP_PRM Accompanying Person for PRM  
     * PRM_CHILD Handicapped young child accompanied by one person where the usual child according to the age price would be zero and the accompanying person would also be free   
     * WHEELCHAIR Passenger with wheelchair    
     * PERSON Used in requests together with date of birth   
     * PRM Person with reduced mobility – to be used in case of accompanying person or dog, date of birth must be provided additionally   
     * DOG A dog  
     * PET A pet  
     * LUGGAGE Oversize luggage 
     * BICYCLE A bicycle 
     * ACCOMP_DOG An accompagning dog for a PRM 
     * CAR A car for carcarriage trains 
     * MOTOCYCLE A motocycle for car carriage trains 
     * TRAILER A trailer for car carriage trains
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * YOUNG_CHILD Young child – defined by the carrier depending on the age 
     * CHILD Child – defined by the carreir depending on the age  
     * YOUTH Youth – defined by the carreir depending on the age  
     * ADULT Adult – defined by the carreir depending on the age 
     * SENIOR Senior – defined by the carreir depending on the age  
     * FAMILY_CHILD Child associated with a family travellimng together  
     * ACCOMP_PRM Accompanying Person for PRM  
     * PRM_CHILD Handicapped young child accompanied by one person where the usual child according to the age price would be zero and the accompanying person would also be free   
     * WHEELCHAIR Passenger with wheelchair    
     * PERSON Used in requests together with date of birth   
     * PRM Person with reduced mobility – to be used in case of accompanying person or dog, date of birth must be provided additionally   
     * DOG A dog  
     * PET A pet  
     * LUGGAGE Oversize luggage 
     * BICYCLE A bicycle 
     * ACCOMP_DOG An accompagning dog for a PRM 
     * CAR A car for carcarriage trains 
     * MOTOCYCLE A motocycle for car carriage trains 
     * TRAILER A trailer for car carriage trains
     * (Required)
     * 
     */
    @JsonProperty("passengerType")
    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LegacyDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("tariff");
        sb.append('=');
        sb.append(((this.tariff == null)?"<null>":this.tariff));
        sb.append(',');
        sb.append("classCode");
        sb.append('=');
        sb.append(((this.classCode == null)?"<null>":this.classCode));
        sb.append(',');
        sb.append("passengerType");
        sb.append('=');
        sb.append(((this.passengerType == null)?"<null>":this.passengerType));
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
        result = ((result* 31)+((this.classCode == null)? 0 :this.classCode.hashCode()));
        result = ((result* 31)+((this.tariff == null)? 0 :this.tariff.hashCode()));
        result = ((result* 31)+((this.passengerType == null)? 0 :this.passengerType.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LegacyDescription) == false) {
            return false;
        }
        LegacyDescription rhs = ((LegacyDescription) other);
        return (((((this.classCode == rhs.classCode)||((this.classCode!= null)&&this.classCode.equals(rhs.classCode)))&&((this.tariff == rhs.tariff)||((this.tariff!= null)&&this.tariff.equals(rhs.tariff))))&&((this.passengerType == rhs.passengerType)||((this.passengerType!= null)&&this.passengerType.equals(rhs.passengerType))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))));
    }

    public enum ClassCode {

        FIRST("FIRST"),
        SECOND("SECOND");
        private final String value;
        private final static Map<String, LegacyDescription.ClassCode> CONSTANTS = new HashMap<String, LegacyDescription.ClassCode>();

        static {
            for (LegacyDescription.ClassCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ClassCode(String value) {
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
        public static LegacyDescription.ClassCode fromValue(String value) {
            LegacyDescription.ClassCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
