package com.binance.connector.client.w3w_prediction.rest.otc;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.CreateOtcBlocktradeRequest;
import com.binance.connector.client.w3w_prediction.rest.model.CreateOtcBlocktradeResponse;
import com.binance.connector.client.w3w_prediction.rest.model.Side;
import java.io.IOException;

/** API examples for OtcApi */
public class CreateOtcBlocktradeExample {
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
     * Create OTC Blocktrade (PREDICTION_TRADE)
     *
     * <p>Create an OTC blocktrade as the maker (BID to buy outcome shares with USDT, or ASK to sell
     * outcome shares for USDT). The maker wallet is resolved server-side by &#x60;userId&#x60;;
     * signing is done server-side via SAS &#x60;typedDataSign&#x60;. Returns &#x60;orderId&#x60;
     * and a one-time &#x60;secretToken&#x60; to share out-of-band with the intended taker.
     * Weight(IP): 200 Security Type: PREDICTION_TRADE Notes: - Restricted to authorized market
     * makers. Requests from unauthorized accounts are rejected — contact BD to request access. -
     * Side &amp; Amount Rules: | side | makerAmount | takerAmount | | ------ | ------------- |
     * ------------- | | &#x60;BUY&#x60; | USDT (wei) | shares (wei) | | &#x60;SELL&#x60; | shares
     * (wei) | USDT (wei) | - \&quot;Note on &#x60;side&#x60; encoding: this request uses a string
     * enum (&#x60;BUY&#x60;/&#x60;SELL&#x60;). Responses from Get Blocktrade Detail / Preview /
     * List return &#x60;side&#x60; as an integer and also include a &#x60;quoteType&#x60; string —
     * both encode the same concept.\&quot; | Request &#x60;side&#x60; | Response &#x60;side&#x60;
     * (Integer) | Response &#x60;quoteType&#x60; | | --------------- | -------------------------- |
     * ---------------------- | | &#x60;BUY&#x60; | &#x60;0&#x60; | &#x60;\&quot;Bid\&quot;&#x60; |
     * | &#x60;SELL&#x60; | &#x60;1&#x60; | &#x60;\&quot;Ask\&quot;&#x60; |
     *
     * @throws ApiException if the Api call fails
     */
    public void createOtcBlocktradeExample() throws ApiException, IOException {
        CreateOtcBlocktradeRequest createOtcBlocktradeRequest = new CreateOtcBlocktradeRequest();
        createOtcBlocktradeRequest.marketId("123");
        createOtcBlocktradeRequest.tokenId(
                "71321045679252212594626385532706912750332728571942532289631379312455583992563");
        createOtcBlocktradeRequest.side(Side.BUY);
        createOtcBlocktradeRequest.makerAmount("600000000000000000000");
        createOtcBlocktradeRequest.takerAmount("1000000000000000000000");
        createOtcBlocktradeRequest.pricePerShare("0.65");
        createOtcBlocktradeRequest.expiration(1790000000L);
        ApiResponse<CreateOtcBlocktradeResponse> response =
                getApi().createOtcBlocktrade(createOtcBlocktradeRequest);
        System.out.println(response.getData());
    }
}
