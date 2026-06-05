package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.CheckCollateralRepayRateResponse;

/** API examples for FlexibleRateApi */
public class CheckCollateralRepayRateExample {
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
     * Check Collateral Repay Rate (USER_DATA)
     *
     * <p>Weight: 6000
     *
     * @throws ApiException if the Api call fails
     */
    public void checkCollateralRepayRateExample() throws ApiException {
        String loanCoin = "";
        String collateralCoin = "";
        Long recvWindow = 5000L;
        ApiResponse<CheckCollateralRepayRateResponse> response =
                getApi().checkCollateralRepayRate(loanCoin, collateralCoin, recvWindow);
        System.out.println(response.getData());
    }
}
