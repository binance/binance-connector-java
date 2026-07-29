package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetDownloadIdForFuturesTransactionHistoryResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetDownloadIdForFuturesTransactionHistoryExample {
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
     * Get Download Id For Futures Transaction History (USER_DATA)
     *
     * <p>Get download id for futures transaction history Weight(IP): 1000 Security Type: USER_DATA
     * Notes: - Request Limitation is 5 times per month, shared by front end download page and rest
     * api - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not be longer than 1
     * year
     *
     * @throws ApiException if the Api call fails
     */
    public void getDownloadIdForFuturesTransactionHistoryExample()
            throws ApiException, IOException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<GetDownloadIdForFuturesTransactionHistoryResponse> response =
                getApi().getDownloadIdForFuturesTransactionHistory(startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
