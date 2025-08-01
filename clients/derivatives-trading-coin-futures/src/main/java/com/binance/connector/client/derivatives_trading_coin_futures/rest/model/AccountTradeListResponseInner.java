/*
 * Binance Derivatives Trading COIN Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading COIN Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.rest.model;

import com.binance.connector.client.derivatives_trading_coin_futures.rest.JSON;
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

/** AccountTradeListResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountTradeListResponseInner {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @jakarta.annotation.Nullable
    private Long id;

    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nullable
    private Long orderId;

    public static final String SERIALIZED_NAME_PAIR = "pair";

    @SerializedName(SERIALIZED_NAME_PAIR)
    @jakarta.annotation.Nullable
    private String pair;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nullable
    private String side;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private String price;

    public static final String SERIALIZED_NAME_QTY = "qty";

    @SerializedName(SERIALIZED_NAME_QTY)
    @jakarta.annotation.Nullable
    private String qty;

    public static final String SERIALIZED_NAME_REALIZED_PNL = "realizedPnl";

    @SerializedName(SERIALIZED_NAME_REALIZED_PNL)
    @jakarta.annotation.Nullable
    private String realizedPnl;

    public static final String SERIALIZED_NAME_MARGIN_ASSET = "marginAsset";

    @SerializedName(SERIALIZED_NAME_MARGIN_ASSET)
    @jakarta.annotation.Nullable
    private String marginAsset;

    public static final String SERIALIZED_NAME_BASE_QTY = "baseQty";

    @SerializedName(SERIALIZED_NAME_BASE_QTY)
    @jakarta.annotation.Nullable
    private String baseQty;

    public static final String SERIALIZED_NAME_COMMISSION = "commission";

    @SerializedName(SERIALIZED_NAME_COMMISSION)
    @jakarta.annotation.Nullable
    private String commission;

    public static final String SERIALIZED_NAME_COMMISSION_ASSET = "commissionAsset";

    @SerializedName(SERIALIZED_NAME_COMMISSION_ASSET)
    @jakarta.annotation.Nullable
    private String commissionAsset;

    public static final String SERIALIZED_NAME_TIME = "time";

    @SerializedName(SERIALIZED_NAME_TIME)
    @jakarta.annotation.Nullable
    private Long time;

    public static final String SERIALIZED_NAME_POSITION_SIDE = "positionSide";

    @SerializedName(SERIALIZED_NAME_POSITION_SIDE)
    @jakarta.annotation.Nullable
    private String positionSide;

    public static final String SERIALIZED_NAME_BUYER = "buyer";

    @SerializedName(SERIALIZED_NAME_BUYER)
    @jakarta.annotation.Nullable
    private Boolean buyer;

    public static final String SERIALIZED_NAME_MAKER = "maker";

    @SerializedName(SERIALIZED_NAME_MAKER)
    @jakarta.annotation.Nullable
    private Boolean maker;

    public AccountTradeListResponseInner() {}

    public AccountTradeListResponseInner symbol(@jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nullable
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(@jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
    }

    public AccountTradeListResponseInner id(@jakarta.annotation.Nullable Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nullable
    public Long getId() {
        return id;
    }

    public void setId(@jakarta.annotation.Nullable Long id) {
        this.id = id;
    }

    public AccountTradeListResponseInner orderId(@jakarta.annotation.Nullable Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     */
    @jakarta.annotation.Nullable
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(@jakarta.annotation.Nullable Long orderId) {
        this.orderId = orderId;
    }

    public AccountTradeListResponseInner pair(@jakarta.annotation.Nullable String pair) {
        this.pair = pair;
        return this;
    }

    /**
     * Get pair
     *
     * @return pair
     */
    @jakarta.annotation.Nullable
    public String getPair() {
        return pair;
    }

    public void setPair(@jakarta.annotation.Nullable String pair) {
        this.pair = pair;
    }

    public AccountTradeListResponseInner side(@jakarta.annotation.Nullable String side) {
        this.side = side;
        return this;
    }

    /**
     * Get side
     *
     * @return side
     */
    @jakarta.annotation.Nullable
    public String getSide() {
        return side;
    }

    public void setSide(@jakarta.annotation.Nullable String side) {
        this.side = side;
    }

    public AccountTradeListResponseInner price(@jakarta.annotation.Nullable String price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     */
    @jakarta.annotation.Nullable
    public String getPrice() {
        return price;
    }

    public void setPrice(@jakarta.annotation.Nullable String price) {
        this.price = price;
    }

    public AccountTradeListResponseInner qty(@jakarta.annotation.Nullable String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     */
    @jakarta.annotation.Nullable
    public String getQty() {
        return qty;
    }

    public void setQty(@jakarta.annotation.Nullable String qty) {
        this.qty = qty;
    }

    public AccountTradeListResponseInner realizedPnl(
            @jakarta.annotation.Nullable String realizedPnl) {
        this.realizedPnl = realizedPnl;
        return this;
    }

    /**
     * Get realizedPnl
     *
     * @return realizedPnl
     */
    @jakarta.annotation.Nullable
    public String getRealizedPnl() {
        return realizedPnl;
    }

    public void setRealizedPnl(@jakarta.annotation.Nullable String realizedPnl) {
        this.realizedPnl = realizedPnl;
    }

    public AccountTradeListResponseInner marginAsset(
            @jakarta.annotation.Nullable String marginAsset) {
        this.marginAsset = marginAsset;
        return this;
    }

    /**
     * Get marginAsset
     *
     * @return marginAsset
     */
    @jakarta.annotation.Nullable
    public String getMarginAsset() {
        return marginAsset;
    }

    public void setMarginAsset(@jakarta.annotation.Nullable String marginAsset) {
        this.marginAsset = marginAsset;
    }

    public AccountTradeListResponseInner baseQty(@jakarta.annotation.Nullable String baseQty) {
        this.baseQty = baseQty;
        return this;
    }

    /**
     * Get baseQty
     *
     * @return baseQty
     */
    @jakarta.annotation.Nullable
    public String getBaseQty() {
        return baseQty;
    }

    public void setBaseQty(@jakarta.annotation.Nullable String baseQty) {
        this.baseQty = baseQty;
    }

    public AccountTradeListResponseInner commission(
            @jakarta.annotation.Nullable String commission) {
        this.commission = commission;
        return this;
    }

    /**
     * Get commission
     *
     * @return commission
     */
    @jakarta.annotation.Nullable
    public String getCommission() {
        return commission;
    }

    public void setCommission(@jakarta.annotation.Nullable String commission) {
        this.commission = commission;
    }

    public AccountTradeListResponseInner commissionAsset(
            @jakarta.annotation.Nullable String commissionAsset) {
        this.commissionAsset = commissionAsset;
        return this;
    }

    /**
     * Get commissionAsset
     *
     * @return commissionAsset
     */
    @jakarta.annotation.Nullable
    public String getCommissionAsset() {
        return commissionAsset;
    }

    public void setCommissionAsset(@jakarta.annotation.Nullable String commissionAsset) {
        this.commissionAsset = commissionAsset;
    }

    public AccountTradeListResponseInner time(@jakarta.annotation.Nullable Long time) {
        this.time = time;
        return this;
    }

    /**
     * Get time
     *
     * @return time
     */
    @jakarta.annotation.Nullable
    public Long getTime() {
        return time;
    }

    public void setTime(@jakarta.annotation.Nullable Long time) {
        this.time = time;
    }

    public AccountTradeListResponseInner positionSide(
            @jakarta.annotation.Nullable String positionSide) {
        this.positionSide = positionSide;
        return this;
    }

    /**
     * Get positionSide
     *
     * @return positionSide
     */
    @jakarta.annotation.Nullable
    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(@jakarta.annotation.Nullable String positionSide) {
        this.positionSide = positionSide;
    }

    public AccountTradeListResponseInner buyer(@jakarta.annotation.Nullable Boolean buyer) {
        this.buyer = buyer;
        return this;
    }

    /**
     * Get buyer
     *
     * @return buyer
     */
    @jakarta.annotation.Nullable
    public Boolean getBuyer() {
        return buyer;
    }

    public void setBuyer(@jakarta.annotation.Nullable Boolean buyer) {
        this.buyer = buyer;
    }

    public AccountTradeListResponseInner maker(@jakarta.annotation.Nullable Boolean maker) {
        this.maker = maker;
        return this;
    }

    /**
     * Get maker
     *
     * @return maker
     */
    @jakarta.annotation.Nullable
    public Boolean getMaker() {
        return maker;
    }

    public void setMaker(@jakarta.annotation.Nullable Boolean maker) {
        this.maker = maker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountTradeListResponseInner accountTradeListResponseInner =
                (AccountTradeListResponseInner) o;
        return Objects.equals(this.symbol, accountTradeListResponseInner.symbol)
                && Objects.equals(this.id, accountTradeListResponseInner.id)
                && Objects.equals(this.orderId, accountTradeListResponseInner.orderId)
                && Objects.equals(this.pair, accountTradeListResponseInner.pair)
                && Objects.equals(this.side, accountTradeListResponseInner.side)
                && Objects.equals(this.price, accountTradeListResponseInner.price)
                && Objects.equals(this.qty, accountTradeListResponseInner.qty)
                && Objects.equals(this.realizedPnl, accountTradeListResponseInner.realizedPnl)
                && Objects.equals(this.marginAsset, accountTradeListResponseInner.marginAsset)
                && Objects.equals(this.baseQty, accountTradeListResponseInner.baseQty)
                && Objects.equals(this.commission, accountTradeListResponseInner.commission)
                && Objects.equals(
                        this.commissionAsset, accountTradeListResponseInner.commissionAsset)
                && Objects.equals(this.time, accountTradeListResponseInner.time)
                && Objects.equals(this.positionSide, accountTradeListResponseInner.positionSide)
                && Objects.equals(this.buyer, accountTradeListResponseInner.buyer)
                && Objects.equals(this.maker, accountTradeListResponseInner.maker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                symbol,
                id,
                orderId,
                pair,
                side,
                price,
                qty,
                realizedPnl,
                marginAsset,
                baseQty,
                commission,
                commissionAsset,
                time,
                positionSide,
                buyer,
                maker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountTradeListResponseInner {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		id: ").append(toIndentedString(id)).append("\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		pair: ").append(toIndentedString(pair)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("		realizedPnl: ").append(toIndentedString(realizedPnl)).append("\n");
        sb.append("		marginAsset: ").append(toIndentedString(marginAsset)).append("\n");
        sb.append("		baseQty: ").append(toIndentedString(baseQty)).append("\n");
        sb.append("		commission: ").append(toIndentedString(commission)).append("\n");
        sb.append("		commissionAsset: ").append(toIndentedString(commissionAsset)).append("\n");
        sb.append("		time: ").append(toIndentedString(time)).append("\n");
        sb.append("		positionSide: ").append(toIndentedString(positionSide)).append("\n");
        sb.append("		buyer: ").append(toIndentedString(buyer)).append("\n");
        sb.append("		maker: ").append(toIndentedString(maker)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object idValue = getId();
        String idValueAsString = "";
        idValueAsString = idValue.toString();
        sb.append("id=").append(urlEncode(idValueAsString)).append("");
        Object orderIdValue = getOrderId();
        String orderIdValueAsString = "";
        orderIdValueAsString = orderIdValue.toString();
        sb.append("orderId=").append(urlEncode(orderIdValueAsString)).append("");
        Object pairValue = getPair();
        String pairValueAsString = "";
        pairValueAsString = pairValue.toString();
        sb.append("pair=").append(urlEncode(pairValueAsString)).append("");
        Object sideValue = getSide();
        String sideValueAsString = "";
        sideValueAsString = sideValue.toString();
        sb.append("side=").append(urlEncode(sideValueAsString)).append("");
        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
        Object qtyValue = getQty();
        String qtyValueAsString = "";
        qtyValueAsString = qtyValue.toString();
        sb.append("qty=").append(urlEncode(qtyValueAsString)).append("");
        Object realizedPnlValue = getRealizedPnl();
        String realizedPnlValueAsString = "";
        realizedPnlValueAsString = realizedPnlValue.toString();
        sb.append("realizedPnl=").append(urlEncode(realizedPnlValueAsString)).append("");
        Object marginAssetValue = getMarginAsset();
        String marginAssetValueAsString = "";
        marginAssetValueAsString = marginAssetValue.toString();
        sb.append("marginAsset=").append(urlEncode(marginAssetValueAsString)).append("");
        Object baseQtyValue = getBaseQty();
        String baseQtyValueAsString = "";
        baseQtyValueAsString = baseQtyValue.toString();
        sb.append("baseQty=").append(urlEncode(baseQtyValueAsString)).append("");
        Object commissionValue = getCommission();
        String commissionValueAsString = "";
        commissionValueAsString = commissionValue.toString();
        sb.append("commission=").append(urlEncode(commissionValueAsString)).append("");
        Object commissionAssetValue = getCommissionAsset();
        String commissionAssetValueAsString = "";
        commissionAssetValueAsString = commissionAssetValue.toString();
        sb.append("commissionAsset=").append(urlEncode(commissionAssetValueAsString)).append("");
        Object timeValue = getTime();
        String timeValueAsString = "";
        timeValueAsString = timeValue.toString();
        sb.append("time=").append(urlEncode(timeValueAsString)).append("");
        Object positionSideValue = getPositionSide();
        String positionSideValueAsString = "";
        positionSideValueAsString = positionSideValue.toString();
        sb.append("positionSide=").append(urlEncode(positionSideValueAsString)).append("");
        Object buyerValue = getBuyer();
        String buyerValueAsString = "";
        buyerValueAsString = buyerValue.toString();
        sb.append("buyer=").append(urlEncode(buyerValueAsString)).append("");
        Object makerValue = getMaker();
        String makerValueAsString = "";
        makerValueAsString = makerValue.toString();
        sb.append("maker=").append(urlEncode(makerValueAsString)).append("");
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
        openapiFields.add("symbol");
        openapiFields.add("id");
        openapiFields.add("orderId");
        openapiFields.add("pair");
        openapiFields.add("side");
        openapiFields.add("price");
        openapiFields.add("qty");
        openapiFields.add("realizedPnl");
        openapiFields.add("marginAsset");
        openapiFields.add("baseQty");
        openapiFields.add("commission");
        openapiFields.add("commissionAsset");
        openapiFields.add("time");
        openapiFields.add("positionSide");
        openapiFields.add("buyer");
        openapiFields.add("maker");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AccountTradeListResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountTradeListResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccountTradeListResponseInner is not"
                                        + " found in the empty JSON string",
                                AccountTradeListResponseInner.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        if ((jsonObj.get("pair") != null && !jsonObj.get("pair").isJsonNull())
                && !jsonObj.get("pair").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `pair` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("pair").toString()));
        }
        if ((jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull())
                && !jsonObj.get("side").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `side` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("side").toString()));
        }
        if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull())
                && !jsonObj.get("price").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `price` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("price").toString()));
        }
        if ((jsonObj.get("qty") != null && !jsonObj.get("qty").isJsonNull())
                && !jsonObj.get("qty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `qty` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("qty").toString()));
        }
        if ((jsonObj.get("realizedPnl") != null && !jsonObj.get("realizedPnl").isJsonNull())
                && !jsonObj.get("realizedPnl").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `realizedPnl` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("realizedPnl").toString()));
        }
        if ((jsonObj.get("marginAsset") != null && !jsonObj.get("marginAsset").isJsonNull())
                && !jsonObj.get("marginAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `marginAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("marginAsset").toString()));
        }
        if ((jsonObj.get("baseQty") != null && !jsonObj.get("baseQty").isJsonNull())
                && !jsonObj.get("baseQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `baseQty` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("baseQty").toString()));
        }
        if ((jsonObj.get("commission") != null && !jsonObj.get("commission").isJsonNull())
                && !jsonObj.get("commission").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commission` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("commission").toString()));
        }
        if ((jsonObj.get("commissionAsset") != null && !jsonObj.get("commissionAsset").isJsonNull())
                && !jsonObj.get("commissionAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commissionAsset` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("commissionAsset").toString()));
        }
        if ((jsonObj.get("positionSide") != null && !jsonObj.get("positionSide").isJsonNull())
                && !jsonObj.get("positionSide").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `positionSide` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("positionSide").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccountTradeListResponseInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccountTradeListResponseInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountTradeListResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AccountTradeListResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountTradeListResponseInner>() {
                        @Override
                        public void write(JsonWriter out, AccountTradeListResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountTradeListResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountTradeListResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountTradeListResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     AccountTradeListResponseInner
     */
    public static AccountTradeListResponseInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccountTradeListResponseInner.class);
    }

    /**
     * Convert an instance of AccountTradeListResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
