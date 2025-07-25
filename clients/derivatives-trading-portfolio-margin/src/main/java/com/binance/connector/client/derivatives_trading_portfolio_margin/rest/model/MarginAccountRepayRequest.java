/*
 * Binance Derivatives Trading Portfolio Margin REST API
 * OpenAPI Specification for the Binance Derivatives Trading Portfolio Margin REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model;

import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.JSON;
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
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** MarginAccountRepayRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class MarginAccountRepayRequest {
    public static final String SERIALIZED_NAME_ASSET = "asset";

    @SerializedName(SERIALIZED_NAME_ASSET)
    @jakarta.annotation.Nonnull
    private String asset;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nonnull
    private Double amount;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public MarginAccountRepayRequest() {}

    public MarginAccountRepayRequest asset(@jakarta.annotation.Nonnull String asset) {
        this.asset = asset;
        return this;
    }

    /**
     * Get asset
     *
     * @return asset
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getAsset() {
        return asset;
    }

    public void setAsset(@jakarta.annotation.Nonnull String asset) {
        this.asset = asset;
    }

    public MarginAccountRepayRequest amount(@jakarta.annotation.Nonnull Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getAmount() {
        return amount;
    }

    public void setAmount(@jakarta.annotation.Nonnull Double amount) {
        this.amount = amount;
    }

    public MarginAccountRepayRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
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
        MarginAccountRepayRequest marginAccountRepayRequest = (MarginAccountRepayRequest) o;
        return Objects.equals(this.asset, marginAccountRepayRequest.asset)
                && Objects.equals(this.amount, marginAccountRepayRequest.amount)
                && Objects.equals(this.recvWindow, marginAccountRepayRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asset, amount, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarginAccountRepayRequest {\n");
        sb.append("		asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object assetValue = getAsset();
        String assetValueAsString = "";
        assetValueAsString = assetValue.toString();
        sb.append("asset=").append(urlEncode(assetValueAsString)).append("");
        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
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
        openapiFields.add("asset");
        openapiFields.add("amount");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("asset");
        openapiRequiredFields.add("amount");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MarginAccountRepayRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!MarginAccountRepayRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in MarginAccountRepayRequest is not found"
                                        + " in the empty JSON string",
                                MarginAccountRepayRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : MarginAccountRepayRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("asset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `asset` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("asset").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MarginAccountRepayRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MarginAccountRepayRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MarginAccountRepayRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(MarginAccountRepayRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<MarginAccountRepayRequest>() {
                        @Override
                        public void write(JsonWriter out, MarginAccountRepayRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public MarginAccountRepayRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of MarginAccountRepayRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MarginAccountRepayRequest
     * @throws IOException if the JSON string is invalid with respect to MarginAccountRepayRequest
     */
    public static MarginAccountRepayRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MarginAccountRepayRequest.class);
    }

    /**
     * Convert an instance of MarginAccountRepayRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
