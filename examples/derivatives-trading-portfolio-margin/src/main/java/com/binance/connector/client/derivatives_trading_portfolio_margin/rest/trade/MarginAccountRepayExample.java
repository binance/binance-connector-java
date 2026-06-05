package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountRepayRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountRepayResponse;

/** API examples for TradeApi */
public class MarginAccountRepayExample {
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
     * Margin Account Repay(MARGIN)
     *
     * <p>Repay for a margin loan. Weight: 100
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountRepayExample() throws ApiException {
        MarginAccountRepayRequest marginAccountRepayRequest = new MarginAccountRepayRequest();
        marginAccountRepayRequest.asset("");
        marginAccountRepayRequest.amount(1.0d);
        ApiResponse<MarginAccountRepayResponse> response =
                getApi().marginAccountRepay(marginAccountRepayRequest);
        System.out.println(response.getData());
    }
}
