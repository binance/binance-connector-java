package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.BatchOrders;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyMultipleOrdersResponse;

/** API examples for TradeApi */
public class ModifyMultipleOrdersExample {
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
     * Modify Multiple Orders(TRADE)
     *
     * <p>Modify Multiple Orders (TRADE) * Parameter rules are same with &#x60;Modify Order&#x60; *
     * Batch modify orders are processed concurrently, and the order of matching is not guaranteed.
     * * The order of returned contents for batch modify orders is the same as the order of the
     * order list. * One order can only be modfied for less than 10000 times Weight: 5 on 10s order
     * rate limit(X-MBX-ORDER-COUNT-10S); 1 on 1min order rate limit(X-MBX-ORDER-COUNT-1M); 5 on IP
     * rate limit(x-mbx-used-weight-1m);
     *
     * @throws ApiException if the Api call fails
     */
    public void modifyMultipleOrdersExample() throws ApiException {
        ModifyMultipleOrdersRequest modifyMultipleOrdersRequest = new ModifyMultipleOrdersRequest();
        modifyMultipleOrdersRequest.batchOrders(new BatchOrders());
        ApiResponse<ModifyMultipleOrdersResponse> response =
                getApi().modifyMultipleOrders(modifyMultipleOrdersRequest);
        System.out.println(response.getData());
    }
}
