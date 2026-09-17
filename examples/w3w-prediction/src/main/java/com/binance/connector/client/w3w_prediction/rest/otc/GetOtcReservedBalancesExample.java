package com.binance.connector.client.w3w_prediction.rest.otc;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.Assets;
import com.binance.connector.client.w3w_prediction.rest.model.GetOtcReservedBalancesRequest;
import com.binance.connector.client.w3w_prediction.rest.model.GetOtcReservedBalancesResponse;
import java.io.IOException;

/** API examples for OtcApi */
public class GetOtcReservedBalancesExample {
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
     * Get OTC Reserved Balances (PREDICTION_TRADE)
     *
     * <p>Query PredictFun reserved balances for the caller&#39;s bound wallet — these are funds
     * locked by the caller&#39;s open OTC blocktrade orders (maker BID locks USDT, maker ASK locks
     * shares). Not tied to a specific blocktrade id; the path nesting under
     * &#x60;otc/blocktrade&#x60; reflects the cause of the lock, not a per-order query. Returns one
     * entry per requested asset, aligned with the request order. Pass
     * &#x60;{type:\&quot;USDT\&quot;}&#x60; for reserved USDT, or &#x60;{type:\&quot;SHARE\&quot;,
     * tokenId:\&quot;...\&quot;}&#x60; for a specific outcome token&#39;s reserved shares.
     * Weight(IP): 200 Security Type: PREDICTION_TRADE Notes: - Restricted to authorized market
     * makers. Requests from unauthorized accounts are rejected — contact BD to request access. -
     * AssetQuery: | Name | Type | Mandatory | Description | | ------- | ------ | --------- |
     * ----------- | | type | STRING | YES | Asset type. Enum: &#x60;USDT&#x60;, &#x60;SHARE&#x60; |
     * | tokenId | STRING | NO | Outcome token id (present for &#x60;SHARE&#x60; entries only) |
     *
     * @throws ApiException if the Api call fails
     */
    public void getOtcReservedBalancesExample() throws ApiException, IOException {
        GetOtcReservedBalancesRequest getOtcReservedBalancesRequest =
                new GetOtcReservedBalancesRequest();
        getOtcReservedBalancesRequest.assets(new Assets());
        ApiResponse<GetOtcReservedBalancesResponse> response =
                getApi().getOtcReservedBalances(getOtcReservedBalancesRequest);
        System.out.println(response.getData());
    }
}
