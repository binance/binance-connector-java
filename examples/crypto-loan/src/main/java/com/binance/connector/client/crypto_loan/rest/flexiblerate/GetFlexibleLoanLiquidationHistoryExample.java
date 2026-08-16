package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanLiquidationHistoryResponse;
import java.io.IOException;

/** API examples for FlexibleRateApi */
public class GetFlexibleLoanLiquidationHistoryExample {
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
     * Get Flexible Loan Liquidation History (USER_DATA)
     *
     * <p>Get Flexible Loan Liquidation History Weight(IP): 400 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getFlexibleLoanLiquidationHistoryExample() throws ApiException, IOException {
        String loanCoin = "BUSD";
        String collateralCoin = "BNB";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetFlexibleLoanLiquidationHistoryResponse> response =
                getApi().getFlexibleLoanLiquidationHistory(
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
