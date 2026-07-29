package com.binance.connector.client.crypto_loan.rest.stablerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanLtvAdjustmentHistoryResponse;
import java.io.IOException;

/** API examples for StableRateApi */
public class GetLoanLtvAdjustmentHistoryExample {
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
     * Get Loan LTV Adjustment History (USER_DATA)
     *
     * <p>Get Loan LTV Adjustment History Weight(IP): 400 Security Type: USER_DATA Notes: - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90-day data is
     * returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180
     * days.
     *
     * @throws ApiException if the Api call fails
     */
    public void getLoanLtvAdjustmentHistoryExample() throws ApiException, IOException {
        Long orderId = 1L;
        String loanCoin = "BUSD";
        String collateralCoin = "BNB";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetLoanLtvAdjustmentHistoryResponse> response =
                getApi().getLoanLtvAdjustmentHistory(
                                orderId,
                                loanCoin,
                                collateralCoin,
                                startTime,
                                endTime,
                                current,
                                limit,
                                recvWindow);
        System.out.println(response.getData());
    }
}
