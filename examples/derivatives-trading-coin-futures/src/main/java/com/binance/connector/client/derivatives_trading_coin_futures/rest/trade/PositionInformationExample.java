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

package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.PositionInformationResponse;

/** API examples for TradeApi */
public class PositionInformationExample {
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
     * Position Information(USER_DATA)
     *
     * <p>Get current account information. * If neither &#x60;marginAsset&#x60; nor &#x60;pair&#x60;
     * is sent, positions of all symbols with &#x60;TRADING&#x60; status will be returned. * for
     * One-way Mode user, the response will only show the \&quot;BOTH\&quot; positions * for Hedge
     * Mode user, the response will show \&quot;BOTH\&quot;, \&quot;LONG\&quot;, and
     * \&quot;SHORT\&quot; positions. Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to
     * meet your timeliness and accuracy needs. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void positionInformationExample() throws ApiException {
        String marginAsset = "";
        String pair = "";
        Long recvWindow = 5000L;
        ApiResponse<PositionInformationResponse> response =
                getApi().positionInformation(marginAsset, pair, recvWindow);
        System.out.println(response.getData());
    }
}
