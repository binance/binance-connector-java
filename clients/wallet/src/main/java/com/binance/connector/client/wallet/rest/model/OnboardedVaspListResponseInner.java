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

/** OnboardedVaspListResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OnboardedVaspListResponseInner {
    public static final String SERIALIZED_NAME_VASP_NAME = "vaspName";

    @SerializedName(SERIALIZED_NAME_VASP_NAME)
    @jakarta.annotation.Nullable
    private String vaspName;

    public static final String SERIALIZED_NAME_VASP_CODE = "vaspCode";

    @SerializedName(SERIALIZED_NAME_VASP_CODE)
    @jakarta.annotation.Nullable
    private String vaspCode;

    public OnboardedVaspListResponseInner() {}

    public OnboardedVaspListResponseInner vaspName(@jakarta.annotation.Nullable String vaspName) {
        this.vaspName = vaspName;
        return this;
    }

    /**
     * Get vaspName
     *
     * @return vaspName
     */
    @jakarta.annotation.Nullable
    public String getVaspName() {
        return vaspName;
    }

    public void setVaspName(@jakarta.annotation.Nullable String vaspName) {
        this.vaspName = vaspName;
    }

    public OnboardedVaspListResponseInner vaspCode(@jakarta.annotation.Nullable String vaspCode) {
        this.vaspCode = vaspCode;
        return this;
    }

    /**
     * Get vaspCode
     *
     * @return vaspCode
     */
    @jakarta.annotation.Nullable
    public String getVaspCode() {
        return vaspCode;
    }

    public void setVaspCode(@jakarta.annotation.Nullable String vaspCode) {
        this.vaspCode = vaspCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OnboardedVaspListResponseInner onboardedVaspListResponseInner =
                (OnboardedVaspListResponseInner) o;
        return Objects.equals(this.vaspName, onboardedVaspListResponseInner.vaspName)
                && Objects.equals(this.vaspCode, onboardedVaspListResponseInner.vaspCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaspName, vaspCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnboardedVaspListResponseInner {\n");
        sb.append("		vaspName: ").append(toIndentedString(vaspName)).append("\n");
        sb.append("		vaspCode: ").append(toIndentedString(vaspCode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object vaspNameValue = getVaspName();
        String vaspNameValueAsString = "";
        vaspNameValueAsString = vaspNameValue.toString();
        sb.append("vaspName=").append(urlEncode(vaspNameValueAsString)).append("");
        Object vaspCodeValue = getVaspCode();
        String vaspCodeValueAsString = "";
        vaspCodeValueAsString = vaspCodeValue.toString();
        sb.append("vaspCode=").append(urlEncode(vaspCodeValueAsString)).append("");
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
        openapiFields.add("vaspName");
        openapiFields.add("vaspCode");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     OnboardedVaspListResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OnboardedVaspListResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OnboardedVaspListResponseInner is not"
                                        + " found in the empty JSON string",
                                OnboardedVaspListResponseInner.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("vaspName") != null && !jsonObj.get("vaspName").isJsonNull())
                && !jsonObj.get("vaspName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `vaspName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("vaspName").toString()));
        }
        if ((jsonObj.get("vaspCode") != null && !jsonObj.get("vaspCode").isJsonNull())
                && !jsonObj.get("vaspCode").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `vaspCode` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("vaspCode").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OnboardedVaspListResponseInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OnboardedVaspListResponseInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OnboardedVaspListResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(OnboardedVaspListResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OnboardedVaspListResponseInner>() {
                        @Override
                        public void write(JsonWriter out, OnboardedVaspListResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OnboardedVaspListResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OnboardedVaspListResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OnboardedVaspListResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     OnboardedVaspListResponseInner
     */
    public static OnboardedVaspListResponseInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OnboardedVaspListResponseInner.class);
    }

    /**
     * Convert an instance of OnboardedVaspListResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
