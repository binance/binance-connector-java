package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AccountTradeListResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class AccountTradeListExample {
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
     * Account Trade List (USER_DATA)
     *
     * <p>Get trades for a specific account and symbol. Weight: **20** with symbol，**40** with pair
     * (after CM migration: **5** flat) Security Type: USER_DATA Notes: - Either symbol or pair must
     * be sent - Symbol and pair cannot be sent together - Pair and fromId cannot be sent together -
     * OrderId can only be sent together with symbol - If a pair is sent,tickers for all symbols of
     * the pair will be returned - The parameter &#x60;fromId&#x60; cannot be sent with
     * &#x60;startTime&#x60; or &#x60;endTime&#x60; - If startTime and endTime are both not sent,
     * then the last 7 days&#39; data will be returned. - The time between startTime and endTime
     * cannot be longer than 7 days.
     *
     * @throws ApiException if the Api call fails
     */
    public void accountTradeListExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200626";
        String pair = "BTCUSD";
        String orderId = "1";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long fromId = 6L;
        Long limit = 30L;
        Long recvWindow = 5000L;
        ApiResponse<AccountTradeListResponse> response =
                getApi().accountTradeList(
                                symbol,
                                pair,
                                orderId,
                                startTime,
                                endTime,
                                fromId,
                                limit,
                                recvWindow);
        System.out.println(response.getData());
    }
}
