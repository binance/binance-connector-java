package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.AccountInformationResponse;

/** API examples for AccountApi */
public class AccountInformationExample {
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
     * Account Information (USER_DATA)
     *
     * <p>Get current account information. * for One-way Mode user, the \&quot;positions\&quot; will
     * only show the \&quot;BOTH\&quot; positions * for Hedge Mode user, the \&quot;positions\&quot;
     * will show \&quot;BOTH\&quot;, \&quot;LONG\&quot;, and \&quot;SHORT\&quot; positions. Weight:
     * 5
     *
     * @throws ApiException if the Api call fails
     */
    public void accountInformationExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<AccountInformationResponse> response = getApi().accountInformation(recvWindow);
        System.out.println(response.getData());
    }
}
