package com.binance.connector.client.w3w_prediction.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.QueryActiveOrdersResponse;
import com.binance.connector.client.w3w_prediction.rest.model.TradeSide;

/** API examples for TradeApi */
public class QueryActiveOrdersExample {
    private W3WPredictionRestApi api;

    public W3WPredictionRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    W3WPredictionRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new W3WPredictionRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Active Orders
     *
     * <p>Get active (open) prediction orders for the authenticated user. Weight(IP): 200 Security
     * Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryActiveOrdersExample() throws ApiException {
        String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c";
        TradeSide tradeSide = TradeSide.BUY;
        String l1Category = "crypto";
        Long marketId = 5567895L;
        Integer offset = 0;
        Integer limit = 20;
        Long recvWindow = 5000L;
        ApiResponse<QueryActiveOrdersResponse> response =
                getApi().queryActiveOrders(
                                walletAddress,
                                tradeSide,
                                l1Category,
                                marketId,
                                offset,
                                limit,
                                recvWindow);
        System.out.println(response.getData());
    }
}
