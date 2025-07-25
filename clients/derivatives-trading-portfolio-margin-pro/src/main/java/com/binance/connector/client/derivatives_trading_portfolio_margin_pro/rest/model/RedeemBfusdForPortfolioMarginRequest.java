/*
 * Binance Derivatives Trading Portfolio Margin Pro REST API
 * OpenAPI Specification for the Binance Derivatives Trading Portfolio Margin Pro REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model;

import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.JSON;
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

/** RedeemBfusdForPortfolioMarginRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class RedeemBfusdForPortfolioMarginRequest {
    public static final String SERIALIZED_NAME_FROM_ASSET = "fromAsset";

    @SerializedName(SERIALIZED_NAME_FROM_ASSET)
    @jakarta.annotation.Nonnull
    private String fromAsset;

    public static final String SERIALIZED_NAME_TARGET_ASSET = "targetAsset";

    @SerializedName(SERIALIZED_NAME_TARGET_ASSET)
    @jakarta.annotation.Nonnull
    private String targetAsset;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nonnull
    private Double amount;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public RedeemBfusdForPortfolioMarginRequest() {}

    public RedeemBfusdForPortfolioMarginRequest fromAsset(
            @jakarta.annotation.Nonnull String fromAsset) {
        this.fromAsset = fromAsset;
        return this;
    }

    /**
     * Get fromAsset
     *
     * @return fromAsset
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getFromAsset() {
        return fromAsset;
    }

    public void setFromAsset(@jakarta.annotation.Nonnull String fromAsset) {
        this.fromAsset = fromAsset;
    }

    public RedeemBfusdForPortfolioMarginRequest targetAsset(
            @jakarta.annotation.Nonnull String targetAsset) {
        this.targetAsset = targetAsset;
        return this;
    }

    /**
     * Get targetAsset
     *
     * @return targetAsset
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getTargetAsset() {
        return targetAsset;
    }

    public void setTargetAsset(@jakarta.annotation.Nonnull String targetAsset) {
        this.targetAsset = targetAsset;
    }

    public RedeemBfusdForPortfolioMarginRequest amount(@jakarta.annotation.Nonnull Double amount) {
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

    public RedeemBfusdForPortfolioMarginRequest recvWindow(
            @jakarta.annotation.Nullable Long recvWindow) {
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
        RedeemBfusdForPortfolioMarginRequest redeemBfusdForPortfolioMarginRequest =
                (RedeemBfusdForPortfolioMarginRequest) o;
        return Objects.equals(this.fromAsset, redeemBfusdForPortfolioMarginRequest.fromAsset)
                && Objects.equals(
                        this.targetAsset, redeemBfusdForPortfolioMarginRequest.targetAsset)
                && Objects.equals(this.amount, redeemBfusdForPortfolioMarginRequest.amount)
                && Objects.equals(this.recvWindow, redeemBfusdForPortfolioMarginRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromAsset, targetAsset, amount, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedeemBfusdForPortfolioMarginRequest {\n");
        sb.append("		fromAsset: ").append(toIndentedString(fromAsset)).append("\n");
        sb.append("		targetAsset: ").append(toIndentedString(targetAsset)).append("\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object fromAssetValue = getFromAsset();
        String fromAssetValueAsString = "";
        fromAssetValueAsString = fromAssetValue.toString();
        sb.append("fromAsset=").append(urlEncode(fromAssetValueAsString)).append("");
        Object targetAssetValue = getTargetAsset();
        String targetAssetValueAsString = "";
        targetAssetValueAsString = targetAssetValue.toString();
        sb.append("targetAsset=").append(urlEncode(targetAssetValueAsString)).append("");
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
        openapiFields.add("fromAsset");
        openapiFields.add("targetAsset");
        openapiFields.add("amount");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("fromAsset");
        openapiRequiredFields.add("targetAsset");
        openapiRequiredFields.add("amount");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     RedeemBfusdForPortfolioMarginRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!RedeemBfusdForPortfolioMarginRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RedeemBfusdForPortfolioMarginRequest"
                                        + " is not found in the empty JSON string",
                                RedeemBfusdForPortfolioMarginRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : RedeemBfusdForPortfolioMarginRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("fromAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `fromAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("fromAsset").toString()));
        }
        if (!jsonObj.get("targetAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `targetAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("targetAsset").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RedeemBfusdForPortfolioMarginRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RedeemBfusdForPortfolioMarginRequest'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RedeemBfusdForPortfolioMarginRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(RedeemBfusdForPortfolioMarginRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RedeemBfusdForPortfolioMarginRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, RedeemBfusdForPortfolioMarginRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RedeemBfusdForPortfolioMarginRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RedeemBfusdForPortfolioMarginRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RedeemBfusdForPortfolioMarginRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     RedeemBfusdForPortfolioMarginRequest
     */
    public static RedeemBfusdForPortfolioMarginRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, RedeemBfusdForPortfolioMarginRequest.class);
    }

    /**
     * Convert an instance of RedeemBfusdForPortfolioMarginRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
