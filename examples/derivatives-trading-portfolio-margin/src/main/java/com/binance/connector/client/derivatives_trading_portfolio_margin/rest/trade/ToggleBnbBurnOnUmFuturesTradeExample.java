package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FeeBurn;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ToggleBnbBurnOnUmFuturesTradeRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ToggleBnbBurnOnUmFuturesTradeResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class ToggleBnbBurnOnUmFuturesTradeExample {
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
     * Toggle BNB Burn On UM Futures Trade (TRADE)
     *
     * <p>Change user&#39;s BNB Fee Discount for UM Futures (Fee Discount On or Fee Discount Off )
     * on ***EVERY symbol*** Weight(IP): 1 Security Type: TRADE Notes: - The BNB would not be
     * collected from UM-PM account to the Portfolio Margin account.
     *
     * @throws ApiException if the Api call fails
     */
    public void toggleBnbBurnOnUmFuturesTradeExample() throws ApiException, IOException {
        ToggleBnbBurnOnUmFuturesTradeRequest toggleBnbBurnOnUmFuturesTradeRequest =
                new ToggleBnbBurnOnUmFuturesTradeRequest();
        toggleBnbBurnOnUmFuturesTradeRequest.feeBurn(FeeBurn.TRUE);
        ApiResponse<ToggleBnbBurnOnUmFuturesTradeResponse> response =
                getApi().toggleBnbBurnOnUmFuturesTrade(toggleBnbBurnOnUmFuturesTradeRequest);
        System.out.println(response.getData());
    }
}
