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

/** KlineCandlestickStreamsRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class KlineCandlestickStreamsRequest extends BaseDTO {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @jakarta.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nonnull
    private String symbol;

    public static final String SERIALIZED_NAME_INTERVAL = "interval";

    @SerializedName(SERIALIZED_NAME_INTERVAL)
    @jakarta.annotation.Nonnull
    private String interval;

    public KlineCandlestickStreamsRequest() {}

    public KlineCandlestickStreamsRequest id(@jakarta.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return id;
    }

    public void setId(@jakarta.annotation.Nullable String id) {
        this.id = id;
    }

    public KlineCandlestickStreamsRequest symbol(@jakarta.annotation.Nonnull String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(@jakarta.annotation.Nonnull String symbol) {
        this.symbol = symbol;
    }

    public KlineCandlestickStreamsRequest interval(@jakarta.annotation.Nonnull String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get interval
     *
     * @return interval
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getInterval() {
        return interval;
    }

    public void setInterval(@jakarta.annotation.Nonnull String interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KlineCandlestickStreamsRequest klineCandlestickStreamsRequest =
                (KlineCandlestickStreamsRequest) o;
        return Objects.equals(this.id, klineCandlestickStreamsRequest.id)
                && Objects.equals(this.symbol, klineCandlestickStreamsRequest.symbol)
                && Objects.equals(this.interval, klineCandlestickStreamsRequest.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, symbol, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KlineCandlestickStreamsRequest {\n");
        sb.append("		id: ").append(toIndentedString(id)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String idValue = getId();
        if (idValue != null) {
            String idValueAsString = idValue.toString();
            valMap.put("id", idValueAsString);
        }
        String symbolValue = getSymbol();
        if (symbolValue != null) {
            String symbolValueAsString = symbolValue.toString();
            valMap.put("symbol", symbolValueAsString);
        }
        String intervalValue = getInterval();
        if (intervalValue != null) {
            String intervalValueAsString = intervalValue.toString();
            valMap.put("interval", intervalValueAsString);
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
        Object idValue = getId();
        if (idValue != null) {
            valMap.put("id", idValue);
        }
        Object symbolValue = getSymbol();
        if (symbolValue != null) {
            valMap.put("symbol", symbolValue);
        }
        Object intervalValue = getInterval();
        if (intervalValue != null) {
            valMap.put("interval", intervalValue);
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
        openapiFields.add("id");
        openapiFields.add("symbol");
        openapiFields.add("interval");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("symbol");
        openapiRequiredFields.add("interval");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     KlineCandlestickStreamsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!KlineCandlestickStreamsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in KlineCandlestickStreamsRequest is not"
                                        + " found in the empty JSON string",
                                KlineCandlestickStreamsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!KlineCandlestickStreamsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `KlineCandlestickStreamsRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : KlineCandlestickStreamsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
                && !jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        if (!jsonObj.get("interval").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `interval` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("interval").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!KlineCandlestickStreamsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'KlineCandlestickStreamsRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<KlineCandlestickStreamsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(KlineCandlestickStreamsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<KlineCandlestickStreamsRequest>() {
                        @Override
                        public void write(JsonWriter out, KlineCandlestickStreamsRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public KlineCandlestickStreamsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of KlineCandlestickStreamsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of KlineCandlestickStreamsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     KlineCandlestickStreamsRequest
     */
    public static KlineCandlestickStreamsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, KlineCandlestickStreamsRequest.class);
    }

    /**
     * Convert an instance of KlineCandlestickStreamsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
