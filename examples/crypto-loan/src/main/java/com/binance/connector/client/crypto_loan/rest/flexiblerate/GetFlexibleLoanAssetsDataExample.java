package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanAssetsDataResponse;

/** API examples for FlexibleRateApi */
public class GetFlexibleLoanAssetsDataExample {
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
     * Get Flexible Loan Assets Data(USER_DATA)
     *
     * <p>Get interest rate and borrow limit of flexible loanable assets. The borrow limit is shown
     * in USD value. Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getFlexibleLoanAssetsDataExample() throws ApiException {
        String loanCoin = "";
        Long recvWindow = 5000L;
        ApiResponse<GetFlexibleLoanAssetsDataResponse> response =
                getApi().getFlexibleLoanAssetsData(loanCoin, recvWindow);
        System.out.println(response.getData());
    }
}
