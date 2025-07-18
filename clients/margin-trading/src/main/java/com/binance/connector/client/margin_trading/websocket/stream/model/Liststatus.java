/*
 * Binance Margin Trading WebSocket Market Streams
 * OpenAPI Specification for the Binance Margin Trading WebSocket Market Streams
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.margin_trading.websocket.stream.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.margin_trading.websocket.stream.JSON;
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
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** Liststatus */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class Liststatus extends BaseDTO {
    public static final String SERIALIZED_NAME_E = "E";

    @SerializedName(SERIALIZED_NAME_E)
    @jakarta.annotation.Nullable
    private Long E;

    public static final String SERIALIZED_NAME_S_LOWER_CASE = "s";

    @SerializedName(SERIALIZED_NAME_S_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String sLowerCase;

    public static final String SERIALIZED_NAME_G_LOWER_CASE = "g";

    @SerializedName(SERIALIZED_NAME_G_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Long gLowerCase;

    public static final String SERIALIZED_NAME_C_LOWER_CASE = "c";

    @SerializedName(SERIALIZED_NAME_C_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String cLowerCase;

    public static final String SERIALIZED_NAME_L_LOWER_CASE = "l";

    @SerializedName(SERIALIZED_NAME_L_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String lLowerCase;

    public static final String SERIALIZED_NAME_L = "L";

    @SerializedName(SERIALIZED_NAME_L)
    @jakarta.annotation.Nullable
    private String L;

    public static final String SERIALIZED_NAME_R_LOWER_CASE = "r";

    @SerializedName(SERIALIZED_NAME_R_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String rLowerCase;

    public static final String SERIALIZED_NAME_C = "C";

    @SerializedName(SERIALIZED_NAME_C)
    @jakarta.annotation.Nullable
    private String C;

    public static final String SERIALIZED_NAME_T = "T";

    @SerializedName(SERIALIZED_NAME_T)
    @jakarta.annotation.Nullable
    private Long T;

    public static final String SERIALIZED_NAME_O = "O";

    @SerializedName(SERIALIZED_NAME_O)
    @jakarta.annotation.Nullable
    private List<@Valid ListstatusOInner> O;

    public Liststatus() {}

    public Liststatus E(@jakarta.annotation.Nullable Long E) {
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

    public Liststatus sLowerCase(@jakarta.annotation.Nullable String sLowerCase) {
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

    public Liststatus gLowerCase(@jakarta.annotation.Nullable Long gLowerCase) {
        this.gLowerCase = gLowerCase;
        return this;
    }

    /**
     * Get gLowerCase
     *
     * @return gLowerCase
     */
    @jakarta.annotation.Nullable
    public Long getgLowerCase() {
        return gLowerCase;
    }

    public void setgLowerCase(@jakarta.annotation.Nullable Long gLowerCase) {
        this.gLowerCase = gLowerCase;
    }

    public Liststatus cLowerCase(@jakarta.annotation.Nullable String cLowerCase) {
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

    public Liststatus lLowerCase(@jakarta.annotation.Nullable String lLowerCase) {
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

    public Liststatus L(@jakarta.annotation.Nullable String L) {
        this.L = L;
        return this;
    }

    /**
     * Get L
     *
     * @return L
     */
    @jakarta.annotation.Nullable
    public String getL() {
        return L;
    }

    public void setL(@jakarta.annotation.Nullable String L) {
        this.L = L;
    }

    public Liststatus rLowerCase(@jakarta.annotation.Nullable String rLowerCase) {
        this.rLowerCase = rLowerCase;
        return this;
    }

    /**
     * Get rLowerCase
     *
     * @return rLowerCase
     */
    @jakarta.annotation.Nullable
    public String getrLowerCase() {
        return rLowerCase;
    }

    public void setrLowerCase(@jakarta.annotation.Nullable String rLowerCase) {
        this.rLowerCase = rLowerCase;
    }

    public Liststatus C(@jakarta.annotation.Nullable String C) {
        this.C = C;
        return this;
    }

    /**
     * Get C
     *
     * @return C
     */
    @jakarta.annotation.Nullable
    public String getC() {
        return C;
    }

    public void setC(@jakarta.annotation.Nullable String C) {
        this.C = C;
    }

    public Liststatus T(@jakarta.annotation.Nullable Long T) {
        this.T = T;
        return this;
    }

    /**
     * Get T
     *
     * @return T
     */
    @jakarta.annotation.Nullable
    public Long getT() {
        return T;
    }

    public void setT(@jakarta.annotation.Nullable Long T) {
        this.T = T;
    }

    public Liststatus O(@jakarta.annotation.Nullable List<@Valid ListstatusOInner> O) {
        this.O = O;
        return this;
    }

    public Liststatus addOItem(ListstatusOInner OItem) {
        if (this.O == null) {
            this.O = new ArrayList<>();
        }
        this.O.add(OItem);
        return this;
    }

    /**
     * Get O
     *
     * @return O
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid ListstatusOInner> getO() {
        return O;
    }

    public void setO(@jakarta.annotation.Nullable List<@Valid ListstatusOInner> O) {
        this.O = O;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Liststatus liststatus = (Liststatus) o;
        return Objects.equals(this.E, liststatus.E)
                && Objects.equals(this.sLowerCase, liststatus.sLowerCase)
                && Objects.equals(this.gLowerCase, liststatus.gLowerCase)
                && Objects.equals(this.cLowerCase, liststatus.cLowerCase)
                && Objects.equals(this.lLowerCase, liststatus.lLowerCase)
                && Objects.equals(this.L, liststatus.L)
                && Objects.equals(this.rLowerCase, liststatus.rLowerCase)
                && Objects.equals(this.C, liststatus.C)
                && Objects.equals(this.T, liststatus.T)
                && Objects.equals(this.O, liststatus.O);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                E, sLowerCase, gLowerCase, cLowerCase, lLowerCase, L, rLowerCase, C, T, O);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Liststatus {\n");
        sb.append("		E: ").append(toIndentedString(E)).append("\n");
        sb.append("		sLowerCase: ").append(toIndentedString(sLowerCase)).append("\n");
        sb.append("		gLowerCase: ").append(toIndentedString(gLowerCase)).append("\n");
        sb.append("		cLowerCase: ").append(toIndentedString(cLowerCase)).append("\n");
        sb.append("		lLowerCase: ").append(toIndentedString(lLowerCase)).append("\n");
        sb.append("		L: ").append(toIndentedString(L)).append("\n");
        sb.append("		rLowerCase: ").append(toIndentedString(rLowerCase)).append("\n");
        sb.append("		C: ").append(toIndentedString(C)).append("\n");
        sb.append("		T: ").append(toIndentedString(T)).append("\n");
        sb.append("		O: ").append(toIndentedString(O)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
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
        Long gLowerCaseValue = getgLowerCase();
        if (gLowerCaseValue != null) {
            String gLowerCaseValueAsString = gLowerCaseValue.toString();
            valMap.put("gLowerCase", gLowerCaseValueAsString);
        }
        String cLowerCaseValue = getcLowerCase();
        if (cLowerCaseValue != null) {
            String cLowerCaseValueAsString = cLowerCaseValue.toString();
            valMap.put("cLowerCase", cLowerCaseValueAsString);
        }
        String lLowerCaseValue = getlLowerCase();
        if (lLowerCaseValue != null) {
            String lLowerCaseValueAsString = lLowerCaseValue.toString();
            valMap.put("lLowerCase", lLowerCaseValueAsString);
        }
        String LValue = getL();
        if (LValue != null) {
            String LValueAsString = LValue.toString();
            valMap.put("L", LValueAsString);
        }
        String rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            String rLowerCaseValueAsString = rLowerCaseValue.toString();
            valMap.put("rLowerCase", rLowerCaseValueAsString);
        }
        String CValue = getC();
        if (CValue != null) {
            String CValueAsString = CValue.toString();
            valMap.put("C", CValueAsString);
        }
        Long TValue = getT();
        if (TValue != null) {
            String TValueAsString = TValue.toString();
            valMap.put("T", TValueAsString);
        }
        List<@Valid ListstatusOInner> OValue = getO();
        if (OValue != null) {
            String OValueAsString = JSON.getGson().toJson(OValue);
            valMap.put("O", OValueAsString);
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
        Object EValue = getE();
        if (EValue != null) {
            valMap.put("E", EValue);
        }
        Object sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            valMap.put("sLowerCase", sLowerCaseValue);
        }
        Object gLowerCaseValue = getgLowerCase();
        if (gLowerCaseValue != null) {
            valMap.put("gLowerCase", gLowerCaseValue);
        }
        Object cLowerCaseValue = getcLowerCase();
        if (cLowerCaseValue != null) {
            valMap.put("cLowerCase", cLowerCaseValue);
        }
        Object lLowerCaseValue = getlLowerCase();
        if (lLowerCaseValue != null) {
            valMap.put("lLowerCase", lLowerCaseValue);
        }
        Object LValue = getL();
        if (LValue != null) {
            valMap.put("L", LValue);
        }
        Object rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            valMap.put("rLowerCase", rLowerCaseValue);
        }
        Object CValue = getC();
        if (CValue != null) {
            valMap.put("C", CValue);
        }
        Object TValue = getT();
        if (TValue != null) {
            valMap.put("T", TValue);
        }
        Object OValue = getO();
        if (OValue != null) {
            valMap.put("O", OValue);
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
        openapiFields.add("E");
        openapiFields.add("s");
        openapiFields.add("g");
        openapiFields.add("c");
        openapiFields.add("l");
        openapiFields.add("L");
        openapiFields.add("r");
        openapiFields.add("C");
        openapiFields.add("T");
        openapiFields.add("O");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Liststatus
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!Liststatus.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Liststatus is not found in the empty"
                                        + " JSON string",
                                Liststatus.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!Liststatus.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Liststatus` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
        if ((jsonObj.get("l") != null && !jsonObj.get("l").isJsonNull())
                && !jsonObj.get("l").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `l` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("l").toString()));
        }
        if ((jsonObj.get("L") != null && !jsonObj.get("L").isJsonNull())
                && !jsonObj.get("L").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `L` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("L").toString()));
        }
        if ((jsonObj.get("r") != null && !jsonObj.get("r").isJsonNull())
                && !jsonObj.get("r").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `r` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("r").toString()));
        }
        if ((jsonObj.get("C") != null && !jsonObj.get("C").isJsonNull())
                && !jsonObj.get("C").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `C` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("C").toString()));
        }
        if (jsonObj.get("O") != null && !jsonObj.get("O").isJsonNull()) {
            JsonArray jsonArrayO = jsonObj.getAsJsonArray("O");
            if (jsonArrayO != null) {
                // ensure the json data is an array
                if (!jsonObj.get("O").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `O` to be an array in the JSON string but"
                                            + " got `%s`",
                                    jsonObj.get("O").toString()));
                }

                // validate the optional field `O` (array)
                for (int i = 0; i < jsonArrayO.size(); i++) {
                    ListstatusOInner.validateJsonElement(jsonArrayO.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Liststatus.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Liststatus' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Liststatus> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Liststatus.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Liststatus>() {
                        @Override
                        public void write(JsonWriter out, Liststatus value) throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Liststatus read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Liststatus given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Liststatus
     * @throws IOException if the JSON string is invalid with respect to Liststatus
     */
    public static Liststatus fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Liststatus.class);
    }

    /**
     * Convert an instance of Liststatus to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
