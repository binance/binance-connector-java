package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetCurrentPositionModeResponse;

/** API examples for AccountApi */
public class GetCurrentPositionModeExample {
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
     * Get Current Position Mode(USER_DATA)
     *
     * <p>Get user&#39;s position mode (Hedge Mode or One-way Mode ) on ***EVERY symbol*** Weight:
     * 30
     *
     * @throws ApiException if the Api call fails
     */
    public void getCurrentPositionModeExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetCurrentPositionModeResponse> response =
                getApi().getCurrentPositionMode(recvWindow);
        System.out.println(response.getData());
    }
}
