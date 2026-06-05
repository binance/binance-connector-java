package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.userdatastreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;

/** API examples for UserDataStreamsApi */
public class KeepaliveUserDataStreamExample {
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
     * Keepalive User Data Stream (USER_STREAM)
     *
     * <p>Keepalive a user data stream to prevent a time out. User data streams will close after 60
     * minutes. It&#39;s recommended to send a ping about every 60 minutes. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void keepaliveUserDataStreamExample() throws ApiException {
        getApi().keepaliveUserDataStream();
    }
}
