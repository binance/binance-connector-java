package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetListScheduleResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class GetListScheduleExample {
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
     * Get list Schedule (MARKET_DATA)
     *
     * <p>Get the upcoming tokens or symbols listing schedule for Cross Margin and Isolated Margin.
     * Weight(IP): 100 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getListScheduleExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<GetListScheduleResponse> response = getApi().getListSchedule(recvWindow);
        System.out.println(response.getData());
    }
}
