package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryIndexPriceConstituentsResponse;

/** API examples for MarketDataApi */
public class QueryIndexPriceConstituentsExample {
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
     * Query Index Price Constituents
     *
     * <p>Query index price constituents **Note**: Prices from constituents of TradFi perps will be
     * hiden and displayed as -1. Weight: 2
     *
     * @throws ApiException if the Api call fails
     */
    public void queryIndexPriceConstituentsExample() throws ApiException {
        String symbol = "";
        ApiResponse<QueryIndexPriceConstituentsResponse> response =
                getApi().queryIndexPriceConstituents(symbol);
        System.out.println(response.getData());
    }
}
