/*
 * Binance Spot WebSocket API
 * OpenAPI Specifications for the Binance Spot WebSocket API  API documents:   - [Github web-socket-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/web-socket-api.md)   - [General API information for web-socket-api on website](https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.websocket.api.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.spot.websocket.api.JSON;
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
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** UserDataStreamStopResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UserDataStreamStopResponse extends BaseDTO {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @jakarta.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private Long status;

    public static final String SERIALIZED_NAME_RESPONSE = "response";

    @SerializedName(SERIALIZED_NAME_RESPONSE)
    @jakarta.annotation.Nullable
    private Object response;

    public static final String SERIALIZED_NAME_RATE_LIMITS = "rateLimits";

    @SerializedName(SERIALIZED_NAME_RATE_LIMITS)
    @jakarta.annotation.Nullable
    private RateLimits rateLimits;

    public UserDataStreamStopResponse() {}

    public UserDataStreamStopResponse id(@jakarta.annotation.Nullable String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return id;
    }

    public void setId(@jakarta.annotation.Nullable String id) {
        this.id = id;
    }

    public UserDataStreamStopResponse status(@jakarta.annotation.Nullable Long status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    public Long getStatus() {
        return status;
    }

    public void setStatus(@jakarta.annotation.Nullable Long status) {
        this.status = status;
    }

    public UserDataStreamStopResponse response(@jakarta.annotation.Nullable Object response) {
        this.response = response;
        return this;
    }

    /**
     * Get response
     *
     * @return response
     */
    @jakarta.annotation.Nullable
    public Object getResponse() {
        return response;
    }

    public void setResponse(@jakarta.annotation.Nullable Object response) {
        this.response = response;
    }

    public UserDataStreamStopResponse rateLimits(
            @jakarta.annotation.Nullable RateLimits rateLimits) {
        this.rateLimits = rateLimits;
        return this;
    }

    /**
     * Get rateLimits
     *
     * @return rateLimits
     */
    @jakarta.annotation.Nullable
    @Valid
    public RateLimits getRateLimits() {
        return rateLimits;
    }

    public void setRateLimits(@jakarta.annotation.Nullable RateLimits rateLimits) {
        this.rateLimits = rateLimits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDataStreamStopResponse userDataStreamStopResponse = (UserDataStreamStopResponse) o;
        return Objects.equals(this.id, userDataStreamStopResponse.id)
                && Objects.equals(this.status, userDataStreamStopResponse.status)
                && Objects.equals(this.response, userDataStreamStopResponse.response)
                && Objects.equals(this.rateLimits, userDataStreamStopResponse.rateLimits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, response, rateLimits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDataStreamStopResponse {\n");
        sb.append("		id: ").append(toIndentedString(id)).append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		response: ").append(toIndentedString(response)).append("\n");
        sb.append("		rateLimits: ").append(toIndentedString(rateLimits)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String idValue = getId();
        if (idValue != null) {
            String idValueAsString = idValue.toString();
            valMap.put("id", idValueAsString);
        }
        Long statusValue = getStatus();
        if (statusValue != null) {
            String statusValueAsString = statusValue.toString();
            valMap.put("status", statusValueAsString);
        }
        Object responseValue = getResponse();
        if (responseValue != null) {
            String responseValueAsString = responseValue.toString();
            valMap.put("response", responseValueAsString);
        }
        RateLimits rateLimitsValue = getRateLimits();
        if (rateLimitsValue != null) {
            String rateLimitsValueAsString = JSON.getGson().toJson(rateLimitsValue);
            valMap.put("rateLimits", rateLimitsValueAsString);
        }

        valMap.put("timestamp", getTimestamp());
        return asciiEncode(
                valMap.keySet().stream()
                        .map(key -> key + "=" + valMap.get(key))
                        .collect(Collectors.joining("&")));
    }

    public Map<String, Object> toMap() {
        Map<String, Object> valMap = new TreeMap<String, Object>();
        valMap.put("apiKey", getApiKey());
        Object idValue = getId();
        if (idValue != null) {
            valMap.put("id", idValue);
        }
        Object statusValue = getStatus();
        if (statusValue != null) {
            valMap.put("status", statusValue);
        }
        Object responseValue = getResponse();
        if (responseValue != null) {
            valMap.put("response", responseValue);
        }
        Object rateLimitsValue = getRateLimits();
        if (rateLimitsValue != null) {
            valMap.put("rateLimits", rateLimitsValue);
        }

        valMap.put("timestamp", getTimestamp());
        return valMap;
    }

    public static String asciiEncode(String s) {
        return new String(s.getBytes(), StandardCharsets.US_ASCII);
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
        openapiFields.add("id");
        openapiFields.add("status");
        openapiFields.add("response");
        openapiFields.add("rateLimits");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UserDataStreamStopResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UserDataStreamStopResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UserDataStreamStopResponse is not"
                                        + " found in the empty JSON string",
                                UserDataStreamStopResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UserDataStreamStopResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UserDataStreamStopResponse` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
                && !jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UserDataStreamStopResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UserDataStreamStopResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserDataStreamStopResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UserDataStreamStopResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UserDataStreamStopResponse>() {
                        @Override
                        public void write(JsonWriter out, UserDataStreamStopResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UserDataStreamStopResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UserDataStreamStopResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UserDataStreamStopResponse
     * @throws IOException if the JSON string is invalid with respect to UserDataStreamStopResponse
     */
    public static UserDataStreamStopResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UserDataStreamStopResponse.class);
    }

    /**
     * Convert an instance of UserDataStreamStopResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
