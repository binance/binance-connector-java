package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.FuturesAccountBalanceResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class FuturesAccountBalanceExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Futures Account Balance (USER_DATA)
     *
     * <p>Check futures account balance Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void futuresAccountBalanceExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<FuturesAccountBalanceResponse> response =
                getApi().futuresAccountBalance(recvWindow);
        System.out.println(response.getData());
    }
}
