package com.binance.connector.client.derivatives_trading_coin_futures.rest.userdatastreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.KeepaliveUserDataStreamResponse;

/** API examples for UserDataStreamsApi */
public class KeepaliveUserDataStreamExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Keepalive User Data Stream (USER_STREAM)
     *
     * <p>Keepalive a user data stream to prevent a time out. User data streams will close after 60
     * minutes. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void keepaliveUserDataStreamExample() throws ApiException {
        ApiResponse<KeepaliveUserDataStreamResponse> response = getApi().keepaliveUserDataStream();
        System.out.println(response.getData());
    }
}
