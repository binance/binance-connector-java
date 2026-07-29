package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeInitialLeverageResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class ChangeInitialLeverageExample {
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
     * Change Initial Leverage (TRADE)
     *
     * <p>Change user&#39;s initial leverage of specific symbol market. Weight(IP): 1 Security Type:
     * TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void changeInitialLeverageExample() throws ApiException, IOException {
        ChangeInitialLeverageRequest changeInitialLeverageRequest =
                new ChangeInitialLeverageRequest();
        changeInitialLeverageRequest.symbol("BTCUSDT");
        changeInitialLeverageRequest.leverage(1L);
        ApiResponse<ChangeInitialLeverageResponse> response =
                getApi().changeInitialLeverage(changeInitialLeverageRequest);
        System.out.println(response.getData());
    }
}
