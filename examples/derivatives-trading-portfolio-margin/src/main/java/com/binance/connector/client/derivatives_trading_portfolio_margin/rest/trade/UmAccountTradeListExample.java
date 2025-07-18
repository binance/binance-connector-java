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

package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.UmAccountTradeListResponse;

/** API examples for TradeApi */
public class UmAccountTradeListExample {
    private DerivativesTradingPortfolioMarginRestApi api;

    public DerivativesTradingPortfolioMarginRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * UM Account Trade List(USER_DATA)
     *
     * <p>Get trades for a specific account and UM symbol. * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are both not sent, then the last &#39;7 days&#39; data will be returned.
     * * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 7
     * days. * The parameter &#x60;fromId&#x60; cannot be sent with &#x60;startTime&#x60; or
     * &#x60;endTime&#x60;. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void umAccountTradeListExample() throws ApiException {
        String symbol = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long fromId = 1L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<UmAccountTradeListResponse> response =
                getApi().umAccountTradeList(symbol, startTime, endTime, fromId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
