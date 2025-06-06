/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetDownloadIdForFuturesTradeHistoryResponse;

/** API examples for AccountApi */
public class GetDownloadIdForFuturesTradeHistoryExample {
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
     * Get Download Id For Futures Trade History (USER_DATA)
     *
     * <p>Get download id for futures trade history * Request Limitation is 5 times per month,
     * shared by front end download page and rest api * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can not be longer than 1 year Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void getDownloadIdForFuturesTradeHistoryExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<GetDownloadIdForFuturesTradeHistoryResponse> response =
                getApi().getDownloadIdForFuturesTradeHistory(startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
