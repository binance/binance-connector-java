/*
 * Binance Derivatives Trading USDS Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading USDS Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.rest.model;

import com.binance.connector.client.derivatives_trading_usds_futures.rest.JSON;
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

/** AccountInformationV3Response */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountInformationV3Response {
    public static final String SERIALIZED_NAME_TOTAL_INITIAL_MARGIN = "totalInitialMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String totalInitialMargin;

    public static final String SERIALIZED_NAME_TOTAL_MAINT_MARGIN = "totalMaintMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_MAINT_MARGIN)
    @jakarta.annotation.Nullable
    private String totalMaintMargin;

    public static final String SERIALIZED_NAME_TOTAL_WALLET_BALANCE = "totalWalletBalance";

    @SerializedName(SERIALIZED_NAME_TOTAL_WALLET_BALANCE)
    @jakarta.annotation.Nullable
    private String totalWalletBalance;

    public static final String SERIALIZED_NAME_TOTAL_UNREALIZED_PROFIT = "totalUnrealizedProfit";

    @SerializedName(SERIALIZED_NAME_TOTAL_UNREALIZED_PROFIT)
    @jakarta.annotation.Nullable
    private String totalUnrealizedProfit;

    public static final String SERIALIZED_NAME_TOTAL_MARGIN_BALANCE = "totalMarginBalance";

    @SerializedName(SERIALIZED_NAME_TOTAL_MARGIN_BALANCE)
    @jakarta.annotation.Nullable
    private String totalMarginBalance;

    public static final String SERIALIZED_NAME_TOTAL_POSITION_INITIAL_MARGIN =
            "totalPositionInitialMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_POSITION_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String totalPositionInitialMargin;

    public static final String SERIALIZED_NAME_TOTAL_OPEN_ORDER_INITIAL_MARGIN =
            "totalOpenOrderInitialMargin";

    @SerializedName(SERIALIZED_NAME_TOTAL_OPEN_ORDER_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String totalOpenOrderInitialMargin;

    public static final String SERIALIZED_NAME_TOTAL_CROSS_WALLET_BALANCE =
            "totalCrossWalletBalance";

    @SerializedName(SERIALIZED_NAME_TOTAL_CROSS_WALLET_BALANCE)
    @jakarta.annotation.Nullable
    private String totalCrossWalletBalance;

    public static final String SERIALIZED_NAME_TOTAL_CROSS_UN_PNL = "totalCrossUnPnl";

    @SerializedName(SERIALIZED_NAME_TOTAL_CROSS_UN_PNL)
    @jakarta.annotation.Nullable
    private String totalCrossUnPnl;

    public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";

    @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
    @jakarta.annotation.Nullable
    private String availableBalance;

    public static final String SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT = "maxWithdrawAmount";

    @SerializedName(SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT)
    @jakarta.annotation.Nullable
    private String maxWithdrawAmount;

    public static final String SERIALIZED_NAME_ASSETS = "assets";

    @SerializedName(SERIALIZED_NAME_ASSETS)
    @jakarta.annotation.Nullable
    private List<@Valid AccountInformationV3ResponseAssetsInner> assets;

    public static final String SERIALIZED_NAME_POSITIONS = "positions";

    @SerializedName(SERIALIZED_NAME_POSITIONS)
    @jakarta.annotation.Nullable
    private List<@Valid AccountInformationV3ResponsePositionsInner> positions;

    public AccountInformationV3Response() {}

    public AccountInformationV3Response totalInitialMargin(
            @jakarta.annotation.Nullable String totalInitialMargin) {
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

    public AccountInformationV3Response totalMaintMargin(
            @jakarta.annotation.Nullable String totalMaintMargin) {
        this.totalMaintMargin = totalMaintMargin;
        return this;
    }

    /**
     * Get totalMaintMargin
     *
     * @return totalMaintMargin
     */
    @jakarta.annotation.Nullable
    public String getTotalMaintMargin() {
        return totalMaintMargin;
    }

    public void setTotalMaintMargin(@jakarta.annotation.Nullable String totalMaintMargin) {
        this.totalMaintMargin = totalMaintMargin;
    }

    public AccountInformationV3Response totalWalletBalance(
            @jakarta.annotation.Nullable String totalWalletBalance) {
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

    public AccountInformationV3Response totalUnrealizedProfit(
            @jakarta.annotation.Nullable String totalUnrealizedProfit) {
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

    public AccountInformationV3Response totalMarginBalance(
            @jakarta.annotation.Nullable String totalMarginBalance) {
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

    public AccountInformationV3Response totalPositionInitialMargin(
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

    public AccountInformationV3Response totalOpenOrderInitialMargin(
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

    public AccountInformationV3Response totalCrossWalletBalance(
            @jakarta.annotation.Nullable String totalCrossWalletBalance) {
        this.totalCrossWalletBalance = totalCrossWalletBalance;
        return this;
    }

    /**
     * Get totalCrossWalletBalance
     *
     * @return totalCrossWalletBalance
     */
    @jakarta.annotation.Nullable
    public String getTotalCrossWalletBalance() {
        return totalCrossWalletBalance;
    }

    public void setTotalCrossWalletBalance(
            @jakarta.annotation.Nullable String totalCrossWalletBalance) {
        this.totalCrossWalletBalance = totalCrossWalletBalance;
    }

    public AccountInformationV3Response totalCrossUnPnl(
            @jakarta.annotation.Nullable String totalCrossUnPnl) {
        this.totalCrossUnPnl = totalCrossUnPnl;
        return this;
    }

    /**
     * Get totalCrossUnPnl
     *
     * @return totalCrossUnPnl
     */
    @jakarta.annotation.Nullable
    public String getTotalCrossUnPnl() {
        return totalCrossUnPnl;
    }

    public void setTotalCrossUnPnl(@jakarta.annotation.Nullable String totalCrossUnPnl) {
        this.totalCrossUnPnl = totalCrossUnPnl;
    }

    public AccountInformationV3Response availableBalance(
            @jakarta.annotation.Nullable String availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }

    /**
     * Get availableBalance
     *
     * @return availableBalance
     */
    @jakarta.annotation.Nullable
    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(@jakarta.annotation.Nullable String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public AccountInformationV3Response maxWithdrawAmount(
            @jakarta.annotation.Nullable String maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
        return this;
    }

    /**
     * Get maxWithdrawAmount
     *
     * @return maxWithdrawAmount
     */
    @jakarta.annotation.Nullable
    public String getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(@jakarta.annotation.Nullable String maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public AccountInformationV3Response assets(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationV3ResponseAssetsInner> assets) {
        this.assets = assets;
        return this;
    }

    public AccountInformationV3Response addAssetsItem(
            AccountInformationV3ResponseAssetsInner assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    /**
     * Get assets
     *
     * @return assets
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid AccountInformationV3ResponseAssetsInner> getAssets() {
        return assets;
    }

    public void setAssets(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationV3ResponseAssetsInner> assets) {
        this.assets = assets;
    }

    public AccountInformationV3Response positions(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationV3ResponsePositionsInner> positions) {
        this.positions = positions;
        return this;
    }

    public AccountInformationV3Response addPositionsItem(
            AccountInformationV3ResponsePositionsInner positionsItem) {
        if (this.positions == null) {
            this.positions = new ArrayList<>();
        }
        this.positions.add(positionsItem);
        return this;
    }

    /**
     * Get positions
     *
     * @return positions
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid AccountInformationV3ResponsePositionsInner> getPositions() {
        return positions;
    }

    public void setPositions(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationV3ResponsePositionsInner> positions) {
        this.positions = positions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountInformationV3Response accountInformationV3Response =
                (AccountInformationV3Response) o;
        return Objects.equals(
                        this.totalInitialMargin, accountInformationV3Response.totalInitialMargin)
                && Objects.equals(
                        this.totalMaintMargin, accountInformationV3Response.totalMaintMargin)
                && Objects.equals(
                        this.totalWalletBalance, accountInformationV3Response.totalWalletBalance)
                && Objects.equals(
                        this.totalUnrealizedProfit,
                        accountInformationV3Response.totalUnrealizedProfit)
                && Objects.equals(
                        this.totalMarginBalance, accountInformationV3Response.totalMarginBalance)
                && Objects.equals(
                        this.totalPositionInitialMargin,
                        accountInformationV3Response.totalPositionInitialMargin)
                && Objects.equals(
                        this.totalOpenOrderInitialMargin,
                        accountInformationV3Response.totalOpenOrderInitialMargin)
                && Objects.equals(
                        this.totalCrossWalletBalance,
                        accountInformationV3Response.totalCrossWalletBalance)
                && Objects.equals(
                        this.totalCrossUnPnl, accountInformationV3Response.totalCrossUnPnl)
                && Objects.equals(
                        this.availableBalance, accountInformationV3Response.availableBalance)
                && Objects.equals(
                        this.maxWithdrawAmount, accountInformationV3Response.maxWithdrawAmount)
                && Objects.equals(this.assets, accountInformationV3Response.assets)
                && Objects.equals(this.positions, accountInformationV3Response.positions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                totalInitialMargin,
                totalMaintMargin,
                totalWalletBalance,
                totalUnrealizedProfit,
                totalMarginBalance,
                totalPositionInitialMargin,
                totalOpenOrderInitialMargin,
                totalCrossWalletBalance,
                totalCrossUnPnl,
                availableBalance,
                maxWithdrawAmount,
                assets,
                positions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountInformationV3Response {\n");
        sb.append("		totalInitialMargin: ")
                .append(toIndentedString(totalInitialMargin))
                .append("\n");
        sb.append("		totalMaintMargin: ").append(toIndentedString(totalMaintMargin)).append("\n");
        sb.append("		totalWalletBalance: ")
                .append(toIndentedString(totalWalletBalance))
                .append("\n");
        sb.append("		totalUnrealizedProfit: ")
                .append(toIndentedString(totalUnrealizedProfit))
                .append("\n");
        sb.append("		totalMarginBalance: ")
                .append(toIndentedString(totalMarginBalance))
                .append("\n");
        sb.append("		totalPositionInitialMargin: ")
                .append(toIndentedString(totalPositionInitialMargin))
                .append("\n");
        sb.append("		totalOpenOrderInitialMargin: ")
                .append(toIndentedString(totalOpenOrderInitialMargin))
                .append("\n");
        sb.append("		totalCrossWalletBalance: ")
                .append(toIndentedString(totalCrossWalletBalance))
                .append("\n");
        sb.append("		totalCrossUnPnl: ").append(toIndentedString(totalCrossUnPnl)).append("\n");
        sb.append("		availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
        sb.append("		maxWithdrawAmount: ").append(toIndentedString(maxWithdrawAmount)).append("\n");
        sb.append("		assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("		positions: ").append(toIndentedString(positions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object totalInitialMarginValue = getTotalInitialMargin();
        String totalInitialMarginValueAsString = "";
        totalInitialMarginValueAsString = totalInitialMarginValue.toString();
        sb.append("totalInitialMargin=")
                .append(urlEncode(totalInitialMarginValueAsString))
                .append("");
        Object totalMaintMarginValue = getTotalMaintMargin();
        String totalMaintMarginValueAsString = "";
        totalMaintMarginValueAsString = totalMaintMarginValue.toString();
        sb.append("totalMaintMargin=").append(urlEncode(totalMaintMarginValueAsString)).append("");
        Object totalWalletBalanceValue = getTotalWalletBalance();
        String totalWalletBalanceValueAsString = "";
        totalWalletBalanceValueAsString = totalWalletBalanceValue.toString();
        sb.append("totalWalletBalance=")
                .append(urlEncode(totalWalletBalanceValueAsString))
                .append("");
        Object totalUnrealizedProfitValue = getTotalUnrealizedProfit();
        String totalUnrealizedProfitValueAsString = "";
        totalUnrealizedProfitValueAsString = totalUnrealizedProfitValue.toString();
        sb.append("totalUnrealizedProfit=")
                .append(urlEncode(totalUnrealizedProfitValueAsString))
                .append("");
        Object totalMarginBalanceValue = getTotalMarginBalance();
        String totalMarginBalanceValueAsString = "";
        totalMarginBalanceValueAsString = totalMarginBalanceValue.toString();
        sb.append("totalMarginBalance=")
                .append(urlEncode(totalMarginBalanceValueAsString))
                .append("");
        Object totalPositionInitialMarginValue = getTotalPositionInitialMargin();
        String totalPositionInitialMarginValueAsString = "";
        totalPositionInitialMarginValueAsString = totalPositionInitialMarginValue.toString();
        sb.append("totalPositionInitialMargin=")
                .append(urlEncode(totalPositionInitialMarginValueAsString))
                .append("");
        Object totalOpenOrderInitialMarginValue = getTotalOpenOrderInitialMargin();
        String totalOpenOrderInitialMarginValueAsString = "";
        totalOpenOrderInitialMarginValueAsString = totalOpenOrderInitialMarginValue.toString();
        sb.append("totalOpenOrderInitialMargin=")
                .append(urlEncode(totalOpenOrderInitialMarginValueAsString))
                .append("");
        Object totalCrossWalletBalanceValue = getTotalCrossWalletBalance();
        String totalCrossWalletBalanceValueAsString = "";
        totalCrossWalletBalanceValueAsString = totalCrossWalletBalanceValue.toString();
        sb.append("totalCrossWalletBalance=")
                .append(urlEncode(totalCrossWalletBalanceValueAsString))
                .append("");
        Object totalCrossUnPnlValue = getTotalCrossUnPnl();
        String totalCrossUnPnlValueAsString = "";
        totalCrossUnPnlValueAsString = totalCrossUnPnlValue.toString();
        sb.append("totalCrossUnPnl=").append(urlEncode(totalCrossUnPnlValueAsString)).append("");
        Object availableBalanceValue = getAvailableBalance();
        String availableBalanceValueAsString = "";
        availableBalanceValueAsString = availableBalanceValue.toString();
        sb.append("availableBalance=").append(urlEncode(availableBalanceValueAsString)).append("");
        Object maxWithdrawAmountValue = getMaxWithdrawAmount();
        String maxWithdrawAmountValueAsString = "";
        maxWithdrawAmountValueAsString = maxWithdrawAmountValue.toString();
        sb.append("maxWithdrawAmount=")
                .append(urlEncode(maxWithdrawAmountValueAsString))
                .append("");
        Object assetsValue = getAssets();
        String assetsValueAsString = "";
        assetsValueAsString =
                (String)
                        ((Collection) assetsValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("assets=").append(urlEncode(assetsValueAsString)).append("");
        Object positionsValue = getPositions();
        String positionsValueAsString = "";
        positionsValueAsString =
                (String)
                        ((Collection) positionsValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("positions=").append(urlEncode(positionsValueAsString)).append("");
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
        openapiFields.add("totalInitialMargin");
        openapiFields.add("totalMaintMargin");
        openapiFields.add("totalWalletBalance");
        openapiFields.add("totalUnrealizedProfit");
        openapiFields.add("totalMarginBalance");
        openapiFields.add("totalPositionInitialMargin");
        openapiFields.add("totalOpenOrderInitialMargin");
        openapiFields.add("totalCrossWalletBalance");
        openapiFields.add("totalCrossUnPnl");
        openapiFields.add("availableBalance");
        openapiFields.add("maxWithdrawAmount");
        openapiFields.add("assets");
        openapiFields.add("positions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AccountInformationV3Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountInformationV3Response.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccountInformationV3Response is not"
                                        + " found in the empty JSON string",
                                AccountInformationV3Response.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("totalInitialMargin") != null
                        && !jsonObj.get("totalInitialMargin").isJsonNull())
                && !jsonObj.get("totalInitialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalInitialMargin` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalInitialMargin").toString()));
        }
        if ((jsonObj.get("totalMaintMargin") != null
                        && !jsonObj.get("totalMaintMargin").isJsonNull())
                && !jsonObj.get("totalMaintMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalMaintMargin` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalMaintMargin").toString()));
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
        if ((jsonObj.get("totalUnrealizedProfit") != null
                        && !jsonObj.get("totalUnrealizedProfit").isJsonNull())
                && !jsonObj.get("totalUnrealizedProfit").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalUnrealizedProfit` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("totalUnrealizedProfit").toString()));
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
        if ((jsonObj.get("totalPositionInitialMargin") != null
                        && !jsonObj.get("totalPositionInitialMargin").isJsonNull())
                && !jsonObj.get("totalPositionInitialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalPositionInitialMargin` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("totalPositionInitialMargin").toString()));
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
        if ((jsonObj.get("totalCrossWalletBalance") != null
                        && !jsonObj.get("totalCrossWalletBalance").isJsonNull())
                && !jsonObj.get("totalCrossWalletBalance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalCrossWalletBalance` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("totalCrossWalletBalance").toString()));
        }
        if ((jsonObj.get("totalCrossUnPnl") != null && !jsonObj.get("totalCrossUnPnl").isJsonNull())
                && !jsonObj.get("totalCrossUnPnl").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalCrossUnPnl` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalCrossUnPnl").toString()));
        }
        if ((jsonObj.get("availableBalance") != null
                        && !jsonObj.get("availableBalance").isJsonNull())
                && !jsonObj.get("availableBalance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `availableBalance` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("availableBalance").toString()));
        }
        if ((jsonObj.get("maxWithdrawAmount") != null
                        && !jsonObj.get("maxWithdrawAmount").isJsonNull())
                && !jsonObj.get("maxWithdrawAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `maxWithdrawAmount` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("maxWithdrawAmount").toString()));
        }
        if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
            JsonArray jsonArrayassets = jsonObj.getAsJsonArray("assets");
            if (jsonArrayassets != null) {
                // ensure the json data is an array
                if (!jsonObj.get("assets").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `assets` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("assets").toString()));
                }

                // validate the optional field `assets` (array)
                for (int i = 0; i < jsonArrayassets.size(); i++) {
                    AccountInformationV3ResponseAssetsInner.validateJsonElement(
                            jsonArrayassets.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("positions") != null && !jsonObj.get("positions").isJsonNull()) {
            JsonArray jsonArraypositions = jsonObj.getAsJsonArray("positions");
            if (jsonArraypositions != null) {
                // ensure the json data is an array
                if (!jsonObj.get("positions").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `positions` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("positions").toString()));
                }

                // validate the optional field `positions` (array)
                for (int i = 0; i < jsonArraypositions.size(); i++) {
                    AccountInformationV3ResponsePositionsInner.validateJsonElement(
                            jsonArraypositions.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccountInformationV3Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccountInformationV3Response' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountInformationV3Response> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AccountInformationV3Response.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountInformationV3Response>() {
                        @Override
                        public void write(JsonWriter out, AccountInformationV3Response value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountInformationV3Response read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountInformationV3Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountInformationV3Response
     * @throws IOException if the JSON string is invalid with respect to
     *     AccountInformationV3Response
     */
    public static AccountInformationV3Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccountInformationV3Response.class);
    }

    /**
     * Convert an instance of AccountInformationV3Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
