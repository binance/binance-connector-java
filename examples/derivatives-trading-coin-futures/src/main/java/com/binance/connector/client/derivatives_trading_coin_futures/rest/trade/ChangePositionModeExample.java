package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangePositionModeRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangePositionModeResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class ChangePositionModeExample {
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
     * Change Position Mode (TRADE)
     *
     * <p>Change user&#39;s position mode (Hedge Mode or One-way Mode ) on ***EVERY symbol***.
     * **After CM migration**, UM and CM share the **same** &#x60;dualSidePosition&#x60; setting.
     * Calling this endpoint flips both UM and CM at once. If either side has any open order or open
     * position, the change is rejected: - &#x60;-4067&#x60; (open orders exist) - &#x60;-4068&#x60;
     * (open position exists) Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void changePositionModeExample() throws ApiException, IOException {
        ChangePositionModeRequest changePositionModeRequest = new ChangePositionModeRequest();
        changePositionModeRequest.dualSidePosition("true");
        ApiResponse<ChangePositionModeResponse> response =
                getApi().changePositionMode(changePositionModeRequest);
        System.out.println(response.getData());
    }
}
