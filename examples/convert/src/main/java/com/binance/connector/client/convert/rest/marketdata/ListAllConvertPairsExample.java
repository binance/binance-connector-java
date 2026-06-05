package com.binance.connector.client.convert.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.ListAllConvertPairsResponse;

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
     * <p>Query for all convertible token pairs and the tokens’ respective upper/lower limits * User
     * needs to supply either or both of the input parameter * If not defined for both fromAsset and
     * toAsset, only partial token pairs will be returned Weight: 3000(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void listAllConvertPairsExample() throws ApiException {
        String fromAsset = "";
        String toAsset = "";
        ApiResponse<ListAllConvertPairsResponse> response =
                getApi().listAllConvertPairs(fromAsset, toAsset);
        System.out.println(response.getData());
    }
}
