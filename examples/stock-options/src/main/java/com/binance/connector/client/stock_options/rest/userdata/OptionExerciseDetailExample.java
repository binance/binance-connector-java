package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionExerciseDetailResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionExerciseDetailExample {
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
     * Option Exercise Detail (USER_DATA)
     *
     * <p>Query the result of a single exercise request. Provide at least one of &#x60;tranId&#x60;
     * and &#x60;clientOrderId&#x60;; omitting both returns &#x60;-1102&#x60;. If both are provided,
     * the lookup uses &#x60;clientOrderId&#x60; and &#x60;tranId&#x60; is ignored (the opposite of
     * Option Order Detail). Returns &#x60;497402 Order not found.&#x60; if no record is found or
     * the record does not belong to the caller. &#x60;errorCode&#x60; is returned only when
     * &#x60;status&#x60; is &#x60;FAILED&#x60;. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionExerciseDetailExample() throws ApiException, IOException {
        Long tranId = 1234567890L;
        String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a";
        Long recvWindow = 5000L;
        ApiResponse<OptionExerciseDetailResponse> response =
                getApi().optionExerciseDetail(tranId, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
