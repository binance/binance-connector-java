package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CancelAlgoOrderResponse;
import java.io.IOException;

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
     * <p>Cancel an active algo (conditional) order, including TP/SL (Take Profit / Stop Loss) and
     * trailing stop orders on USD-M Futures. Weight(IP): 1 Security Type: TRADE Notes: - Either
     * &#x60;algoId&#x60; or &#x60;clientAlgoId&#x60; must be sent.
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAlgoOrderExample() throws ApiException, IOException {
        Long algoId = 2146760L;
        String clientAlgoId = "6B2I9XVcJpCjqPAJ4YoFX7";
        Long recvWindow = 5000L;
        ApiResponse<CancelAlgoOrderResponse> response =
                getApi().cancelAlgoOrder(algoId, clientAlgoId, recvWindow);
        System.out.println(response.getData());
    }
}
