package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CompositeIndexSymbolInformationResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class CompositeIndexSymbolInformationExample {
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
     * Composite Index Symbol Information
     *
     * <p>Query composite index symbol information Weight(IP): 1 Notes: - Only for composite index
     * symbols
     *
     * @throws ApiException if the Api call fails
     */
    public void compositeIndexSymbolInformationExample() throws ApiException, IOException {
        String symbol = "DEFIUSDT";
        ApiResponse<CompositeIndexSymbolInformationResponse> response =
                getApi().compositeIndexSymbolInformation(symbol);
        System.out.println(response.getData());
    }
}
