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
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** GetCmAccountDetailResponseAssetsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetCmAccountDetailResponseAssetsInner {
    public static final String SERIALIZED_NAME_ASSET = "asset";

    @SerializedName(SERIALIZED_NAME_ASSET)
    @jakarta.annotation.Nullable
    private String asset;

    public static final String SERIALIZED_NAME_CROSS_WALLET_BALANCE = "crossWalletBalance";

    @SerializedName(SERIALIZED_NAME_CROSS_WALLET_BALANCE)
    @jakarta.annotation.Nullable
    private String crossWalletBalance;

    public static final String SERIALIZED_NAME_CROSS_UN_PNL = "crossUnPnl";

    @SerializedName(SERIALIZED_NAME_CROSS_UN_PNL)
    @jakarta.annotation.Nullable
    private String crossUnPnl;

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

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public GetCmAccountDetailResponseAssetsInner() {}

    public GetCmAccountDetailResponseAssetsInner asset(@jakarta.annotation.Nullable String asset) {
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

    public GetCmAccountDetailResponseAssetsInner crossWalletBalance(
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

    public GetCmAccountDetailResponseAssetsInner crossUnPnl(
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

    public GetCmAccountDetailResponseAssetsInner maintMargin(
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

    public GetCmAccountDetailResponseAssetsInner initialMargin(
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

    public GetCmAccountDetailResponseAssetsInner positionInitialMargin(
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

    public GetCmAccountDetailResponseAssetsInner openOrderInitialMargin(
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

    public GetCmAccountDetailResponseAssetsInner updateTime(
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
        GetCmAccountDetailResponseAssetsInner getCmAccountDetailResponseAssetsInner =
                (GetCmAccountDetailResponseAssetsInner) o;
        return Objects.equals(this.asset, getCmAccountDetailResponseAssetsInner.asset)
                && Objects.equals(
                        this.crossWalletBalance,
                        getCmAccountDetailResponseAssetsInner.crossWalletBalance)
                && Objects.equals(this.crossUnPnl, getCmAccountDetailResponseAssetsInner.crossUnPnl)
                && Objects.equals(
                        this.maintMargin, getCmAccountDetailResponseAssetsInner.maintMargin)
                && Objects.equals(
                        this.initialMargin, getCmAccountDetailResponseAssetsInner.initialMargin)
                && Objects.equals(
                        this.positionInitialMargin,
                        getCmAccountDetailResponseAssetsInner.positionInitialMargin)
                && Objects.equals(
                        this.openOrderInitialMargin,
                        getCmAccountDetailResponseAssetsInner.openOrderInitialMargin)
                && Objects.equals(
                        this.updateTime, getCmAccountDetailResponseAssetsInner.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                asset,
                crossWalletBalance,
                crossUnPnl,
                maintMargin,
                initialMargin,
                positionInitialMargin,
                openOrderInitialMargin,
                updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCmAccountDetailResponseAssetsInner {\n");
        sb.append("		asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("		crossWalletBalance: ")
                .append(toIndentedString(crossWalletBalance))
                .append("\n");
        sb.append("		crossUnPnl: ").append(toIndentedString(crossUnPnl)).append("\n");
        sb.append("		maintMargin: ").append(toIndentedString(maintMargin)).append("\n");
        sb.append("		initialMargin: ").append(toIndentedString(initialMargin)).append("\n");
        sb.append("		positionInitialMargin: ")
                .append(toIndentedString(positionInitialMargin))
                .append("\n");
        sb.append("		openOrderInitialMargin: ")
                .append(toIndentedString(openOrderInitialMargin))
                .append("\n");
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
        openapiFields.add("crossWalletBalance");
        openapiFields.add("crossUnPnl");
        openapiFields.add("maintMargin");
        openapiFields.add("initialMargin");
        openapiFields.add("positionInitialMargin");
        openapiFields.add("openOrderInitialMargin");
        openapiFields.add("updateTime");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetCmAccountDetailResponseAssetsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetCmAccountDetailResponseAssetsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetCmAccountDetailResponseAssetsInner"
                                        + " is not found in the empty JSON string",
                                GetCmAccountDetailResponseAssetsInner.openapiRequiredFields
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetCmAccountDetailResponseAssetsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetCmAccountDetailResponseAssetsInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetCmAccountDetailResponseAssetsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetCmAccountDetailResponseAssetsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetCmAccountDetailResponseAssetsInner>() {
                        @Override
                        public void write(
                                JsonWriter out, GetCmAccountDetailResponseAssetsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetCmAccountDetailResponseAssetsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetCmAccountDetailResponseAssetsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetCmAccountDetailResponseAssetsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     GetCmAccountDetailResponseAssetsInner
     */
    public static GetCmAccountDetailResponseAssetsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, GetCmAccountDetailResponseAssetsInner.class);
    }

    /**
     * Convert an instance of GetCmAccountDetailResponseAssetsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
