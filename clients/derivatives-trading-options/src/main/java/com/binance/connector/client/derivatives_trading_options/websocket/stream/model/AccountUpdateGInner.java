/*
 * Binance Derivatives Trading Options WebSocket Market Streams
 * OpenAPI Specification for the Binance Derivatives Trading Options WebSocket Market Streams
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_options.websocket.stream.model;

import com.binance.connector.client.common.DecimalFormatter;
import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.JSON;
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
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** AccountUpdateGInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountUpdateGInner extends BaseDTO {
    public static final String SERIALIZED_NAME_UI = "ui";

    @SerializedName(SERIALIZED_NAME_UI)
    @jakarta.annotation.Nullable
    private String ui;

    public static final String SERIALIZED_NAME_D_LOWER_CASE = "d";

    @SerializedName(SERIALIZED_NAME_D_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Double dLowerCase;

    public static final String SERIALIZED_NAME_T_LOWER_CASE = "t";

    @SerializedName(SERIALIZED_NAME_T_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Double tLowerCase;

    public static final String SERIALIZED_NAME_G_LOWER_CASE = "g";

    @SerializedName(SERIALIZED_NAME_G_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Double gLowerCase;

    public static final String SERIALIZED_NAME_V_LOWER_CASE = "v";

    @SerializedName(SERIALIZED_NAME_V_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Double vLowerCase;

    public AccountUpdateGInner() {}

    public AccountUpdateGInner ui(@jakarta.annotation.Nullable String ui) {
        this.ui = ui;
        return this;
    }

    /**
     * Get ui
     *
     * @return ui
     */
    @jakarta.annotation.Nullable
    public String getUi() {
        return ui;
    }

    public void setUi(@jakarta.annotation.Nullable String ui) {
        this.ui = ui;
    }

    public AccountUpdateGInner dLowerCase(@jakarta.annotation.Nullable Double dLowerCase) {
        this.dLowerCase = dLowerCase;
        return this;
    }

    /**
     * Get dLowerCase
     *
     * @return dLowerCase
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getdLowerCase() {
        return dLowerCase;
    }

    public void setdLowerCase(@jakarta.annotation.Nullable Double dLowerCase) {
        this.dLowerCase = dLowerCase;
    }

    public AccountUpdateGInner tLowerCase(@jakarta.annotation.Nullable Double tLowerCase) {
        this.tLowerCase = tLowerCase;
        return this;
    }

    /**
     * Get tLowerCase
     *
     * @return tLowerCase
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double gettLowerCase() {
        return tLowerCase;
    }

    public void settLowerCase(@jakarta.annotation.Nullable Double tLowerCase) {
        this.tLowerCase = tLowerCase;
    }

    public AccountUpdateGInner gLowerCase(@jakarta.annotation.Nullable Double gLowerCase) {
        this.gLowerCase = gLowerCase;
        return this;
    }

    /**
     * Get gLowerCase
     *
     * @return gLowerCase
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getgLowerCase() {
        return gLowerCase;
    }

    public void setgLowerCase(@jakarta.annotation.Nullable Double gLowerCase) {
        this.gLowerCase = gLowerCase;
    }

    public AccountUpdateGInner vLowerCase(@jakarta.annotation.Nullable Double vLowerCase) {
        this.vLowerCase = vLowerCase;
        return this;
    }

    /**
     * Get vLowerCase
     *
     * @return vLowerCase
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getvLowerCase() {
        return vLowerCase;
    }

    public void setvLowerCase(@jakarta.annotation.Nullable Double vLowerCase) {
        this.vLowerCase = vLowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountUpdateGInner accountUpdateGInner = (AccountUpdateGInner) o;
        return Objects.equals(this.ui, accountUpdateGInner.ui)
                && Objects.equals(this.dLowerCase, accountUpdateGInner.dLowerCase)
                && Objects.equals(this.tLowerCase, accountUpdateGInner.tLowerCase)
                && Objects.equals(this.gLowerCase, accountUpdateGInner.gLowerCase)
                && Objects.equals(this.vLowerCase, accountUpdateGInner.vLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ui, dLowerCase, tLowerCase, gLowerCase, vLowerCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountUpdateGInner {\n");
        sb.append("		ui: ").append(toIndentedString(ui)).append("\n");
        sb.append("		dLowerCase: ").append(toIndentedString(dLowerCase)).append("\n");
        sb.append("		tLowerCase: ").append(toIndentedString(tLowerCase)).append("\n");
        sb.append("		gLowerCase: ").append(toIndentedString(gLowerCase)).append("\n");
        sb.append("		vLowerCase: ").append(toIndentedString(vLowerCase)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String uiValue = getUi();
        if (uiValue != null) {
            String uiValueAsString = uiValue.toString();
            valMap.put("ui", uiValueAsString);
        }
        Double dLowerCaseValue = getdLowerCase();
        if (dLowerCaseValue != null) {
            String dLowerCaseValueAsString =
                    DecimalFormatter.getFormatter().format(dLowerCaseValue);
            valMap.put("dLowerCase", dLowerCaseValueAsString);
        }
        Double tLowerCaseValue = gettLowerCase();
        if (tLowerCaseValue != null) {
            String tLowerCaseValueAsString =
                    DecimalFormatter.getFormatter().format(tLowerCaseValue);
            valMap.put("tLowerCase", tLowerCaseValueAsString);
        }
        Double gLowerCaseValue = getgLowerCase();
        if (gLowerCaseValue != null) {
            String gLowerCaseValueAsString =
                    DecimalFormatter.getFormatter().format(gLowerCaseValue);
            valMap.put("gLowerCase", gLowerCaseValueAsString);
        }
        Double vLowerCaseValue = getvLowerCase();
        if (vLowerCaseValue != null) {
            String vLowerCaseValueAsString =
                    DecimalFormatter.getFormatter().format(vLowerCaseValue);
            valMap.put("vLowerCase", vLowerCaseValueAsString);
        }

        valMap.put("timestamp", getTimestamp());
        return asciiEncode(
                valMap.keySet().stream()
                        .map(key -> key + "=" + valMap.get(key))
                        .collect(Collectors.joining("&")));
    }

    public Map<String, Object> toMap() {
        Map<String, Object> valMap = new TreeMap<String, Object>();
        valMap.put("apiKey", getApiKey());
        Object uiValue = getUi();
        if (uiValue != null) {
            valMap.put("ui", uiValue);
        }
        Object dLowerCaseValue = getdLowerCase();
        if (dLowerCaseValue != null) {
            valMap.put("dLowerCase", dLowerCaseValue);
        }
        Object tLowerCaseValue = gettLowerCase();
        if (tLowerCaseValue != null) {
            valMap.put("tLowerCase", tLowerCaseValue);
        }
        Object gLowerCaseValue = getgLowerCase();
        if (gLowerCaseValue != null) {
            valMap.put("gLowerCase", gLowerCaseValue);
        }
        Object vLowerCaseValue = getvLowerCase();
        if (vLowerCaseValue != null) {
            valMap.put("vLowerCase", vLowerCaseValue);
        }

        valMap.put("timestamp", getTimestamp());
        return valMap;
    }

    public static String asciiEncode(String s) {
        return new String(s.getBytes(), StandardCharsets.US_ASCII);
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
        openapiFields.add("ui");
        openapiFields.add("d");
        openapiFields.add("t");
        openapiFields.add("g");
        openapiFields.add("v");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AccountUpdateGInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountUpdateGInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccountUpdateGInner is not found in"
                                        + " the empty JSON string",
                                AccountUpdateGInner.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AccountUpdateGInner.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AccountUpdateGInner` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("ui") != null && !jsonObj.get("ui").isJsonNull())
                && !jsonObj.get("ui").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ui` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ui").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccountUpdateGInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccountUpdateGInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountUpdateGInner> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AccountUpdateGInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountUpdateGInner>() {
                        @Override
                        public void write(JsonWriter out, AccountUpdateGInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountUpdateGInner read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountUpdateGInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountUpdateGInner
     * @throws IOException if the JSON string is invalid with respect to AccountUpdateGInner
     */
    public static AccountUpdateGInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccountUpdateGInner.class);
    }

    /**
     * Convert an instance of AccountUpdateGInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
