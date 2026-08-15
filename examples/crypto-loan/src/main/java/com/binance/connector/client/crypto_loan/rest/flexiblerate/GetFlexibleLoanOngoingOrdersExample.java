package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanOngoingOrdersResponse;
import java.io.IOException;

/** API examples for FlexibleRateApi */
public class GetFlexibleLoanOngoingOrdersExample {
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
     * Get Flexible Loan Ongoing Orders (USER_DATA)
     *
     * <p>Get Flexible Loan Ongoing Orders Weight(IP): 300 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getFlexibleLoanOngoingOrdersExample() throws ApiException, IOException {
        String loanCoin = "BUSD";
        String collateralCoin = "BNB";
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetFlexibleLoanOngoingOrdersResponse> response =
                getApi().getFlexibleLoanOngoingOrders(
                                loanCoin, collateralCoin, current, limit, recvWindow);
        System.out.println(response.getData());
    }
}
