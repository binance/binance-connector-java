package com.binance.connector.client.w3w_prediction.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.OrderType;
import com.binance.connector.client.w3w_prediction.rest.model.QueryOrderHistoryResponse;

/** API examples for TradeApi */
public class QueryOrderHistoryExample {
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
     * Query Order History
     *
     * <p>Get historical prediction orders (all statuses) for the authenticated user, with optional
     * filters. Weight(IP): 200 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryOrderHistoryExample() throws ApiException {
        String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c";
        String l1Category = "crypto";
        OrderType orderType = OrderType.MARKET;
        String status = "CLOSED";
        String startDate = "2026-05-01";
        String endDate = "2026-05-25";
        Integer offset = 0;
        Integer limit = 20;
        Long recvWindow = 5000L;
        ApiResponse<QueryOrderHistoryResponse> response =
                getApi().queryOrderHistory(
                                walletAddress,
                                l1Category,
                                orderType,
                                status,
                                startDate,
                                endDate,
                                offset,
                                limit,
                                recvWindow);
        System.out.println(response.getData());
    }
}
