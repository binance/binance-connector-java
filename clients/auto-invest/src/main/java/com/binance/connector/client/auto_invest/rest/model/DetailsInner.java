/*
 * Binance Auto Invest REST API
 * OpenAPI Specification for the Binance Auto Invest REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.auto_invest.rest.model;

import com.binance.connector.client.auto_invest.rest.JSON;
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
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.hibernate.validator.constraints.*;

/** DetailsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DetailsInner {
    public static final String SERIALIZED_NAME_TARGET_ASSET = "targetAsset";

    @SerializedName(SERIALIZED_NAME_TARGET_ASSET)
    @jakarta.annotation.Nonnull
    private String targetAsset;

    public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";

    @SerializedName(SERIALIZED_NAME_PERCENTAGE)
    @jakarta.annotation.Nonnull
    private String percentage;

    public DetailsInner() {}

    public DetailsInner targetAsset(@jakarta.annotation.Nonnull String targetAsset) {
        this.targetAsset = targetAsset;
        return this;
    }

    /**
     * Get targetAsset
     *
     * @return targetAsset
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getTargetAsset() {
        return targetAsset;
    }

    public void setTargetAsset(@jakarta.annotation.Nonnull String targetAsset) {
        this.targetAsset = targetAsset;
    }

    public DetailsInner percentage(@jakarta.annotation.Nonnull String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Get percentage
     *
     * @return percentage
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(@jakarta.annotation.Nonnull String percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailsInner detailsInner = (DetailsInner) o;
        return Objects.equals(this.targetAsset, detailsInner.targetAsset)
                && Objects.equals(this.percentage, detailsInner.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetAsset, percentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailsInner {\n");
        sb.append("		targetAsset: ").append(toIndentedString(targetAsset)).append("\n");
        sb.append("		percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object targetAssetValue = getTargetAsset();
        String targetAssetValueAsString = "";
        targetAssetValueAsString = targetAssetValue.toString();
        sb.append("targetAsset=").append(urlEncode(targetAssetValueAsString)).append("");
        Object percentageValue = getPercentage();
        String percentageValueAsString = "";
        percentageValueAsString = percentageValue.toString();
        sb.append("percentage=").append(urlEncode(percentageValueAsString)).append("");
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
        openapiFields.add("targetAsset");
        openapiFields.add("percentage");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("targetAsset");
        openapiRequiredFields.add("percentage");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DetailsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DetailsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DetailsInner is not found in the empty"
                                        + " JSON string",
                                DetailsInner.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DetailsInner.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DetailsInner` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DetailsInner.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("targetAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `targetAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("targetAsset").toString()));
        }
        if (!jsonObj.get("percentage").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `percentage` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("percentage").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DetailsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DetailsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DetailsInner> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DetailsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DetailsInner>() {
                        @Override
                        public void write(JsonWriter out, DetailsInner value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DetailsInner read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DetailsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DetailsInner
     * @throws IOException if the JSON string is invalid with respect to DetailsInner
     */
    public static DetailsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DetailsInner.class);
    }

    /**
     * Convert an instance of DetailsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
