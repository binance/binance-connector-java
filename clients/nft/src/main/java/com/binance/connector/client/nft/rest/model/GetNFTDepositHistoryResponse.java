/*
 * Binance NFT REST API
 * OpenAPI Specification for the Binance NFT REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.nft.rest.model;

import com.binance.connector.client.nft.rest.JSON;
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

/** GetNFTDepositHistoryResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetNFTDepositHistoryResponse {
    public static final String SERIALIZED_NAME_TOTAL = "total";

    @SerializedName(SERIALIZED_NAME_TOTAL)
    @jakarta.annotation.Nullable
    private Long total;

    public static final String SERIALIZED_NAME_LIST = "list";

    @SerializedName(SERIALIZED_NAME_LIST)
    @jakarta.annotation.Nullable
    private List<@Valid GetNFTDepositHistoryResponseListInner> _list;

    public GetNFTDepositHistoryResponse() {}

    public GetNFTDepositHistoryResponse total(@jakarta.annotation.Nullable Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     */
    @jakarta.annotation.Nullable
    public Long getTotal() {
        return total;
    }

    public void setTotal(@jakarta.annotation.Nullable Long total) {
        this.total = total;
    }

    public GetNFTDepositHistoryResponse _list(
            @jakarta.annotation.Nullable List<@Valid GetNFTDepositHistoryResponseListInner> _list) {
        this._list = _list;
        return this;
    }

    public GetNFTDepositHistoryResponse addListItem(
            GetNFTDepositHistoryResponseListInner _listItem) {
        if (this._list == null) {
            this._list = new ArrayList<>();
        }
        this._list.add(_listItem);
        return this;
    }

    /**
     * Get _list
     *
     * @return _list
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid GetNFTDepositHistoryResponseListInner> getList() {
        return _list;
    }

    public void setList(
            @jakarta.annotation.Nullable List<@Valid GetNFTDepositHistoryResponseListInner> _list) {
        this._list = _list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetNFTDepositHistoryResponse getNFTDepositHistoryResponse =
                (GetNFTDepositHistoryResponse) o;
        return Objects.equals(this.total, getNFTDepositHistoryResponse.total)
                && Objects.equals(this._list, getNFTDepositHistoryResponse._list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, _list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNFTDepositHistoryResponse {\n");
        sb.append("		total: ").append(toIndentedString(total)).append("\n");
        sb.append("		_list: ").append(toIndentedString(_list)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object totalValue = getTotal();
        String totalValueAsString = "";
        totalValueAsString = totalValue.toString();
        sb.append("total=").append(urlEncode(totalValueAsString)).append("");
        Object _listValue = getList();
        String _listValueAsString = "";
        _listValueAsString =
                (String)
                        ((Collection) _listValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("_list=").append(urlEncode(_listValueAsString)).append("");
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
        openapiFields.add("total");
        openapiFields.add("list");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetNFTDepositHistoryResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetNFTDepositHistoryResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetNFTDepositHistoryResponse is not"
                                        + " found in the empty JSON string",
                                GetNFTDepositHistoryResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("list") != null && !jsonObj.get("list").isJsonNull()) {
            JsonArray jsonArray_list = jsonObj.getAsJsonArray("list");
            if (jsonArray_list != null) {
                // ensure the json data is an array
                if (!jsonObj.get("list").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `list` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("list").toString()));
                }

                // validate the optional field `list` (array)
                for (int i = 0; i < jsonArray_list.size(); i++) {
                    GetNFTDepositHistoryResponseListInner.validateJsonElement(
                            jsonArray_list.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetNFTDepositHistoryResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetNFTDepositHistoryResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetNFTDepositHistoryResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetNFTDepositHistoryResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetNFTDepositHistoryResponse>() {
                        @Override
                        public void write(JsonWriter out, GetNFTDepositHistoryResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetNFTDepositHistoryResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetNFTDepositHistoryResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetNFTDepositHistoryResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     GetNFTDepositHistoryResponse
     */
    public static GetNFTDepositHistoryResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetNFTDepositHistoryResponse.class);
    }

    /**
     * Convert an instance of GetNFTDepositHistoryResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
