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

package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.MarginManualLiquidationRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginManualLiquidationResponse;

/** API examples for TradeApi */
public class MarginManualLiquidationExample {
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
     * Margin Manual Liquidation(MARGIN)
     *
     * <p>Margin Manual Liquidation * This endpoint can support Cross Margin Classic Mode and Pro
     * Mode. * And only support Isolated Margin for restricted region. Weight: 3000
     *
     * @throws ApiException if the Api call fails
     */
    public void marginManualLiquidationExample() throws ApiException {
        MarginManualLiquidationRequest marginManualLiquidationRequest =
                new MarginManualLiquidationRequest();
        marginManualLiquidationRequest.type("");
        ApiResponse<MarginManualLiquidationResponse> response =
                getApi().marginManualLiquidation(marginManualLiquidationRequest);
        System.out.println(response.getData());
    }
}
