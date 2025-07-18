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

/** VipLoanBorrowResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class VipLoanBorrowResponse {
    public static final String SERIALIZED_NAME_LOAN_ACCOUNT_ID = "loanAccountId";

    @SerializedName(SERIALIZED_NAME_LOAN_ACCOUNT_ID)
    @jakarta.annotation.Nullable
    private String loanAccountId;

    public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";

    @SerializedName(SERIALIZED_NAME_REQUEST_ID)
    @jakarta.annotation.Nullable
    private String requestId;

    public static final String SERIALIZED_NAME_LOAN_COIN = "loanCoin";

    @SerializedName(SERIALIZED_NAME_LOAN_COIN)
    @jakarta.annotation.Nullable
    private String loanCoin;

    public static final String SERIALIZED_NAME_IS_FLEXIBLE_RATE = "isFlexibleRate";

    @SerializedName(SERIALIZED_NAME_IS_FLEXIBLE_RATE)
    @jakarta.annotation.Nullable
    private String isFlexibleRate;

    public static final String SERIALIZED_NAME_LOAN_AMOUNT = "loanAmount";

    @SerializedName(SERIALIZED_NAME_LOAN_AMOUNT)
    @jakarta.annotation.Nullable
    private String loanAmount;

    public static final String SERIALIZED_NAME_COLLATERAL_ACCOUNT_ID = "collateralAccountId";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_ACCOUNT_ID)
    @jakarta.annotation.Nullable
    private String collateralAccountId;

    public static final String SERIALIZED_NAME_COLLATERAL_COIN = "collateralCoin";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_COIN)
    @jakarta.annotation.Nullable
    private String collateralCoin;

    public static final String SERIALIZED_NAME_LOAN_TERM = "loanTerm";

    @SerializedName(SERIALIZED_NAME_LOAN_TERM)
    @jakarta.annotation.Nullable
    private String loanTerm;

    public VipLoanBorrowResponse() {}

    public VipLoanBorrowResponse loanAccountId(@jakarta.annotation.Nullable String loanAccountId) {
        this.loanAccountId = loanAccountId;
        return this;
    }

    /**
     * Get loanAccountId
     *
     * @return loanAccountId
     */
    @jakarta.annotation.Nullable
    public String getLoanAccountId() {
        return loanAccountId;
    }

    public void setLoanAccountId(@jakarta.annotation.Nullable String loanAccountId) {
        this.loanAccountId = loanAccountId;
    }

    public VipLoanBorrowResponse requestId(@jakarta.annotation.Nullable String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     *
     * @return requestId
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(@jakarta.annotation.Nullable String requestId) {
        this.requestId = requestId;
    }

    public VipLoanBorrowResponse loanCoin(@jakarta.annotation.Nullable String loanCoin) {
        this.loanCoin = loanCoin;
        return this;
    }

    /**
     * Get loanCoin
     *
     * @return loanCoin
     */
    @jakarta.annotation.Nullable
    public String getLoanCoin() {
        return loanCoin;
    }

    public void setLoanCoin(@jakarta.annotation.Nullable String loanCoin) {
        this.loanCoin = loanCoin;
    }

    public VipLoanBorrowResponse isFlexibleRate(
            @jakarta.annotation.Nullable String isFlexibleRate) {
        this.isFlexibleRate = isFlexibleRate;
        return this;
    }

    /**
     * Get isFlexibleRate
     *
     * @return isFlexibleRate
     */
    @jakarta.annotation.Nullable
    public String getIsFlexibleRate() {
        return isFlexibleRate;
    }

    public void setIsFlexibleRate(@jakarta.annotation.Nullable String isFlexibleRate) {
        this.isFlexibleRate = isFlexibleRate;
    }

    public VipLoanBorrowResponse loanAmount(@jakarta.annotation.Nullable String loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    /**
     * Get loanAmount
     *
     * @return loanAmount
     */
    @jakarta.annotation.Nullable
    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(@jakarta.annotation.Nullable String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public VipLoanBorrowResponse collateralAccountId(
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

    public VipLoanBorrowResponse collateralCoin(
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

    public VipLoanBorrowResponse loanTerm(@jakarta.annotation.Nullable String loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }

    /**
     * Get loanTerm
     *
     * @return loanTerm
     */
    @jakarta.annotation.Nullable
    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(@jakarta.annotation.Nullable String loanTerm) {
        this.loanTerm = loanTerm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VipLoanBorrowResponse vipLoanBorrowResponse = (VipLoanBorrowResponse) o;
        return Objects.equals(this.loanAccountId, vipLoanBorrowResponse.loanAccountId)
                && Objects.equals(this.requestId, vipLoanBorrowResponse.requestId)
                && Objects.equals(this.loanCoin, vipLoanBorrowResponse.loanCoin)
                && Objects.equals(this.isFlexibleRate, vipLoanBorrowResponse.isFlexibleRate)
                && Objects.equals(this.loanAmount, vipLoanBorrowResponse.loanAmount)
                && Objects.equals(
                        this.collateralAccountId, vipLoanBorrowResponse.collateralAccountId)
                && Objects.equals(this.collateralCoin, vipLoanBorrowResponse.collateralCoin)
                && Objects.equals(this.loanTerm, vipLoanBorrowResponse.loanTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                loanAccountId,
                requestId,
                loanCoin,
                isFlexibleRate,
                loanAmount,
                collateralAccountId,
                collateralCoin,
                loanTerm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VipLoanBorrowResponse {\n");
        sb.append("		loanAccountId: ").append(toIndentedString(loanAccountId)).append("\n");
        sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("		loanCoin: ").append(toIndentedString(loanCoin)).append("\n");
        sb.append("		isFlexibleRate: ").append(toIndentedString(isFlexibleRate)).append("\n");
        sb.append("		loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
        sb.append("		collateralAccountId: ")
                .append(toIndentedString(collateralAccountId))
                .append("\n");
        sb.append("		collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
        sb.append("		loanTerm: ").append(toIndentedString(loanTerm)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object loanAccountIdValue = getLoanAccountId();
        String loanAccountIdValueAsString = "";
        loanAccountIdValueAsString = loanAccountIdValue.toString();
        sb.append("loanAccountId=").append(urlEncode(loanAccountIdValueAsString)).append("");
        Object requestIdValue = getRequestId();
        String requestIdValueAsString = "";
        requestIdValueAsString = requestIdValue.toString();
        sb.append("requestId=").append(urlEncode(requestIdValueAsString)).append("");
        Object loanCoinValue = getLoanCoin();
        String loanCoinValueAsString = "";
        loanCoinValueAsString = loanCoinValue.toString();
        sb.append("loanCoin=").append(urlEncode(loanCoinValueAsString)).append("");
        Object isFlexibleRateValue = getIsFlexibleRate();
        String isFlexibleRateValueAsString = "";
        isFlexibleRateValueAsString = isFlexibleRateValue.toString();
        sb.append("isFlexibleRate=").append(urlEncode(isFlexibleRateValueAsString)).append("");
        Object loanAmountValue = getLoanAmount();
        String loanAmountValueAsString = "";
        loanAmountValueAsString = loanAmountValue.toString();
        sb.append("loanAmount=").append(urlEncode(loanAmountValueAsString)).append("");
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
        Object loanTermValue = getLoanTerm();
        String loanTermValueAsString = "";
        loanTermValueAsString = loanTermValue.toString();
        sb.append("loanTerm=").append(urlEncode(loanTermValueAsString)).append("");
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
        openapiFields.add("loanAccountId");
        openapiFields.add("requestId");
        openapiFields.add("loanCoin");
        openapiFields.add("isFlexibleRate");
        openapiFields.add("loanAmount");
        openapiFields.add("collateralAccountId");
        openapiFields.add("collateralCoin");
        openapiFields.add("loanTerm");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to VipLoanBorrowResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!VipLoanBorrowResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VipLoanBorrowResponse is not found in"
                                        + " the empty JSON string",
                                VipLoanBorrowResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("loanAccountId") != null && !jsonObj.get("loanAccountId").isJsonNull())
                && !jsonObj.get("loanAccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `loanAccountId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("loanAccountId").toString()));
        }
        if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull())
                && !jsonObj.get("requestId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `requestId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("requestId").toString()));
        }
        if ((jsonObj.get("loanCoin") != null && !jsonObj.get("loanCoin").isJsonNull())
                && !jsonObj.get("loanCoin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `loanCoin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("loanCoin").toString()));
        }
        if ((jsonObj.get("isFlexibleRate") != null && !jsonObj.get("isFlexibleRate").isJsonNull())
                && !jsonObj.get("isFlexibleRate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `isFlexibleRate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("isFlexibleRate").toString()));
        }
        if ((jsonObj.get("loanAmount") != null && !jsonObj.get("loanAmount").isJsonNull())
                && !jsonObj.get("loanAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `loanAmount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("loanAmount").toString()));
        }
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
        if ((jsonObj.get("loanTerm") != null && !jsonObj.get("loanTerm").isJsonNull())
                && !jsonObj.get("loanTerm").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `loanTerm` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("loanTerm").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VipLoanBorrowResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VipLoanBorrowResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VipLoanBorrowResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VipLoanBorrowResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VipLoanBorrowResponse>() {
                        @Override
                        public void write(JsonWriter out, VipLoanBorrowResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VipLoanBorrowResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VipLoanBorrowResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VipLoanBorrowResponse
     * @throws IOException if the JSON string is invalid with respect to VipLoanBorrowResponse
     */
    public static VipLoanBorrowResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VipLoanBorrowResponse.class);
    }

    /**
     * Convert an instance of VipLoanBorrowResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
