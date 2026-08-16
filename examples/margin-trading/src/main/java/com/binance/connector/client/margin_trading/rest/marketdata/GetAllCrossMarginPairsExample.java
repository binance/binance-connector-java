package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetAllCrossMarginPairsResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class GetAllCrossMarginPairsExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get All Cross Margin Pairs (MARKET_DATA)
     *
     * <p>Get All Cross Margin Pairs Weight(IP): 1 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getAllCrossMarginPairsExample() throws ApiException, IOException {
        String symbol = "BNBBTC";
        ApiResponse<GetAllCrossMarginPairsResponse> response =
                getApi().getAllCrossMarginPairs(symbol);
        System.out.println(response.getData());
    }
}
