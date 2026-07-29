package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOtocoRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountNewOtocoResponse;
import com.binance.connector.client.margin_trading.rest.model.PendingAboveType;
import com.binance.connector.client.margin_trading.rest.model.PendingSide;
import com.binance.connector.client.margin_trading.rest.model.WorkingSide;
import com.binance.connector.client.margin_trading.rest.model.WorkingType;
import java.io.IOException;

/** API examples for TradeApi */
public class MarginAccountNewOtocoExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Margin Account New OTOCO (TRADE)
     *
     * <p>Post a new OTOCO order for margin account： - An OTOCO (One-Triggers-One-Cancels-the-Other)
     * is an order list comprised of 3 orders. - The first order is called the **working order** and
     * must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes
     * on the order book. - The behavior of the working order is the same as the OTO. - OTOCO has 2
     * pending orders (pending above and pending below), forming an OCO pair. The pending orders are
     * only placed on the order book when the working order gets **fully filled**. - The rules of
     * the pending above and pending below follow the same rules as the [Order List
     * OCO](https://developers.binance.com/en/docs/catalog/core-trading-margin-trading/api/rest-api/trade#margin-account-new-oco).
     * - OTOCOs add **3 orders** against the unfilled order count,
     * &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter, and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight:
     * 6(UID) or 1500(UID) when sideEffectType is MARGIN_BUY or AUTO_BORROW_REPAY Security Type:
     * TRADE Notes: - autoRepayAtCancel is suggested to set as “FALSE” to keep liability unrepaid
     * under high frequent new order/cancel order execution - Depending on the
     * &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;, some
     * optional parameters will become mandatory: | Type | Additional mandatory parameters |
     * Additional information | | ------------------------------------ |
     * ------------------------------------------------------------ | ---------------------- | |
     * &#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60; | &#x60;workingTimeInForce&#x60; | | |
     * &#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; | &#x60;pendingAbovePrice&#x60; |
     * | | &#x60;pendingAboveType&#x60;&#x3D; &#x60;STOP_LOSS&#x60; |
     * &#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60; | | |
     * &#x60;pendingAboveType&#x60;&#x3D;&#x60;STOP_LOSS_LIMIT&#x60; |
     * &#x60;pendingAbovePrice&#x60;, &#x60;pendingAboveStopPrice&#x60; and/or
     * &#x60;pendingAboveTrailingDelta&#x60;, &#x60;pendingAboveTimeInForce&#x60; | | |
     * &#x60;pendingBelowType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60; | &#x60;pendingBelowPrice&#x60; |
     * | | &#x60;pendingBelowType&#x60;&#x3D; &#x60;STOP_LOSS&#x60; |
     * &#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60; | | |
     * &#x60;pendingBelowType&#x60;&#x3D;&#x60;STOP_LOSS_LIMIT&#x60; |
     * &#x60;pendingBelowPrice&#x60;, &#x60;pendingBelowStopPrice&#x60; and/or
     * &#x60;pendingBelowTrailingDelta&#x60;, &#x60;pendingBelowTimeInForce&#x60; | | |
     * &#x60;pendingAboveTrailingDelta&#x60; is provided | &#x60;pendingAbovePrice&#x60; | | |
     * &#x60;pendingBelowTrailingDelta&#x60; is provided | &#x60;pendingBelowPrice&#x60; | |
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountNewOtocoExample() throws ApiException, IOException {
        MarginAccountNewOtocoRequest marginAccountNewOtocoRequest =
                new MarginAccountNewOtocoRequest();
        marginAccountNewOtocoRequest.symbol("BTCUSDT");
        marginAccountNewOtocoRequest.workingType(WorkingType.LIMIT);
        marginAccountNewOtocoRequest.workingSide(WorkingSide.BUY);
        marginAccountNewOtocoRequest.workingPrice(1.0d);
        marginAccountNewOtocoRequest.workingQuantity(1.0d);
        marginAccountNewOtocoRequest.pendingSide(PendingSide.BUY);
        marginAccountNewOtocoRequest.pendingQuantity(1.0d);
        marginAccountNewOtocoRequest.pendingAboveType(PendingAboveType.LIMIT_MAKER);
        ApiResponse<MarginAccountNewOtocoResponse> response =
                getApi().marginAccountNewOtoco(marginAccountNewOtocoRequest);
        System.out.println(response.getData());
    }
}
