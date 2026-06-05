package com.binance.connector.client.spot.rest.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.ReferencePriceCalculationResponse;
import com.binance.connector.client.spot.rest.model.SymbolStatus;

/** API examples for MarketApi */
public class ReferencePriceCalculationExample {
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
     * Query Reference Price Calculation
     *
     * <p>Describes how reference price is calculated for a given symbol. Weight: 2
     *
     * @throws ApiException if the Api call fails
     */
    public void referencePriceCalculationExample() throws ApiException {
        String symbol = "BNBUSDT";
        SymbolStatus symbolStatus = SymbolStatus.TRADING;
        ApiResponse<ReferencePriceCalculationResponse> response =
                getApi().referencePriceCalculation(symbol, symbolStatus);
        System.out.println(response.getData());
    }
}
