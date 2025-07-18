/*
 * Binance Derivatives Trading Options REST API
 * OpenAPI Specification for the Binance Derivatives Trading Options REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_options.rest.model;

import com.binance.connector.client.derivatives_trading_options.rest.JSON;
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

/** GetOptionTransactionHistoryDownloadLinkByIdResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetOptionTransactionHistoryDownloadLinkByIdResponse {
    public static final String SERIALIZED_NAME_DOWNLOAD_ID = "downloadId";

    @SerializedName(SERIALIZED_NAME_DOWNLOAD_ID)
    @jakarta.annotation.Nullable
    private String downloadId;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private String status;

    public static final String SERIALIZED_NAME_URL = "url";

    @SerializedName(SERIALIZED_NAME_URL)
    @jakarta.annotation.Nullable
    private String url;

    public static final String SERIALIZED_NAME_NOTIFIED = "notified";

    @SerializedName(SERIALIZED_NAME_NOTIFIED)
    @jakarta.annotation.Nullable
    private Boolean notified;

    public static final String SERIALIZED_NAME_EXPIRATION_TIMESTAMP = "expirationTimestamp";

    @SerializedName(SERIALIZED_NAME_EXPIRATION_TIMESTAMP)
    @jakarta.annotation.Nullable
    private Long expirationTimestamp;

    public static final String SERIALIZED_NAME_IS_EXPIRED = "isExpired";

    @SerializedName(SERIALIZED_NAME_IS_EXPIRED)
    @jakarta.annotation.Nullable
    private String isExpired;

    public GetOptionTransactionHistoryDownloadLinkByIdResponse() {}

    public GetOptionTransactionHistoryDownloadLinkByIdResponse downloadId(
            @jakarta.annotation.Nullable String downloadId) {
        this.downloadId = downloadId;
        return this;
    }

    /**
     * Get downloadId
     *
     * @return downloadId
     */
    @jakarta.annotation.Nullable
    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(@jakarta.annotation.Nullable String downloadId) {
        this.downloadId = downloadId;
    }

    public GetOptionTransactionHistoryDownloadLinkByIdResponse status(
            @jakarta.annotation.Nullable String status) {
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

    public GetOptionTransactionHistoryDownloadLinkByIdResponse url(
            @jakarta.annotation.Nullable String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return url;
    }

    public void setUrl(@jakarta.annotation.Nullable String url) {
        this.url = url;
    }

    public GetOptionTransactionHistoryDownloadLinkByIdResponse notified(
            @jakarta.annotation.Nullable Boolean notified) {
        this.notified = notified;
        return this;
    }

    /**
     * Get notified
     *
     * @return notified
     */
    @jakarta.annotation.Nullable
    public Boolean getNotified() {
        return notified;
    }

    public void setNotified(@jakarta.annotation.Nullable Boolean notified) {
        this.notified = notified;
    }

    public GetOptionTransactionHistoryDownloadLinkByIdResponse expirationTimestamp(
            @jakarta.annotation.Nullable Long expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
        return this;
    }

    /**
     * Get expirationTimestamp
     *
     * @return expirationTimestamp
     */
    @jakarta.annotation.Nullable
    public Long getExpirationTimestamp() {
        return expirationTimestamp;
    }

    public void setExpirationTimestamp(@jakarta.annotation.Nullable Long expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    public GetOptionTransactionHistoryDownloadLinkByIdResponse isExpired(
            @jakarta.annotation.Nullable String isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    /**
     * Get isExpired
     *
     * @return isExpired
     */
    @jakarta.annotation.Nullable
    public String getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(@jakarta.annotation.Nullable String isExpired) {
        this.isExpired = isExpired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOptionTransactionHistoryDownloadLinkByIdResponse
                getOptionTransactionHistoryDownloadLinkByIdResponse =
                        (GetOptionTransactionHistoryDownloadLinkByIdResponse) o;
        return Objects.equals(
                        this.downloadId,
                        getOptionTransactionHistoryDownloadLinkByIdResponse.downloadId)
                && Objects.equals(
                        this.status, getOptionTransactionHistoryDownloadLinkByIdResponse.status)
                && Objects.equals(this.url, getOptionTransactionHistoryDownloadLinkByIdResponse.url)
                && Objects.equals(
                        this.notified, getOptionTransactionHistoryDownloadLinkByIdResponse.notified)
                && Objects.equals(
                        this.expirationTimestamp,
                        getOptionTransactionHistoryDownloadLinkByIdResponse.expirationTimestamp)
                && Objects.equals(
                        this.isExpired,
                        getOptionTransactionHistoryDownloadLinkByIdResponse.isExpired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadId, status, url, notified, expirationTimestamp, isExpired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOptionTransactionHistoryDownloadLinkByIdResponse {\n");
        sb.append("		downloadId: ").append(toIndentedString(downloadId)).append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		url: ").append(toIndentedString(url)).append("\n");
        sb.append("		notified: ").append(toIndentedString(notified)).append("\n");
        sb.append("		expirationTimestamp: ")
                .append(toIndentedString(expirationTimestamp))
                .append("\n");
        sb.append("		isExpired: ").append(toIndentedString(isExpired)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object downloadIdValue = getDownloadId();
        String downloadIdValueAsString = "";
        downloadIdValueAsString = downloadIdValue.toString();
        sb.append("downloadId=").append(urlEncode(downloadIdValueAsString)).append("");
        Object statusValue = getStatus();
        String statusValueAsString = "";
        statusValueAsString = statusValue.toString();
        sb.append("status=").append(urlEncode(statusValueAsString)).append("");
        Object urlValue = getUrl();
        String urlValueAsString = "";
        urlValueAsString = urlValue.toString();
        sb.append("url=").append(urlEncode(urlValueAsString)).append("");
        Object notifiedValue = getNotified();
        String notifiedValueAsString = "";
        notifiedValueAsString = notifiedValue.toString();
        sb.append("notified=").append(urlEncode(notifiedValueAsString)).append("");
        Object expirationTimestampValue = getExpirationTimestamp();
        String expirationTimestampValueAsString = "";
        expirationTimestampValueAsString = expirationTimestampValue.toString();
        sb.append("expirationTimestamp=")
                .append(urlEncode(expirationTimestampValueAsString))
                .append("");
        Object isExpiredValue = getIsExpired();
        String isExpiredValueAsString = "";
        isExpiredValueAsString = isExpiredValue.toString();
        sb.append("isExpired=").append(urlEncode(isExpiredValueAsString)).append("");
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
        openapiFields.add("downloadId");
        openapiFields.add("status");
        openapiFields.add("url");
        openapiFields.add("notified");
        openapiFields.add("expirationTimestamp");
        openapiFields.add("isExpired");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetOptionTransactionHistoryDownloadLinkByIdResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetOptionTransactionHistoryDownloadLinkByIdResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " GetOptionTransactionHistoryDownloadLinkByIdResponse is not"
                                    + " found in the empty JSON string",
                                GetOptionTransactionHistoryDownloadLinkByIdResponse
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("downloadId") != null && !jsonObj.get("downloadId").isJsonNull())
                && !jsonObj.get("downloadId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `downloadId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("downloadId").toString()));
        }
        if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull())
                && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
        if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull())
                && !jsonObj.get("url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `url` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("url").toString()));
        }
        if ((jsonObj.get("isExpired") != null && !jsonObj.get("isExpired").isJsonNull())
                && !jsonObj.get("isExpired").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `isExpired` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("isExpired").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetOptionTransactionHistoryDownloadLinkByIdResponse.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'GetOptionTransactionHistoryDownloadLinkByIdResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetOptionTransactionHistoryDownloadLinkByIdResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(
                                    GetOptionTransactionHistoryDownloadLinkByIdResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetOptionTransactionHistoryDownloadLinkByIdResponse>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                GetOptionTransactionHistoryDownloadLinkByIdResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetOptionTransactionHistoryDownloadLinkByIdResponse read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetOptionTransactionHistoryDownloadLinkByIdResponse given an JSON
     * string
     *
     * @param jsonString JSON string
     * @return An instance of GetOptionTransactionHistoryDownloadLinkByIdResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     GetOptionTransactionHistoryDownloadLinkByIdResponse
     */
    public static GetOptionTransactionHistoryDownloadLinkByIdResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, GetOptionTransactionHistoryDownloadLinkByIdResponse.class);
    }

    /**
     * Convert an instance of GetOptionTransactionHistoryDownloadLinkByIdResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
