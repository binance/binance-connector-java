package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CancelMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderIdList;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrigClientOrderIdList;

/** API examples for TradeApi */
public class CancelMultipleOrdersExample {
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
     * Cancel Multiple Orders (TRADE)
     *
     * <p>Cancel Multiple Orders * Either &#x60;orderIdList&#x60; or &#x60;origClientOrderIdList
     * &#x60; must be sent. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelMultipleOrdersExample() throws ApiException {
        String symbol = "";
        OrderIdList orderIdList = null;
        OrigClientOrderIdList origClientOrderIdList = null;
        Long recvWindow = 5000L;
        ApiResponse<CancelMultipleOrdersResponse> response =
                getApi().cancelMultipleOrders(
                                symbol, orderIdList, origClientOrderIdList, recvWindow);
        System.out.println(response.getData());
    }
}
