/*
 * Binance VIP Loan REST API
 * OpenAPI Specification for the Binance VIP Loan REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.vip_loan.rest.model;

import com.binance.connector.client.vip_loan.rest.JSON;
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

/** GetCollateralAssetDataResponseRowsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetCollateralAssetDataResponseRowsInner {
    public static final String SERIALIZED_NAME_COLLATERAL_COIN = "collateralCoin";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_COIN)
    @jakarta.annotation.Nullable
    private String collateralCoin;

    public static final String SERIALIZED_NAME_1ST_COLLATERAL_RATIO = "_1stCollateralRatio";

    @SerializedName(SERIALIZED_NAME_1ST_COLLATERAL_RATIO)
    @jakarta.annotation.Nullable
    private String _1stCollateralRatio;

    public static final String SERIALIZED_NAME_1ST_COLLATERAL_RANGE = "_1stCollateralRange";

    @SerializedName(SERIALIZED_NAME_1ST_COLLATERAL_RANGE)
    @jakarta.annotation.Nullable
    private String _1stCollateralRange;

    public static final String SERIALIZED_NAME_2ND_COLLATERAL_RATIO = "_2ndCollateralRatio";

    @SerializedName(SERIALIZED_NAME_2ND_COLLATERAL_RATIO)
    @jakarta.annotation.Nullable
    private String _2ndCollateralRatio;

    public static final String SERIALIZED_NAME_2ND_COLLATERAL_RANGE = "_2ndCollateralRange";

    @SerializedName(SERIALIZED_NAME_2ND_COLLATERAL_RANGE)
    @jakarta.annotation.Nullable
    private String _2ndCollateralRange;

    public static final String SERIALIZED_NAME_3RD_COLLATERAL_RATIO = "_3rdCollateralRatio";

    @SerializedName(SERIALIZED_NAME_3RD_COLLATERAL_RATIO)
    @jakarta.annotation.Nullable
    private String _3rdCollateralRatio;

    public static final String SERIALIZED_NAME_3RD_COLLATERAL_RANGE = "_3rdCollateralRange";

    @SerializedName(SERIALIZED_NAME_3RD_COLLATERAL_RANGE)
    @jakarta.annotation.Nullable
    private String _3rdCollateralRange;

    public static final String SERIALIZED_NAME_4TH_COLLATERAL_RATIO = "_4thCollateralRatio";

    @SerializedName(SERIALIZED_NAME_4TH_COLLATERAL_RATIO)
    @jakarta.annotation.Nullable
    private String _4thCollateralRatio;

    public static final String SERIALIZED_NAME_4TH_COLLATERAL_RANGE = "_4thCollateralRange";

    @SerializedName(SERIALIZED_NAME_4TH_COLLATERAL_RANGE)
    @jakarta.annotation.Nullable
    private String _4thCollateralRange;

    public GetCollateralAssetDataResponseRowsInner() {}

    public GetCollateralAssetDataResponseRowsInner collateralCoin(
            @jakarta.annotation.Nullable String collateralCoin) {
        this.collateralCoin = collateralCoin;
        return this;
    }

    /**
     * Get collateralCoin
     *
     * @return collateralCoin
     */
    @jakarta.annotation.Nullable
    public String getCollateralCoin() {
        return collateralCoin;
    }

    public void setCollateralCoin(@jakarta.annotation.Nullable String collateralCoin) {
        this.collateralCoin = collateralCoin;
    }

    public GetCollateralAssetDataResponseRowsInner _1stCollateralRatio(
            @jakarta.annotation.Nullable String _1stCollateralRatio) {
        this._1stCollateralRatio = _1stCollateralRatio;
        return this;
    }

    /**
     * Get _1stCollateralRatio
     *
     * @return _1stCollateralRatio
     */
    @jakarta.annotation.Nullable
    public String get1stCollateralRatio() {
        return _1stCollateralRatio;
    }

    public void set1stCollateralRatio(@jakarta.annotation.Nullable String _1stCollateralRatio) {
        this._1stCollateralRatio = _1stCollateralRatio;
    }

    public GetCollateralAssetDataResponseRowsInner _1stCollateralRange(
            @jakarta.annotation.Nullable String _1stCollateralRange) {
        this._1stCollateralRange = _1stCollateralRange;
        return this;
    }

    /**
     * Get _1stCollateralRange
     *
     * @return _1stCollateralRange
     */
    @jakarta.annotation.Nullable
    public String get1stCollateralRange() {
        return _1stCollateralRange;
    }

    public void set1stCollateralRange(@jakarta.annotation.Nullable String _1stCollateralRange) {
        this._1stCollateralRange = _1stCollateralRange;
    }

    public GetCollateralAssetDataResponseRowsInner _2ndCollateralRatio(
            @jakarta.annotation.Nullable String _2ndCollateralRatio) {
        this._2ndCollateralRatio = _2ndCollateralRatio;
        return this;
    }

    /**
     * Get _2ndCollateralRatio
     *
     * @return _2ndCollateralRatio
     */
    @jakarta.annotation.Nullable
    public String get2ndCollateralRatio() {
        return _2ndCollateralRatio;
    }

    public void set2ndCollateralRatio(@jakarta.annotation.Nullable String _2ndCollateralRatio) {
        this._2ndCollateralRatio = _2ndCollateralRatio;
    }

    public GetCollateralAssetDataResponseRowsInner _2ndCollateralRange(
            @jakarta.annotation.Nullable String _2ndCollateralRange) {
        this._2ndCollateralRange = _2ndCollateralRange;
        return this;
    }

    /**
     * Get _2ndCollateralRange
     *
     * @return _2ndCollateralRange
     */
    @jakarta.annotation.Nullable
    public String get2ndCollateralRange() {
        return _2ndCollateralRange;
    }

    public void set2ndCollateralRange(@jakarta.annotation.Nullable String _2ndCollateralRange) {
        this._2ndCollateralRange = _2ndCollateralRange;
    }

    public GetCollateralAssetDataResponseRowsInner _3rdCollateralRatio(
            @jakarta.annotation.Nullable String _3rdCollateralRatio) {
        this._3rdCollateralRatio = _3rdCollateralRatio;
        return this;
    }

    /**
     * Get _3rdCollateralRatio
     *
     * @return _3rdCollateralRatio
     */
    @jakarta.annotation.Nullable
    public String get3rdCollateralRatio() {
        return _3rdCollateralRatio;
    }

    public void set3rdCollateralRatio(@jakarta.annotation.Nullable String _3rdCollateralRatio) {
        this._3rdCollateralRatio = _3rdCollateralRatio;
    }

    public GetCollateralAssetDataResponseRowsInner _3rdCollateralRange(
            @jakarta.annotation.Nullable String _3rdCollateralRange) {
        this._3rdCollateralRange = _3rdCollateralRange;
        return this;
    }

    /**
     * Get _3rdCollateralRange
     *
     * @return _3rdCollateralRange
     */
    @jakarta.annotation.Nullable
    public String get3rdCollateralRange() {
        return _3rdCollateralRange;
    }

    public void set3rdCollateralRange(@jakarta.annotation.Nullable String _3rdCollateralRange) {
        this._3rdCollateralRange = _3rdCollateralRange;
    }

    public GetCollateralAssetDataResponseRowsInner _4thCollateralRatio(
            @jakarta.annotation.Nullable String _4thCollateralRatio) {
        this._4thCollateralRatio = _4thCollateralRatio;
        return this;
    }

    /**
     * Get _4thCollateralRatio
     *
     * @return _4thCollateralRatio
     */
    @jakarta.annotation.Nullable
    public String get4thCollateralRatio() {
        return _4thCollateralRatio;
    }

    public void set4thCollateralRatio(@jakarta.annotation.Nullable String _4thCollateralRatio) {
        this._4thCollateralRatio = _4thCollateralRatio;
    }

    public GetCollateralAssetDataResponseRowsInner _4thCollateralRange(
            @jakarta.annotation.Nullable String _4thCollateralRange) {
        this._4thCollateralRange = _4thCollateralRange;
        return this;
    }

    /**
     * Get _4thCollateralRange
     *
     * @return _4thCollateralRange
     */
    @jakarta.annotation.Nullable
    public String get4thCollateralRange() {
        return _4thCollateralRange;
    }

    public void set4thCollateralRange(@jakarta.annotation.Nullable String _4thCollateralRange) {
        this._4thCollateralRange = _4thCollateralRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetCollateralAssetDataResponseRowsInner getCollateralAssetDataResponseRowsInner =
                (GetCollateralAssetDataResponseRowsInner) o;
        return Objects.equals(
                        this.collateralCoin, getCollateralAssetDataResponseRowsInner.collateralCoin)
                && Objects.equals(
                        this._1stCollateralRatio,
                        getCollateralAssetDataResponseRowsInner._1stCollateralRatio)
                && Objects.equals(
                        this._1stCollateralRange,
                        getCollateralAssetDataResponseRowsInner._1stCollateralRange)
                && Objects.equals(
                        this._2ndCollateralRatio,
                        getCollateralAssetDataResponseRowsInner._2ndCollateralRatio)
                && Objects.equals(
                        this._2ndCollateralRange,
                        getCollateralAssetDataResponseRowsInner._2ndCollateralRange)
                && Objects.equals(
                        this._3rdCollateralRatio,
                        getCollateralAssetDataResponseRowsInner._3rdCollateralRatio)
                && Objects.equals(
                        this._3rdCollateralRange,
                        getCollateralAssetDataResponseRowsInner._3rdCollateralRange)
                && Objects.equals(
                        this._4thCollateralRatio,
                        getCollateralAssetDataResponseRowsInner._4thCollateralRatio)
                && Objects.equals(
                        this._4thCollateralRange,
                        getCollateralAssetDataResponseRowsInner._4thCollateralRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                collateralCoin,
                _1stCollateralRatio,
                _1stCollateralRange,
                _2ndCollateralRatio,
                _2ndCollateralRange,
                _3rdCollateralRatio,
                _3rdCollateralRange,
                _4thCollateralRatio,
                _4thCollateralRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCollateralAssetDataResponseRowsInner {\n");
        sb.append("		collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
        sb.append("		_1stCollateralRatio: ")
                .append(toIndentedString(_1stCollateralRatio))
                .append("\n");
        sb.append("		_1stCollateralRange: ")
                .append(toIndentedString(_1stCollateralRange))
                .append("\n");
        sb.append("		_2ndCollateralRatio: ")
                .append(toIndentedString(_2ndCollateralRatio))
                .append("\n");
        sb.append("		_2ndCollateralRange: ")
                .append(toIndentedString(_2ndCollateralRange))
                .append("\n");
        sb.append("		_3rdCollateralRatio: ")
                .append(toIndentedString(_3rdCollateralRatio))
                .append("\n");
        sb.append("		_3rdCollateralRange: ")
                .append(toIndentedString(_3rdCollateralRange))
                .append("\n");
        sb.append("		_4thCollateralRatio: ")
                .append(toIndentedString(_4thCollateralRatio))
                .append("\n");
        sb.append("		_4thCollateralRange: ")
                .append(toIndentedString(_4thCollateralRange))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object collateralCoinValue = getCollateralCoin();
        String collateralCoinValueAsString = "";
        collateralCoinValueAsString = collateralCoinValue.toString();
        sb.append("collateralCoin=").append(urlEncode(collateralCoinValueAsString)).append("");
        Object _1stCollateralRatioValue = get1stCollateralRatio();
        String _1stCollateralRatioValueAsString = "";
        _1stCollateralRatioValueAsString = _1stCollateralRatioValue.toString();
        sb.append("_1stCollateralRatio=")
                .append(urlEncode(_1stCollateralRatioValueAsString))
                .append("");
        Object _1stCollateralRangeValue = get1stCollateralRange();
        String _1stCollateralRangeValueAsString = "";
        _1stCollateralRangeValueAsString = _1stCollateralRangeValue.toString();
        sb.append("_1stCollateralRange=")
                .append(urlEncode(_1stCollateralRangeValueAsString))
                .append("");
        Object _2ndCollateralRatioValue = get2ndCollateralRatio();
        String _2ndCollateralRatioValueAsString = "";
        _2ndCollateralRatioValueAsString = _2ndCollateralRatioValue.toString();
        sb.append("_2ndCollateralRatio=")
                .append(urlEncode(_2ndCollateralRatioValueAsString))
                .append("");
        Object _2ndCollateralRangeValue = get2ndCollateralRange();
        String _2ndCollateralRangeValueAsString = "";
        _2ndCollateralRangeValueAsString = _2ndCollateralRangeValue.toString();
        sb.append("_2ndCollateralRange=")
                .append(urlEncode(_2ndCollateralRangeValueAsString))
                .append("");
        Object _3rdCollateralRatioValue = get3rdCollateralRatio();
        String _3rdCollateralRatioValueAsString = "";
        _3rdCollateralRatioValueAsString = _3rdCollateralRatioValue.toString();
        sb.append("_3rdCollateralRatio=")
                .append(urlEncode(_3rdCollateralRatioValueAsString))
                .append("");
        Object _3rdCollateralRangeValue = get3rdCollateralRange();
        String _3rdCollateralRangeValueAsString = "";
        _3rdCollateralRangeValueAsString = _3rdCollateralRangeValue.toString();
        sb.append("_3rdCollateralRange=")
                .append(urlEncode(_3rdCollateralRangeValueAsString))
                .append("");
        Object _4thCollateralRatioValue = get4thCollateralRatio();
        String _4thCollateralRatioValueAsString = "";
        _4thCollateralRatioValueAsString = _4thCollateralRatioValue.toString();
        sb.append("_4thCollateralRatio=")
                .append(urlEncode(_4thCollateralRatioValueAsString))
                .append("");
        Object _4thCollateralRangeValue = get4thCollateralRange();
        String _4thCollateralRangeValueAsString = "";
        _4thCollateralRangeValueAsString = _4thCollateralRangeValue.toString();
        sb.append("_4thCollateralRange=")
                .append(urlEncode(_4thCollateralRangeValueAsString))
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
        openapiFields.add("collateralCoin");
        openapiFields.add("_1stCollateralRatio");
        openapiFields.add("_1stCollateralRange");
        openapiFields.add("_2ndCollateralRatio");
        openapiFields.add("_2ndCollateralRange");
        openapiFields.add("_3rdCollateralRatio");
        openapiFields.add("_3rdCollateralRange");
        openapiFields.add("_4thCollateralRatio");
        openapiFields.add("_4thCollateralRange");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetCollateralAssetDataResponseRowsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetCollateralAssetDataResponseRowsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " GetCollateralAssetDataResponseRowsInner is not found in the"
                                    + " empty JSON string",
                                GetCollateralAssetDataResponseRowsInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("collateralCoin") != null && !jsonObj.get("collateralCoin").isJsonNull())
                && !jsonObj.get("collateralCoin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collateralCoin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("collateralCoin").toString()));
        }
        if ((jsonObj.get("_1stCollateralRatio") != null
                        && !jsonObj.get("_1stCollateralRatio").isJsonNull())
                && !jsonObj.get("_1stCollateralRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_1stCollateralRatio` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_1stCollateralRatio").toString()));
        }
        if ((jsonObj.get("_1stCollateralRange") != null
                        && !jsonObj.get("_1stCollateralRange").isJsonNull())
                && !jsonObj.get("_1stCollateralRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_1stCollateralRange` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_1stCollateralRange").toString()));
        }
        if ((jsonObj.get("_2ndCollateralRatio") != null
                        && !jsonObj.get("_2ndCollateralRatio").isJsonNull())
                && !jsonObj.get("_2ndCollateralRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_2ndCollateralRatio` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_2ndCollateralRatio").toString()));
        }
        if ((jsonObj.get("_2ndCollateralRange") != null
                        && !jsonObj.get("_2ndCollateralRange").isJsonNull())
                && !jsonObj.get("_2ndCollateralRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_2ndCollateralRange` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_2ndCollateralRange").toString()));
        }
        if ((jsonObj.get("_3rdCollateralRatio") != null
                        && !jsonObj.get("_3rdCollateralRatio").isJsonNull())
                && !jsonObj.get("_3rdCollateralRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_3rdCollateralRatio` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_3rdCollateralRatio").toString()));
        }
        if ((jsonObj.get("_3rdCollateralRange") != null
                        && !jsonObj.get("_3rdCollateralRange").isJsonNull())
                && !jsonObj.get("_3rdCollateralRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_3rdCollateralRange` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_3rdCollateralRange").toString()));
        }
        if ((jsonObj.get("_4thCollateralRatio") != null
                        && !jsonObj.get("_4thCollateralRatio").isJsonNull())
                && !jsonObj.get("_4thCollateralRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_4thCollateralRatio` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_4thCollateralRatio").toString()));
        }
        if ((jsonObj.get("_4thCollateralRange") != null
                        && !jsonObj.get("_4thCollateralRange").isJsonNull())
                && !jsonObj.get("_4thCollateralRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `_4thCollateralRange` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("_4thCollateralRange").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetCollateralAssetDataResponseRowsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes 'GetCollateralAssetDataResponseRowsInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetCollateralAssetDataResponseRowsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetCollateralAssetDataResponseRowsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetCollateralAssetDataResponseRowsInner>() {
                        @Override
                        public void write(
                                JsonWriter out, GetCollateralAssetDataResponseRowsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetCollateralAssetDataResponseRowsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetCollateralAssetDataResponseRowsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetCollateralAssetDataResponseRowsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     GetCollateralAssetDataResponseRowsInner
     */
    public static GetCollateralAssetDataResponseRowsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, GetCollateralAssetDataResponseRowsInner.class);
    }

    /**
     * Convert an instance of GetCollateralAssetDataResponseRowsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
