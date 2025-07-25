/*
 * Binance Derivatives Trading USDS Futures WebSocket Market Streams
 * OpenAPI Specification for the Binance Derivatives Trading USDS Futures WebSocket Market Streams
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.JSON;
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

/** ConditionalOrderTriggerRejectOr */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ConditionalOrderTriggerRejectOr extends BaseDTO {
    public static final String SERIALIZED_NAME_S_LOWER_CASE = "s";

    @SerializedName(SERIALIZED_NAME_S_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String sLowerCase;

    public static final String SERIALIZED_NAME_I_LOWER_CASE = "i";

    @SerializedName(SERIALIZED_NAME_I_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Long iLowerCase;

    public static final String SERIALIZED_NAME_R_LOWER_CASE = "r";

    @SerializedName(SERIALIZED_NAME_R_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String rLowerCase;

    public ConditionalOrderTriggerRejectOr() {}

    public ConditionalOrderTriggerRejectOr sLowerCase(
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

    public ConditionalOrderTriggerRejectOr iLowerCase(
            @jakarta.annotation.Nullable Long iLowerCase) {
        this.iLowerCase = iLowerCase;
        return this;
    }

    /**
     * Get iLowerCase
     *
     * @return iLowerCase
     */
    @jakarta.annotation.Nullable
    public Long getiLowerCase() {
        return iLowerCase;
    }

    public void setiLowerCase(@jakarta.annotation.Nullable Long iLowerCase) {
        this.iLowerCase = iLowerCase;
    }

    public ConditionalOrderTriggerRejectOr rLowerCase(
            @jakarta.annotation.Nullable String rLowerCase) {
        this.rLowerCase = rLowerCase;
        return this;
    }

    /**
     * Get rLowerCase
     *
     * @return rLowerCase
     */
    @jakarta.annotation.Nullable
    public String getrLowerCase() {
        return rLowerCase;
    }

    public void setrLowerCase(@jakarta.annotation.Nullable String rLowerCase) {
        this.rLowerCase = rLowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionalOrderTriggerRejectOr conditionalOrderTriggerRejectOr =
                (ConditionalOrderTriggerRejectOr) o;
        return Objects.equals(this.sLowerCase, conditionalOrderTriggerRejectOr.sLowerCase)
                && Objects.equals(this.iLowerCase, conditionalOrderTriggerRejectOr.iLowerCase)
                && Objects.equals(this.rLowerCase, conditionalOrderTriggerRejectOr.rLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sLowerCase, iLowerCase, rLowerCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionalOrderTriggerRejectOr {\n");
        sb.append("		sLowerCase: ").append(toIndentedString(sLowerCase)).append("\n");
        sb.append("		iLowerCase: ").append(toIndentedString(iLowerCase)).append("\n");
        sb.append("		rLowerCase: ").append(toIndentedString(rLowerCase)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            String sLowerCaseValueAsString = sLowerCaseValue.toString();
            valMap.put("sLowerCase", sLowerCaseValueAsString);
        }
        Long iLowerCaseValue = getiLowerCase();
        if (iLowerCaseValue != null) {
            String iLowerCaseValueAsString = iLowerCaseValue.toString();
            valMap.put("iLowerCase", iLowerCaseValueAsString);
        }
        String rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            String rLowerCaseValueAsString = rLowerCaseValue.toString();
            valMap.put("rLowerCase", rLowerCaseValueAsString);
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
        Object sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            valMap.put("sLowerCase", sLowerCaseValue);
        }
        Object iLowerCaseValue = getiLowerCase();
        if (iLowerCaseValue != null) {
            valMap.put("iLowerCase", iLowerCaseValue);
        }
        Object rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            valMap.put("rLowerCase", rLowerCaseValue);
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
        openapiFields.add("s");
        openapiFields.add("i");
        openapiFields.add("r");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ConditionalOrderTriggerRejectOr
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ConditionalOrderTriggerRejectOr.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConditionalOrderTriggerRejectOr is not"
                                        + " found in the empty JSON string",
                                ConditionalOrderTriggerRejectOr.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ConditionalOrderTriggerRejectOr.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ConditionalOrderTriggerRejectOr` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("s") != null && !jsonObj.get("s").isJsonNull())
                && !jsonObj.get("s").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `s` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("s").toString()));
        }
        if ((jsonObj.get("r") != null && !jsonObj.get("r").isJsonNull())
                && !jsonObj.get("r").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `r` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("r").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConditionalOrderTriggerRejectOr.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConditionalOrderTriggerRejectOr' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConditionalOrderTriggerRejectOr> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ConditionalOrderTriggerRejectOr.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConditionalOrderTriggerRejectOr>() {
                        @Override
                        public void write(JsonWriter out, ConditionalOrderTriggerRejectOr value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ConditionalOrderTriggerRejectOr read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ConditionalOrderTriggerRejectOr given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConditionalOrderTriggerRejectOr
     * @throws IOException if the JSON string is invalid with respect to
     *     ConditionalOrderTriggerRejectOr
     */
    public static ConditionalOrderTriggerRejectOr fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConditionalOrderTriggerRejectOr.class);
    }

    /**
     * Convert an instance of ConditionalOrderTriggerRejectOr to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
