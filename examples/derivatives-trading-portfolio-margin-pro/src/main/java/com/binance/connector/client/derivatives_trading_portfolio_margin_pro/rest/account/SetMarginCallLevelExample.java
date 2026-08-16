package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SetMarginCallLevelRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.SetMarginCallLevelResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class SetMarginCallLevelExample {
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
     * Set Margin Call Level (USER_DATA)
     *
     * <p>Set the margin call level for a Portfolio Margin account. When the account&#39;s uniMMR
     * drops to the specified level, a notification will be sent via email and SMS. Weight(IP): 1500
     * Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void setMarginCallLevelExample() throws ApiException, IOException {
        SetMarginCallLevelRequest setMarginCallLevelRequest = new SetMarginCallLevelRequest();
        setMarginCallLevelRequest.marginCallLevel(1.5d);
        ApiResponse<SetMarginCallLevelResponse> response =
                getApi().setMarginCallLevel(setMarginCallLevelRequest);
        System.out.println(response.getData());
    }
}
