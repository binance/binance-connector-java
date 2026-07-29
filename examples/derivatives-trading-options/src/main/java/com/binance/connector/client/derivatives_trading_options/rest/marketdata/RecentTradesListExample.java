package com.binance.connector.client.derivatives_trading_options.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.RecentTradesListResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class RecentTradesListExample {
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
     * Recent Trades List
     *
     * <p>Get recent market trades Weight(IP): 5
     *
     * @throws ApiException if the Api call fails
     */
    public void recentTradesListExample() throws ApiException, IOException {
        String symbol = "BTC-200730-9000-C";
        Long limit = 20L;
        ApiResponse<RecentTradesListResponse> response = getApi().recentTradesList(symbol, limit);
        System.out.println(response.getData());
    }
}
