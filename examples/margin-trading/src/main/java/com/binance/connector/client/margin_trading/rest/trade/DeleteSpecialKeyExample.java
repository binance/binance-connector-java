package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import java.io.IOException;

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
     * Delete Special Key(Low-Latency Trading) (TRADE)
     *
     * <p>Deleting your Margin Special Key alone does not exit you from the Margin Special Key
     * framework or discharge your obligations under the Margin Special Key Supplemental Product
     * Terms. To fully exit, you must: 1. Delete your Margin Special Key. 2. Ensure there are no
     * outstanding liabilities on the account. 3. Call the Exit Margin Special Key API endpoint. 4.
     * Confirm the exit status via the API response. Only after step 4 is completed and the exit
     * status is confirmed by Binance will your account revert to standard liquidation logic and no
     * longer be subject to the Margin Special Key Supplemental Product Terms. If apiKey is given,
     * apiName will be ignored. If apiName is given with no apiKey, all apikeys with given apiName
     * will be deleted. You need to enable Permits “Enable Spot &amp; Margin” option for the API Key
     * which requests this endpoint. Weight(UID): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void deleteSpecialKeyExample() throws ApiException, IOException {
        String apiName = "apiName";
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        getApi().deleteSpecialKey(apiName, symbol, recvWindow);
    }
}
