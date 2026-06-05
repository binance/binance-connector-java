package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.GetFlexibleLoanCollateralAssetsDataResponse;

/** API examples for FlexibleRateApi */
public class GetFlexibleLoanCollateralAssetsDataExample {
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
     * Get Flexible Loan Collateral Assets Data(USER_DATA)
     *
     * <p>Get LTV information and collateral limit of flexible loan&#39;s collateral assets. The
     * collateral limit is shown in USD value. Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getFlexibleLoanCollateralAssetsDataExample() throws ApiException {
        String collateralCoin = "";
        Long recvWindow = 5000L;
        ApiResponse<GetFlexibleLoanCollateralAssetsDataResponse> response =
                getApi().getFlexibleLoanCollateralAssetsData(collateralCoin, recvWindow);
        System.out.println(response.getData());
    }
}
