package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.MultiAssetsModeAssetIndexResponse;

/** API examples for MarketDataApi */
public class MultiAssetsModeAssetIndexExample {
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
     * Multi-Assets Mode Asset Index
     *
     * <p>asset index for Multi-Assets mode Weight: 1 for a single symbol; 10 when the symbol
     * parameter is omitted
     *
     * @throws ApiException if the Api call fails
     */
    public void multiAssetsModeAssetIndexExample() throws ApiException {
        String symbol = "";
        ApiResponse<MultiAssetsModeAssetIndexResponse> response =
                getApi().multiAssetsModeAssetIndex(symbol);
        System.out.println(response.getData());
    }
}
