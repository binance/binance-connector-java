package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CancelAllOpenOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelAllOpenOrdersExample {
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
     * Cancel All Open Orders (TRADE)
     *
     * <p>Cancel All Open Orders Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllOpenOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        Long recvWindow = 5000L;
        ApiResponse<CancelAllOpenOrdersResponse> response =
                getApi().cancelAllOpenOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
