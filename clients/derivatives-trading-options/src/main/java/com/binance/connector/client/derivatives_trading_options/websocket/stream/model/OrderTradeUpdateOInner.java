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

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.JSON;
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

/** OrderTradeUpdateOInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OrderTradeUpdateOInner extends BaseDTO {
    public static final String SERIALIZED_NAME_T = "T";

    @SerializedName(SERIALIZED_NAME_T)
    @jakarta.annotation.Nullable
    private Long T;

    public static final String SERIALIZED_NAME_T_LOWER_CASE = "t";

    @SerializedName(SERIALIZED_NAME_T_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Long tLowerCase;

    public static final String SERIALIZED_NAME_S_LOWER_CASE = "s";

    @SerializedName(SERIALIZED_NAME_S_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String sLowerCase;

    public static final String SERIALIZED_NAME_C_LOWER_CASE = "c";

    @SerializedName(SERIALIZED_NAME_C_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String cLowerCase;

    public static final String SERIALIZED_NAME_OID = "oid";

    @SerializedName(SERIALIZED_NAME_OID)
    @jakarta.annotation.Nullable
    private String oid;

    public static final String SERIALIZED_NAME_P_LOWER_CASE = "p";

    @SerializedName(SERIALIZED_NAME_P_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String pLowerCase;

    public static final String SERIALIZED_NAME_Q_LOWER_CASE = "q";

    @SerializedName(SERIALIZED_NAME_Q_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String qLowerCase;

    public static final String SERIALIZED_NAME_STP = "stp";

    @SerializedName(SERIALIZED_NAME_STP)
    @jakarta.annotation.Nullable
    private Long stp;

    public static final String SERIALIZED_NAME_R_LOWER_CASE = "r";

    @SerializedName(SERIALIZED_NAME_R_LOWER_CASE)
    @jakarta.annotation.Nullable
    private Boolean rLowerCase;

    public static final String SERIALIZED_NAME_PO = "po";

    @SerializedName(SERIALIZED_NAME_PO)
    @jakarta.annotation.Nullable
    private Boolean po;

    public static final String SERIALIZED_NAME_S = "S";

    @SerializedName(SERIALIZED_NAME_S)
    @jakarta.annotation.Nullable
    private String S;

    public static final String SERIALIZED_NAME_E_LOWER_CASE = "e";

    @SerializedName(SERIALIZED_NAME_E_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String eLowerCase;

    public static final String SERIALIZED_NAME_EC = "ec";

    @SerializedName(SERIALIZED_NAME_EC)
    @jakarta.annotation.Nullable
    private String ec;

    public static final String SERIALIZED_NAME_F_LOWER_CASE = "f";

    @SerializedName(SERIALIZED_NAME_F_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String fLowerCase;

    public static final String SERIALIZED_NAME_TIF = "tif";

    @SerializedName(SERIALIZED_NAME_TIF)
    @jakarta.annotation.Nullable
    private String tif;

    public static final String SERIALIZED_NAME_OTY = "oty";

    @SerializedName(SERIALIZED_NAME_OTY)
    @jakarta.annotation.Nullable
    private String oty;

    public static final String SERIALIZED_NAME_FI = "fi";

    @SerializedName(SERIALIZED_NAME_FI)
    @jakarta.annotation.Nullable
    private List<@Valid OrderTradeUpdateOInnerFiInner> fi;

    public OrderTradeUpdateOInner() {}

    public OrderTradeUpdateOInner T(@jakarta.annotation.Nullable Long T) {
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

    public OrderTradeUpdateOInner tLowerCase(@jakarta.annotation.Nullable Long tLowerCase) {
        this.tLowerCase = tLowerCase;
        return this;
    }

    /**
     * Get tLowerCase
     *
     * @return tLowerCase
     */
    @jakarta.annotation.Nullable
    public Long gettLowerCase() {
        return tLowerCase;
    }

    public void settLowerCase(@jakarta.annotation.Nullable Long tLowerCase) {
        this.tLowerCase = tLowerCase;
    }

    public OrderTradeUpdateOInner sLowerCase(@jakarta.annotation.Nullable String sLowerCase) {
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

    public OrderTradeUpdateOInner cLowerCase(@jakarta.annotation.Nullable String cLowerCase) {
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

    public OrderTradeUpdateOInner oid(@jakarta.annotation.Nullable String oid) {
        this.oid = oid;
        return this;
    }

    /**
     * Get oid
     *
     * @return oid
     */
    @jakarta.annotation.Nullable
    public String getOid() {
        return oid;
    }

    public void setOid(@jakarta.annotation.Nullable String oid) {
        this.oid = oid;
    }

    public OrderTradeUpdateOInner pLowerCase(@jakarta.annotation.Nullable String pLowerCase) {
        this.pLowerCase = pLowerCase;
        return this;
    }

    /**
     * Get pLowerCase
     *
     * @return pLowerCase
     */
    @jakarta.annotation.Nullable
    public String getpLowerCase() {
        return pLowerCase;
    }

    public void setpLowerCase(@jakarta.annotation.Nullable String pLowerCase) {
        this.pLowerCase = pLowerCase;
    }

    public OrderTradeUpdateOInner qLowerCase(@jakarta.annotation.Nullable String qLowerCase) {
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

    public OrderTradeUpdateOInner stp(@jakarta.annotation.Nullable Long stp) {
        this.stp = stp;
        return this;
    }

    /**
     * Get stp
     *
     * @return stp
     */
    @jakarta.annotation.Nullable
    public Long getStp() {
        return stp;
    }

    public void setStp(@jakarta.annotation.Nullable Long stp) {
        this.stp = stp;
    }

    public OrderTradeUpdateOInner rLowerCase(@jakarta.annotation.Nullable Boolean rLowerCase) {
        this.rLowerCase = rLowerCase;
        return this;
    }

    /**
     * Get rLowerCase
     *
     * @return rLowerCase
     */
    @jakarta.annotation.Nullable
    public Boolean getrLowerCase() {
        return rLowerCase;
    }

    public void setrLowerCase(@jakarta.annotation.Nullable Boolean rLowerCase) {
        this.rLowerCase = rLowerCase;
    }

    public OrderTradeUpdateOInner po(@jakarta.annotation.Nullable Boolean po) {
        this.po = po;
        return this;
    }

    /**
     * Get po
     *
     * @return po
     */
    @jakarta.annotation.Nullable
    public Boolean getPo() {
        return po;
    }

    public void setPo(@jakarta.annotation.Nullable Boolean po) {
        this.po = po;
    }

    public OrderTradeUpdateOInner S(@jakarta.annotation.Nullable String S) {
        this.S = S;
        return this;
    }

    /**
     * Get S
     *
     * @return S
     */
    @jakarta.annotation.Nullable
    public String getS() {
        return S;
    }

    public void setS(@jakarta.annotation.Nullable String S) {
        this.S = S;
    }

    public OrderTradeUpdateOInner eLowerCase(@jakarta.annotation.Nullable String eLowerCase) {
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

    public OrderTradeUpdateOInner ec(@jakarta.annotation.Nullable String ec) {
        this.ec = ec;
        return this;
    }

    /**
     * Get ec
     *
     * @return ec
     */
    @jakarta.annotation.Nullable
    public String getEc() {
        return ec;
    }

    public void setEc(@jakarta.annotation.Nullable String ec) {
        this.ec = ec;
    }

    public OrderTradeUpdateOInner fLowerCase(@jakarta.annotation.Nullable String fLowerCase) {
        this.fLowerCase = fLowerCase;
        return this;
    }

    /**
     * Get fLowerCase
     *
     * @return fLowerCase
     */
    @jakarta.annotation.Nullable
    public String getfLowerCase() {
        return fLowerCase;
    }

    public void setfLowerCase(@jakarta.annotation.Nullable String fLowerCase) {
        this.fLowerCase = fLowerCase;
    }

    public OrderTradeUpdateOInner tif(@jakarta.annotation.Nullable String tif) {
        this.tif = tif;
        return this;
    }

    /**
     * Get tif
     *
     * @return tif
     */
    @jakarta.annotation.Nullable
    public String getTif() {
        return tif;
    }

    public void setTif(@jakarta.annotation.Nullable String tif) {
        this.tif = tif;
    }

    public OrderTradeUpdateOInner oty(@jakarta.annotation.Nullable String oty) {
        this.oty = oty;
        return this;
    }

    /**
     * Get oty
     *
     * @return oty
     */
    @jakarta.annotation.Nullable
    public String getOty() {
        return oty;
    }

    public void setOty(@jakarta.annotation.Nullable String oty) {
        this.oty = oty;
    }

    public OrderTradeUpdateOInner fi(
            @jakarta.annotation.Nullable List<@Valid OrderTradeUpdateOInnerFiInner> fi) {
        this.fi = fi;
        return this;
    }

    public OrderTradeUpdateOInner addFiItem(OrderTradeUpdateOInnerFiInner fiItem) {
        if (this.fi == null) {
            this.fi = new ArrayList<>();
        }
        this.fi.add(fiItem);
        return this;
    }

    /**
     * Get fi
     *
     * @return fi
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid OrderTradeUpdateOInnerFiInner> getFi() {
        return fi;
    }

    public void setFi(@jakarta.annotation.Nullable List<@Valid OrderTradeUpdateOInnerFiInner> fi) {
        this.fi = fi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderTradeUpdateOInner orderTradeUpdateOInner = (OrderTradeUpdateOInner) o;
        return Objects.equals(this.T, orderTradeUpdateOInner.T)
                && Objects.equals(this.tLowerCase, orderTradeUpdateOInner.tLowerCase)
                && Objects.equals(this.sLowerCase, orderTradeUpdateOInner.sLowerCase)
                && Objects.equals(this.cLowerCase, orderTradeUpdateOInner.cLowerCase)
                && Objects.equals(this.oid, orderTradeUpdateOInner.oid)
                && Objects.equals(this.pLowerCase, orderTradeUpdateOInner.pLowerCase)
                && Objects.equals(this.qLowerCase, orderTradeUpdateOInner.qLowerCase)
                && Objects.equals(this.stp, orderTradeUpdateOInner.stp)
                && Objects.equals(this.rLowerCase, orderTradeUpdateOInner.rLowerCase)
                && Objects.equals(this.po, orderTradeUpdateOInner.po)
                && Objects.equals(this.S, orderTradeUpdateOInner.S)
                && Objects.equals(this.eLowerCase, orderTradeUpdateOInner.eLowerCase)
                && Objects.equals(this.ec, orderTradeUpdateOInner.ec)
                && Objects.equals(this.fLowerCase, orderTradeUpdateOInner.fLowerCase)
                && Objects.equals(this.tif, orderTradeUpdateOInner.tif)
                && Objects.equals(this.oty, orderTradeUpdateOInner.oty)
                && Objects.equals(this.fi, orderTradeUpdateOInner.fi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                T,
                tLowerCase,
                sLowerCase,
                cLowerCase,
                oid,
                pLowerCase,
                qLowerCase,
                stp,
                rLowerCase,
                po,
                S,
                eLowerCase,
                ec,
                fLowerCase,
                tif,
                oty,
                fi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTradeUpdateOInner {\n");
        sb.append("		T: ").append(toIndentedString(T)).append("\n");
        sb.append("		tLowerCase: ").append(toIndentedString(tLowerCase)).append("\n");
        sb.append("		sLowerCase: ").append(toIndentedString(sLowerCase)).append("\n");
        sb.append("		cLowerCase: ").append(toIndentedString(cLowerCase)).append("\n");
        sb.append("		oid: ").append(toIndentedString(oid)).append("\n");
        sb.append("		pLowerCase: ").append(toIndentedString(pLowerCase)).append("\n");
        sb.append("		qLowerCase: ").append(toIndentedString(qLowerCase)).append("\n");
        sb.append("		stp: ").append(toIndentedString(stp)).append("\n");
        sb.append("		rLowerCase: ").append(toIndentedString(rLowerCase)).append("\n");
        sb.append("		po: ").append(toIndentedString(po)).append("\n");
        sb.append("		S: ").append(toIndentedString(S)).append("\n");
        sb.append("		eLowerCase: ").append(toIndentedString(eLowerCase)).append("\n");
        sb.append("		ec: ").append(toIndentedString(ec)).append("\n");
        sb.append("		fLowerCase: ").append(toIndentedString(fLowerCase)).append("\n");
        sb.append("		tif: ").append(toIndentedString(tif)).append("\n");
        sb.append("		oty: ").append(toIndentedString(oty)).append("\n");
        sb.append("		fi: ").append(toIndentedString(fi)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        Long TValue = getT();
        if (TValue != null) {
            String TValueAsString = TValue.toString();
            valMap.put("T", TValueAsString);
        }
        Long tLowerCaseValue = gettLowerCase();
        if (tLowerCaseValue != null) {
            String tLowerCaseValueAsString = tLowerCaseValue.toString();
            valMap.put("tLowerCase", tLowerCaseValueAsString);
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
        String oidValue = getOid();
        if (oidValue != null) {
            String oidValueAsString = oidValue.toString();
            valMap.put("oid", oidValueAsString);
        }
        String pLowerCaseValue = getpLowerCase();
        if (pLowerCaseValue != null) {
            String pLowerCaseValueAsString = pLowerCaseValue.toString();
            valMap.put("pLowerCase", pLowerCaseValueAsString);
        }
        String qLowerCaseValue = getqLowerCase();
        if (qLowerCaseValue != null) {
            String qLowerCaseValueAsString = qLowerCaseValue.toString();
            valMap.put("qLowerCase", qLowerCaseValueAsString);
        }
        Long stpValue = getStp();
        if (stpValue != null) {
            String stpValueAsString = stpValue.toString();
            valMap.put("stp", stpValueAsString);
        }
        Boolean rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            String rLowerCaseValueAsString = rLowerCaseValue.toString();
            valMap.put("rLowerCase", rLowerCaseValueAsString);
        }
        Boolean poValue = getPo();
        if (poValue != null) {
            String poValueAsString = poValue.toString();
            valMap.put("po", poValueAsString);
        }
        String SValue = getS();
        if (SValue != null) {
            String SValueAsString = SValue.toString();
            valMap.put("S", SValueAsString);
        }
        String eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            String eLowerCaseValueAsString = eLowerCaseValue.toString();
            valMap.put("eLowerCase", eLowerCaseValueAsString);
        }
        String ecValue = getEc();
        if (ecValue != null) {
            String ecValueAsString = ecValue.toString();
            valMap.put("ec", ecValueAsString);
        }
        String fLowerCaseValue = getfLowerCase();
        if (fLowerCaseValue != null) {
            String fLowerCaseValueAsString = fLowerCaseValue.toString();
            valMap.put("fLowerCase", fLowerCaseValueAsString);
        }
        String tifValue = getTif();
        if (tifValue != null) {
            String tifValueAsString = tifValue.toString();
            valMap.put("tif", tifValueAsString);
        }
        String otyValue = getOty();
        if (otyValue != null) {
            String otyValueAsString = otyValue.toString();
            valMap.put("oty", otyValueAsString);
        }
        List<@Valid OrderTradeUpdateOInnerFiInner> fiValue = getFi();
        if (fiValue != null) {
            String fiValueAsString = JSON.getGson().toJson(fiValue);
            valMap.put("fi", fiValueAsString);
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
        Object TValue = getT();
        if (TValue != null) {
            valMap.put("T", TValue);
        }
        Object tLowerCaseValue = gettLowerCase();
        if (tLowerCaseValue != null) {
            valMap.put("tLowerCase", tLowerCaseValue);
        }
        Object sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            valMap.put("sLowerCase", sLowerCaseValue);
        }
        Object cLowerCaseValue = getcLowerCase();
        if (cLowerCaseValue != null) {
            valMap.put("cLowerCase", cLowerCaseValue);
        }
        Object oidValue = getOid();
        if (oidValue != null) {
            valMap.put("oid", oidValue);
        }
        Object pLowerCaseValue = getpLowerCase();
        if (pLowerCaseValue != null) {
            valMap.put("pLowerCase", pLowerCaseValue);
        }
        Object qLowerCaseValue = getqLowerCase();
        if (qLowerCaseValue != null) {
            valMap.put("qLowerCase", qLowerCaseValue);
        }
        Object stpValue = getStp();
        if (stpValue != null) {
            valMap.put("stp", stpValue);
        }
        Object rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            valMap.put("rLowerCase", rLowerCaseValue);
        }
        Object poValue = getPo();
        if (poValue != null) {
            valMap.put("po", poValue);
        }
        Object SValue = getS();
        if (SValue != null) {
            valMap.put("S", SValue);
        }
        Object eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            valMap.put("eLowerCase", eLowerCaseValue);
        }
        Object ecValue = getEc();
        if (ecValue != null) {
            valMap.put("ec", ecValue);
        }
        Object fLowerCaseValue = getfLowerCase();
        if (fLowerCaseValue != null) {
            valMap.put("fLowerCase", fLowerCaseValue);
        }
        Object tifValue = getTif();
        if (tifValue != null) {
            valMap.put("tif", tifValue);
        }
        Object otyValue = getOty();
        if (otyValue != null) {
            valMap.put("oty", otyValue);
        }
        Object fiValue = getFi();
        if (fiValue != null) {
            valMap.put("fi", fiValue);
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
        openapiFields.add("T");
        openapiFields.add("t");
        openapiFields.add("s");
        openapiFields.add("c");
        openapiFields.add("oid");
        openapiFields.add("p");
        openapiFields.add("q");
        openapiFields.add("stp");
        openapiFields.add("r");
        openapiFields.add("po");
        openapiFields.add("S");
        openapiFields.add("e");
        openapiFields.add("ec");
        openapiFields.add("f");
        openapiFields.add("tif");
        openapiFields.add("oty");
        openapiFields.add("fi");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to OrderTradeUpdateOInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OrderTradeUpdateOInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OrderTradeUpdateOInner is not found in"
                                        + " the empty JSON string",
                                OrderTradeUpdateOInner.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!OrderTradeUpdateOInner.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `OrderTradeUpdateOInner` properties. JSON: %s",
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
        if ((jsonObj.get("oid") != null && !jsonObj.get("oid").isJsonNull())
                && !jsonObj.get("oid").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `oid` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("oid").toString()));
        }
        if ((jsonObj.get("p") != null && !jsonObj.get("p").isJsonNull())
                && !jsonObj.get("p").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `p` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("p").toString()));
        }
        if ((jsonObj.get("q") != null && !jsonObj.get("q").isJsonNull())
                && !jsonObj.get("q").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `q` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("q").toString()));
        }
        if ((jsonObj.get("S") != null && !jsonObj.get("S").isJsonNull())
                && !jsonObj.get("S").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `S` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("S").toString()));
        }
        if ((jsonObj.get("e") != null && !jsonObj.get("e").isJsonNull())
                && !jsonObj.get("e").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `e` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("e").toString()));
        }
        if ((jsonObj.get("ec") != null && !jsonObj.get("ec").isJsonNull())
                && !jsonObj.get("ec").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ec` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ec").toString()));
        }
        if ((jsonObj.get("f") != null && !jsonObj.get("f").isJsonNull())
                && !jsonObj.get("f").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `f` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("f").toString()));
        }
        if ((jsonObj.get("tif") != null && !jsonObj.get("tif").isJsonNull())
                && !jsonObj.get("tif").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tif` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("tif").toString()));
        }
        if ((jsonObj.get("oty") != null && !jsonObj.get("oty").isJsonNull())
                && !jsonObj.get("oty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `oty` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("oty").toString()));
        }
        if (jsonObj.get("fi") != null && !jsonObj.get("fi").isJsonNull()) {
            JsonArray jsonArrayfi = jsonObj.getAsJsonArray("fi");
            if (jsonArrayfi != null) {
                // ensure the json data is an array
                if (!jsonObj.get("fi").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `fi` to be an array in the JSON string but"
                                            + " got `%s`",
                                    jsonObj.get("fi").toString()));
                }

                // validate the optional field `fi` (array)
                for (int i = 0; i < jsonArrayfi.size(); i++) {
                    OrderTradeUpdateOInnerFiInner.validateJsonElement(jsonArrayfi.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrderTradeUpdateOInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrderTradeUpdateOInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OrderTradeUpdateOInner> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(OrderTradeUpdateOInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OrderTradeUpdateOInner>() {
                        @Override
                        public void write(JsonWriter out, OrderTradeUpdateOInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OrderTradeUpdateOInner read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OrderTradeUpdateOInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OrderTradeUpdateOInner
     * @throws IOException if the JSON string is invalid with respect to OrderTradeUpdateOInner
     */
    public static OrderTradeUpdateOInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OrderTradeUpdateOInner.class);
    }

    /**
     * Convert an instance of OrderTradeUpdateOInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
