package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionOrderDetailResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionOrderDetailExample {
    private StockOptionsRestApi api;

    public StockOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    StockOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StockOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Option Order Detail (USER_DATA)
     *
     * <p>Query a single option order with its fills and an itemized fee breakdown. Provide at least
     * one of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60;; omitting both returns
     * &#x60;-1102&#x60;. If both are provided, the order is looked up by &#x60;orderId&#x60;, and
     * &#x60;clientOrderId&#x60; must belong to the same order, otherwise &#x60;486218 Order not
     * found&#x60; is returned. Only option orders are accepted: the &#x60;orderId&#x60; /
     * &#x60;clientOrderId&#x60; of a stock order returns &#x60;-2013 Order does not exist.&#x60;;
     * an unknown order ID returns &#x60;486218 Order not found&#x60;. Example: a fully filled
     * buy-to-open order — &#x60;filledTotal&#x60; &#x3D; &#x60;total&#x60; &#x3D; 1.48 × 1 × 100
     * &#x3D; 148 (excluding fees); total fees &#x60;fee&#x60; &#x3D; 0.65 (&#x60;commission&#x60; +
     * &#x60;cat&#x60; + &#x60;orf&#x60; + &#x60;occ&#x60;). &#x60;sec&#x60; / &#x60;taf&#x60; are
     * &#x60;0&#x60; for buy orders. For an order still in progress with no fills, &#x60;fee&#x60;
     * and the itemized fees are not returned (&#x60;platformFee&#x60; is always
     * &#x60;\&quot;0\&quot;&#x60;); for an order canceled or expired without any fill, each fee
     * item is &#x60;\&quot;0\&quot;&#x60;. &#x60;canceledAt&#x60; / &#x60;expiredAt&#x60; are
     * returned only in the corresponding status; &#x60;settlementDate&#x60; is not returned for buy
     * orders. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionOrderDetailExample() throws ApiException, IOException {
        String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71";
        String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a";
        Long recvWindow = 5000L;
        ApiResponse<OptionOrderDetailResponse> response =
                getApi().optionOrderDetail(orderId, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
