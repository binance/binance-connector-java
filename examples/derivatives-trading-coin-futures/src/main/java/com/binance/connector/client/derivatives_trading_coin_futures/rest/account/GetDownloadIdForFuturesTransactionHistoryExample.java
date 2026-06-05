package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetDownloadIdForFuturesTransactionHistoryResponse;

/** API examples for AccountApi */
public class GetDownloadIdForFuturesTransactionHistoryExample {
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
     * Get Download Id For Futures Transaction History(USER_DATA)
     *
     * <p>Get download id for futures transaction history * Request Limitation is 5 times per month,
     * shared by front end download page and rest api * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can not be longer than 1 year Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void getDownloadIdForFuturesTransactionHistoryExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<GetDownloadIdForFuturesTransactionHistoryResponse> response =
                getApi().getDownloadIdForFuturesTransactionHistory(startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
