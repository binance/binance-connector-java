package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetSummaryOfMarginAccountResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetSummaryOfMarginAccountExample {
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
     * Get Summary of Margin account (USER_DATA)
     *
     * <p>Get personal margin level information Weight(IP): 10 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getSummaryOfMarginAccountExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<GetSummaryOfMarginAccountResponse> response =
                getApi().getSummaryOfMarginAccount(recvWindow);
        System.out.println(response.getData());
    }
}
