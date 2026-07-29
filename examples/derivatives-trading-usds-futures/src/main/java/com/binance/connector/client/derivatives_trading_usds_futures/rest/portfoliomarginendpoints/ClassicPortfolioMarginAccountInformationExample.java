package com.binance.connector.client.derivatives_trading_usds_futures.rest.portfoliomarginendpoints;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ClassicPortfolioMarginAccountInformationResponse;
import java.io.IOException;

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
     * <p>Get Classic Portfolio Margin current account information. Weight(IP): 5 Security Type:
     * USER_DATA Notes: - maxWithdrawAmount is for asset transfer out to the spot wallet.
     *
     * @throws ApiException if the Api call fails
     */
    public void classicPortfolioMarginAccountInformationExample() throws ApiException, IOException {
        String asset = "BTC";
        Long recvWindow = 5000L;
        ApiResponse<ClassicPortfolioMarginAccountInformationResponse> response =
                getApi().classicPortfolioMarginAccountInformation(asset, recvWindow);
        System.out.println(response.getData());
    }
}
