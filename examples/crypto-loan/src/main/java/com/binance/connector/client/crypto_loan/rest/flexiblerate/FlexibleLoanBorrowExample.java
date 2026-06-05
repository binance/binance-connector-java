package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanBorrowRequest;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanBorrowResponse;

/** API examples for FlexibleRateApi */
public class FlexibleLoanBorrowExample {
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
     * Flexible Loan Borrow(TRADE)
     *
     * <p>Borrow Flexible Loan * Only available for master account * You can customize LTV by
     * entering loanAmount and collateralAmount. Weight: 6000
     *
     * @throws ApiException if the Api call fails
     */
    public void flexibleLoanBorrowExample() throws ApiException {
        FlexibleLoanBorrowRequest flexibleLoanBorrowRequest = new FlexibleLoanBorrowRequest();
        flexibleLoanBorrowRequest.loanCoin("");
        flexibleLoanBorrowRequest.collateralCoin("");
        ApiResponse<FlexibleLoanBorrowResponse> response =
                getApi().flexibleLoanBorrow(flexibleLoanBorrowRequest);
        System.out.println(response.getData());
    }
}
