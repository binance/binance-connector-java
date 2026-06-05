package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.AccountTradeListResponse;

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
     * <p>Get trades for a specific account and symbol. * Only support querying trades in the past 3
     * months Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void accountTradeListExample() throws ApiException {
        String symbol = "";
        Long fromId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<AccountTradeListResponse> response =
                getApi().accountTradeList(symbol, fromId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
