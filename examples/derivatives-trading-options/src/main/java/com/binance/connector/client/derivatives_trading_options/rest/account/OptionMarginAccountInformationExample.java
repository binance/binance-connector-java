package com.binance.connector.client.derivatives_trading_options.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.OptionMarginAccountInformationResponse;

/** API examples for AccountApi */
public class OptionMarginAccountInformationExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Option Margin Account Information (USER_DATA)
     *
     * <p>Get current account information. Weight: 3
     *
     * @throws ApiException if the Api call fails
     */
    public void optionMarginAccountInformationExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<OptionMarginAccountInformationResponse> response =
                getApi().optionMarginAccountInformation(recvWindow);
        System.out.println(response.getData());
    }
}
