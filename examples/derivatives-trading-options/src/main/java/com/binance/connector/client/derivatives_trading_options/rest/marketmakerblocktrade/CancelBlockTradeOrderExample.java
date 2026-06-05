package com.binance.connector.client.derivatives_trading_options.rest.marketmakerblocktrade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;

/** API examples for MarketMakerBlockTradeApi */
public class CancelBlockTradeOrderExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Cancel Block Trade Order (TRADE)
     *
     * <p>Cancel a block trade order. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelBlockTradeOrderExample() throws ApiException {
        String blockOrderMatchingKey = "";
        Long recvWindow = 5000L;
        getApi().cancelBlockTradeOrder(blockOrderMatchingKey, recvWindow);
    }
}
