/*
 * Binance Wallet REST API
 * OpenAPI Specification for the Binance Wallet REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.wallet.rest.model;

import com.binance.connector.client.wallet.rest.JSON;
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

/** DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner {
    public static final String SERIALIZED_NAME_ENTRY_PRICE = "entryPrice";

    @SerializedName(SERIALIZED_NAME_ENTRY_PRICE)
    @jakarta.annotation.Nullable
    private String entryPrice;

    public static final String SERIALIZED_NAME_MARK_PRICE = "markPrice";

    @SerializedName(SERIALIZED_NAME_MARK_PRICE)
    @jakarta.annotation.Nullable
    private String markPrice;

    public static final String SERIALIZED_NAME_POSITION_AMT = "positionAmt";

    @SerializedName(SERIALIZED_NAME_POSITION_AMT)
    @jakarta.annotation.Nullable
    private String positionAmt;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_UN_REALIZED_PROFIT = "unRealizedProfit";

    @SerializedName(SERIALIZED_NAME_UN_REALIZED_PROFIT)
    @jakarta.annotation.Nullable
    private String unRealizedProfit;

    public DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner() {}

    public DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner entryPrice(
            @jakarta.annotation.Nullable String entryPrice) {
        this.entryPrice = entryPrice;
        return this;
    }

    /**
     * Get entryPrice
     *
     * @return entryPrice
     */
    @jakarta.annotation.Nullable
    public String getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(@jakarta.annotation.Nullable String entryPrice) {
        this.entryPrice = entryPrice;
    }

    public DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner markPrice(
            @jakarta.annotation.Nullable String markPrice) {
        this.markPrice = markPrice;
        return this;
    }

    /**
     * Get markPrice
     *
     * @return markPrice
     */
    @jakarta.annotation.Nullable
    public String getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(@jakarta.annotation.Nullable String markPrice) {
        this.markPrice = markPrice;
    }

    public DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner positionAmt(
            @jakarta.annotation.Nullable String positionAmt) {
        this.positionAmt = positionAmt;
        return this;
    }

    /**
     * Get positionAmt
     *
     * @return positionAmt
     */
    @jakarta.annotation.Nullable
    public String getPositionAmt() {
        return positionAmt;
    }

    public void setPositionAmt(@jakarta.annotation.Nullable String positionAmt) {
        this.positionAmt = positionAmt;
    }

    public DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner symbol(
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

    public DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner unRealizedProfit(
            @jakarta.annotation.Nullable String unRealizedProfit) {
        this.unRealizedProfit = unRealizedProfit;
        return this;
    }

    /**
     * Get unRealizedProfit
     *
     * @return unRealizedProfit
     */
    @jakarta.annotation.Nullable
    public String getUnRealizedProfit() {
        return unRealizedProfit;
    }

    public void setUnRealizedProfit(@jakarta.annotation.Nullable String unRealizedProfit) {
        this.unRealizedProfit = unRealizedProfit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner
                dailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner =
                        (DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner) o;
        return Objects.equals(
                        this.entryPrice,
                        dailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner.entryPrice)
                && Objects.equals(
                        this.markPrice,
                        dailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner.markPrice)
                && Objects.equals(
                        this.positionAmt,
                        dailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner.positionAmt)
                && Objects.equals(
                        this.symbol,
                        dailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner.symbol)
                && Objects.equals(
                        this.unRealizedProfit,
                        dailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner
                                .unRealizedProfit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entryPrice, markPrice, positionAmt, symbol, unRealizedProfit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner {\n");
        sb.append("		entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
        sb.append("		markPrice: ").append(toIndentedString(markPrice)).append("\n");
        sb.append("		positionAmt: ").append(toIndentedString(positionAmt)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		unRealizedProfit: ").append(toIndentedString(unRealizedProfit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object entryPriceValue = getEntryPrice();
        String entryPriceValueAsString = "";
        entryPriceValueAsString = entryPriceValue.toString();
        sb.append("entryPrice=").append(urlEncode(entryPriceValueAsString)).append("");
        Object markPriceValue = getMarkPrice();
        String markPriceValueAsString = "";
        markPriceValueAsString = markPriceValue.toString();
        sb.append("markPrice=").append(urlEncode(markPriceValueAsString)).append("");
        Object positionAmtValue = getPositionAmt();
        String positionAmtValueAsString = "";
        positionAmtValueAsString = positionAmtValue.toString();
        sb.append("positionAmt=").append(urlEncode(positionAmtValueAsString)).append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object unRealizedProfitValue = getUnRealizedProfit();
        String unRealizedProfitValueAsString = "";
        unRealizedProfitValueAsString = unRealizedProfitValue.toString();
        sb.append("unRealizedProfit=").append(urlEncode(unRealizedProfitValueAsString)).append("");
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
        openapiFields.add("entryPrice");
        openapiFields.add("markPrice");
        openapiFields.add("positionAmt");
        openapiFields.add("symbol");
        openapiFields.add("unRealizedProfit");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner"
                                    + " is not found in the empty JSON string",
                                DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("entryPrice") != null && !jsonObj.get("entryPrice").isJsonNull())
                && !jsonObj.get("entryPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `entryPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("entryPrice").toString()));
        }
        if ((jsonObj.get("markPrice") != null && !jsonObj.get("markPrice").isJsonNull())
                && !jsonObj.get("markPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `markPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("markPrice").toString()));
        }
        if ((jsonObj.get("positionAmt") != null && !jsonObj.get("positionAmt").isJsonNull())
                && !jsonObj.get("positionAmt").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `positionAmt` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("positionAmt").toString()));
        }
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        if ((jsonObj.get("unRealizedProfit") != null
                        && !jsonObj.get("unRealizedProfit").isJsonNull())
                && !jsonObj.get("unRealizedProfit").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `unRealizedProfit` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("unRealizedProfit").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner.class
                    .isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes
                // 'DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner>
                    thisAdapter =
                            gson.getDelegateAdapter(
                                    this,
                                    TypeToken.get(
                                            DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner
                                                    .class));

            return (TypeAdapter<T>)
                    new TypeAdapter<
                            DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner given an
     * JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner
     * @throws IOException if the JSON string is invalid with respect to
     *     DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner
     */
    public static DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner fromJson(
            String jsonString) throws IOException {
        return JSON.getGson()
                .fromJson(
                        jsonString,
                        DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner.class);
    }

    /**
     * Convert an instance of DailyAccountSnapshotResponseSnapshotVosInnerDataPositionInner to an
     * JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
