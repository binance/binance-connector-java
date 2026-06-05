package com.binance.connector.client.margin_trading.rest.riskdatastream;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.KeepaliveUserDataStreamRequest;

/** API examples for RiskDataStreamApi */
public class KeepaliveUserDataStreamExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Keepalive User Data Stream (USER_STREAM)
     *
     * <p>Keepalive a user data stream to prevent a time out. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void keepaliveUserDataStreamExample() throws ApiException {
        KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest =
                new KeepaliveUserDataStreamRequest();
        keepaliveUserDataStreamRequest.listenKey("");
        getApi().keepaliveUserDataStream(keepaliveUserDataStreamRequest);
    }
}
