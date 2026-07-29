package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.BnbTransferRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.BnbTransferResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.TransferSide;
import java.io.IOException;

/** API examples for AccountApi */
public class BnbTransferExample {
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
     * BNB transfer (TRADE)
     *
     * <p>Transfer BNB in and out of UM Weight(IP): 750 Security Type: TRADE Notes: - The endpoint
     * can only be called 10 times per 10 minutes in a rolling manner
     *
     * @throws ApiException if the Api call fails
     */
    public void bnbTransferExample() throws ApiException, IOException {
        BnbTransferRequest bnbTransferRequest = new BnbTransferRequest();
        bnbTransferRequest.amount(1.0d);
        bnbTransferRequest.transferSide(TransferSide.TO_UM);
        ApiResponse<BnbTransferResponse> response = getApi().bnbTransfer(bnbTransferRequest);
        System.out.println(response.getData());
    }
}
