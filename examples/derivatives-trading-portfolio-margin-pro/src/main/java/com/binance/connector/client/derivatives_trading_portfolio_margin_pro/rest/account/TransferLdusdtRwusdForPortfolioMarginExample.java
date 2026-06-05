package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.TransferLdusdtRwusdForPortfolioMarginRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.TransferLdusdtRwusdForPortfolioMarginResponse;

/** API examples for AccountApi */
public class TransferLdusdtRwusdForPortfolioMarginExample {
    private DerivativesTradingPortfolioMarginProRestApi api;

    public DerivativesTradingPortfolioMarginProRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginProRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginProRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Transfer LDUSDT/RWUSD for Portfolio Margin(TRADE)
     *
     * <p>Transfer LDUSDT/RWUSD as collateral for all types of Portfolio Margin account Weight: 1500
     *
     * @throws ApiException if the Api call fails
     */
    public void transferLdusdtRwusdForPortfolioMarginExample() throws ApiException {
        TransferLdusdtRwusdForPortfolioMarginRequest transferLdusdtRwusdForPortfolioMarginRequest =
                new TransferLdusdtRwusdForPortfolioMarginRequest();
        transferLdusdtRwusdForPortfolioMarginRequest.asset("");
        transferLdusdtRwusdForPortfolioMarginRequest.transferType("");
        transferLdusdtRwusdForPortfolioMarginRequest.amount(1.0d);
        ApiResponse<TransferLdusdtRwusdForPortfolioMarginResponse> response =
                getApi().transferLdusdtRwusdForPortfolioMargin(
                                transferLdusdtRwusdForPortfolioMarginRequest);
        System.out.println(response.getData());
    }
}
