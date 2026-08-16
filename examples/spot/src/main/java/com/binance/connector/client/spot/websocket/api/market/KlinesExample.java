package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.Interval;
import com.binance.connector.client.spot.websocket.api.model.KlinesRequest;
import com.binance.connector.client.spot.websocket.api.model.KlinesResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class KlinesExample {
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
     * Klines
     *
     * <p>Get klines (candlestick bars). Klines are uniquely identified by their open &amp; close
     * time. If you need access to real-time kline updates, please consider using WebSocket Streams:
     * * &#x60;&lt;symbol&gt;@kline_&lt;interval&gt;&#x60; If you need historical kline data, please
     * consider using [data.binance.vision](https://github.com/binance/binance-public-data/#klines).
     * Weight(IP): 2 Security Type: NONE Notes: **Data Source:** Database Supported kline intervals
     * (case-sensitive): Interval | &#x60;interval&#x60; value --------- | ---------------- seconds
     * | &#x60;1s&#x60; minutes | &#x60;1m&#x60;, &#x60;3m&#x60;, &#x60;5m&#x60;, &#x60;15m&#x60;,
     * &#x60;30m&#x60; hours | &#x60;1h&#x60;, &#x60;2h&#x60;, &#x60;4h&#x60;, &#x60;6h&#x60;,
     * &#x60;8h&#x60;, &#x60;12h&#x60; days | &#x60;1d&#x60;, &#x60;3d&#x60; weeks | &#x60;1w&#x60;
     * months | &#x60;1M&#x60; **Notes:** * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not
     * sent, the most recent klines are returned. * Supported values for &#x60;timeZone&#x60;: *
     * Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;) * Only hours (e.g.
     * &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;) * Accepted range is strictly [-12:00 to +14:00]
     * inclusive * If &#x60;timeZone&#x60; provided, kline intervals are interpreted in that
     * timezone instead of UTC. * Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are always
     * interpreted in UTC, regardless of &#x60;timeZone&#x60;.
     */
    public void klinesExampleAsync() {
        KlinesRequest klinesRequest = new KlinesRequest();
        klinesRequest.symbol("BNBUSDT");
        klinesRequest.interval(Interval.INTERVAL_1s);
        CompletableFuture<KlinesResponse> future = getApi().klines(klinesRequest);
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
     * Klines
     *
     * <p>Get klines (candlestick bars). Klines are uniquely identified by their open &amp; close
     * time. If you need access to real-time kline updates, please consider using WebSocket Streams:
     * * &#x60;&lt;symbol&gt;@kline_&lt;interval&gt;&#x60; If you need historical kline data, please
     * consider using [data.binance.vision](https://github.com/binance/binance-public-data/#klines).
     * Weight(IP): 2 Security Type: NONE Notes: **Data Source:** Database Supported kline intervals
     * (case-sensitive): Interval | &#x60;interval&#x60; value --------- | ---------------- seconds
     * | &#x60;1s&#x60; minutes | &#x60;1m&#x60;, &#x60;3m&#x60;, &#x60;5m&#x60;, &#x60;15m&#x60;,
     * &#x60;30m&#x60; hours | &#x60;1h&#x60;, &#x60;2h&#x60;, &#x60;4h&#x60;, &#x60;6h&#x60;,
     * &#x60;8h&#x60;, &#x60;12h&#x60; days | &#x60;1d&#x60;, &#x60;3d&#x60; weeks | &#x60;1w&#x60;
     * months | &#x60;1M&#x60; **Notes:** * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not
     * sent, the most recent klines are returned. * Supported values for &#x60;timeZone&#x60;: *
     * Hours and minutes (e.g. &#x60;-1:00&#x60;, &#x60;05:45&#x60;) * Only hours (e.g.
     * &#x60;0&#x60;, &#x60;8&#x60;, &#x60;4&#x60;) * Accepted range is strictly [-12:00 to +14:00]
     * inclusive * If &#x60;timeZone&#x60; provided, kline intervals are interpreted in that
     * timezone instead of UTC. * Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are always
     * interpreted in UTC, regardless of &#x60;timeZone&#x60;.
     */
    public void klinesExampleSync() {
        KlinesRequest klinesRequest = new KlinesRequest();
        klinesRequest.symbol("BNBUSDT");
        klinesRequest.interval(Interval.INTERVAL_1s);
        CompletableFuture<KlinesResponse> future = getApi().klines(klinesRequest);
        KlinesResponse response = future.join();
        System.out.println(response);
    }
}
