package com.binance.connector.client.derivatives_trading_usds_futures.rest.portfoliomarginendpoints;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ClassicPortfolioMarginAccountInformationResponse;

/** API examples for PortfolioMarginEndpointsApi */
public class ClassicPortfolioMarginAccountInformationExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Classic Portfolio Margin Account Information (USER_DATA)
     *
     * <p>Get Classic Portfolio Margin current account information. * maxWithdrawAmount is for asset
     * transfer out to the spot wallet. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void classicPortfolioMarginAccountInformationExample() throws ApiException {
        String asset = "";
        Long recvWindow = 5000L;
        ApiResponse<ClassicPortfolioMarginAccountInformationResponse> response =
                getApi().classicPortfolioMarginAccountInformation(asset, recvWindow);
        System.out.println(response.getData());
    }
}
