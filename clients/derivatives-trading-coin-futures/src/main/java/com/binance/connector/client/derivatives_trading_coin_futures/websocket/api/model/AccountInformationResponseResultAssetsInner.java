/*
 * Binance Derivatives Trading COIN Futures WebSocket API
 * OpenAPI Specification for the Binance Derivatives Trading COIN Futures WebSocket API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.api.JSON;
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

/** AccountInformationResponseResultAssetsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountInformationResponseResultAssetsInner extends BaseDTO {
    public static final String SERIALIZED_NAME_ASSET = "asset";

    @SerializedName(SERIALIZED_NAME_ASSET)
    @jakarta.annotation.Nullable
    private String asset;

    public static final String SERIALIZED_NAME_WALLET_BALANCE = "walletBalance";

    @SerializedName(SERIALIZED_NAME_WALLET_BALANCE)
    @jakarta.annotation.Nullable
    private String walletBalance;

    public static final String SERIALIZED_NAME_UNREALIZED_PROFIT = "unrealizedProfit";

    @SerializedName(SERIALIZED_NAME_UNREALIZED_PROFIT)
    @jakarta.annotation.Nullable
    private String unrealizedProfit;

    public static final String SERIALIZED_NAME_MARGIN_BALANCE = "marginBalance";

    @SerializedName(SERIALIZED_NAME_MARGIN_BALANCE)
    @jakarta.annotation.Nullable
    private String marginBalance;

    public static final String SERIALIZED_NAME_MAINT_MARGIN = "maintMargin";

    @SerializedName(SERIALIZED_NAME_MAINT_MARGIN)
    @jakarta.annotation.Nullable
    private String maintMargin;

    public static final String SERIALIZED_NAME_INITIAL_MARGIN = "initialMargin";

    @SerializedName(SERIALIZED_NAME_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String initialMargin;

    public static final String SERIALIZED_NAME_POSITION_INITIAL_MARGIN = "positionInitialMargin";

    @SerializedName(SERIALIZED_NAME_POSITION_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String positionInitialMargin;

    public static final String SERIALIZED_NAME_OPEN_ORDER_INITIAL_MARGIN = "openOrderInitialMargin";

    @SerializedName(SERIALIZED_NAME_OPEN_ORDER_INITIAL_MARGIN)
    @jakarta.annotation.Nullable
    private String openOrderInitialMargin;

    public static final String SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT = "maxWithdrawAmount";

    @SerializedName(SERIALIZED_NAME_MAX_WITHDRAW_AMOUNT)
    @jakarta.annotation.Nullable
    private String maxWithdrawAmount;

    public static final String SERIALIZED_NAME_CROSS_WALLET_BALANCE = "crossWalletBalance";

    @SerializedName(SERIALIZED_NAME_CROSS_WALLET_BALANCE)
    @jakarta.annotation.Nullable
    private String crossWalletBalance;

    public static final String SERIALIZED_NAME_CROSS_UN_PNL = "crossUnPnl";

    @SerializedName(SERIALIZED_NAME_CROSS_UN_PNL)
    @jakarta.annotation.Nullable
    private String crossUnPnl;

    public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";

    @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
    @jakarta.annotation.Nullable
    private String availableBalance;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public AccountInformationResponseResultAssetsInner() {}

    public AccountInformationResponseResultAssetsInner asset(
            @jakarta.annotation.Nullable String asset) {
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

    public AccountInformationResponseResultAssetsInner walletBalance(
            @jakarta.annotation.Nullable String walletBalance) {
        this.walletBalance = walletBalance;
        return this;
    }

    /**
     * Get walletBalance
     *
     * @return walletBalance
     */
    @jakarta.annotation.Nullable
    public String getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(@jakarta.annotation.Nullable String walletBalance) {
        this.walletBalance = walletBalance;
    }

    public AccountInformationResponseResultAssetsInner unrealizedProfit(
            @jakarta.annotation.Nullable String unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
        return this;
    }

    /**
     * Get unrealizedProfit
     *
     * @return unrealizedProfit
     */
    @jakarta.annotation.Nullable
    public String getUnrealizedProfit() {
        return unrealizedProfit;
    }

    public void setUnrealizedProfit(@jakarta.annotation.Nullable String unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
    }

    public AccountInformationResponseResultAssetsInner marginBalance(
            @jakarta.annotation.Nullable String marginBalance) {
        this.marginBalance = marginBalance;
        return this;
    }

    /**
     * Get marginBalance
     *
     * @return marginBalance
     */
    @jakarta.annotation.Nullable
    public String getMarginBalance() {
        return marginBalance;
    }

    public void setMarginBalance(@jakarta.annotation.Nullable String marginBalance) {
        this.marginBalance = marginBalance;
    }

    public AccountInformationResponseResultAssetsInner maintMargin(
            @jakarta.annotation.Nullable String maintMargin) {
        this.maintMargin = maintMargin;
        return this;
    }

    /**
     * Get maintMargin
     *
     * @return maintMargin
     */
    @jakarta.annotation.Nullable
    public String getMaintMargin() {
        return maintMargin;
    }

    public void setMaintMargin(@jakarta.annotation.Nullable String maintMargin) {
        this.maintMargin = maintMargin;
    }

    public AccountInformationResponseResultAssetsInner initialMargin(
            @jakarta.annotation.Nullable String initialMargin) {
        this.initialMargin = initialMargin;
        return this;
    }

    /**
     * Get initialMargin
     *
     * @return initialMargin
     */
    @jakarta.annotation.Nullable
    public String getInitialMargin() {
        return initialMargin;
    }

    public void setInitialMargin(@jakarta.annotation.Nullable String initialMargin) {
        this.initialMargin = initialMargin;
    }

    public AccountInformationResponseResultAssetsInner positionInitialMargin(
            @jakarta.annotation.Nullable String positionInitialMargin) {
        this.positionInitialMargin = positionInitialMargin;
        return this;
    }

    /**
     * Get positionInitialMargin
     *
     * @return positionInitialMargin
     */
    @jakarta.annotation.Nullable
    public String getPositionInitialMargin() {
        return positionInitialMargin;
    }

    public void setPositionInitialMargin(
            @jakarta.annotation.Nullable String positionInitialMargin) {
        this.positionInitialMargin = positionInitialMargin;
    }

    public AccountInformationResponseResultAssetsInner openOrderInitialMargin(
            @jakarta.annotation.Nullable String openOrderInitialMargin) {
        this.openOrderInitialMargin = openOrderInitialMargin;
        return this;
    }

    /**
     * Get openOrderInitialMargin
     *
     * @return openOrderInitialMargin
     */
    @jakarta.annotation.Nullable
    public String getOpenOrderInitialMargin() {
        return openOrderInitialMargin;
    }

    public void setOpenOrderInitialMargin(
            @jakarta.annotation.Nullable String openOrderInitialMargin) {
        this.openOrderInitialMargin = openOrderInitialMargin;
    }

    public AccountInformationResponseResultAssetsInner maxWithdrawAmount(
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

    public AccountInformationResponseResultAssetsInner crossWalletBalance(
            @jakarta.annotation.Nullable String crossWalletBalance) {
        this.crossWalletBalance = crossWalletBalance;
        return this;
    }

    /**
     * Get crossWalletBalance
     *
     * @return crossWalletBalance
     */
    @jakarta.annotation.Nullable
    public String getCrossWalletBalance() {
        return crossWalletBalance;
    }

    public void setCrossWalletBalance(@jakarta.annotation.Nullable String crossWalletBalance) {
        this.crossWalletBalance = crossWalletBalance;
    }

    public AccountInformationResponseResultAssetsInner crossUnPnl(
            @jakarta.annotation.Nullable String crossUnPnl) {
        this.crossUnPnl = crossUnPnl;
        return this;
    }

    /**
     * Get crossUnPnl
     *
     * @return crossUnPnl
     */
    @jakarta.annotation.Nullable
    public String getCrossUnPnl() {
        return crossUnPnl;
    }

    public void setCrossUnPnl(@jakarta.annotation.Nullable String crossUnPnl) {
        this.crossUnPnl = crossUnPnl;
    }

    public AccountInformationResponseResultAssetsInner availableBalance(
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

    public AccountInformationResponseResultAssetsInner updateTime(
            @jakarta.annotation.Nullable Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     */
    @jakarta.annotation.Nullable
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(@jakarta.annotation.Nullable Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountInformationResponseResultAssetsInner accountInformationResponseResultAssetsInner =
                (AccountInformationResponseResultAssetsInner) o;
        return Objects.equals(this.asset, accountInformationResponseResultAssetsInner.asset)
                && Objects.equals(
                        this.walletBalance,
                        accountInformationResponseResultAssetsInner.walletBalance)
                && Objects.equals(
                        this.unrealizedProfit,
                        accountInformationResponseResultAssetsInner.unrealizedProfit)
                && Objects.equals(
                        this.marginBalance,
                        accountInformationResponseResultAssetsInner.marginBalance)
                && Objects.equals(
                        this.maintMargin, accountInformationResponseResultAssetsInner.maintMargin)
                && Objects.equals(
                        this.initialMargin,
                        accountInformationResponseResultAssetsInner.initialMargin)
                && Objects.equals(
                        this.positionInitialMargin,
                        accountInformationResponseResultAssetsInner.positionInitialMargin)
                && Objects.equals(
                        this.openOrderInitialMargin,
                        accountInformationResponseResultAssetsInner.openOrderInitialMargin)
                && Objects.equals(
                        this.maxWithdrawAmount,
                        accountInformationResponseResultAssetsInner.maxWithdrawAmount)
                && Objects.equals(
                        this.crossWalletBalance,
                        accountInformationResponseResultAssetsInner.crossWalletBalance)
                && Objects.equals(
                        this.crossUnPnl, accountInformationResponseResultAssetsInner.crossUnPnl)
                && Objects.equals(
                        this.availableBalance,
                        accountInformationResponseResultAssetsInner.availableBalance)
                && Objects.equals(
                        this.updateTime, accountInformationResponseResultAssetsInner.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                asset,
                walletBalance,
                unrealizedProfit,
                marginBalance,
                maintMargin,
                initialMargin,
                positionInitialMargin,
                openOrderInitialMargin,
                maxWithdrawAmount,
                crossWalletBalance,
                crossUnPnl,
                availableBalance,
                updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountInformationResponseResultAssetsInner {\n");
        sb.append("		asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("		walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
        sb.append("		unrealizedProfit: ").append(toIndentedString(unrealizedProfit)).append("\n");
        sb.append("		marginBalance: ").append(toIndentedString(marginBalance)).append("\n");
        sb.append("		maintMargin: ").append(toIndentedString(maintMargin)).append("\n");
        sb.append("		initialMargin: ").append(toIndentedString(initialMargin)).append("\n");
        sb.append("		positionInitialMargin: ")
                .append(toIndentedString(positionInitialMargin))
                .append("\n");
        sb.append("		openOrderInitialMargin: ")
                .append(toIndentedString(openOrderInitialMargin))
                .append("\n");
        sb.append("		maxWithdrawAmount: ").append(toIndentedString(maxWithdrawAmount)).append("\n");
        sb.append("		crossWalletBalance: ")
                .append(toIndentedString(crossWalletBalance))
                .append("\n");
        sb.append("		crossUnPnl: ").append(toIndentedString(crossUnPnl)).append("\n");
        sb.append("		availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
        sb.append("		updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String assetValue = getAsset();
        if (assetValue != null) {
            String assetValueAsString = assetValue.toString();
            valMap.put("asset", assetValueAsString);
        }
        String walletBalanceValue = getWalletBalance();
        if (walletBalanceValue != null) {
            String walletBalanceValueAsString = walletBalanceValue.toString();
            valMap.put("walletBalance", walletBalanceValueAsString);
        }
        String unrealizedProfitValue = getUnrealizedProfit();
        if (unrealizedProfitValue != null) {
            String unrealizedProfitValueAsString = unrealizedProfitValue.toString();
            valMap.put("unrealizedProfit", unrealizedProfitValueAsString);
        }
        String marginBalanceValue = getMarginBalance();
        if (marginBalanceValue != null) {
            String marginBalanceValueAsString = marginBalanceValue.toString();
            valMap.put("marginBalance", marginBalanceValueAsString);
        }
        String maintMarginValue = getMaintMargin();
        if (maintMarginValue != null) {
            String maintMarginValueAsString = maintMarginValue.toString();
            valMap.put("maintMargin", maintMarginValueAsString);
        }
        String initialMarginValue = getInitialMargin();
        if (initialMarginValue != null) {
            String initialMarginValueAsString = initialMarginValue.toString();
            valMap.put("initialMargin", initialMarginValueAsString);
        }
        String positionInitialMarginValue = getPositionInitialMargin();
        if (positionInitialMarginValue != null) {
            String positionInitialMarginValueAsString = positionInitialMarginValue.toString();
            valMap.put("positionInitialMargin", positionInitialMarginValueAsString);
        }
        String openOrderInitialMarginValue = getOpenOrderInitialMargin();
        if (openOrderInitialMarginValue != null) {
            String openOrderInitialMarginValueAsString = openOrderInitialMarginValue.toString();
            valMap.put("openOrderInitialMargin", openOrderInitialMarginValueAsString);
        }
        String maxWithdrawAmountValue = getMaxWithdrawAmount();
        if (maxWithdrawAmountValue != null) {
            String maxWithdrawAmountValueAsString = maxWithdrawAmountValue.toString();
            valMap.put("maxWithdrawAmount", maxWithdrawAmountValueAsString);
        }
        String crossWalletBalanceValue = getCrossWalletBalance();
        if (crossWalletBalanceValue != null) {
            String crossWalletBalanceValueAsString = crossWalletBalanceValue.toString();
            valMap.put("crossWalletBalance", crossWalletBalanceValueAsString);
        }
        String crossUnPnlValue = getCrossUnPnl();
        if (crossUnPnlValue != null) {
            String crossUnPnlValueAsString = crossUnPnlValue.toString();
            valMap.put("crossUnPnl", crossUnPnlValueAsString);
        }
        String availableBalanceValue = getAvailableBalance();
        if (availableBalanceValue != null) {
            String availableBalanceValueAsString = availableBalanceValue.toString();
            valMap.put("availableBalance", availableBalanceValueAsString);
        }
        Long updateTimeValue = getUpdateTime();
        if (updateTimeValue != null) {
            String updateTimeValueAsString = updateTimeValue.toString();
            valMap.put("updateTime", updateTimeValueAsString);
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
        Object assetValue = getAsset();
        if (assetValue != null) {
            valMap.put("asset", assetValue);
        }
        Object walletBalanceValue = getWalletBalance();
        if (walletBalanceValue != null) {
            valMap.put("walletBalance", walletBalanceValue);
        }
        Object unrealizedProfitValue = getUnrealizedProfit();
        if (unrealizedProfitValue != null) {
            valMap.put("unrealizedProfit", unrealizedProfitValue);
        }
        Object marginBalanceValue = getMarginBalance();
        if (marginBalanceValue != null) {
            valMap.put("marginBalance", marginBalanceValue);
        }
        Object maintMarginValue = getMaintMargin();
        if (maintMarginValue != null) {
            valMap.put("maintMargin", maintMarginValue);
        }
        Object initialMarginValue = getInitialMargin();
        if (initialMarginValue != null) {
            valMap.put("initialMargin", initialMarginValue);
        }
        Object positionInitialMarginValue = getPositionInitialMargin();
        if (positionInitialMarginValue != null) {
            valMap.put("positionInitialMargin", positionInitialMarginValue);
        }
        Object openOrderInitialMarginValue = getOpenOrderInitialMargin();
        if (openOrderInitialMarginValue != null) {
            valMap.put("openOrderInitialMargin", openOrderInitialMarginValue);
        }
        Object maxWithdrawAmountValue = getMaxWithdrawAmount();
        if (maxWithdrawAmountValue != null) {
            valMap.put("maxWithdrawAmount", maxWithdrawAmountValue);
        }
        Object crossWalletBalanceValue = getCrossWalletBalance();
        if (crossWalletBalanceValue != null) {
            valMap.put("crossWalletBalance", crossWalletBalanceValue);
        }
        Object crossUnPnlValue = getCrossUnPnl();
        if (crossUnPnlValue != null) {
            valMap.put("crossUnPnl", crossUnPnlValue);
        }
        Object availableBalanceValue = getAvailableBalance();
        if (availableBalanceValue != null) {
            valMap.put("availableBalance", availableBalanceValue);
        }
        Object updateTimeValue = getUpdateTime();
        if (updateTimeValue != null) {
            valMap.put("updateTime", updateTimeValue);
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
        openapiFields.add("asset");
        openapiFields.add("walletBalance");
        openapiFields.add("unrealizedProfit");
        openapiFields.add("marginBalance");
        openapiFields.add("maintMargin");
        openapiFields.add("initialMargin");
        openapiFields.add("positionInitialMargin");
        openapiFields.add("openOrderInitialMargin");
        openapiFields.add("maxWithdrawAmount");
        openapiFields.add("crossWalletBalance");
        openapiFields.add("crossUnPnl");
        openapiFields.add("availableBalance");
        openapiFields.add("updateTime");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AccountInformationResponseResultAssetsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountInformationResponseResultAssetsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " AccountInformationResponseResultAssetsInner is not found in"
                                    + " the empty JSON string",
                                AccountInformationResponseResultAssetsInner.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AccountInformationResponseResultAssetsInner.openapiFields.contains(
                    entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `AccountInformationResponseResultAssetsInner` properties."
                                    + " JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonNull())
                && !jsonObj.get("asset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `asset` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("asset").toString()));
        }
        if ((jsonObj.get("walletBalance") != null && !jsonObj.get("walletBalance").isJsonNull())
                && !jsonObj.get("walletBalance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `walletBalance` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("walletBalance").toString()));
        }
        if ((jsonObj.get("unrealizedProfit") != null
                        && !jsonObj.get("unrealizedProfit").isJsonNull())
                && !jsonObj.get("unrealizedProfit").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `unrealizedProfit` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("unrealizedProfit").toString()));
        }
        if ((jsonObj.get("marginBalance") != null && !jsonObj.get("marginBalance").isJsonNull())
                && !jsonObj.get("marginBalance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `marginBalance` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("marginBalance").toString()));
        }
        if ((jsonObj.get("maintMargin") != null && !jsonObj.get("maintMargin").isJsonNull())
                && !jsonObj.get("maintMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `maintMargin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("maintMargin").toString()));
        }
        if ((jsonObj.get("initialMargin") != null && !jsonObj.get("initialMargin").isJsonNull())
                && !jsonObj.get("initialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `initialMargin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("initialMargin").toString()));
        }
        if ((jsonObj.get("positionInitialMargin") != null
                        && !jsonObj.get("positionInitialMargin").isJsonNull())
                && !jsonObj.get("positionInitialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `positionInitialMargin` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("positionInitialMargin").toString()));
        }
        if ((jsonObj.get("openOrderInitialMargin") != null
                        && !jsonObj.get("openOrderInitialMargin").isJsonNull())
                && !jsonObj.get("openOrderInitialMargin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `openOrderInitialMargin` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("openOrderInitialMargin").toString()));
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
        if ((jsonObj.get("crossWalletBalance") != null
                        && !jsonObj.get("crossWalletBalance").isJsonNull())
                && !jsonObj.get("crossWalletBalance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `crossWalletBalance` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("crossWalletBalance").toString()));
        }
        if ((jsonObj.get("crossUnPnl") != null && !jsonObj.get("crossUnPnl").isJsonNull())
                && !jsonObj.get("crossUnPnl").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `crossUnPnl` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("crossUnPnl").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccountInformationResponseResultAssetsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'AccountInformationResponseResultAssetsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountInformationResponseResultAssetsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AccountInformationResponseResultAssetsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountInformationResponseResultAssetsInner>() {
                        @Override
                        public void write(
                                JsonWriter out, AccountInformationResponseResultAssetsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountInformationResponseResultAssetsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountInformationResponseResultAssetsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountInformationResponseResultAssetsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     AccountInformationResponseResultAssetsInner
     */
    public static AccountInformationResponseResultAssetsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, AccountInformationResponseResultAssetsInner.class);
    }

    /**
     * Convert an instance of AccountInformationResponseResultAssetsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
