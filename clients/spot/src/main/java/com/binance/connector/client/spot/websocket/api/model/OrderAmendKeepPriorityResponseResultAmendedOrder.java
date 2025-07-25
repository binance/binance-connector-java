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

/** OrderAmendKeepPriorityResponseResultAmendedOrder */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OrderAmendKeepPriorityResponseResultAmendedOrder extends BaseDTO {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nullable
    private Long orderId;

    public static final String SERIALIZED_NAME_ORDER_LIST_ID = "orderListId";

    @SerializedName(SERIALIZED_NAME_ORDER_LIST_ID)
    @jakarta.annotation.Nullable
    private Long orderListId;

    public static final String SERIALIZED_NAME_ORIG_CLIENT_ORDER_ID = "origClientOrderId";

    @SerializedName(SERIALIZED_NAME_ORIG_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String origClientOrderId;

    public static final String SERIALIZED_NAME_CLIENT_ORDER_ID = "clientOrderId";

    @SerializedName(SERIALIZED_NAME_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String clientOrderId;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private String price;

    public static final String SERIALIZED_NAME_QTY = "qty";

    @SerializedName(SERIALIZED_NAME_QTY)
    @jakarta.annotation.Nullable
    private String qty;

    public static final String SERIALIZED_NAME_EXECUTED_QTY = "executedQty";

    @SerializedName(SERIALIZED_NAME_EXECUTED_QTY)
    @jakarta.annotation.Nullable
    private String executedQty;

    public static final String SERIALIZED_NAME_PREVENTED_QTY = "preventedQty";

    @SerializedName(SERIALIZED_NAME_PREVENTED_QTY)
    @jakarta.annotation.Nullable
    private String preventedQty;

    public static final String SERIALIZED_NAME_QUOTE_ORDER_QTY = "quoteOrderQty";

    @SerializedName(SERIALIZED_NAME_QUOTE_ORDER_QTY)
    @jakarta.annotation.Nullable
    private String quoteOrderQty;

    public static final String SERIALIZED_NAME_CUMULATIVE_QUOTE_QTY = "cumulativeQuoteQty";

    @SerializedName(SERIALIZED_NAME_CUMULATIVE_QUOTE_QTY)
    @jakarta.annotation.Nullable
    private String cumulativeQuoteQty;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private String status;

    public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";

    @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
    @jakarta.annotation.Nullable
    private String timeInForce;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nullable
    private String side;

    public static final String SERIALIZED_NAME_WORKING_TIME = "workingTime";

    @SerializedName(SERIALIZED_NAME_WORKING_TIME)
    @jakarta.annotation.Nullable
    private Long workingTime;

    public static final String SERIALIZED_NAME_SELF_TRADE_PREVENTION_MODE =
            "selfTradePreventionMode";

    @SerializedName(SERIALIZED_NAME_SELF_TRADE_PREVENTION_MODE)
    @jakarta.annotation.Nullable
    private String selfTradePreventionMode;

    public OrderAmendKeepPriorityResponseResultAmendedOrder() {}

    public OrderAmendKeepPriorityResponseResultAmendedOrder symbol(
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder orderId(
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder orderListId(
            @jakarta.annotation.Nullable Long orderListId) {
        this.orderListId = orderListId;
        return this;
    }

    /**
     * Get orderListId
     *
     * @return orderListId
     */
    @jakarta.annotation.Nullable
    public Long getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(@jakarta.annotation.Nullable Long orderListId) {
        this.orderListId = orderListId;
    }

    public OrderAmendKeepPriorityResponseResultAmendedOrder origClientOrderId(
            @jakarta.annotation.Nullable String origClientOrderId) {
        this.origClientOrderId = origClientOrderId;
        return this;
    }

    /**
     * Get origClientOrderId
     *
     * @return origClientOrderId
     */
    @jakarta.annotation.Nullable
    public String getOrigClientOrderId() {
        return origClientOrderId;
    }

    public void setOrigClientOrderId(@jakarta.annotation.Nullable String origClientOrderId) {
        this.origClientOrderId = origClientOrderId;
    }

    public OrderAmendKeepPriorityResponseResultAmendedOrder clientOrderId(
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder price(
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder qty(
            @jakarta.annotation.Nullable String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     */
    @jakarta.annotation.Nullable
    public String getQty() {
        return qty;
    }

    public void setQty(@jakarta.annotation.Nullable String qty) {
        this.qty = qty;
    }

    public OrderAmendKeepPriorityResponseResultAmendedOrder executedQty(
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder preventedQty(
            @jakarta.annotation.Nullable String preventedQty) {
        this.preventedQty = preventedQty;
        return this;
    }

    /**
     * Get preventedQty
     *
     * @return preventedQty
     */
    @jakarta.annotation.Nullable
    public String getPreventedQty() {
        return preventedQty;
    }

    public void setPreventedQty(@jakarta.annotation.Nullable String preventedQty) {
        this.preventedQty = preventedQty;
    }

    public OrderAmendKeepPriorityResponseResultAmendedOrder quoteOrderQty(
            @jakarta.annotation.Nullable String quoteOrderQty) {
        this.quoteOrderQty = quoteOrderQty;
        return this;
    }

    /**
     * Get quoteOrderQty
     *
     * @return quoteOrderQty
     */
    @jakarta.annotation.Nullable
    public String getQuoteOrderQty() {
        return quoteOrderQty;
    }

    public void setQuoteOrderQty(@jakarta.annotation.Nullable String quoteOrderQty) {
        this.quoteOrderQty = quoteOrderQty;
    }

    public OrderAmendKeepPriorityResponseResultAmendedOrder cumulativeQuoteQty(
            @jakarta.annotation.Nullable String cumulativeQuoteQty) {
        this.cumulativeQuoteQty = cumulativeQuoteQty;
        return this;
    }

    /**
     * Get cumulativeQuoteQty
     *
     * @return cumulativeQuoteQty
     */
    @jakarta.annotation.Nullable
    public String getCumulativeQuoteQty() {
        return cumulativeQuoteQty;
    }

    public void setCumulativeQuoteQty(@jakarta.annotation.Nullable String cumulativeQuoteQty) {
        this.cumulativeQuoteQty = cumulativeQuoteQty;
    }

    public OrderAmendKeepPriorityResponseResultAmendedOrder status(
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder timeInForce(
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder type(
            @jakarta.annotation.Nullable String type) {
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder side(
            @jakarta.annotation.Nullable String side) {
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

    public OrderAmendKeepPriorityResponseResultAmendedOrder workingTime(
            @jakarta.annotation.Nullable Long workingTime) {
        this.workingTime = workingTime;
        return this;
    }

    /**
     * Get workingTime
     *
     * @return workingTime
     */
    @jakarta.annotation.Nullable
    public Long getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(@jakarta.annotation.Nullable Long workingTime) {
        this.workingTime = workingTime;
    }

    public OrderAmendKeepPriorityResponseResultAmendedOrder selfTradePreventionMode(
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderAmendKeepPriorityResponseResultAmendedOrder
                orderAmendKeepPriorityResponseResultAmendedOrder =
                        (OrderAmendKeepPriorityResponseResultAmendedOrder) o;
        return Objects.equals(this.symbol, orderAmendKeepPriorityResponseResultAmendedOrder.symbol)
                && Objects.equals(
                        this.orderId, orderAmendKeepPriorityResponseResultAmendedOrder.orderId)
                && Objects.equals(
                        this.orderListId,
                        orderAmendKeepPriorityResponseResultAmendedOrder.orderListId)
                && Objects.equals(
                        this.origClientOrderId,
                        orderAmendKeepPriorityResponseResultAmendedOrder.origClientOrderId)
                && Objects.equals(
                        this.clientOrderId,
                        orderAmendKeepPriorityResponseResultAmendedOrder.clientOrderId)
                && Objects.equals(
                        this.price, orderAmendKeepPriorityResponseResultAmendedOrder.price)
                && Objects.equals(this.qty, orderAmendKeepPriorityResponseResultAmendedOrder.qty)
                && Objects.equals(
                        this.executedQty,
                        orderAmendKeepPriorityResponseResultAmendedOrder.executedQty)
                && Objects.equals(
                        this.preventedQty,
                        orderAmendKeepPriorityResponseResultAmendedOrder.preventedQty)
                && Objects.equals(
                        this.quoteOrderQty,
                        orderAmendKeepPriorityResponseResultAmendedOrder.quoteOrderQty)
                && Objects.equals(
                        this.cumulativeQuoteQty,
                        orderAmendKeepPriorityResponseResultAmendedOrder.cumulativeQuoteQty)
                && Objects.equals(
                        this.status, orderAmendKeepPriorityResponseResultAmendedOrder.status)
                && Objects.equals(
                        this.timeInForce,
                        orderAmendKeepPriorityResponseResultAmendedOrder.timeInForce)
                && Objects.equals(this.type, orderAmendKeepPriorityResponseResultAmendedOrder.type)
                && Objects.equals(this.side, orderAmendKeepPriorityResponseResultAmendedOrder.side)
                && Objects.equals(
                        this.workingTime,
                        orderAmendKeepPriorityResponseResultAmendedOrder.workingTime)
                && Objects.equals(
                        this.selfTradePreventionMode,
                        orderAmendKeepPriorityResponseResultAmendedOrder.selfTradePreventionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                symbol,
                orderId,
                orderListId,
                origClientOrderId,
                clientOrderId,
                price,
                qty,
                executedQty,
                preventedQty,
                quoteOrderQty,
                cumulativeQuoteQty,
                status,
                timeInForce,
                type,
                side,
                workingTime,
                selfTradePreventionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderAmendKeepPriorityResponseResultAmendedOrder {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		orderListId: ").append(toIndentedString(orderListId)).append("\n");
        sb.append("		origClientOrderId: ").append(toIndentedString(origClientOrderId)).append("\n");
        sb.append("		clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("		executedQty: ").append(toIndentedString(executedQty)).append("\n");
        sb.append("		preventedQty: ").append(toIndentedString(preventedQty)).append("\n");
        sb.append("		quoteOrderQty: ").append(toIndentedString(quoteOrderQty)).append("\n");
        sb.append("		cumulativeQuoteQty: ")
                .append(toIndentedString(cumulativeQuoteQty))
                .append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		workingTime: ").append(toIndentedString(workingTime)).append("\n");
        sb.append("		selfTradePreventionMode: ")
                .append(toIndentedString(selfTradePreventionMode))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String symbolValue = getSymbol();
        if (symbolValue != null) {
            String symbolValueAsString = symbolValue.toString();
            valMap.put("symbol", symbolValueAsString);
        }
        Long orderIdValue = getOrderId();
        if (orderIdValue != null) {
            String orderIdValueAsString = orderIdValue.toString();
            valMap.put("orderId", orderIdValueAsString);
        }
        Long orderListIdValue = getOrderListId();
        if (orderListIdValue != null) {
            String orderListIdValueAsString = orderListIdValue.toString();
            valMap.put("orderListId", orderListIdValueAsString);
        }
        String origClientOrderIdValue = getOrigClientOrderId();
        if (origClientOrderIdValue != null) {
            String origClientOrderIdValueAsString = origClientOrderIdValue.toString();
            valMap.put("origClientOrderId", origClientOrderIdValueAsString);
        }
        String clientOrderIdValue = getClientOrderId();
        if (clientOrderIdValue != null) {
            String clientOrderIdValueAsString = clientOrderIdValue.toString();
            valMap.put("clientOrderId", clientOrderIdValueAsString);
        }
        String priceValue = getPrice();
        if (priceValue != null) {
            String priceValueAsString = priceValue.toString();
            valMap.put("price", priceValueAsString);
        }
        String qtyValue = getQty();
        if (qtyValue != null) {
            String qtyValueAsString = qtyValue.toString();
            valMap.put("qty", qtyValueAsString);
        }
        String executedQtyValue = getExecutedQty();
        if (executedQtyValue != null) {
            String executedQtyValueAsString = executedQtyValue.toString();
            valMap.put("executedQty", executedQtyValueAsString);
        }
        String preventedQtyValue = getPreventedQty();
        if (preventedQtyValue != null) {
            String preventedQtyValueAsString = preventedQtyValue.toString();
            valMap.put("preventedQty", preventedQtyValueAsString);
        }
        String quoteOrderQtyValue = getQuoteOrderQty();
        if (quoteOrderQtyValue != null) {
            String quoteOrderQtyValueAsString = quoteOrderQtyValue.toString();
            valMap.put("quoteOrderQty", quoteOrderQtyValueAsString);
        }
        String cumulativeQuoteQtyValue = getCumulativeQuoteQty();
        if (cumulativeQuoteQtyValue != null) {
            String cumulativeQuoteQtyValueAsString = cumulativeQuoteQtyValue.toString();
            valMap.put("cumulativeQuoteQty", cumulativeQuoteQtyValueAsString);
        }
        String statusValue = getStatus();
        if (statusValue != null) {
            String statusValueAsString = statusValue.toString();
            valMap.put("status", statusValueAsString);
        }
        String timeInForceValue = getTimeInForce();
        if (timeInForceValue != null) {
            String timeInForceValueAsString = timeInForceValue.toString();
            valMap.put("timeInForce", timeInForceValueAsString);
        }
        String typeValue = getType();
        if (typeValue != null) {
            String typeValueAsString = typeValue.toString();
            valMap.put("type", typeValueAsString);
        }
        String sideValue = getSide();
        if (sideValue != null) {
            String sideValueAsString = sideValue.toString();
            valMap.put("side", sideValueAsString);
        }
        Long workingTimeValue = getWorkingTime();
        if (workingTimeValue != null) {
            String workingTimeValueAsString = workingTimeValue.toString();
            valMap.put("workingTime", workingTimeValueAsString);
        }
        String selfTradePreventionModeValue = getSelfTradePreventionMode();
        if (selfTradePreventionModeValue != null) {
            String selfTradePreventionModeValueAsString = selfTradePreventionModeValue.toString();
            valMap.put("selfTradePreventionMode", selfTradePreventionModeValueAsString);
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
        Object symbolValue = getSymbol();
        if (symbolValue != null) {
            valMap.put("symbol", symbolValue);
        }
        Object orderIdValue = getOrderId();
        if (orderIdValue != null) {
            valMap.put("orderId", orderIdValue);
        }
        Object orderListIdValue = getOrderListId();
        if (orderListIdValue != null) {
            valMap.put("orderListId", orderListIdValue);
        }
        Object origClientOrderIdValue = getOrigClientOrderId();
        if (origClientOrderIdValue != null) {
            valMap.put("origClientOrderId", origClientOrderIdValue);
        }
        Object clientOrderIdValue = getClientOrderId();
        if (clientOrderIdValue != null) {
            valMap.put("clientOrderId", clientOrderIdValue);
        }
        Object priceValue = getPrice();
        if (priceValue != null) {
            valMap.put("price", priceValue);
        }
        Object qtyValue = getQty();
        if (qtyValue != null) {
            valMap.put("qty", qtyValue);
        }
        Object executedQtyValue = getExecutedQty();
        if (executedQtyValue != null) {
            valMap.put("executedQty", executedQtyValue);
        }
        Object preventedQtyValue = getPreventedQty();
        if (preventedQtyValue != null) {
            valMap.put("preventedQty", preventedQtyValue);
        }
        Object quoteOrderQtyValue = getQuoteOrderQty();
        if (quoteOrderQtyValue != null) {
            valMap.put("quoteOrderQty", quoteOrderQtyValue);
        }
        Object cumulativeQuoteQtyValue = getCumulativeQuoteQty();
        if (cumulativeQuoteQtyValue != null) {
            valMap.put("cumulativeQuoteQty", cumulativeQuoteQtyValue);
        }
        Object statusValue = getStatus();
        if (statusValue != null) {
            valMap.put("status", statusValue);
        }
        Object timeInForceValue = getTimeInForce();
        if (timeInForceValue != null) {
            valMap.put("timeInForce", timeInForceValue);
        }
        Object typeValue = getType();
        if (typeValue != null) {
            valMap.put("type", typeValue);
        }
        Object sideValue = getSide();
        if (sideValue != null) {
            valMap.put("side", sideValue);
        }
        Object workingTimeValue = getWorkingTime();
        if (workingTimeValue != null) {
            valMap.put("workingTime", workingTimeValue);
        }
        Object selfTradePreventionModeValue = getSelfTradePreventionMode();
        if (selfTradePreventionModeValue != null) {
            valMap.put("selfTradePreventionMode", selfTradePreventionModeValue);
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
        openapiFields.add("symbol");
        openapiFields.add("orderId");
        openapiFields.add("orderListId");
        openapiFields.add("origClientOrderId");
        openapiFields.add("clientOrderId");
        openapiFields.add("price");
        openapiFields.add("qty");
        openapiFields.add("executedQty");
        openapiFields.add("preventedQty");
        openapiFields.add("quoteOrderQty");
        openapiFields.add("cumulativeQuoteQty");
        openapiFields.add("status");
        openapiFields.add("timeInForce");
        openapiFields.add("type");
        openapiFields.add("side");
        openapiFields.add("workingTime");
        openapiFields.add("selfTradePreventionMode");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     OrderAmendKeepPriorityResponseResultAmendedOrder
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OrderAmendKeepPriorityResponseResultAmendedOrder.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                        + " OrderAmendKeepPriorityResponseResultAmendedOrder is not"
                                        + " found in the empty JSON string",
                                OrderAmendKeepPriorityResponseResultAmendedOrder
                                        .openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!OrderAmendKeepPriorityResponseResultAmendedOrder.openapiFields.contains(
                    entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `OrderAmendKeepPriorityResponseResultAmendedOrder`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        if ((jsonObj.get("origClientOrderId") != null
                        && !jsonObj.get("origClientOrderId").isJsonNull())
                && !jsonObj.get("origClientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `origClientOrderId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("origClientOrderId").toString()));
        }
        if ((jsonObj.get("clientOrderId") != null && !jsonObj.get("clientOrderId").isJsonNull())
                && !jsonObj.get("clientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `clientOrderId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("clientOrderId").toString()));
        }
        if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull())
                && !jsonObj.get("price").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `price` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("price").toString()));
        }
        if ((jsonObj.get("qty") != null && !jsonObj.get("qty").isJsonNull())
                && !jsonObj.get("qty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `qty` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("qty").toString()));
        }
        if ((jsonObj.get("executedQty") != null && !jsonObj.get("executedQty").isJsonNull())
                && !jsonObj.get("executedQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `executedQty` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("executedQty").toString()));
        }
        if ((jsonObj.get("preventedQty") != null && !jsonObj.get("preventedQty").isJsonNull())
                && !jsonObj.get("preventedQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `preventedQty` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("preventedQty").toString()));
        }
        if ((jsonObj.get("quoteOrderQty") != null && !jsonObj.get("quoteOrderQty").isJsonNull())
                && !jsonObj.get("quoteOrderQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `quoteOrderQty` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("quoteOrderQty").toString()));
        }
        if ((jsonObj.get("cumulativeQuoteQty") != null
                        && !jsonObj.get("cumulativeQuoteQty").isJsonNull())
                && !jsonObj.get("cumulativeQuoteQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cumulativeQuoteQty` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("cumulativeQuoteQty").toString()));
        }
        if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull())
                && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
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
        if ((jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull())
                && !jsonObj.get("side").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `side` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("side").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrderAmendKeepPriorityResponseResultAmendedOrder.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'OrderAmendKeepPriorityResponseResultAmendedOrder' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OrderAmendKeepPriorityResponseResultAmendedOrder> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(OrderAmendKeepPriorityResponseResultAmendedOrder.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OrderAmendKeepPriorityResponseResultAmendedOrder>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                OrderAmendKeepPriorityResponseResultAmendedOrder value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OrderAmendKeepPriorityResponseResultAmendedOrder read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OrderAmendKeepPriorityResponseResultAmendedOrder given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OrderAmendKeepPriorityResponseResultAmendedOrder
     * @throws IOException if the JSON string is invalid with respect to
     *     OrderAmendKeepPriorityResponseResultAmendedOrder
     */
    public static OrderAmendKeepPriorityResponseResultAmendedOrder fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, OrderAmendKeepPriorityResponseResultAmendedOrder.class);
    }

    /**
     * Convert an instance of OrderAmendKeepPriorityResponseResultAmendedOrder to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
