package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelAllUmOpenConditionalOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelAllUmOpenConditionalOrdersExample {
    private DerivativesTradingPortfolioMarginRestApi api;

    public DerivativesTradingPortfolioMarginRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Cancel All UM Open Conditional Orders - Deprecated (TRADE)
     *
     * <p>Cancel All UM Open Conditional Orders &gt; **Deprecated:** This endpoint has returned HTTP
     * 404 since 2026-04-28 and is no longer available. Use &#x60;DELETE
     * /papi/v1/um/algo/allOpenOrders&#x60; instead. Field changes: &#x60;strategyId&#x60; -&gt;
     * &#x60;algoId&#x60;, &#x60;newClientStrategyId&#x60; -&gt; &#x60;clientAlgoId&#x60;,
     * &#x60;strategyStatus&#x60; -&gt; &#x60;algoStatus&#x60;, &#x60;stopPrice&#x60; -&gt;
     * &#x60;triggerPrice&#x60;, &#x60;activationPrice&#x60; -&gt; &#x60;activatePrice&#x60;
     * (TRAILING_STOP_MARKET orders). &#x60;algoType&#x60; is a new fixed-value field
     * (&#x60;CONDITIONAL&#x60;), not a rename of &#x60;strategyType&#x60; -- the order type now
     * lives in &#x60;type&#x60; (request) / &#x60;orderType&#x60; (response). Weight(IP): 1
     * Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllUmOpenConditionalOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<CancelAllUmOpenConditionalOrdersResponse> response =
                getApi().cancelAllUmOpenConditionalOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
