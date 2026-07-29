package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.QueryCurrentOpenOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryCurrentOpenOrderExample {
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
     * Query Current Open Order (USER_DATA)
     *
     * <p>Query Current Open Order Weight(IP): 1 Security Type: USER_DATA Notes: -
     * Either&#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent - If the queried
     * order has been filled or cancelled, the error message \&quot;Order does not exist\&quot; will
     * be returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCurrentOpenOrderExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        Long orderId = 1L;
        String origClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<QueryCurrentOpenOrderResponse> response =
                getApi().queryCurrentOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
