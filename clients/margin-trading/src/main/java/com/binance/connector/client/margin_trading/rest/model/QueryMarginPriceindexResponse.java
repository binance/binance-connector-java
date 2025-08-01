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

/** QueryMarginPriceindexResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryMarginPriceindexResponse {
    public static final String SERIALIZED_NAME_CALC_TIME = "calcTime";

    @SerializedName(SERIALIZED_NAME_CALC_TIME)
    @jakarta.annotation.Nullable
    private Long calcTime;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private String price;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public QueryMarginPriceindexResponse() {}

    public QueryMarginPriceindexResponse calcTime(@jakarta.annotation.Nullable Long calcTime) {
        this.calcTime = calcTime;
        return this;
    }

    /**
     * Get calcTime
     *
     * @return calcTime
     */
    @jakarta.annotation.Nullable
    public Long getCalcTime() {
        return calcTime;
    }

    public void setCalcTime(@jakarta.annotation.Nullable Long calcTime) {
        this.calcTime = calcTime;
    }

    public QueryMarginPriceindexResponse price(@jakarta.annotation.Nullable String price) {
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

    public QueryMarginPriceindexResponse symbol(@jakarta.annotation.Nullable String symbol) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryMarginPriceindexResponse queryMarginPriceindexResponse =
                (QueryMarginPriceindexResponse) o;
        return Objects.equals(this.calcTime, queryMarginPriceindexResponse.calcTime)
                && Objects.equals(this.price, queryMarginPriceindexResponse.price)
                && Objects.equals(this.symbol, queryMarginPriceindexResponse.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calcTime, price, symbol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryMarginPriceindexResponse {\n");
        sb.append("		calcTime: ").append(toIndentedString(calcTime)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object calcTimeValue = getCalcTime();
        String calcTimeValueAsString = "";
        calcTimeValueAsString = calcTimeValue.toString();
        sb.append("calcTime=").append(urlEncode(calcTimeValueAsString)).append("");
        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
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
        openapiFields.add("calcTime");
        openapiFields.add("price");
        openapiFields.add("symbol");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryMarginPriceindexResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryMarginPriceindexResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in QueryMarginPriceindexResponse is not"
                                        + " found in the empty JSON string",
                                QueryMarginPriceindexResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull())
                && !jsonObj.get("price").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `price` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("price").toString()));
        }
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryMarginPriceindexResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'QueryMarginPriceindexResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryMarginPriceindexResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(QueryMarginPriceindexResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryMarginPriceindexResponse>() {
                        @Override
                        public void write(JsonWriter out, QueryMarginPriceindexResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryMarginPriceindexResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryMarginPriceindexResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryMarginPriceindexResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryMarginPriceindexResponse
     */
    public static QueryMarginPriceindexResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, QueryMarginPriceindexResponse.class);
    }

    /**
     * Convert an instance of QueryMarginPriceindexResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
