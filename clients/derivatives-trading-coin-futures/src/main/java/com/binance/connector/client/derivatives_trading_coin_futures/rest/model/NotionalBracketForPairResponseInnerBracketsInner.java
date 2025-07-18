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

/** NotionalBracketForPairResponseInnerBracketsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class NotionalBracketForPairResponseInnerBracketsInner {
    public static final String SERIALIZED_NAME_BRACKET = "bracket";

    @SerializedName(SERIALIZED_NAME_BRACKET)
    @jakarta.annotation.Nullable
    private Long bracket;

    public static final String SERIALIZED_NAME_INITIAL_LEVERAGE = "initialLeverage";

    @SerializedName(SERIALIZED_NAME_INITIAL_LEVERAGE)
    @jakarta.annotation.Nullable
    private Long initialLeverage;

    public static final String SERIALIZED_NAME_QTY_CAP = "qtyCap";

    @SerializedName(SERIALIZED_NAME_QTY_CAP)
    @jakarta.annotation.Nullable
    private Long qtyCap;

    public static final String SERIALIZED_NAME_QTYL_FLOOR = "qtylFloor";

    @SerializedName(SERIALIZED_NAME_QTYL_FLOOR)
    @jakarta.annotation.Nullable
    private Long qtylFloor;

    public static final String SERIALIZED_NAME_MAINT_MARGIN_RATIO = "maintMarginRatio";

    @SerializedName(SERIALIZED_NAME_MAINT_MARGIN_RATIO)
    @jakarta.annotation.Nullable
    private Double maintMarginRatio;

    public static final String SERIALIZED_NAME_CUM = "cum";

    @SerializedName(SERIALIZED_NAME_CUM)
    @jakarta.annotation.Nullable
    private Double cum;

    public NotionalBracketForPairResponseInnerBracketsInner() {}

    public NotionalBracketForPairResponseInnerBracketsInner bracket(
            @jakarta.annotation.Nullable Long bracket) {
        this.bracket = bracket;
        return this;
    }

    /**
     * Get bracket
     *
     * @return bracket
     */
    @jakarta.annotation.Nullable
    public Long getBracket() {
        return bracket;
    }

    public void setBracket(@jakarta.annotation.Nullable Long bracket) {
        this.bracket = bracket;
    }

    public NotionalBracketForPairResponseInnerBracketsInner initialLeverage(
            @jakarta.annotation.Nullable Long initialLeverage) {
        this.initialLeverage = initialLeverage;
        return this;
    }

    /**
     * Get initialLeverage
     *
     * @return initialLeverage
     */
    @jakarta.annotation.Nullable
    public Long getInitialLeverage() {
        return initialLeverage;
    }

    public void setInitialLeverage(@jakarta.annotation.Nullable Long initialLeverage) {
        this.initialLeverage = initialLeverage;
    }

    public NotionalBracketForPairResponseInnerBracketsInner qtyCap(
            @jakarta.annotation.Nullable Long qtyCap) {
        this.qtyCap = qtyCap;
        return this;
    }

    /**
     * Get qtyCap
     *
     * @return qtyCap
     */
    @jakarta.annotation.Nullable
    public Long getQtyCap() {
        return qtyCap;
    }

    public void setQtyCap(@jakarta.annotation.Nullable Long qtyCap) {
        this.qtyCap = qtyCap;
    }

    public NotionalBracketForPairResponseInnerBracketsInner qtylFloor(
            @jakarta.annotation.Nullable Long qtylFloor) {
        this.qtylFloor = qtylFloor;
        return this;
    }

    /**
     * Get qtylFloor
     *
     * @return qtylFloor
     */
    @jakarta.annotation.Nullable
    public Long getQtylFloor() {
        return qtylFloor;
    }

    public void setQtylFloor(@jakarta.annotation.Nullable Long qtylFloor) {
        this.qtylFloor = qtylFloor;
    }

    public NotionalBracketForPairResponseInnerBracketsInner maintMarginRatio(
            @jakarta.annotation.Nullable Double maintMarginRatio) {
        this.maintMarginRatio = maintMarginRatio;
        return this;
    }

    /**
     * Get maintMarginRatio
     *
     * @return maintMarginRatio
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getMaintMarginRatio() {
        return maintMarginRatio;
    }

    public void setMaintMarginRatio(@jakarta.annotation.Nullable Double maintMarginRatio) {
        this.maintMarginRatio = maintMarginRatio;
    }

    public NotionalBracketForPairResponseInnerBracketsInner cum(
            @jakarta.annotation.Nullable Double cum) {
        this.cum = cum;
        return this;
    }

    /**
     * Get cum
     *
     * @return cum
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getCum() {
        return cum;
    }

    public void setCum(@jakarta.annotation.Nullable Double cum) {
        this.cum = cum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotionalBracketForPairResponseInnerBracketsInner
                notionalBracketForPairResponseInnerBracketsInner =
                        (NotionalBracketForPairResponseInnerBracketsInner) o;
        return Objects.equals(
                        this.bracket, notionalBracketForPairResponseInnerBracketsInner.bracket)
                && Objects.equals(
                        this.initialLeverage,
                        notionalBracketForPairResponseInnerBracketsInner.initialLeverage)
                && Objects.equals(
                        this.qtyCap, notionalBracketForPairResponseInnerBracketsInner.qtyCap)
                && Objects.equals(
                        this.qtylFloor, notionalBracketForPairResponseInnerBracketsInner.qtylFloor)
                && Objects.equals(
                        this.maintMarginRatio,
                        notionalBracketForPairResponseInnerBracketsInner.maintMarginRatio)
                && Objects.equals(this.cum, notionalBracketForPairResponseInnerBracketsInner.cum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bracket, initialLeverage, qtyCap, qtylFloor, maintMarginRatio, cum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotionalBracketForPairResponseInnerBracketsInner {\n");
        sb.append("		bracket: ").append(toIndentedString(bracket)).append("\n");
        sb.append("		initialLeverage: ").append(toIndentedString(initialLeverage)).append("\n");
        sb.append("		qtyCap: ").append(toIndentedString(qtyCap)).append("\n");
        sb.append("		qtylFloor: ").append(toIndentedString(qtylFloor)).append("\n");
        sb.append("		maintMarginRatio: ").append(toIndentedString(maintMarginRatio)).append("\n");
        sb.append("		cum: ").append(toIndentedString(cum)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object bracketValue = getBracket();
        String bracketValueAsString = "";
        bracketValueAsString = bracketValue.toString();
        sb.append("bracket=").append(urlEncode(bracketValueAsString)).append("");
        Object initialLeverageValue = getInitialLeverage();
        String initialLeverageValueAsString = "";
        initialLeverageValueAsString = initialLeverageValue.toString();
        sb.append("initialLeverage=").append(urlEncode(initialLeverageValueAsString)).append("");
        Object qtyCapValue = getQtyCap();
        String qtyCapValueAsString = "";
        qtyCapValueAsString = qtyCapValue.toString();
        sb.append("qtyCap=").append(urlEncode(qtyCapValueAsString)).append("");
        Object qtylFloorValue = getQtylFloor();
        String qtylFloorValueAsString = "";
        qtylFloorValueAsString = qtylFloorValue.toString();
        sb.append("qtylFloor=").append(urlEncode(qtylFloorValueAsString)).append("");
        Object maintMarginRatioValue = getMaintMarginRatio();
        String maintMarginRatioValueAsString = "";
        maintMarginRatioValueAsString = maintMarginRatioValue.toString();
        sb.append("maintMarginRatio=").append(urlEncode(maintMarginRatioValueAsString)).append("");
        Object cumValue = getCum();
        String cumValueAsString = "";
        cumValueAsString = cumValue.toString();
        sb.append("cum=").append(urlEncode(cumValueAsString)).append("");
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
        openapiFields.add("bracket");
        openapiFields.add("initialLeverage");
        openapiFields.add("qtyCap");
        openapiFields.add("qtylFloor");
        openapiFields.add("maintMarginRatio");
        openapiFields.add("cum");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     NotionalBracketForPairResponseInnerBracketsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!NotionalBracketForPairResponseInnerBracketsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                        + " NotionalBracketForPairResponseInnerBracketsInner is not"
                                        + " found in the empty JSON string",
                                NotionalBracketForPairResponseInnerBracketsInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NotionalBracketForPairResponseInnerBracketsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'NotionalBracketForPairResponseInnerBracketsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NotionalBracketForPairResponseInnerBracketsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(NotionalBracketForPairResponseInnerBracketsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NotionalBracketForPairResponseInnerBracketsInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                NotionalBracketForPairResponseInnerBracketsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NotionalBracketForPairResponseInnerBracketsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NotionalBracketForPairResponseInnerBracketsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NotionalBracketForPairResponseInnerBracketsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     NotionalBracketForPairResponseInnerBracketsInner
     */
    public static NotionalBracketForPairResponseInnerBracketsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, NotionalBracketForPairResponseInnerBracketsInner.class);
    }

    /**
     * Convert an instance of NotionalBracketForPairResponseInnerBracketsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
