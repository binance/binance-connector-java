package com.binance.connector.client.fiat.rest.fiat;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.api.FiatRestApi;
import com.binance.connector.client.fiat.rest.model.GetFiatDepositWithdrawHistoryResponse;

/** API examples for FiatApi */
public class GetFiatDepositWithdrawHistoryExample {
    private FiatRestApi api;

    public FiatRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = FiatRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new FiatRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Fiat Deposit/Withdraw History (USER_DATA)
     *
     * <p>Get Fiat Deposit/Withdraw History * If beginTime and endTime are not sent, the recent
     * 30-day data will be returned. Weight: 45000
     *
     * @throws ApiException if the Api call fails
     */
    public void getFiatDepositWithdrawHistoryExample() throws ApiException {
        String transactionType = "";
        Long beginTime = 0L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long rows = 100L;
        Long recvWindow = 5000L;
        ApiResponse<GetFiatDepositWithdrawHistoryResponse> response =
                getApi().getFiatDepositWithdrawHistory(
                                transactionType, beginTime, endTime, page, rows, recvWindow);
        System.out.println(response.getData());
    }
}
