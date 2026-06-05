package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QueryInsuranceFundBalanceSnapshotResponse;

/** API examples for MarketDataApi */
public class QueryInsuranceFundBalanceSnapshotExample {
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
     * Query Insurance Fund Balance Snapshot
     *
     * <p>Query Insurance Fund Balance Snapshot Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void queryInsuranceFundBalanceSnapshotExample() throws ApiException {
        String symbol = "";
        ApiResponse<QueryInsuranceFundBalanceSnapshotResponse> response =
                getApi().queryInsuranceFundBalanceSnapshot(symbol);
        System.out.println(response.getData());
    }
}
