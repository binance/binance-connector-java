package com.binance.connector.client.w3w_prediction.rest.transfer;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.Direction;
import com.binance.connector.client.w3w_prediction.rest.model.QueryTransferListResponse;

/** API examples for TransferApi */
public class QueryTransferListExample {
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
     * Query Transfer List
     *
     * <p>Get the authenticated user&#39;s prediction wallet transfer history within a date range.
     * Weight(IP): 200 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryTransferListExample() throws ApiException {
        String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c";
        String startDate = "2026-05-01";
        String endDate = "2026-05-25";
        String tokenSymbol = "USDT";
        Direction direction = Direction.INBOUND;
        Integer offset = 0;
        Integer limit = 20;
        Long recvWindow = 5000L;
        ApiResponse<QueryTransferListResponse> response =
                getApi().queryTransferList(
                                walletAddress,
                                startDate,
                                endDate,
                                tokenSymbol,
                                direction,
                                offset,
                                limit,
                                recvWindow);
        System.out.println(response.getData());
    }
}
