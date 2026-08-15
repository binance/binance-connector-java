package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUmAlgoOrderHistoryResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryUmAlgoOrderHistoryExample {
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
     * Query UM Algo Order History (USER_DATA)
     *
     * <p>Get all algo orders: ACTIVE, CANCELED, TRIGGERED or FINISHED. Weight(IP): 5 Security Type:
     * USER_DATA Notes: - If &#x60;algoId&#x60; is set, it will get orders &gt;&#x3D; that
     * &#x60;algoId&#x60;. Otherwise most recent orders are returned. - The query time period must
     * be less than 7 days (default as the recent 7 days).
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUmAlgoOrderHistoryExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Long algoId = 2146760L;
        Long startTime = 1770130294138L;
        Long endTime = 1770736694138L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryUmAlgoOrderHistoryResponse> response =
                getApi().queryUmAlgoOrderHistory(
                                symbol, algoId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
