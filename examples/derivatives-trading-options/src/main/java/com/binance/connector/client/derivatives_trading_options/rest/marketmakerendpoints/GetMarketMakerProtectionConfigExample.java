package com.binance.connector.client.derivatives_trading_options.rest.marketmakerendpoints;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.GetMarketMakerProtectionConfigResponse;
import java.io.IOException;

/** API examples for MarketMakerEndpointsApi */
public class GetMarketMakerProtectionConfigExample {
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
     * Get Market Maker Protection Config (TRADE)
     *
     * <p>Get config for MMP. Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void getMarketMakerProtectionConfigExample() throws ApiException, IOException {
        String underlying = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<GetMarketMakerProtectionConfigResponse> response =
                getApi().getMarketMakerProtectionConfig(underlying, recvWindow);
        System.out.println(response.getData());
    }
}
