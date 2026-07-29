package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.Interval;
import com.binance.connector.client.spot.rest.model.UiKlinesResponse;
import java.io.IOException;

/** API examples for MarketApi */
public class UiKlinesExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * UIKlines
     *
     * <p>The request is similar to klines having the same parameters and response.
     * &#x60;uiKlines&#x60; return modified kline data, optimized for presentation of candlestick
     * charts. Weight(IP): 2 Security Type: NONE Notes: **Data Source:** Database - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the most recent klines are
     * returned. - Supported values for &#x60;timeZone&#x60;: - Hours and minutes (e.g.
     * &#x60;-1:00&#x60;, &#x60;05:45&#x60;) - Only hours (e.g. &#x60;0&#x60;, &#x60;8&#x60;,
     * &#x60;4&#x60;) - Accepted range is strictly [-12:00 to +14:00] inclusive - If
     * &#x60;timeZone&#x60; provided, kline intervals are interpreted in that timezone instead of
     * UTC. - Note that &#x60;startTime&#x60; and &#x60;endTime&#x60; are always interpreted in UTC,
     * regardless of &#x60;timeZone&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void uiKlinesExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Interval interval = Interval.INTERVAL_1s;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        String timeZone = "0";
        Integer limit = 1;
        ApiResponse<UiKlinesResponse> response =
                getApi().uiKlines(symbol, interval, startTime, endTime, timeZone, limit);
        System.out.println(response.getData());
    }
}
