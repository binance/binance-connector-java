package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AccountTradeListResponse;

/** API examples for TradeApi */
public class AccountTradeListExample {
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
     * Account Trade List (USER_DATA)
     *
     * <p>Get trades for a specific account and symbol. * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are both not sent, then the last 7 days&#39; data will be returned. * The
     * time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 7 days. *
     * The parameter &#x60;fromId&#x60; cannot be sent with &#x60;startTime&#x60; or
     * &#x60;endTime&#x60;. * Only support querying trade in the past 6 months Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void accountTradeListExample() throws ApiException {
        String symbol = "";
        Long orderId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long fromId = 1L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<AccountTradeListResponse> response =
                getApi().accountTradeList(
                                symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
