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
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators {
    public static final String SERIALIZED_NAME_B_T_C_U_S_D_T = "BTCUSDT";

    @SerializedName(SERIALIZED_NAME_B_T_C_U_S_D_T)
    @jakarta.annotation.Nullable
    private List<
                    @Valid
                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsBTCUSDTInner>
            BTCUSDT;

    public static final String SERIALIZED_NAME_A_C_C_O_U_N_T = "ACCOUNT";

    @SerializedName(SERIALIZED_NAME_A_C_C_O_U_N_T)
    @jakarta.annotation.Nullable
    private List<
                    @Valid
                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsACCOUNTInner>
            ACCOUNT;

    public PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators() {}

    public PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators BTCUSDT(
            @jakarta.annotation.Nullable
                    List<
                                    @Valid
                                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsBTCUSDTInner>
                            BTCUSDT) {
        this.BTCUSDT = BTCUSDT;
        return this;
    }

    public PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators addBTCUSDTItem(
            PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsBTCUSDTInner
                    BTCUSDTItem) {
        if (this.BTCUSDT == null) {
            this.BTCUSDT = new ArrayList<>();
        }
        this.BTCUSDT.add(BTCUSDTItem);
        return this;
    }

    /**
     * Get BTCUSDT
     *
     * @return BTCUSDT
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<
                    @Valid
                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsBTCUSDTInner>
            getBTCUSDT() {
        return BTCUSDT;
    }

    public void setBTCUSDT(
            @jakarta.annotation.Nullable
                    List<
                                    @Valid
                                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsBTCUSDTInner>
                            BTCUSDT) {
        this.BTCUSDT = BTCUSDT;
    }

    public PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators ACCOUNT(
            @jakarta.annotation.Nullable
                    List<
                                    @Valid
                                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsACCOUNTInner>
                            ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
        return this;
    }

    public PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators addACCOUNTItem(
            PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsACCOUNTInner
                    ACCOUNTItem) {
        if (this.ACCOUNT == null) {
            this.ACCOUNT = new ArrayList<>();
        }
        this.ACCOUNT.add(ACCOUNTItem);
        return this;
    }

    /**
     * Get ACCOUNT
     *
     * @return ACCOUNT
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<
                    @Valid
                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsACCOUNTInner>
            getACCOUNT() {
        return ACCOUNT;
    }

    public void setACCOUNT(
            @jakarta.annotation.Nullable
                    List<
                                    @Valid
                                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsACCOUNTInner>
                            ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                portfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators =
                        (PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators) o;
        return Objects.equals(
                        this.BTCUSDT,
                        portfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                                .BTCUSDT)
                && Objects.equals(
                        this.ACCOUNT,
                        portfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                                .ACCOUNT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BTCUSDT, ACCOUNT);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
                "class PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators {\n");
        sb.append("		BTCUSDT: ").append(toIndentedString(BTCUSDT)).append("\n");
        sb.append("		ACCOUNT: ").append(toIndentedString(ACCOUNT)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object BTCUSDTValue = getBTCUSDT();
        String BTCUSDTValueAsString = "";
        BTCUSDTValueAsString =
                (String)
                        ((Collection) BTCUSDTValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("BTCUSDT=").append(urlEncode(BTCUSDTValueAsString)).append("");
        Object ACCOUNTValue = getACCOUNT();
        String ACCOUNTValueAsString = "";
        ACCOUNTValueAsString =
                (String)
                        ((Collection) ACCOUNTValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("ACCOUNT=").append(urlEncode(ACCOUNTValueAsString)).append("");
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
        openapiFields.add("BTCUSDT");
        openapiFields.add("ACCOUNT");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                    .openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators"
                                    + " is not found in the empty JSON string",
                                PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("BTCUSDT") != null && !jsonObj.get("BTCUSDT").isJsonNull()) {
            JsonArray jsonArrayBTCUSDT = jsonObj.getAsJsonArray("BTCUSDT");
            if (jsonArrayBTCUSDT != null) {
                // ensure the json data is an array
                if (!jsonObj.get("BTCUSDT").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `BTCUSDT` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("BTCUSDT").toString()));
                }

                // validate the optional field `BTCUSDT` (array)
                for (int i = 0; i < jsonArrayBTCUSDT.size(); i++) {
                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsBTCUSDTInner
                            .validateJsonElement(jsonArrayBTCUSDT.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("ACCOUNT") != null && !jsonObj.get("ACCOUNT").isJsonNull()) {
            JsonArray jsonArrayACCOUNT = jsonObj.getAsJsonArray("ACCOUNT");
            if (jsonArrayACCOUNT != null) {
                // ensure the json data is an array
                if (!jsonObj.get("ACCOUNT").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `ACCOUNT` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("ACCOUNT").toString()));
                }

                // validate the optional field `ACCOUNT` (array)
                for (int i = 0; i < jsonArrayACCOUNT.size(); i++) {
                    PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicatorsACCOUNTInner
                            .validateJsonElement(jsonArrayACCOUNT.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators.class
                    .isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes
                // 'PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators>
                    thisAdapter =
                            gson.getDelegateAdapter(
                                    this,
                                    TypeToken.get(
                                            PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                                                    .class));

            return (TypeAdapter<T>)
                    new TypeAdapter<
                            PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                                        value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                                read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
     * given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
     * @throws IOException if the JSON string is invalid with respect to
     *     PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
     */
    public static PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators fromJson(
            String jsonString) throws IOException {
        return JSON.getGson()
                .fromJson(
                        jsonString,
                        PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
                                .class);
    }

    /**
     * Convert an instance of PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponseIndicators
     * to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
