package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmFuturesOrderDownloadLinkByIdResponse;

/** API examples for AccountApi */
public class GetUmFuturesOrderDownloadLinkByIdExample {
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
     * Get UM Futures Order Download Link by Id(USER_DATA)
     *
     * <p>Get UM futures order download link by Id * Download link expiration: 7 days Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void getUmFuturesOrderDownloadLinkByIdExample() throws ApiException {
        String downloadId = "1";
        Long recvWindow = 5000L;
        ApiResponse<GetUmFuturesOrderDownloadLinkByIdResponse> response =
                getApi().getUmFuturesOrderDownloadLinkById(downloadId, recvWindow);
        System.out.println(response.getData());
    }
}
