package com.binance.connector.client.derivatives_trading_options.rest.marketmakerendpoints;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.ResetMarketMakerProtectionConfigRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.ResetMarketMakerProtectionConfigResponse;

/** API examples for MarketMakerEndpointsApi */
public class ResetMarketMakerProtectionConfigExample {
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
     * Reset Market Maker Protection Config (TRADE)
     *
     * <p>Reset MMP, start MMP order again. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void resetMarketMakerProtectionConfigExample() throws ApiException {
        ResetMarketMakerProtectionConfigRequest resetMarketMakerProtectionConfigRequest =
                new ResetMarketMakerProtectionConfigRequest();
        ApiResponse<ResetMarketMakerProtectionConfigResponse> response =
                getApi().resetMarketMakerProtectionConfig(resetMarketMakerProtectionConfigRequest);
        System.out.println(response.getData());
    }
}
