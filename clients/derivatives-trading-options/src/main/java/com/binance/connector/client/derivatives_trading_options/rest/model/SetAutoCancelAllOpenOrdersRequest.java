/*
 * Binance Derivatives Trading Options REST API
 * OpenAPI Specification for the Binance Derivatives Trading Options REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_options.rest.model;

import com.binance.connector.client.derivatives_trading_options.rest.JSON;
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

/** SetAutoCancelAllOpenOrdersRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SetAutoCancelAllOpenOrdersRequest {
    public static final String SERIALIZED_NAME_UNDERLYING = "underlying";

    @SerializedName(SERIALIZED_NAME_UNDERLYING)
    @jakarta.annotation.Nonnull
    private String underlying;

    public static final String SERIALIZED_NAME_COUNTDOWN_TIME = "countdownTime";

    @SerializedName(SERIALIZED_NAME_COUNTDOWN_TIME)
    @jakarta.annotation.Nonnull
    private Long countdownTime;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public SetAutoCancelAllOpenOrdersRequest() {}

    public SetAutoCancelAllOpenOrdersRequest underlying(
            @jakarta.annotation.Nonnull String underlying) {
        this.underlying = underlying;
        return this;
    }

    /**
     * Get underlying
     *
     * @return underlying
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(@jakarta.annotation.Nonnull String underlying) {
        this.underlying = underlying;
    }

    public SetAutoCancelAllOpenOrdersRequest countdownTime(
            @jakarta.annotation.Nonnull Long countdownTime) {
        this.countdownTime = countdownTime;
        return this;
    }

    /**
     * Get countdownTime
     *
     * @return countdownTime
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public Long getCountdownTime() {
        return countdownTime;
    }

    public void setCountdownTime(@jakarta.annotation.Nonnull Long countdownTime) {
        this.countdownTime = countdownTime;
    }

    public SetAutoCancelAllOpenOrdersRequest recvWindow(
            @jakarta.annotation.Nullable Long recvWindow) {
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
        SetAutoCancelAllOpenOrdersRequest setAutoCancelAllOpenOrdersRequest =
                (SetAutoCancelAllOpenOrdersRequest) o;
        return Objects.equals(this.underlying, setAutoCancelAllOpenOrdersRequest.underlying)
                && Objects.equals(
                        this.countdownTime, setAutoCancelAllOpenOrdersRequest.countdownTime)
                && Objects.equals(this.recvWindow, setAutoCancelAllOpenOrdersRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(underlying, countdownTime, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAutoCancelAllOpenOrdersRequest {\n");
        sb.append("		underlying: ").append(toIndentedString(underlying)).append("\n");
        sb.append("		countdownTime: ").append(toIndentedString(countdownTime)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object underlyingValue = getUnderlying();
        String underlyingValueAsString = "";
        underlyingValueAsString = underlyingValue.toString();
        sb.append("underlying=").append(urlEncode(underlyingValueAsString)).append("");
        Object countdownTimeValue = getCountdownTime();
        String countdownTimeValueAsString = "";
        countdownTimeValueAsString = countdownTimeValue.toString();
        sb.append("countdownTime=").append(urlEncode(countdownTimeValueAsString)).append("");
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
        openapiFields.add("underlying");
        openapiFields.add("countdownTime");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("underlying");
        openapiRequiredFields.add("countdownTime");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SetAutoCancelAllOpenOrdersRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SetAutoCancelAllOpenOrdersRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SetAutoCancelAllOpenOrdersRequest is"
                                        + " not found in the empty JSON string",
                                SetAutoCancelAllOpenOrdersRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SetAutoCancelAllOpenOrdersRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("underlying").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `underlying` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("underlying").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SetAutoCancelAllOpenOrdersRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SetAutoCancelAllOpenOrdersRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SetAutoCancelAllOpenOrdersRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SetAutoCancelAllOpenOrdersRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SetAutoCancelAllOpenOrdersRequest>() {
                        @Override
                        public void write(JsonWriter out, SetAutoCancelAllOpenOrdersRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SetAutoCancelAllOpenOrdersRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SetAutoCancelAllOpenOrdersRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SetAutoCancelAllOpenOrdersRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SetAutoCancelAllOpenOrdersRequest
     */
    public static SetAutoCancelAllOpenOrdersRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SetAutoCancelAllOpenOrdersRequest.class);
    }

    /**
     * Convert an instance of SetAutoCancelAllOpenOrdersRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
