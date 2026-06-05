package com.binance.connector.client.derivatives_trading_options.rest.marketmakerblocktrade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryBlockTradeDetailsResponse;

/** API examples for MarketMakerBlockTradeApi */
public class QueryBlockTradeDetailsExample {
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
     * Query Block Trade Details (USER_DATA)
     *
     * <p>Query block trade details; returns block trade details from counterparty&#39;s
     * perspective. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void queryBlockTradeDetailsExample() throws ApiException {
        String blockOrderMatchingKey = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryBlockTradeDetailsResponse> response =
                getApi().queryBlockTradeDetails(blockOrderMatchingKey, recvWindow);
        System.out.println(response.getData());
    }
}
