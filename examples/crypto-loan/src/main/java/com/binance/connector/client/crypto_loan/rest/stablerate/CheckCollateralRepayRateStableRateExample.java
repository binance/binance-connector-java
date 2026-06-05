package com.binance.connector.client.crypto_loan.rest.stablerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.CheckCollateralRepayRateStableRateResponse;

/** API examples for StableRateApi */
public class CheckCollateralRepayRateStableRateExample {
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
     * Check Collateral Repay Rate(USER_DATA)
     *
     * <p>Get the the rate of collateral coin / loan coin when using collateral repay, the rate will
     * be valid within 8 second. Weight: 6000
     *
     * @throws ApiException if the Api call fails
     */
    public void checkCollateralRepayRateStableRateExample() throws ApiException {
        String loanCoin = "";
        String collateralCoin = "";
        Double repayAmount = 1.0d;
        Long recvWindow = 5000L;
        ApiResponse<CheckCollateralRepayRateStableRateResponse> response =
                getApi().checkCollateralRepayRateStableRate(
                                loanCoin, collateralCoin, repayAmount, recvWindow);
        System.out.println(response.getData());
    }
}
