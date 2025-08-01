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
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** QuerySubAccountFuturesAssetTransferHistoryResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QuerySubAccountFuturesAssetTransferHistoryResponse {
    public static final String SERIALIZED_NAME_SUCCESS = "success";

    @SerializedName(SERIALIZED_NAME_SUCCESS)
    @jakarta.annotation.Nullable
    private Boolean success;

    public static final String SERIALIZED_NAME_FUTURES_TYPE = "futuresType";

    @SerializedName(SERIALIZED_NAME_FUTURES_TYPE)
    @jakarta.annotation.Nullable
    private Long futuresType;

    public static final String SERIALIZED_NAME_TRANSFERS = "transfers";

    @SerializedName(SERIALIZED_NAME_TRANSFERS)
    @jakarta.annotation.Nullable
    private List<@Valid QuerySubAccountFuturesAssetTransferHistoryResponseTransfersInner> transfers;

    public QuerySubAccountFuturesAssetTransferHistoryResponse() {}

    public QuerySubAccountFuturesAssetTransferHistoryResponse success(
            @jakarta.annotation.Nullable Boolean success) {
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

    public QuerySubAccountFuturesAssetTransferHistoryResponse futuresType(
            @jakarta.annotation.Nullable Long futuresType) {
        this.futuresType = futuresType;
        return this;
    }

    /**
     * Get futuresType
     *
     * @return futuresType
     */
    @jakarta.annotation.Nullable
    public Long getFuturesType() {
        return futuresType;
    }

    public void setFuturesType(@jakarta.annotation.Nullable Long futuresType) {
        this.futuresType = futuresType;
    }

    public QuerySubAccountFuturesAssetTransferHistoryResponse transfers(
            @jakarta.annotation.Nullable
                    List<@Valid QuerySubAccountFuturesAssetTransferHistoryResponseTransfersInner>
                            transfers) {
        this.transfers = transfers;
        return this;
    }

    public QuerySubAccountFuturesAssetTransferHistoryResponse addTransfersItem(
            QuerySubAccountFuturesAssetTransferHistoryResponseTransfersInner transfersItem) {
        if (this.transfers == null) {
            this.transfers = new ArrayList<>();
        }
        this.transfers.add(transfersItem);
        return this;
    }

    /**
     * Get transfers
     *
     * @return transfers
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid QuerySubAccountFuturesAssetTransferHistoryResponseTransfersInner>
            getTransfers() {
        return transfers;
    }

    public void setTransfers(
            @jakarta.annotation.Nullable
                    List<@Valid QuerySubAccountFuturesAssetTransferHistoryResponseTransfersInner>
                            transfers) {
        this.transfers = transfers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySubAccountFuturesAssetTransferHistoryResponse
                querySubAccountFuturesAssetTransferHistoryResponse =
                        (QuerySubAccountFuturesAssetTransferHistoryResponse) o;
        return Objects.equals(
                        this.success, querySubAccountFuturesAssetTransferHistoryResponse.success)
                && Objects.equals(
                        this.futuresType,
                        querySubAccountFuturesAssetTransferHistoryResponse.futuresType)
                && Objects.equals(
                        this.transfers,
                        querySubAccountFuturesAssetTransferHistoryResponse.transfers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, futuresType, transfers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySubAccountFuturesAssetTransferHistoryResponse {\n");
        sb.append("		success: ").append(toIndentedString(success)).append("\n");
        sb.append("		futuresType: ").append(toIndentedString(futuresType)).append("\n");
        sb.append("		transfers: ").append(toIndentedString(transfers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object successValue = getSuccess();
        String successValueAsString = "";
        successValueAsString = successValue.toString();
        sb.append("success=").append(urlEncode(successValueAsString)).append("");
        Object futuresTypeValue = getFuturesType();
        String futuresTypeValueAsString = "";
        futuresTypeValueAsString = futuresTypeValue.toString();
        sb.append("futuresType=").append(urlEncode(futuresTypeValueAsString)).append("");
        Object transfersValue = getTransfers();
        String transfersValueAsString = "";
        transfersValueAsString =
                (String)
                        ((Collection) transfersValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("transfers=").append(urlEncode(transfersValueAsString)).append("");
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
        openapiFields.add("futuresType");
        openapiFields.add("transfers");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QuerySubAccountFuturesAssetTransferHistoryResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QuerySubAccountFuturesAssetTransferHistoryResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " QuerySubAccountFuturesAssetTransferHistoryResponse is not"
                                    + " found in the empty JSON string",
                                QuerySubAccountFuturesAssetTransferHistoryResponse
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("transfers") != null && !jsonObj.get("transfers").isJsonNull()) {
            JsonArray jsonArraytransfers = jsonObj.getAsJsonArray("transfers");
            if (jsonArraytransfers != null) {
                // ensure the json data is an array
                if (!jsonObj.get("transfers").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `transfers` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("transfers").toString()));
                }

                // validate the optional field `transfers` (array)
                for (int i = 0; i < jsonArraytransfers.size(); i++) {
                    QuerySubAccountFuturesAssetTransferHistoryResponseTransfersInner
                            .validateJsonElement(jsonArraytransfers.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QuerySubAccountFuturesAssetTransferHistoryResponse.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'QuerySubAccountFuturesAssetTransferHistoryResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QuerySubAccountFuturesAssetTransferHistoryResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(
                                    QuerySubAccountFuturesAssetTransferHistoryResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QuerySubAccountFuturesAssetTransferHistoryResponse>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                QuerySubAccountFuturesAssetTransferHistoryResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QuerySubAccountFuturesAssetTransferHistoryResponse read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QuerySubAccountFuturesAssetTransferHistoryResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QuerySubAccountFuturesAssetTransferHistoryResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     QuerySubAccountFuturesAssetTransferHistoryResponse
     */
    public static QuerySubAccountFuturesAssetTransferHistoryResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, QuerySubAccountFuturesAssetTransferHistoryResponse.class);
    }

    /**
     * Convert an instance of QuerySubAccountFuturesAssetTransferHistoryResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
