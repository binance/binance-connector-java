package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.BatchOrders;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyMultipleOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class ModifyMultipleOrdersExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Modify Multiple Orders (TRADE)
     *
     * <p>Modify Multiple Orders Weight(IP): 5 Security Type: TRADE Notes: - Parameter rules are
     * same with &#x60;Modify Order&#x60; - Batch modify orders are processed concurrently, and the
     * order of matching is not guaranteed. - The order of returned contents for batch modify orders
     * is the same as the order of the order list. - One order can only be modfied for less than
     * 10000 times - &#x60;modifyId&#x60; is an optional user-defined identifier passed through
     * as-is; the server does not validate its uniqueness. If omitted, it is not included in the
     * response.
     *
     * @throws ApiException if the Api call fails
     */
    public void modifyMultipleOrdersExample() throws ApiException, IOException {
        ModifyMultipleOrdersRequest modifyMultipleOrdersRequest = new ModifyMultipleOrdersRequest();
        modifyMultipleOrdersRequest.batchOrders(new BatchOrders());
        ApiResponse<ModifyMultipleOrdersResponse> response =
                getApi().modifyMultipleOrders(modifyMultipleOrdersRequest);
        System.out.println(response.getData());
    }
}
