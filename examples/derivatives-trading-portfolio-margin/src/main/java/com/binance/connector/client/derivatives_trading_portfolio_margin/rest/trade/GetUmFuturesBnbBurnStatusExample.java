package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmFuturesBnbBurnStatusResponse;

/** API examples for TradeApi */
public class GetUmFuturesBnbBurnStatusExample {
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
     * Get UM Futures BNB Burn Status (USER_DATA)
     *
     * <p>Get user&#39;s BNB Fee Discount for UM Futures (Fee Discount On or Fee Discount Off )
     * Weight: 30
     *
     * @throws ApiException if the Api call fails
     */
    public void getUmFuturesBnbBurnStatusExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetUmFuturesBnbBurnStatusResponse> response =
                getApi().getUmFuturesBnbBurnStatus(recvWindow);
        System.out.println(response.getData());
    }
}
