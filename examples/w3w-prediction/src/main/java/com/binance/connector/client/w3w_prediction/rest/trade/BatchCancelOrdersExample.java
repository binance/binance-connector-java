package com.binance.connector.client.w3w_prediction.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.BatchCancelOrdersRequest;
import com.binance.connector.client.w3w_prediction.rest.model.BatchCancelOrdersResponse;

/** API examples for TradeApi */
public class BatchCancelOrdersExample {
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
     * Batch Cancel Orders
     *
     * <p>Cancel one or more active prediction orders in a single request. Requires SAS
     * authorization. **Known Issue — Bracket Encoding Incompatibility:** This endpoint uses indexed
     * bracket notation (&#x60;cancelInfoList[0].orderId&#x60;). Binance SAPI signature verification
     * runs over the **raw, unencoded** canonical string. However, mainstream HTTP libraries (Python
     * &#x60;requests&#x60;, Java &#x60;HttpURLConnection&#x60;/&#x60;URI&#x60;, Go
     * &#x60;net/url&#x60;, Node.js &#x60;url&#x60;) automatically percent-encode &#x60;[&#x60; →
     * &#x60;%5B&#x60; and &#x60;]&#x60; → &#x60;%5D&#x60;, producing a signature mismatch with
     * error &#x60;-1022 Signature for this request is not valid&#x60;. Postman is unaffected
     * because it does not encode keys. **Workarounds** (use low-level HTTP APIs that do not
     * normalize URLs): - **Python:** use &#x60;http.client&#x60; (stdlib) and hand-build the body
     * string. - **Java:** use &#x60;HttpURLConnection&#x60; and write the raw body bytes directly.
     * - **Go:** use &#x60;strings.NewReader&#x60; with a hand-built body instead of
     * &#x60;url.Values.Encode()&#x60;. Weight(IP): 200 Security Type: TRADE Notes: - Use dot
     * notation for nested list fields: &#x60;cancelInfoList[0].orderId&#x60;,
     * &#x60;cancelInfoList[1].orderId&#x60;, etc. - &#x60;vendor&#x60; does not need to be
     * supplied. The server automatically sets the correct vendor (&#x60;predict_fun&#x60;) for
     * every item in the batch.
     *
     * @throws ApiException if the Api call fails
     */
    public void batchCancelOrdersExample() throws ApiException {
        BatchCancelOrdersRequest batchCancelOrdersRequest = new BatchCancelOrdersRequest();
        batchCancelOrdersRequest.walletAddress("0x12e32db8817e292508c34111cbc4b23340df542c");
        batchCancelOrdersRequest.walletId("5b5c1ec3be4e4416a5872b21c1ca5d20");
        ApiResponse<BatchCancelOrdersResponse> response =
                getApi().batchCancelOrders(batchCancelOrdersRequest);
        System.out.println(response.getData());
    }
}
