package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class QueryLiabilityCoinLeverageBracketInCrossMarginProModeExample {
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
     * Query Liability Coin Leverage Bracket in Cross Margin Pro Mode (MARKET_DATA)
     *
     * <p>Liability Coin Leverage Bracket in Cross Margin Pro Mode Weight(IP): 1 Security Type:
     * MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryLiabilityCoinLeverageBracketInCrossMarginProModeExample()
            throws ApiException, IOException {
        ApiResponse<QueryLiabilityCoinLeverageBracketInCrossMarginProModeResponse> response =
                getApi().queryLiabilityCoinLeverageBracketInCrossMarginProMode();
        System.out.println(response.getData());
    }
}
