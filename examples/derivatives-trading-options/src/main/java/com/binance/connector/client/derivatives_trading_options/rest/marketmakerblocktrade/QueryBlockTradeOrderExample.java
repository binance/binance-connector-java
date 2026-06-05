package com.binance.connector.client.derivatives_trading_options.rest.marketmakerblocktrade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryBlockTradeOrderResponse;

/** API examples for MarketMakerBlockTradeApi */
public class QueryBlockTradeOrderExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Block Trade Order (TRADE)
     *
     * <p>Check block trade order status. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void queryBlockTradeOrderExample() throws ApiException {
        String blockOrderMatchingKey = "";
        Long endTime = 1641782889000L;
        Long startTime = 1623319461670L;
        String underlying = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryBlockTradeOrderResponse> response =
                getApi().queryBlockTradeOrder(
                                blockOrderMatchingKey, endTime, startTime, underlying, recvWindow);
        System.out.println(response.getData());
    }
}
