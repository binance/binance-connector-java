package com.binance.connector.client.margin_trading.rest.userdatastream;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.StartUserDataStreamV2Response;
import java.io.IOException;

/** API examples for UserDataStreamApi */
public class StartUserDataStreamV2Example {
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
     * Start User Data Stream V2 (USER_STREAM)
     *
     * <p>Start a new user data stream. Weight(IP): 1 Security Type: USER_STREAM
     *
     * @throws ApiException if the Api call fails
     */
    public void startUserDataStreamV2Example() throws ApiException, IOException {
        ApiResponse<StartUserDataStreamV2Response> response = getApi().startUserDataStreamV2();
        System.out.println(response.getData());
    }
}
