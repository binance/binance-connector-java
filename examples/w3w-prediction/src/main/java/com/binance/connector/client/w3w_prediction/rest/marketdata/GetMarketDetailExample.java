package com.binance.connector.client.w3w_prediction.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.GetMarketDetailResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class GetMarketDetailExample {
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
     * Get Market Detail
     *
     * <p>Get full details for a specific prediction market topic, including variant data and
     * timeline. Weight(IP): 1 Response Notes: - &#x60;status&#x60; is a case-sensitive string.
     * &#x60;REGISTERED&#x60;: registered and not yet resolved, this value alone does not guarantee
     * that trading is available. &#x60;RESOLVED&#x60;: the outcome has been determined, it does not
     * mean that the user has already claimed the payout. &#x60;PAUSED&#x60;: trading is temporarily
     * suspended and may resume. &#x60;CLOSED&#x60;: closed for display, for example the end time
     * has passed or the market was removed, it does not guarantee that trading is closed. -
     * &#x60;markets[].tradingStatus&#x60; shows whether new orders may be attempted.
     * &#x60;OPEN&#x60;: new orders may be attempted, this is the only value that allows new orders.
     * &#x60;MATCHING_NOT_ENABLED&#x60;: order matching is not enabled. &#x60;CANCEL_ONLY&#x60;:
     * only cancellation is allowed. &#x60;CLOSED&#x60;: trading has stopped. Use
     * &#x60;markets[].tradingStatus&#x60;, not &#x60;status&#x60;, to decide whether to place an
     * order, because a market whose &#x60;status&#x60; is &#x60;CLOSED&#x60; can still have
     * &#x60;tradingStatus&#x60; &#x60;OPEN&#x60;. A topic can contain several markets and an order
     * is placed on one market, so only the &#x60;tradingStatus&#x60; of that market matters. A
     * successful quote does not guarantee that an order is accepted or filled. -
     * &#x60;outcomes[].winner&#x60; is returned only after the market is resolved. There is no
     * separate cancelled, invalid or refunded status. A resolved market can pay more than one
     * outcome, in that case several outcomes have &#x60;winner&#x60; set to &#x60;true&#x60; and
     * &#x60;price&#x60; is the settled value per share, for example &#x60;0.5&#x60; for each of two
     * outcomes.
     *
     * @throws ApiException if the Api call fails
     */
    public void getMarketDetailExample() throws ApiException, IOException {
        Long marketTopicId = 4229564L;
        ApiResponse<GetMarketDetailResponse> response = getApi().getMarketDetail(marketTopicId);
        System.out.println(response.getData());
    }
}
