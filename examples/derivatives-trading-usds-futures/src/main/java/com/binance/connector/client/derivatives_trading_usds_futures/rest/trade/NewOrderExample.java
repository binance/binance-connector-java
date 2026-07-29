package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NewOrderRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NewOrderResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderType;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class NewOrderExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * New Order (TRADE)
     *
     * <p>Send in a new order. Weight: 1 on 10s order rate limit(X-MBX-ORDER-COUNT-10S); 1 on 1min
     * order rate limit(X-MBX-ORDER-COUNT-1M); 0 on IP rate limit(x-mbx-used-weight-1m) Security
     * Type: TRADE Notes: Additional mandatory parameters based on &#x60;type&#x60;: | Type |
     * Additional mandatory parameters | |------|----------------------------------| |
     * &#x60;LIMIT&#x60; | &#x60;timeInForce&#x60;, &#x60;quantity&#x60;, &#x60;price&#x60; | |
     * &#x60;MARKET&#x60; | &#x60;quantity&#x60; | - If &#x60;newOrderRespType&#x60; is sent as
     * &#x60;RESULT&#x60;: - &#x60;MARKET&#x60; order: the final FILLED result of the order will be
     * returned directly. - &#x60;LIMIT&#x60; order with special &#x60;timeInForce&#x60;: the final
     * status result of the order (FILLED or EXPIRED) will be returned directly. -
     * &#x60;selfTradePreventionMode&#x60; is only effective when &#x60;timeInForce&#x60; is set to
     * &#x60;IOC&#x60;, &#x60;GTC&#x60;, or &#x60;GTD&#x60;. - In extreme market conditions,
     * &#x60;timeInForce&#x60; &#x60;GTD&#x60; order auto-cancel time might be delayed compared to
     * &#x60;goodTillDate&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void newOrderExample() throws ApiException, IOException {
        NewOrderRequest newOrderRequest = new NewOrderRequest();
        newOrderRequest.symbol("BTCUSDT");
        newOrderRequest.side(Side.BUY);
        newOrderRequest.type(OrderType.LIMIT);
        ApiResponse<NewOrderResponse> response = getApi().newOrder(newOrderRequest);
        System.out.println(response.getData());
    }
}
