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

/** QueryCurrentMarginOpenOrderResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryCurrentMarginOpenOrderResponseInner {
    public static final String SERIALIZED_NAME_CLIENT_ORDER_ID = "clientOrderId";

    @SerializedName(SERIALIZED_NAME_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String clientOrderId;

    public static final String SERIALIZED_NAME_CUMMULATIVE_QUOTE_QTY = "cummulativeQuoteQty";

    @SerializedName(SERIALIZED_NAME_CUMMULATIVE_QUOTE_QTY)
    @jakarta.annotation.Nullable
    private String cummulativeQuoteQty;

    public static final String SERIALIZED_NAME_EXECUTED_QTY = "executedQty";

    @SerializedName(SERIALIZED_NAME_EXECUTED_QTY)
    @jakarta.annotation.Nullable
    private String executedQty;

    public static final String SERIALIZED_NAME_ICEBERG_QTY = "icebergQty";

    @SerializedName(SERIALIZED_NAME_ICEBERG_QTY)
    @jakarta.annotation.Nullable
    private String icebergQty;

    public static final String SERIALIZED_NAME_IS_WORKING = "isWorking";

    @SerializedName(SERIALIZED_NAME_IS_WORKING)
    @jakarta.annotation.Nullable
    private Boolean isWorking;

    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nullable
    private Long orderId;

    public static final String SERIALIZED_NAME_ORIG_QTY = "origQty";

    @SerializedName(SERIALIZED_NAME_ORIG_QTY)
    @jakarta.annotation.Nullable
    private String origQty;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private String price;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nullable
    private String side;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private String status;

    public static final String SERIALIZED_NAME_STOP_PRICE = "stopPrice";

    @SerializedName(SERIALIZED_NAME_STOP_PRICE)
    @jakarta.annotation.Nullable
    private String stopPrice;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_TIME = "time";

    @SerializedName(SERIALIZED_NAME_TIME)
    @jakarta.annotation.Nullable
    private Long time;

    public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";

    @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
    @jakarta.annotation.Nullable
    private String timeInForce;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    @jakarta.annotation.Nullable
    private Long accountId;

    public static final String SERIALIZED_NAME_SELF_TRADE_PREVENTION_MODE =
            "selfTradePreventionMode";

    @SerializedName(SERIALIZED_NAME_SELF_TRADE_PREVENTION_MODE)
    @jakarta.annotation.Nullable
    private String selfTradePreventionMode;

    public static final String SERIALIZED_NAME_PREVENTED_MATCH_ID = "preventedMatchId";

    @SerializedName(SERIALIZED_NAME_PREVENTED_MATCH_ID)
    @jakarta.annotation.Nullable
    private String preventedMatchId;

    public static final String SERIALIZED_NAME_PREVENTED_QUANTITY = "preventedQuantity";

    @SerializedName(SERIALIZED_NAME_PREVENTED_QUANTITY)
    @jakarta.annotation.Nullable
    private String preventedQuantity;

    public QueryCurrentMarginOpenOrderResponseInner() {}

    public QueryCurrentMarginOpenOrderResponseInner clientOrderId(
            @jakarta.annotation.Nullable String clientOrderId) {
        this.clientOrderId = clientOrderId;
        return this;
    }

    /**
     * Get clientOrderId
     *
     * @return clientOrderId
     */
    @jakarta.annotation.Nullable
    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(@jakarta.annotation.Nullable String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public QueryCurrentMarginOpenOrderResponseInner cummulativeQuoteQty(
            @jakarta.annotation.Nullable String cummulativeQuoteQty) {
        this.cummulativeQuoteQty = cummulativeQuoteQty;
        return this;
    }

    /**
     * Get cummulativeQuoteQty
     *
     * @return cummulativeQuoteQty
     */
    @jakarta.annotation.Nullable
    public String getCummulativeQuoteQty() {
        return cummulativeQuoteQty;
    }

    public void setCummulativeQuoteQty(@jakarta.annotation.Nullable String cummulativeQuoteQty) {
        this.cummulativeQuoteQty = cummulativeQuoteQty;
    }

    public QueryCurrentMarginOpenOrderResponseInner executedQty(
            @jakarta.annotation.Nullable String executedQty) {
        this.executedQty = executedQty;
        return this;
    }

    /**
     * Get executedQty
     *
     * @return executedQty
     */
    @jakarta.annotation.Nullable
    public String getExecutedQty() {
        return executedQty;
    }

    public void setExecutedQty(@jakarta.annotation.Nullable String executedQty) {
        this.executedQty = executedQty;
    }

    public QueryCurrentMarginOpenOrderResponseInner icebergQty(
            @jakarta.annotation.Nullable String icebergQty) {
        this.icebergQty = icebergQty;
        return this;
    }

    /**
     * Get icebergQty
     *
     * @return icebergQty
     */
    @jakarta.annotation.Nullable
    public String getIcebergQty() {
        return icebergQty;
    }

    public void setIcebergQty(@jakarta.annotation.Nullable String icebergQty) {
        this.icebergQty = icebergQty;
    }

    public QueryCurrentMarginOpenOrderResponseInner isWorking(
            @jakarta.annotation.Nullable Boolean isWorking) {
        this.isWorking = isWorking;
        return this;
    }

    /**
     * Get isWorking
     *
     * @return isWorking
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(@jakarta.annotation.Nullable Boolean isWorking) {
        this.isWorking = isWorking;
    }

    public QueryCurrentMarginOpenOrderResponseInner orderId(
            @jakarta.annotation.Nullable Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     */
    @jakarta.annotation.Nullable
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(@jakarta.annotation.Nullable Long orderId) {
        this.orderId = orderId;
    }

    public QueryCurrentMarginOpenOrderResponseInner origQty(
            @jakarta.annotation.Nullable String origQty) {
        this.origQty = origQty;
        return this;
    }

    /**
     * Get origQty
     *
     * @return origQty
     */
    @jakarta.annotation.Nullable
    public String getOrigQty() {
        return origQty;
    }

    public void setOrigQty(@jakarta.annotation.Nullable String origQty) {
        this.origQty = origQty;
    }

    public QueryCurrentMarginOpenOrderResponseInner price(
            @jakarta.annotation.Nullable String price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     */
    @jakarta.annotation.Nullable
    public String getPrice() {
        return price;
    }

    public void setPrice(@jakarta.annotation.Nullable String price) {
        this.price = price;
    }

    public QueryCurrentMarginOpenOrderResponseInner side(@jakarta.annotation.Nullable String side) {
        this.side = side;
        return this;
    }

    /**
     * Get side
     *
     * @return side
     */
    @jakarta.annotation.Nullable
    public String getSide() {
        return side;
    }

    public void setSide(@jakarta.annotation.Nullable String side) {
        this.side = side;
    }

    public QueryCurrentMarginOpenOrderResponseInner status(
            @jakarta.annotation.Nullable String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return status;
    }

    public void setStatus(@jakarta.annotation.Nullable String status) {
        this.status = status;
    }

    public QueryCurrentMarginOpenOrderResponseInner stopPrice(
            @jakarta.annotation.Nullable String stopPrice) {
        this.stopPrice = stopPrice;
        return this;
    }

    /**
     * Get stopPrice
     *
     * @return stopPrice
     */
    @jakarta.annotation.Nullable
    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(@jakarta.annotation.Nullable String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public QueryCurrentMarginOpenOrderResponseInner symbol(
            @jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nullable
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(@jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
    }

    public QueryCurrentMarginOpenOrderResponseInner time(@jakarta.annotation.Nullable Long time) {
        this.time = time;
        return this;
    }

    /**
     * Get time
     *
     * @return time
     */
    @jakarta.annotation.Nullable
    public Long getTime() {
        return time;
    }

    public void setTime(@jakarta.annotation.Nullable Long time) {
        this.time = time;
    }

    public QueryCurrentMarginOpenOrderResponseInner timeInForce(
            @jakarta.annotation.Nullable String timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Get timeInForce
     *
     * @return timeInForce
     */
    @jakarta.annotation.Nullable
    public String getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(@jakarta.annotation.Nullable String timeInForce) {
        this.timeInForce = timeInForce;
    }

    public QueryCurrentMarginOpenOrderResponseInner type(@jakarta.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@jakarta.annotation.Nullable String type) {
        this.type = type;
    }

    public QueryCurrentMarginOpenOrderResponseInner updateTime(
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

    public QueryCurrentMarginOpenOrderResponseInner accountId(
            @jakarta.annotation.Nullable Long accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     */
    @jakarta.annotation.Nullable
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(@jakarta.annotation.Nullable Long accountId) {
        this.accountId = accountId;
    }

    public QueryCurrentMarginOpenOrderResponseInner selfTradePreventionMode(
            @jakarta.annotation.Nullable String selfTradePreventionMode) {
        this.selfTradePreventionMode = selfTradePreventionMode;
        return this;
    }

    /**
     * Get selfTradePreventionMode
     *
     * @return selfTradePreventionMode
     */
    @jakarta.annotation.Nullable
    public String getSelfTradePreventionMode() {
        return selfTradePreventionMode;
    }

    public void setSelfTradePreventionMode(
            @jakarta.annotation.Nullable String selfTradePreventionMode) {
        this.selfTradePreventionMode = selfTradePreventionMode;
    }

    public QueryCurrentMarginOpenOrderResponseInner preventedMatchId(
            @jakarta.annotation.Nullable String preventedMatchId) {
        this.preventedMatchId = preventedMatchId;
        return this;
    }

    /**
     * Get preventedMatchId
     *
     * @return preventedMatchId
     */
    @jakarta.annotation.Nullable
    public String getPreventedMatchId() {
        return preventedMatchId;
    }

    public void setPreventedMatchId(@jakarta.annotation.Nullable String preventedMatchId) {
        this.preventedMatchId = preventedMatchId;
    }

    public QueryCurrentMarginOpenOrderResponseInner preventedQuantity(
            @jakarta.annotation.Nullable String preventedQuantity) {
        this.preventedQuantity = preventedQuantity;
        return this;
    }

    /**
     * Get preventedQuantity
     *
     * @return preventedQuantity
     */
    @jakarta.annotation.Nullable
    public String getPreventedQuantity() {
        return preventedQuantity;
    }

    public void setPreventedQuantity(@jakarta.annotation.Nullable String preventedQuantity) {
        this.preventedQuantity = preventedQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCurrentMarginOpenOrderResponseInner queryCurrentMarginOpenOrderResponseInner =
                (QueryCurrentMarginOpenOrderResponseInner) o;
        return Objects.equals(
                        this.clientOrderId, queryCurrentMarginOpenOrderResponseInner.clientOrderId)
                && Objects.equals(
                        this.cummulativeQuoteQty,
                        queryCurrentMarginOpenOrderResponseInner.cummulativeQuoteQty)
                && Objects.equals(
                        this.executedQty, queryCurrentMarginOpenOrderResponseInner.executedQty)
                && Objects.equals(
                        this.icebergQty, queryCurrentMarginOpenOrderResponseInner.icebergQty)
                && Objects.equals(
                        this.isWorking, queryCurrentMarginOpenOrderResponseInner.isWorking)
                && Objects.equals(this.orderId, queryCurrentMarginOpenOrderResponseInner.orderId)
                && Objects.equals(this.origQty, queryCurrentMarginOpenOrderResponseInner.origQty)
                && Objects.equals(this.price, queryCurrentMarginOpenOrderResponseInner.price)
                && Objects.equals(this.side, queryCurrentMarginOpenOrderResponseInner.side)
                && Objects.equals(this.status, queryCurrentMarginOpenOrderResponseInner.status)
                && Objects.equals(
                        this.stopPrice, queryCurrentMarginOpenOrderResponseInner.stopPrice)
                && Objects.equals(this.symbol, queryCurrentMarginOpenOrderResponseInner.symbol)
                && Objects.equals(this.time, queryCurrentMarginOpenOrderResponseInner.time)
                && Objects.equals(
                        this.timeInForce, queryCurrentMarginOpenOrderResponseInner.timeInForce)
                && Objects.equals(this.type, queryCurrentMarginOpenOrderResponseInner.type)
                && Objects.equals(
                        this.updateTime, queryCurrentMarginOpenOrderResponseInner.updateTime)
                && Objects.equals(
                        this.accountId, queryCurrentMarginOpenOrderResponseInner.accountId)
                && Objects.equals(
                        this.selfTradePreventionMode,
                        queryCurrentMarginOpenOrderResponseInner.selfTradePreventionMode)
                && Objects.equals(
                        this.preventedMatchId,
                        queryCurrentMarginOpenOrderResponseInner.preventedMatchId)
                && Objects.equals(
                        this.preventedQuantity,
                        queryCurrentMarginOpenOrderResponseInner.preventedQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientOrderId,
                cummulativeQuoteQty,
                executedQty,
                icebergQty,
                isWorking,
                orderId,
                origQty,
                price,
                side,
                status,
                stopPrice,
                symbol,
                time,
                timeInForce,
                type,
                updateTime,
                accountId,
                selfTradePreventionMode,
                preventedMatchId,
                preventedQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCurrentMarginOpenOrderResponseInner {\n");
        sb.append("		clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
        sb.append("		cummulativeQuoteQty: ")
                .append(toIndentedString(cummulativeQuoteQty))
                .append("\n");
        sb.append("		executedQty: ").append(toIndentedString(executedQty)).append("\n");
        sb.append("		icebergQty: ").append(toIndentedString(icebergQty)).append("\n");
        sb.append("		isWorking: ").append(toIndentedString(isWorking)).append("\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		origQty: ").append(toIndentedString(origQty)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		stopPrice: ").append(toIndentedString(stopPrice)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		time: ").append(toIndentedString(time)).append("\n");
        sb.append("		timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("		accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("		selfTradePreventionMode: ")
                .append(toIndentedString(selfTradePreventionMode))
                .append("\n");
        sb.append("		preventedMatchId: ").append(toIndentedString(preventedMatchId)).append("\n");
        sb.append("		preventedQuantity: ").append(toIndentedString(preventedQuantity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object clientOrderIdValue = getClientOrderId();
        String clientOrderIdValueAsString = "";
        clientOrderIdValueAsString = clientOrderIdValue.toString();
        sb.append("clientOrderId=").append(urlEncode(clientOrderIdValueAsString)).append("");
        Object cummulativeQuoteQtyValue = getCummulativeQuoteQty();
        String cummulativeQuoteQtyValueAsString = "";
        cummulativeQuoteQtyValueAsString = cummulativeQuoteQtyValue.toString();
        sb.append("cummulativeQuoteQty=")
                .append(urlEncode(cummulativeQuoteQtyValueAsString))
                .append("");
        Object executedQtyValue = getExecutedQty();
        String executedQtyValueAsString = "";
        executedQtyValueAsString = executedQtyValue.toString();
        sb.append("executedQty=").append(urlEncode(executedQtyValueAsString)).append("");
        Object icebergQtyValue = getIcebergQty();
        String icebergQtyValueAsString = "";
        icebergQtyValueAsString = icebergQtyValue.toString();
        sb.append("icebergQty=").append(urlEncode(icebergQtyValueAsString)).append("");
        Object isWorkingValue = getIsWorking();
        String isWorkingValueAsString = "";
        isWorkingValueAsString = isWorkingValue.toString();
        sb.append("isWorking=").append(urlEncode(isWorkingValueAsString)).append("");
        Object orderIdValue = getOrderId();
        String orderIdValueAsString = "";
        orderIdValueAsString = orderIdValue.toString();
        sb.append("orderId=").append(urlEncode(orderIdValueAsString)).append("");
        Object origQtyValue = getOrigQty();
        String origQtyValueAsString = "";
        origQtyValueAsString = origQtyValue.toString();
        sb.append("origQty=").append(urlEncode(origQtyValueAsString)).append("");
        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
        Object sideValue = getSide();
        String sideValueAsString = "";
        sideValueAsString = sideValue.toString();
        sb.append("side=").append(urlEncode(sideValueAsString)).append("");
        Object statusValue = getStatus();
        String statusValueAsString = "";
        statusValueAsString = statusValue.toString();
        sb.append("status=").append(urlEncode(statusValueAsString)).append("");
        Object stopPriceValue = getStopPrice();
        String stopPriceValueAsString = "";
        stopPriceValueAsString = stopPriceValue.toString();
        sb.append("stopPrice=").append(urlEncode(stopPriceValueAsString)).append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object timeValue = getTime();
        String timeValueAsString = "";
        timeValueAsString = timeValue.toString();
        sb.append("time=").append(urlEncode(timeValueAsString)).append("");
        Object timeInForceValue = getTimeInForce();
        String timeInForceValueAsString = "";
        timeInForceValueAsString = timeInForceValue.toString();
        sb.append("timeInForce=").append(urlEncode(timeInForceValueAsString)).append("");
        Object typeValue = getType();
        String typeValueAsString = "";
        typeValueAsString = typeValue.toString();
        sb.append("type=").append(urlEncode(typeValueAsString)).append("");
        Object updateTimeValue = getUpdateTime();
        String updateTimeValueAsString = "";
        updateTimeValueAsString = updateTimeValue.toString();
        sb.append("updateTime=").append(urlEncode(updateTimeValueAsString)).append("");
        Object accountIdValue = getAccountId();
        String accountIdValueAsString = "";
        accountIdValueAsString = accountIdValue.toString();
        sb.append("accountId=").append(urlEncode(accountIdValueAsString)).append("");
        Object selfTradePreventionModeValue = getSelfTradePreventionMode();
        String selfTradePreventionModeValueAsString = "";
        selfTradePreventionModeValueAsString = selfTradePreventionModeValue.toString();
        sb.append("selfTradePreventionMode=")
                .append(urlEncode(selfTradePreventionModeValueAsString))
                .append("");
        Object preventedMatchIdValue = getPreventedMatchId();
        String preventedMatchIdValueAsString = "";
        preventedMatchIdValueAsString = preventedMatchIdValue.toString();
        sb.append("preventedMatchId=").append(urlEncode(preventedMatchIdValueAsString)).append("");
        Object preventedQuantityValue = getPreventedQuantity();
        String preventedQuantityValueAsString = "";
        preventedQuantityValueAsString = preventedQuantityValue.toString();
        sb.append("preventedQuantity=")
                .append(urlEncode(preventedQuantityValueAsString))
                .append("");
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
        openapiFields.add("clientOrderId");
        openapiFields.add("cummulativeQuoteQty");
        openapiFields.add("executedQty");
        openapiFields.add("icebergQty");
        openapiFields.add("isWorking");
        openapiFields.add("orderId");
        openapiFields.add("origQty");
        openapiFields.add("price");
        openapiFields.add("side");
        openapiFields.add("status");
        openapiFields.add("stopPrice");
        openapiFields.add("symbol");
        openapiFields.add("time");
        openapiFields.add("timeInForce");
        openapiFields.add("type");
        openapiFields.add("updateTime");
        openapiFields.add("accountId");
        openapiFields.add("selfTradePreventionMode");
        openapiFields.add("preventedMatchId");
        openapiFields.add("preventedQuantity");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryCurrentMarginOpenOrderResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryCurrentMarginOpenOrderResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " QueryCurrentMarginOpenOrderResponseInner is not found in"
                                    + " the empty JSON string",
                                QueryCurrentMarginOpenOrderResponseInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("clientOrderId") != null && !jsonObj.get("clientOrderId").isJsonNull())
                && !jsonObj.get("clientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `clientOrderId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("clientOrderId").toString()));
        }
        if ((jsonObj.get("cummulativeQuoteQty") != null
                        && !jsonObj.get("cummulativeQuoteQty").isJsonNull())
                && !jsonObj.get("cummulativeQuoteQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cummulativeQuoteQty` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("cummulativeQuoteQty").toString()));
        }
        if ((jsonObj.get("executedQty") != null && !jsonObj.get("executedQty").isJsonNull())
                && !jsonObj.get("executedQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `executedQty` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("executedQty").toString()));
        }
        if ((jsonObj.get("icebergQty") != null && !jsonObj.get("icebergQty").isJsonNull())
                && !jsonObj.get("icebergQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `icebergQty` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("icebergQty").toString()));
        }
        if ((jsonObj.get("origQty") != null && !jsonObj.get("origQty").isJsonNull())
                && !jsonObj.get("origQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `origQty` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("origQty").toString()));
        }
        if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull())
                && !jsonObj.get("price").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `price` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("price").toString()));
        }
        if ((jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull())
                && !jsonObj.get("side").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `side` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("side").toString()));
        }
        if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull())
                && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
        if ((jsonObj.get("stopPrice") != null && !jsonObj.get("stopPrice").isJsonNull())
                && !jsonObj.get("stopPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `stopPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("stopPrice").toString()));
        }
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        if ((jsonObj.get("timeInForce") != null && !jsonObj.get("timeInForce").isJsonNull())
                && !jsonObj.get("timeInForce").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `timeInForce` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("timeInForce").toString()));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("selfTradePreventionMode") != null
                        && !jsonObj.get("selfTradePreventionMode").isJsonNull())
                && !jsonObj.get("selfTradePreventionMode").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `selfTradePreventionMode` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("selfTradePreventionMode").toString()));
        }
        if ((jsonObj.get("preventedMatchId") != null
                        && !jsonObj.get("preventedMatchId").isJsonNull())
                && !jsonObj.get("preventedMatchId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `preventedMatchId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("preventedMatchId").toString()));
        }
        if ((jsonObj.get("preventedQuantity") != null
                        && !jsonObj.get("preventedQuantity").isJsonNull())
                && !jsonObj.get("preventedQuantity").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `preventedQuantity` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("preventedQuantity").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryCurrentMarginOpenOrderResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'QueryCurrentMarginOpenOrderResponseInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryCurrentMarginOpenOrderResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(QueryCurrentMarginOpenOrderResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryCurrentMarginOpenOrderResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, QueryCurrentMarginOpenOrderResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryCurrentMarginOpenOrderResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryCurrentMarginOpenOrderResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryCurrentMarginOpenOrderResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryCurrentMarginOpenOrderResponseInner
     */
    public static QueryCurrentMarginOpenOrderResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, QueryCurrentMarginOpenOrderResponseInner.class);
    }

    /**
     * Convert an instance of QueryCurrentMarginOpenOrderResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
