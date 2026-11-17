package com.binance.connector.client.margin_trading.rest.userdatastream;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.KeepaliveUserDataStreamV2Request;
import java.io.IOException;

/** API examples for UserDataStreamApi */
public class KeepaliveUserDataStreamV2Example {
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
     * Keepalive User Data Stream V2 (USER_STREAM)
     *
     * <p>Keepalive a user data stream to prevent a time out. Weight(IP): 1 Security Type:
     * USER_STREAM
     *
     * @throws ApiException if the Api call fails
     */
    public void keepaliveUserDataStreamV2Example() throws ApiException, IOException {
        KeepaliveUserDataStreamV2Request keepaliveUserDataStreamV2Request =
                new KeepaliveUserDataStreamV2Request();
        keepaliveUserDataStreamV2Request.listenKey("");
        getApi().keepaliveUserDataStreamV2(keepaliveUserDataStreamV2Request);
    }
}
