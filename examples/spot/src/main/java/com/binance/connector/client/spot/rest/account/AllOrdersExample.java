package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.AllOrdersResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class AllOrdersExample {
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
     * All orders (USER_DATA)
     *
     * <p>Get all account orders; active, canceled, or filled. Weight(IP): 20 Security Type:
     * USER_DATA Notes: **Data Source:** Database - If &#x60;orderId&#x60; is set, it will get
     * orders &gt;&#x3D; that &#x60;orderId&#x60;. Otherwise most recent orders are returned. - For
     * some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is
     * not available at this time. - If &#x60;startTime&#x60; and/or &#x60;endTime&#x60; provided,
     * &#x60;orderId&#x60; is not required. - The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can&#39;t be longer than 24 hours.
     *
     * @throws ApiException if the Api call fails
     */
    public void allOrdersExample() throws ApiException, IOException {
        String symbol = "LTCBTC";
        Long orderId = 1L;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Integer limit = 1;
        Double recvWindow = 5000d;
        ApiResponse<AllOrdersResponse> response =
                getApi().allOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
