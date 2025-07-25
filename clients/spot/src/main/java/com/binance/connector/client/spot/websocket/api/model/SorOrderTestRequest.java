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

import com.binance.connector.client.common.DecimalFormatter;
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
import jakarta.validation.Valid;
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

/** SorOrderTestRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SorOrderTestRequest extends BaseDTO {
    public static final String SERIALIZED_NAME_COMPUTE_COMMISSION_RATES = "computeCommissionRates";

    @SerializedName(SERIALIZED_NAME_COMPUTE_COMMISSION_RATES)
    @jakarta.annotation.Nullable
    private Boolean computeCommissionRates;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nonnull
    private String symbol;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nonnull
    private Side side;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nonnull
    private OrderType type;

    public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";

    @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
    @jakarta.annotation.Nullable
    private TimeInForce timeInForce;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private Double price;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";

    @SerializedName(SERIALIZED_NAME_QUANTITY)
    @jakarta.annotation.Nonnull
    private Double quantity;

    public static final String SERIALIZED_NAME_NEW_CLIENT_ORDER_ID = "newClientOrderId";

    @SerializedName(SERIALIZED_NAME_NEW_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String newClientOrderId;

    public static final String SERIALIZED_NAME_NEW_ORDER_RESP_TYPE = "newOrderRespType";

    @SerializedName(SERIALIZED_NAME_NEW_ORDER_RESP_TYPE)
    @jakarta.annotation.Nullable
    private NewOrderRespType newOrderRespType;

    public static final String SERIALIZED_NAME_ICEBERG_QTY = "icebergQty";

    @SerializedName(SERIALIZED_NAME_ICEBERG_QTY)
    @jakarta.annotation.Nullable
    private Double icebergQty;

    public static final String SERIALIZED_NAME_STRATEGY_ID = "strategyId";

    @SerializedName(SERIALIZED_NAME_STRATEGY_ID)
    @jakarta.annotation.Nullable
    private Long strategyId;

    public static final String SERIALIZED_NAME_STRATEGY_TYPE = "strategyType";

    @SerializedName(SERIALIZED_NAME_STRATEGY_TYPE)
    @jakarta.annotation.Nullable
    private Integer strategyType;

    public static final String SERIALIZED_NAME_SELF_TRADE_PREVENTION_MODE =
            "selfTradePreventionMode";

    @SerializedName(SERIALIZED_NAME_SELF_TRADE_PREVENTION_MODE)
    @jakarta.annotation.Nullable
    private SelfTradePreventionMode selfTradePreventionMode;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public SorOrderTestRequest() {}

    public SorOrderTestRequest computeCommissionRates(
            @jakarta.annotation.Nullable Boolean computeCommissionRates) {
        this.computeCommissionRates = computeCommissionRates;
        return this;
    }

    /**
     * Get computeCommissionRates
     *
     * @return computeCommissionRates
     */
    @jakarta.annotation.Nullable
    public Boolean getComputeCommissionRates() {
        return computeCommissionRates;
    }

    public void setComputeCommissionRates(
            @jakarta.annotation.Nullable Boolean computeCommissionRates) {
        this.computeCommissionRates = computeCommissionRates;
    }

    public SorOrderTestRequest symbol(@jakarta.annotation.Nonnull String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(@jakarta.annotation.Nonnull String symbol) {
        this.symbol = symbol;
    }

    public SorOrderTestRequest side(@jakarta.annotation.Nonnull Side side) {
        this.side = side;
        return this;
    }

    /**
     * Get side
     *
     * @return side
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Side getSide() {
        return side;
    }

    public void setSide(@jakarta.annotation.Nonnull Side side) {
        this.side = side;
    }

    public SorOrderTestRequest type(@jakarta.annotation.Nonnull OrderType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public OrderType getType() {
        return type;
    }

    public void setType(@jakarta.annotation.Nonnull OrderType type) {
        this.type = type;
    }

    public SorOrderTestRequest timeInForce(@jakarta.annotation.Nullable TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Get timeInForce
     *
     * @return timeInForce
     */
    @jakarta.annotation.Nullable
    @Valid
    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(@jakarta.annotation.Nullable TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public SorOrderTestRequest price(@jakarta.annotation.Nullable Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getPrice() {
        return price;
    }

    public void setPrice(@jakarta.annotation.Nullable Double price) {
        this.price = price;
    }

    public SorOrderTestRequest quantity(@jakarta.annotation.Nonnull Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(@jakarta.annotation.Nonnull Double quantity) {
        this.quantity = quantity;
    }

    public SorOrderTestRequest newClientOrderId(
            @jakarta.annotation.Nullable String newClientOrderId) {
        this.newClientOrderId = newClientOrderId;
        return this;
    }

    /**
     * Get newClientOrderId
     *
     * @return newClientOrderId
     */
    @jakarta.annotation.Nullable
    public String getNewClientOrderId() {
        return newClientOrderId;
    }

    public void setNewClientOrderId(@jakarta.annotation.Nullable String newClientOrderId) {
        this.newClientOrderId = newClientOrderId;
    }

    public SorOrderTestRequest newOrderRespType(
            @jakarta.annotation.Nullable NewOrderRespType newOrderRespType) {
        this.newOrderRespType = newOrderRespType;
        return this;
    }

    /**
     * Get newOrderRespType
     *
     * @return newOrderRespType
     */
    @jakarta.annotation.Nullable
    @Valid
    public NewOrderRespType getNewOrderRespType() {
        return newOrderRespType;
    }

    public void setNewOrderRespType(
            @jakarta.annotation.Nullable NewOrderRespType newOrderRespType) {
        this.newOrderRespType = newOrderRespType;
    }

    public SorOrderTestRequest icebergQty(@jakarta.annotation.Nullable Double icebergQty) {
        this.icebergQty = icebergQty;
        return this;
    }

    /**
     * Get icebergQty
     *
     * @return icebergQty
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getIcebergQty() {
        return icebergQty;
    }

    public void setIcebergQty(@jakarta.annotation.Nullable Double icebergQty) {
        this.icebergQty = icebergQty;
    }

    public SorOrderTestRequest strategyId(@jakarta.annotation.Nullable Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * Get strategyId
     *
     * @return strategyId
     */
    @jakarta.annotation.Nullable
    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(@jakarta.annotation.Nullable Long strategyId) {
        this.strategyId = strategyId;
    }

    public SorOrderTestRequest strategyType(@jakarta.annotation.Nullable Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * Get strategyType
     *
     * @return strategyType
     */
    @jakarta.annotation.Nullable
    public Integer getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(@jakarta.annotation.Nullable Integer strategyType) {
        this.strategyType = strategyType;
    }

    public SorOrderTestRequest selfTradePreventionMode(
            @jakarta.annotation.Nullable SelfTradePreventionMode selfTradePreventionMode) {
        this.selfTradePreventionMode = selfTradePreventionMode;
        return this;
    }

    /**
     * Get selfTradePreventionMode
     *
     * @return selfTradePreventionMode
     */
    @jakarta.annotation.Nullable
    @Valid
    public SelfTradePreventionMode getSelfTradePreventionMode() {
        return selfTradePreventionMode;
    }

    public void setSelfTradePreventionMode(
            @jakarta.annotation.Nullable SelfTradePreventionMode selfTradePreventionMode) {
        this.selfTradePreventionMode = selfTradePreventionMode;
    }

    public SorOrderTestRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
        return this;
    }

    /**
     * Get recvWindow
     *
     * @return recvWindow
     */
    @jakarta.annotation.Nullable
    public Long getRecvWindow() {
        return recvWindow;
    }

    public void setRecvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SorOrderTestRequest sorOrderTestRequest = (SorOrderTestRequest) o;
        return Objects.equals(
                        this.computeCommissionRates, sorOrderTestRequest.computeCommissionRates)
                && Objects.equals(this.symbol, sorOrderTestRequest.symbol)
                && Objects.equals(this.side, sorOrderTestRequest.side)
                && Objects.equals(this.type, sorOrderTestRequest.type)
                && Objects.equals(this.timeInForce, sorOrderTestRequest.timeInForce)
                && Objects.equals(this.price, sorOrderTestRequest.price)
                && Objects.equals(this.quantity, sorOrderTestRequest.quantity)
                && Objects.equals(this.newClientOrderId, sorOrderTestRequest.newClientOrderId)
                && Objects.equals(this.newOrderRespType, sorOrderTestRequest.newOrderRespType)
                && Objects.equals(this.icebergQty, sorOrderTestRequest.icebergQty)
                && Objects.equals(this.strategyId, sorOrderTestRequest.strategyId)
                && Objects.equals(this.strategyType, sorOrderTestRequest.strategyType)
                && Objects.equals(
                        this.selfTradePreventionMode, sorOrderTestRequest.selfTradePreventionMode)
                && Objects.equals(this.recvWindow, sorOrderTestRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                computeCommissionRates,
                symbol,
                side,
                type,
                timeInForce,
                price,
                quantity,
                newClientOrderId,
                newOrderRespType,
                icebergQty,
                strategyId,
                strategyType,
                selfTradePreventionMode,
                recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SorOrderTestRequest {\n");
        sb.append("		computeCommissionRates: ")
                .append(toIndentedString(computeCommissionRates))
                .append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("		newClientOrderId: ").append(toIndentedString(newClientOrderId)).append("\n");
        sb.append("		newOrderRespType: ").append(toIndentedString(newOrderRespType)).append("\n");
        sb.append("		icebergQty: ").append(toIndentedString(icebergQty)).append("\n");
        sb.append("		strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("		strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("		selfTradePreventionMode: ")
                .append(toIndentedString(selfTradePreventionMode))
                .append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        Boolean computeCommissionRatesValue = getComputeCommissionRates();
        if (computeCommissionRatesValue != null) {
            String computeCommissionRatesValueAsString = computeCommissionRatesValue.toString();
            valMap.put("computeCommissionRates", computeCommissionRatesValueAsString);
        }
        String symbolValue = getSymbol();
        if (symbolValue != null) {
            String symbolValueAsString = symbolValue.toString();
            valMap.put("symbol", symbolValueAsString);
        }
        Side sideValue = getSide();
        if (sideValue != null) {
            String sideValueAsString = sideValue.toString();
            valMap.put("side", sideValueAsString);
        }
        OrderType typeValue = getType();
        if (typeValue != null) {
            String typeValueAsString = typeValue.toString();
            valMap.put("type", typeValueAsString);
        }
        TimeInForce timeInForceValue = getTimeInForce();
        if (timeInForceValue != null) {
            String timeInForceValueAsString = timeInForceValue.toString();
            valMap.put("timeInForce", timeInForceValueAsString);
        }
        Double priceValue = getPrice();
        if (priceValue != null) {
            String priceValueAsString = DecimalFormatter.getFormatter().format(priceValue);
            valMap.put("price", priceValueAsString);
        }
        Double quantityValue = getQuantity();
        if (quantityValue != null) {
            String quantityValueAsString = DecimalFormatter.getFormatter().format(quantityValue);
            valMap.put("quantity", quantityValueAsString);
        }
        String newClientOrderIdValue = getNewClientOrderId();
        if (newClientOrderIdValue != null) {
            String newClientOrderIdValueAsString = newClientOrderIdValue.toString();
            valMap.put("newClientOrderId", newClientOrderIdValueAsString);
        }
        NewOrderRespType newOrderRespTypeValue = getNewOrderRespType();
        if (newOrderRespTypeValue != null) {
            String newOrderRespTypeValueAsString = newOrderRespTypeValue.toString();
            valMap.put("newOrderRespType", newOrderRespTypeValueAsString);
        }
        Double icebergQtyValue = getIcebergQty();
        if (icebergQtyValue != null) {
            String icebergQtyValueAsString =
                    DecimalFormatter.getFormatter().format(icebergQtyValue);
            valMap.put("icebergQty", icebergQtyValueAsString);
        }
        Long strategyIdValue = getStrategyId();
        if (strategyIdValue != null) {
            String strategyIdValueAsString = strategyIdValue.toString();
            valMap.put("strategyId", strategyIdValueAsString);
        }
        Integer strategyTypeValue = getStrategyType();
        if (strategyTypeValue != null) {
            String strategyTypeValueAsString = strategyTypeValue.toString();
            valMap.put("strategyType", strategyTypeValueAsString);
        }
        SelfTradePreventionMode selfTradePreventionModeValue = getSelfTradePreventionMode();
        if (selfTradePreventionModeValue != null) {
            String selfTradePreventionModeValueAsString = selfTradePreventionModeValue.toString();
            valMap.put("selfTradePreventionMode", selfTradePreventionModeValueAsString);
        }
        Long recvWindowValue = getRecvWindow();
        if (recvWindowValue != null) {
            String recvWindowValueAsString = recvWindowValue.toString();
            valMap.put("recvWindow", recvWindowValueAsString);
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
        Object computeCommissionRatesValue = getComputeCommissionRates();
        if (computeCommissionRatesValue != null) {
            valMap.put("computeCommissionRates", computeCommissionRatesValue);
        }
        Object symbolValue = getSymbol();
        if (symbolValue != null) {
            valMap.put("symbol", symbolValue);
        }
        Object sideValue = getSide();
        if (sideValue != null) {
            valMap.put("side", sideValue);
        }
        Object typeValue = getType();
        if (typeValue != null) {
            valMap.put("type", typeValue);
        }
        Object timeInForceValue = getTimeInForce();
        if (timeInForceValue != null) {
            valMap.put("timeInForce", timeInForceValue);
        }
        Object priceValue = getPrice();
        if (priceValue != null) {
            valMap.put("price", priceValue);
        }
        Object quantityValue = getQuantity();
        if (quantityValue != null) {
            valMap.put("quantity", quantityValue);
        }
        Object newClientOrderIdValue = getNewClientOrderId();
        if (newClientOrderIdValue != null) {
            valMap.put("newClientOrderId", newClientOrderIdValue);
        }
        Object newOrderRespTypeValue = getNewOrderRespType();
        if (newOrderRespTypeValue != null) {
            valMap.put("newOrderRespType", newOrderRespTypeValue);
        }
        Object icebergQtyValue = getIcebergQty();
        if (icebergQtyValue != null) {
            valMap.put("icebergQty", icebergQtyValue);
        }
        Object strategyIdValue = getStrategyId();
        if (strategyIdValue != null) {
            valMap.put("strategyId", strategyIdValue);
        }
        Object strategyTypeValue = getStrategyType();
        if (strategyTypeValue != null) {
            valMap.put("strategyType", strategyTypeValue);
        }
        Object selfTradePreventionModeValue = getSelfTradePreventionMode();
        if (selfTradePreventionModeValue != null) {
            valMap.put("selfTradePreventionMode", selfTradePreventionModeValue);
        }
        Object recvWindowValue = getRecvWindow();
        if (recvWindowValue != null) {
            valMap.put("recvWindow", recvWindowValue);
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
        openapiFields.add("computeCommissionRates");
        openapiFields.add("symbol");
        openapiFields.add("side");
        openapiFields.add("type");
        openapiFields.add("timeInForce");
        openapiFields.add("price");
        openapiFields.add("quantity");
        openapiFields.add("newClientOrderId");
        openapiFields.add("newOrderRespType");
        openapiFields.add("icebergQty");
        openapiFields.add("strategyId");
        openapiFields.add("strategyType");
        openapiFields.add("selfTradePreventionMode");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("symbol");
        openapiRequiredFields.add("side");
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("quantity");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SorOrderTestRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SorOrderTestRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SorOrderTestRequest is not found in"
                                        + " the empty JSON string",
                                SorOrderTestRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SorOrderTestRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SorOrderTestRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SorOrderTestRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        // validate the required field `side`
        Side.validateJsonElement(jsonObj.get("side"));
        // validate the required field `type`
        OrderType.validateJsonElement(jsonObj.get("type"));
        // validate the optional field `timeInForce`
        if (jsonObj.get("timeInForce") != null && !jsonObj.get("timeInForce").isJsonNull()) {
            TimeInForce.validateJsonElement(jsonObj.get("timeInForce"));
        }
        if ((jsonObj.get("newClientOrderId") != null
                        && !jsonObj.get("newClientOrderId").isJsonNull())
                && !jsonObj.get("newClientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `newClientOrderId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("newClientOrderId").toString()));
        }
        // validate the optional field `newOrderRespType`
        if (jsonObj.get("newOrderRespType") != null
                && !jsonObj.get("newOrderRespType").isJsonNull()) {
            NewOrderRespType.validateJsonElement(jsonObj.get("newOrderRespType"));
        }
        // validate the optional field `selfTradePreventionMode`
        if (jsonObj.get("selfTradePreventionMode") != null
                && !jsonObj.get("selfTradePreventionMode").isJsonNull()) {
            SelfTradePreventionMode.validateJsonElement(jsonObj.get("selfTradePreventionMode"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SorOrderTestRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SorOrderTestRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SorOrderTestRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SorOrderTestRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SorOrderTestRequest>() {
                        @Override
                        public void write(JsonWriter out, SorOrderTestRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SorOrderTestRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SorOrderTestRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SorOrderTestRequest
     * @throws IOException if the JSON string is invalid with respect to SorOrderTestRequest
     */
    public static SorOrderTestRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SorOrderTestRequest.class);
    }

    /**
     * Convert an instance of SorOrderTestRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
