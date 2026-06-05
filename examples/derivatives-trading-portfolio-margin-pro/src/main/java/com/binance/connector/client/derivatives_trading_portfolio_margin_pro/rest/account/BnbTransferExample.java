package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.BnbTransferRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.BnbTransferResponse;

/** API examples for AccountApi */
public class BnbTransferExample {
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
     * BNB transfer(USER_DATA)
     *
     * <p>BNB transfer can be between Margin Account and USDM Account * You can only use this
     * function 2 times per 10 minutes in a rolling manner Weight: 1500
     *
     * @throws ApiException if the Api call fails
     */
    public void bnbTransferExample() throws ApiException {
        BnbTransferRequest bnbTransferRequest = new BnbTransferRequest();
        bnbTransferRequest.amount(1.0d);
        bnbTransferRequest.transferSide("");
        ApiResponse<BnbTransferResponse> response = getApi().bnbTransfer(bnbTransferRequest);
        System.out.println(response.getData());
    }
}
