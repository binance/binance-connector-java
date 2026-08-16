package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.GetTradesResponse;
import java.io.IOException;

/** API examples for MarketApi */
public class GetTradesExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Recent trades list
     *
     * <p>Get recent trades. Weight(IP): 25 Security Type: NONE Notes: **Data Source:** Memory
     *
     * @throws ApiException if the Api call fails
     */
    public void getTradesExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Integer limit = 1;
        ApiResponse<GetTradesResponse> response = getApi().getTrades(symbol, limit);
        System.out.println(response.getData());
    }
}
