package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.CancelAllOptionOrdersByUnderlyingResponse;

/** API examples for TradeApi */
public class CancelAllOptionOrdersByUnderlyingExample {
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
     * Cancel All Option Orders By Underlying (TRADE)
     *
     * <p>Cancel all active orders on specified underlying. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllOptionOrdersByUnderlyingExample() throws ApiException {
        String underlying = "";
        Long recvWindow = 5000L;
        ApiResponse<CancelAllOptionOrdersByUnderlyingResponse> response =
                getApi().cancelAllOptionOrdersByUnderlying(underlying, recvWindow);
        System.out.println(response.getData());
    }
}
