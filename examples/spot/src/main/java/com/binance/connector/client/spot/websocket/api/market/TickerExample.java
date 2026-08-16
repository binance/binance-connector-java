package com.binance.connector.client.spot.websocket.api.market;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.TickerRequest;
import com.binance.connector.client.spot.websocket.api.model.TickerResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketApi */
public class TickerExample {
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
     * Rolling window price change statistics
     *
     * <p>Get rolling window price change statistics with a custom window. This request is similar
     * to &#x60;ticker.24hr&#x60; but statistics are computed on demand using the arbitrary window
     * you specify. **Note:** Window size precision is limited to 1 minute. While the
     * &#x60;closeTime&#x60; is the current time of the request, &#x60;openTime&#x60; always start
     * on a minute boundary. As such, the effective window might be up to 59999 ms wider than the
     * requested &#x60;windowSize&#x60;. &lt;details&gt; &lt;summary&gt;Window computation
     * example&lt;/summary&gt; For example, a request for &#x60;\&quot;windowSize\&quot;:
     * \&quot;7d\&quot;&#x60; might result in the following window: &#x60;&#x60;&#x60;javascript {
     * \&quot;openTime\&quot;: 1659580020000, \&quot;closeTime\&quot;: 1660184865291 }
     * &#x60;&#x60;&#x60; Time of the request – &#x60;closeTime&#x60; – is 1660184865291 (August 11,
     * 2022 02:27:45.291). Requested window size should put the &#x60;openTime&#x60; 7 days before
     * that – August 4, 02:27:45.291 – but due to limited precision it ends up a bit earlier:
     * 1659580020000 (August 4, 2022 02:27:00), exactly at the start of a minute. &lt;/details&gt;
     * If you need to continuously monitor trading statistics, please consider using WebSocket
     * Streams: * &#x60;&lt;symbol&gt;@ticker_&lt;window_size&gt;&#x60; or
     * &#x60;!ticker_&lt;window-size&gt;@arr&#x60; Weight: Adjusted based on the number of requested
     * symbols: | Symbols | Weight | |:-------:|:------:| | 1–50 | 4 per symbol | | 51–100 | 200 |
     * Security Type: NONE Notes: **Data Source:** Database Supported window sizes: Unit |
     * &#x60;windowSize&#x60; value ------- | ------------------ minutes | &#x60;1m&#x60;,
     * &#x60;2m&#x60; ... &#x60;59m&#x60; hours | &#x60;1h&#x60;, &#x60;2h&#x60; ... &#x60;23h&#x60;
     * days | &#x60;1d&#x60;, &#x60;2d&#x60; ... &#x60;7d&#x60; Notes: * Either &#x60;symbol&#x60;
     * or &#x60;symbols&#x60; must be specified. * Maximum number of symbols in one request: 200. *
     * Window size units cannot be combined. E.g., &lt;code&gt;1d 2h&lt;/code&gt; is not supported.
     */
    public void tickerExampleAsync() {
        TickerRequest tickerRequest = new TickerRequest();
        CompletableFuture<TickerResponse> future = getApi().ticker(tickerRequest);
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
     * Rolling window price change statistics
     *
     * <p>Get rolling window price change statistics with a custom window. This request is similar
     * to &#x60;ticker.24hr&#x60; but statistics are computed on demand using the arbitrary window
     * you specify. **Note:** Window size precision is limited to 1 minute. While the
     * &#x60;closeTime&#x60; is the current time of the request, &#x60;openTime&#x60; always start
     * on a minute boundary. As such, the effective window might be up to 59999 ms wider than the
     * requested &#x60;windowSize&#x60;. &lt;details&gt; &lt;summary&gt;Window computation
     * example&lt;/summary&gt; For example, a request for &#x60;\&quot;windowSize\&quot;:
     * \&quot;7d\&quot;&#x60; might result in the following window: &#x60;&#x60;&#x60;javascript {
     * \&quot;openTime\&quot;: 1659580020000, \&quot;closeTime\&quot;: 1660184865291 }
     * &#x60;&#x60;&#x60; Time of the request – &#x60;closeTime&#x60; – is 1660184865291 (August 11,
     * 2022 02:27:45.291). Requested window size should put the &#x60;openTime&#x60; 7 days before
     * that – August 4, 02:27:45.291 – but due to limited precision it ends up a bit earlier:
     * 1659580020000 (August 4, 2022 02:27:00), exactly at the start of a minute. &lt;/details&gt;
     * If you need to continuously monitor trading statistics, please consider using WebSocket
     * Streams: * &#x60;&lt;symbol&gt;@ticker_&lt;window_size&gt;&#x60; or
     * &#x60;!ticker_&lt;window-size&gt;@arr&#x60; Weight: Adjusted based on the number of requested
     * symbols: | Symbols | Weight | |:-------:|:------:| | 1–50 | 4 per symbol | | 51–100 | 200 |
     * Security Type: NONE Notes: **Data Source:** Database Supported window sizes: Unit |
     * &#x60;windowSize&#x60; value ------- | ------------------ minutes | &#x60;1m&#x60;,
     * &#x60;2m&#x60; ... &#x60;59m&#x60; hours | &#x60;1h&#x60;, &#x60;2h&#x60; ... &#x60;23h&#x60;
     * days | &#x60;1d&#x60;, &#x60;2d&#x60; ... &#x60;7d&#x60; Notes: * Either &#x60;symbol&#x60;
     * or &#x60;symbols&#x60; must be specified. * Maximum number of symbols in one request: 200. *
     * Window size units cannot be combined. E.g., &lt;code&gt;1d 2h&lt;/code&gt; is not supported.
     */
    public void tickerExampleSync() {
        TickerRequest tickerRequest = new TickerRequest();
        CompletableFuture<TickerResponse> future = getApi().ticker(tickerRequest);
        TickerResponse response = future.join();
        System.out.println(response);
    }
}
