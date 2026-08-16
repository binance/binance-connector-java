package com.binance.connector.client.convert.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.ListAllConvertPairsResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class ListAllConvertPairsExample {
    private ConvertRestApi api;

    public ConvertRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = ConvertRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new ConvertRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * List All Convert Pairs
     *
     * <p>Query for all convertible token pairs and the tokens’ respective upper/lower limits
     * Weight(IP): 3000 Notes: - User needs to supply either or both input parameters. - If only one
     * of &#x60;fromAsset&#x60; and &#x60;toAsset&#x60; is provided, only partial token pairs are
     * returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void listAllConvertPairsExample() throws ApiException, IOException {
        String fromAsset = "BTC";
        String toAsset = "USDT";
        ApiResponse<ListAllConvertPairsResponse> response =
                getApi().listAllConvertPairs(fromAsset, toAsset);
        System.out.println(response.getData());
    }
}
