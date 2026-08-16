package com.binance.connector.client.derivatives_trading_coin_futures.rest.userdatastreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import java.io.IOException;

/** API examples for UserDataStreamsApi */
public class CloseUserDataStreamExample {
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
     * Close User Data Stream (USER_STREAM)
     *
     * <p>Close out a user data stream. Weight(IP): 1 Security Type: USER_STREAM
     *
     * @throws ApiException if the Api call fails
     */
    public void closeUserDataStreamExample() throws ApiException, IOException {
        getApi().closeUserDataStream();
    }
}
