package com.binance.connector.client.alpha.rest.marketdata;

import com.binance.connector.client.alpha.rest.AlphaRestApiUtil;
import com.binance.connector.client.alpha.rest.api.AlphaRestApi;
import com.binance.connector.client.alpha.rest.model.FullDepthResponse;
import com.binance.connector.client.alpha.rest.model.Limit;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for MarketDataApi */
public class FullDepthExample {
    private AlphaRestApi api;

    public AlphaRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = AlphaRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AlphaRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Full Depth
     *
     * <p>Fetches the full order book depth (UI &amp; API orders) for a symbol, including bid and
     * ask orders with their prices and quantities.
     *
     * @throws ApiException if the Api call fails
     */
    public void fullDepthExample() throws ApiException, IOException {
        String symbol = "ALPHA_175USDT";
        Limit limit = Limit.LIMIT_5;
        ApiResponse<FullDepthResponse> response = getApi().fullDepth(symbol, limit);
        System.out.println(response.getData());
    }
}
