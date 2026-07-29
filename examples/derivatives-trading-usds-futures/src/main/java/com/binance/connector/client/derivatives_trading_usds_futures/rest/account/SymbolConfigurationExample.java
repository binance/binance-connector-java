package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SymbolConfigurationResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class SymbolConfigurationExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Symbol Configuration (USER_DATA)
     *
     * <p>Get current account symbol configuration. Weight(IP): 5 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void symbolConfigurationExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<SymbolConfigurationResponse> response =
                getApi().symbolConfiguration(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
