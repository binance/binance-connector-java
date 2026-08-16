package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentCmOpenConditionalOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryCurrentCmOpenConditionalOrderExample {
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
     * Query Current CM Open Conditional Order (USER_DATA)
     *
     * <p>Query Current CM Open Conditional Order Weight(IP): 1 Security Type: USER_DATA Notes: -
     * Either &#x60;strategyId&#x60; or &#x60;newClientStrategyId&#x60; must be sent. - If the
     * queried order has been triggered, cancelled or expired, the error message \&quot;Order does
     * not exist\&quot; will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCurrentCmOpenConditionalOrderExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        Long strategyId = 1L;
        String newClientStrategyId = "1";
        Long recvWindow = 5000L;
        ApiResponse<QueryCurrentCmOpenConditionalOrderResponse> response =
                getApi().queryCurrentCmOpenConditionalOrder(
                                symbol, strategyId, newClientStrategyId, recvWindow);
        System.out.println(response.getData());
    }
}
