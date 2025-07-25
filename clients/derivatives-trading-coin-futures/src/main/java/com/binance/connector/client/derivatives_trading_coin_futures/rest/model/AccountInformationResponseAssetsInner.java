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

/** AccountInformationResponseAssetsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountInformationResponseAssetsInner {
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

    public AccountInformationResponseAssetsInner() {}

    public AccountInformationResponseAssetsInner asset(@jakarta.annotation.Nullable String asset) {
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

    public AccountInformationResponseAssetsInner walletBalance(
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

    public AccountInformationResponseAssetsInner unrealizedProfit(
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

    public AccountInformationResponseAssetsInner marginBalance(
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

    public AccountInformationResponseAssetsInner maintMargin(
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

    public AccountInformationResponseAssetsInner initialMargin(
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

    public AccountInformationResponseAssetsInner positionInitialMargin(
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

    public AccountInformationResponseAssetsInner openOrderInitialMargin(
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

    public AccountInformationResponseAssetsInner maxWithdrawAmount(
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

    public AccountInformationResponseAssetsInner crossWalletBalance(
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

    public AccountInformationResponseAssetsInner crossUnPnl(
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

    public AccountInformationResponseAssetsInner availableBalance(
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

    public AccountInformationResponseAssetsInner updateTime(
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
        AccountInformationResponseAssetsInner accountInformationResponseAssetsInner =
                (AccountInformationResponseAssetsInner) o;
        return Objects.equals(this.asset, accountInformationResponseAssetsInner.asset)
                && Objects.equals(
                        this.walletBalance, accountInformationResponseAssetsInner.walletBalance)
                && Objects.equals(
                        this.unrealizedProfit,
                        accountInformationResponseAssetsInner.unrealizedProfit)
                && Objects.equals(
                        this.marginBalance, accountInformationResponseAssetsInner.marginBalance)
                && Objects.equals(
                        this.maintMargin, accountInformationResponseAssetsInner.maintMargin)
                && Objects.equals(
                        this.initialMargin, accountInformationResponseAssetsInner.initialMargin)
                && Objects.equals(
                        this.positionInitialMargin,
                        accountInformationResponseAssetsInner.positionInitialMargin)
                && Objects.equals(
                        this.openOrderInitialMargin,
                        accountInformationResponseAssetsInner.openOrderInitialMargin)
                && Objects.equals(
                        this.maxWithdrawAmount,
                        accountInformationResponseAssetsInner.maxWithdrawAmount)
                && Objects.equals(
                        this.crossWalletBalance,
                        accountInformationResponseAssetsInner.crossWalletBalance)
                && Objects.equals(this.crossUnPnl, accountInformationResponseAssetsInner.crossUnPnl)
                && Objects.equals(
                        this.availableBalance,
                        accountInformationResponseAssetsInner.availableBalance)
                && Objects.equals(
                        this.updateTime, accountInformationResponseAssetsInner.updateTime);
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
        sb.append("class AccountInformationResponseAssetsInner {\n");
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

        Object assetValue = getAsset();
        String assetValueAsString = "";
        assetValueAsString = assetValue.toString();
        sb.append("asset=").append(urlEncode(assetValueAsString)).append("");
        Object walletBalanceValue = getWalletBalance();
        String walletBalanceValueAsString = "";
        walletBalanceValueAsString = walletBalanceValue.toString();
        sb.append("walletBalance=").append(urlEncode(walletBalanceValueAsString)).append("");
        Object unrealizedProfitValue = getUnrealizedProfit();
        String unrealizedProfitValueAsString = "";
        unrealizedProfitValueAsString = unrealizedProfitValue.toString();
        sb.append("unrealizedProfit=").append(urlEncode(unrealizedProfitValueAsString)).append("");
        Object marginBalanceValue = getMarginBalance();
        String marginBalanceValueAsString = "";
        marginBalanceValueAsString = marginBalanceValue.toString();
        sb.append("marginBalance=").append(urlEncode(marginBalanceValueAsString)).append("");
        Object maintMarginValue = getMaintMargin();
        String maintMarginValueAsString = "";
        maintMarginValueAsString = maintMarginValue.toString();
        sb.append("maintMargin=").append(urlEncode(maintMarginValueAsString)).append("");
        Object initialMarginValue = getInitialMargin();
        String initialMarginValueAsString = "";
        initialMarginValueAsString = initialMarginValue.toString();
        sb.append("initialMargin=").append(urlEncode(initialMarginValueAsString)).append("");
        Object positionInitialMarginValue = getPositionInitialMargin();
        String positionInitialMarginValueAsString = "";
        positionInitialMarginValueAsString = positionInitialMarginValue.toString();
        sb.append("positionInitialMargin=")
                .append(urlEncode(positionInitialMarginValueAsString))
                .append("");
        Object openOrderInitialMarginValue = getOpenOrderInitialMargin();
        String openOrderInitialMarginValueAsString = "";
        openOrderInitialMarginValueAsString = openOrderInitialMarginValue.toString();
        sb.append("openOrderInitialMargin=")
                .append(urlEncode(openOrderInitialMarginValueAsString))
                .append("");
        Object maxWithdrawAmountValue = getMaxWithdrawAmount();
        String maxWithdrawAmountValueAsString = "";
        maxWithdrawAmountValueAsString = maxWithdrawAmountValue.toString();
        sb.append("maxWithdrawAmount=")
                .append(urlEncode(maxWithdrawAmountValueAsString))
                .append("");
        Object crossWalletBalanceValue = getCrossWalletBalance();
        String crossWalletBalanceValueAsString = "";
        crossWalletBalanceValueAsString = crossWalletBalanceValue.toString();
        sb.append("crossWalletBalance=")
                .append(urlEncode(crossWalletBalanceValueAsString))
                .append("");
        Object crossUnPnlValue = getCrossUnPnl();
        String crossUnPnlValueAsString = "";
        crossUnPnlValueAsString = crossUnPnlValue.toString();
        sb.append("crossUnPnl=").append(urlEncode(crossUnPnlValueAsString)).append("");
        Object availableBalanceValue = getAvailableBalance();
        String availableBalanceValueAsString = "";
        availableBalanceValueAsString = availableBalanceValue.toString();
        sb.append("availableBalance=").append(urlEncode(availableBalanceValueAsString)).append("");
        Object updateTimeValue = getUpdateTime();
        String updateTimeValueAsString = "";
        updateTimeValueAsString = updateTimeValue.toString();
        sb.append("updateTime=").append(urlEncode(updateTimeValueAsString)).append("");
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
     *     AccountInformationResponseAssetsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountInformationResponseAssetsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccountInformationResponseAssetsInner"
                                        + " is not found in the empty JSON string",
                                AccountInformationResponseAssetsInner.openapiRequiredFields
                                        .toString()));
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
            if (!AccountInformationResponseAssetsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccountInformationResponseAssetsInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountInformationResponseAssetsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AccountInformationResponseAssetsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountInformationResponseAssetsInner>() {
                        @Override
                        public void write(
                                JsonWriter out, AccountInformationResponseAssetsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountInformationResponseAssetsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountInformationResponseAssetsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountInformationResponseAssetsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     AccountInformationResponseAssetsInner
     */
    public static AccountInformationResponseAssetsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, AccountInformationResponseAssetsInner.class);
    }

    /**
     * Convert an instance of AccountInformationResponseAssetsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
