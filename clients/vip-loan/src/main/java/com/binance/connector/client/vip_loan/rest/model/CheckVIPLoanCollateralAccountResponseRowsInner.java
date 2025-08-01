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

/** CheckVIPLoanCollateralAccountResponseRowsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CheckVIPLoanCollateralAccountResponseRowsInner {
    public static final String SERIALIZED_NAME_COLLATERAL_ACCOUNT_ID = "collateralAccountId";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_ACCOUNT_ID)
    @jakarta.annotation.Nullable
    private String collateralAccountId;

    public static final String SERIALIZED_NAME_COLLATERAL_COIN = "collateralCoin";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_COIN)
    @jakarta.annotation.Nullable
    private String collateralCoin;

    public CheckVIPLoanCollateralAccountResponseRowsInner() {}

    public CheckVIPLoanCollateralAccountResponseRowsInner collateralAccountId(
            @jakarta.annotation.Nullable String collateralAccountId) {
        this.collateralAccountId = collateralAccountId;
        return this;
    }

    /**
     * Get collateralAccountId
     *
     * @return collateralAccountId
     */
    @jakarta.annotation.Nullable
    public String getCollateralAccountId() {
        return collateralAccountId;
    }

    public void setCollateralAccountId(@jakarta.annotation.Nullable String collateralAccountId) {
        this.collateralAccountId = collateralAccountId;
    }

    public CheckVIPLoanCollateralAccountResponseRowsInner collateralCoin(
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckVIPLoanCollateralAccountResponseRowsInner
                checkVIPLoanCollateralAccountResponseRowsInner =
                        (CheckVIPLoanCollateralAccountResponseRowsInner) o;
        return Objects.equals(
                        this.collateralAccountId,
                        checkVIPLoanCollateralAccountResponseRowsInner.collateralAccountId)
                && Objects.equals(
                        this.collateralCoin,
                        checkVIPLoanCollateralAccountResponseRowsInner.collateralCoin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collateralAccountId, collateralCoin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckVIPLoanCollateralAccountResponseRowsInner {\n");
        sb.append("		collateralAccountId: ")
                .append(toIndentedString(collateralAccountId))
                .append("\n");
        sb.append("		collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object collateralAccountIdValue = getCollateralAccountId();
        String collateralAccountIdValueAsString = "";
        collateralAccountIdValueAsString = collateralAccountIdValue.toString();
        sb.append("collateralAccountId=")
                .append(urlEncode(collateralAccountIdValueAsString))
                .append("");
        Object collateralCoinValue = getCollateralCoin();
        String collateralCoinValueAsString = "";
        collateralCoinValueAsString = collateralCoinValue.toString();
        sb.append("collateralCoin=").append(urlEncode(collateralCoinValueAsString)).append("");
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
        openapiFields.add("collateralAccountId");
        openapiFields.add("collateralCoin");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CheckVIPLoanCollateralAccountResponseRowsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CheckVIPLoanCollateralAccountResponseRowsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " CheckVIPLoanCollateralAccountResponseRowsInner is not found"
                                    + " in the empty JSON string",
                                CheckVIPLoanCollateralAccountResponseRowsInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("collateralAccountId") != null
                        && !jsonObj.get("collateralAccountId").isJsonNull())
                && !jsonObj.get("collateralAccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collateralAccountId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("collateralAccountId").toString()));
        }
        if ((jsonObj.get("collateralCoin") != null && !jsonObj.get("collateralCoin").isJsonNull())
                && !jsonObj.get("collateralCoin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collateralCoin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("collateralCoin").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CheckVIPLoanCollateralAccountResponseRowsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'CheckVIPLoanCollateralAccountResponseRowsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CheckVIPLoanCollateralAccountResponseRowsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(CheckVIPLoanCollateralAccountResponseRowsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CheckVIPLoanCollateralAccountResponseRowsInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                CheckVIPLoanCollateralAccountResponseRowsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CheckVIPLoanCollateralAccountResponseRowsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CheckVIPLoanCollateralAccountResponseRowsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CheckVIPLoanCollateralAccountResponseRowsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     CheckVIPLoanCollateralAccountResponseRowsInner
     */
    public static CheckVIPLoanCollateralAccountResponseRowsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, CheckVIPLoanCollateralAccountResponseRowsInner.class);
    }

    /**
     * Convert an instance of CheckVIPLoanCollateralAccountResponseRowsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
