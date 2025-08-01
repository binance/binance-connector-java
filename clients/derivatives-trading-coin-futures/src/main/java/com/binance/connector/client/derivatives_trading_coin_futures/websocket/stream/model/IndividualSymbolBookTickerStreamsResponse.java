/*
 * Binance Derivatives Trading COIN Futures WebSocket Market Streams
 * OpenAPI Specification for the Binance Derivatives Trading COIN Futures WebSocket Market Streams
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** IndividualSymbolBookTickerStreamsResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class IndividualSymbolBookTickerStreamsResponse extends BaseDTO {
    public static final String SERIALIZED_NAME_E_LOWER_CASE = "e";

    @SerializedName(SERIALIZED_NAME_E_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String eLowerCase;

    public static final String SERIALIZED_NAME_U_LOWER_CASE = "u";

    @SerializedName(SERIALIZED_NAME_U_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Long uLowerCase;

    public static final String SERIALIZED_NAME_S_LOWER_CASE = "s";

    @SerializedName(SERIALIZED_NAME_S_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String sLowerCase;

    public static final String SERIALIZED_NAME_PS = "ps";

    @SerializedName(SERIALIZED_NAME_PS)
    @jakarta.annotation.Nullable
    private String ps;

    public static final String SERIALIZED_NAME_B_LOWER_CASE = "b";

    @SerializedName(SERIALIZED_NAME_B_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String bLowerCase;

    public static final String SERIALIZED_NAME_B = "B";

    @SerializedName(SERIALIZED_NAME_B)
    @jakarta.annotation.Nullable
    private String B;

    public static final String SERIALIZED_NAME_A_LOWER_CASE = "a";

    @SerializedName(SERIALIZED_NAME_A_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String aLowerCase;

    public static final String SERIALIZED_NAME_A = "A";

    @SerializedName(SERIALIZED_NAME_A)
    @jakarta.annotation.Nullable
    private String A;

    public static final String SERIALIZED_NAME_T = "T";

    @SerializedName(SERIALIZED_NAME_T)
    @jakarta.annotation.Nullable
    private Long T;

    public static final String SERIALIZED_NAME_E = "E";

    @SerializedName(SERIALIZED_NAME_E)
    @jakarta.annotation.Nullable
    private Long E;

    public IndividualSymbolBookTickerStreamsResponse() {}

    public IndividualSymbolBookTickerStreamsResponse eLowerCase(
            @jakarta.annotation.Nullable String eLowerCase) {
        this.eLowerCase = eLowerCase;
        return this;
    }

    /**
     * Get eLowerCase
     *
     * @return eLowerCase
     */
    @jakarta.annotation.Nullable
    public String geteLowerCase() {
        return eLowerCase;
    }

    public void seteLowerCase(@jakarta.annotation.Nullable String eLowerCase) {
        this.eLowerCase = eLowerCase;
    }

    public IndividualSymbolBookTickerStreamsResponse uLowerCase(
            @jakarta.annotation.Nullable Long uLowerCase) {
        this.uLowerCase = uLowerCase;
        return this;
    }

    /**
     * Get uLowerCase
     *
     * @return uLowerCase
     */
    @jakarta.annotation.Nullable
    public Long getuLowerCase() {
        return uLowerCase;
    }

    public void setuLowerCase(@jakarta.annotation.Nullable Long uLowerCase) {
        this.uLowerCase = uLowerCase;
    }

    public IndividualSymbolBookTickerStreamsResponse sLowerCase(
            @jakarta.annotation.Nullable String sLowerCase) {
        this.sLowerCase = sLowerCase;
        return this;
    }

    /**
     * Get sLowerCase
     *
     * @return sLowerCase
     */
    @jakarta.annotation.Nullable
    public String getsLowerCase() {
        return sLowerCase;
    }

    public void setsLowerCase(@jakarta.annotation.Nullable String sLowerCase) {
        this.sLowerCase = sLowerCase;
    }

    public IndividualSymbolBookTickerStreamsResponse ps(@jakarta.annotation.Nullable String ps) {
        this.ps = ps;
        return this;
    }

    /**
     * Get ps
     *
     * @return ps
     */
    @jakarta.annotation.Nullable
    public String getPs() {
        return ps;
    }

    public void setPs(@jakarta.annotation.Nullable String ps) {
        this.ps = ps;
    }

    public IndividualSymbolBookTickerStreamsResponse bLowerCase(
            @jakarta.annotation.Nullable String bLowerCase) {
        this.bLowerCase = bLowerCase;
        return this;
    }

    /**
     * Get bLowerCase
     *
     * @return bLowerCase
     */
    @jakarta.annotation.Nullable
    public String getbLowerCase() {
        return bLowerCase;
    }

    public void setbLowerCase(@jakarta.annotation.Nullable String bLowerCase) {
        this.bLowerCase = bLowerCase;
    }

    public IndividualSymbolBookTickerStreamsResponse B(@jakarta.annotation.Nullable String B) {
        this.B = B;
        return this;
    }

    /**
     * Get B
     *
     * @return B
     */
    @jakarta.annotation.Nullable
    public String getB() {
        return B;
    }

    public void setB(@jakarta.annotation.Nullable String B) {
        this.B = B;
    }

    public IndividualSymbolBookTickerStreamsResponse aLowerCase(
            @jakarta.annotation.Nullable String aLowerCase) {
        this.aLowerCase = aLowerCase;
        return this;
    }

    /**
     * Get aLowerCase
     *
     * @return aLowerCase
     */
    @jakarta.annotation.Nullable
    public String getaLowerCase() {
        return aLowerCase;
    }

    public void setaLowerCase(@jakarta.annotation.Nullable String aLowerCase) {
        this.aLowerCase = aLowerCase;
    }

    public IndividualSymbolBookTickerStreamsResponse A(@jakarta.annotation.Nullable String A) {
        this.A = A;
        return this;
    }

    /**
     * Get A
     *
     * @return A
     */
    @jakarta.annotation.Nullable
    public String getA() {
        return A;
    }

    public void setA(@jakarta.annotation.Nullable String A) {
        this.A = A;
    }

    public IndividualSymbolBookTickerStreamsResponse T(@jakarta.annotation.Nullable Long T) {
        this.T = T;
        return this;
    }

    /**
     * Get T
     *
     * @return T
     */
    @jakarta.annotation.Nullable
    public Long getT() {
        return T;
    }

    public void setT(@jakarta.annotation.Nullable Long T) {
        this.T = T;
    }

    public IndividualSymbolBookTickerStreamsResponse E(@jakarta.annotation.Nullable Long E) {
        this.E = E;
        return this;
    }

    /**
     * Get E
     *
     * @return E
     */
    @jakarta.annotation.Nullable
    public Long getE() {
        return E;
    }

    public void setE(@jakarta.annotation.Nullable Long E) {
        this.E = E;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndividualSymbolBookTickerStreamsResponse individualSymbolBookTickerStreamsResponse =
                (IndividualSymbolBookTickerStreamsResponse) o;
        return Objects.equals(this.eLowerCase, individualSymbolBookTickerStreamsResponse.eLowerCase)
                && Objects.equals(
                        this.uLowerCase, individualSymbolBookTickerStreamsResponse.uLowerCase)
                && Objects.equals(
                        this.sLowerCase, individualSymbolBookTickerStreamsResponse.sLowerCase)
                && Objects.equals(this.ps, individualSymbolBookTickerStreamsResponse.ps)
                && Objects.equals(
                        this.bLowerCase, individualSymbolBookTickerStreamsResponse.bLowerCase)
                && Objects.equals(this.B, individualSymbolBookTickerStreamsResponse.B)
                && Objects.equals(
                        this.aLowerCase, individualSymbolBookTickerStreamsResponse.aLowerCase)
                && Objects.equals(this.A, individualSymbolBookTickerStreamsResponse.A)
                && Objects.equals(this.T, individualSymbolBookTickerStreamsResponse.T)
                && Objects.equals(this.E, individualSymbolBookTickerStreamsResponse.E);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                eLowerCase, uLowerCase, sLowerCase, ps, bLowerCase, B, aLowerCase, A, T, E);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndividualSymbolBookTickerStreamsResponse {\n");
        sb.append("		eLowerCase: ").append(toIndentedString(eLowerCase)).append("\n");
        sb.append("		uLowerCase: ").append(toIndentedString(uLowerCase)).append("\n");
        sb.append("		sLowerCase: ").append(toIndentedString(sLowerCase)).append("\n");
        sb.append("		ps: ").append(toIndentedString(ps)).append("\n");
        sb.append("		bLowerCase: ").append(toIndentedString(bLowerCase)).append("\n");
        sb.append("		B: ").append(toIndentedString(B)).append("\n");
        sb.append("		aLowerCase: ").append(toIndentedString(aLowerCase)).append("\n");
        sb.append("		A: ").append(toIndentedString(A)).append("\n");
        sb.append("		T: ").append(toIndentedString(T)).append("\n");
        sb.append("		E: ").append(toIndentedString(E)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            String eLowerCaseValueAsString = eLowerCaseValue.toString();
            valMap.put("eLowerCase", eLowerCaseValueAsString);
        }
        Long uLowerCaseValue = getuLowerCase();
        if (uLowerCaseValue != null) {
            String uLowerCaseValueAsString = uLowerCaseValue.toString();
            valMap.put("uLowerCase", uLowerCaseValueAsString);
        }
        String sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            String sLowerCaseValueAsString = sLowerCaseValue.toString();
            valMap.put("sLowerCase", sLowerCaseValueAsString);
        }
        String psValue = getPs();
        if (psValue != null) {
            String psValueAsString = psValue.toString();
            valMap.put("ps", psValueAsString);
        }
        String bLowerCaseValue = getbLowerCase();
        if (bLowerCaseValue != null) {
            String bLowerCaseValueAsString = bLowerCaseValue.toString();
            valMap.put("bLowerCase", bLowerCaseValueAsString);
        }
        String BValue = getB();
        if (BValue != null) {
            String BValueAsString = BValue.toString();
            valMap.put("B", BValueAsString);
        }
        String aLowerCaseValue = getaLowerCase();
        if (aLowerCaseValue != null) {
            String aLowerCaseValueAsString = aLowerCaseValue.toString();
            valMap.put("aLowerCase", aLowerCaseValueAsString);
        }
        String AValue = getA();
        if (AValue != null) {
            String AValueAsString = AValue.toString();
            valMap.put("A", AValueAsString);
        }
        Long TValue = getT();
        if (TValue != null) {
            String TValueAsString = TValue.toString();
            valMap.put("T", TValueAsString);
        }
        Long EValue = getE();
        if (EValue != null) {
            String EValueAsString = EValue.toString();
            valMap.put("E", EValueAsString);
        }

        valMap.put("timestamp", getTimestamp());
        return asciiEncode(
                valMap.keySet().stream()
                        .map(key -> key + "=" + valMap.get(key))
                        .collect(Collectors.joining("&")));
    }

    public Map<String, Object> toMap() {
        Map<String, Object> valMap = new TreeMap<String, Object>();
        valMap.put("apiKey", getApiKey());
        Object eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            valMap.put("eLowerCase", eLowerCaseValue);
        }
        Object uLowerCaseValue = getuLowerCase();
        if (uLowerCaseValue != null) {
            valMap.put("uLowerCase", uLowerCaseValue);
        }
        Object sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            valMap.put("sLowerCase", sLowerCaseValue);
        }
        Object psValue = getPs();
        if (psValue != null) {
            valMap.put("ps", psValue);
        }
        Object bLowerCaseValue = getbLowerCase();
        if (bLowerCaseValue != null) {
            valMap.put("bLowerCase", bLowerCaseValue);
        }
        Object BValue = getB();
        if (BValue != null) {
            valMap.put("B", BValue);
        }
        Object aLowerCaseValue = getaLowerCase();
        if (aLowerCaseValue != null) {
            valMap.put("aLowerCase", aLowerCaseValue);
        }
        Object AValue = getA();
        if (AValue != null) {
            valMap.put("A", AValue);
        }
        Object TValue = getT();
        if (TValue != null) {
            valMap.put("T", TValue);
        }
        Object EValue = getE();
        if (EValue != null) {
            valMap.put("E", EValue);
        }

        valMap.put("timestamp", getTimestamp());
        return valMap;
    }

    public static String asciiEncode(String s) {
        return new String(s.getBytes(), StandardCharsets.US_ASCII);
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n		");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("e");
        openapiFields.add("u");
        openapiFields.add("s");
        openapiFields.add("ps");
        openapiFields.add("b");
        openapiFields.add("B");
        openapiFields.add("a");
        openapiFields.add("A");
        openapiFields.add("T");
        openapiFields.add("E");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     IndividualSymbolBookTickerStreamsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!IndividualSymbolBookTickerStreamsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " IndividualSymbolBookTickerStreamsResponse is not found in"
                                    + " the empty JSON string",
                                IndividualSymbolBookTickerStreamsResponse.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!IndividualSymbolBookTickerStreamsResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `IndividualSymbolBookTickerStreamsResponse` properties."
                                        + " JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("e") != null && !jsonObj.get("e").isJsonNull())
                && !jsonObj.get("e").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `e` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("e").toString()));
        }
        if ((jsonObj.get("s") != null && !jsonObj.get("s").isJsonNull())
                && !jsonObj.get("s").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `s` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("s").toString()));
        }
        if ((jsonObj.get("ps") != null && !jsonObj.get("ps").isJsonNull())
                && !jsonObj.get("ps").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ps` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ps").toString()));
        }
        if ((jsonObj.get("b") != null && !jsonObj.get("b").isJsonNull())
                && !jsonObj.get("b").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `b` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("b").toString()));
        }
        if ((jsonObj.get("B") != null && !jsonObj.get("B").isJsonNull())
                && !jsonObj.get("B").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `B` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("B").toString()));
        }
        if ((jsonObj.get("a") != null && !jsonObj.get("a").isJsonNull())
                && !jsonObj.get("a").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `a` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("a").toString()));
        }
        if ((jsonObj.get("A") != null && !jsonObj.get("A").isJsonNull())
                && !jsonObj.get("A").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `A` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("A").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!IndividualSymbolBookTickerStreamsResponse.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'IndividualSymbolBookTickerStreamsResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<IndividualSymbolBookTickerStreamsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(IndividualSymbolBookTickerStreamsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<IndividualSymbolBookTickerStreamsResponse>() {
                        @Override
                        public void write(
                                JsonWriter out, IndividualSymbolBookTickerStreamsResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public IndividualSymbolBookTickerStreamsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of IndividualSymbolBookTickerStreamsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of IndividualSymbolBookTickerStreamsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     IndividualSymbolBookTickerStreamsResponse
     */
    public static IndividualSymbolBookTickerStreamsResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, IndividualSymbolBookTickerStreamsResponse.class);
    }

    /**
     * Convert an instance of IndividualSymbolBookTickerStreamsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
