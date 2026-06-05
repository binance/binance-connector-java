package com.binance.connector.client.derivatives_trading_usds_futures.rest.convert;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ListAllConvertPairsResponse;

/** API examples for ConvertApi */
public class ListAllConvertPairsExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * List All Convert Pairs
     *
     * <p>Query for all convertible token pairs and the tokens’ respective upper/lower limits * User
     * needs to supply either or both of the input parameter * If not defined for both fromAsset and
     * toAsset, only partial token pairs will be returned * Asset BNFCR is only available to convert
     * for MICA region users. Weight: 20(IP)
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
