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

package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersStatusResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class OpenOrdersStatusExample {
    private SpotWebSocketApi api;

    public SpotWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * WebSocket Current open orders
     *
     * <p>Query execution status of all open orders. If you need to continuously monitor order
     * status updates, please consider using WebSocket Streams: * &#x60;userDataStream.start&#x60;
     * request * &#x60;executionReport&#x60; user data stream event Weight: Adjusted based on the
     * number of requested symbols: | Parameter | Weight | | --------- | ------ | |
     * &#x60;symbol&#x60; | 6 | | none | 80 |
     */
    public void openOrdersStatusExampleAsync() {
        OpenOrdersStatusRequest openOrdersStatusRequest = new OpenOrdersStatusRequest();
        CompletableFuture<OpenOrdersStatusResponse> future =
                getApi().openOrdersStatus(openOrdersStatusRequest);
        future.handle(
                (response, error) -> {
                    if (error != null) {
                        System.err.println(error);
                    }
                    System.out.println(response);
                    return response;
                });
    }

    /**
     * WebSocket Current open orders
     *
     * <p>Query execution status of all open orders. If you need to continuously monitor order
     * status updates, please consider using WebSocket Streams: * &#x60;userDataStream.start&#x60;
     * request * &#x60;executionReport&#x60; user data stream event Weight: Adjusted based on the
     * number of requested symbols: | Parameter | Weight | | --------- | ------ | |
     * &#x60;symbol&#x60; | 6 | | none | 80 |
     */
    public void openOrdersStatusExampleSync() {
        OpenOrdersStatusRequest openOrdersStatusRequest = new OpenOrdersStatusRequest();
        CompletableFuture<OpenOrdersStatusResponse> future =
                getApi().openOrdersStatus(openOrdersStatusRequest);
        OpenOrdersStatusResponse response = future.join();
        System.out.println(response);
    }
}
