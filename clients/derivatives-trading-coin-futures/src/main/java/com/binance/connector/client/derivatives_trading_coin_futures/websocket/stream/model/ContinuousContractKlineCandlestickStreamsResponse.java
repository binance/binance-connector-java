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
import jakarta.validation.Valid;
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

/** ContinuousContractKlineCandlestickStreamsResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ContinuousContractKlineCandlestickStreamsResponse extends BaseDTO {
    public static final String SERIALIZED_NAME_E_LOWER_CASE = "e";

    @SerializedName(SERIALIZED_NAME_E_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String eLowerCase;

    public static final String SERIALIZED_NAME_E = "E";

    @SerializedName(SERIALIZED_NAME_E)
    @jakarta.annotation.Nullable
    private Long E;

    public static final String SERIALIZED_NAME_PS = "ps";

    @SerializedName(SERIALIZED_NAME_PS)
    @jakarta.annotation.Nullable
    private String ps;

    public static final String SERIALIZED_NAME_CT = "ct";

    @SerializedName(SERIALIZED_NAME_CT)
    @jakarta.annotation.Nullable
    private String ct;

    public static final String SERIALIZED_NAME_K_LOWER_CASE = "k";

    @SerializedName(SERIALIZED_NAME_K_LOWER_CASE)
    @jakarta.annotation.Nullable
    private ContinuousContractKlineCandlestickStreamsResponseK kLowerCase;

    public ContinuousContractKlineCandlestickStreamsResponse() {}

    public ContinuousContractKlineCandlestickStreamsResponse eLowerCase(
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

    public ContinuousContractKlineCandlestickStreamsResponse E(
            @jakarta.annotation.Nullable Long E) {
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

    public ContinuousContractKlineCandlestickStreamsResponse ps(
            @jakarta.annotation.Nullable String ps) {
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

    public ContinuousContractKlineCandlestickStreamsResponse ct(
            @jakarta.annotation.Nullable String ct) {
        this.ct = ct;
        return this;
    }

    /**
     * Get ct
     *
     * @return ct
     */
    @jakarta.annotation.Nullable
    public String getCt() {
        return ct;
    }

    public void setCt(@jakarta.annotation.Nullable String ct) {
        this.ct = ct;
    }

    public ContinuousContractKlineCandlestickStreamsResponse kLowerCase(
            @jakarta.annotation.Nullable
                    ContinuousContractKlineCandlestickStreamsResponseK kLowerCase) {
        this.kLowerCase = kLowerCase;
        return this;
    }

    /**
     * Get kLowerCase
     *
     * @return kLowerCase
     */
    @jakarta.annotation.Nullable
    @Valid
    public ContinuousContractKlineCandlestickStreamsResponseK getkLowerCase() {
        return kLowerCase;
    }

    public void setkLowerCase(
            @jakarta.annotation.Nullable
                    ContinuousContractKlineCandlestickStreamsResponseK kLowerCase) {
        this.kLowerCase = kLowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContinuousContractKlineCandlestickStreamsResponse
                continuousContractKlineCandlestickStreamsResponse =
                        (ContinuousContractKlineCandlestickStreamsResponse) o;
        return Objects.equals(
                        this.eLowerCase,
                        continuousContractKlineCandlestickStreamsResponse.eLowerCase)
                && Objects.equals(this.E, continuousContractKlineCandlestickStreamsResponse.E)
                && Objects.equals(this.ps, continuousContractKlineCandlestickStreamsResponse.ps)
                && Objects.equals(this.ct, continuousContractKlineCandlestickStreamsResponse.ct)
                && Objects.equals(
                        this.kLowerCase,
                        continuousContractKlineCandlestickStreamsResponse.kLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eLowerCase, E, ps, ct, kLowerCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContinuousContractKlineCandlestickStreamsResponse {\n");
        sb.append("		eLowerCase: ").append(toIndentedString(eLowerCase)).append("\n");
        sb.append("		E: ").append(toIndentedString(E)).append("\n");
        sb.append("		ps: ").append(toIndentedString(ps)).append("\n");
        sb.append("		ct: ").append(toIndentedString(ct)).append("\n");
        sb.append("		kLowerCase: ").append(toIndentedString(kLowerCase)).append("\n");
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
        Long EValue = getE();
        if (EValue != null) {
            String EValueAsString = EValue.toString();
            valMap.put("E", EValueAsString);
        }
        String psValue = getPs();
        if (psValue != null) {
            String psValueAsString = psValue.toString();
            valMap.put("ps", psValueAsString);
        }
        String ctValue = getCt();
        if (ctValue != null) {
            String ctValueAsString = ctValue.toString();
            valMap.put("ct", ctValueAsString);
        }
        ContinuousContractKlineCandlestickStreamsResponseK kLowerCaseValue = getkLowerCase();
        if (kLowerCaseValue != null) {
            String kLowerCaseValueAsString = JSON.getGson().toJson(kLowerCaseValue);
            valMap.put("kLowerCase", kLowerCaseValueAsString);
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
        Object EValue = getE();
        if (EValue != null) {
            valMap.put("E", EValue);
        }
        Object psValue = getPs();
        if (psValue != null) {
            valMap.put("ps", psValue);
        }
        Object ctValue = getCt();
        if (ctValue != null) {
            valMap.put("ct", ctValue);
        }
        Object kLowerCaseValue = getkLowerCase();
        if (kLowerCaseValue != null) {
            valMap.put("kLowerCase", kLowerCaseValue);
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
        openapiFields.add("E");
        openapiFields.add("ps");
        openapiFields.add("ct");
        openapiFields.add("k");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ContinuousContractKlineCandlestickStreamsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ContinuousContractKlineCandlestickStreamsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " ContinuousContractKlineCandlestickStreamsResponse is not"
                                    + " found in the empty JSON string",
                                ContinuousContractKlineCandlestickStreamsResponse
                                        .openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ContinuousContractKlineCandlestickStreamsResponse.openapiFields.contains(
                    entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ContinuousContractKlineCandlestickStreamsResponse`"
                                        + " properties. JSON: %s",
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
        if ((jsonObj.get("ps") != null && !jsonObj.get("ps").isJsonNull())
                && !jsonObj.get("ps").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ps` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ps").toString()));
        }
        if ((jsonObj.get("ct") != null && !jsonObj.get("ct").isJsonNull())
                && !jsonObj.get("ct").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ct` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ct").toString()));
        }
        // validate the optional field `k`
        if (jsonObj.get("k") != null && !jsonObj.get("k").isJsonNull()) {
            ContinuousContractKlineCandlestickStreamsResponseK.validateJsonElement(
                    jsonObj.get("k"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContinuousContractKlineCandlestickStreamsResponse.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'ContinuousContractKlineCandlestickStreamsResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContinuousContractKlineCandlestickStreamsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(ContinuousContractKlineCandlestickStreamsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ContinuousContractKlineCandlestickStreamsResponse>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                ContinuousContractKlineCandlestickStreamsResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ContinuousContractKlineCandlestickStreamsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ContinuousContractKlineCandlestickStreamsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContinuousContractKlineCandlestickStreamsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     ContinuousContractKlineCandlestickStreamsResponse
     */
    public static ContinuousContractKlineCandlestickStreamsResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, ContinuousContractKlineCandlestickStreamsResponse.class);
    }

    /**
     * Convert an instance of ContinuousContractKlineCandlestickStreamsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
