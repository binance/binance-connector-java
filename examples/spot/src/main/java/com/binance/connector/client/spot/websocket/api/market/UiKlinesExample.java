package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.Interval;
import com.binance.connector.client.spot.websocket.api.model.UiKlinesRequest;
import com.binance.connector.client.spot.websocket.api.model.UiKlinesResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class UiKlinesExample {
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
     * UI Klines
     *
     * <p>Get klines (candlestick bars) optimized for presentation. This request is similar to
     * &#x60;klines&#x60;, having the same parameters and response. &#x60;uiKlines&#x60; return
     * modified kline data, optimized for presentation of candlestick charts. Weight(IP): 2 Security
     * Type: NONE Notes: **Data Source:** Database - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, the most recent klines are returned. - Supported values for
     * &#x60;timeZone&#x60;: - Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;) - Only
     * hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;) - Accepted range is strictly [-12:00
     * to +14:00] inclusive - If &#x60;timeZone&#x60; provided, kline intervals are interpreted in
     * that timezone instead of UTC. - Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are
     * always interpreted in UTC, regardless of &#x60;timeZone&#x60;.
     */
    public void uiKlinesExampleAsync() {
        UiKlinesRequest uiKlinesRequest = new UiKlinesRequest();
        uiKlinesRequest.symbol("BNBUSDT");
        uiKlinesRequest.interval(Interval.INTERVAL_1s);
        CompletableFuture<UiKlinesResponse> future = getApi().uiKlines(uiKlinesRequest);
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
     * UI Klines
     *
     * <p>Get klines (candlestick bars) optimized for presentation. This request is similar to
     * &#x60;klines&#x60;, having the same parameters and response. &#x60;uiKlines&#x60; return
     * modified kline data, optimized for presentation of candlestick charts. Weight(IP): 2 Security
     * Type: NONE Notes: **Data Source:** Database - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, the most recent klines are returned. - Supported values for
     * &#x60;timeZone&#x60;: - Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;) - Only
     * hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;) - Accepted range is strictly [-12:00
     * to +14:00] inclusive - If &#x60;timeZone&#x60; provided, kline intervals are interpreted in
     * that timezone instead of UTC. - Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are
     * always interpreted in UTC, regardless of &#x60;timeZone&#x60;.
     */
    public void uiKlinesExampleSync() {
        UiKlinesRequest uiKlinesRequest = new UiKlinesRequest();
        uiKlinesRequest.symbol("BNBUSDT");
        uiKlinesRequest.interval(Interval.INTERVAL_1s);
        CompletableFuture<UiKlinesResponse> future = getApi().uiKlines(uiKlinesRequest);
        UiKlinesResponse response = future.join();
        System.out.println(response);
    }
}
