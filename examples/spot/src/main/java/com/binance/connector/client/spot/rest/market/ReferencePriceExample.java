package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.ReferencePriceResponse;
import java.io.IOException;

/** API examples for MarketApi */
public class ReferencePriceExample {
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
     * Query Reference Price
     *
     * <p>Query the reference price for a symbol. Weight(IP): 2 Security Type: NONE Notes: **Data
     * Source:** Memory If the symbol has never had a reference price set, the request is rejected
     * with: &#x60;&#x60;&#x60;json { \&quot;code\&quot;: -2043, \&quot;msg\&quot;: \&quot;This
     * symbol doesn&#39;t have a reference price.\&quot; } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void referencePriceExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        ApiResponse<ReferencePriceResponse> response = getApi().referencePrice(symbol);
        System.out.println(response.getData());
    }
}
