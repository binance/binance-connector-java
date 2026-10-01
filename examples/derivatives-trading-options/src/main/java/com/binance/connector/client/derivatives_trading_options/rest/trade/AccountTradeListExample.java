package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.AccountTradeListResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class AccountTradeListExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Account Trade List (USER_DATA)
     *
     * <p>Get trades for a specific account and symbol. Only supports querying trades in the past 3
     * months; a &#x60;startTime&#x60;/&#x60;endTime&#x60; outside that window returns &#x60;-6073
     * SEARCH_WINDOW_RESTRICTED&#x60;. Weight(IP): 5 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void accountTradeListExample() throws ApiException, IOException {
        String symbol = "BTC-200730-9000-C";
        Long fromId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 20L;
        Long recvWindow = 5000L;
        ApiResponse<AccountTradeListResponse> response =
                getApi().accountTradeList(symbol, fromId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
