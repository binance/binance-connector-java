/*
 * Binance Sub Account REST API
 * OpenAPI Specification for the Binance Sub Account REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.sub_account.rest.model;

import com.binance.connector.client.sub_account.rest.JSON;
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

/** GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public
class GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner {
    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @jakarta.annotation.Nullable
    private String email;

    public static final String SERIALIZED_NAME_TOTAL_INITIAL_MARGIN = "totalInitialMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String totalInitialMargin;

    public static final String SERIALIZED_NAME_TOTAL_MAINTENANCE_MARGIN = "totalMaintenanceMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_MAINTENANCE_MARGIN)
    @jakarta.annotation.Nullable
    private String totalMaintenanceMargin;

    public static final String SERIALIZED_NAME_TOTAL_MARGIN_BALANCE = "totalMarginBalance";

    @SerializedName(SERIALIZED_NAME_TOTAL_MARGIN_BALANCE)
    @jakarta.annotation.Nullable
    private String totalMarginBalance;

    public static final String SERIALIZED_NAME_TOTAL_OPEN_ORDER_INITIAL_MARGIN =
            "totalOpenOrderInitialMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_OPEN_ORDER_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String totalOpenOrderInitialMargin;

    public static final String SERIALIZED_NAME_TOTAL_POSITION_INITIAL_MARGIN =
            "totalPositionInitialMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_POSITION_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String totalPositionInitialMargin;

    public static final String SERIALIZED_NAME_TOTAL_UNREALIZED_PROFIT = "totalUnrealizedProfit";

    @SerializedName(SERIALIZED_NAME_TOTAL_UNREALIZED_PROFIT)
    @jakarta.annotation.Nullable
    private String totalUnrealizedProfit;

    public static final String SERIALIZED_NAME_TOTAL_WALLET_BALANCE = "totalWalletBalance";

    @SerializedName(SERIALIZED_NAME_TOTAL_WALLET_BALANCE)
    @jakarta.annotation.Nullable
    private String totalWalletBalance;

    public static final String SERIALIZED_NAME_ASSET = "asset";

    @SerializedName(SERIALIZED_NAME_ASSET)
    @jakarta.annotation.Nullable
    private String asset;

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner() {}

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            email(@jakarta.annotation.Nullable String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@jakarta.annotation.Nullable String email) {
        this.email = email;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            totalInitialMargin(@jakarta.annotation.Nullable String totalInitialMargin) {
        this.totalInitialMargin = totalInitialMargin;
        return this;
    }

    /**
     * Get totalInitialMargin
     *
     * @return totalInitialMargin
     */
    @jakarta.annotation.Nullable
    public String getTotalInitialMargin() {
        return totalInitialMargin;
    }

    public void setTotalInitialMargin(@jakarta.annotation.Nullable String totalInitialMargin) {
        this.totalInitialMargin = totalInitialMargin;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            totalMaintenanceMargin(@jakarta.annotation.Nullable String totalMaintenanceMargin) {
        this.totalMaintenanceMargin = totalMaintenanceMargin;
        return this;
    }

    /**
     * Get totalMaintenanceMargin
     *
     * @return totalMaintenanceMargin
     */
    @jakarta.annotation.Nullable
    public String getTotalMaintenanceMargin() {
        return totalMaintenanceMargin;
    }

    public void setTotalMaintenanceMargin(
            @jakarta.annotation.Nullable String totalMaintenanceMargin) {
        this.totalMaintenanceMargin = totalMaintenanceMargin;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            totalMarginBalance(@jakarta.annotation.Nullable String totalMarginBalance) {
        this.totalMarginBalance = totalMarginBalance;
        return this;
    }

    /**
     * Get totalMarginBalance
     *
     * @return totalMarginBalance
     */
    @jakarta.annotation.Nullable
    public String getTotalMarginBalance() {
        return totalMarginBalance;
    }

    public void setTotalMarginBalance(@jakarta.annotation.Nullable String totalMarginBalance) {
        this.totalMarginBalance = totalMarginBalance;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            totalOpenOrderInitialMargin(
                    @jakarta.annotation.Nullable String totalOpenOrderInitialMargin) {
        this.totalOpenOrderInitialMargin = totalOpenOrderInitialMargin;
        return this;
    }

    /**
     * Get totalOpenOrderInitialMargin
     *
     * @return totalOpenOrderInitialMargin
     */
    @jakarta.annotation.Nullable
    public String getTotalOpenOrderInitialMargin() {
        return totalOpenOrderInitialMargin;
    }

    public void setTotalOpenOrderInitialMargin(
            @jakarta.annotation.Nullable String totalOpenOrderInitialMargin) {
        this.totalOpenOrderInitialMargin = totalOpenOrderInitialMargin;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            totalPositionInitialMargin(
                    @jakarta.annotation.Nullable String totalPositionInitialMargin) {
        this.totalPositionInitialMargin = totalPositionInitialMargin;
        return this;
    }

    /**
     * Get totalPositionInitialMargin
     *
     * @return totalPositionInitialMargin
     */
    @jakarta.annotation.Nullable
    public String getTotalPositionInitialMargin() {
        return totalPositionInitialMargin;
    }

    public void setTotalPositionInitialMargin(
            @jakarta.annotation.Nullable String totalPositionInitialMargin) {
        this.totalPositionInitialMargin = totalPositionInitialMargin;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            totalUnrealizedProfit(@jakarta.annotation.Nullable String totalUnrealizedProfit) {
        this.totalUnrealizedProfit = totalUnrealizedProfit;
        return this;
    }

    /**
     * Get totalUnrealizedProfit
     *
     * @return totalUnrealizedProfit
     */
    @jakarta.annotation.Nullable
    public String getTotalUnrealizedProfit() {
        return totalUnrealizedProfit;
    }

    public void setTotalUnrealizedProfit(
            @jakarta.annotation.Nullable String totalUnrealizedProfit) {
        this.totalUnrealizedProfit = totalUnrealizedProfit;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            totalWalletBalance(@jakarta.annotation.Nullable String totalWalletBalance) {
        this.totalWalletBalance = totalWalletBalance;
        return this;
    }

    /**
     * Get totalWalletBalance
     *
     * @return totalWalletBalance
     */
    @jakarta.annotation.Nullable
    public String getTotalWalletBalance() {
        return totalWalletBalance;
    }

    public void setTotalWalletBalance(@jakarta.annotation.Nullable String totalWalletBalance) {
        this.totalWalletBalance = totalWalletBalance;
    }

    public
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            asset(@jakarta.annotation.Nullable String asset) {
        this.asset = asset;
        return this;
    }

    /**
     * Get asset
     *
     * @return asset
     */
    @jakarta.annotation.Nullable
    public String getAsset() {
        return asset;
    }

    public void setAsset(@jakarta.annotation.Nullable String asset) {
        this.asset = asset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner =
                        (GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner)
                                o;
        return Objects.equals(
                        this.email,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .email)
                && Objects.equals(
                        this.totalInitialMargin,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .totalInitialMargin)
                && Objects.equals(
                        this.totalMaintenanceMargin,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .totalMaintenanceMargin)
                && Objects.equals(
                        this.totalMarginBalance,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .totalMarginBalance)
                && Objects.equals(
                        this.totalOpenOrderInitialMargin,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .totalOpenOrderInitialMargin)
                && Objects.equals(
                        this.totalPositionInitialMargin,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .totalPositionInitialMargin)
                && Objects.equals(
                        this.totalUnrealizedProfit,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .totalUnrealizedProfit)
                && Objects.equals(
                        this.totalWalletBalance,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .totalWalletBalance)
                && Objects.equals(
                        this.asset,
                        getSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .asset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                email,
                totalInitialMargin,
                totalMaintenanceMargin,
                totalMarginBalance,
                totalOpenOrderInitialMargin,
                totalPositionInitialMargin,
                totalUnrealizedProfit,
                totalWalletBalance,
                asset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
                "class"
                    + " GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner"
                    + " {\n");
        sb.append("		email: ").append(toIndentedString(email)).append("\n");
        sb.append("		totalInitialMargin: ")
                .append(toIndentedString(totalInitialMargin))
                .append("\n");
        sb.append("		totalMaintenanceMargin: ")
                .append(toIndentedString(totalMaintenanceMargin))
                .append("\n");
        sb.append("		totalMarginBalance: ")
                .append(toIndentedString(totalMarginBalance))
                .append("\n");
        sb.append("		totalOpenOrderInitialMargin: ")
                .append(toIndentedString(totalOpenOrderInitialMargin))
                .append("\n");
        sb.append("		totalPositionInitialMargin: ")
                .append(toIndentedString(totalPositionInitialMargin))
                .append("\n");
        sb.append("		totalUnrealizedProfit: ")
                .append(toIndentedString(totalUnrealizedProfit))
                .append("\n");
        sb.append("		totalWalletBalance: ")
                .append(toIndentedString(totalWalletBalance))
                .append("\n");
        sb.append("		asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object emailValue = getEmail();
        String emailValueAsString = "";
        emailValueAsString = emailValue.toString();
        sb.append("email=").append(urlEncode(emailValueAsString)).append("");
        Object totalInitialMarginValue = getTotalInitialMargin();
        String totalInitialMarginValueAsString = "";
        totalInitialMarginValueAsString = totalInitialMarginValue.toString();
        sb.append("totalInitialMargin=")
                .append(urlEncode(totalInitialMarginValueAsString))
                .append("");
        Object totalMaintenanceMarginValue = getTotalMaintenanceMargin();
        String totalMaintenanceMarginValueAsString = "";
        totalMaintenanceMarginValueAsString = totalMaintenanceMarginValue.toString();
        sb.append("totalMaintenanceMargin=")
                .append(urlEncode(totalMaintenanceMarginValueAsString))
                .append("");
        Object totalMarginBalanceValue = getTotalMarginBalance();
        String totalMarginBalanceValueAsString = "";
        totalMarginBalanceValueAsString = totalMarginBalanceValue.toString();
        sb.append("totalMarginBalance=")
                .append(urlEncode(totalMarginBalanceValueAsString))
                .append("");
        Object totalOpenOrderInitialMarginValue = getTotalOpenOrderInitialMargin();
        String totalOpenOrderInitialMarginValueAsString = "";
        totalOpenOrderInitialMarginValueAsString = totalOpenOrderInitialMarginValue.toString();
        sb.append("totalOpenOrderInitialMargin=")
                .append(urlEncode(totalOpenOrderInitialMarginValueAsString))
                .append("");
        Object totalPositionInitialMarginValue = getTotalPositionInitialMargin();
        String totalPositionInitialMarginValueAsString = "";
        totalPositionInitialMarginValueAsString = totalPositionInitialMarginValue.toString();
        sb.append("totalPositionInitialMargin=")
                .append(urlEncode(totalPositionInitialMarginValueAsString))
                .append("");
        Object totalUnrealizedProfitValue = getTotalUnrealizedProfit();
        String totalUnrealizedProfitValueAsString = "";
        totalUnrealizedProfitValueAsString = totalUnrealizedProfitValue.toString();
        sb.append("totalUnrealizedProfit=")
                .append(urlEncode(totalUnrealizedProfitValueAsString))
                .append("");
        Object totalWalletBalanceValue = getTotalWalletBalance();
        String totalWalletBalanceValueAsString = "";
        totalWalletBalanceValueAsString = totalWalletBalanceValue.toString();
        sb.append("totalWalletBalance=")
                .append(urlEncode(totalWalletBalanceValueAsString))
                .append("");
        Object assetValue = getAsset();
        String assetValueAsString = "";
        assetValueAsString = assetValue.toString();
        sb.append("asset=").append(urlEncode(assetValueAsString)).append("");
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
        openapiFields.add("email");
        openapiFields.add("totalInitialMargin");
        openapiFields.add("totalMaintenanceMargin");
        openapiFields.add("totalMarginBalance");
        openapiFields.add("totalOpenOrderInitialMargin");
        openapiFields.add("totalPositionInitialMargin");
        openapiFields.add("totalUnrealizedProfit");
        openapiFields.add("totalWalletBalance");
        openapiFields.add("asset");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                    .openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner"
                                    + " is not found in the empty JSON string",
                                GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
                && !jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
        }
        if ((jsonObj.get("totalInitialMargin") != null
                        && !jsonObj.get("totalInitialMargin").isJsonNull())
                && !jsonObj.get("totalInitialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalInitialMargin` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalInitialMargin").toString()));
        }
        if ((jsonObj.get("totalMaintenanceMargin") != null
                        && !jsonObj.get("totalMaintenanceMargin").isJsonNull())
                && !jsonObj.get("totalMaintenanceMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalMaintenanceMargin` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("totalMaintenanceMargin").toString()));
        }
        if ((jsonObj.get("totalMarginBalance") != null
                        && !jsonObj.get("totalMarginBalance").isJsonNull())
                && !jsonObj.get("totalMarginBalance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalMarginBalance` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalMarginBalance").toString()));
        }
        if ((jsonObj.get("totalOpenOrderInitialMargin") != null
                        && !jsonObj.get("totalOpenOrderInitialMargin").isJsonNull())
                && !jsonObj.get("totalOpenOrderInitialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalOpenOrderInitialMargin` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("totalOpenOrderInitialMargin").toString()));
        }
        if ((jsonObj.get("totalPositionInitialMargin") != null
                        && !jsonObj.get("totalPositionInitialMargin").isJsonNull())
                && !jsonObj.get("totalPositionInitialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalPositionInitialMargin` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("totalPositionInitialMargin").toString()));
        }
        if ((jsonObj.get("totalUnrealizedProfit") != null
                        && !jsonObj.get("totalUnrealizedProfit").isJsonNull())
                && !jsonObj.get("totalUnrealizedProfit").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalUnrealizedProfit` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("totalUnrealizedProfit").toString()));
        }
        if ((jsonObj.get("totalWalletBalance") != null
                        && !jsonObj.get("totalWalletBalance").isJsonNull())
                && !jsonObj.get("totalWalletBalance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalWalletBalance` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalWalletBalance").toString()));
        }
        if ((jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonNull())
                && !jsonObj.get("asset").isJsonPrimitive()) {
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
            if (!GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                    .class
                    .isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes
                // 'GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<
                            GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner>
                    thisAdapter =
                            gson.getDelegateAdapter(
                                    this,
                                    TypeToken.get(
                                            GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                                    .class));

            return (TypeAdapter<T>)
                    new TypeAdapter<
                            GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                        value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public
                        GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of
     * GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
     * given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of
     *     GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
     * @throws IOException if the JSON string is invalid with respect to
     *     GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
     */
    public static
    GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
            fromJson(String jsonString) throws IOException {
        return JSON.getGson()
                .fromJson(
                        jsonString,
                        GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner
                                .class);
    }

    /**
     * Convert an instance of
     * GetSummaryOfSubAccountsFuturesAccountV2ResponseFutureAccountSummaryRespSubAccountListInner to
     * an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
