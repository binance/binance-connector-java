package com.binance.connector.client.derivatives_trading_usds_futures.rest.convert;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderStatusResponse;

/** API examples for ConvertApi */
public class OrderStatusExample {
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
     * Order status(USER_DATA)
     *
     * <p>Query order status by order ID. Weight: 50(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void orderStatusExample() throws ApiException {
        Long orderId = 1L;
        String quoteId = "1";
        ApiResponse<OrderStatusResponse> response = getApi().orderStatus(orderId, quoteId);
        System.out.println(response.getData());
    }
}
