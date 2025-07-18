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

/** ModifyOrderRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ModifyOrderRequest {
    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nullable
    private Long orderId;

    public static final String SERIALIZED_NAME_ORIG_CLIENT_ORDER_ID = "origClientOrderId";

    @SerializedName(SERIALIZED_NAME_ORIG_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String origClientOrderId;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nonnull
    private String symbol;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nonnull
    private Side side;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";

    @SerializedName(SERIALIZED_NAME_QUANTITY)
    @jakarta.annotation.Nonnull
    private Double quantity;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nonnull
    private Double price;

    public static final String SERIALIZED_NAME_PRICE_MATCH = "priceMatch";

    @SerializedName(SERIALIZED_NAME_PRICE_MATCH)
    @jakarta.annotation.Nullable
    private PriceMatch priceMatch;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public ModifyOrderRequest() {}

    public ModifyOrderRequest orderId(@jakarta.annotation.Nullable Long orderId) {
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

    public ModifyOrderRequest origClientOrderId(
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

    public ModifyOrderRequest symbol(@jakarta.annotation.Nonnull String symbol) {
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

    public ModifyOrderRequest side(@jakarta.annotation.Nonnull Side side) {
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

    public ModifyOrderRequest quantity(@jakarta.annotation.Nonnull Double quantity) {
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

    public ModifyOrderRequest price(@jakarta.annotation.Nonnull Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getPrice() {
        return price;
    }

    public void setPrice(@jakarta.annotation.Nonnull Double price) {
        this.price = price;
    }

    public ModifyOrderRequest priceMatch(@jakarta.annotation.Nullable PriceMatch priceMatch) {
        this.priceMatch = priceMatch;
        return this;
    }

    /**
     * Get priceMatch
     *
     * @return priceMatch
     */
    @jakarta.annotation.Nullable
    @Valid
    public PriceMatch getPriceMatch() {
        return priceMatch;
    }

    public void setPriceMatch(@jakarta.annotation.Nullable PriceMatch priceMatch) {
        this.priceMatch = priceMatch;
    }

    public ModifyOrderRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
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
        ModifyOrderRequest modifyOrderRequest = (ModifyOrderRequest) o;
        return Objects.equals(this.orderId, modifyOrderRequest.orderId)
                && Objects.equals(this.origClientOrderId, modifyOrderRequest.origClientOrderId)
                && Objects.equals(this.symbol, modifyOrderRequest.symbol)
                && Objects.equals(this.side, modifyOrderRequest.side)
                && Objects.equals(this.quantity, modifyOrderRequest.quantity)
                && Objects.equals(this.price, modifyOrderRequest.price)
                && Objects.equals(this.priceMatch, modifyOrderRequest.priceMatch)
                && Objects.equals(this.recvWindow, modifyOrderRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                orderId, origClientOrderId, symbol, side, quantity, price, priceMatch, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOrderRequest {\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		origClientOrderId: ").append(toIndentedString(origClientOrderId)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		priceMatch: ").append(toIndentedString(priceMatch)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object orderIdValue = getOrderId();
        String orderIdValueAsString = "";
        orderIdValueAsString = orderIdValue.toString();
        sb.append("orderId=").append(urlEncode(orderIdValueAsString)).append("");
        Object origClientOrderIdValue = getOrigClientOrderId();
        String origClientOrderIdValueAsString = "";
        origClientOrderIdValueAsString = origClientOrderIdValue.toString();
        sb.append("origClientOrderId=")
                .append(urlEncode(origClientOrderIdValueAsString))
                .append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object sideValue = getSide();
        String sideValueAsString = "";
        sideValueAsString = sideValue.toString();
        sb.append("side=").append(urlEncode(sideValueAsString)).append("");
        Object quantityValue = getQuantity();
        String quantityValueAsString = "";
        quantityValueAsString = quantityValue.toString();
        sb.append("quantity=").append(urlEncode(quantityValueAsString)).append("");
        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
        Object priceMatchValue = getPriceMatch();
        String priceMatchValueAsString = "";
        priceMatchValueAsString = priceMatchValue.toString();
        sb.append("priceMatch=").append(urlEncode(priceMatchValueAsString)).append("");
        Object recvWindowValue = getRecvWindow();
        String recvWindowValueAsString = "";
        recvWindowValueAsString = recvWindowValue.toString();
        sb.append("recvWindow=").append(urlEncode(recvWindowValueAsString)).append("");
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
        openapiFields.add("orderId");
        openapiFields.add("origClientOrderId");
        openapiFields.add("symbol");
        openapiFields.add("side");
        openapiFields.add("quantity");
        openapiFields.add("price");
        openapiFields.add("priceMatch");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("symbol");
        openapiRequiredFields.add("side");
        openapiRequiredFields.add("quantity");
        openapiRequiredFields.add("price");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ModifyOrderRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ModifyOrderRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ModifyOrderRequest is not found in the"
                                        + " empty JSON string",
                                ModifyOrderRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ModifyOrderRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("origClientOrderId") != null
                        && !jsonObj.get("origClientOrderId").isJsonNull())
                && !jsonObj.get("origClientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `origClientOrderId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("origClientOrderId").toString()));
        }
        if (!jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        // validate the required field `side`
        Side.validateJsonElement(jsonObj.get("side"));
        // validate the optional field `priceMatch`
        if (jsonObj.get("priceMatch") != null && !jsonObj.get("priceMatch").isJsonNull()) {
            PriceMatch.validateJsonElement(jsonObj.get("priceMatch"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ModifyOrderRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ModifyOrderRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ModifyOrderRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ModifyOrderRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ModifyOrderRequest>() {
                        @Override
                        public void write(JsonWriter out, ModifyOrderRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ModifyOrderRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ModifyOrderRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ModifyOrderRequest
     * @throws IOException if the JSON string is invalid with respect to ModifyOrderRequest
     */
    public static ModifyOrderRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ModifyOrderRequest.class);
    }

    /**
     * Convert an instance of ModifyOrderRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
