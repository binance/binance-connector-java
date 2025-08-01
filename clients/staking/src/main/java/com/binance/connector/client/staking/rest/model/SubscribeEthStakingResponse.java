/*
 * Binance Staking REST API
 * OpenAPI Specification for the Binance Staking REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.staking.rest.model;

import com.binance.connector.client.staking.rest.JSON;
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

/** SubscribeEthStakingResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SubscribeEthStakingResponse {
    public static final String SERIALIZED_NAME_SUCCESS = "success";

    @SerializedName(SERIALIZED_NAME_SUCCESS)
    @jakarta.annotation.Nullable
    private Boolean success;

    public static final String SERIALIZED_NAME_WBETH_AMOUNT = "wbethAmount";

    @SerializedName(SERIALIZED_NAME_WBETH_AMOUNT)
    @jakarta.annotation.Nullable
    private String wbethAmount;

    public static final String SERIALIZED_NAME_CONVERSION_RATIO = "conversionRatio";

    @SerializedName(SERIALIZED_NAME_CONVERSION_RATIO)
    @jakarta.annotation.Nullable
    private String conversionRatio;

    public SubscribeEthStakingResponse() {}

    public SubscribeEthStakingResponse success(@jakarta.annotation.Nullable Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Get success
     *
     * @return success
     */
    @jakarta.annotation.Nullable
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(@jakarta.annotation.Nullable Boolean success) {
        this.success = success;
    }

    public SubscribeEthStakingResponse wbethAmount(
            @jakarta.annotation.Nullable String wbethAmount) {
        this.wbethAmount = wbethAmount;
        return this;
    }

    /**
     * Get wbethAmount
     *
     * @return wbethAmount
     */
    @jakarta.annotation.Nullable
    public String getWbethAmount() {
        return wbethAmount;
    }

    public void setWbethAmount(@jakarta.annotation.Nullable String wbethAmount) {
        this.wbethAmount = wbethAmount;
    }

    public SubscribeEthStakingResponse conversionRatio(
            @jakarta.annotation.Nullable String conversionRatio) {
        this.conversionRatio = conversionRatio;
        return this;
    }

    /**
     * Get conversionRatio
     *
     * @return conversionRatio
     */
    @jakarta.annotation.Nullable
    public String getConversionRatio() {
        return conversionRatio;
    }

    public void setConversionRatio(@jakarta.annotation.Nullable String conversionRatio) {
        this.conversionRatio = conversionRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscribeEthStakingResponse subscribeEthStakingResponse = (SubscribeEthStakingResponse) o;
        return Objects.equals(this.success, subscribeEthStakingResponse.success)
                && Objects.equals(this.wbethAmount, subscribeEthStakingResponse.wbethAmount)
                && Objects.equals(
                        this.conversionRatio, subscribeEthStakingResponse.conversionRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, wbethAmount, conversionRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeEthStakingResponse {\n");
        sb.append("		success: ").append(toIndentedString(success)).append("\n");
        sb.append("		wbethAmount: ").append(toIndentedString(wbethAmount)).append("\n");
        sb.append("		conversionRatio: ").append(toIndentedString(conversionRatio)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object successValue = getSuccess();
        String successValueAsString = "";
        successValueAsString = successValue.toString();
        sb.append("success=").append(urlEncode(successValueAsString)).append("");
        Object wbethAmountValue = getWbethAmount();
        String wbethAmountValueAsString = "";
        wbethAmountValueAsString = wbethAmountValue.toString();
        sb.append("wbethAmount=").append(urlEncode(wbethAmountValueAsString)).append("");
        Object conversionRatioValue = getConversionRatio();
        String conversionRatioValueAsString = "";
        conversionRatioValueAsString = conversionRatioValue.toString();
        sb.append("conversionRatio=").append(urlEncode(conversionRatioValueAsString)).append("");
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
        openapiFields.add("success");
        openapiFields.add("wbethAmount");
        openapiFields.add("conversionRatio");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SubscribeEthStakingResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SubscribeEthStakingResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SubscribeEthStakingResponse is not"
                                        + " found in the empty JSON string",
                                SubscribeEthStakingResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("wbethAmount") != null && !jsonObj.get("wbethAmount").isJsonNull())
                && !jsonObj.get("wbethAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `wbethAmount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("wbethAmount").toString()));
        }
        if ((jsonObj.get("conversionRatio") != null && !jsonObj.get("conversionRatio").isJsonNull())
                && !jsonObj.get("conversionRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `conversionRatio` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("conversionRatio").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubscribeEthStakingResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SubscribeEthStakingResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SubscribeEthStakingResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SubscribeEthStakingResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SubscribeEthStakingResponse>() {
                        @Override
                        public void write(JsonWriter out, SubscribeEthStakingResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SubscribeEthStakingResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SubscribeEthStakingResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SubscribeEthStakingResponse
     * @throws IOException if the JSON string is invalid with respect to SubscribeEthStakingResponse
     */
    public static SubscribeEthStakingResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SubscribeEthStakingResponse.class);
    }

    /**
     * Convert an instance of SubscribeEthStakingResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
