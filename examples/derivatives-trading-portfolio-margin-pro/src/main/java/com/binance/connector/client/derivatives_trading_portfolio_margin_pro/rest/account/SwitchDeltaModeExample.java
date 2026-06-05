package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SwitchDeltaModeRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SwitchDeltaModeResponse;

/** API examples for AccountApi */
public class SwitchDeltaModeExample {
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
     * Switch Delta Mode(TRADE)
     *
     * <p>Switch the Delta mode for existing PM PRO / PM RETAIL accounts. Weight: 1500
     *
     * @throws ApiException if the Api call fails
     */
    public void switchDeltaModeExample() throws ApiException {
        SwitchDeltaModeRequest switchDeltaModeRequest = new SwitchDeltaModeRequest();
        switchDeltaModeRequest.deltaEnabled("");
        ApiResponse<SwitchDeltaModeResponse> response =
                getApi().switchDeltaMode(switchDeltaModeRequest);
        System.out.println(response.getData());
    }
}
