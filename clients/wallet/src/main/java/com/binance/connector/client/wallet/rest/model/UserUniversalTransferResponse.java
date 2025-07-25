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

/** UserUniversalTransferResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UserUniversalTransferResponse {
    public static final String SERIALIZED_NAME_TRAN_ID = "tranId";

    @SerializedName(SERIALIZED_NAME_TRAN_ID)
    @jakarta.annotation.Nullable
    private Long tranId;

    public UserUniversalTransferResponse() {}

    public UserUniversalTransferResponse tranId(@jakarta.annotation.Nullable Long tranId) {
        this.tranId = tranId;
        return this;
    }

    /**
     * Get tranId
     *
     * @return tranId
     */
    @jakarta.annotation.Nullable
    public Long getTranId() {
        return tranId;
    }

    public void setTranId(@jakarta.annotation.Nullable Long tranId) {
        this.tranId = tranId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserUniversalTransferResponse userUniversalTransferResponse =
                (UserUniversalTransferResponse) o;
        return Objects.equals(this.tranId, userUniversalTransferResponse.tranId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserUniversalTransferResponse {\n");
        sb.append("		tranId: ").append(toIndentedString(tranId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object tranIdValue = getTranId();
        String tranIdValueAsString = "";
        tranIdValueAsString = tranIdValue.toString();
        sb.append("tranId=").append(urlEncode(tranIdValueAsString)).append("");
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
        openapiFields.add("tranId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UserUniversalTransferResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UserUniversalTransferResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UserUniversalTransferResponse is not"
                                        + " found in the empty JSON string",
                                UserUniversalTransferResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UserUniversalTransferResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UserUniversalTransferResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserUniversalTransferResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(UserUniversalTransferResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UserUniversalTransferResponse>() {
                        @Override
                        public void write(JsonWriter out, UserUniversalTransferResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UserUniversalTransferResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UserUniversalTransferResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UserUniversalTransferResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     UserUniversalTransferResponse
     */
    public static UserUniversalTransferResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UserUniversalTransferResponse.class);
    }

    /**
     * Convert an instance of UserUniversalTransferResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
