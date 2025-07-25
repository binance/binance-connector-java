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

/** GetOnChainYieldsLockedSubscriptionPreviewResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetOnChainYieldsLockedSubscriptionPreviewResponse {
    public static final String SERIALIZED_NAME_REWARD_ASSET = "rewardAsset";

    @SerializedName(SERIALIZED_NAME_REWARD_ASSET)
    @jakarta.annotation.Nullable
    private String rewardAsset;

    public static final String SERIALIZED_NAME_TOTAL_REWARD_AMT = "totalRewardAmt";

    @SerializedName(SERIALIZED_NAME_TOTAL_REWARD_AMT)
    @jakarta.annotation.Nullable
    private String totalRewardAmt;

    public static final String SERIALIZED_NAME_NEXT_PAY = "nextPay";

    @SerializedName(SERIALIZED_NAME_NEXT_PAY)
    @jakarta.annotation.Nullable
    private String nextPay;

    public static final String SERIALIZED_NAME_NEXT_PAY_DATE = "nextPayDate";

    @SerializedName(SERIALIZED_NAME_NEXT_PAY_DATE)
    @jakarta.annotation.Nullable
    private String nextPayDate;

    public static final String SERIALIZED_NAME_REWARDS_PAY_DATE = "rewardsPayDate";

    @SerializedName(SERIALIZED_NAME_REWARDS_PAY_DATE)
    @jakarta.annotation.Nullable
    private String rewardsPayDate;

    public static final String SERIALIZED_NAME_VALUE_DATE = "valueDate";

    @SerializedName(SERIALIZED_NAME_VALUE_DATE)
    @jakarta.annotation.Nullable
    private String valueDate;

    public static final String SERIALIZED_NAME_REWARDS_END_DATE = "rewardsEndDate";

    @SerializedName(SERIALIZED_NAME_REWARDS_END_DATE)
    @jakarta.annotation.Nullable
    private String rewardsEndDate;

    public static final String SERIALIZED_NAME_DELIVER_DATE = "deliverDate";

    @SerializedName(SERIALIZED_NAME_DELIVER_DATE)
    @jakarta.annotation.Nullable
    private String deliverDate;

    public static final String SERIALIZED_NAME_NEXT_SUBSCRIPTION_DATE = "nextSubscriptionDate";

    @SerializedName(SERIALIZED_NAME_NEXT_SUBSCRIPTION_DATE)
    @jakarta.annotation.Nullable
    private String nextSubscriptionDate;

    public GetOnChainYieldsLockedSubscriptionPreviewResponse() {}

    public GetOnChainYieldsLockedSubscriptionPreviewResponse rewardAsset(
            @jakarta.annotation.Nullable String rewardAsset) {
        this.rewardAsset = rewardAsset;
        return this;
    }

    /**
     * Get rewardAsset
     *
     * @return rewardAsset
     */
    @jakarta.annotation.Nullable
    public String getRewardAsset() {
        return rewardAsset;
    }

    public void setRewardAsset(@jakarta.annotation.Nullable String rewardAsset) {
        this.rewardAsset = rewardAsset;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse totalRewardAmt(
            @jakarta.annotation.Nullable String totalRewardAmt) {
        this.totalRewardAmt = totalRewardAmt;
        return this;
    }

    /**
     * Get totalRewardAmt
     *
     * @return totalRewardAmt
     */
    @jakarta.annotation.Nullable
    public String getTotalRewardAmt() {
        return totalRewardAmt;
    }

    public void setTotalRewardAmt(@jakarta.annotation.Nullable String totalRewardAmt) {
        this.totalRewardAmt = totalRewardAmt;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse nextPay(
            @jakarta.annotation.Nullable String nextPay) {
        this.nextPay = nextPay;
        return this;
    }

    /**
     * Get nextPay
     *
     * @return nextPay
     */
    @jakarta.annotation.Nullable
    public String getNextPay() {
        return nextPay;
    }

    public void setNextPay(@jakarta.annotation.Nullable String nextPay) {
        this.nextPay = nextPay;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse nextPayDate(
            @jakarta.annotation.Nullable String nextPayDate) {
        this.nextPayDate = nextPayDate;
        return this;
    }

    /**
     * Get nextPayDate
     *
     * @return nextPayDate
     */
    @jakarta.annotation.Nullable
    public String getNextPayDate() {
        return nextPayDate;
    }

    public void setNextPayDate(@jakarta.annotation.Nullable String nextPayDate) {
        this.nextPayDate = nextPayDate;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse rewardsPayDate(
            @jakarta.annotation.Nullable String rewardsPayDate) {
        this.rewardsPayDate = rewardsPayDate;
        return this;
    }

    /**
     * Get rewardsPayDate
     *
     * @return rewardsPayDate
     */
    @jakarta.annotation.Nullable
    public String getRewardsPayDate() {
        return rewardsPayDate;
    }

    public void setRewardsPayDate(@jakarta.annotation.Nullable String rewardsPayDate) {
        this.rewardsPayDate = rewardsPayDate;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse valueDate(
            @jakarta.annotation.Nullable String valueDate) {
        this.valueDate = valueDate;
        return this;
    }

    /**
     * Get valueDate
     *
     * @return valueDate
     */
    @jakarta.annotation.Nullable
    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(@jakarta.annotation.Nullable String valueDate) {
        this.valueDate = valueDate;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse rewardsEndDate(
            @jakarta.annotation.Nullable String rewardsEndDate) {
        this.rewardsEndDate = rewardsEndDate;
        return this;
    }

    /**
     * Get rewardsEndDate
     *
     * @return rewardsEndDate
     */
    @jakarta.annotation.Nullable
    public String getRewardsEndDate() {
        return rewardsEndDate;
    }

    public void setRewardsEndDate(@jakarta.annotation.Nullable String rewardsEndDate) {
        this.rewardsEndDate = rewardsEndDate;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse deliverDate(
            @jakarta.annotation.Nullable String deliverDate) {
        this.deliverDate = deliverDate;
        return this;
    }

    /**
     * Get deliverDate
     *
     * @return deliverDate
     */
    @jakarta.annotation.Nullable
    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(@jakarta.annotation.Nullable String deliverDate) {
        this.deliverDate = deliverDate;
    }

    public GetOnChainYieldsLockedSubscriptionPreviewResponse nextSubscriptionDate(
            @jakarta.annotation.Nullable String nextSubscriptionDate) {
        this.nextSubscriptionDate = nextSubscriptionDate;
        return this;
    }

    /**
     * Get nextSubscriptionDate
     *
     * @return nextSubscriptionDate
     */
    @jakarta.annotation.Nullable
    public String getNextSubscriptionDate() {
        return nextSubscriptionDate;
    }

    public void setNextSubscriptionDate(@jakarta.annotation.Nullable String nextSubscriptionDate) {
        this.nextSubscriptionDate = nextSubscriptionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOnChainYieldsLockedSubscriptionPreviewResponse
                getOnChainYieldsLockedSubscriptionPreviewResponse =
                        (GetOnChainYieldsLockedSubscriptionPreviewResponse) o;
        return Objects.equals(
                        this.rewardAsset,
                        getOnChainYieldsLockedSubscriptionPreviewResponse.rewardAsset)
                && Objects.equals(
                        this.totalRewardAmt,
                        getOnChainYieldsLockedSubscriptionPreviewResponse.totalRewardAmt)
                && Objects.equals(
                        this.nextPay, getOnChainYieldsLockedSubscriptionPreviewResponse.nextPay)
                && Objects.equals(
                        this.nextPayDate,
                        getOnChainYieldsLockedSubscriptionPreviewResponse.nextPayDate)
                && Objects.equals(
                        this.rewardsPayDate,
                        getOnChainYieldsLockedSubscriptionPreviewResponse.rewardsPayDate)
                && Objects.equals(
                        this.valueDate, getOnChainYieldsLockedSubscriptionPreviewResponse.valueDate)
                && Objects.equals(
                        this.rewardsEndDate,
                        getOnChainYieldsLockedSubscriptionPreviewResponse.rewardsEndDate)
                && Objects.equals(
                        this.deliverDate,
                        getOnChainYieldsLockedSubscriptionPreviewResponse.deliverDate)
                && Objects.equals(
                        this.nextSubscriptionDate,
                        getOnChainYieldsLockedSubscriptionPreviewResponse.nextSubscriptionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rewardAsset,
                totalRewardAmt,
                nextPay,
                nextPayDate,
                rewardsPayDate,
                valueDate,
                rewardsEndDate,
                deliverDate,
                nextSubscriptionDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOnChainYieldsLockedSubscriptionPreviewResponse {\n");
        sb.append("		rewardAsset: ").append(toIndentedString(rewardAsset)).append("\n");
        sb.append("		totalRewardAmt: ").append(toIndentedString(totalRewardAmt)).append("\n");
        sb.append("		nextPay: ").append(toIndentedString(nextPay)).append("\n");
        sb.append("		nextPayDate: ").append(toIndentedString(nextPayDate)).append("\n");
        sb.append("		rewardsPayDate: ").append(toIndentedString(rewardsPayDate)).append("\n");
        sb.append("		valueDate: ").append(toIndentedString(valueDate)).append("\n");
        sb.append("		rewardsEndDate: ").append(toIndentedString(rewardsEndDate)).append("\n");
        sb.append("		deliverDate: ").append(toIndentedString(deliverDate)).append("\n");
        sb.append("		nextSubscriptionDate: ")
                .append(toIndentedString(nextSubscriptionDate))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object rewardAssetValue = getRewardAsset();
        String rewardAssetValueAsString = "";
        rewardAssetValueAsString = rewardAssetValue.toString();
        sb.append("rewardAsset=").append(urlEncode(rewardAssetValueAsString)).append("");
        Object totalRewardAmtValue = getTotalRewardAmt();
        String totalRewardAmtValueAsString = "";
        totalRewardAmtValueAsString = totalRewardAmtValue.toString();
        sb.append("totalRewardAmt=").append(urlEncode(totalRewardAmtValueAsString)).append("");
        Object nextPayValue = getNextPay();
        String nextPayValueAsString = "";
        nextPayValueAsString = nextPayValue.toString();
        sb.append("nextPay=").append(urlEncode(nextPayValueAsString)).append("");
        Object nextPayDateValue = getNextPayDate();
        String nextPayDateValueAsString = "";
        nextPayDateValueAsString = nextPayDateValue.toString();
        sb.append("nextPayDate=").append(urlEncode(nextPayDateValueAsString)).append("");
        Object rewardsPayDateValue = getRewardsPayDate();
        String rewardsPayDateValueAsString = "";
        rewardsPayDateValueAsString = rewardsPayDateValue.toString();
        sb.append("rewardsPayDate=").append(urlEncode(rewardsPayDateValueAsString)).append("");
        Object valueDateValue = getValueDate();
        String valueDateValueAsString = "";
        valueDateValueAsString = valueDateValue.toString();
        sb.append("valueDate=").append(urlEncode(valueDateValueAsString)).append("");
        Object rewardsEndDateValue = getRewardsEndDate();
        String rewardsEndDateValueAsString = "";
        rewardsEndDateValueAsString = rewardsEndDateValue.toString();
        sb.append("rewardsEndDate=").append(urlEncode(rewardsEndDateValueAsString)).append("");
        Object deliverDateValue = getDeliverDate();
        String deliverDateValueAsString = "";
        deliverDateValueAsString = deliverDateValue.toString();
        sb.append("deliverDate=").append(urlEncode(deliverDateValueAsString)).append("");
        Object nextSubscriptionDateValue = getNextSubscriptionDate();
        String nextSubscriptionDateValueAsString = "";
        nextSubscriptionDateValueAsString = nextSubscriptionDateValue.toString();
        sb.append("nextSubscriptionDate=")
                .append(urlEncode(nextSubscriptionDateValueAsString))
                .append("");
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
        openapiFields.add("rewardAsset");
        openapiFields.add("totalRewardAmt");
        openapiFields.add("nextPay");
        openapiFields.add("nextPayDate");
        openapiFields.add("rewardsPayDate");
        openapiFields.add("valueDate");
        openapiFields.add("rewardsEndDate");
        openapiFields.add("deliverDate");
        openapiFields.add("nextSubscriptionDate");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetOnChainYieldsLockedSubscriptionPreviewResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetOnChainYieldsLockedSubscriptionPreviewResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " GetOnChainYieldsLockedSubscriptionPreviewResponse is not"
                                    + " found in the empty JSON string",
                                GetOnChainYieldsLockedSubscriptionPreviewResponse
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("rewardAsset") != null && !jsonObj.get("rewardAsset").isJsonNull())
                && !jsonObj.get("rewardAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `rewardAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("rewardAsset").toString()));
        }
        if ((jsonObj.get("totalRewardAmt") != null && !jsonObj.get("totalRewardAmt").isJsonNull())
                && !jsonObj.get("totalRewardAmt").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalRewardAmt` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("totalRewardAmt").toString()));
        }
        if ((jsonObj.get("nextPay") != null && !jsonObj.get("nextPay").isJsonNull())
                && !jsonObj.get("nextPay").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `nextPay` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("nextPay").toString()));
        }
        if ((jsonObj.get("nextPayDate") != null && !jsonObj.get("nextPayDate").isJsonNull())
                && !jsonObj.get("nextPayDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `nextPayDate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("nextPayDate").toString()));
        }
        if ((jsonObj.get("rewardsPayDate") != null && !jsonObj.get("rewardsPayDate").isJsonNull())
                && !jsonObj.get("rewardsPayDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `rewardsPayDate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("rewardsPayDate").toString()));
        }
        if ((jsonObj.get("valueDate") != null && !jsonObj.get("valueDate").isJsonNull())
                && !jsonObj.get("valueDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `valueDate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("valueDate").toString()));
        }
        if ((jsonObj.get("rewardsEndDate") != null && !jsonObj.get("rewardsEndDate").isJsonNull())
                && !jsonObj.get("rewardsEndDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `rewardsEndDate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("rewardsEndDate").toString()));
        }
        if ((jsonObj.get("deliverDate") != null && !jsonObj.get("deliverDate").isJsonNull())
                && !jsonObj.get("deliverDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `deliverDate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("deliverDate").toString()));
        }
        if ((jsonObj.get("nextSubscriptionDate") != null
                        && !jsonObj.get("nextSubscriptionDate").isJsonNull())
                && !jsonObj.get("nextSubscriptionDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `nextSubscriptionDate` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("nextSubscriptionDate").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetOnChainYieldsLockedSubscriptionPreviewResponse.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'GetOnChainYieldsLockedSubscriptionPreviewResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetOnChainYieldsLockedSubscriptionPreviewResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(GetOnChainYieldsLockedSubscriptionPreviewResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetOnChainYieldsLockedSubscriptionPreviewResponse>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                GetOnChainYieldsLockedSubscriptionPreviewResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetOnChainYieldsLockedSubscriptionPreviewResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetOnChainYieldsLockedSubscriptionPreviewResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetOnChainYieldsLockedSubscriptionPreviewResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     GetOnChainYieldsLockedSubscriptionPreviewResponse
     */
    public static GetOnChainYieldsLockedSubscriptionPreviewResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, GetOnChainYieldsLockedSubscriptionPreviewResponse.class);
    }

    /**
     * Convert an instance of GetOnChainYieldsLockedSubscriptionPreviewResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
