package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.BlockTradesHistoricalRequest;
import com.binance.connector.client.spot.websocket.api.model.BlockTradesHistoricalResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class BlockTradesHistoricalExample {
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
     * Historical Block Trades
     *
     * <p>Get block trades. Weight(IP): 25 Security Type: NONE Notes: - Data Source: Database
     */
    public void blockTradesHistoricalExampleAsync() {
        BlockTradesHistoricalRequest blockTradesHistoricalRequest =
                new BlockTradesHistoricalRequest();
        blockTradesHistoricalRequest.symbol("BNBBTC");
        blockTradesHistoricalRequest.fromId(582L);
        CompletableFuture<BlockTradesHistoricalResponse> future =
                getApi().blockTradesHistorical(blockTradesHistoricalRequest);
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
     * Historical Block Trades
     *
     * <p>Get block trades. Weight(IP): 25 Security Type: NONE Notes: - Data Source: Database
     */
    public void blockTradesHistoricalExampleSync() {
        BlockTradesHistoricalRequest blockTradesHistoricalRequest =
                new BlockTradesHistoricalRequest();
        blockTradesHistoricalRequest.symbol("BNBBTC");
        blockTradesHistoricalRequest.fromId(582L);
        CompletableFuture<BlockTradesHistoricalResponse> future =
                getApi().blockTradesHistorical(blockTradesHistoricalRequest);
        BlockTradesHistoricalResponse response = future.join();
        System.out.println(response);
    }
}
