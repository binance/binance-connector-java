package com.binance.connector.client.spot.websocket.api.general;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.ExecutionRulesRequest;
import com.binance.connector.client.spot.websocket.api.model.ExecutionRulesResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for GeneralApi */
public class ExecutionRulesExample {
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
     * WebSocket Query Execution Rules
     *
     * <p>Weight: Parameter | Weight| --- | --- &#x60;symbol&#x60; | 2 &#x60;symbols&#x60; | 2 for
     * each &#x60;symbol&#x60;, capped at a max of 40| &#x60;symbolStatus&#x60; |40| None |40|
     */
    public void executionRulesExampleAsync() {
        ExecutionRulesRequest executionRulesRequest = new ExecutionRulesRequest();
        CompletableFuture<ExecutionRulesResponse> future =
                getApi().executionRules(executionRulesRequest);
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
     * WebSocket Query Execution Rules
     *
     * <p>Weight: Parameter | Weight| --- | --- &#x60;symbol&#x60; | 2 &#x60;symbols&#x60; | 2 for
     * each &#x60;symbol&#x60;, capped at a max of 40| &#x60;symbolStatus&#x60; |40| None |40|
     */
    public void executionRulesExampleSync() {
        ExecutionRulesRequest executionRulesRequest = new ExecutionRulesRequest();
        CompletableFuture<ExecutionRulesResponse> future =
                getApi().executionRules(executionRulesRequest);
        ExecutionRulesResponse response = future.join();
        System.out.println(response);
    }
}
