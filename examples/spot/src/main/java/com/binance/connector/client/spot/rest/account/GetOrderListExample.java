package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.GetOrderListResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetOrderListExample {
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
     * Query Order list (USER_DATA)
     *
     * <p>Retrieves a specific order list based on provided optional parameters. Weight(IP): 4
     * Security Type: USER_DATA Notes: **Data Source:** Database
     *
     * @throws ApiException if the Api call fails
     */
    public void getOrderListExample() throws ApiException, IOException {
        Long orderListId = 27L;
        String origClientOrderId = "1";
        Double recvWindow = 5000d;
        ApiResponse<GetOrderListResponse> response =
                getApi().getOrderList(orderListId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
