package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.UserCommissionRateResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class UserCommissionRateExample {
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
     * User Commission Rate (USER_DATA)
     *
     * <p>Query user commission rate Weight(IP): 20 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void userCommissionRateExample() throws ApiException, IOException {
        String symbol = "BTCUSD_PERP";
        Long recvWindow = 5000L;
        ApiResponse<UserCommissionRateResponse> response =
                getApi().userCommissionRate(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
