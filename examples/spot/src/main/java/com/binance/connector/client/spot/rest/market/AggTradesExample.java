package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.AggTradesResponse;
import java.io.IOException;

/** API examples for MarketApi */
public class AggTradesExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Compressed/Aggregate trades list
     *
     * <p>Get compressed, aggregate trades. Trades that fill at the time, from the same taker order,
     * with the same price will have the quantity aggregated. Weight(IP): 4 Security Type: NONE
     * Notes: **Data Source:** Database - If fromId, startTime, and endTime are not sent, the most
     * recent aggregate trades will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void aggTradesExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Long fromId = 1L;
        Long startTime = 1735693200000L;
        Long endTime = 1735693200000L;
        Integer limit = 1;
        ApiResponse<AggTradesResponse> response =
                getApi().aggTrades(symbol, fromId, startTime, endTime, limit);
        System.out.println(response.getData());
    }
}
