package com.binance.connector.client.stock_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.SubmitOptionExerciseResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class SubmitOptionExerciseExample {
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
     * Submit Option Exercise (TRADE)
     *
     * <p>Submit an exercise request for a long option position. Requires the &#x60;TRADE&#x60;
     * permission, because exercising changes positions and balances. **Exercise is asynchronous.**
     * The request returns &#x60;PROCESSING&#x60;; delivery is handled by the broker. Poll Option
     * Exercise Detail for the final status. &#x60;quantity&#x60; cannot exceed
     * &#x60;availableQty&#x60; from Exercisable Options. Resubmitting with the **same**
     * &#x60;clientOrderId&#x60; is idempotent: if the original exercise was accepted or is still
     * processing, it is returned with its current status; if it failed, &#x60;497401&#x60; is
     * returned. If the request returns &#x60;497001&#x60;, &#x60;497301&#x60; or a broker-rejection
     * error code, the exercise **may still be processing**: retry with the same
     * &#x60;clientOrderId&#x60; or query Option Exercise Detail by &#x60;clientOrderId&#x60;. Do
     * not resubmit with a new &#x60;clientOrderId&#x60;. Weight: 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void submitOptionExerciseExample() throws ApiException, IOException {
        String symbol = "NVDA260930C00100000";
        String quantity = "1";
        String quoteAsset = "USDC";
        String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a";
        Long recvWindow = 5000L;
        ApiResponse<SubmitOptionExerciseResponse> response =
                getApi().submitOptionExercise(
                                symbol, quantity, quoteAsset, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
