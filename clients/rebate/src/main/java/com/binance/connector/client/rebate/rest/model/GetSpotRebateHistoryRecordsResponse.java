/*
 * Binance Rebate REST API
 * OpenAPI Specification for the Binance Rebate REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.rebate.rest.model;

import com.binance.connector.client.rebate.rest.JSON;
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

/** GetSpotRebateHistoryRecordsResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetSpotRebateHistoryRecordsResponse {
    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private String status;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_CODE = "code";

    @SerializedName(SERIALIZED_NAME_CODE)
    @jakarta.annotation.Nullable
    private String code;

    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    @jakarta.annotation.Nullable
    private GetSpotRebateHistoryRecordsResponseData data;

    public GetSpotRebateHistoryRecordsResponse() {}

    public GetSpotRebateHistoryRecordsResponse status(@jakarta.annotation.Nullable String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return status;
    }

    public void setStatus(@jakarta.annotation.Nullable String status) {
        this.status = status;
    }

    public GetSpotRebateHistoryRecordsResponse type(@jakarta.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@jakarta.annotation.Nullable String type) {
        this.type = type;
    }

    public GetSpotRebateHistoryRecordsResponse code(@jakarta.annotation.Nullable String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return code;
    }

    public void setCode(@jakarta.annotation.Nullable String code) {
        this.code = code;
    }

    public GetSpotRebateHistoryRecordsResponse data(
            @jakarta.annotation.Nullable GetSpotRebateHistoryRecordsResponseData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @jakarta.annotation.Nullable
    @Valid
    public GetSpotRebateHistoryRecordsResponseData getData() {
        return data;
    }

    public void setData(@jakarta.annotation.Nullable GetSpotRebateHistoryRecordsResponseData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSpotRebateHistoryRecordsResponse getSpotRebateHistoryRecordsResponse =
                (GetSpotRebateHistoryRecordsResponse) o;
        return Objects.equals(this.status, getSpotRebateHistoryRecordsResponse.status)
                && Objects.equals(this.type, getSpotRebateHistoryRecordsResponse.type)
                && Objects.equals(this.code, getSpotRebateHistoryRecordsResponse.code)
                && Objects.equals(this.data, getSpotRebateHistoryRecordsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, code, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSpotRebateHistoryRecordsResponse {\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		code: ").append(toIndentedString(code)).append("\n");
        sb.append("		data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object statusValue = getStatus();
        String statusValueAsString = "";
        statusValueAsString = statusValue.toString();
        sb.append("status=").append(urlEncode(statusValueAsString)).append("");
        Object typeValue = getType();
        String typeValueAsString = "";
        typeValueAsString = typeValue.toString();
        sb.append("type=").append(urlEncode(typeValueAsString)).append("");
        Object codeValue = getCode();
        String codeValueAsString = "";
        codeValueAsString = codeValue.toString();
        sb.append("code=").append(urlEncode(codeValueAsString)).append("");
        Object dataValue = getData();
        String dataValueAsString = "";
        dataValueAsString = dataValue.toString();
        sb.append("data=").append(urlEncode(dataValueAsString)).append("");
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
        openapiFields.add("status");
        openapiFields.add("type");
        openapiFields.add("code");
        openapiFields.add("data");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetSpotRebateHistoryRecordsResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetSpotRebateHistoryRecordsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetSpotRebateHistoryRecordsResponse is"
                                        + " not found in the empty JSON string",
                                GetSpotRebateHistoryRecordsResponse.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull())
                && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull())
                && !jsonObj.get("code").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `code` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("code").toString()));
        }
        // validate the optional field `data`
        if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
            GetSpotRebateHistoryRecordsResponseData.validateJsonElement(jsonObj.get("data"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetSpotRebateHistoryRecordsResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetSpotRebateHistoryRecordsResponse' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetSpotRebateHistoryRecordsResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetSpotRebateHistoryRecordsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetSpotRebateHistoryRecordsResponse>() {
                        @Override
                        public void write(JsonWriter out, GetSpotRebateHistoryRecordsResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetSpotRebateHistoryRecordsResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetSpotRebateHistoryRecordsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetSpotRebateHistoryRecordsResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     GetSpotRebateHistoryRecordsResponse
     */
    public static GetSpotRebateHistoryRecordsResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, GetSpotRebateHistoryRecordsResponse.class);
    }

    /**
     * Convert an instance of GetSpotRebateHistoryRecordsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
