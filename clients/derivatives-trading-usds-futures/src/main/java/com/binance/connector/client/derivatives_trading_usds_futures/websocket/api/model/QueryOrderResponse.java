/*
 * Binance Derivatives Trading USDS Futures WebSocket API
 * OpenAPI Specification for the Binance Derivatives Trading USDS Futures WebSocket API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.JSON;
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

/** QueryOrderResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryOrderResponse extends BaseDTO {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @jakarta.annotation.Nullable
    private String id;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private Long status;

    public static final String SERIALIZED_NAME_RESULT = "result";

    @SerializedName(SERIALIZED_NAME_RESULT)
    @jakarta.annotation.Nullable
    private QueryOrderResponseResult result;

    public QueryOrderResponse() {}

    public QueryOrderResponse id(@jakarta.annotation.Nullable String id) {
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

    public QueryOrderResponse status(@jakarta.annotation.Nullable Long status) {
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

    public QueryOrderResponse result(@jakarta.annotation.Nullable QueryOrderResponseResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     *
     * @return result
     */
    @jakarta.annotation.Nullable
    @Valid
    public QueryOrderResponseResult getResult() {
        return result;
    }

    public void setResult(@jakarta.annotation.Nullable QueryOrderResponseResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryOrderResponse queryOrderResponse = (QueryOrderResponse) o;
        return Objects.equals(this.id, queryOrderResponse.id)
                && Objects.equals(this.status, queryOrderResponse.status)
                && Objects.equals(this.result, queryOrderResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryOrderResponse {\n");
        sb.append("		id: ").append(toIndentedString(id)).append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		result: ").append(toIndentedString(result)).append("\n");
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
        QueryOrderResponseResult resultValue = getResult();
        if (resultValue != null) {
            String resultValueAsString = JSON.getGson().toJson(resultValue);
            valMap.put("result", resultValueAsString);
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
        Object resultValue = getResult();
        if (resultValue != null) {
            valMap.put("result", resultValue);
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
        openapiFields.add("result");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to QueryOrderResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryOrderResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in QueryOrderResponse is not found in the"
                                        + " empty JSON string",
                                QueryOrderResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!QueryOrderResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `QueryOrderResponse` properties. JSON: %s",
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
        // validate the optional field `result`
        if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
            QueryOrderResponseResult.validateJsonElement(jsonObj.get("result"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryOrderResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'QueryOrderResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryOrderResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(QueryOrderResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryOrderResponse>() {
                        @Override
                        public void write(JsonWriter out, QueryOrderResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryOrderResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryOrderResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryOrderResponse
     * @throws IOException if the JSON string is invalid with respect to QueryOrderResponse
     */
    public static QueryOrderResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, QueryOrderResponse.class);
    }

    /**
     * Convert an instance of QueryOrderResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
