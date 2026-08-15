package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.MyTradesResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class MyTradesExample {
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
     * Account trade list (USER_DATA)
     *
     * <p>Get trades for a specific account and symbol. Weight: Condition| Weight| ---| --- |Without
     * orderId|20| |With orderId|5| Security Type: USER_DATA Notes: **Data Source:** Memory
     * &#x3D;&gt; Database **Notes:**: - If &#x60;fromId&#x60; is set, it will get trades &gt;&#x3D;
     * that &#x60;fromId&#x60;. Otherwise most recent trades are returned. - The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24 hours. - These are
     * the supported combinations of all parameters: - &#x60;symbol&#x60; - &#x60;symbol&#x60; +
     * &#x60;orderId&#x60; - &#x60;symbol&#x60; + &#x60;startTime&#x60; - &#x60;symbol&#x60; +
     * &#x60;endTime&#x60; - &#x60;symbol&#x60; + &#x60;fromId&#x60; - &#x60;symbol&#x60; +
     * &#x60;startTime&#x60; + &#x60;endTime&#x60; - &#x60;symbol&#x60;+ &#x60;orderId&#x60; +
     * &#x60;fromId&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void myTradesExample() throws ApiException, IOException {
        String symbol = "BNBBTC";
        Long orderId = 100234L;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Long fromId = 1L;
        Integer limit = 1;
        Double recvWindow = 5000d;
        ApiResponse<MyTradesResponse> response =
                getApi().myTrades(symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
