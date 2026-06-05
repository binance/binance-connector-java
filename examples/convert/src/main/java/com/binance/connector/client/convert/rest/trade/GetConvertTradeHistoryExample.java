package com.binance.connector.client.convert.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.GetConvertTradeHistoryResponse;

/** API examples for TradeApi */
public class GetConvertTradeHistoryExample {
    private ConvertRestApi api;

    public ConvertRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = ConvertRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new ConvertRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Convert Trade History(USER_DATA)
     *
     * <p>Get Convert Trade History * The max interval between startTime and endTime is 30 days.
     * Weight: 3000
     *
     * @throws ApiException if the Api call fails
     */
    public void getConvertTradeHistoryExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<GetConvertTradeHistoryResponse> response =
                getApi().getConvertTradeHistory(startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
