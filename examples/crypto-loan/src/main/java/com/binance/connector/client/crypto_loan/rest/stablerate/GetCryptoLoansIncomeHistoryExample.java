package com.binance.connector.client.crypto_loan.rest.stablerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.GetCryptoLoansIncomeHistoryResponse;
import com.binance.connector.client.crypto_loan.rest.model.OrderType;
import java.io.IOException;

/** API examples for StableRateApi */
public class GetCryptoLoansIncomeHistoryExample {
    private CryptoLoanRestApi api;

    public CryptoLoanRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    CryptoLoanRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new CryptoLoanRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Crypto Loans Income History (USER_DATA)
     *
     * <p>Get Crypto Loans Income History Weight(UID): 6000 Security Type: USER_DATA Notes: - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both omitted, the most recent 7 days of
     * data are returned. - The maximum interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; is 30 days.
     *
     * @throws ApiException if the Api call fails
     */
    public void getCryptoLoansIncomeHistoryExample() throws ApiException, IOException {
        String asset = "BUSD";
        OrderType type = OrderType.borrowIn;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetCryptoLoansIncomeHistoryResponse> response =
                getApi().getCryptoLoansIncomeHistory(
                                asset, type, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
