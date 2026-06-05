package com.binance.connector.client.convert.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.QueryOrderQuantityPrecisionPerAssetResponse;

/** API examples for MarketDataApi */
public class QueryOrderQuantityPrecisionPerAssetExample {
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
     * Query order quantity precision per asset(USER_DATA)
     *
     * <p>Query for supported asset’s precision information Weight: 100(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryOrderQuantityPrecisionPerAssetExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<QueryOrderQuantityPrecisionPerAssetResponse> response =
                getApi().queryOrderQuantityPrecisionPerAsset(recvWindow);
        System.out.println(response.getData());
    }
}
