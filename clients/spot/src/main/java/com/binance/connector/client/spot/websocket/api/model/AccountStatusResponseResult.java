/*
 * Binance Spot WebSocket API
 * OpenAPI Specifications for the Binance Spot WebSocket API  API documents:   - [Github web-socket-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/web-socket-api.md)   - [General API information for web-socket-api on website](https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.websocket.api.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.spot.websocket.api.JSON;
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
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** AccountStatusResponseResult */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountStatusResponseResult extends BaseDTO {
    public static final String SERIALIZED_NAME_MAKER_COMMISSION = "makerCommission";

    @SerializedName(SERIALIZED_NAME_MAKER_COMMISSION)
    @jakarta.annotation.Nullable
    private Long makerCommission;

    public static final String SERIALIZED_NAME_TAKER_COMMISSION = "takerCommission";

    @SerializedName(SERIALIZED_NAME_TAKER_COMMISSION)
    @jakarta.annotation.Nullable
    private Long takerCommission;

    public static final String SERIALIZED_NAME_BUYER_COMMISSION = "buyerCommission";

    @SerializedName(SERIALIZED_NAME_BUYER_COMMISSION)
    @jakarta.annotation.Nullable
    private Long buyerCommission;

    public static final String SERIALIZED_NAME_SELLER_COMMISSION = "sellerCommission";

    @SerializedName(SERIALIZED_NAME_SELLER_COMMISSION)
    @jakarta.annotation.Nullable
    private Long sellerCommission;

    public static final String SERIALIZED_NAME_CAN_TRADE = "canTrade";

    @SerializedName(SERIALIZED_NAME_CAN_TRADE)
    @jakarta.annotation.Nullable
    private Boolean canTrade;

    public static final String SERIALIZED_NAME_CAN_WITHDRAW = "canWithdraw";

    @SerializedName(SERIALIZED_NAME_CAN_WITHDRAW)
    @jakarta.annotation.Nullable
    private Boolean canWithdraw;

    public static final String SERIALIZED_NAME_CAN_DEPOSIT = "canDeposit";

    @SerializedName(SERIALIZED_NAME_CAN_DEPOSIT)
    @jakarta.annotation.Nullable
    private Boolean canDeposit;

    public static final String SERIALIZED_NAME_COMMISSION_RATES = "commissionRates";

    @SerializedName(SERIALIZED_NAME_COMMISSION_RATES)
    @jakarta.annotation.Nullable
    private AccountStatusResponseResultCommissionRates commissionRates;

    public static final String SERIALIZED_NAME_BROKERED = "brokered";

    @SerializedName(SERIALIZED_NAME_BROKERED)
    @jakarta.annotation.Nullable
    private Boolean brokered;

    public static final String SERIALIZED_NAME_REQUIRE_SELF_TRADE_PREVENTION =
            "requireSelfTradePrevention";

    @SerializedName(SERIALIZED_NAME_REQUIRE_SELF_TRADE_PREVENTION)
    @jakarta.annotation.Nullable
    private Boolean requireSelfTradePrevention;

    public static final String SERIALIZED_NAME_PREVENT_SOR = "preventSor";

    @SerializedName(SERIALIZED_NAME_PREVENT_SOR)
    @jakarta.annotation.Nullable
    private Boolean preventSor;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
    @jakarta.annotation.Nullable
    private String accountType;

    public static final String SERIALIZED_NAME_BALANCES = "balances";

    @SerializedName(SERIALIZED_NAME_BALANCES)
    @jakarta.annotation.Nullable
    private List<@Valid AccountStatusResponseResultBalancesInner> balances;

    public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";

    @SerializedName(SERIALIZED_NAME_PERMISSIONS)
    @jakarta.annotation.Nullable
    private List<String> permissions;

    public static final String SERIALIZED_NAME_UID = "uid";

    @SerializedName(SERIALIZED_NAME_UID)
    @jakarta.annotation.Nullable
    private Long uid;

    public AccountStatusResponseResult() {}

    public AccountStatusResponseResult makerCommission(
            @jakarta.annotation.Nullable Long makerCommission) {
        this.makerCommission = makerCommission;
        return this;
    }

    /**
     * Get makerCommission
     *
     * @return makerCommission
     */
    @jakarta.annotation.Nullable
    public Long getMakerCommission() {
        return makerCommission;
    }

    public void setMakerCommission(@jakarta.annotation.Nullable Long makerCommission) {
        this.makerCommission = makerCommission;
    }

    public AccountStatusResponseResult takerCommission(
            @jakarta.annotation.Nullable Long takerCommission) {
        this.takerCommission = takerCommission;
        return this;
    }

    /**
     * Get takerCommission
     *
     * @return takerCommission
     */
    @jakarta.annotation.Nullable
    public Long getTakerCommission() {
        return takerCommission;
    }

    public void setTakerCommission(@jakarta.annotation.Nullable Long takerCommission) {
        this.takerCommission = takerCommission;
    }

    public AccountStatusResponseResult buyerCommission(
            @jakarta.annotation.Nullable Long buyerCommission) {
        this.buyerCommission = buyerCommission;
        return this;
    }

    /**
     * Get buyerCommission
     *
     * @return buyerCommission
     */
    @jakarta.annotation.Nullable
    public Long getBuyerCommission() {
        return buyerCommission;
    }

    public void setBuyerCommission(@jakarta.annotation.Nullable Long buyerCommission) {
        this.buyerCommission = buyerCommission;
    }

    public AccountStatusResponseResult sellerCommission(
            @jakarta.annotation.Nullable Long sellerCommission) {
        this.sellerCommission = sellerCommission;
        return this;
    }

    /**
     * Get sellerCommission
     *
     * @return sellerCommission
     */
    @jakarta.annotation.Nullable
    public Long getSellerCommission() {
        return sellerCommission;
    }

    public void setSellerCommission(@jakarta.annotation.Nullable Long sellerCommission) {
        this.sellerCommission = sellerCommission;
    }

    public AccountStatusResponseResult canTrade(@jakarta.annotation.Nullable Boolean canTrade) {
        this.canTrade = canTrade;
        return this;
    }

    /**
     * Get canTrade
     *
     * @return canTrade
     */
    @jakarta.annotation.Nullable
    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(@jakarta.annotation.Nullable Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public AccountStatusResponseResult canWithdraw(
            @jakarta.annotation.Nullable Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
        return this;
    }

    /**
     * Get canWithdraw
     *
     * @return canWithdraw
     */
    @jakarta.annotation.Nullable
    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(@jakarta.annotation.Nullable Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public AccountStatusResponseResult canDeposit(@jakarta.annotation.Nullable Boolean canDeposit) {
        this.canDeposit = canDeposit;
        return this;
    }

    /**
     * Get canDeposit
     *
     * @return canDeposit
     */
    @jakarta.annotation.Nullable
    public Boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(@jakarta.annotation.Nullable Boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public AccountStatusResponseResult commissionRates(
            @jakarta.annotation.Nullable
                    AccountStatusResponseResultCommissionRates commissionRates) {
        this.commissionRates = commissionRates;
        return this;
    }

    /**
     * Get commissionRates
     *
     * @return commissionRates
     */
    @jakarta.annotation.Nullable
    @Valid
    public AccountStatusResponseResultCommissionRates getCommissionRates() {
        return commissionRates;
    }

    public void setCommissionRates(
            @jakarta.annotation.Nullable
                    AccountStatusResponseResultCommissionRates commissionRates) {
        this.commissionRates = commissionRates;
    }

    public AccountStatusResponseResult brokered(@jakarta.annotation.Nullable Boolean brokered) {
        this.brokered = brokered;
        return this;
    }

    /**
     * Get brokered
     *
     * @return brokered
     */
    @jakarta.annotation.Nullable
    public Boolean getBrokered() {
        return brokered;
    }

    public void setBrokered(@jakarta.annotation.Nullable Boolean brokered) {
        this.brokered = brokered;
    }

    public AccountStatusResponseResult requireSelfTradePrevention(
            @jakarta.annotation.Nullable Boolean requireSelfTradePrevention) {
        this.requireSelfTradePrevention = requireSelfTradePrevention;
        return this;
    }

    /**
     * Get requireSelfTradePrevention
     *
     * @return requireSelfTradePrevention
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSelfTradePrevention() {
        return requireSelfTradePrevention;
    }

    public void setRequireSelfTradePrevention(
            @jakarta.annotation.Nullable Boolean requireSelfTradePrevention) {
        this.requireSelfTradePrevention = requireSelfTradePrevention;
    }

    public AccountStatusResponseResult preventSor(@jakarta.annotation.Nullable Boolean preventSor) {
        this.preventSor = preventSor;
        return this;
    }

    /**
     * Get preventSor
     *
     * @return preventSor
     */
    @jakarta.annotation.Nullable
    public Boolean getPreventSor() {
        return preventSor;
    }

    public void setPreventSor(@jakarta.annotation.Nullable Boolean preventSor) {
        this.preventSor = preventSor;
    }

    public AccountStatusResponseResult updateTime(@jakarta.annotation.Nullable Long updateTime) {
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

    public AccountStatusResponseResult accountType(
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

    public AccountStatusResponseResult balances(
            @jakarta.annotation.Nullable
                    List<@Valid AccountStatusResponseResultBalancesInner> balances) {
        this.balances = balances;
        return this;
    }

    public AccountStatusResponseResult addBalancesItem(
            AccountStatusResponseResultBalancesInner balancesItem) {
        if (this.balances == null) {
            this.balances = new ArrayList<>();
        }
        this.balances.add(balancesItem);
        return this;
    }

    /**
     * Get balances
     *
     * @return balances
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid AccountStatusResponseResultBalancesInner> getBalances() {
        return balances;
    }

    public void setBalances(
            @jakarta.annotation.Nullable
                    List<@Valid AccountStatusResponseResultBalancesInner> balances) {
        this.balances = balances;
    }

    public AccountStatusResponseResult permissions(
            @jakarta.annotation.Nullable List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public AccountStatusResponseResult addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     */
    @jakarta.annotation.Nullable
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(@jakarta.annotation.Nullable List<String> permissions) {
        this.permissions = permissions;
    }

    public AccountStatusResponseResult uid(@jakarta.annotation.Nullable Long uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get uid
     *
     * @return uid
     */
    @jakarta.annotation.Nullable
    public Long getUid() {
        return uid;
    }

    public void setUid(@jakarta.annotation.Nullable Long uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountStatusResponseResult accountStatusResponseResult = (AccountStatusResponseResult) o;
        return Objects.equals(this.makerCommission, accountStatusResponseResult.makerCommission)
                && Objects.equals(this.takerCommission, accountStatusResponseResult.takerCommission)
                && Objects.equals(this.buyerCommission, accountStatusResponseResult.buyerCommission)
                && Objects.equals(
                        this.sellerCommission, accountStatusResponseResult.sellerCommission)
                && Objects.equals(this.canTrade, accountStatusResponseResult.canTrade)
                && Objects.equals(this.canWithdraw, accountStatusResponseResult.canWithdraw)
                && Objects.equals(this.canDeposit, accountStatusResponseResult.canDeposit)
                && Objects.equals(this.commissionRates, accountStatusResponseResult.commissionRates)
                && Objects.equals(this.brokered, accountStatusResponseResult.brokered)
                && Objects.equals(
                        this.requireSelfTradePrevention,
                        accountStatusResponseResult.requireSelfTradePrevention)
                && Objects.equals(this.preventSor, accountStatusResponseResult.preventSor)
                && Objects.equals(this.updateTime, accountStatusResponseResult.updateTime)
                && Objects.equals(this.accountType, accountStatusResponseResult.accountType)
                && Objects.equals(this.balances, accountStatusResponseResult.balances)
                && Objects.equals(this.permissions, accountStatusResponseResult.permissions)
                && Objects.equals(this.uid, accountStatusResponseResult.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                makerCommission,
                takerCommission,
                buyerCommission,
                sellerCommission,
                canTrade,
                canWithdraw,
                canDeposit,
                commissionRates,
                brokered,
                requireSelfTradePrevention,
                preventSor,
                updateTime,
                accountType,
                balances,
                permissions,
                uid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountStatusResponseResult {\n");
        sb.append("		makerCommission: ").append(toIndentedString(makerCommission)).append("\n");
        sb.append("		takerCommission: ").append(toIndentedString(takerCommission)).append("\n");
        sb.append("		buyerCommission: ").append(toIndentedString(buyerCommission)).append("\n");
        sb.append("		sellerCommission: ").append(toIndentedString(sellerCommission)).append("\n");
        sb.append("		canTrade: ").append(toIndentedString(canTrade)).append("\n");
        sb.append("		canWithdraw: ").append(toIndentedString(canWithdraw)).append("\n");
        sb.append("		canDeposit: ").append(toIndentedString(canDeposit)).append("\n");
        sb.append("		commissionRates: ").append(toIndentedString(commissionRates)).append("\n");
        sb.append("		brokered: ").append(toIndentedString(brokered)).append("\n");
        sb.append("		requireSelfTradePrevention: ")
                .append(toIndentedString(requireSelfTradePrevention))
                .append("\n");
        sb.append("		preventSor: ").append(toIndentedString(preventSor)).append("\n");
        sb.append("		updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("		accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("		balances: ").append(toIndentedString(balances)).append("\n");
        sb.append("		permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("		uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        Long makerCommissionValue = getMakerCommission();
        if (makerCommissionValue != null) {
            String makerCommissionValueAsString = makerCommissionValue.toString();
            valMap.put("makerCommission", makerCommissionValueAsString);
        }
        Long takerCommissionValue = getTakerCommission();
        if (takerCommissionValue != null) {
            String takerCommissionValueAsString = takerCommissionValue.toString();
            valMap.put("takerCommission", takerCommissionValueAsString);
        }
        Long buyerCommissionValue = getBuyerCommission();
        if (buyerCommissionValue != null) {
            String buyerCommissionValueAsString = buyerCommissionValue.toString();
            valMap.put("buyerCommission", buyerCommissionValueAsString);
        }
        Long sellerCommissionValue = getSellerCommission();
        if (sellerCommissionValue != null) {
            String sellerCommissionValueAsString = sellerCommissionValue.toString();
            valMap.put("sellerCommission", sellerCommissionValueAsString);
        }
        Boolean canTradeValue = getCanTrade();
        if (canTradeValue != null) {
            String canTradeValueAsString = canTradeValue.toString();
            valMap.put("canTrade", canTradeValueAsString);
        }
        Boolean canWithdrawValue = getCanWithdraw();
        if (canWithdrawValue != null) {
            String canWithdrawValueAsString = canWithdrawValue.toString();
            valMap.put("canWithdraw", canWithdrawValueAsString);
        }
        Boolean canDepositValue = getCanDeposit();
        if (canDepositValue != null) {
            String canDepositValueAsString = canDepositValue.toString();
            valMap.put("canDeposit", canDepositValueAsString);
        }
        AccountStatusResponseResultCommissionRates commissionRatesValue = getCommissionRates();
        if (commissionRatesValue != null) {
            String commissionRatesValueAsString = JSON.getGson().toJson(commissionRatesValue);
            valMap.put("commissionRates", commissionRatesValueAsString);
        }
        Boolean brokeredValue = getBrokered();
        if (brokeredValue != null) {
            String brokeredValueAsString = brokeredValue.toString();
            valMap.put("brokered", brokeredValueAsString);
        }
        Boolean requireSelfTradePreventionValue = getRequireSelfTradePrevention();
        if (requireSelfTradePreventionValue != null) {
            String requireSelfTradePreventionValueAsString =
                    requireSelfTradePreventionValue.toString();
            valMap.put("requireSelfTradePrevention", requireSelfTradePreventionValueAsString);
        }
        Boolean preventSorValue = getPreventSor();
        if (preventSorValue != null) {
            String preventSorValueAsString = preventSorValue.toString();
            valMap.put("preventSor", preventSorValueAsString);
        }
        Long updateTimeValue = getUpdateTime();
        if (updateTimeValue != null) {
            String updateTimeValueAsString = updateTimeValue.toString();
            valMap.put("updateTime", updateTimeValueAsString);
        }
        String accountTypeValue = getAccountType();
        if (accountTypeValue != null) {
            String accountTypeValueAsString = accountTypeValue.toString();
            valMap.put("accountType", accountTypeValueAsString);
        }
        List<@Valid AccountStatusResponseResultBalancesInner> balancesValue = getBalances();
        if (balancesValue != null) {
            String balancesValueAsString = JSON.getGson().toJson(balancesValue);
            valMap.put("balances", balancesValueAsString);
        }
        List<String> permissionsValue = getPermissions();
        if (permissionsValue != null) {
            String permissionsValueAsString = permissionsValue.toString();
            valMap.put("permissions", permissionsValueAsString);
        }
        Long uidValue = getUid();
        if (uidValue != null) {
            String uidValueAsString = uidValue.toString();
            valMap.put("uid", uidValueAsString);
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
        Object makerCommissionValue = getMakerCommission();
        if (makerCommissionValue != null) {
            valMap.put("makerCommission", makerCommissionValue);
        }
        Object takerCommissionValue = getTakerCommission();
        if (takerCommissionValue != null) {
            valMap.put("takerCommission", takerCommissionValue);
        }
        Object buyerCommissionValue = getBuyerCommission();
        if (buyerCommissionValue != null) {
            valMap.put("buyerCommission", buyerCommissionValue);
        }
        Object sellerCommissionValue = getSellerCommission();
        if (sellerCommissionValue != null) {
            valMap.put("sellerCommission", sellerCommissionValue);
        }
        Object canTradeValue = getCanTrade();
        if (canTradeValue != null) {
            valMap.put("canTrade", canTradeValue);
        }
        Object canWithdrawValue = getCanWithdraw();
        if (canWithdrawValue != null) {
            valMap.put("canWithdraw", canWithdrawValue);
        }
        Object canDepositValue = getCanDeposit();
        if (canDepositValue != null) {
            valMap.put("canDeposit", canDepositValue);
        }
        Object commissionRatesValue = getCommissionRates();
        if (commissionRatesValue != null) {
            valMap.put("commissionRates", commissionRatesValue);
        }
        Object brokeredValue = getBrokered();
        if (brokeredValue != null) {
            valMap.put("brokered", brokeredValue);
        }
        Object requireSelfTradePreventionValue = getRequireSelfTradePrevention();
        if (requireSelfTradePreventionValue != null) {
            valMap.put("requireSelfTradePrevention", requireSelfTradePreventionValue);
        }
        Object preventSorValue = getPreventSor();
        if (preventSorValue != null) {
            valMap.put("preventSor", preventSorValue);
        }
        Object updateTimeValue = getUpdateTime();
        if (updateTimeValue != null) {
            valMap.put("updateTime", updateTimeValue);
        }
        Object accountTypeValue = getAccountType();
        if (accountTypeValue != null) {
            valMap.put("accountType", accountTypeValue);
        }
        Object balancesValue = getBalances();
        if (balancesValue != null) {
            valMap.put("balances", balancesValue);
        }
        Object permissionsValue = getPermissions();
        if (permissionsValue != null) {
            valMap.put("permissions", permissionsValue);
        }
        Object uidValue = getUid();
        if (uidValue != null) {
            valMap.put("uid", uidValue);
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
        openapiFields.add("makerCommission");
        openapiFields.add("takerCommission");
        openapiFields.add("buyerCommission");
        openapiFields.add("sellerCommission");
        openapiFields.add("canTrade");
        openapiFields.add("canWithdraw");
        openapiFields.add("canDeposit");
        openapiFields.add("commissionRates");
        openapiFields.add("brokered");
        openapiFields.add("requireSelfTradePrevention");
        openapiFields.add("preventSor");
        openapiFields.add("updateTime");
        openapiFields.add("accountType");
        openapiFields.add("balances");
        openapiFields.add("permissions");
        openapiFields.add("uid");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AccountStatusResponseResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountStatusResponseResult.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccountStatusResponseResult is not"
                                        + " found in the empty JSON string",
                                AccountStatusResponseResult.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AccountStatusResponseResult.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AccountStatusResponseResult` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `commissionRates`
        if (jsonObj.get("commissionRates") != null
                && !jsonObj.get("commissionRates").isJsonNull()) {
            AccountStatusResponseResultCommissionRates.validateJsonElement(
                    jsonObj.get("commissionRates"));
        }
        if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull())
                && !jsonObj.get("accountType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `accountType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("accountType").toString()));
        }
        if (jsonObj.get("balances") != null && !jsonObj.get("balances").isJsonNull()) {
            JsonArray jsonArraybalances = jsonObj.getAsJsonArray("balances");
            if (jsonArraybalances != null) {
                // ensure the json data is an array
                if (!jsonObj.get("balances").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `balances` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("balances").toString()));
                }

                // validate the optional field `balances` (array)
                for (int i = 0; i < jsonArraybalances.size(); i++) {
                    AccountStatusResponseResultBalancesInner.validateJsonElement(
                            jsonArraybalances.get(i));
                }
                ;
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("permissions") != null
                && !jsonObj.get("permissions").isJsonNull()
                && !jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `permissions` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("permissions").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccountStatusResponseResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccountStatusResponseResult' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountStatusResponseResult> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AccountStatusResponseResult.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountStatusResponseResult>() {
                        @Override
                        public void write(JsonWriter out, AccountStatusResponseResult value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountStatusResponseResult read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountStatusResponseResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountStatusResponseResult
     * @throws IOException if the JSON string is invalid with respect to AccountStatusResponseResult
     */
    public static AccountStatusResponseResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccountStatusResponseResult.class);
    }

    /**
     * Convert an instance of AccountStatusResponseResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
