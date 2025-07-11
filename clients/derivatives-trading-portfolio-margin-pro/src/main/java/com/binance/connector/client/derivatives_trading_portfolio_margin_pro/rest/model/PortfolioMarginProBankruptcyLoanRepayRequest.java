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
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** PortfolioMarginProBankruptcyLoanRepayRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PortfolioMarginProBankruptcyLoanRepayRequest {
    public static final String SERIALIZED_NAME_FROM = "from";

    @SerializedName(SERIALIZED_NAME_FROM)
    @jakarta.annotation.Nullable
    private String from;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public PortfolioMarginProBankruptcyLoanRepayRequest() {}

    public PortfolioMarginProBankruptcyLoanRepayRequest from(
            @jakarta.annotation.Nullable String from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     *
     * @return from
     */
    @jakarta.annotation.Nullable
    public String getFrom() {
        return from;
    }

    public void setFrom(@jakarta.annotation.Nullable String from) {
        this.from = from;
    }

    public PortfolioMarginProBankruptcyLoanRepayRequest recvWindow(
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
        PortfolioMarginProBankruptcyLoanRepayRequest portfolioMarginProBankruptcyLoanRepayRequest =
                (PortfolioMarginProBankruptcyLoanRepayRequest) o;
        return Objects.equals(this.from, portfolioMarginProBankruptcyLoanRepayRequest.from)
                && Objects.equals(
                        this.recvWindow, portfolioMarginProBankruptcyLoanRepayRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortfolioMarginProBankruptcyLoanRepayRequest {\n");
        sb.append("		from: ").append(toIndentedString(from)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object fromValue = getFrom();
        String fromValueAsString = "";
        fromValueAsString = fromValue.toString();
        sb.append("from=").append(urlEncode(fromValueAsString)).append("");
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
        openapiFields.add("from");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     PortfolioMarginProBankruptcyLoanRepayRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PortfolioMarginProBankruptcyLoanRepayRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " PortfolioMarginProBankruptcyLoanRepayRequest is not found"
                                    + " in the empty JSON string",
                                PortfolioMarginProBankruptcyLoanRepayRequest.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull())
                && !jsonObj.get("from").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `from` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("from").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PortfolioMarginProBankruptcyLoanRepayRequest.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'PortfolioMarginProBankruptcyLoanRepayRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PortfolioMarginProBankruptcyLoanRepayRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(PortfolioMarginProBankruptcyLoanRepayRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PortfolioMarginProBankruptcyLoanRepayRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, PortfolioMarginProBankruptcyLoanRepayRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PortfolioMarginProBankruptcyLoanRepayRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PortfolioMarginProBankruptcyLoanRepayRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PortfolioMarginProBankruptcyLoanRepayRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     PortfolioMarginProBankruptcyLoanRepayRequest
     */
    public static PortfolioMarginProBankruptcyLoanRepayRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, PortfolioMarginProBankruptcyLoanRepayRequest.class);
    }

    /**
     * Convert an instance of PortfolioMarginProBankruptcyLoanRepayRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
