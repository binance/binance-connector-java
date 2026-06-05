package com.binance.connector.client.derivatives_trading_options.rest.marketmakerendpoints;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.SetMarketMakerProtectionConfigRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.SetMarketMakerProtectionConfigResponse;

/** API examples for MarketMakerEndpointsApi */
public class SetMarketMakerProtectionConfigExample {
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
     * Set Market Maker Protection Config (TRADE)
     *
     * <p>Set config for MMP. Market Maker Protection(MMP) is a set of protection mechanism for
     * option market maker, this mechanism is able to prevent mass trading in short period time.
     * Once market maker&#39;s account branches the threshold, the Market Maker Protection will be
     * triggered. When Market Maker Protection triggers, all the current MMP orders will be
     * canceled, new MMP orders will be rejected. Market maker can use this time to reevaluate
     * market and modify order price. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void setMarketMakerProtectionConfigExample() throws ApiException {
        SetMarketMakerProtectionConfigRequest setMarketMakerProtectionConfigRequest =
                new SetMarketMakerProtectionConfigRequest();
        ApiResponse<SetMarketMakerProtectionConfigResponse> response =
                getApi().setMarketMakerProtectionConfig(setMarketMakerProtectionConfigRequest);
        System.out.println(response.getData());
    }
}
