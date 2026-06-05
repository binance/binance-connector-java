package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmFuturesTradeDownloadLinkByIdResponse;

/** API examples for AccountApi */
public class GetUmFuturesTradeDownloadLinkByIdExample {
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
     * Get UM Futures Trade Download Link by Id(USER_DATA)
     *
     * <p>Get UM futures trade download link by Id * Download link expiration: 7 days Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void getUmFuturesTradeDownloadLinkByIdExample() throws ApiException {
        String downloadId = "1";
        Long recvWindow = 5000L;
        ApiResponse<GetUmFuturesTradeDownloadLinkByIdResponse> response =
                getApi().getUmFuturesTradeDownloadLinkById(downloadId, recvWindow);
        System.out.println(response.getData());
    }
}
