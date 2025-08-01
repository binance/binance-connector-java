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
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyIsolatedPositionMarginRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ModifyIsolatedPositionMarginResponse;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Type;

/** API examples for TradeApi */
public class ModifyIsolatedPositionMarginExample {
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
     * Modify Isolated Position Margin(TRADE)
     *
     * <p>Modify Isolated Position Margin * Only for isolated symbol Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void modifyIsolatedPositionMarginExample() throws ApiException {
        ModifyIsolatedPositionMarginRequest modifyIsolatedPositionMarginRequest =
                new ModifyIsolatedPositionMarginRequest();
        modifyIsolatedPositionMarginRequest.symbol("");
        modifyIsolatedPositionMarginRequest.amount(1.0d);
        modifyIsolatedPositionMarginRequest.type(Type.LIMIT);
        ApiResponse<ModifyIsolatedPositionMarginResponse> response =
                getApi().modifyIsolatedPositionMargin(modifyIsolatedPositionMarginRequest);
        System.out.println(response.getData());
    }
}
