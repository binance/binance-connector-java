package com.binance.connector.client.stocks.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.EquityOrderDetailResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class EquityOrderDetailExample {
    private StocksRestApi api;

    public StocksRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StocksRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StocksRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Equity Order Detail (USER_DATA)
     *
     * <p>Returns a single order along with its trade execution list. Callers can only read their
     * own orders — the user identity is derived from the signed request. Weight: 1 Security Type:
     * USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void equityOrderDetailExample() throws ApiException, IOException {
        String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71";
        String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a";
        Long recvWindow = 5000L;
        ApiResponse<EquityOrderDetailResponse> response =
                getApi().equityOrderDetail(orderId, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
