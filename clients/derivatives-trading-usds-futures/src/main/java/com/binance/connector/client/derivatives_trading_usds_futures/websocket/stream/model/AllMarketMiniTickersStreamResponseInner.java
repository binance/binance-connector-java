/*
 * Binance Derivatives Trading USDS Futures WebSocket Market Streams
 * OpenAPI Specification for the Binance Derivatives Trading USDS Futures WebSocket Market Streams
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.JSON;
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
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** AllMarketMiniTickersStreamResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AllMarketMiniTickersStreamResponseInner extends BaseDTO {
    public static final String SERIALIZED_NAME_E_LOWER_CASE = "e";

    @SerializedName(SERIALIZED_NAME_E_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String eLowerCase;

    public static final String SERIALIZED_NAME_E = "E";

    @SerializedName(SERIALIZED_NAME_E)
    @jakarta.annotation.Nullable
    private Long E;

    public static final String SERIALIZED_NAME_S_LOWER_CASE = "s";

    @SerializedName(SERIALIZED_NAME_S_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String sLowerCase;

    public static final String SERIALIZED_NAME_C_LOWER_CASE = "c";

    @SerializedName(SERIALIZED_NAME_C_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String cLowerCase;

    public static final String SERIALIZED_NAME_O_LOWER_CASE = "o";

    @SerializedName(SERIALIZED_NAME_O_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String oLowerCase;

    public static final String SERIALIZED_NAME_H_LOWER_CASE = "h";

    @SerializedName(SERIALIZED_NAME_H_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String hLowerCase;

    public static final String SERIALIZED_NAME_L_LOWER_CASE = "l";

    @SerializedName(SERIALIZED_NAME_L_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String lLowerCase;

    public static final String SERIALIZED_NAME_V_LOWER_CASE = "v";

    @SerializedName(SERIALIZED_NAME_V_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String vLowerCase;

    public static final String SERIALIZED_NAME_Q_LOWER_CASE = "q";

    @SerializedName(SERIALIZED_NAME_Q_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String qLowerCase;

    public AllMarketMiniTickersStreamResponseInner() {}

    public AllMarketMiniTickersStreamResponseInner eLowerCase(
            @jakarta.annotation.Nullable String eLowerCase) {
        this.eLowerCase = eLowerCase;
        return this;
    }

    /**
     * Get eLowerCase
     *
     * @return eLowerCase
     */
    @jakarta.annotation.Nullable
    public String geteLowerCase() {
        return eLowerCase;
    }

    public void seteLowerCase(@jakarta.annotation.Nullable String eLowerCase) {
        this.eLowerCase = eLowerCase;
    }

    public AllMarketMiniTickersStreamResponseInner E(@jakarta.annotation.Nullable Long E) {
        this.E = E;
        return this;
    }

    /**
     * Get E
     *
     * @return E
     */
    @jakarta.annotation.Nullable
    public Long getE() {
        return E;
    }

    public void setE(@jakarta.annotation.Nullable Long E) {
        this.E = E;
    }

    public AllMarketMiniTickersStreamResponseInner sLowerCase(
            @jakarta.annotation.Nullable String sLowerCase) {
        this.sLowerCase = sLowerCase;
        return this;
    }

    /**
     * Get sLowerCase
     *
     * @return sLowerCase
     */
    @jakarta.annotation.Nullable
    public String getsLowerCase() {
        return sLowerCase;
    }

    public void setsLowerCase(@jakarta.annotation.Nullable String sLowerCase) {
        this.sLowerCase = sLowerCase;
    }

    public AllMarketMiniTickersStreamResponseInner cLowerCase(
            @jakarta.annotation.Nullable String cLowerCase) {
        this.cLowerCase = cLowerCase;
        return this;
    }

    /**
     * Get cLowerCase
     *
     * @return cLowerCase
     */
    @jakarta.annotation.Nullable
    public String getcLowerCase() {
        return cLowerCase;
    }

    public void setcLowerCase(@jakarta.annotation.Nullable String cLowerCase) {
        this.cLowerCase = cLowerCase;
    }

    public AllMarketMiniTickersStreamResponseInner oLowerCase(
            @jakarta.annotation.Nullable String oLowerCase) {
        this.oLowerCase = oLowerCase;
        return this;
    }

    /**
     * Get oLowerCase
     *
     * @return oLowerCase
     */
    @jakarta.annotation.Nullable
    public String getoLowerCase() {
        return oLowerCase;
    }

    public void setoLowerCase(@jakarta.annotation.Nullable String oLowerCase) {
        this.oLowerCase = oLowerCase;
    }

    public AllMarketMiniTickersStreamResponseInner hLowerCase(
            @jakarta.annotation.Nullable String hLowerCase) {
        this.hLowerCase = hLowerCase;
        return this;
    }

    /**
     * Get hLowerCase
     *
     * @return hLowerCase
     */
    @jakarta.annotation.Nullable
    public String gethLowerCase() {
        return hLowerCase;
    }

    public void sethLowerCase(@jakarta.annotation.Nullable String hLowerCase) {
        this.hLowerCase = hLowerCase;
    }

    public AllMarketMiniTickersStreamResponseInner lLowerCase(
            @jakarta.annotation.Nullable String lLowerCase) {
        this.lLowerCase = lLowerCase;
        return this;
    }

    /**
     * Get lLowerCase
     *
     * @return lLowerCase
     */
    @jakarta.annotation.Nullable
    public String getlLowerCase() {
        return lLowerCase;
    }

    public void setlLowerCase(@jakarta.annotation.Nullable String lLowerCase) {
        this.lLowerCase = lLowerCase;
    }

    public AllMarketMiniTickersStreamResponseInner vLowerCase(
            @jakarta.annotation.Nullable String vLowerCase) {
        this.vLowerCase = vLowerCase;
        return this;
    }

    /**
     * Get vLowerCase
     *
     * @return vLowerCase
     */
    @jakarta.annotation.Nullable
    public String getvLowerCase() {
        return vLowerCase;
    }

    public void setvLowerCase(@jakarta.annotation.Nullable String vLowerCase) {
        this.vLowerCase = vLowerCase;
    }

    public AllMarketMiniTickersStreamResponseInner qLowerCase(
            @jakarta.annotation.Nullable String qLowerCase) {
        this.qLowerCase = qLowerCase;
        return this;
    }

    /**
     * Get qLowerCase
     *
     * @return qLowerCase
     */
    @jakarta.annotation.Nullable
    public String getqLowerCase() {
        return qLowerCase;
    }

    public void setqLowerCase(@jakarta.annotation.Nullable String qLowerCase) {
        this.qLowerCase = qLowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllMarketMiniTickersStreamResponseInner allMarketMiniTickersStreamResponseInner =
                (AllMarketMiniTickersStreamResponseInner) o;
        return Objects.equals(this.eLowerCase, allMarketMiniTickersStreamResponseInner.eLowerCase)
                && Objects.equals(this.E, allMarketMiniTickersStreamResponseInner.E)
                && Objects.equals(
                        this.sLowerCase, allMarketMiniTickersStreamResponseInner.sLowerCase)
                && Objects.equals(
                        this.cLowerCase, allMarketMiniTickersStreamResponseInner.cLowerCase)
                && Objects.equals(
                        this.oLowerCase, allMarketMiniTickersStreamResponseInner.oLowerCase)
                && Objects.equals(
                        this.hLowerCase, allMarketMiniTickersStreamResponseInner.hLowerCase)
                && Objects.equals(
                        this.lLowerCase, allMarketMiniTickersStreamResponseInner.lLowerCase)
                && Objects.equals(
                        this.vLowerCase, allMarketMiniTickersStreamResponseInner.vLowerCase)
                && Objects.equals(
                        this.qLowerCase, allMarketMiniTickersStreamResponseInner.qLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                eLowerCase,
                E,
                sLowerCase,
                cLowerCase,
                oLowerCase,
                hLowerCase,
                lLowerCase,
                vLowerCase,
                qLowerCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllMarketMiniTickersStreamResponseInner {\n");
        sb.append("		eLowerCase: ").append(toIndentedString(eLowerCase)).append("\n");
        sb.append("		E: ").append(toIndentedString(E)).append("\n");
        sb.append("		sLowerCase: ").append(toIndentedString(sLowerCase)).append("\n");
        sb.append("		cLowerCase: ").append(toIndentedString(cLowerCase)).append("\n");
        sb.append("		oLowerCase: ").append(toIndentedString(oLowerCase)).append("\n");
        sb.append("		hLowerCase: ").append(toIndentedString(hLowerCase)).append("\n");
        sb.append("		lLowerCase: ").append(toIndentedString(lLowerCase)).append("\n");
        sb.append("		vLowerCase: ").append(toIndentedString(vLowerCase)).append("\n");
        sb.append("		qLowerCase: ").append(toIndentedString(qLowerCase)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            String eLowerCaseValueAsString = eLowerCaseValue.toString();
            valMap.put("eLowerCase", eLowerCaseValueAsString);
        }
        Long EValue = getE();
        if (EValue != null) {
            String EValueAsString = EValue.toString();
            valMap.put("E", EValueAsString);
        }
        String sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            String sLowerCaseValueAsString = sLowerCaseValue.toString();
            valMap.put("sLowerCase", sLowerCaseValueAsString);
        }
        String cLowerCaseValue = getcLowerCase();
        if (cLowerCaseValue != null) {
            String cLowerCaseValueAsString = cLowerCaseValue.toString();
            valMap.put("cLowerCase", cLowerCaseValueAsString);
        }
        String oLowerCaseValue = getoLowerCase();
        if (oLowerCaseValue != null) {
            String oLowerCaseValueAsString = oLowerCaseValue.toString();
            valMap.put("oLowerCase", oLowerCaseValueAsString);
        }
        String hLowerCaseValue = gethLowerCase();
        if (hLowerCaseValue != null) {
            String hLowerCaseValueAsString = hLowerCaseValue.toString();
            valMap.put("hLowerCase", hLowerCaseValueAsString);
        }
        String lLowerCaseValue = getlLowerCase();
        if (lLowerCaseValue != null) {
            String lLowerCaseValueAsString = lLowerCaseValue.toString();
            valMap.put("lLowerCase", lLowerCaseValueAsString);
        }
        String vLowerCaseValue = getvLowerCase();
        if (vLowerCaseValue != null) {
            String vLowerCaseValueAsString = vLowerCaseValue.toString();
            valMap.put("vLowerCase", vLowerCaseValueAsString);
        }
        String qLowerCaseValue = getqLowerCase();
        if (qLowerCaseValue != null) {
            String qLowerCaseValueAsString = qLowerCaseValue.toString();
            valMap.put("qLowerCase", qLowerCaseValueAsString);
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
        Object eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            valMap.put("eLowerCase", eLowerCaseValue);
        }
        Object EValue = getE();
        if (EValue != null) {
            valMap.put("E", EValue);
        }
        Object sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            valMap.put("sLowerCase", sLowerCaseValue);
        }
        Object cLowerCaseValue = getcLowerCase();
        if (cLowerCaseValue != null) {
            valMap.put("cLowerCase", cLowerCaseValue);
        }
        Object oLowerCaseValue = getoLowerCase();
        if (oLowerCaseValue != null) {
            valMap.put("oLowerCase", oLowerCaseValue);
        }
        Object hLowerCaseValue = gethLowerCase();
        if (hLowerCaseValue != null) {
            valMap.put("hLowerCase", hLowerCaseValue);
        }
        Object lLowerCaseValue = getlLowerCase();
        if (lLowerCaseValue != null) {
            valMap.put("lLowerCase", lLowerCaseValue);
        }
        Object vLowerCaseValue = getvLowerCase();
        if (vLowerCaseValue != null) {
            valMap.put("vLowerCase", vLowerCaseValue);
        }
        Object qLowerCaseValue = getqLowerCase();
        if (qLowerCaseValue != null) {
            valMap.put("qLowerCase", qLowerCaseValue);
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
        openapiFields.add("e");
        openapiFields.add("E");
        openapiFields.add("s");
        openapiFields.add("c");
        openapiFields.add("o");
        openapiFields.add("h");
        openapiFields.add("l");
        openapiFields.add("v");
        openapiFields.add("q");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AllMarketMiniTickersStreamResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AllMarketMiniTickersStreamResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " AllMarketMiniTickersStreamResponseInner is not found in the"
                                    + " empty JSON string",
                                AllMarketMiniTickersStreamResponseInner.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AllMarketMiniTickersStreamResponseInner.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `AllMarketMiniTickersStreamResponseInner` properties. JSON:"
                                    + " %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("e") != null && !jsonObj.get("e").isJsonNull())
                && !jsonObj.get("e").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `e` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("e").toString()));
        }
        if ((jsonObj.get("s") != null && !jsonObj.get("s").isJsonNull())
                && !jsonObj.get("s").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `s` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("s").toString()));
        }
        if ((jsonObj.get("c") != null && !jsonObj.get("c").isJsonNull())
                && !jsonObj.get("c").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `c` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("c").toString()));
        }
        if ((jsonObj.get("o") != null && !jsonObj.get("o").isJsonNull())
                && !jsonObj.get("o").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `o` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("o").toString()));
        }
        if ((jsonObj.get("h") != null && !jsonObj.get("h").isJsonNull())
                && !jsonObj.get("h").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `h` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("h").toString()));
        }
        if ((jsonObj.get("l") != null && !jsonObj.get("l").isJsonNull())
                && !jsonObj.get("l").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `l` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("l").toString()));
        }
        if ((jsonObj.get("v") != null && !jsonObj.get("v").isJsonNull())
                && !jsonObj.get("v").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `v` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("v").toString()));
        }
        if ((jsonObj.get("q") != null && !jsonObj.get("q").isJsonNull())
                && !jsonObj.get("q").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `q` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("q").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AllMarketMiniTickersStreamResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes 'AllMarketMiniTickersStreamResponseInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AllMarketMiniTickersStreamResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AllMarketMiniTickersStreamResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AllMarketMiniTickersStreamResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, AllMarketMiniTickersStreamResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AllMarketMiniTickersStreamResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AllMarketMiniTickersStreamResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AllMarketMiniTickersStreamResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     AllMarketMiniTickersStreamResponseInner
     */
    public static AllMarketMiniTickersStreamResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, AllMarketMiniTickersStreamResponseInner.class);
    }

    /**
     * Convert an instance of AllMarketMiniTickersStreamResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
