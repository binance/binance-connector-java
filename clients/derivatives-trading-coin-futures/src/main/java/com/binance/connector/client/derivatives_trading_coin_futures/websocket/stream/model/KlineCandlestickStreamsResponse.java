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

/** KlineCandlestickStreamsResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class KlineCandlestickStreamsResponse extends BaseDTO {
    public static final String SERIALIZED_NAME_E_LOWER_CASE = "e";

    @SerializedName(SERIALIZED_NAME_E_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String eLowerCase;

    public static final String SERIALIZED_NAME_E = "E";

    @SerializedName(SERIALIZED_NAME_E)
    @jakarta.annotation.Nullable
    private Long E;

    public static final String SERIALIZED_NAME_S_LOWER_CASE = "s";

    @SerializedName(SERIALIZED_NAME_S_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String sLowerCase;

    public static final String SERIALIZED_NAME_K_LOWER_CASE = "k";

    @SerializedName(SERIALIZED_NAME_K_LOWER_CASE)
    @jakarta.annotation.Nullable
    private KlineCandlestickStreamsResponseK kLowerCase;

    public KlineCandlestickStreamsResponse() {}

    public KlineCandlestickStreamsResponse eLowerCase(
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

    public KlineCandlestickStreamsResponse E(@jakarta.annotation.Nullable Long E) {
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

    public KlineCandlestickStreamsResponse sLowerCase(
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

    public KlineCandlestickStreamsResponse kLowerCase(
            @jakarta.annotation.Nullable KlineCandlestickStreamsResponseK kLowerCase) {
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
    public KlineCandlestickStreamsResponseK getkLowerCase() {
        return kLowerCase;
    }

    public void setkLowerCase(
            @jakarta.annotation.Nullable KlineCandlestickStreamsResponseK kLowerCase) {
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
        KlineCandlestickStreamsResponse klineCandlestickStreamsResponse =
                (KlineCandlestickStreamsResponse) o;
        return Objects.equals(this.eLowerCase, klineCandlestickStreamsResponse.eLowerCase)
                && Objects.equals(this.E, klineCandlestickStreamsResponse.E)
                && Objects.equals(this.sLowerCase, klineCandlestickStreamsResponse.sLowerCase)
                && Objects.equals(this.kLowerCase, klineCandlestickStreamsResponse.kLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eLowerCase, E, sLowerCase, kLowerCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KlineCandlestickStreamsResponse {\n");
        sb.append("		eLowerCase: ").append(toIndentedString(eLowerCase)).append("\n");
        sb.append("		E: ").append(toIndentedString(E)).append("\n");
        sb.append("		sLowerCase: ").append(toIndentedString(sLowerCase)).append("\n");
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
        String sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            String sLowerCaseValueAsString = sLowerCaseValue.toString();
            valMap.put("sLowerCase", sLowerCaseValueAsString);
        }
        KlineCandlestickStreamsResponseK kLowerCaseValue = getkLowerCase();
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
        Object sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            valMap.put("sLowerCase", sLowerCaseValue);
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
        openapiFields.add("s");
        openapiFields.add("k");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     KlineCandlestickStreamsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!KlineCandlestickStreamsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in KlineCandlestickStreamsResponse is not"
                                        + " found in the empty JSON string",
                                KlineCandlestickStreamsResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!KlineCandlestickStreamsResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `KlineCandlestickStreamsResponse` properties. JSON: %s",
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
        // validate the optional field `k`
        if (jsonObj.get("k") != null && !jsonObj.get("k").isJsonNull()) {
            KlineCandlestickStreamsResponseK.validateJsonElement(jsonObj.get("k"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!KlineCandlestickStreamsResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'KlineCandlestickStreamsResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<KlineCandlestickStreamsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(KlineCandlestickStreamsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<KlineCandlestickStreamsResponse>() {
                        @Override
                        public void write(JsonWriter out, KlineCandlestickStreamsResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public KlineCandlestickStreamsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of KlineCandlestickStreamsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of KlineCandlestickStreamsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     KlineCandlestickStreamsResponse
     */
    public static KlineCandlestickStreamsResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, KlineCandlestickStreamsResponse.class);
    }

    /**
     * Convert an instance of KlineCandlestickStreamsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
