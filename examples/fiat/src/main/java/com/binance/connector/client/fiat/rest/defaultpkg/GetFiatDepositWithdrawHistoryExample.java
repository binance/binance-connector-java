package com.binance.connector.client.fiat.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.api.FiatRestApi;
import com.binance.connector.client.fiat.rest.model.GetFiatDepositWithdrawHistoryResponse;
import java.io.IOException;

/** API examples for DefaultApi */
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
     * <p>Get Fiat Deposit/Withdraw History Weight(UID): 45000 Security Type: USER_DATA Notes: - If
     * &#x60;beginTime&#x60; and &#x60;endTime&#x60; are not sent, recent 30-day data is returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void getFiatDepositWithdrawHistoryExample() throws ApiException, IOException {
        String transactionType = "0";
        Long beginTime = 1641782889000L;
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
