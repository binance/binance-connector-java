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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** SubmitDepositQuestionnaireRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SubmitDepositQuestionnaireRequest {
    public static final String SERIALIZED_NAME_SUB_ACCOUNT_ID = "subAccountId";

    @SerializedName(SERIALIZED_NAME_SUB_ACCOUNT_ID)
    @jakarta.annotation.Nonnull
    private String subAccountId;

    public static final String SERIALIZED_NAME_DEPOSIT_ID = "depositId";

    @SerializedName(SERIALIZED_NAME_DEPOSIT_ID)
    @jakarta.annotation.Nonnull
    private String depositId;

    public static final String SERIALIZED_NAME_QUESTIONNAIRE = "questionnaire";

    @SerializedName(SERIALIZED_NAME_QUESTIONNAIRE)
    @jakarta.annotation.Nonnull
    private String questionnaire;

    public static final String SERIALIZED_NAME_BENEFICIARY_PII = "beneficiaryPii";

    @SerializedName(SERIALIZED_NAME_BENEFICIARY_PII)
    @jakarta.annotation.Nonnull
    private String beneficiaryPii;

    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    @jakarta.annotation.Nullable
    private String network;

    public static final String SERIALIZED_NAME_COIN = "coin";

    @SerializedName(SERIALIZED_NAME_COIN)
    @jakarta.annotation.Nullable
    private String coin;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nullable
    private Double amount;

    public static final String SERIALIZED_NAME_ADDRESS = "address";

    @SerializedName(SERIALIZED_NAME_ADDRESS)
    @jakarta.annotation.Nullable
    private String address;

    public static final String SERIALIZED_NAME_ADDRESS_TAG = "addressTag";

    @SerializedName(SERIALIZED_NAME_ADDRESS_TAG)
    @jakarta.annotation.Nullable
    private String addressTag;

    public static final String SERIALIZED_NAME_SIGNATURE = "signature";

    @SerializedName(SERIALIZED_NAME_SIGNATURE)
    @jakarta.annotation.Nonnull
    private String signature;

    public SubmitDepositQuestionnaireRequest() {}

    public SubmitDepositQuestionnaireRequest subAccountId(
            @jakarta.annotation.Nonnull String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }

    /**
     * Get subAccountId
     *
     * @return subAccountId
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSubAccountId() {
        return subAccountId;
    }

    public void setSubAccountId(@jakarta.annotation.Nonnull String subAccountId) {
        this.subAccountId = subAccountId;
    }

    public SubmitDepositQuestionnaireRequest depositId(
            @jakarta.annotation.Nonnull String depositId) {
        this.depositId = depositId;
        return this;
    }

    /**
     * Get depositId
     *
     * @return depositId
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(@jakarta.annotation.Nonnull String depositId) {
        this.depositId = depositId;
    }

    public SubmitDepositQuestionnaireRequest questionnaire(
            @jakarta.annotation.Nonnull String questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }

    /**
     * Get questionnaire
     *
     * @return questionnaire
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(@jakarta.annotation.Nonnull String questionnaire) {
        this.questionnaire = questionnaire;
    }

    public SubmitDepositQuestionnaireRequest beneficiaryPii(
            @jakarta.annotation.Nonnull String beneficiaryPii) {
        this.beneficiaryPii = beneficiaryPii;
        return this;
    }

    /**
     * Get beneficiaryPii
     *
     * @return beneficiaryPii
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getBeneficiaryPii() {
        return beneficiaryPii;
    }

    public void setBeneficiaryPii(@jakarta.annotation.Nonnull String beneficiaryPii) {
        this.beneficiaryPii = beneficiaryPii;
    }

    public SubmitDepositQuestionnaireRequest network(@jakarta.annotation.Nullable String network) {
        this.network = network;
        return this;
    }

    /**
     * Get network
     *
     * @return network
     */
    @jakarta.annotation.Nullable
    public String getNetwork() {
        return network;
    }

    public void setNetwork(@jakarta.annotation.Nullable String network) {
        this.network = network;
    }

    public SubmitDepositQuestionnaireRequest coin(@jakarta.annotation.Nullable String coin) {
        this.coin = coin;
        return this;
    }

    /**
     * Get coin
     *
     * @return coin
     */
    @jakarta.annotation.Nullable
    public String getCoin() {
        return coin;
    }

    public void setCoin(@jakarta.annotation.Nullable String coin) {
        this.coin = coin;
    }

    public SubmitDepositQuestionnaireRequest amount(@jakarta.annotation.Nullable Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getAmount() {
        return amount;
    }

    public void setAmount(@jakarta.annotation.Nullable Double amount) {
        this.amount = amount;
    }

    public SubmitDepositQuestionnaireRequest address(@jakarta.annotation.Nullable String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */
    @jakarta.annotation.Nullable
    public String getAddress() {
        return address;
    }

    public void setAddress(@jakarta.annotation.Nullable String address) {
        this.address = address;
    }

    public SubmitDepositQuestionnaireRequest addressTag(
            @jakarta.annotation.Nullable String addressTag) {
        this.addressTag = addressTag;
        return this;
    }

    /**
     * Get addressTag
     *
     * @return addressTag
     */
    @jakarta.annotation.Nullable
    public String getAddressTag() {
        return addressTag;
    }

    public void setAddressTag(@jakarta.annotation.Nullable String addressTag) {
        this.addressTag = addressTag;
    }

    public SubmitDepositQuestionnaireRequest signature(
            @jakarta.annotation.Nonnull String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Get signature
     *
     * @return signature
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSignature() {
        return signature;
    }

    public void setSignature(@jakarta.annotation.Nonnull String signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitDepositQuestionnaireRequest submitDepositQuestionnaireRequest =
                (SubmitDepositQuestionnaireRequest) o;
        return Objects.equals(this.subAccountId, submitDepositQuestionnaireRequest.subAccountId)
                && Objects.equals(this.depositId, submitDepositQuestionnaireRequest.depositId)
                && Objects.equals(
                        this.questionnaire, submitDepositQuestionnaireRequest.questionnaire)
                && Objects.equals(
                        this.beneficiaryPii, submitDepositQuestionnaireRequest.beneficiaryPii)
                && Objects.equals(this.network, submitDepositQuestionnaireRequest.network)
                && Objects.equals(this.coin, submitDepositQuestionnaireRequest.coin)
                && Objects.equals(this.amount, submitDepositQuestionnaireRequest.amount)
                && Objects.equals(this.address, submitDepositQuestionnaireRequest.address)
                && Objects.equals(this.addressTag, submitDepositQuestionnaireRequest.addressTag)
                && Objects.equals(this.signature, submitDepositQuestionnaireRequest.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                subAccountId,
                depositId,
                questionnaire,
                beneficiaryPii,
                network,
                coin,
                amount,
                address,
                addressTag,
                signature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitDepositQuestionnaireRequest {\n");
        sb.append("		subAccountId: ").append(toIndentedString(subAccountId)).append("\n");
        sb.append("		depositId: ").append(toIndentedString(depositId)).append("\n");
        sb.append("		questionnaire: ").append(toIndentedString(questionnaire)).append("\n");
        sb.append("		beneficiaryPii: ").append(toIndentedString(beneficiaryPii)).append("\n");
        sb.append("		network: ").append(toIndentedString(network)).append("\n");
        sb.append("		coin: ").append(toIndentedString(coin)).append("\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		address: ").append(toIndentedString(address)).append("\n");
        sb.append("		addressTag: ").append(toIndentedString(addressTag)).append("\n");
        sb.append("		signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object subAccountIdValue = getSubAccountId();
        String subAccountIdValueAsString = "";
        subAccountIdValueAsString = subAccountIdValue.toString();
        sb.append("subAccountId=").append(urlEncode(subAccountIdValueAsString)).append("");
        Object depositIdValue = getDepositId();
        String depositIdValueAsString = "";
        depositIdValueAsString = depositIdValue.toString();
        sb.append("depositId=").append(urlEncode(depositIdValueAsString)).append("");
        Object questionnaireValue = getQuestionnaire();
        String questionnaireValueAsString = "";
        questionnaireValueAsString = questionnaireValue.toString();
        sb.append("questionnaire=").append(urlEncode(questionnaireValueAsString)).append("");
        Object beneficiaryPiiValue = getBeneficiaryPii();
        String beneficiaryPiiValueAsString = "";
        beneficiaryPiiValueAsString = beneficiaryPiiValue.toString();
        sb.append("beneficiaryPii=").append(urlEncode(beneficiaryPiiValueAsString)).append("");
        Object networkValue = getNetwork();
        String networkValueAsString = "";
        networkValueAsString = networkValue.toString();
        sb.append("network=").append(urlEncode(networkValueAsString)).append("");
        Object coinValue = getCoin();
        String coinValueAsString = "";
        coinValueAsString = coinValue.toString();
        sb.append("coin=").append(urlEncode(coinValueAsString)).append("");
        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
        Object addressValue = getAddress();
        String addressValueAsString = "";
        addressValueAsString = addressValue.toString();
        sb.append("address=").append(urlEncode(addressValueAsString)).append("");
        Object addressTagValue = getAddressTag();
        String addressTagValueAsString = "";
        addressTagValueAsString = addressTagValue.toString();
        sb.append("addressTag=").append(urlEncode(addressTagValueAsString)).append("");
        Object signatureValue = getSignature();
        String signatureValueAsString = "";
        signatureValueAsString = signatureValue.toString();
        sb.append("signature=").append(urlEncode(signatureValueAsString)).append("");
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
        openapiFields.add("subAccountId");
        openapiFields.add("depositId");
        openapiFields.add("questionnaire");
        openapiFields.add("beneficiaryPii");
        openapiFields.add("network");
        openapiFields.add("coin");
        openapiFields.add("amount");
        openapiFields.add("address");
        openapiFields.add("addressTag");
        openapiFields.add("signature");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("subAccountId");
        openapiRequiredFields.add("depositId");
        openapiRequiredFields.add("questionnaire");
        openapiRequiredFields.add("beneficiaryPii");
        openapiRequiredFields.add("signature");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SubmitDepositQuestionnaireRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SubmitDepositQuestionnaireRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SubmitDepositQuestionnaireRequest is"
                                        + " not found in the empty JSON string",
                                SubmitDepositQuestionnaireRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SubmitDepositQuestionnaireRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("subAccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `subAccountId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("subAccountId").toString()));
        }
        if (!jsonObj.get("depositId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `depositId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("depositId").toString()));
        }
        if (!jsonObj.get("questionnaire").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `questionnaire` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("questionnaire").toString()));
        }
        if (!jsonObj.get("beneficiaryPii").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `beneficiaryPii` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("beneficiaryPii").toString()));
        }
        if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull())
                && !jsonObj.get("network").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `network` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("network").toString()));
        }
        if ((jsonObj.get("coin") != null && !jsonObj.get("coin").isJsonNull())
                && !jsonObj.get("coin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `coin` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("coin").toString()));
        }
        if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull())
                && !jsonObj.get("address").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `address` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("address").toString()));
        }
        if ((jsonObj.get("addressTag") != null && !jsonObj.get("addressTag").isJsonNull())
                && !jsonObj.get("addressTag").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `addressTag` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("addressTag").toString()));
        }
        if (!jsonObj.get("signature").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `signature` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("signature").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubmitDepositQuestionnaireRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SubmitDepositQuestionnaireRequest' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SubmitDepositQuestionnaireRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SubmitDepositQuestionnaireRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SubmitDepositQuestionnaireRequest>() {
                        @Override
                        public void write(JsonWriter out, SubmitDepositQuestionnaireRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SubmitDepositQuestionnaireRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SubmitDepositQuestionnaireRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SubmitDepositQuestionnaireRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SubmitDepositQuestionnaireRequest
     */
    public static SubmitDepositQuestionnaireRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SubmitDepositQuestionnaireRequest.class);
    }

    /**
     * Convert an instance of SubmitDepositQuestionnaireRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
