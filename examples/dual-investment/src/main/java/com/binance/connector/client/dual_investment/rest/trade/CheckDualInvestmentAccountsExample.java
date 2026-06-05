package com.binance.connector.client.dual_investment.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.dual_investment.rest.DualInvestmentRestApiUtil;
import com.binance.connector.client.dual_investment.rest.api.DualInvestmentRestApi;
import com.binance.connector.client.dual_investment.rest.model.CheckDualInvestmentAccountsResponse;

/** API examples for TradeApi */
public class CheckDualInvestmentAccountsExample {
    private DualInvestmentRestApi api;

    public DualInvestmentRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DualInvestmentRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DualInvestmentRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Check Dual Investment accounts(USER_DATA)
     *
     * <p>Check Dual Investment accounts Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void checkDualInvestmentAccountsExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<CheckDualInvestmentAccountsResponse> response =
                getApi().checkDualInvestmentAccounts(recvWindow);
        System.out.println(response.getData());
    }
}
