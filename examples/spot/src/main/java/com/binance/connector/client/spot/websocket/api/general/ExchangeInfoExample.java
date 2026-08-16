package com.binance.connector.client.spot.websocket.api.general;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.ExchangeInfoRequest;
import com.binance.connector.client.spot.websocket.api.model.ExchangeInfoResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for GeneralApi */
public class ExchangeInfoExample {
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
     * Exchange information
     *
     * <p>Query current exchange trading rules, rate limits, and symbol information. Weight(IP): 20
     * Security Type: NONE Notes: **Data Source:** Memory **Notes:** * If the value provided to
     * &#x60;symbol&#x60; or &#x60;symbols&#x60; do not exist, the endpoint will throw an error
     * saying the symbol is invalid. * All parameters are optional. * Only one of
     * &#x60;symbol&#x60;, &#x60;symbols&#x60;, &#x60;permissions&#x60; parameters can be specified.
     * * Without parameters, &#x60;exchangeInfo&#x60; displays all symbols with
     * &#x60;[\&quot;SPOT\&quot;, \&quot;MARGIN\&quot;, \&quot;LEVERAGED\&quot;]&#x60; permissions.
     * * In order to list *all* active symbols on the exchange, you need to explicitly request all
     * permissions. * &#x60;permissions&#x60; accepts either a list of permissions, or a single
     * permission name. E.g. &#x60;\&quot;SPOT\&quot;&#x60;. **Examples of Symbol Permissions
     * Interpretation from the Response:** * &#x60;[[\&quot;A\&quot;,\&quot;B\&quot;]]&#x60; means
     * you may place an order if your account has either permission \&quot;A\&quot; **or**
     * permission \&quot;B\&quot;. * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;]]&#x60; means you can
     * place an order if your account has permission \&quot;A\&quot; **and** permission
     * \&quot;B\&quot;. * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;,\&quot;C\&quot;]]&#x60; means
     * you can place an order if your account has permission \&quot;A\&quot; **and** permission
     * \&quot;B\&quot; or permission \&quot;C\&quot;. (Inclusive or is applied here, not exclusive
     * or, so your account may have both permission \&quot;B\&quot; and permission \&quot;C\&quot;.)
     */
    public void exchangeInfoExampleAsync() {
        ExchangeInfoRequest exchangeInfoRequest = new ExchangeInfoRequest();
        CompletableFuture<ExchangeInfoResponse> future = getApi().exchangeInfo(exchangeInfoRequest);
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
     * Exchange information
     *
     * <p>Query current exchange trading rules, rate limits, and symbol information. Weight(IP): 20
     * Security Type: NONE Notes: **Data Source:** Memory **Notes:** * If the value provided to
     * &#x60;symbol&#x60; or &#x60;symbols&#x60; do not exist, the endpoint will throw an error
     * saying the symbol is invalid. * All parameters are optional. * Only one of
     * &#x60;symbol&#x60;, &#x60;symbols&#x60;, &#x60;permissions&#x60; parameters can be specified.
     * * Without parameters, &#x60;exchangeInfo&#x60; displays all symbols with
     * &#x60;[\&quot;SPOT\&quot;, \&quot;MARGIN\&quot;, \&quot;LEVERAGED\&quot;]&#x60; permissions.
     * * In order to list *all* active symbols on the exchange, you need to explicitly request all
     * permissions. * &#x60;permissions&#x60; accepts either a list of permissions, or a single
     * permission name. E.g. &#x60;\&quot;SPOT\&quot;&#x60;. **Examples of Symbol Permissions
     * Interpretation from the Response:** * &#x60;[[\&quot;A\&quot;,\&quot;B\&quot;]]&#x60; means
     * you may place an order if your account has either permission \&quot;A\&quot; **or**
     * permission \&quot;B\&quot;. * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;]]&#x60; means you can
     * place an order if your account has permission \&quot;A\&quot; **and** permission
     * \&quot;B\&quot;. * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;,\&quot;C\&quot;]]&#x60; means
     * you can place an order if your account has permission \&quot;A\&quot; **and** permission
     * \&quot;B\&quot; or permission \&quot;C\&quot;. (Inclusive or is applied here, not exclusive
     * or, so your account may have both permission \&quot;B\&quot; and permission \&quot;C\&quot;.)
     */
    public void exchangeInfoExampleSync() {
        ExchangeInfoRequest exchangeInfoRequest = new ExchangeInfoRequest();
        CompletableFuture<ExchangeInfoResponse> future = getApi().exchangeInfo(exchangeInfoRequest);
        ExchangeInfoResponse response = future.join();
        System.out.println(response);
    }
}
