package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ToggleBnbBurnOnFuturesTradeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ToggleBnbBurnOnFuturesTradeResponse;

/** API examples for AccountApi */
public class ToggleBnbBurnOnFuturesTradeExample {
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
     * Toggle BNB Burn On Futures Trade (TRADE)
     *
     * <p>Change user&#39;s BNB Fee Discount (Fee Discount On or Fee Discount Off ) on ***EVERY
     * symbol*** Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void toggleBnbBurnOnFuturesTradeExample() throws ApiException {
        ToggleBnbBurnOnFuturesTradeRequest toggleBnbBurnOnFuturesTradeRequest =
                new ToggleBnbBurnOnFuturesTradeRequest();
        toggleBnbBurnOnFuturesTradeRequest.feeBurn("");
        ApiResponse<ToggleBnbBurnOnFuturesTradeResponse> response =
                getApi().toggleBnbBurnOnFuturesTrade(toggleBnbBurnOnFuturesTradeRequest);
        System.out.println(response.getData());
    }
}
