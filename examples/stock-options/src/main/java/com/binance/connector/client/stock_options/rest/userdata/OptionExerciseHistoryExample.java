package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionExerciseHistoryResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionExerciseHistoryExample {
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
     * Option Exercise History (USER_DATA)
     *
     * <p>Paged exercise history. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionExerciseHistoryExample() throws ApiException, IOException {
        String status = "SUCCESS,FAILED";
        Long startTime = 1790600000000L;
        Long endTime = 1790800000000L;
        Integer current = 1;
        Integer size = 20;
        Long recvWindow = 5000L;
        ApiResponse<OptionExerciseHistoryResponse> response =
                getApi().optionExerciseHistory(
                                status, startTime, endTime, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
