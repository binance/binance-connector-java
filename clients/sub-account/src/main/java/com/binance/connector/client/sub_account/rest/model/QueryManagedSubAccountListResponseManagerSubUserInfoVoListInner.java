/*
 * Binance Sub Account REST API
 * OpenAPI Specification for the Binance Sub Account REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.sub_account.rest.model;

import com.binance.connector.client.sub_account.rest.JSON;
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

/** QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner {
    public static final String SERIALIZED_NAME_ROOT_USER_ID = "rootUserId";

    @SerializedName(SERIALIZED_NAME_ROOT_USER_ID)
    @jakarta.annotation.Nullable
    private Long rootUserId;

    public static final String SERIALIZED_NAME_MANAGERSUB_USER_ID = "managersubUserId";

    @SerializedName(SERIALIZED_NAME_MANAGERSUB_USER_ID)
    @jakarta.annotation.Nullable
    private Long managersubUserId;

    public static final String SERIALIZED_NAME_BIND_PARENT_USER_ID = "bindParentUserId";

    @SerializedName(SERIALIZED_NAME_BIND_PARENT_USER_ID)
    @jakarta.annotation.Nullable
    private Long bindParentUserId;

    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @jakarta.annotation.Nullable
    private String email;

    public static final String SERIALIZED_NAME_INSERT_TIME_STAMP = "insertTimeStamp";

    @SerializedName(SERIALIZED_NAME_INSERT_TIME_STAMP)
    @jakarta.annotation.Nullable
    private Long insertTimeStamp;

    public static final String SERIALIZED_NAME_BIND_PARENT_EMAIL = "bindParentEmail";

    @SerializedName(SERIALIZED_NAME_BIND_PARENT_EMAIL)
    @jakarta.annotation.Nullable
    private String bindParentEmail;

    public static final String SERIALIZED_NAME_IS_SUB_USER_ENABLED = "isSubUserEnabled";

    @SerializedName(SERIALIZED_NAME_IS_SUB_USER_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean isSubUserEnabled;

    public static final String SERIALIZED_NAME_IS_USER_ACTIVE = "isUserActive";

    @SerializedName(SERIALIZED_NAME_IS_USER_ACTIVE)
    @jakarta.annotation.Nullable
    private Boolean isUserActive;

    public static final String SERIALIZED_NAME_IS_MARGIN_ENABLED = "isMarginEnabled";

    @SerializedName(SERIALIZED_NAME_IS_MARGIN_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean isMarginEnabled;

    public static final String SERIALIZED_NAME_IS_FUTURE_ENABLED = "isFutureEnabled";

    @SerializedName(SERIALIZED_NAME_IS_FUTURE_ENABLED)
    @jakarta.annotation.Nullable
    private Boolean isFutureEnabled;

    public static final String SERIALIZED_NAME_IS_SIGNED_L_V_T_RISK_AGREEMENT =
            "isSignedLVTRiskAgreement";

    @SerializedName(SERIALIZED_NAME_IS_SIGNED_L_V_T_RISK_AGREEMENT)
    @jakarta.annotation.Nullable
    private Boolean isSignedLVTRiskAgreement;

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner() {}

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner rootUserId(
            @jakarta.annotation.Nullable Long rootUserId) {
        this.rootUserId = rootUserId;
        return this;
    }

    /**
     * Get rootUserId
     *
     * @return rootUserId
     */
    @jakarta.annotation.Nullable
    public Long getRootUserId() {
        return rootUserId;
    }

    public void setRootUserId(@jakarta.annotation.Nullable Long rootUserId) {
        this.rootUserId = rootUserId;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner managersubUserId(
            @jakarta.annotation.Nullable Long managersubUserId) {
        this.managersubUserId = managersubUserId;
        return this;
    }

    /**
     * Get managersubUserId
     *
     * @return managersubUserId
     */
    @jakarta.annotation.Nullable
    public Long getManagersubUserId() {
        return managersubUserId;
    }

    public void setManagersubUserId(@jakarta.annotation.Nullable Long managersubUserId) {
        this.managersubUserId = managersubUserId;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner bindParentUserId(
            @jakarta.annotation.Nullable Long bindParentUserId) {
        this.bindParentUserId = bindParentUserId;
        return this;
    }

    /**
     * Get bindParentUserId
     *
     * @return bindParentUserId
     */
    @jakarta.annotation.Nullable
    public Long getBindParentUserId() {
        return bindParentUserId;
    }

    public void setBindParentUserId(@jakarta.annotation.Nullable Long bindParentUserId) {
        this.bindParentUserId = bindParentUserId;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner email(
            @jakarta.annotation.Nullable String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@jakarta.annotation.Nullable String email) {
        this.email = email;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner insertTimeStamp(
            @jakarta.annotation.Nullable Long insertTimeStamp) {
        this.insertTimeStamp = insertTimeStamp;
        return this;
    }

    /**
     * Get insertTimeStamp
     *
     * @return insertTimeStamp
     */
    @jakarta.annotation.Nullable
    public Long getInsertTimeStamp() {
        return insertTimeStamp;
    }

    public void setInsertTimeStamp(@jakarta.annotation.Nullable Long insertTimeStamp) {
        this.insertTimeStamp = insertTimeStamp;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner bindParentEmail(
            @jakarta.annotation.Nullable String bindParentEmail) {
        this.bindParentEmail = bindParentEmail;
        return this;
    }

    /**
     * Get bindParentEmail
     *
     * @return bindParentEmail
     */
    @jakarta.annotation.Nullable
    public String getBindParentEmail() {
        return bindParentEmail;
    }

    public void setBindParentEmail(@jakarta.annotation.Nullable String bindParentEmail) {
        this.bindParentEmail = bindParentEmail;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner isSubUserEnabled(
            @jakarta.annotation.Nullable Boolean isSubUserEnabled) {
        this.isSubUserEnabled = isSubUserEnabled;
        return this;
    }

    /**
     * Get isSubUserEnabled
     *
     * @return isSubUserEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSubUserEnabled() {
        return isSubUserEnabled;
    }

    public void setIsSubUserEnabled(@jakarta.annotation.Nullable Boolean isSubUserEnabled) {
        this.isSubUserEnabled = isSubUserEnabled;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner isUserActive(
            @jakarta.annotation.Nullable Boolean isUserActive) {
        this.isUserActive = isUserActive;
        return this;
    }

    /**
     * Get isUserActive
     *
     * @return isUserActive
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUserActive() {
        return isUserActive;
    }

    public void setIsUserActive(@jakarta.annotation.Nullable Boolean isUserActive) {
        this.isUserActive = isUserActive;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner isMarginEnabled(
            @jakarta.annotation.Nullable Boolean isMarginEnabled) {
        this.isMarginEnabled = isMarginEnabled;
        return this;
    }

    /**
     * Get isMarginEnabled
     *
     * @return isMarginEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMarginEnabled() {
        return isMarginEnabled;
    }

    public void setIsMarginEnabled(@jakarta.annotation.Nullable Boolean isMarginEnabled) {
        this.isMarginEnabled = isMarginEnabled;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner isFutureEnabled(
            @jakarta.annotation.Nullable Boolean isFutureEnabled) {
        this.isFutureEnabled = isFutureEnabled;
        return this;
    }

    /**
     * Get isFutureEnabled
     *
     * @return isFutureEnabled
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFutureEnabled() {
        return isFutureEnabled;
    }

    public void setIsFutureEnabled(@jakarta.annotation.Nullable Boolean isFutureEnabled) {
        this.isFutureEnabled = isFutureEnabled;
    }

    public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner isSignedLVTRiskAgreement(
            @jakarta.annotation.Nullable Boolean isSignedLVTRiskAgreement) {
        this.isSignedLVTRiskAgreement = isSignedLVTRiskAgreement;
        return this;
    }

    /**
     * Get isSignedLVTRiskAgreement
     *
     * @return isSignedLVTRiskAgreement
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSignedLVTRiskAgreement() {
        return isSignedLVTRiskAgreement;
    }

    public void setIsSignedLVTRiskAgreement(
            @jakarta.annotation.Nullable Boolean isSignedLVTRiskAgreement) {
        this.isSignedLVTRiskAgreement = isSignedLVTRiskAgreement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                queryManagedSubAccountListResponseManagerSubUserInfoVoListInner =
                        (QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner) o;
        return Objects.equals(
                        this.rootUserId,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner.rootUserId)
                && Objects.equals(
                        this.managersubUserId,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .managersubUserId)
                && Objects.equals(
                        this.bindParentUserId,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .bindParentUserId)
                && Objects.equals(
                        this.email,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner.email)
                && Objects.equals(
                        this.insertTimeStamp,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .insertTimeStamp)
                && Objects.equals(
                        this.bindParentEmail,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .bindParentEmail)
                && Objects.equals(
                        this.isSubUserEnabled,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .isSubUserEnabled)
                && Objects.equals(
                        this.isUserActive,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .isUserActive)
                && Objects.equals(
                        this.isMarginEnabled,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .isMarginEnabled)
                && Objects.equals(
                        this.isFutureEnabled,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .isFutureEnabled)
                && Objects.equals(
                        this.isSignedLVTRiskAgreement,
                        queryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                .isSignedLVTRiskAgreement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rootUserId,
                managersubUserId,
                bindParentUserId,
                email,
                insertTimeStamp,
                bindParentEmail,
                isSubUserEnabled,
                isUserActive,
                isMarginEnabled,
                isFutureEnabled,
                isSignedLVTRiskAgreement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner {\n");
        sb.append("		rootUserId: ").append(toIndentedString(rootUserId)).append("\n");
        sb.append("		managersubUserId: ").append(toIndentedString(managersubUserId)).append("\n");
        sb.append("		bindParentUserId: ").append(toIndentedString(bindParentUserId)).append("\n");
        sb.append("		email: ").append(toIndentedString(email)).append("\n");
        sb.append("		insertTimeStamp: ").append(toIndentedString(insertTimeStamp)).append("\n");
        sb.append("		bindParentEmail: ").append(toIndentedString(bindParentEmail)).append("\n");
        sb.append("		isSubUserEnabled: ").append(toIndentedString(isSubUserEnabled)).append("\n");
        sb.append("		isUserActive: ").append(toIndentedString(isUserActive)).append("\n");
        sb.append("		isMarginEnabled: ").append(toIndentedString(isMarginEnabled)).append("\n");
        sb.append("		isFutureEnabled: ").append(toIndentedString(isFutureEnabled)).append("\n");
        sb.append("		isSignedLVTRiskAgreement: ")
                .append(toIndentedString(isSignedLVTRiskAgreement))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object rootUserIdValue = getRootUserId();
        String rootUserIdValueAsString = "";
        rootUserIdValueAsString = rootUserIdValue.toString();
        sb.append("rootUserId=").append(urlEncode(rootUserIdValueAsString)).append("");
        Object managersubUserIdValue = getManagersubUserId();
        String managersubUserIdValueAsString = "";
        managersubUserIdValueAsString = managersubUserIdValue.toString();
        sb.append("managersubUserId=").append(urlEncode(managersubUserIdValueAsString)).append("");
        Object bindParentUserIdValue = getBindParentUserId();
        String bindParentUserIdValueAsString = "";
        bindParentUserIdValueAsString = bindParentUserIdValue.toString();
        sb.append("bindParentUserId=").append(urlEncode(bindParentUserIdValueAsString)).append("");
        Object emailValue = getEmail();
        String emailValueAsString = "";
        emailValueAsString = emailValue.toString();
        sb.append("email=").append(urlEncode(emailValueAsString)).append("");
        Object insertTimeStampValue = getInsertTimeStamp();
        String insertTimeStampValueAsString = "";
        insertTimeStampValueAsString = insertTimeStampValue.toString();
        sb.append("insertTimeStamp=").append(urlEncode(insertTimeStampValueAsString)).append("");
        Object bindParentEmailValue = getBindParentEmail();
        String bindParentEmailValueAsString = "";
        bindParentEmailValueAsString = bindParentEmailValue.toString();
        sb.append("bindParentEmail=").append(urlEncode(bindParentEmailValueAsString)).append("");
        Object isSubUserEnabledValue = getIsSubUserEnabled();
        String isSubUserEnabledValueAsString = "";
        isSubUserEnabledValueAsString = isSubUserEnabledValue.toString();
        sb.append("isSubUserEnabled=").append(urlEncode(isSubUserEnabledValueAsString)).append("");
        Object isUserActiveValue = getIsUserActive();
        String isUserActiveValueAsString = "";
        isUserActiveValueAsString = isUserActiveValue.toString();
        sb.append("isUserActive=").append(urlEncode(isUserActiveValueAsString)).append("");
        Object isMarginEnabledValue = getIsMarginEnabled();
        String isMarginEnabledValueAsString = "";
        isMarginEnabledValueAsString = isMarginEnabledValue.toString();
        sb.append("isMarginEnabled=").append(urlEncode(isMarginEnabledValueAsString)).append("");
        Object isFutureEnabledValue = getIsFutureEnabled();
        String isFutureEnabledValueAsString = "";
        isFutureEnabledValueAsString = isFutureEnabledValue.toString();
        sb.append("isFutureEnabled=").append(urlEncode(isFutureEnabledValueAsString)).append("");
        Object isSignedLVTRiskAgreementValue = getIsSignedLVTRiskAgreement();
        String isSignedLVTRiskAgreementValueAsString = "";
        isSignedLVTRiskAgreementValueAsString = isSignedLVTRiskAgreementValue.toString();
        sb.append("isSignedLVTRiskAgreement=")
                .append(urlEncode(isSignedLVTRiskAgreementValueAsString))
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
        openapiFields.add("rootUserId");
        openapiFields.add("managersubUserId");
        openapiFields.add("bindParentUserId");
        openapiFields.add("email");
        openapiFields.add("insertTimeStamp");
        openapiFields.add("bindParentEmail");
        openapiFields.add("isSubUserEnabled");
        openapiFields.add("isUserActive");
        openapiFields.add("isMarginEnabled");
        openapiFields.add("isFutureEnabled");
        openapiFields.add("isSignedLVTRiskAgreement");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                    .openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner"
                                    + " is not found in the empty JSON string",
                                QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
                && !jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
        }
        if ((jsonObj.get("bindParentEmail") != null && !jsonObj.get("bindParentEmail").isJsonNull())
                && !jsonObj.get("bindParentEmail").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `bindParentEmail` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("bindParentEmail").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner.class
                    .isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes
                // 'QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner>
                    thisAdapter =
                            gson.getDelegateAdapter(
                                    this,
                                    TypeToken.get(
                                            QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                                    .class));

            return (TypeAdapter<T>)
                    new TypeAdapter<
                            QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
                                        value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner given
     * an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner
     */
    public static QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner fromJson(
            String jsonString) throws IOException {
        return JSON.getGson()
                .fromJson(
                        jsonString,
                        QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner.class);
    }

    /**
     * Convert an instance of QueryManagedSubAccountListResponseManagerSubUserInfoVoListInner to an
     * JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
