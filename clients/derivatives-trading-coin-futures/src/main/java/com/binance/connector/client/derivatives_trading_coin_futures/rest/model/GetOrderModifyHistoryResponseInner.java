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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** GetOrderModifyHistoryResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetOrderModifyHistoryResponseInner {
    public static final String SERIALIZED_NAME_AMENDMENT_ID = "amendmentId";

    @SerializedName(SERIALIZED_NAME_AMENDMENT_ID)
    @jakarta.annotation.Nullable
    private Long amendmentId;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_PAIR = "pair";

    @SerializedName(SERIALIZED_NAME_PAIR)
    @jakarta.annotation.Nullable
    private String pair;

    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nullable
    private Long orderId;

    public static final String SERIALIZED_NAME_CLIENT_ORDER_ID = "clientOrderId";

    @SerializedName(SERIALIZED_NAME_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String clientOrderId;

    public static final String SERIALIZED_NAME_TIME = "time";

    @SerializedName(SERIALIZED_NAME_TIME)
    @jakarta.annotation.Nullable
    private Long time;

    public static final String SERIALIZED_NAME_AMENDMENT = "amendment";

    @SerializedName(SERIALIZED_NAME_AMENDMENT)
    @jakarta.annotation.Nullable
    private GetOrderModifyHistoryResponseInnerAmendment amendment;

    public GetOrderModifyHistoryResponseInner() {}

    public GetOrderModifyHistoryResponseInner amendmentId(
            @jakarta.annotation.Nullable Long amendmentId) {
        this.amendmentId = amendmentId;
        return this;
    }

    /**
     * Get amendmentId
     *
     * @return amendmentId
     */
    @jakarta.annotation.Nullable
    public Long getAmendmentId() {
        return amendmentId;
    }

    public void setAmendmentId(@jakarta.annotation.Nullable Long amendmentId) {
        this.amendmentId = amendmentId;
    }

    public GetOrderModifyHistoryResponseInner symbol(@jakarta.annotation.Nullable String symbol) {
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

    public GetOrderModifyHistoryResponseInner pair(@jakarta.annotation.Nullable String pair) {
        this.pair = pair;
        return this;
    }

    /**
     * Get pair
     *
     * @return pair
     */
    @jakarta.annotation.Nullable
    public String getPair() {
        return pair;
    }

    public void setPair(@jakarta.annotation.Nullable String pair) {
        this.pair = pair;
    }

    public GetOrderModifyHistoryResponseInner orderId(@jakarta.annotation.Nullable Long orderId) {
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

    public GetOrderModifyHistoryResponseInner clientOrderId(
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

    public GetOrderModifyHistoryResponseInner time(@jakarta.annotation.Nullable Long time) {
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

    public GetOrderModifyHistoryResponseInner amendment(
            @jakarta.annotation.Nullable GetOrderModifyHistoryResponseInnerAmendment amendment) {
        this.amendment = amendment;
        return this;
    }

    /**
     * Get amendment
     *
     * @return amendment
     */
    @jakarta.annotation.Nullable
    @Valid
    public GetOrderModifyHistoryResponseInnerAmendment getAmendment() {
        return amendment;
    }

    public void setAmendment(
            @jakarta.annotation.Nullable GetOrderModifyHistoryResponseInnerAmendment amendment) {
        this.amendment = amendment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOrderModifyHistoryResponseInner getOrderModifyHistoryResponseInner =
                (GetOrderModifyHistoryResponseInner) o;
        return Objects.equals(this.amendmentId, getOrderModifyHistoryResponseInner.amendmentId)
                && Objects.equals(this.symbol, getOrderModifyHistoryResponseInner.symbol)
                && Objects.equals(this.pair, getOrderModifyHistoryResponseInner.pair)
                && Objects.equals(this.orderId, getOrderModifyHistoryResponseInner.orderId)
                && Objects.equals(
                        this.clientOrderId, getOrderModifyHistoryResponseInner.clientOrderId)
                && Objects.equals(this.time, getOrderModifyHistoryResponseInner.time)
                && Objects.equals(this.amendment, getOrderModifyHistoryResponseInner.amendment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amendmentId, symbol, pair, orderId, clientOrderId, time, amendment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrderModifyHistoryResponseInner {\n");
        sb.append("		amendmentId: ").append(toIndentedString(amendmentId)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		pair: ").append(toIndentedString(pair)).append("\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
        sb.append("		time: ").append(toIndentedString(time)).append("\n");
        sb.append("		amendment: ").append(toIndentedString(amendment)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object amendmentIdValue = getAmendmentId();
        String amendmentIdValueAsString = "";
        amendmentIdValueAsString = amendmentIdValue.toString();
        sb.append("amendmentId=").append(urlEncode(amendmentIdValueAsString)).append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object pairValue = getPair();
        String pairValueAsString = "";
        pairValueAsString = pairValue.toString();
        sb.append("pair=").append(urlEncode(pairValueAsString)).append("");
        Object orderIdValue = getOrderId();
        String orderIdValueAsString = "";
        orderIdValueAsString = orderIdValue.toString();
        sb.append("orderId=").append(urlEncode(orderIdValueAsString)).append("");
        Object clientOrderIdValue = getClientOrderId();
        String clientOrderIdValueAsString = "";
        clientOrderIdValueAsString = clientOrderIdValue.toString();
        sb.append("clientOrderId=").append(urlEncode(clientOrderIdValueAsString)).append("");
        Object timeValue = getTime();
        String timeValueAsString = "";
        timeValueAsString = timeValue.toString();
        sb.append("time=").append(urlEncode(timeValueAsString)).append("");
        Object amendmentValue = getAmendment();
        String amendmentValueAsString = "";
        amendmentValueAsString = amendmentValue.toString();
        sb.append("amendment=").append(urlEncode(amendmentValueAsString)).append("");
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
        openapiFields.add("amendmentId");
        openapiFields.add("symbol");
        openapiFields.add("pair");
        openapiFields.add("orderId");
        openapiFields.add("clientOrderId");
        openapiFields.add("time");
        openapiFields.add("amendment");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetOrderModifyHistoryResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetOrderModifyHistoryResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetOrderModifyHistoryResponseInner is"
                                        + " not found in the empty JSON string",
                                GetOrderModifyHistoryResponseInner.openapiRequiredFields
                                        .toString()));
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
        if ((jsonObj.get("pair") != null && !jsonObj.get("pair").isJsonNull())
                && !jsonObj.get("pair").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `pair` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("pair").toString()));
        }
        if ((jsonObj.get("clientOrderId") != null && !jsonObj.get("clientOrderId").isJsonNull())
                && !jsonObj.get("clientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `clientOrderId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("clientOrderId").toString()));
        }
        // validate the optional field `amendment`
        if (jsonObj.get("amendment") != null && !jsonObj.get("amendment").isJsonNull()) {
            GetOrderModifyHistoryResponseInnerAmendment.validateJsonElement(
                    jsonObj.get("amendment"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetOrderModifyHistoryResponseInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetOrderModifyHistoryResponseInner' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetOrderModifyHistoryResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetOrderModifyHistoryResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetOrderModifyHistoryResponseInner>() {
                        @Override
                        public void write(JsonWriter out, GetOrderModifyHistoryResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetOrderModifyHistoryResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetOrderModifyHistoryResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetOrderModifyHistoryResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     GetOrderModifyHistoryResponseInner
     */
    public static GetOrderModifyHistoryResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, GetOrderModifyHistoryResponseInner.class);
    }

    /**
     * Convert an instance of GetOrderModifyHistoryResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
