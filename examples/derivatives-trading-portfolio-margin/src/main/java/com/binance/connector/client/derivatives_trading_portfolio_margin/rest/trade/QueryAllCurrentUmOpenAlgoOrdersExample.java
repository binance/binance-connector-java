package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentUmOpenAlgoOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllCurrentUmOpenAlgoOrdersExample {
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
     * Query All Current UM Open Algo Orders (USER_DATA)
     *
     * <p>Get all UM open algo orders on a symbol. If the symbol is not sent, orders for all symbols
     * will be returned. Weight(IP): 1 Security Type: USER_DATA Notes: - Weight: 1 for a single
     * symbol; 40 when the symbol parameter is omitted.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllCurrentUmOpenAlgoOrdersExample() throws ApiException, IOException {
        String algoType = "CONDITIONAL";
        String symbol = "BNBUSDT";
        Long algoId = 2146760L;
        Long recvWindow = 5000L;
        ApiResponse<QueryAllCurrentUmOpenAlgoOrdersResponse> response =
                getApi().queryAllCurrentUmOpenAlgoOrders(algoType, symbol, algoId, recvWindow);
        System.out.println(response.getData());
    }
}
