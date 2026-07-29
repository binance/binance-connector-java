package com.binance.connector.client.spot.websocket.api.auth;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.SessionLogonRequest;
import com.binance.connector.client.spot.websocket.api.model.SessionLogonResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AuthApi */
public class SessionLogonExample {
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
     * Log in with API key (USER_DATA)
     *
     * <p>Authenticate WebSocket connection using the provided API key. After calling
     * &#x60;session.logon&#x60;, you can omit &#x60;apiKey&#x60; and &#x60;signature&#x60;
     * parameters for future requests that require them. Note that only one API key can be
     * authenticated. Calling &#x60;session.logon&#x60; multiple times changes the current
     * authenticated API key. **Note:** Only Ed25519 keys are supported for this feature.
     * Weight(IP): 2 Security Type: USER_DATA Notes: **Data Source:** Memory
     */
    public void sessionLogonExampleAsync() {
        SessionLogonRequest sessionLogonRequest = new SessionLogonRequest();
        CompletableFuture<SessionLogonResponse> future = getApi().sessionLogon(sessionLogonRequest);
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
     * Log in with API key (USER_DATA)
     *
     * <p>Authenticate WebSocket connection using the provided API key. After calling
     * &#x60;session.logon&#x60;, you can omit &#x60;apiKey&#x60; and &#x60;signature&#x60;
     * parameters for future requests that require them. Note that only one API key can be
     * authenticated. Calling &#x60;session.logon&#x60; multiple times changes the current
     * authenticated API key. **Note:** Only Ed25519 keys are supported for this feature.
     * Weight(IP): 2 Security Type: USER_DATA Notes: **Data Source:** Memory
     */
    public void sessionLogonExampleSync() {
        SessionLogonRequest sessionLogonRequest = new SessionLogonRequest();
        CompletableFuture<SessionLogonResponse> future = getApi().sessionLogon(sessionLogonRequest);
        SessionLogonResponse response = future.join();
        System.out.println(response);
    }
}
