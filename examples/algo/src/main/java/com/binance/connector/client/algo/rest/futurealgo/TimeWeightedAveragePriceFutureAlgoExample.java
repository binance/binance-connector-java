package com.binance.connector.client.algo.rest.futurealgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.Side;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceFutureAlgoRequest;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceFutureAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for FutureAlgoApi */
public class TimeWeightedAveragePriceFutureAlgoExample {
    private AlgoRestApi api;

    public AlgoRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = AlgoRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AlgoRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Time-Weighted Futures Average Price (Twap) New Order (TRADE)
     *
     * <p>Send in a Twap new order. Only support on USDⓈ-M Contracts. Weight(UID): 3000 Security
     * Type: TRADE Notes: - Other info: - Total Algo open orders max allowed: &#x60;30&#x60; orders.
     * - Leverage and position mode follow your futures account settings. - Receiving
     * &#x60;\&quot;success\&quot;: true&#x60; does not guarantee execution; query order endpoints
     * for final status. - If balance/position constraints fail, response may still return success
     * but order status becomes &#x60;expired&#x60;. - &#x60;quantity * 60 / duration&#x60; must be
     * greater than &#x60;minQty&#x60;. - &#x60;duration&#x60; cannot be less than 5 minutes or
     * greater than 24 hours. - For delivery contracts, TWAP end time should be one hour earlier
     * than symbol delivery time. - You need to enable the corresponding permission for the API key
     * requesting this endpoint: - &#x60;Futures Trading Permission&#x60; — for Classic Trading
     * Account mode - &#x60;Portfolio Margin Trading Permission&#x60; — for Portfolio Margin Account
     * mode - Base URL: &#x60;https://api.binance.com&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void timeWeightedAveragePriceFutureAlgoExample() throws ApiException, IOException {
        TimeWeightedAveragePriceFutureAlgoRequest timeWeightedAveragePriceFutureAlgoRequest =
                new TimeWeightedAveragePriceFutureAlgoRequest();
        timeWeightedAveragePriceFutureAlgoRequest.symbol("BTCUSDT");
        timeWeightedAveragePriceFutureAlgoRequest.side(Side.BUY);
        timeWeightedAveragePriceFutureAlgoRequest.quantity(1d);
        timeWeightedAveragePriceFutureAlgoRequest.duration(5000L);
        ApiResponse<TimeWeightedAveragePriceFutureAlgoResponse> response =
                getApi().timeWeightedAveragePriceFutureAlgo(
                                timeWeightedAveragePriceFutureAlgoRequest);
        System.out.println(response.getData());
    }
}
