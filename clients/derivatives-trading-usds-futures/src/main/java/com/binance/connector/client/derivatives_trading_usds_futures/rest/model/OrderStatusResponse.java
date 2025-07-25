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
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** OrderStatusResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OrderStatusResponse {
    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nullable
    private Long orderId;

    public static final String SERIALIZED_NAME_ORDER_STATUS = "orderStatus";

    @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
    @jakarta.annotation.Nullable
    private String orderStatus;

    public static final String SERIALIZED_NAME_FROM_ASSET = "fromAsset";

    @SerializedName(SERIALIZED_NAME_FROM_ASSET)
    @jakarta.annotation.Nullable
    private String fromAsset;

    public static final String SERIALIZED_NAME_FROM_AMOUNT = "fromAmount";

    @SerializedName(SERIALIZED_NAME_FROM_AMOUNT)
    @jakarta.annotation.Nullable
    private String fromAmount;

    public static final String SERIALIZED_NAME_TO_ASSET = "toAsset";

    @SerializedName(SERIALIZED_NAME_TO_ASSET)
    @jakarta.annotation.Nullable
    private String toAsset;

    public static final String SERIALIZED_NAME_TO_AMOUNT = "toAmount";

    @SerializedName(SERIALIZED_NAME_TO_AMOUNT)
    @jakarta.annotation.Nullable
    private String toAmount;

    public static final String SERIALIZED_NAME_RATIO = "ratio";

    @SerializedName(SERIALIZED_NAME_RATIO)
    @jakarta.annotation.Nullable
    private String ratio;

    public static final String SERIALIZED_NAME_INVERSE_RATIO = "inverseRatio";

    @SerializedName(SERIALIZED_NAME_INVERSE_RATIO)
    @jakarta.annotation.Nullable
    private String inverseRatio;

    public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";

    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    @jakarta.annotation.Nullable
    private Long createTime;

    public OrderStatusResponse() {}

    public OrderStatusResponse orderId(@jakarta.annotation.Nullable Long orderId) {
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

    public OrderStatusResponse orderStatus(@jakarta.annotation.Nullable String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * Get orderStatus
     *
     * @return orderStatus
     */
    @jakarta.annotation.Nullable
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(@jakarta.annotation.Nullable String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderStatusResponse fromAsset(@jakarta.annotation.Nullable String fromAsset) {
        this.fromAsset = fromAsset;
        return this;
    }

    /**
     * Get fromAsset
     *
     * @return fromAsset
     */
    @jakarta.annotation.Nullable
    public String getFromAsset() {
        return fromAsset;
    }

    public void setFromAsset(@jakarta.annotation.Nullable String fromAsset) {
        this.fromAsset = fromAsset;
    }

    public OrderStatusResponse fromAmount(@jakarta.annotation.Nullable String fromAmount) {
        this.fromAmount = fromAmount;
        return this;
    }

    /**
     * Get fromAmount
     *
     * @return fromAmount
     */
    @jakarta.annotation.Nullable
    public String getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(@jakarta.annotation.Nullable String fromAmount) {
        this.fromAmount = fromAmount;
    }

    public OrderStatusResponse toAsset(@jakarta.annotation.Nullable String toAsset) {
        this.toAsset = toAsset;
        return this;
    }

    /**
     * Get toAsset
     *
     * @return toAsset
     */
    @jakarta.annotation.Nullable
    public String getToAsset() {
        return toAsset;
    }

    public void setToAsset(@jakarta.annotation.Nullable String toAsset) {
        this.toAsset = toAsset;
    }

    public OrderStatusResponse toAmount(@jakarta.annotation.Nullable String toAmount) {
        this.toAmount = toAmount;
        return this;
    }

    /**
     * Get toAmount
     *
     * @return toAmount
     */
    @jakarta.annotation.Nullable
    public String getToAmount() {
        return toAmount;
    }

    public void setToAmount(@jakarta.annotation.Nullable String toAmount) {
        this.toAmount = toAmount;
    }

    public OrderStatusResponse ratio(@jakarta.annotation.Nullable String ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * Get ratio
     *
     * @return ratio
     */
    @jakarta.annotation.Nullable
    public String getRatio() {
        return ratio;
    }

    public void setRatio(@jakarta.annotation.Nullable String ratio) {
        this.ratio = ratio;
    }

    public OrderStatusResponse inverseRatio(@jakarta.annotation.Nullable String inverseRatio) {
        this.inverseRatio = inverseRatio;
        return this;
    }

    /**
     * Get inverseRatio
     *
     * @return inverseRatio
     */
    @jakarta.annotation.Nullable
    public String getInverseRatio() {
        return inverseRatio;
    }

    public void setInverseRatio(@jakarta.annotation.Nullable String inverseRatio) {
        this.inverseRatio = inverseRatio;
    }

    public OrderStatusResponse createTime(@jakarta.annotation.Nullable Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     *
     * @return createTime
     */
    @jakarta.annotation.Nullable
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(@jakarta.annotation.Nullable Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderStatusResponse orderStatusResponse = (OrderStatusResponse) o;
        return Objects.equals(this.orderId, orderStatusResponse.orderId)
                && Objects.equals(this.orderStatus, orderStatusResponse.orderStatus)
                && Objects.equals(this.fromAsset, orderStatusResponse.fromAsset)
                && Objects.equals(this.fromAmount, orderStatusResponse.fromAmount)
                && Objects.equals(this.toAsset, orderStatusResponse.toAsset)
                && Objects.equals(this.toAmount, orderStatusResponse.toAmount)
                && Objects.equals(this.ratio, orderStatusResponse.ratio)
                && Objects.equals(this.inverseRatio, orderStatusResponse.inverseRatio)
                && Objects.equals(this.createTime, orderStatusResponse.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                orderId,
                orderStatus,
                fromAsset,
                fromAmount,
                toAsset,
                toAmount,
                ratio,
                inverseRatio,
                createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderStatusResponse {\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
        sb.append("		fromAsset: ").append(toIndentedString(fromAsset)).append("\n");
        sb.append("		fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
        sb.append("		toAsset: ").append(toIndentedString(toAsset)).append("\n");
        sb.append("		toAmount: ").append(toIndentedString(toAmount)).append("\n");
        sb.append("		ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("		inverseRatio: ").append(toIndentedString(inverseRatio)).append("\n");
        sb.append("		createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object orderIdValue = getOrderId();
        String orderIdValueAsString = "";
        orderIdValueAsString = orderIdValue.toString();
        sb.append("orderId=").append(urlEncode(orderIdValueAsString)).append("");
        Object orderStatusValue = getOrderStatus();
        String orderStatusValueAsString = "";
        orderStatusValueAsString = orderStatusValue.toString();
        sb.append("orderStatus=").append(urlEncode(orderStatusValueAsString)).append("");
        Object fromAssetValue = getFromAsset();
        String fromAssetValueAsString = "";
        fromAssetValueAsString = fromAssetValue.toString();
        sb.append("fromAsset=").append(urlEncode(fromAssetValueAsString)).append("");
        Object fromAmountValue = getFromAmount();
        String fromAmountValueAsString = "";
        fromAmountValueAsString = fromAmountValue.toString();
        sb.append("fromAmount=").append(urlEncode(fromAmountValueAsString)).append("");
        Object toAssetValue = getToAsset();
        String toAssetValueAsString = "";
        toAssetValueAsString = toAssetValue.toString();
        sb.append("toAsset=").append(urlEncode(toAssetValueAsString)).append("");
        Object toAmountValue = getToAmount();
        String toAmountValueAsString = "";
        toAmountValueAsString = toAmountValue.toString();
        sb.append("toAmount=").append(urlEncode(toAmountValueAsString)).append("");
        Object ratioValue = getRatio();
        String ratioValueAsString = "";
        ratioValueAsString = ratioValue.toString();
        sb.append("ratio=").append(urlEncode(ratioValueAsString)).append("");
        Object inverseRatioValue = getInverseRatio();
        String inverseRatioValueAsString = "";
        inverseRatioValueAsString = inverseRatioValue.toString();
        sb.append("inverseRatio=").append(urlEncode(inverseRatioValueAsString)).append("");
        Object createTimeValue = getCreateTime();
        String createTimeValueAsString = "";
        createTimeValueAsString = createTimeValue.toString();
        sb.append("createTime=").append(urlEncode(createTimeValueAsString)).append("");
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
        openapiFields.add("orderStatus");
        openapiFields.add("fromAsset");
        openapiFields.add("fromAmount");
        openapiFields.add("toAsset");
        openapiFields.add("toAmount");
        openapiFields.add("ratio");
        openapiFields.add("inverseRatio");
        openapiFields.add("createTime");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to OrderStatusResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OrderStatusResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OrderStatusResponse is not found in"
                                        + " the empty JSON string",
                                OrderStatusResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("orderStatus") != null && !jsonObj.get("orderStatus").isJsonNull())
                && !jsonObj.get("orderStatus").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `orderStatus` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("orderStatus").toString()));
        }
        if ((jsonObj.get("fromAsset") != null && !jsonObj.get("fromAsset").isJsonNull())
                && !jsonObj.get("fromAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `fromAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("fromAsset").toString()));
        }
        if ((jsonObj.get("fromAmount") != null && !jsonObj.get("fromAmount").isJsonNull())
                && !jsonObj.get("fromAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `fromAmount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("fromAmount").toString()));
        }
        if ((jsonObj.get("toAsset") != null && !jsonObj.get("toAsset").isJsonNull())
                && !jsonObj.get("toAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `toAsset` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("toAsset").toString()));
        }
        if ((jsonObj.get("toAmount") != null && !jsonObj.get("toAmount").isJsonNull())
                && !jsonObj.get("toAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `toAmount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("toAmount").toString()));
        }
        if ((jsonObj.get("ratio") != null && !jsonObj.get("ratio").isJsonNull())
                && !jsonObj.get("ratio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ratio` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("ratio").toString()));
        }
        if ((jsonObj.get("inverseRatio") != null && !jsonObj.get("inverseRatio").isJsonNull())
                && !jsonObj.get("inverseRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `inverseRatio` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("inverseRatio").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrderStatusResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrderStatusResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OrderStatusResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(OrderStatusResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OrderStatusResponse>() {
                        @Override
                        public void write(JsonWriter out, OrderStatusResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OrderStatusResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OrderStatusResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OrderStatusResponse
     * @throws IOException if the JSON string is invalid with respect to OrderStatusResponse
     */
    public static OrderStatusResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OrderStatusResponse.class);
    }

    /**
     * Convert an instance of OrderStatusResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
