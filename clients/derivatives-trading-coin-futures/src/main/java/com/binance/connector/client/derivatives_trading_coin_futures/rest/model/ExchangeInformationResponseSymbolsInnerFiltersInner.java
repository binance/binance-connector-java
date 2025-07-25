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

/** ExchangeInformationResponseSymbolsInnerFiltersInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ExchangeInformationResponseSymbolsInnerFiltersInner {
    public static final String SERIALIZED_NAME_FILTER_TYPE = "filterType";

    @SerializedName(SERIALIZED_NAME_FILTER_TYPE)
    @jakarta.annotation.Nullable
    private String filterType;

    public static final String SERIALIZED_NAME_MAX_PRICE = "maxPrice";

    @SerializedName(SERIALIZED_NAME_MAX_PRICE)
    @jakarta.annotation.Nullable
    private String maxPrice;

    public static final String SERIALIZED_NAME_MIN_PRICE = "minPrice";

    @SerializedName(SERIALIZED_NAME_MIN_PRICE)
    @jakarta.annotation.Nullable
    private String minPrice;

    public static final String SERIALIZED_NAME_TICK_SIZE = "tickSize";

    @SerializedName(SERIALIZED_NAME_TICK_SIZE)
    @jakarta.annotation.Nullable
    private String tickSize;

    public static final String SERIALIZED_NAME_MAX_QTY = "maxQty";

    @SerializedName(SERIALIZED_NAME_MAX_QTY)
    @jakarta.annotation.Nullable
    private String maxQty;

    public static final String SERIALIZED_NAME_MIN_QTY = "minQty";

    @SerializedName(SERIALIZED_NAME_MIN_QTY)
    @jakarta.annotation.Nullable
    private String minQty;

    public static final String SERIALIZED_NAME_STEP_SIZE = "stepSize";

    @SerializedName(SERIALIZED_NAME_STEP_SIZE)
    @jakarta.annotation.Nullable
    private String stepSize;

    public static final String SERIALIZED_NAME_LIMIT = "limit";

    @SerializedName(SERIALIZED_NAME_LIMIT)
    @jakarta.annotation.Nullable
    private Long limit;

    public static final String SERIALIZED_NAME_MULTIPLIER_UP = "multiplierUp";

    @SerializedName(SERIALIZED_NAME_MULTIPLIER_UP)
    @jakarta.annotation.Nullable
    private String multiplierUp;

    public static final String SERIALIZED_NAME_MULTIPLIER_DOWN = "multiplierDown";

    @SerializedName(SERIALIZED_NAME_MULTIPLIER_DOWN)
    @jakarta.annotation.Nullable
    private String multiplierDown;

    public static final String SERIALIZED_NAME_MULTIPLIER_DECIMAL = "multiplierDecimal";

    @SerializedName(SERIALIZED_NAME_MULTIPLIER_DECIMAL)
    @jakarta.annotation.Nullable
    private Long multiplierDecimal;

    public ExchangeInformationResponseSymbolsInnerFiltersInner() {}

    public ExchangeInformationResponseSymbolsInnerFiltersInner filterType(
            @jakarta.annotation.Nullable String filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * Get filterType
     *
     * @return filterType
     */
    @jakarta.annotation.Nullable
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(@jakarta.annotation.Nullable String filterType) {
        this.filterType = filterType;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner maxPrice(
            @jakarta.annotation.Nullable String maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    /**
     * Get maxPrice
     *
     * @return maxPrice
     */
    @jakarta.annotation.Nullable
    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(@jakarta.annotation.Nullable String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner minPrice(
            @jakarta.annotation.Nullable String minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    /**
     * Get minPrice
     *
     * @return minPrice
     */
    @jakarta.annotation.Nullable
    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(@jakarta.annotation.Nullable String minPrice) {
        this.minPrice = minPrice;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner tickSize(
            @jakarta.annotation.Nullable String tickSize) {
        this.tickSize = tickSize;
        return this;
    }

    /**
     * Get tickSize
     *
     * @return tickSize
     */
    @jakarta.annotation.Nullable
    public String getTickSize() {
        return tickSize;
    }

    public void setTickSize(@jakarta.annotation.Nullable String tickSize) {
        this.tickSize = tickSize;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner maxQty(
            @jakarta.annotation.Nullable String maxQty) {
        this.maxQty = maxQty;
        return this;
    }

    /**
     * Get maxQty
     *
     * @return maxQty
     */
    @jakarta.annotation.Nullable
    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(@jakarta.annotation.Nullable String maxQty) {
        this.maxQty = maxQty;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner minQty(
            @jakarta.annotation.Nullable String minQty) {
        this.minQty = minQty;
        return this;
    }

    /**
     * Get minQty
     *
     * @return minQty
     */
    @jakarta.annotation.Nullable
    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(@jakarta.annotation.Nullable String minQty) {
        this.minQty = minQty;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner stepSize(
            @jakarta.annotation.Nullable String stepSize) {
        this.stepSize = stepSize;
        return this;
    }

    /**
     * Get stepSize
     *
     * @return stepSize
     */
    @jakarta.annotation.Nullable
    public String getStepSize() {
        return stepSize;
    }

    public void setStepSize(@jakarta.annotation.Nullable String stepSize) {
        this.stepSize = stepSize;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner limit(
            @jakarta.annotation.Nullable Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     *
     * @return limit
     */
    @jakarta.annotation.Nullable
    public Long getLimit() {
        return limit;
    }

    public void setLimit(@jakarta.annotation.Nullable Long limit) {
        this.limit = limit;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner multiplierUp(
            @jakarta.annotation.Nullable String multiplierUp) {
        this.multiplierUp = multiplierUp;
        return this;
    }

    /**
     * Get multiplierUp
     *
     * @return multiplierUp
     */
    @jakarta.annotation.Nullable
    public String getMultiplierUp() {
        return multiplierUp;
    }

    public void setMultiplierUp(@jakarta.annotation.Nullable String multiplierUp) {
        this.multiplierUp = multiplierUp;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner multiplierDown(
            @jakarta.annotation.Nullable String multiplierDown) {
        this.multiplierDown = multiplierDown;
        return this;
    }

    /**
     * Get multiplierDown
     *
     * @return multiplierDown
     */
    @jakarta.annotation.Nullable
    public String getMultiplierDown() {
        return multiplierDown;
    }

    public void setMultiplierDown(@jakarta.annotation.Nullable String multiplierDown) {
        this.multiplierDown = multiplierDown;
    }

    public ExchangeInformationResponseSymbolsInnerFiltersInner multiplierDecimal(
            @jakarta.annotation.Nullable Long multiplierDecimal) {
        this.multiplierDecimal = multiplierDecimal;
        return this;
    }

    /**
     * Get multiplierDecimal
     *
     * @return multiplierDecimal
     */
    @jakarta.annotation.Nullable
    public Long getMultiplierDecimal() {
        return multiplierDecimal;
    }

    public void setMultiplierDecimal(@jakarta.annotation.Nullable Long multiplierDecimal) {
        this.multiplierDecimal = multiplierDecimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExchangeInformationResponseSymbolsInnerFiltersInner
                exchangeInformationResponseSymbolsInnerFiltersInner =
                        (ExchangeInformationResponseSymbolsInnerFiltersInner) o;
        return Objects.equals(
                        this.filterType,
                        exchangeInformationResponseSymbolsInnerFiltersInner.filterType)
                && Objects.equals(
                        this.maxPrice, exchangeInformationResponseSymbolsInnerFiltersInner.maxPrice)
                && Objects.equals(
                        this.minPrice, exchangeInformationResponseSymbolsInnerFiltersInner.minPrice)
                && Objects.equals(
                        this.tickSize, exchangeInformationResponseSymbolsInnerFiltersInner.tickSize)
                && Objects.equals(
                        this.maxQty, exchangeInformationResponseSymbolsInnerFiltersInner.maxQty)
                && Objects.equals(
                        this.minQty, exchangeInformationResponseSymbolsInnerFiltersInner.minQty)
                && Objects.equals(
                        this.stepSize, exchangeInformationResponseSymbolsInnerFiltersInner.stepSize)
                && Objects.equals(
                        this.limit, exchangeInformationResponseSymbolsInnerFiltersInner.limit)
                && Objects.equals(
                        this.multiplierUp,
                        exchangeInformationResponseSymbolsInnerFiltersInner.multiplierUp)
                && Objects.equals(
                        this.multiplierDown,
                        exchangeInformationResponseSymbolsInnerFiltersInner.multiplierDown)
                && Objects.equals(
                        this.multiplierDecimal,
                        exchangeInformationResponseSymbolsInnerFiltersInner.multiplierDecimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                filterType,
                maxPrice,
                minPrice,
                tickSize,
                maxQty,
                minQty,
                stepSize,
                limit,
                multiplierUp,
                multiplierDown,
                multiplierDecimal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExchangeInformationResponseSymbolsInnerFiltersInner {\n");
        sb.append("		filterType: ").append(toIndentedString(filterType)).append("\n");
        sb.append("		maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
        sb.append("		minPrice: ").append(toIndentedString(minPrice)).append("\n");
        sb.append("		tickSize: ").append(toIndentedString(tickSize)).append("\n");
        sb.append("		maxQty: ").append(toIndentedString(maxQty)).append("\n");
        sb.append("		minQty: ").append(toIndentedString(minQty)).append("\n");
        sb.append("		stepSize: ").append(toIndentedString(stepSize)).append("\n");
        sb.append("		limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("		multiplierUp: ").append(toIndentedString(multiplierUp)).append("\n");
        sb.append("		multiplierDown: ").append(toIndentedString(multiplierDown)).append("\n");
        sb.append("		multiplierDecimal: ").append(toIndentedString(multiplierDecimal)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object filterTypeValue = getFilterType();
        String filterTypeValueAsString = "";
        filterTypeValueAsString = filterTypeValue.toString();
        sb.append("filterType=").append(urlEncode(filterTypeValueAsString)).append("");
        Object maxPriceValue = getMaxPrice();
        String maxPriceValueAsString = "";
        maxPriceValueAsString = maxPriceValue.toString();
        sb.append("maxPrice=").append(urlEncode(maxPriceValueAsString)).append("");
        Object minPriceValue = getMinPrice();
        String minPriceValueAsString = "";
        minPriceValueAsString = minPriceValue.toString();
        sb.append("minPrice=").append(urlEncode(minPriceValueAsString)).append("");
        Object tickSizeValue = getTickSize();
        String tickSizeValueAsString = "";
        tickSizeValueAsString = tickSizeValue.toString();
        sb.append("tickSize=").append(urlEncode(tickSizeValueAsString)).append("");
        Object maxQtyValue = getMaxQty();
        String maxQtyValueAsString = "";
        maxQtyValueAsString = maxQtyValue.toString();
        sb.append("maxQty=").append(urlEncode(maxQtyValueAsString)).append("");
        Object minQtyValue = getMinQty();
        String minQtyValueAsString = "";
        minQtyValueAsString = minQtyValue.toString();
        sb.append("minQty=").append(urlEncode(minQtyValueAsString)).append("");
        Object stepSizeValue = getStepSize();
        String stepSizeValueAsString = "";
        stepSizeValueAsString = stepSizeValue.toString();
        sb.append("stepSize=").append(urlEncode(stepSizeValueAsString)).append("");
        Object limitValue = getLimit();
        String limitValueAsString = "";
        limitValueAsString = limitValue.toString();
        sb.append("limit=").append(urlEncode(limitValueAsString)).append("");
        Object multiplierUpValue = getMultiplierUp();
        String multiplierUpValueAsString = "";
        multiplierUpValueAsString = multiplierUpValue.toString();
        sb.append("multiplierUp=").append(urlEncode(multiplierUpValueAsString)).append("");
        Object multiplierDownValue = getMultiplierDown();
        String multiplierDownValueAsString = "";
        multiplierDownValueAsString = multiplierDownValue.toString();
        sb.append("multiplierDown=").append(urlEncode(multiplierDownValueAsString)).append("");
        Object multiplierDecimalValue = getMultiplierDecimal();
        String multiplierDecimalValueAsString = "";
        multiplierDecimalValueAsString = multiplierDecimalValue.toString();
        sb.append("multiplierDecimal=")
                .append(urlEncode(multiplierDecimalValueAsString))
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
        openapiFields.add("filterType");
        openapiFields.add("maxPrice");
        openapiFields.add("minPrice");
        openapiFields.add("tickSize");
        openapiFields.add("maxQty");
        openapiFields.add("minQty");
        openapiFields.add("stepSize");
        openapiFields.add("limit");
        openapiFields.add("multiplierUp");
        openapiFields.add("multiplierDown");
        openapiFields.add("multiplierDecimal");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ExchangeInformationResponseSymbolsInnerFiltersInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ExchangeInformationResponseSymbolsInnerFiltersInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " ExchangeInformationResponseSymbolsInnerFiltersInner is not"
                                    + " found in the empty JSON string",
                                ExchangeInformationResponseSymbolsInnerFiltersInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("filterType") != null && !jsonObj.get("filterType").isJsonNull())
                && !jsonObj.get("filterType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `filterType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("filterType").toString()));
        }
        if ((jsonObj.get("maxPrice") != null && !jsonObj.get("maxPrice").isJsonNull())
                && !jsonObj.get("maxPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `maxPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("maxPrice").toString()));
        }
        if ((jsonObj.get("minPrice") != null && !jsonObj.get("minPrice").isJsonNull())
                && !jsonObj.get("minPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `minPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("minPrice").toString()));
        }
        if ((jsonObj.get("tickSize") != null && !jsonObj.get("tickSize").isJsonNull())
                && !jsonObj.get("tickSize").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tickSize` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("tickSize").toString()));
        }
        if ((jsonObj.get("maxQty") != null && !jsonObj.get("maxQty").isJsonNull())
                && !jsonObj.get("maxQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `maxQty` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("maxQty").toString()));
        }
        if ((jsonObj.get("minQty") != null && !jsonObj.get("minQty").isJsonNull())
                && !jsonObj.get("minQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `minQty` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("minQty").toString()));
        }
        if ((jsonObj.get("stepSize") != null && !jsonObj.get("stepSize").isJsonNull())
                && !jsonObj.get("stepSize").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `stepSize` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("stepSize").toString()));
        }
        if ((jsonObj.get("multiplierUp") != null && !jsonObj.get("multiplierUp").isJsonNull())
                && !jsonObj.get("multiplierUp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `multiplierUp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("multiplierUp").toString()));
        }
        if ((jsonObj.get("multiplierDown") != null && !jsonObj.get("multiplierDown").isJsonNull())
                && !jsonObj.get("multiplierDown").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `multiplierDown` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("multiplierDown").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExchangeInformationResponseSymbolsInnerFiltersInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'ExchangeInformationResponseSymbolsInnerFiltersInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExchangeInformationResponseSymbolsInnerFiltersInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(
                                    ExchangeInformationResponseSymbolsInnerFiltersInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ExchangeInformationResponseSymbolsInnerFiltersInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                ExchangeInformationResponseSymbolsInnerFiltersInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ExchangeInformationResponseSymbolsInnerFiltersInner read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ExchangeInformationResponseSymbolsInnerFiltersInner given an JSON
     * string
     *
     * @param jsonString JSON string
     * @return An instance of ExchangeInformationResponseSymbolsInnerFiltersInner
     * @throws IOException if the JSON string is invalid with respect to
     *     ExchangeInformationResponseSymbolsInnerFiltersInner
     */
    public static ExchangeInformationResponseSymbolsInnerFiltersInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, ExchangeInformationResponseSymbolsInnerFiltersInner.class);
    }

    /**
     * Convert an instance of ExchangeInformationResponseSymbolsInnerFiltersInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
