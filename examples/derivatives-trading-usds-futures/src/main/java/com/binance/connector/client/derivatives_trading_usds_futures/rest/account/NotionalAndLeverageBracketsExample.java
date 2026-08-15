package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.NotionalAndLeverageBracketsResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class NotionalAndLeverageBracketsExample {
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
     * Notional and Leverage Brackets (USER_DATA)
     *
     * <p>Query user notional and leverage bracket on speicfic symbol Weight(IP): 1 Security Type:
     * USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void notionalAndLeverageBracketsExample() throws ApiException, IOException {
        String symbol = "ETHUSDT";
        Long recvWindow = 5000L;
        ApiResponse<NotionalAndLeverageBracketsResponse> response =
                getApi().notionalAndLeverageBrackets(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
