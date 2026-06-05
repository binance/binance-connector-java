package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AutoCancelAllOpenOrdersRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AutoCancelAllOpenOrdersResponse;

/** API examples for TradeApi */
public class AutoCancelAllOpenOrdersExample {
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
     * Auto-Cancel All Open Orders (TRADE)
     *
     * <p>Cancel all open orders of the specified symbol at the end of the specified countdown. The
     * endpoint should be called repeatedly as heartbeats so that the existing countdown time can be
     * canceled and replaced by a new one. * Example usage: Call this endpoint at 30s intervals with
     * an countdownTime of 120000 (120s). If this endpoint is not called within 120 seconds, all
     * your orders of the specified symbol will be automatically canceled. If this endpoint is
     * called with an countdownTime of 0, the countdown timer will be stopped. The system will check
     * all countdowns **approximately every 10 milliseconds**, so please note that sufficient
     * redundancy should be considered when using this function. We do not recommend setting the
     * countdown time to be too precise or too small. Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void autoCancelAllOpenOrdersExample() throws ApiException {
        AutoCancelAllOpenOrdersRequest autoCancelAllOpenOrdersRequest =
                new AutoCancelAllOpenOrdersRequest();
        autoCancelAllOpenOrdersRequest.symbol("");
        autoCancelAllOpenOrdersRequest.countdownTime(0L);
        ApiResponse<AutoCancelAllOpenOrdersResponse> response =
                getApi().autoCancelAllOpenOrders(autoCancelAllOpenOrdersRequest);
        System.out.println(response.getData());
    }
}
