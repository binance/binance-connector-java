/*
 * Binance Margin Trading REST API
 * OpenAPI Specification for the Binance Margin Trading REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.margin_trading.rest.model;

import com.binance.connector.client.margin_trading.rest.JSON;
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

/** QueryCrossMarginAccountDetailsResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryCrossMarginAccountDetailsResponse {
    public static final String SERIALIZED_NAME_CREATED = "created";

    @SerializedName(SERIALIZED_NAME_CREATED)
    @jakarta.annotation.Nullable
    private Boolean created;

    public static final String SERIALIZED_NAME_BORROW_ENABLED = "borrowEnabled";

    @SerializedName(SERIALIZED_NAME_BORROW_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean borrowEnabled;

    public static final String SERIALIZED_NAME_MARGIN_LEVEL = "marginLevel";

    @SerializedName(SERIALIZED_NAME_MARGIN_LEVEL)
    @jakarta.annotation.Nullable
    private String marginLevel;

    public static final String SERIALIZED_NAME_COLLATERAL_MARGIN_LEVEL = "collateralMarginLevel";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_MARGIN_LEVEL)
    @jakarta.annotation.Nullable
    private String collateralMarginLevel;

    public static final String SERIALIZED_NAME_TOTAL_ASSET_OF_BTC = "totalAssetOfBtc";

    @SerializedName(SERIALIZED_NAME_TOTAL_ASSET_OF_BTC)
    @jakarta.annotation.Nullable
    private String totalAssetOfBtc;

    public static final String SERIALIZED_NAME_TOTAL_LIABILITY_OF_BTC = "totalLiabilityOfBtc";

    @SerializedName(SERIALIZED_NAME_TOTAL_LIABILITY_OF_BTC)
    @jakarta.annotation.Nullable
    private String totalLiabilityOfBtc;

    public static final String SERIALIZED_NAME_TOTAL_NET_ASSET_OF_BTC = "totalNetAssetOfBtc";

    @SerializedName(SERIALIZED_NAME_TOTAL_NET_ASSET_OF_BTC)
    @jakarta.annotation.Nullable
    private String totalNetAssetOfBtc;

    public static final String SERIALIZED_NAME_TOTAL_COLLATERAL_VALUE_IN_U_S_D_T =
            "TotalCollateralValueInUSDT";

    @SerializedName(SERIALIZED_NAME_TOTAL_COLLATERAL_VALUE_IN_U_S_D_T)
    @jakarta.annotation.Nullable
    private String totalCollateralValueInUSDT;

    public static final String SERIALIZED_NAME_TOTAL_OPEN_ORDER_LOSS_IN_U_S_D_T =
            "totalOpenOrderLossInUSDT";

    @SerializedName(SERIALIZED_NAME_TOTAL_OPEN_ORDER_LOSS_IN_U_S_D_T)
    @jakarta.annotation.Nullable
    private String totalOpenOrderLossInUSDT;

    public static final String SERIALIZED_NAME_TRADE_ENABLED = "tradeEnabled";

    @SerializedName(SERIALIZED_NAME_TRADE_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean tradeEnabled;

    public static final String SERIALIZED_NAME_TRANSFER_IN_ENABLED = "transferInEnabled";

    @SerializedName(SERIALIZED_NAME_TRANSFER_IN_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean transferInEnabled;

    public static final String SERIALIZED_NAME_TRANSFER_OUT_ENABLED = "transferOutEnabled";

    @SerializedName(SERIALIZED_NAME_TRANSFER_OUT_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean transferOutEnabled;

    public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
    @jakarta.annotation.Nullable
    private String accountType;

    public static final String SERIALIZED_NAME_USER_ASSETS = "userAssets";

    @SerializedName(SERIALIZED_NAME_USER_ASSETS)
    @jakarta.annotation.Nullable
    private List<@Valid QueryCrossMarginAccountDetailsResponseUserAssetsInner> userAssets;

    public QueryCrossMarginAccountDetailsResponse() {}

    public QueryCrossMarginAccountDetailsResponse created(
            @jakarta.annotation.Nullable Boolean created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     *
     * @return created
     */
    @jakarta.annotation.Nullable
    public Boolean getCreated() {
        return created;
    }

    public void setCreated(@jakarta.annotation.Nullable Boolean created) {
        this.created = created;
    }

    public QueryCrossMarginAccountDetailsResponse borrowEnabled(
            @jakarta.annotation.Nullable Boolean borrowEnabled) {
        this.borrowEnabled = borrowEnabled;
        return this;
    }

    /**
     * Get borrowEnabled
     *
     * @return borrowEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getBorrowEnabled() {
        return borrowEnabled;
    }

    public void setBorrowEnabled(@jakarta.annotation.Nullable Boolean borrowEnabled) {
        this.borrowEnabled = borrowEnabled;
    }

    public QueryCrossMarginAccountDetailsResponse marginLevel(
            @jakarta.annotation.Nullable String marginLevel) {
        this.marginLevel = marginLevel;
        return this;
    }

    /**
     * Get marginLevel
     *
     * @return marginLevel
     */
    @jakarta.annotation.Nullable
    public String getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(@jakarta.annotation.Nullable String marginLevel) {
        this.marginLevel = marginLevel;
    }

    public QueryCrossMarginAccountDetailsResponse collateralMarginLevel(
            @jakarta.annotation.Nullable String collateralMarginLevel) {
        this.collateralMarginLevel = collateralMarginLevel;
        return this;
    }

    /**
     * Get collateralMarginLevel
     *
     * @return collateralMarginLevel
     */
    @jakarta.annotation.Nullable
    public String getCollateralMarginLevel() {
        return collateralMarginLevel;
    }

    public void setCollateralMarginLevel(
            @jakarta.annotation.Nullable String collateralMarginLevel) {
        this.collateralMarginLevel = collateralMarginLevel;
    }

    public QueryCrossMarginAccountDetailsResponse totalAssetOfBtc(
            @jakarta.annotation.Nullable String totalAssetOfBtc) {
        this.totalAssetOfBtc = totalAssetOfBtc;
        return this;
    }

    /**
     * Get totalAssetOfBtc
     *
     * @return totalAssetOfBtc
     */
    @jakarta.annotation.Nullable
    public String getTotalAssetOfBtc() {
        return totalAssetOfBtc;
    }

    public void setTotalAssetOfBtc(@jakarta.annotation.Nullable String totalAssetOfBtc) {
        this.totalAssetOfBtc = totalAssetOfBtc;
    }

    public QueryCrossMarginAccountDetailsResponse totalLiabilityOfBtc(
            @jakarta.annotation.Nullable String totalLiabilityOfBtc) {
        this.totalLiabilityOfBtc = totalLiabilityOfBtc;
        return this;
    }

    /**
     * Get totalLiabilityOfBtc
     *
     * @return totalLiabilityOfBtc
     */
    @jakarta.annotation.Nullable
    public String getTotalLiabilityOfBtc() {
        return totalLiabilityOfBtc;
    }

    public void setTotalLiabilityOfBtc(@jakarta.annotation.Nullable String totalLiabilityOfBtc) {
        this.totalLiabilityOfBtc = totalLiabilityOfBtc;
    }

    public QueryCrossMarginAccountDetailsResponse totalNetAssetOfBtc(
            @jakarta.annotation.Nullable String totalNetAssetOfBtc) {
        this.totalNetAssetOfBtc = totalNetAssetOfBtc;
        return this;
    }

    /**
     * Get totalNetAssetOfBtc
     *
     * @return totalNetAssetOfBtc
     */
    @jakarta.annotation.Nullable
    public String getTotalNetAssetOfBtc() {
        return totalNetAssetOfBtc;
    }

    public void setTotalNetAssetOfBtc(@jakarta.annotation.Nullable String totalNetAssetOfBtc) {
        this.totalNetAssetOfBtc = totalNetAssetOfBtc;
    }

    public QueryCrossMarginAccountDetailsResponse totalCollateralValueInUSDT(
            @jakarta.annotation.Nullable String totalCollateralValueInUSDT) {
        this.totalCollateralValueInUSDT = totalCollateralValueInUSDT;
        return this;
    }

    /**
     * Get totalCollateralValueInUSDT
     *
     * @return totalCollateralValueInUSDT
     */
    @jakarta.annotation.Nullable
    public String getTotalCollateralValueInUSDT() {
        return totalCollateralValueInUSDT;
    }

    public void setTotalCollateralValueInUSDT(
            @jakarta.annotation.Nullable String totalCollateralValueInUSDT) {
        this.totalCollateralValueInUSDT = totalCollateralValueInUSDT;
    }

    public QueryCrossMarginAccountDetailsResponse totalOpenOrderLossInUSDT(
            @jakarta.annotation.Nullable String totalOpenOrderLossInUSDT) {
        this.totalOpenOrderLossInUSDT = totalOpenOrderLossInUSDT;
        return this;
    }

    /**
     * Get totalOpenOrderLossInUSDT
     *
     * @return totalOpenOrderLossInUSDT
     */
    @jakarta.annotation.Nullable
    public String getTotalOpenOrderLossInUSDT() {
        return totalOpenOrderLossInUSDT;
    }

    public void setTotalOpenOrderLossInUSDT(
            @jakarta.annotation.Nullable String totalOpenOrderLossInUSDT) {
        this.totalOpenOrderLossInUSDT = totalOpenOrderLossInUSDT;
    }

    public QueryCrossMarginAccountDetailsResponse tradeEnabled(
            @jakarta.annotation.Nullable Boolean tradeEnabled) {
        this.tradeEnabled = tradeEnabled;
        return this;
    }

    /**
     * Get tradeEnabled
     *
     * @return tradeEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getTradeEnabled() {
        return tradeEnabled;
    }

    public void setTradeEnabled(@jakarta.annotation.Nullable Boolean tradeEnabled) {
        this.tradeEnabled = tradeEnabled;
    }

    public QueryCrossMarginAccountDetailsResponse transferInEnabled(
            @jakarta.annotation.Nullable Boolean transferInEnabled) {
        this.transferInEnabled = transferInEnabled;
        return this;
    }

    /**
     * Get transferInEnabled
     *
     * @return transferInEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getTransferInEnabled() {
        return transferInEnabled;
    }

    public void setTransferInEnabled(@jakarta.annotation.Nullable Boolean transferInEnabled) {
        this.transferInEnabled = transferInEnabled;
    }

    public QueryCrossMarginAccountDetailsResponse transferOutEnabled(
            @jakarta.annotation.Nullable Boolean transferOutEnabled) {
        this.transferOutEnabled = transferOutEnabled;
        return this;
    }

    /**
     * Get transferOutEnabled
     *
     * @return transferOutEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getTransferOutEnabled() {
        return transferOutEnabled;
    }

    public void setTransferOutEnabled(@jakarta.annotation.Nullable Boolean transferOutEnabled) {
        this.transferOutEnabled = transferOutEnabled;
    }

    public QueryCrossMarginAccountDetailsResponse accountType(
            @jakarta.annotation.Nullable String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     *
     * @return accountType
     */
    @jakarta.annotation.Nullable
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(@jakarta.annotation.Nullable String accountType) {
        this.accountType = accountType;
    }

    public QueryCrossMarginAccountDetailsResponse userAssets(
            @jakarta.annotation.Nullable
                    List<@Valid QueryCrossMarginAccountDetailsResponseUserAssetsInner> userAssets) {
        this.userAssets = userAssets;
        return this;
    }

    public QueryCrossMarginAccountDetailsResponse addUserAssetsItem(
            QueryCrossMarginAccountDetailsResponseUserAssetsInner userAssetsItem) {
        if (this.userAssets == null) {
            this.userAssets = new ArrayList<>();
        }
        this.userAssets.add(userAssetsItem);
        return this;
    }

    /**
     * Get userAssets
     *
     * @return userAssets
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid QueryCrossMarginAccountDetailsResponseUserAssetsInner> getUserAssets() {
        return userAssets;
    }

    public void setUserAssets(
            @jakarta.annotation.Nullable
                    List<@Valid QueryCrossMarginAccountDetailsResponseUserAssetsInner> userAssets) {
        this.userAssets = userAssets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCrossMarginAccountDetailsResponse queryCrossMarginAccountDetailsResponse =
                (QueryCrossMarginAccountDetailsResponse) o;
        return Objects.equals(this.created, queryCrossMarginAccountDetailsResponse.created)
                && Objects.equals(
                        this.borrowEnabled, queryCrossMarginAccountDetailsResponse.borrowEnabled)
                && Objects.equals(
                        this.marginLevel, queryCrossMarginAccountDetailsResponse.marginLevel)
                && Objects.equals(
                        this.collateralMarginLevel,
                        queryCrossMarginAccountDetailsResponse.collateralMarginLevel)
                && Objects.equals(
                        this.totalAssetOfBtc,
                        queryCrossMarginAccountDetailsResponse.totalAssetOfBtc)
                && Objects.equals(
                        this.totalLiabilityOfBtc,
                        queryCrossMarginAccountDetailsResponse.totalLiabilityOfBtc)
                && Objects.equals(
                        this.totalNetAssetOfBtc,
                        queryCrossMarginAccountDetailsResponse.totalNetAssetOfBtc)
                && Objects.equals(
                        this.totalCollateralValueInUSDT,
                        queryCrossMarginAccountDetailsResponse.totalCollateralValueInUSDT)
                && Objects.equals(
                        this.totalOpenOrderLossInUSDT,
                        queryCrossMarginAccountDetailsResponse.totalOpenOrderLossInUSDT)
                && Objects.equals(
                        this.tradeEnabled, queryCrossMarginAccountDetailsResponse.tradeEnabled)
                && Objects.equals(
                        this.transferInEnabled,
                        queryCrossMarginAccountDetailsResponse.transferInEnabled)
                && Objects.equals(
                        this.transferOutEnabled,
                        queryCrossMarginAccountDetailsResponse.transferOutEnabled)
                && Objects.equals(
                        this.accountType, queryCrossMarginAccountDetailsResponse.accountType)
                && Objects.equals(
                        this.userAssets, queryCrossMarginAccountDetailsResponse.userAssets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                created,
                borrowEnabled,
                marginLevel,
                collateralMarginLevel,
                totalAssetOfBtc,
                totalLiabilityOfBtc,
                totalNetAssetOfBtc,
                totalCollateralValueInUSDT,
                totalOpenOrderLossInUSDT,
                tradeEnabled,
                transferInEnabled,
                transferOutEnabled,
                accountType,
                userAssets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCrossMarginAccountDetailsResponse {\n");
        sb.append("		created: ").append(toIndentedString(created)).append("\n");
        sb.append("		borrowEnabled: ").append(toIndentedString(borrowEnabled)).append("\n");
        sb.append("		marginLevel: ").append(toIndentedString(marginLevel)).append("\n");
        sb.append("		collateralMarginLevel: ")
                .append(toIndentedString(collateralMarginLevel))
                .append("\n");
        sb.append("		totalAssetOfBtc: ").append(toIndentedString(totalAssetOfBtc)).append("\n");
        sb.append("		totalLiabilityOfBtc: ")
                .append(toIndentedString(totalLiabilityOfBtc))
                .append("\n");
        sb.append("		totalNetAssetOfBtc: ")
                .append(toIndentedString(totalNetAssetOfBtc))
                .append("\n");
        sb.append("		totalCollateralValueInUSDT: ")
                .append(toIndentedString(totalCollateralValueInUSDT))
                .append("\n");
        sb.append("		totalOpenOrderLossInUSDT: ")
                .append(toIndentedString(totalOpenOrderLossInUSDT))
                .append("\n");
        sb.append("		tradeEnabled: ").append(toIndentedString(tradeEnabled)).append("\n");
        sb.append("		transferInEnabled: ").append(toIndentedString(transferInEnabled)).append("\n");
        sb.append("		transferOutEnabled: ")
                .append(toIndentedString(transferOutEnabled))
                .append("\n");
        sb.append("		accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("		userAssets: ").append(toIndentedString(userAssets)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object createdValue = getCreated();
        String createdValueAsString = "";
        createdValueAsString = createdValue.toString();
        sb.append("created=").append(urlEncode(createdValueAsString)).append("");
        Object borrowEnabledValue = getBorrowEnabled();
        String borrowEnabledValueAsString = "";
        borrowEnabledValueAsString = borrowEnabledValue.toString();
        sb.append("borrowEnabled=").append(urlEncode(borrowEnabledValueAsString)).append("");
        Object marginLevelValue = getMarginLevel();
        String marginLevelValueAsString = "";
        marginLevelValueAsString = marginLevelValue.toString();
        sb.append("marginLevel=").append(urlEncode(marginLevelValueAsString)).append("");
        Object collateralMarginLevelValue = getCollateralMarginLevel();
        String collateralMarginLevelValueAsString = "";
        collateralMarginLevelValueAsString = collateralMarginLevelValue.toString();
        sb.append("collateralMarginLevel=")
                .append(urlEncode(collateralMarginLevelValueAsString))
                .append("");
        Object totalAssetOfBtcValue = getTotalAssetOfBtc();
        String totalAssetOfBtcValueAsString = "";
        totalAssetOfBtcValueAsString = totalAssetOfBtcValue.toString();
        sb.append("totalAssetOfBtc=").append(urlEncode(totalAssetOfBtcValueAsString)).append("");
        Object totalLiabilityOfBtcValue = getTotalLiabilityOfBtc();
        String totalLiabilityOfBtcValueAsString = "";
        totalLiabilityOfBtcValueAsString = totalLiabilityOfBtcValue.toString();
        sb.append("totalLiabilityOfBtc=")
                .append(urlEncode(totalLiabilityOfBtcValueAsString))
                .append("");
        Object totalNetAssetOfBtcValue = getTotalNetAssetOfBtc();
        String totalNetAssetOfBtcValueAsString = "";
        totalNetAssetOfBtcValueAsString = totalNetAssetOfBtcValue.toString();
        sb.append("totalNetAssetOfBtc=")
                .append(urlEncode(totalNetAssetOfBtcValueAsString))
                .append("");
        Object totalCollateralValueInUSDTValue = getTotalCollateralValueInUSDT();
        String totalCollateralValueInUSDTValueAsString = "";
        totalCollateralValueInUSDTValueAsString = totalCollateralValueInUSDTValue.toString();
        sb.append("totalCollateralValueInUSDT=")
                .append(urlEncode(totalCollateralValueInUSDTValueAsString))
                .append("");
        Object totalOpenOrderLossInUSDTValue = getTotalOpenOrderLossInUSDT();
        String totalOpenOrderLossInUSDTValueAsString = "";
        totalOpenOrderLossInUSDTValueAsString = totalOpenOrderLossInUSDTValue.toString();
        sb.append("totalOpenOrderLossInUSDT=")
                .append(urlEncode(totalOpenOrderLossInUSDTValueAsString))
                .append("");
        Object tradeEnabledValue = getTradeEnabled();
        String tradeEnabledValueAsString = "";
        tradeEnabledValueAsString = tradeEnabledValue.toString();
        sb.append("tradeEnabled=").append(urlEncode(tradeEnabledValueAsString)).append("");
        Object transferInEnabledValue = getTransferInEnabled();
        String transferInEnabledValueAsString = "";
        transferInEnabledValueAsString = transferInEnabledValue.toString();
        sb.append("transferInEnabled=")
                .append(urlEncode(transferInEnabledValueAsString))
                .append("");
        Object transferOutEnabledValue = getTransferOutEnabled();
        String transferOutEnabledValueAsString = "";
        transferOutEnabledValueAsString = transferOutEnabledValue.toString();
        sb.append("transferOutEnabled=")
                .append(urlEncode(transferOutEnabledValueAsString))
                .append("");
        Object accountTypeValue = getAccountType();
        String accountTypeValueAsString = "";
        accountTypeValueAsString = accountTypeValue.toString();
        sb.append("accountType=").append(urlEncode(accountTypeValueAsString)).append("");
        Object userAssetsValue = getUserAssets();
        String userAssetsValueAsString = "";
        userAssetsValueAsString =
                (String)
                        ((Collection) userAssetsValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("userAssets=").append(urlEncode(userAssetsValueAsString)).append("");
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
        openapiFields.add("created");
        openapiFields.add("borrowEnabled");
        openapiFields.add("marginLevel");
        openapiFields.add("collateralMarginLevel");
        openapiFields.add("totalAssetOfBtc");
        openapiFields.add("totalLiabilityOfBtc");
        openapiFields.add("totalNetAssetOfBtc");
        openapiFields.add("TotalCollateralValueInUSDT");
        openapiFields.add("totalOpenOrderLossInUSDT");
        openapiFields.add("tradeEnabled");
        openapiFields.add("transferInEnabled");
        openapiFields.add("transferOutEnabled");
        openapiFields.add("accountType");
        openapiFields.add("userAssets");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryCrossMarginAccountDetailsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryCrossMarginAccountDetailsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in QueryCrossMarginAccountDetailsResponse"
                                        + " is not found in the empty JSON string",
                                QueryCrossMarginAccountDetailsResponse.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("marginLevel") != null && !jsonObj.get("marginLevel").isJsonNull())
                && !jsonObj.get("marginLevel").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `marginLevel` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("marginLevel").toString()));
        }
        if ((jsonObj.get("collateralMarginLevel") != null
                        && !jsonObj.get("collateralMarginLevel").isJsonNull())
                && !jsonObj.get("collateralMarginLevel").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collateralMarginLevel` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("collateralMarginLevel").toString()));
        }
        if ((jsonObj.get("totalAssetOfBtc") != null && !jsonObj.get("totalAssetOfBtc").isJsonNull())
                && !jsonObj.get("totalAssetOfBtc").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalAssetOfBtc` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalAssetOfBtc").toString()));
        }
        if ((jsonObj.get("totalLiabilityOfBtc") != null
                        && !jsonObj.get("totalLiabilityOfBtc").isJsonNull())
                && !jsonObj.get("totalLiabilityOfBtc").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalLiabilityOfBtc` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalLiabilityOfBtc").toString()));
        }
        if ((jsonObj.get("totalNetAssetOfBtc") != null
                        && !jsonObj.get("totalNetAssetOfBtc").isJsonNull())
                && !jsonObj.get("totalNetAssetOfBtc").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalNetAssetOfBtc` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("totalNetAssetOfBtc").toString()));
        }
        if ((jsonObj.get("TotalCollateralValueInUSDT") != null
                        && !jsonObj.get("TotalCollateralValueInUSDT").isJsonNull())
                && !jsonObj.get("TotalCollateralValueInUSDT").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TotalCollateralValueInUSDT` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("TotalCollateralValueInUSDT").toString()));
        }
        if ((jsonObj.get("totalOpenOrderLossInUSDT") != null
                        && !jsonObj.get("totalOpenOrderLossInUSDT").isJsonNull())
                && !jsonObj.get("totalOpenOrderLossInUSDT").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalOpenOrderLossInUSDT` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("totalOpenOrderLossInUSDT").toString()));
        }
        if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull())
                && !jsonObj.get("accountType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `accountType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("accountType").toString()));
        }
        if (jsonObj.get("userAssets") != null && !jsonObj.get("userAssets").isJsonNull()) {
            JsonArray jsonArrayuserAssets = jsonObj.getAsJsonArray("userAssets");
            if (jsonArrayuserAssets != null) {
                // ensure the json data is an array
                if (!jsonObj.get("userAssets").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `userAssets` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("userAssets").toString()));
                }

                // validate the optional field `userAssets` (array)
                for (int i = 0; i < jsonArrayuserAssets.size(); i++) {
                    QueryCrossMarginAccountDetailsResponseUserAssetsInner.validateJsonElement(
                            jsonArrayuserAssets.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryCrossMarginAccountDetailsResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'QueryCrossMarginAccountDetailsResponse'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryCrossMarginAccountDetailsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(QueryCrossMarginAccountDetailsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryCrossMarginAccountDetailsResponse>() {
                        @Override
                        public void write(
                                JsonWriter out, QueryCrossMarginAccountDetailsResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryCrossMarginAccountDetailsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryCrossMarginAccountDetailsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryCrossMarginAccountDetailsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryCrossMarginAccountDetailsResponse
     */
    public static QueryCrossMarginAccountDetailsResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, QueryCrossMarginAccountDetailsResponse.class);
    }

    /**
     * Convert an instance of QueryCrossMarginAccountDetailsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
