package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.CancelAllOptionOrdersOnSpecificSymbolResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelAllOptionOrdersOnSpecificSymbolExample {
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
     * Cancel all Option orders on specific symbol (TRADE)
     *
     * <p>Cancel all active order on a symbol. Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllOptionOrdersOnSpecificSymbolExample() throws ApiException, IOException {
        String symbol = "BTC-200730-9000-C";
        Long recvWindow = 5000L;
        ApiResponse<CancelAllOptionOrdersOnSpecificSymbolResponse> response =
                getApi().cancelAllOptionOrdersOnSpecificSymbol(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
