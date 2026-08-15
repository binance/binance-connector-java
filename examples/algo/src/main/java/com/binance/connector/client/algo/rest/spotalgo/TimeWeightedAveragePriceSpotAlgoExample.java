package com.binance.connector.client.algo.rest.spotalgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.Side;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceSpotAlgoRequest;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceSpotAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for SpotAlgoApi */
public class TimeWeightedAveragePriceSpotAlgoExample {
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
     * Time-Weighted Spot Average Price(Twap) New Order (TRADE)
     *
     * <p>Place a new spot TWAP order with Algo service. Weight(UID): 3000 Security Type: TRADE
     * Notes: - Total Algo open orders max allowed: &#x60;20&#x60; orders.
     *
     * @throws ApiException if the Api call fails
     */
    public void timeWeightedAveragePriceSpotAlgoExample() throws ApiException, IOException {
        TimeWeightedAveragePriceSpotAlgoRequest timeWeightedAveragePriceSpotAlgoRequest =
                new TimeWeightedAveragePriceSpotAlgoRequest();
        timeWeightedAveragePriceSpotAlgoRequest.symbol("BTCUSDT");
        timeWeightedAveragePriceSpotAlgoRequest.side(Side.BUY);
        timeWeightedAveragePriceSpotAlgoRequest.quantity(1d);
        timeWeightedAveragePriceSpotAlgoRequest.duration(5000L);
        ApiResponse<TimeWeightedAveragePriceSpotAlgoResponse> response =
                getApi().timeWeightedAveragePriceSpotAlgo(timeWeightedAveragePriceSpotAlgoRequest);
        System.out.println(response.getData());
    }
}
