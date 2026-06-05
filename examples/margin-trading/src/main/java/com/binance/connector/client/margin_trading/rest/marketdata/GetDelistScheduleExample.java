package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetDelistScheduleResponse;

/** API examples for MarketDataApi */
public class GetDelistScheduleExample {
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
     * Get Delist Schedule (MARKET_DATA)
     *
     * <p>Get tokens or symbols delist schedule for cross margin and isolated margin Weight: 100
     *
     * @throws ApiException if the Api call fails
     */
    public void getDelistScheduleExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetDelistScheduleResponse> response = getApi().getDelistSchedule(recvWindow);
        System.out.println(response.getData());
    }
}
