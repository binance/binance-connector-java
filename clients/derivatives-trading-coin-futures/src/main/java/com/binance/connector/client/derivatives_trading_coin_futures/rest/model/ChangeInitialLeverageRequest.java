/*
 * Binance Derivatives Trading COIN Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading COIN Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.rest.model;

import com.binance.connector.client.derivatives_trading_coin_futures.rest.JSON;
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
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** ChangeInitialLeverageRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ChangeInitialLeverageRequest {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nonnull
    private String symbol;

    public static final String SERIALIZED_NAME_LEVERAGE = "leverage";

    @SerializedName(SERIALIZED_NAME_LEVERAGE)
    @jakarta.annotation.Nonnull
    private Long leverage;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public ChangeInitialLeverageRequest() {}

    public ChangeInitialLeverageRequest symbol(@jakarta.annotation.Nonnull String symbol) {
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

    public ChangeInitialLeverageRequest leverage(@jakarta.annotation.Nonnull Long leverage) {
        this.leverage = leverage;
        return this;
    }

    /**
     * Get leverage
     *
     * @return leverage
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public Long getLeverage() {
        return leverage;
    }

    public void setLeverage(@jakarta.annotation.Nonnull Long leverage) {
        this.leverage = leverage;
    }

    public ChangeInitialLeverageRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
        return this;
    }

    /**
     * Get recvWindow
     *
     * @return recvWindow
     */
    @jakarta.annotation.Nullable
    public Long getRecvWindow() {
        return recvWindow;
    }

    public void setRecvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeInitialLeverageRequest changeInitialLeverageRequest =
                (ChangeInitialLeverageRequest) o;
        return Objects.equals(this.symbol, changeInitialLeverageRequest.symbol)
                && Objects.equals(this.leverage, changeInitialLeverageRequest.leverage)
                && Objects.equals(this.recvWindow, changeInitialLeverageRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, leverage, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInitialLeverageRequest {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		leverage: ").append(toIndentedString(leverage)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object leverageValue = getLeverage();
        String leverageValueAsString = "";
        leverageValueAsString = leverageValue.toString();
        sb.append("leverage=").append(urlEncode(leverageValueAsString)).append("");
        Object recvWindowValue = getRecvWindow();
        String recvWindowValueAsString = "";
        recvWindowValueAsString = recvWindowValue.toString();
        sb.append("recvWindow=").append(urlEncode(recvWindowValueAsString)).append("");
        return sb.toString();
    }

    public static String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(StandardCharsets.UTF_8.name() + " is unsupported", e);
        }
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
        openapiFields.add("symbol");
        openapiFields.add("leverage");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("symbol");
        openapiRequiredFields.add("leverage");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ChangeInitialLeverageRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ChangeInitialLeverageRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ChangeInitialLeverageRequest is not"
                                        + " found in the empty JSON string",
                                ChangeInitialLeverageRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ChangeInitialLeverageRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChangeInitialLeverageRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChangeInitialLeverageRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChangeInitialLeverageRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ChangeInitialLeverageRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ChangeInitialLeverageRequest>() {
                        @Override
                        public void write(JsonWriter out, ChangeInitialLeverageRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ChangeInitialLeverageRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ChangeInitialLeverageRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChangeInitialLeverageRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ChangeInitialLeverageRequest
     */
    public static ChangeInitialLeverageRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChangeInitialLeverageRequest.class);
    }

    /**
     * Convert an instance of ChangeInitialLeverageRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
