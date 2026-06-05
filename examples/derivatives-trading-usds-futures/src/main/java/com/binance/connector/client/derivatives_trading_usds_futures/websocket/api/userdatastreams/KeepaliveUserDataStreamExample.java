package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.userdatastreams;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.KeepaliveUserDataStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.KeepaliveUserDataStreamResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for UserDataStreamsApi */
public class KeepaliveUserDataStreamExample {
    private DerivativesTradingUsdsFuturesWebSocketApi api;

    public DerivativesTradingUsdsFuturesWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Keepalive User Data Stream (USER_STREAM)
     *
     * <p>Keepalive a user data stream to prevent a time out. User data streams will close after 60
     * minutes. It&#39;s recommended to send a ping about every 60 minutes. Weight: 1
     */
    public void keepaliveUserDataStreamExampleAsync() {
        KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest =
                new KeepaliveUserDataStreamRequest();
        CompletableFuture<KeepaliveUserDataStreamResponse> future =
                getApi().keepaliveUserDataStream(keepaliveUserDataStreamRequest);
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
     * Keepalive User Data Stream (USER_STREAM)
     *
     * <p>Keepalive a user data stream to prevent a time out. User data streams will close after 60
     * minutes. It&#39;s recommended to send a ping about every 60 minutes. Weight: 1
     */
    public void keepaliveUserDataStreamExampleSync() {
        KeepaliveUserDataStreamRequest keepaliveUserDataStreamRequest =
                new KeepaliveUserDataStreamRequest();
        CompletableFuture<KeepaliveUserDataStreamResponse> future =
                getApi().keepaliveUserDataStream(keepaliveUserDataStreamRequest);
        KeepaliveUserDataStreamResponse response = future.join();
        System.out.println(response);
    }
}
