package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.NewOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.NewOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.OrderType;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.Side;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class NewOrderExample {
    private DerivativesTradingUsdsFuturesWebSocketApi api;

    public DerivativesTradingUsdsFuturesWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * New Order (TRADE)
     *
     * <p>Send in a new order. Weight(IP): 0 Security Type: TRADE Notes: Additional mandatory
     * parameters based on &#x60;type&#x60;: - &#x60;LIMIT&#x60;: &#x60;timeInForce&#x60;,
     * &#x60;quantity&#x60;, &#x60;price&#x60; - &#x60;MARKET&#x60;: &#x60;quantity&#x60; &gt; * If
     * &#x60;newOrderRespType&#x60; is sent as &#x60;RESULT&#x60;: &gt; * &#x60;MARKET&#x60; order:
     * the final FILLED result of the order will be return directly. &gt; * &#x60;LIMIT&#x60; order
     * with special &#x60;timeInForce&#x60;: the final status result of the order(FILLED or EXPIRED)
     * will be returned directly. &gt; &gt; * &#x60;selfTradePreventionMode&#x60; is only effective
     * when &#x60;timeInForce&#x60; set to &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;.
     * &gt; * In extreme market conditions, timeInForce &#x60;GTD&#x60; order auto cancel time might
     * be delayed comparing to &#x60;goodTillDate&#x60;
     */
    public void newOrderExampleAsync() {
        NewOrderRequest newOrderRequest = new NewOrderRequest();
        newOrderRequest.symbol("BTCUSDT");
        newOrderRequest.side(Side.BUY);
        newOrderRequest.type(OrderType.LIMIT);
        CompletableFuture<NewOrderResponse> future = getApi().newOrder(newOrderRequest);
        future.handle(
                (response, error) -> {
                    if (error != null) {
                        System.err.println(error);
                    }
                    System.out.println(response);
                    return response;
                });
    }

    /**
     * New Order (TRADE)
     *
     * <p>Send in a new order. Weight(IP): 0 Security Type: TRADE Notes: Additional mandatory
     * parameters based on &#x60;type&#x60;: - &#x60;LIMIT&#x60;: &#x60;timeInForce&#x60;,
     * &#x60;quantity&#x60;, &#x60;price&#x60; - &#x60;MARKET&#x60;: &#x60;quantity&#x60; &gt; * If
     * &#x60;newOrderRespType&#x60; is sent as &#x60;RESULT&#x60;: &gt; * &#x60;MARKET&#x60; order:
     * the final FILLED result of the order will be return directly. &gt; * &#x60;LIMIT&#x60; order
     * with special &#x60;timeInForce&#x60;: the final status result of the order(FILLED or EXPIRED)
     * will be returned directly. &gt; &gt; * &#x60;selfTradePreventionMode&#x60; is only effective
     * when &#x60;timeInForce&#x60; set to &#x60;IOC&#x60; or &#x60;GTC&#x60; or &#x60;GTD&#x60;.
     * &gt; * In extreme market conditions, timeInForce &#x60;GTD&#x60; order auto cancel time might
     * be delayed comparing to &#x60;goodTillDate&#x60;
     */
    public void newOrderExampleSync() {
        NewOrderRequest newOrderRequest = new NewOrderRequest();
        newOrderRequest.symbol("BTCUSDT");
        newOrderRequest.side(Side.BUY);
        newOrderRequest.type(OrderType.LIMIT);
        CompletableFuture<NewOrderResponse> future = getApi().newOrder(newOrderRequest);
        NewOrderResponse response = future.join();
        System.out.println(response);
    }
}
