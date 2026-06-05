package com.binance.connector.client.crypto_loan.rest.stablerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.GetLoanBorrowHistoryResponse;

/** API examples for StableRateApi */
public class GetLoanBorrowHistoryExample {
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
     * Get Loan Borrow History(USER_DATA)
     *
     * <p>Get Loan Borrow History * If startTime and endTime are not sent, the recent 90-day data
     * will be returned. * The max interval between startTime and endTime is 180 days. Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getLoanBorrowHistoryExample() throws ApiException {
        Long orderId = 1L;
        String loanCoin = "";
        String collateralCoin = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetLoanBorrowHistoryResponse> response =
                getApi().getLoanBorrowHistory(
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
