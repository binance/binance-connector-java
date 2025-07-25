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

/** SubmitDepositQuestionnaireTravelRuleRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SubmitDepositQuestionnaireTravelRuleRequest {
    public static final String SERIALIZED_NAME_TRAN_ID = "tranId";

    @SerializedName(SERIALIZED_NAME_TRAN_ID)
    @jakarta.annotation.Nonnull
    private Long tranId;

    public static final String SERIALIZED_NAME_QUESTIONNAIRE = "questionnaire";

    @SerializedName(SERIALIZED_NAME_QUESTIONNAIRE)
    @jakarta.annotation.Nonnull
    private String questionnaire;

    public SubmitDepositQuestionnaireTravelRuleRequest() {}

    public SubmitDepositQuestionnaireTravelRuleRequest tranId(
            @jakarta.annotation.Nonnull Long tranId) {
        this.tranId = tranId;
        return this;
    }

    /**
     * Get tranId
     *
     * @return tranId
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public Long getTranId() {
        return tranId;
    }

    public void setTranId(@jakarta.annotation.Nonnull Long tranId) {
        this.tranId = tranId;
    }

    public SubmitDepositQuestionnaireTravelRuleRequest questionnaire(
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitDepositQuestionnaireTravelRuleRequest submitDepositQuestionnaireTravelRuleRequest =
                (SubmitDepositQuestionnaireTravelRuleRequest) o;
        return Objects.equals(this.tranId, submitDepositQuestionnaireTravelRuleRequest.tranId)
                && Objects.equals(
                        this.questionnaire,
                        submitDepositQuestionnaireTravelRuleRequest.questionnaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranId, questionnaire);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitDepositQuestionnaireTravelRuleRequest {\n");
        sb.append("		tranId: ").append(toIndentedString(tranId)).append("\n");
        sb.append("		questionnaire: ").append(toIndentedString(questionnaire)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object tranIdValue = getTranId();
        String tranIdValueAsString = "";
        tranIdValueAsString = tranIdValue.toString();
        sb.append("tranId=").append(urlEncode(tranIdValueAsString)).append("");
        Object questionnaireValue = getQuestionnaire();
        String questionnaireValueAsString = "";
        questionnaireValueAsString = questionnaireValue.toString();
        sb.append("questionnaire=").append(urlEncode(questionnaireValueAsString)).append("");
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
        openapiFields.add("questionnaire");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("tranId");
        openapiRequiredFields.add("questionnaire");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SubmitDepositQuestionnaireTravelRuleRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SubmitDepositQuestionnaireTravelRuleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " SubmitDepositQuestionnaireTravelRuleRequest is not found in"
                                    + " the empty JSON string",
                                SubmitDepositQuestionnaireTravelRuleRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField :
                SubmitDepositQuestionnaireTravelRuleRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("questionnaire").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `questionnaire` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("questionnaire").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubmitDepositQuestionnaireTravelRuleRequest.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'SubmitDepositQuestionnaireTravelRuleRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SubmitDepositQuestionnaireTravelRuleRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SubmitDepositQuestionnaireTravelRuleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SubmitDepositQuestionnaireTravelRuleRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, SubmitDepositQuestionnaireTravelRuleRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SubmitDepositQuestionnaireTravelRuleRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SubmitDepositQuestionnaireTravelRuleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SubmitDepositQuestionnaireTravelRuleRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SubmitDepositQuestionnaireTravelRuleRequest
     */
    public static SubmitDepositQuestionnaireTravelRuleRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, SubmitDepositQuestionnaireTravelRuleRequest.class);
    }

    /**
     * Convert an instance of SubmitDepositQuestionnaireTravelRuleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
