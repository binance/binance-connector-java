package com.binance.connector.client.margin_trading.rest.riskdatastream;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;

/** API examples for RiskDataStreamApi */
public class CloseUserDataStreamExample {
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
     * Close User Data Stream (USER_STREAM)
     *
     * <p>Close out a user data stream. Weight: 3000
     *
     * @throws ApiException if the Api call fails
     */
    public void closeUserDataStreamExample() throws ApiException {
        getApi().closeUserDataStream();
    }
}
