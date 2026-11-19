package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.ExercisableOptionsResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class ExercisableOptionsExample {
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
     * Exercisable Options (USER_DATA)
     *
     * <p>Returns the contracts that can currently be exercised. Only **long** positions are
     * exercisable; the short side is the assigned party and has no exercise right.
     * &#x60;availableQty&#x60; is the maximum quantity for Submit Option Exercise. Weight: 1
     * Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void exercisableOptionsExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<ExercisableOptionsResponse> response = getApi().exercisableOptions(recvWindow);
        System.out.println(response.getData());
    }
}
