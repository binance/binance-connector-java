package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangeInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ChangeInitialLeverageResponse;

/** API examples for TradeApi */
public class ChangeInitialLeverageExample {
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
     * Change Initial Leverage (TRADE)
     *
     * <p>Change user&#39;s initial leverage in the specific symbol market. For Hedge Mode, LONG and
     * SHORT positions of one symbol use the same initial leverage and share a total notional value.
     * Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void changeInitialLeverageExample() throws ApiException {
        ChangeInitialLeverageRequest changeInitialLeverageRequest =
                new ChangeInitialLeverageRequest();
        changeInitialLeverageRequest.symbol("");
        changeInitialLeverageRequest.leverage(0L);
        ApiResponse<ChangeInitialLeverageResponse> response =
                getApi().changeInitialLeverage(changeInitialLeverageRequest);
        System.out.println(response.getData());
    }
}
