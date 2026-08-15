package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.GetOrderResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetOrderExample {
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
     * Query order (USER_DATA)
     *
     * <p>Check an order&#39;s status. Weight(IP): 4 Security Type: USER_DATA Notes: **Data
     * Source:** Memory &#x3D;&gt; Database - Either &#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent. - If both &#x60;orderId&#x60; and
     * &#x60;origClientOrderId&#x60; are provided, the &#x60;orderId&#x60; is searched first, then
     * the &#x60;origClientOrderId&#x60; from that result is checked against that order. If both
     * conditions are not met the request will be rejected. - For some historical orders
     * &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this
     * time.
     *
     * @throws ApiException if the Api call fails
     */
    public void getOrderExample() throws ApiException, IOException {
        String symbol = "LTCBTC";
        Long orderId = 1L;
        String origClientOrderId = "myOrder1";
        Double recvWindow = 5000d;
        ApiResponse<GetOrderResponse> response =
                getApi().getOrder(symbol, orderId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
