package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanRepayRequest;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanRepayResponse;
import java.io.IOException;

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
     * Flexible Loan Repay (TRADE)
     *
     * <p>Flexible Loan Repay Weight(IP): 6000 Security Type: TRADE Notes: - &#x60;repayAmount&#x60;
     * is mandatory even when &#x60;fullRepayment &#x3D; FALSE&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void flexibleLoanRepayExample() throws ApiException, IOException {
        FlexibleLoanRepayRequest flexibleLoanRepayRequest = new FlexibleLoanRepayRequest();
        flexibleLoanRepayRequest.loanCoin("BUSD");
        flexibleLoanRepayRequest.collateralCoin("BNB");
        flexibleLoanRepayRequest.repayAmount(1d);
        ApiResponse<FlexibleLoanRepayResponse> response =
                getApi().flexibleLoanRepay(flexibleLoanRepayRequest);
        System.out.println(response.getData());
    }
}
