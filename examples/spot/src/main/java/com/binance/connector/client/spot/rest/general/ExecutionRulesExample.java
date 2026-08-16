package com.binance.connector.client.spot.rest.general;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.ExecutionRulesResponse;
import com.binance.connector.client.spot.rest.model.SymbolStatus;
import com.binance.connector.client.spot.rest.model.Symbols;
import java.io.IOException;

/** API examples for GeneralApi */
public class ExecutionRulesExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Execution Rules
     *
     * <p>Query execution rules for symbols. Weight: Parameter | Weight --- | --- &#x60;symbol&#x60;
     * | 2 &#x60;symbols&#x60; | 2 for each &#x60;symbol&#x60;, capped at a max of 40
     * &#x60;symbolStatus&#x60; | 40 None | 40 Security Type: NONE Notes: **Data Source:** Memory
     * **Note:**: No combination of multiple parameters is allowed.
     *
     * @throws ApiException if the Api call fails
     */
    public void executionRulesExample() throws ApiException, IOException {
        String symbol = "BAZUSD";
        Symbols symbols = Symbols.fromJson("[\"BTCUSDT\",\"BNBUSDT\"]");
        SymbolStatus symbolStatus = SymbolStatus.TRADING;
        ApiResponse<ExecutionRulesResponse> response =
                getApi().executionRules(symbol, symbols, symbolStatus);
        System.out.println(response.getData());
    }
}
