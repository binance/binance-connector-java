package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CancelAlgoOrderResponse;

/** API examples for TradeApi */
public class CancelAlgoOrderExample {
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
     * Cancel Algo Order (TRADE)
     *
     * <p>Cancel an active algo order. * Either &#x60;algoId&#x60; or &#x60;clientAlgoId&#x60; must
     * be sent. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAlgoOrderExample() throws ApiException {
        Long algoId = 1L;
        String clientAlgoId = "1";
        Long recvWindow = 5000L;
        ApiResponse<CancelAlgoOrderResponse> response =
                getApi().cancelAlgoOrder(algoId, clientAlgoId, recvWindow);
        System.out.println(response.getData());
    }
}
