package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangePositionModeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangePositionModeResponse;

/** API examples for TradeApi */
public class ChangePositionModeExample {
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
     * Change Position Mode(TRADE)
     *
     * <p>Change user&#39;s position mode (Hedge Mode or One-way Mode ) on ***EVERY symbol***
     * Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void changePositionModeExample() throws ApiException {
        ChangePositionModeRequest changePositionModeRequest = new ChangePositionModeRequest();
        changePositionModeRequest.dualSidePosition("");
        ApiResponse<ChangePositionModeResponse> response =
                getApi().changePositionMode(changePositionModeRequest);
        System.out.println(response.getData());
    }
}
