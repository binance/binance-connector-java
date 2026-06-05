package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;

/** API examples for TradeApi */
public class DeleteSpecialKeyExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Delete Special Key(Low-Latency Trading)(TRADE)
     *
     * <p>This only applies to Special Key for Low Latency Trading. If apiKey is given, apiName will
     * be ignored. If apiName is given with no apiKey, all apikeys with given apiName will be
     * deleted. You need to enable Permits “Enable Spot &amp; Margin Trading” option for the API Key
     * which requests this endpoint. Weight: 1(UID)
     *
     * @throws ApiException if the Api call fails
     */
    public void deleteSpecialKeyExample() throws ApiException {
        String apiName = "";
        String symbol = "";
        Long recvWindow = 5000L;
        getApi().deleteSpecialKey(apiName, symbol, recvWindow);
    }
}
