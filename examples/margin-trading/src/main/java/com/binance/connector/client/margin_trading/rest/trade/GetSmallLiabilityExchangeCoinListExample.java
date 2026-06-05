package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetSmallLiabilityExchangeCoinListResponse;

/** API examples for TradeApi */
public class GetSmallLiabilityExchangeCoinListExample {
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
     * Get Small Liability Exchange Coin List (USER_DATA)
     *
     * <p>Query the coins which can be small liability exchange Weight: 100
     *
     * @throws ApiException if the Api call fails
     */
    public void getSmallLiabilityExchangeCoinListExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetSmallLiabilityExchangeCoinListResponse> response =
                getApi().getSmallLiabilityExchangeCoinList(recvWindow);
        System.out.println(response.getData());
    }
}
