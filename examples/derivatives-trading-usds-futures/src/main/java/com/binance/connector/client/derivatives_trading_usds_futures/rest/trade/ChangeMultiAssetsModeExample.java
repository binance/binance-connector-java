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

package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMultiAssetsModeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMultiAssetsModeResponse;

/** API examples for TradeApi */
public class ChangeMultiAssetsModeExample {
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
     * Change Multi-Assets Mode (TRADE)
     *
     * <p>Change user&#39;s Multi-Assets mode (Multi-Assets Mode or Single-Asset Mode) on ***Every
     * symbol*** Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void changeMultiAssetsModeExample() throws ApiException {
        ChangeMultiAssetsModeRequest changeMultiAssetsModeRequest =
                new ChangeMultiAssetsModeRequest();
        changeMultiAssetsModeRequest.multiAssetsMargin("");
        ApiResponse<ChangeMultiAssetsModeResponse> response =
                getApi().changeMultiAssetsMode(changeMultiAssetsModeRequest);
        System.out.println(response.getData());
    }
}
