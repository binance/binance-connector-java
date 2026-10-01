package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.CancelRestrictions;
import com.binance.connector.client.spot.rest.model.DeleteOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class DeleteOrderExample {
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
     * Cancel order (TRADE)
     *
     * <p>Cancel an active order. Weight(IP): 1 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine - Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. -
     * If both &#x60;orderId&#x60; and &#x60;origClientOrderId&#x60; are provided, the
     * &#x60;orderId&#x60; is searched first, then the &#x60;origClientOrderId&#x60; from that
     * result is checked against that order. If both conditions are not met the request will be
     * rejected. Response Notes: **Notes:** - The payload above does not show all fields that can
     * appear in the order response. Please refer to Conditional fields in Order Responses. - The
     * performance for canceling an order (single cancel or as part of a cancel-replace) is always
     * better when only &#x60;orderId&#x60; is sent. Sending &#x60;origClientOrderId&#x60; or both
     * &#x60;orderId&#x60; + &#x60;origClientOrderId&#x60; will be slower. **Regarding
     * &#x60;cancelRestrictions&#x60;** * If the &#x60;cancelRestrictions&#x60; value is not any of
     * the supported values, the error will be: &#x60;&#x60;&#x60;json { \&quot;code\&quot;: -1145,
     * \&quot;msg\&quot;: \&quot;Invalid cancelRestrictions\&quot; } &#x60;&#x60;&#x60; * If the
     * order did not pass the conditions for &#x60;cancelRestrictions&#x60;, the error will be:
     * &#x60;&#x60;&#x60;json { \&quot;code\&quot;: -2011, \&quot;msg\&quot;: \&quot;Order was not
     * canceled due to cancel restrictions.\&quot; } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void deleteOrderExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Long orderId = 1L;
        String origClientOrderId = "myOrder1";
        String newClientOrderId = "cancelMyOrder1";
        CancelRestrictions cancelRestrictions = CancelRestrictions.ONLY_NEW;
        Double recvWindow = 5000d;
        ApiResponse<DeleteOrderResponse> response =
                getApi().deleteOrder(
                                symbol,
                                orderId,
                                origClientOrderId,
                                newClientOrderId,
                                cancelRestrictions,
                                recvWindow);
        System.out.println(response.getData());
    }
}
