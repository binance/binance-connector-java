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

package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossIsolatedMarginCapitalFlowResponse;

/** API examples for AccountApi */
public class QueryCrossIsolatedMarginCapitalFlowExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Cross Isolated Margin Capital Flow (USER_DATA)
     *
     * <p>Query Cross Isolated Margin Capital Flow Weight: 100(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCrossIsolatedMarginCapitalFlowExample() throws ApiException {
        String asset = "";
        String symbol = "";
        String type = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long fromId = 1L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryCrossIsolatedMarginCapitalFlowResponse> response =
                getApi().queryCrossIsolatedMarginCapitalFlow(
                                asset, symbol, type, startTime, endTime, fromId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
