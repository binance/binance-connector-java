package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AutoCloseType;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.UsersForceOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class UsersForceOrdersExample {
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
     * User&#39;s Force Orders (USER_DATA)
     *
     * <p>User&#39;s Force Orders Weight: **20** (after CM migration: **20** with symbol / **50**
     * without symbol) Security Type: USER_DATA Notes: - If \&quot;autoCloseType\&quot; is not sent,
     * orders with both of the types will be returned - Only support querying data in the past 90
     * days
     *
     * @throws ApiException if the Api call fails
     */
    public void usersForceOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        AutoCloseType autoCloseType = AutoCloseType.LIQUIDATION;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 30L;
        Long recvWindow = 5000L;
        ApiResponse<UsersForceOrdersResponse> response =
                getApi().usersForceOrders(
                                symbol, autoCloseType, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
