package com.binance.connector.client.derivatives_trading_usds_futures.rest.userdatastreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.StartUserDataStreamResponse;

/** API examples for UserDataStreamsApi */
public class StartUserDataStreamExample {
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
     * Start User Data Stream (USER_STREAM)
     *
     * <p>Start a new user data stream. The stream will close after 60 minutes unless a keepalive is
     * sent. If the account has an active &#x60;listenKey&#x60;, that &#x60;listenKey&#x60; will be
     * returned and its validity will be extended for 60 minutes. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void startUserDataStreamExample() throws ApiException {
        ApiResponse<StartUserDataStreamResponse> response = getApi().startUserDataStream();
        System.out.println(response.getData());
    }
}
