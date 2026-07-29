package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.CancelMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OrderIdList;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.OrigClientOrderIdList;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelMultipleOrdersExample {
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
     * Cancel Multiple Orders (TRADE)
     *
     * <p>Cancel Multiple Orders Weight(IP): 1 Security Type: TRADE Notes: - Either
     * &#x60;orderIdList&#x60; or &#x60;origClientOrderIdList &#x60; must be sent.
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelMultipleOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        OrderIdList orderIdList = OrderIdList.fromJson("[1234567,2345678]");
        OrigClientOrderIdList origClientOrderIdList =
                OrigClientOrderIdList.fromJson("[\"my_id_1\",\"my_id_2\"]");
        Long recvWindow = 5000L;
        ApiResponse<CancelMultipleOrdersResponse> response =
                getApi().cancelMultipleOrders(
                                symbol, orderIdList, origClientOrderIdList, recvWindow);
        System.out.println(response.getData());
    }
}
