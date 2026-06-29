package com.binance.connector.client.w3w_prediction.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.GetQuoteRequest;
import com.binance.connector.client.w3w_prediction.rest.model.GetQuoteResponse;
import com.binance.connector.client.w3w_prediction.rest.model.OrderType;
import com.binance.connector.client.w3w_prediction.rest.model.Side;

/** API examples for TradeApi */
public class GetQuoteExample {
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
     * Get Quote
     *
     * <p>Get a price quote for a prediction order. The returned &#x60;quoteId&#x60; must be used in
     * the subsequent Place Order request. Weight(IP): 200 Security Type: TRADE Response Notes: -
     * &#x60;feeAmount&#x60; is a string because it is denominated in wei (18 decimals) and may
     * exceed JavaScript&#39;s safe integer range. &#x60;feeDiscountBps&#x60; is also a string to
     * allow fractional basis-point values in the future. &#x60;feeRateBps&#x60; and
     * &#x60;slippageBps&#x60; are integers and will never exceed safe integer bounds. - **MARKET
     * order minimum amount:** For &#x60;MARKET&#x60; orders, &#x60;amountIn&#x60; must be at least
     * approximately **1.5 USDT** (in wei: &#x60;1500000000000000000&#x60;). The exact minimum
     * varies by market liquidity. If the amount is too small, the server returns &#x60;-9000 Your
     * order amount is too small&#x60;. This limit does **not** apply to &#x60;LIMIT&#x60; orders.
     *
     * @throws ApiException if the Api call fails
     */
    public void getQuoteExample() throws ApiException {
        GetQuoteRequest getQuoteRequest = new GetQuoteRequest();
        getQuoteRequest.walletAddress("0x12e32db8817e292508c34111cbc4b23340df542c");
        getQuoteRequest.tokenId("112233");
        getQuoteRequest.side(Side.BUY);
        getQuoteRequest.amountIn("1000000000000000000");
        getQuoteRequest.orderType(OrderType.MARKET);
        getQuoteRequest.slippageBps(1200);
        ApiResponse<GetQuoteResponse> response = getApi().getQuote(getQuoteRequest);
        System.out.println(response.getData());
    }
}
