package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.CurrentOpenOptionOrdersResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class CurrentOpenOptionOrdersExample {
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
     * Current Open Option Orders (USER_DATA)
     *
     * <p>Query all of the caller&#39;s open **option** orders, including the remaining quantity of
     * partially filled orders. Stock orders are not included. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void currentOpenOptionOrdersExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<CurrentOpenOptionOrdersResponse> response =
                getApi().currentOpenOptionOrders(recvWindow);
        System.out.println(response.getData());
    }
}
