package com.binance.connector.client.derivatives_trading_options.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.AccountFundingFlowResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.Currency;
import java.io.IOException;

/** API examples for AccountApi */
public class AccountFundingFlowExample {
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
     * Account Funding Flow (USER_DATA)
     *
     * <p>Query account funding flows. Weight(IP): 1 Security Type: USER_DATA Notes: - Only support
     * querying data in the past 3 months
     *
     * @throws ApiException if the Api call fails
     */
    public void accountFundingFlowExample() throws ApiException, IOException {
        Currency currency = Currency.USDT;
        Long recordId = 100000L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 20L;
        Long recvWindow = 5000L;
        ApiResponse<AccountFundingFlowResponse> response =
                getApi().accountFundingFlow(
                                currency, recordId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
