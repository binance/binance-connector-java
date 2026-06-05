package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanRepayRequest;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanRepayResponse;

/** API examples for FlexibleRateApi */
public class FlexibleLoanRepayExample {
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
     * Flexible Loan Repay(TRADE)
     *
     * <p>Flexible Loan Repay * repayAmount is mandatory even fullRepayment &#x3D; FALSE Weight:
     * 6000
     *
     * @throws ApiException if the Api call fails
     */
    public void flexibleLoanRepayExample() throws ApiException {
        FlexibleLoanRepayRequest flexibleLoanRepayRequest = new FlexibleLoanRepayRequest();
        flexibleLoanRepayRequest.loanCoin("");
        flexibleLoanRepayRequest.collateralCoin("");
        flexibleLoanRepayRequest.repayAmount(1.0d);
        ApiResponse<FlexibleLoanRepayResponse> response =
                getApi().flexibleLoanRepay(flexibleLoanRepayRequest);
        System.out.println(response.getData());
    }
}
