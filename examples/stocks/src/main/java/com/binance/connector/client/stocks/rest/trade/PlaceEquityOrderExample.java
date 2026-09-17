package com.binance.connector.client.stocks.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.OrderType;
import com.binance.connector.client.stocks.rest.model.PlaceEquityOrderResponse;
import com.binance.connector.client.stocks.rest.model.Side;
import com.binance.connector.client.stocks.rest.model.TimeInForce;
import com.binance.connector.client.stocks.rest.model.TradingSession;
import com.binance.connector.client.stocks.rest.model.WalletType;
import java.io.IOException;

/** API examples for TradeApi */
public class PlaceEquityOrderExample {
    private StocksRestApi api;

    public StocksRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StocksRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StocksRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Place Equity Order (TRADE)
     *
     * <p>Place a new equity order. Supports all combinations of &#x60;LIMIT&#x60; /
     * &#x60;MARKET&#x60; × &#x60;BUY&#x60; / &#x60;SELL&#x60;. For &#x60;LIMIT BUY&#x60; orders the
     * commission fee is automatically computed and reserved by the server at placement time —
     * callers submit &#x60;price&#x60; and &#x60;quantity&#x60; only, no &#x60;fee&#x60; field is
     * required. **Field combination matrix** | Side | OrderType | Required | Forbidden | | ---- |
     * --------- | -------- | --------- | | BUY | LIMIT | &#x60;price&#x60;, &#x60;quantity&#x60;,
     * &#x60;tradingSession&#x60; | &#x60;notional&#x60; | | BUY | MARKET | &#x60;notional&#x60; |
     * &#x60;price&#x60;, &#x60;quantity&#x60;, &#x60;tradingSession&#x60; | | SELL | LIMIT |
     * &#x60;price&#x60;, &#x60;quantity&#x60;, &#x60;tradingSession&#x60; | &#x60;notional&#x60; |
     * | SELL | MARKET | &#x60;quantity&#x60; | &#x60;price&#x60;, &#x60;notional&#x60;,
     * &#x60;tradingSession&#x60; | **Fractional shares**: when &#x60;quantity&#x60; has a decimal
     * component, or an order is placed by &#x60;notional&#x60;, it is treated as a fractional-share
     * order. A fractional-share &#x60;GTC&#x60; order must be paired with &#x60;tradingSession
     * &#x3D; EXTENDED&#x60; or &#x60;24H&#x60;. Rate limit: 200 requests / min (UID). Weight: 1
     * Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void placeEquityOrderExample() throws ApiException, IOException {
        String symbol = "AAPL";
        Side side = Side.BUY;
        OrderType orderType = OrderType.MARKET;
        String quoteAsset = "USDC";
        String price = "180.50";
        String quantity = "1";
        String notional = "1000.00";
        TimeInForce timeInForce = TimeInForce.DAY;
        TradingSession tradingSession = TradingSession.RTH;
        WalletType walletType = WalletType.CARD;
        String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a";
        Boolean tokenize = true;
        Long recvWindow = 5000L;
        ApiResponse<PlaceEquityOrderResponse> response =
                getApi().placeEquityOrder(
                                symbol,
                                side,
                                orderType,
                                quoteAsset,
                                price,
                                quantity,
                                notional,
                                timeInForce,
                                tradingSession,
                                walletType,
                                clientOrderId,
                                tokenize,
                                recvWindow);
        System.out.println(response.getData());
    }
}
